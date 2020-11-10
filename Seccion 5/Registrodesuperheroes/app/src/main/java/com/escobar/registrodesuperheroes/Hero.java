package com.escobar.registrodesuperheroes;

import android.os.Parcel;
import android.os.Parcelable;

public class Hero implements Parcelable {

    private String name;
    private String lastName;
    private String nameHero;
    private int age;
    private String address;
    private String city;

    public Hero(String name, String lastName, String nameHero,
                int age, String address, String city){
        this.name = name;
        this.lastName = lastName;
        this.nameHero = nameHero;
        this.age = age;
        this.address = address;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNameHero() {
        return nameHero;
    }

    public void setNameHero(String nameHero) {
        this.nameHero = nameHero;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    protected Hero(Parcel in) {
        name = in.readString();
        lastName = in.readString();
        nameHero = in.readString();
        age = in.readInt();
        address = in.readString();
        city = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(lastName);
        dest.writeString(nameHero);
        dest.writeInt(age);
        dest.writeString(address);
        dest.writeString(city);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Hero> CREATOR = new Parcelable.Creator<Hero>() {
        @Override
        public Hero createFromParcel(Parcel in) {
            return new Hero(in);
        }

        @Override
        public Hero[] newArray(int size) {
            return new Hero[size];
        }
    };

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nameHero='" + nameHero + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
