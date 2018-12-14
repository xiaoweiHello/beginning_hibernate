package com.xiaowei.hibernate.xml.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Category
 * @Desciption TODO
 * @Author weizheng
 * @Date 2018/12/14 18:27
 **/
public class Category {

    private Long id;

    private String title;

    private Set adverts = new HashSet();

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", adverts=" + adverts +
                '}';
    }

    public Category() {
    }

    public Category(String title, Set adverts) {

        this.title = title;
        this.adverts = adverts;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAdverts(Set adverts) {
        this.adverts = adverts;
    }

    public Long getId() {

        return id;
    }

    public String getTitle() {
        return title;
    }

    public Set getAdverts() {
        return adverts;
    }
}
