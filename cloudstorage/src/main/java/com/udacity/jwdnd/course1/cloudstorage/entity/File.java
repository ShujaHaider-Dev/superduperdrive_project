package com.udacity.jwdnd.course1.cloudstorage.entity;

import org.springframework.web.multipart.MultipartFile;

public class File {
    private String fileId;
    private String filename;
    private String contenttype;
    private String filesize;
    private Integer userid;
    private MultipartFile filedata;

    public File(String fileId, String filename, String contenttype, String filesize, Integer userid, MultipartFile filedata) {
        this.fileId = fileId;
        this.filename = filename;
        this.contenttype = contenttype;
        this.filesize = filesize;
        this.userid = userid;
        this.filedata = filedata;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContenttype() {
        return contenttype;
    }

    public void setContenttype(String contenttype) {
        this.contenttype = contenttype;
    }

    public String getFilesize() {
        return filesize;
    }

    public void setFilesize(String filesize) {
        this.filesize = filesize;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public MultipartFile getFiledata() {
        return filedata;
    }

    public void setFiledata(MultipartFile filedata) {
        this.filedata = filedata;
    }
}
