import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompletePathOfJourney {

    public static void main(String[] args) {
        List<String> path1=new ArrayList<>();
        List<String> path2=new ArrayList<>();
        List<String> path3=new ArrayList<>();
        List<String> path4=new ArrayList<>();
        List<List<String>> paths=new ArrayList<>();

        path1.add("Ohio");
        path1.add("Chicago");

        path2.add("Boston");
        path2.add("Texas");

        path3.add("Missouri");
        path3.add("Ohio");

        path4.add("Texas");
        path4.add("Missouri");

        paths.add(path1);
        paths.add(path2);
        paths.add(path3);
        paths.add(path4);

        List<List<String>> result=tracePath(paths);
        System.out.println(result);

    }

    public static List<List<String>> tracePath(List<List<String>> paths){
        List<List<String>> result=new ArrayList<>();
        Map<String,String> destination=new HashMap<>();
        Map<String,String> reverseDestination=new HashMap<>();

        //for straight destinations
        for(List<String> path:paths){
            destination.put(path.get(0),path.get(1));
        }

        //for reverse destination
        for(Map.Entry<String,String> entry:destination.entrySet()){
            reverseDestination.put(entry.getValue(),entry.getKey());
        }

        String start=null;

        //find starting point of journey
        for(Map.Entry<String,String> entry:destination.entrySet()){
            if(!reverseDestination.containsKey(entry.getKey())){
                start=entry.getKey();
                break;
            }
        }

        //trace complete path
        String dest=destination.get(start);
        while(dest!=null && !dest.isEmpty()){
            List<String> path=new ArrayList<>();
            path.add(start);
            path.add(dest);
            result.add(path);
            start=dest;
            dest=destination.get(start);
        }

        return result;
    }
}
