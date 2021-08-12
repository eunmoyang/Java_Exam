package kr.co.job.jdbc;

import java.util.List;

public interface Test01Dao {
	
	// 전체 조회
	List<Test01VO> listAll();
	// 선택 조회
	Test01VO selectOne(int tno);
	// 추가
	int insert(Test01VO tvo);
	// 수정
	int update(Test01VO tvo);
	// 삭제
	int delete(int tno);
	// 데이터베이스 닫기
	void close();
	
}
