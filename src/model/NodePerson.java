package model;

import java.util.Date;

public class NodePerson {

    private String codigo;
    private String name;
    private String lastname;
    private char gender;
    private Date dateOfBirthaN;
    private int heightPerson;
    private String nacionality;
    private String Photography;

    public NodePerson( String name, String lastname, char gender, Date dateOfBirthaN, int heightPerson, String nacionality, String Photography) {
        codigo = codigo;
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.dateOfBirthaN = dateOfBirthaN;
        this.heightPerson = heightPerson;
        this.nacionality = nacionality;
        this.Photography = Photography;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getDateOfBirthaN() {
        return dateOfBirthaN;
    }

    public void setDateOfBirthaN(Date dateOfBirthaN) {
        this.dateOfBirthaN = dateOfBirthaN;
    }

    public int getHeightPerson() {
        return heightPerson;
    }

    public void setHeightPerson(int heightPerson) {
        this.heightPerson = heightPerson;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public String getPhotography() {
        return Photography;
    }

    public void setPhotography(String photography) {
        Photography = photography;
    }
}
