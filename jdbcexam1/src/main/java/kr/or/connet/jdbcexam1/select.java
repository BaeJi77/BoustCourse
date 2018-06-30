package kr.or.connet.jdbcexam1;

import java.util.List;

import kr.or.connet.jdbcexam1.dao.roleDao;
import kr.or.connet.jdbcexam1.dto.role;

public class select {
	public static void main(String[] args) {
		roleDao dao = new roleDao();
		List<role> list = dao.getRoles();
		System.out.println(list);
	}
}
