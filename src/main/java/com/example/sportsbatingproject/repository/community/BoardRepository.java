package com.example.sportsbatingproject.repository.community;


import com.example.sportsbatingproject.repository.community.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {

}