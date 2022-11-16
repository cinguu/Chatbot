package chatbot2driver;

public class Chatbot2 {
    
    /**
     * A default constructor
     */
    public Chatbot2(){
    }
   
    /**
     * Get a default greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     */
    public String getResponse(String statement) {
        String response = "";
        //part d-1
        if (statement.startsWith("n") && statement.endsWith ("o") && statement.indexOf("no") >=0
        //part d-2
           || statement.indexOf(" no ") >=0 
           || statement.indexOf(" no") >=0 
           || statement.indexOf("no ")>=0)
        {
            response = "Why so negative?";
        } 
        if (statement.indexOf("mother") >= 0) {
            response = "Tell me more about your mother.";
        } 
        if (response.length() == 0) {
            response = getRandomResponse();
        // Part a
        }
        if (statement.indexOf("near") >=0 && statement.indexOf("Starbucks") >=0)
        {
            response = "The nearest Starbucks is in the Student Union 0.5 miles away.";
        }
        //part b
        if (statement.indexOf("dog") >=0 || statement.indexOf("cat") >=0)
        {
            response = "Tell me more about your pets.";
        }
        //part c-1
        if (statement.indexOf("park") >=0)
        {
            response = "Parking on campus is atrocious and expensive.";
        }
        if (!(statement.indexOf("car")>=0) && statement.indexOf("park") >=0 && statement.length()>4)
        {
            response = "I bet the trees there are lovely this time of year.";
        }
        //part c-2
        if (statement.indexOf("rock") >=0)
        {
            if (statement.indexOf("rock") >=0) 
           {
               response = "What is your favorite band?";
           }
            if (statement.indexOf("rock") >=0 && (!(statement.indexOf("music")>=0)) && (statement.length() >=5))
           {
            response = "I had a rock collection too!";
           }
     
        
              
      
        }
      
      
        return response;
    }

    /**
     * Pick a generic response to use if nothing else fits.
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 4;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        }  
        if (whichResponse == 1) {
            response = "Hmmm.";
        } 
        if (whichResponse == 2) {
            response = "Do you really think so?";
        } 
        if (whichResponse == 3) {
            response = "You don't say.";
        }

        return response;
    }
}
