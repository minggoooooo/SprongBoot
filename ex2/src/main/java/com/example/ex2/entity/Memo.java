package com.example.ex2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity //엔티티 클래스는 Spring Data JPA에서 반드시 이 어노테이션을 추가해야만 함 
        // 해당 클래스가 엔티티를 위한 클래스며 해당 클래스의 인스턴스들이 JPA로 관리되는 엔티티 객체라는 것을 의미함
        //자동으로 테이블을 생성 할 수도 멤버 변수에 따라서 칼럼들도 생성됨.
@Table(name = "tb1_memo")   //엔티티 어노테이션과 같이 쓰이며 테이블 이름 OR 인덱스를 생성 할 수도 있음
@ToString
@Getter     // 롬복의 getter을 이용해 메서드 생성
@Builder    // 롬복의 빌더를 이용해서 객체를 생성할 수 있게끔 처리 아래 두개가 없으면 컴파일 에러가 발생함.
@AllArgsConstructor
@NoArgsConstructor
public class Memo {

    @Id     // 엔티티 어노테이션은 PK에 해당하는 특정 필드를 ID로 지정해야만 함.
    // 제네레이션 타입엔 크게 AUTO(디폴트 값으로 JPA에서 생성방식 결정) SEQUENCE를 이용해 키를 생성 SequenceGenerator와 같이 사용
    // TABLE(키 생성 전용 테이블을 생성해서 키 생성)- TableGenerator와 사용
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동으로 생성되는 번호 AUTO_INCREMENT같은거
    private Long mno;
    
    // 컬럼이 필요한 경우 어노테이션을 사용하여 만듬 주로  nullable, name, length ,columnDefinition을 이용해 기본값 설정도 가능
    @Column(length = 200, nullable = false)
    private String memoText;
}
