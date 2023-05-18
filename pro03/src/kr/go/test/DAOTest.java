package kr.go.test;


import java.util.ArrayList;

import org.junit.Test;

public class DAOTest {
	
	SampleDAO dao;
	
	@Test
	public void getList() {
		System.out.println("목록 데이터");
		ArrayList<Sample1> samList = new ArrayList<Sample1>();
		samList = dao.getSampleList();
		for(Sample1 sam:samList){
			System.out.println("아이디 : "+sam.getItem1());
			System.out.println("포인트 : "+sam.getItem2());
			System.out.println("가입일 : "+sam.getItem3());
			System.out.println();
		}
	}
	
	@Test
	public void getRecord() {
		System.out.println("\n레코드 검색");
		Sample1 sam = new Sample1();
		sam = dao.getSample("leejaeho");
		if(sam!=null){
			System.out.println("아이디 : "+sam.getItem1());
			System.out.println("포인트 : "+sam.getItem2());
			System.out.println("가입일 : "+sam.getItem3());
			System.out.println();
		}
	}
	
	@Test
	public void addTest() {
		System.out.println("\n레코드 추가");
		Sample1 sam = new Sample1();
		sam.setItem1("hehehe");
		sam.setItem2(90);
		int cnt = dao.addSample(sam);
		if(cnt>0){
			System.out.println("레코드 추가 성공");
		}
	}

	@Test
	public void updateTest() {
		System.out.println("\n레코드 변경");
		Sample1 sam = new Sample1();
		sam.setItem1("leejaeho");
		sam.setItem2(200);
		int cnt = dao.updateSample(sam);
		if(cnt>0){
			System.out.println("레코드 수정 성공");
		}
	}
	
	@Test
	public void deleteTest() {
		System.out.println("레코드 삭제");
		int cnt = dao.deleteSample("hahaha");
		if(cnt>0){
			System.out.println("레코드 삭제 성공");
		}
	}
}
