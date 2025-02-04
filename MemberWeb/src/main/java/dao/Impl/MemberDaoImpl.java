package dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.MemberDao;
import modle.Member;
import util.DbConnection;

public class MemberDaoImpl implements MemberDao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	Connection connection=DbConnection.getConect();

	@Override
	public void addMember(Member member) {
		String sql="insert into member(name,username,password,address,phone,mobile) "
				+ "values(?,?,?,?,?,?)";
		try {
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			preparedstatement.setString(1, member.getName());
			preparedstatement.setString(2, member.getUsername());
			preparedstatement.setString(3, member.getPassword());
			preparedstatement.setString(4, member.getAddress());
			preparedstatement.setString(5, member.getPhone());
			preparedstatement.setString(6, member.getMobile());
			preparedstatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Member selectMember(String username, String password) {
		String sql="select * from member where username=? and password=?";
		Member member=null;
		try {
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			preparedstatement.setString(1, username);
			preparedstatement.setString(2, password);
			ResultSet resultset=preparedstatement.executeQuery();
			
			if(resultset.next())
			{
				member=new Member();
				member.setId(resultset.getInt("id"));
				member.setName(resultset.getString("name"));
				member.setUsername(resultset.getString("username"));
				member.setPassword(resultset.getString("password"));
				member.setAddress(resultset.getString("address"));
				member.setPhone(resultset.getString("phone"));
				member.setMobile(resultset.getString("mobile"));
				System.out.println("GG");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return member;
		
	}

	@Override
	public boolean findByMemberUsername(String username) {
		String sql="select * from member where username=?";
		boolean usernameUsed=false;
		try {
			PreparedStatement preparedstatement=connection.prepareStatement(sql);
			preparedstatement.setString(1, username);
			ResultSet resultset=preparedstatement.executeQuery();
			
			if(resultset.next())
			{
				usernameUsed= true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return usernameUsed;
	}

}
