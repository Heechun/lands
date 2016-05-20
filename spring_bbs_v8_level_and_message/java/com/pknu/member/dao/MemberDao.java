package com.pknu.member.dao;

import com.pknu.member.dto.MemberDto;

public interface MemberDao {
	public void joinMember(MemberDto memberDto);
	public String selectId(String inputId);
}
