package com.projectl.vo;

public class Exhibition {

    private String nameM, nameW, nameP;
    private int P; //
    private String ex_no;
    private String ex_name;
    private String ex_theme;
    private String ex_like;
    private String ex_img;
    private String ms_no;
    private String ex_location;
    private String ex_rating;
    private String ex_pay;
    private String ex_exp;
    private String ex_period;
    private String ex_ing;

    public Exhibition(String ex_no, String ex_name, String ex_theme,
			String ex_like, String ex_img, String ms_no,
			String ex_location, String ex_rating,String ex_pay, String ex_exp, String ex_period, String ex_ing) {
		super();
		this.ex_no = ex_no;
		this.ex_name = ex_name;
		this.ex_theme = ex_theme;
		this.ex_like = ex_like;
		this.ex_img = ex_ing;
		this.ms_no = ms_no;
		this.ex_location = ex_location;
		this.ex_rating = ex_rating;
		this.ex_pay = ex_pay;
		this.ex_exp = ex_exp;
		this.ex_period = ex_period;
		this.ex_ing = ex_ing;
	}
	public Exhibition(String ex_no, String ex_name, String ms_no){
		super();
		this.ex_no = ex_no;
		this.ex_name = ex_name;
		this.ms_no = ms_no;
	}
	public Exhibition(String ex_no){
		super();
		this.ex_no = ex_no;
	}
    public Exhibition() {
    }

    @Override
    public String toString() {
        return "ExhiData [" +
                "ex_no='" + ex_no + '\'' +
                ", ex_name='" + ex_name + '\'' +
                ", ex_theme='" + ex_theme + '\'' +
                ", ex_like='" + ex_like + '\'' +
                ", ex_img='" + ex_img + '\'' +
                ", ms_no='" + ms_no + '\'' +
                ", ex_location='" + ex_location + '\'' +
                ", ex_rating='" + ex_rating + '\'' +
                ", ex_pay='" + ex_pay + '\'' +
                ", ex_exp='" + ex_exp + '\'' +
                ", ex_period='" + ex_period + '\'' +
                ", ex_ing='" + ex_ing + '\'' +
                ']';
    }

    public String getEx_no() {
        return ex_no;
    }

    public void setEx_no(String exhi_no) {
        this.ex_no = exhi_no;
    }

    public String getMs_no() {
        return ms_no;
    }

    public void setMs_no(String ms_no) {
        this.ms_no = ms_no;
    }

    public String getEx_theme() {
        return ex_theme;
    }

    public void setEx_theme(String ex_theme) {
        this.ex_theme = ex_theme;
    }

    public String getEx_like() {
        return ex_like;
    }

    public void setEx_like(String ex_like) {
        this.ex_like = ex_like;
    }

    public String getEx_img() {
        return ex_img;
    }

    public void setEx_img(String ex_img) {
        this.ex_img = ex_img;
    }

    public String getEx_location() {
        return ex_location;
    }

    public void setEx_location(String ex_location) {
        this.ex_location = ex_location;
    }

    public String getEx_rating() {
        return ex_rating;
    }

    public void setEx_rating(String ex_rating) {
        this.ex_rating = ex_rating;
    }

    public String getEx_pay() {
        return ex_pay;
    }

    public void setEx_pay(String ex_pay) {
        this.ex_pay = ex_pay;
    }

    public String getEx_exp() {
        return ex_exp;
    }

    public void setEx_exp(String ex_exp) {
        this.ex_exp = ex_exp;
    }

    public String getEx_period() {
        return ex_period;
    }

    public void setEx_period(String ex_period) {
        this.ex_period = ex_period;
    }

    public String getEx_ing() {
        return ex_ing;
    }

    public void setEx_ing(String ex_ing) {
        this.ex_ing = ex_ing;
    }

    public String getEx_name() {
        return ex_name;
    }

    public void setEx_name(String ex_name) {
        this.ex_name = ex_name;
    }

    public String getNameM() {
        return this.nameM;
    }
    public String getNameW() {
        return this.nameW;
    }
    public String getNameP() {
        return this.nameP;
    }
    public int getImage() {
        return this.P;
    }
}