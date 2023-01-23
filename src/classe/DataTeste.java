package classe;

public class DataTeste {
  public static void main(String[] args) {
    Data data1 = new Data();

    var data2 = new Data(14, 04,2002);
      data2.dia = 22;
      data2.mes = 7;
      data2.ano = 2000;
 
      System.out.println(data1.dataFormatada());
      System.out.println(data2.dataFormatada());
      System.out.println(data1.dataFormatada());
  }
}
