String getUserName(String firstName, String lastName)
{
    return firstName.substring(0,1).toLowerCase() + lastName.toLowerCase();
}

String result =  getUserName("Chris", "Behrens");
assert result == "cbehrens" : "getUserName is not working";

void printCredential(cred)
{
    println("UserName is ${cred}");
}

printCredential(result);