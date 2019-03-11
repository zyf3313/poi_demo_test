package com.jk.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
    private Integer userid;

    private String name;

    private String pwd;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date userdate;

    private String loginname;

    private String email;

    private String phone;

    private Integer sex;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public Date getUserdate() {
        return userdate;
    }

    public void setUserdate(Date userdate) {
        this.userdate = userdate;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

	/* (non-Javadoc)    
	 * @see java.lang.Object#toString()    
	 */
	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", pwd=" + pwd + ", userdate=" + userdate + ", loginname="
				+ loginname + ", email=" + email + ", phone=" + phone + ", sex=" + sex + "]";
	}
    
    
}