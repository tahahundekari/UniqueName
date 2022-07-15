package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Taha";
        } else if (query.contains("plus")) { // TODO extend the programm here
            String[] queryStuff = query.split(" ");
            return (Integer.parseInt(queryStuff[2]) + Integer.parseInt(queryStuff[4])).toString();
        }
        else {
            return "";
        }
    }
}
