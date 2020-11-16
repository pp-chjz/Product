package max;

import java.util.List;

public class StatUtil {
    public static double max(MaxInterface maxType, List<Object> oList){
        double max = -9999;
        for (Object o : oList)
        {
            if(maxType.findMax(o) > max)
            {
                max = maxType.findMax(o);
            }
        }
        return max;
    }
}
