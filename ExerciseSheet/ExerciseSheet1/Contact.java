import java.util.Vector;

class AdressBook
{
    private AdressBook[] contacts;
    private int count;
    private String name;
    private String phone;
    private String email;

    public void updateAdressBook(String name, String phone, String email)
    {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public AdressBook(String name, String phone)
    {
        this.name = name;
        this.phone = phone;
    }

    public AdressBook(String name, String phone, String email)
    {
        this(name, phone);
        this.email = email;
    }

    void displayInfo()
    {
        System.out.println("Name -> " + name);
        System.out.println("Phone -> " + phone);
        System.out.println("Email -> " + email);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getName()
    {
        return name;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getEmail()
    {
        return email;
    }

    public AdressBook()
    {
        contacts = new AdressBook[10];
        count = 0;
    }

    public void addcontacts(AdressBook contact)
    {
        if(count < contacts.length)
        {
            contacts[count] = contact;
            count++;
            System.out.println("Adi-cio-nado");
        }
        else
        {
            System.out.println("ERROR!!");
        }
    }

    public AdressBook search(String name)
    {
        for(int i = 0; i < count; i++)
        {
            String currentName = contacts[i].getName();

            if(currentName.equalsIgnoreCase(name))
            {
                return contacts[i];
            }
        }
        return null;
    }

   public void getall()
    {
        for (int i = 0; i < count; i++)
    {
        contacts[i].displayInfo();
    }
}
}

public class Contact
{
    public static void main(String[] args)
    {
        AdressBook client = new AdressBook();

        client.setName("Rafael");
        client.setPhone("71 9 4002-8922");
        client.setEmail("Rafael@Sadolla.com");

        System.out.println(client.getName());
        System.out.println(client.getPhone());
        System.out.println(client.getEmail());

        client.updateAdressBook(
            "Julinho",
            "71 9 7546-3319",
            "ehofunkdojaponesquevaidarplaystationtres"
        );

        client.displayInfo();
     AdressBook contato1 = new AdressBook(
            "Rafael",
            "71 9 4002-8922",
            "rafael@gmail.com"
        );

        AdressBook contato2 = new AdressBook(
            "Julinho",
            "71 9 7546-3319",
            "julinho@gmail.com"
        );

        AdressBook contato3 = new AdressBook(
            "Maria",
            "71 9 9999-1111",
            "maria@gmail.com"
        );

        client.addcontacts(contato1);
        client.addcontacts(contato2);
        client.addcontacts(contato3);

        System.out.println("\nall");
        client.getall();

        System.out.println("\nsearch");
        AdressBook encontrado = client.search("Julinho");

        if (encontrado != null)
        {
            encontrado.displayInfo();
        }
        else
        {
            System.out.println("not found.");
        }
          encontrado = client.search("jordaniel");

        if (encontrado != null)
        {
            encontrado.displayInfo();
        }
        else
        {
            System.out.println("not found.");
        }
    }
}
