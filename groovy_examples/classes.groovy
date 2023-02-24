// Parallel list : object with two properties

class User 
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

User[] users = [
    new User(firstName: "Bob", lastName: "Dylan"),
    new User(firstName: "Jeff", lastName:"Lynne"),
    new User(firstName: "Roy", lastName: "Orbison"),
    new User(firstName: "George", lastName:"Harrison"),
    new User(firstName: "Tom", lastName: "Petty")

]

//String[] firstNames = ["Bob","Jeff","Roy","George","Tom"];
//String[] lastNames = ["Dylan","Lynne","Orbison","Harrison","Petty"];

for(int i = 0; i < users.size(); i++)
{
    println("UserName is ${users[i].UserName()}");

}

users.each(u -> println("UserName is ${u.UserName()}"));