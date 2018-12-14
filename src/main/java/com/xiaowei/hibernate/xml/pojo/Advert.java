package com.xiaowei.hibernate.xml.pojo;

/**
 * @ClassName Advert
 * @Desciption TODO
 * @Author weizheng
 * @Date 2018/12/14 18:27
 **/
public class Advert {

    private Long id;

    private String title;

    private String message;

    private User user;

    @Override
    public String toString() {
        return "Advert{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", user=" + user +
                '}';
    }

    public Advert() {
    }

    public Advert(String title, String message, User user) {
        this.title = title;
        this.message = message;
        this.user = user;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {

        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public User getUser() {
        return user;
    }
}
