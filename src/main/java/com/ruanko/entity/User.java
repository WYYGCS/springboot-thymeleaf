package com.ruanko.entity;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    //账号密码

    private Integer id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String account;
    private String password;
    private String username;
    private String salt;

    public User(String s, String s1, String s3) {

    }
    public User(){

    }

    /**
     *
     * @return
     */
    public Integer getId(){return this.id;}

    /**
     *
     * @return
     */
    public String getAccount(){return this.account;}

    public void setUsername(String username){
        this.username=username;
    }
    public String getUsername(){
        return username;
    }

    /**
     * 获得密码
     * @return
     */
    public String getPassword() {return this.password;}

    /**
     * 获得盐值
     * @return
     */
    public String getSalt(){return this.salt;}

    public void setSalt(String salt){
        this.salt=salt;
    }
    public void setAccount(String account){
        this.account=account;
    }
    public int macthAccount(String account){
        if(this.account==account) return 1;
        else return 0;
    }
    public void setPassword(String password){
        this.password=password;
    }

    /*public boolean macthPassword(String password){
        //目前md5加密无法解密，但同一串字符经过同样的md5加密后是一样的
        MD5Test md5Test=new MD5Test();
        String sxj=password+this.salt;
        System.out.println(sxj);
        String matchpass=md5Test.md5(sxj);
        System.out.println("macth:"+matchpass);
        if(matchpass.equals(this.password)){
            System.out.println("密码匹配成功");
            return true;
        }
        else {
            System.out.println("密码匹配失败");
            return false;
        }
    }*/
}
