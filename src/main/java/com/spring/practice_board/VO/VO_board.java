package com.spring.practice_board.VO;

import lombok.Data;


@Data
public class VO_board {

    private String POSTNUMBER;
    private String TITLE;
    private String AUTHOR;
    private String CREATIONDATE;

/*    public VO_board(String POSTNUMBER, String TITLE, String AUTHOR, String CREATIONDATE) {
        this.POSTNUMBER = POSTNUMBER;
        this.TITLE = TITLE;
        this.AUTHOR = AUTHOR;
        this.CREATIONDATE = CREATIONDATE;
    }

    public String getPOSTNUMBER() {
        return POSTNUMBER;
    }

    public void setPOSTNUMBER(String POSTNUMBER) {
        this.POSTNUMBER = POSTNUMBER;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public String getAUTHOR() {
        return AUTHOR;
    }

    public void setAUTHOR(String AUTHOR) {
        this.AUTHOR = AUTHOR;
    }

    public String getCREATIONDATE() {
        return CREATIONDATE;
    }

    public void setCREATIONDATE(String CREATIONDATE) {
        this.CREATIONDATE = CREATIONDATE;
    }*/
}
