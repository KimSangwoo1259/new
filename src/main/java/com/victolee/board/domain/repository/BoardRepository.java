/*
repository
    ※ 데이터를 가져오거나 조작하는 함수를 정의
    ※ Interface를 implements하여 미리 만들어진 함수를 사용할 수 있으며, 또한 직접 구현이 가능
 */

package com.victolee.board.domain.repository;

import com.victolee.board.domain.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
    List<BoardEntity> findByTitleContaining(String keyword);
}
