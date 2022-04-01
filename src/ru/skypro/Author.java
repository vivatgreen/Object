package ru.skypro;

public class Author {
    String authorName;
    String authorSurname;

    Author( String authorName, String authorSurname){
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public void setAuthorName (String authorName){
        this.authorName = authorName;
    }
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorSurname (String authorSurname) {
        this.authorSurname = authorSurname;
    }
    public String getSurname () {
        return authorSurname;
    }

}
