package RealWorldSpringP;

import org.springframework.stereotype.Component;
import java.lang.reflect.Array;
import java.util.Arrays;

@Component
public class BusinessCalculationService {
    private DataService dataService;

    public BusinessCalculationService(DataService dataService){
        super();
        this.dataService = dataService;
    }
    public int findMax(){
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }
}
