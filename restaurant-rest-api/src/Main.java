import org.json.*;

public class Main {

    public static void main(String [] args) throws Exception{
      JSONArray users = new JSONArray(RestaurantApi.getUsers());
      int userCount = users.length();
      for (int i=0; i < userCount; i++)
      {
          JSONObject user = (JSONObject)users.get(i);
          System.out.println(user.getString("first_name"));
      }

    }
}
