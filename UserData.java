import java.text.DecimalFormat;

public class UserData {
    static private int numUsers;
    private String userId;
    private String username;
    private String password;
    private String emailAddress;
    
    public UserData(){
        DecimalFormat idFormat = new DecimalFormat("00000000");
        userId = idFormat.format(numUsers);
        numUsers++;
        username = "";
        password = "";
        emailAddress = "";
    }

    public String getUserId(){
        return userId;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getEmailAddres(){
        return emailAddress;
    }

    // simple test
    // public static void main(String[] args){
    //     UserData u = new UserData();
    //     System.out.println(u.getUserId());

    //     UserData x = new UserData();
    //     System.out.println(x.getUserId());

    //     UserData y = new UserData();
    //     System.out.println(y.getUserId());
    // }
}

    