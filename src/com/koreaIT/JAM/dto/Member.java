package com.koreaIT.JAM.dto;

import java.time.LocalDateTime;
import java.util.Map;

public class Member {
	private int id;
	private LocalDateTime regDate;
	private LocalDateTime updateDate;
	private String loginId;
	private String loginPw;
	private String name;
	
	public Member(Map<String, Object> MemberMap) {
		this.id = (int) MemberMap.get("id");
		this.regDate = (LocalDateTime) MemberMap.get("regDate");
		this.updateDate = (LocalDateTime) MemberMap.get("updateDate");
		this.loginId = (String) MemberMap.get("loginId");
		this.loginPw = (String) MemberMap.get("loginPw");
		this.name = (String) MemberMap.get("name");
	}
}
