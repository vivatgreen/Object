package ru.skypro;
public class Author {

    private final String authorName;
    private final String authorSurname;

    public Author( String authorName, String authorSurname){
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return authorName;
    }
    public String getSurname () {
        return authorSurname;
    }

}
