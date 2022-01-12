package facadebuilder;

public class PersonBuilder {

    protected Person person;

    public PersonBuilder() {
        person = new Person();
    }

    public PersonBuilder withName(String name) {
        person.name = name;
        return this;
    }

    public PersonBuilder withLastName(String lastName) {
        person.lastName = lastName;
        return this;
    }

    public PersonBuilder withAddress(String address) {
        person.address = address;
        return this;
    }

    public PersonBuilder withAge(String age) {
        person.age = age;
        return this;
    }

    public PersonalWorkBuilder workInfo() {
        return new PersonalWorkBuilder(person);
    }

    public PersonSalaryBuilder salInfo() {
        return new PersonSalaryBuilder(person);
    }

    public Person build() {
        return person;
    }
}

class PersonalWorkBuilder extends PersonBuilder {

    public PersonalWorkBuilder(Person person) {
        this.person = person;
    }

    public PersonalWorkBuilder withCompany(String company) {
        person.company = company;
        return this;
    }

    public PersonalWorkBuilder withPosition(String position) {
        person.position = position;
        return this;
    }


}

class PersonSalaryBuilder extends PersonBuilder {

    public PersonSalaryBuilder(Person person) {
        this.person = person;
    }

    public PersonSalaryBuilder withSalary(String salary) {
        person.salary = salary;
        return this;
    }
}