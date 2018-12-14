package com.xiaowei.hibernate.xml.pojo;

/**
 * @ClassName Message
 * @Desciption 消息类
 * @Author weizheng
 * @Date 2018/12/14 16:49
 **/
public class Message {

    private Integer id;

    private String message;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {

        return id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {

        return message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", message='" + message + '\'' +
                '}';
    }
}
