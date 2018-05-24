// author: David Gauch
// version: 2.1

import java.util.*;
import java.io.*;

public class Dijkstras {

    public static void addToMap(String a, String b, Map<String,List<String>> map) {
        if(map.get(a) == null)
            map.put(a, new ArrayList<String>());

        map.get(a).add(b);
    }

    public static Map<String,List<String>> load(String file) throws FileNotFoundException {
        Scanner in = new Scanner(new File(file));
        Map<String,List<String>> ret = new HashMap<String,List<String>>();

        in.nextLine();//removes tiles
        while(in.hasNext()) {
            String line = in.nextLine();
            String[] temp = line.split(",");

            if (temp.length < 5)
                continue;

            String[] temp2 = temp[4].split(" --- ");

            if(!temp2[0].equals(temp2[1]))
                addToMap(temp2[0],temp2[1],ret);
        }

        return ret;
    }

    public static Map<String,Integer> dijkstras(String init, Map<String,List<String>> data){
        Map<String, Integer> dist = new HashMap<String, Integer>();
        Set<String> unvisited = new HashSet<String>(data.keySet());
        Queue<String> queue = new LinkedList<String>();

        dist.put(init, 0);
        queue.add(init);

        while(queue.size() > 0){
            String curr = queue.remove();
            for(String s : data.get(curr)) {
                if(!unvisited.contains(s))
                    continue;

                Integer temp = dist.get(s);
                if(temp == null || temp > dist.get(curr)) {
                    dist.put(s, dist.get(curr) + 1);
                    queue.add(s);
                }

                unvisited.remove(curr);
            }

        }

        return dist;
    }

    public static void main(String[] args) throws FileNotFoundException {
        if(args.length < 1) {
            System.err.println("Error: must provide input file\n" +
                    "Ex: java Dijkstras foo.csv");
            return;
        }


        Map<String,List<String>> data = load(args[0]);

        SortedSet<String> characters = new TreeSet<String>(data.keySet());

        //prints row headers
        PrintWriter out = new PrintWriter("out.csv");
        for(String s : characters)
            out.print(","+s);
        out.println(",avg");

        for(String s1 : characters) {
            int sum = 0;
            out.print(s1);

            Map<String, Integer> dist = dijkstras(s1, data);
            for(String s2 : characters) {
                Integer temp = dist.get(s2);
                out.print("," + temp);
                sum += temp == null ? 0 : temp;
            }

            //average distance excluding self;
            out.println("," + ((double)sum)/(characters.size()-1));
        }
        out.close();
    }
}
