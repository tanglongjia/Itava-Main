package org.itava.pojo;


public class SNews extends BsBaseBean{
    private Integer id;

    private String newstitle;

    private String newscategory;

    private Integer readcount;

    private String newscontent;
    
    private String newsurl;
    
    private String createrName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle == null ? null : newstitle.trim();
    }

    public String getNewscategory() {
        return newscategory;
    }

    public void setNewscategory(String newscategory) {
        this.newscategory = newscategory == null ? null : newscategory.trim();
    }

    public Integer getReadcount() {
        return readcount;
    }

    public void setReadcount(Integer readcount) {
        this.readcount = readcount;
    }

    public String getNewscontent() {
        return newscontent;
    }

    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent == null ? null : newscontent.trim();
    }


	public String getCreaterName() {
		return createrName;
	}

	public void setCreaterName(String createrName) {
		this.createrName = createrName;
	}

	public String getNewsurl() {
		return newsurl;
	}

	public void setNewsurl(String newsurl) {
		this.newsurl = newsurl;
	}
}