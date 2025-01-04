package automation.data.compare.comparator;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

@Slf4j
public class CoreDataComparator<T> {


    public CoreDataComparator(){

    }


    public void compareKeys(Map<String, List<T>> env1Data,
                            Map<String, List<T>> env2Data){

        var env1Keys = env1Data.keySet();
        var env2Keys = env2Data.keySet();

        Set<String> allKeys = new HashSet<>();

        allKeys.addAll(env1Keys);
        allKeys.addAll(env2Keys);

        for(String key : allKeys){
            if(env1Keys.contains(key) && env2Keys.contains(key)){
                compareValues(env1Data.get(key), env2Data.get(key));
            } else if (env1Keys.contains(key)) {

            }
            else if (env2Keys.contains(key)) {

            }
        }

    }

    public void compareValues(List<T> env1Values, List<T> env2Values){


        List<T> temp = new ArrayList<>();
        temp.addAll(env1Values);

        env1Values.removeAll(env2Values);
        env2Values.removeAll(temp);

        if(env1Values.isEmpty() && env2Values.isEmpty()){
            log.info("Values are equal");
        }

        if(!env1Values.isEmpty()){

        }

        if(!env2Values.isEmpty()){

        }

    }

}
