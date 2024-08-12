package com.example.ex2.repository;

import com.example.ex2.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

//엔티티의 타입 정보 (여기선 메모라는 클래스 타입)과 id의 타입을 지정하면 자동으로 스프링의 빈으로 등록이 됨.
public interface MemoRepository extends JpaRepository<Memo, Long> {
}
