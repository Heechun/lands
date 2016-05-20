package com.pknu.member.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.pknu.member.dao.MemberDao;
import com.pknu.member.dto.MemberDto;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberDao memberDao;

	@Override
	public void joinMember(MemberDto memberDto) {
		ModelAndView mav = new ModelAndView();
		// TODO Auto-generated method stub
		
		memberDao.joinMember(memberDto);
		
		
	}

	@Override
	public void joinCheckId(String inputId, HttpServletResponse resp) {
		HashMap<String, String> hm = new HashMap<>();
		
		String DBId = memberDao.selectId(inputId);
		
		if(DBId != null || inputId==""){
			hm.put("idUseStatus", "2");
			
		}else{
			hm.put("idUseStatus", "1");
		}
		
		JSONObject jb = new JSONObject(hm);
		
		PrintWriter pw;
		try {
			pw = resp.getWriter();
			pw.println(jb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
