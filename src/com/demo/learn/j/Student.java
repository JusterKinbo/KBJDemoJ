package com.demo.learn.j;

import java.io.Serializable;
/**
 * @author jiachunhui
 *
 */
public class Student implements Serializable {
    /**
     * @Comment 
     * @Author Ron
     * @Date 2018年4月9日 上午11:41:41
     */
    private static final long serialVersionUID = 1L;
    
    public Student(String no,String name,String className,DeskTop deskTop) {
        this.no = no;
        this.name = name;
        this.className = className;
        this.setDeskTop(deskTop);
        count ++;
    }
    private DeskTop deskTop;
    
     private static int count = 0;
     private final int countx = 10;

     public Student()
     {
    	 count ++;
     }
    public Student(String no,String name,String className) {
        this.no = no;
        this.name = name;
        this.className = className;
    }

    public String toString() {
        return "HashCode:"+hashCode()+" 学号:"+no+" 姓名:"+name+" 班级："+className + "count:"+count +"final:" +countx;
    }

    /**
     * 学号
     */
    private String no;

    /**
     * 名字
     */
    private String name;

    /**
     * 班级
     */
    private String className;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

	public DeskTop getDeskTop() {
		return deskTop;
	}

	public void setDeskTop(DeskTop deskTop) {
		this.deskTop = deskTop;
	}
	
	
}