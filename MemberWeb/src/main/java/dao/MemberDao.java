package dao;

import modle.Member;

public interface MemberDao {
	//creat
	public void addMember(Member member);
	
	//read
	public Member selectMember(String usernamne,String password);
	public boolean findByMemberUsername(String username);
	
	//update
	
	//delete
}
