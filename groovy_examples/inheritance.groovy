abstract class User 
{
    String lastName;
    String firstName;
    
    public String UserName()
    {
        return getUserName(this.firstName, this.lastName);
    }
    
    private String getUserName(String firstNme, String lasName)
    {
        return firstName.substring(0,1).toLowerCase() + lastName.toLowerCase();
    }
}

public class Artist extends User
{
    public String[] Songs;
    

}

public class Producer extends User
{
   public void Produce(){}
}

User[] users = [
    new Artist(firstName: "Bob", lastName: "Dylan", Songs: ["It´s alright ma"]),
    new Producer(firstName: "Jeff", lastName:"Lynne"),
    new Artist(firstName: "Roy", lastName: "Orbison", Songs: ["Crying"]),
    new Artist(firstName: "George", lastName:"Harrison", Songs: ["Wah Wah"]),
    new Artist(firstName: "Tom", lastName: "Petty",  Songs: ["Running down the dream"])

]

//String[] firstNames = ["Bob","Jeff","Roy","George","Tom"];
//String[] lastNames = ["Dylan","Lynne","Orbison","Harrison","Petty"];
/*
for(int i = 0; i < users.size(); i++)
{
    println("UserName is ${users[i].UserName()}");

}*/

users.each{user -> 
    if(user instanceof Artist)
    {
        println("User name is: ${user.UserName()}");
        user.Songs.each
        {
            println(it);
        }
    }
    else
    {
        user.Produce();
    }

};