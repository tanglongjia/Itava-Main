package org.itava.pojo;


public class BsDepartment extends BsBaseBean {
    private Integer id;

    private String departname;

    private String departcode;

    private Integer departlevel;

    private Integer isleafnode;

    

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

}