package org.itava.pojo;

import java.util.Date;

public class BsDepartment {
    private Integer id;

    private String departname;

    private String departcode;

    private Integer departlevel;

    private Integer isleafnode;

    private Date created;

    private Integer createdby;

    private Date updated;

    private Integer updatedby;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname == null ? null : departname.trim();
    }

    public String getDepartcode() {
        return departcode;
    }

    public void setDepartcode(String departcode) {
        this.departcode = departcode == null ? null : departcode.trim();
    }

    public Integer getDepartlevel() {
        return departlevel;
    }

    public void setDepartlevel(Integer departlevel) {
        this.departlevel = departlevel;
    }

    public Integer getIsleafnode() {
        return isleafnode;
    }

    public void setIsleafnode(Integer isleafnode) {
        this.isleafnode = isleafnode;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Integer createdby) {
        this.createdby = createdby;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Integer getUpdatedby() {
        return updatedby;
    }

    public void setUpdatedby(Integer updatedby) {
        this.updatedby = updatedby;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}