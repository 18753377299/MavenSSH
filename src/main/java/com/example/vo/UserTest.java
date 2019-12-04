package com.example.vo;


import javax.persistence.*;
/**
* @author  作者 E-mail: 
* @date 创建时间：2019年12月3日 上午11:29:52
* @version 1.0 
* @parameter 
* @since  
* @return  */
// 标注该类为持久化类,JPA扫描到类上的注解,会将当前类作为持久化类
@Entity
//指定表名，指定唯一约束
@Table(name = "user_test",uniqueConstraints = {@UniqueConstraint(columnNames = {"id","name"})})
public class UserTest {
	/*下面的注解可以贴在字段或者是get方法上,
	如果选定了一个位置,那么所有的属性相关的注解都应该贴在这个位置,意思是说,不能一部分在字段上,一部分在get方法上*/
    @Id//指定主键
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
 
    //一对一映射
//    @OneToOne(optional = true, cascade = CascadeType.ALL)
//    @JoinColumn(name = "articleId", unique = true)
//    public Article article;
 
    //省略了getter和setter
    
    
}