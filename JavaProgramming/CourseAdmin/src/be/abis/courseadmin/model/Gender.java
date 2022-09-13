package be.abis.courseadmin.model;

public enum Gender {


    MALE("he","him","his","M") ,
    FEMALE("she","her","her","F"),
    OTHER("they","them","their","O");

    private String description;
    private  String vnw;
    private  String lv;
    private  String pos;
    private  String abbr;

    Gender(String description, String lv, String pos, String abbr){
        this.abbr=abbr;
        this.pos =pos;
        this.lv=lv;
        this.vnw=description;


    }

    public String getVnw() {
        return vnw;
    }

    public String getLv() {
        return lv;
    }

    public String getPos() {
        return pos;
    }

    public String getAbbr() {
        return abbr;
    }
}
