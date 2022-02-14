package com.victolee.board.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*; // ※

@NoArgsConstructor(access = AccessLevel.PROTECTED) //생성자의 접근 권한 설정
@Getter
@Entity // ※
@Table(name = "board") // 엔티티 클래스와 매핑되는 테이블 정보
public class BoardEntity extends TimeEntity {

    @Id // 테이블의 기본키를 명시
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;


    @Column(length = 10, nullable = false) // ※
    private String writer;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @Builder
    public BoardEntity(Long id, String title, String content, String writer) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.content = content;
    }
}