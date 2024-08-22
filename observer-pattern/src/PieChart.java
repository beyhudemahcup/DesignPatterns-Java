import java.util.ArrayList;

public class PieChart implements ObserverInterface{

    private Data data;
    private ArrayList<Integer> dataList;

    public PieChart(Data data){
        dataList = new ArrayList<Integer>();
        this.data = data;
        for (int i : data.getData()){
            dataList.add(i);
        }
    }

    @Override
    public void Update() {
        dataList.clear();

        for (int i : data.getData()) dataList.add(i);
        System.out.println("Pie Chart is updated!");
        System.out.println(dataList);
    }
}
