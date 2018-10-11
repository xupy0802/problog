package cn.jbolt.common.model;

import java.util.List;

import cn.jbolt.common.model.Noluser;

import cn.jbolt.common.model.base.BaseNoluser;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class Noluser extends BaseNoluser<Noluser> {
	public  static final Noluser dao = new Noluser().dao();
	 /*查找用户，用于登录*/
    public List<Noluser> findByNameAndPwd(String nolname, String psw){  
        return find("select * from noluser where nolname='"+nolname+"' and psw='"+psw+"'");
    }
    public List<Noluser> findByPhoneAndPwd(String phonenum, String psw){  
        return find("select * from noluser where phonenum='"+phonenum+"' and psw='"+psw+"'");
    }
    public List<Noluser> findByEmailAndPwd(String email, String psw){  
        return find("select * from noluser where email='"+email+"' and psw='"+psw+"'");
    }
    
    
    /*查找用户名，邮箱，手机号*/
    public List<Noluser> findByUsername(String nolname){  
        return find("select * from noluser where nolname='"+nolname+"'");
    }  
    public List<Noluser> findByPhonenum(String phonenum){  
        return find("select * from noluser where phonenum='"+phonenum+"'");
        }
    public List<Noluser> findByEmail(String email){  
        return find("select * from noluser where email='"+email+"'");
    }  

    
    
    /*实现保存数据到数据库的功能*/
    public void saveLogin(String nickname,String psw,String birthday,String sex,String phonenum,String email,String nolname) {
		new Noluser().set("nickname", nickname).set("psw", psw).set("birthday", birthday).set("sex", sex).set("phonenum", phonenum).set("email", email).set("nolname", nolname).save();
	}
}
