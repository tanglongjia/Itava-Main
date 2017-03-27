package org.itava.pojo;


public class BsFunction extends BsBaseBean{
    private Integer id;

    private String funname;

    private String funcode;

    private String fundesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFunname() {
        return funname;
    }

    public void setFunname(String funname) {
        this.funname = funname == null ? null : funname.trim();
    }

    public String getFuncode() {
        return funcode;
    }

    public void setFuncode(String funcode) {
        this.funcode = funcode == null ? null : funcode.trim();
    }

    public String getFundesc() {
        return fundesc;
    }

    public void setFundesc(String fundesc) {
        this.fundesc = fundesc == null ? null : fundesc.trim();
    }

}