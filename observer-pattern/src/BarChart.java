import java.util.ArrayList;

public class BarChart implements ObserverInterface {

    private Data data;
    private ArrayList<Integer> dataList;

    public BarChart(Data data){
        dataList = new ArrayList<Integer>();
        this.data = data;
        for (int i : data.getData()){
            dataList.add(i);
        }
    }
    @Override
    public void Update() {
        dataList.clear();
        for (int i : data.getData()){
            dataList.add(i);
        }
        System.out.println("Bar Chart is updated!");
        System.out.println(dataList);
    }
}
