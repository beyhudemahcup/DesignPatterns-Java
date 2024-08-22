public class Main {
    public static void main(String[] args) {

        Data data = new Data();
        PieChart pieChart = new PieChart(data);
        BarChart barChart = new BarChart(data);

        data.Attach(pieChart);
        data.Attach(barChart);

        data.newData();
        data.newData();

        data.Detach(barChart);

        data.newData();
    }
}