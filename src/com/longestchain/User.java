package com.longestchain;

public class User {
    private final int ID;
    private final String NAME;
    private final String EMAIL;
    private final String FILEID;

    public User(int ID, String NAME, String EMAIL, String FILEID) {
        this.ID = ID;
        this.NAME = NAME;
        this.EMAIL = EMAIL;
        this.FILEID = FILEID;
    }

    @Override
    public String toString() {
        return "{ " + "id: " + this.ID + ", name: " + this.NAME + ", email: " + this.EMAIL + ", fileId: "+ this.FILEID + " }";
    }

    public int getID() {
        return ID;
    }

    public String getNAME() {
        return NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public String getFILEID() {
        return FILEID;
    }
}
