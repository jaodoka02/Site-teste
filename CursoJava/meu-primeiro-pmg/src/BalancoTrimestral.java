public class BalancoTrimestral {
    public static void main(String[] args) {
    int despesasJaneiro = 11000;
    int despesasFevereiro = 22000; 
    int despesasMarco = 15000;
    int despesasTrimestre = despesasJaneiro + despesasFevereiro + despesasMarco;
    

    System.out.println("Gasto do trimeste:R$"+despesasTrimestre);
    int mediaporMes=despesasTrimestre/3;
    System.out.println("Média Mensal: R$"+ mediaporMes);
    
}
}
