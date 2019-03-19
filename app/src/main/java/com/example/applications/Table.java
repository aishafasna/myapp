package com.example.applications;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Table {
    @SerializedName("pid")
    @Expose
    private Integer pid;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("phoneno")
    @Expose
    private String phoneno;
    @SerializedName("emailid")
    @Expose
    private String emailid;
    @SerializedName("college")
    @Expose
    private String college;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("course")
    @Expose
    private String course;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("reg_date")
    @Expose
    private String regDate;
    @SerializedName("comment")
    @Expose
    private String comment;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}

