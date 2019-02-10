package com.demo.learn.j;

import java.io.Serializable;

public class DeskTop implements Serializable {
    /**
     * @Comment 
     * @Author Ron
     * @Date 2018年4月9日 下午1:58:42
     */
    private static final long serialVersionUID = 1L;
    private Double height;
    private Double width;
    private Double length;

    public String toString() {
        return "height:"+height+" width:"+width+" length:"+length;
    }

    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }
    public Double getWidth() {
        return width;
    }
    public void setWidth(Double width) {
        this.width = width;
    }
    public Double getLength() {
        return length;
    }
    public void setLength(Double length) {
        this.length = length;
    }
}
