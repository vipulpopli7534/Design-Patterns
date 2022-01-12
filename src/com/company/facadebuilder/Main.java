package com.company.facadebuilder;

public class Main {

    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .withAddress("1234 asad")
                .withName("vipul")
                .withLastName("popli")
                .withAge("16")
                .salInfo()
                .withSalary("99LPA")
                .workInfo()
                .withCompany("abcd pvt ltd")
                .withPosition("SDE-3")
                .build();

        System.out.println(person);
    }
}
