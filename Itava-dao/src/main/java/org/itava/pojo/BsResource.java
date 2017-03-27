package org.itava.pojo;

import java.util.ArrayList;
import java.util.List;

public class BsResource extends BsBaseBean {
    private Integer id;

    private String menucode;
    

    private String menuurl;

    private String menuname;
    
    private Integer menulevel;

    private Integer isleafnode;
    
    private String leafNode;
    
    private String state;

    private Integer parentid;

    private String menuimgpath;

    private String menudesc;

    private List<BsResource> children=new ArrayList<BsResource>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenucode() {
        return menucode;
    }

    public void setMenucode(String menucode) {
        this.menucode = menucode == null ? null : menucode.trim();
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl == null ? null : menuurl.trim();
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public Integer getMenulevel() {
        return menulevel;
    }

    public void setMenulevel(Integer menulevel) {
        this.menulevel = menulevel;
    }

    public Integer getIsleafnode() {
        return isleafnode;
    }

    public void setIsleafnode(Integer isleafnode) {
        this.isleafnode = isleafnode;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getMenuimgpath() {
        return menuimgpath;
    }

    public void setMenuimgpath(String menuimgpath) {
        this.menuimgpath = menuimgpath == null ? null : menuimgpath.trim();
    }

    public String getMenudesc() {
        return menudesc;
    }

    public void setMenudesc(String menudesc) {
        this.menudesc = menudesc == null ? null : menudesc.trim();
    }


	public String getLeafNode() {
		return leafNode;
	}

	public void setLeafNode(String leafNode) {
		this.leafNode = leafNode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<BsResource> getChildren() {
		return children;
	}

	public void setChildren(List<BsResource> children) {
		this.children = children;
	}
}