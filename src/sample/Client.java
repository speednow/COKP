package sample;

abstract class Client {

    protected ClientType type;

    public abstract Client GetClient();
}

class AddingClients implements Adolescent_clients {

    @Override
    public Client making_clients(ClientType type) {

        Client client = null;

        if (type == ClientType.YOUNG)
            client = new YoungClient();
        if (type == ClientType.ADULT)
            client = new AdultClient();
        return client;
    }
}

class AdultClient extends Client {
    private String name;
    private String surname;
    private int age;

    public AdultClient() {
        type = ClientType.ADULT;
    }

    public AdultClient(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public AdultClient(AdultClient client) {
        this.name = client.name;
        this.surname = client.surname;
        this.age = client.age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client{name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';

    }

    @Override
    public Client GetClient() {
        return null;
    }
}

class YoungClient extends Client {
    private String name;
    private String surname;
    private int age;
    private String parent;


    public YoungClient(String name, String surname, int age, String parent) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.parent = parent;
    }

    public YoungClient(YoungClient client) {
        this.name = client.name;
        this.surname = client.surname;
        this.age = client.age;
        this.parent = client.parent;
    }

    public YoungClient() {
        type = ClientType.YOUNG;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getParent() {
        return parent;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Client{name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", parent='" + parent + '\'' +
                '}';
    }

    @Override
    public Client GetClient() {
        return null;
    }

}

enum ClientType {
    ADULT, YOUNG
}

//public class Client {
//    private String name;
//    private String surname;
//
//    public Client(String name, String surname) {
//        this.name = name;
//        this.surname = surname;
//    }
//
//    public Client(Client client) {
//        this.name = client.name;
//        this.surname = client.surname;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    @Override
//    public String toString() {
//        return "Client{name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                '}';
//    }
//}
