package com.riyun.action;  
  

import com.opensymphony.xwork2.ActionSupport;  
import com.riyun.dao.UserDao;  
  
public class LoginAction extends ActionSupport{  
      
    private static final long serialVersionUID = 1L;  
        
    private UserDao userDao;  
    private String userName;  
    private String passWord;  
      
    public UserDao getUserDao() {  
        return userDao;  
    }  
    public void setUserDao(UserDao userDao) {  
        this.userDao = userDao;  
    }  
  
    public String getUserName() {  
        return userName;  
    }  
    public String getPassWord() {  
        return passWord;  
    }  
    public void setUserName(String userName) {  
        this.userName = userName;  
    }  
    public void setPassWord(String passWord) {  
        this.passWord = passWord;  
    }  
      
      
    public String   execute() throws Exception{  
        if(userDao.login(userName, passWord)){  
            return SUCCESS;  
        }else{  
            return ERROR;  
        }  
    }  
      
}