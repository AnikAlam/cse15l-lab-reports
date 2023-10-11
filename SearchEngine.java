import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    ArrayList<String> queries = new ArrayList<String>();
    ArrayList<String> foodbox = new ArrayList<String>();

    public String handleRequest(URI url) {
        if (url.getPath().equals("/add")) {
            String[] parameters = url.getQuery().split("=");
            queries.add(parameters[1]);
            return String.format("String added!");

        } else if(url.getPath().equals("/search")) {
            String[] parameters = url.getQuery().split("=");
            for(int i = 0; i < queries.size(); i++) {
                if(queries.get(i).contains(parameters[1])) {
                     foodbox.add(queries.get(i));
                }
            }
            return foodbox.toString();
        }
        return String.format("404 Error");
    }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
