package br.com.stampstudio.sqlitecrud.model;

public class User {
    private int Id;
    private String Name;
    private String Address;
    private int Age;
    private String Telephone;

    public User() {
        this.Id = 0;
        this.Name = "";
        this.Address = "";
        this.Age = 0;
        this.Telephone = "";
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }
}
