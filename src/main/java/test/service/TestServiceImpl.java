package test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.dao.TestDAO;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	private TestDAO testDAO;

	public void showMe(String msg) {
		testDAO.showMe(msg);
	}

}
