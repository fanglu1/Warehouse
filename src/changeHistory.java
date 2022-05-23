import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class changeHistory {
    private ArrayList<Double> history;

    public changeHistory(){
        this.history = new ArrayList<Double>();
    }

    public void add(double status){
        history.add(status);
    }

    public void clear(){
        history.clear();
    }

    @Override
    public String toString() {
        return history.toString();
    }

    public double maxValue() {
        if (history.size() < 0) {
            return 0;
        }
        return Collections.max(history);
    }

    public double minValue(){
       if(history.size() < 0){
           return 0;
       }
        return Collections.min(history);
    }

    public double average(){
        double total = 0;
        double avg = 0;
        if(history.size() < 0){
            return 0;
        }
        for(int i = 0; i < history.size(); i++){
            total += history.get(i);
            avg = total/history.size();
        }
        return avg;
    }
}
