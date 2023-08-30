public class Carro {

  String fabricante;
  String modelo;
  String cor;
  int anoFabricacao;
  double precoCompra;
  Pessoa proprietario;

  void imprimirResumoDepreciacao() {
    double valorRevendaMeuCarro = calcularValorRevenda();
    int tempoDeUsoMeuCarro = calcularTempoDeUsoEmAnos();

    System.out.printf("Tempo de uso (anos) do meu carro: %d%n",
        tempoDeUsoMeuCarro );
    System.out.printf("Valor da revenda do meu carro: %6.2f%n",
        valorRevendaMeuCarro
    );
  }

  void imprimirDadosDoCarro() {

  }

  double calcularIpva() {
    return calcularValorRevenda() * 0.04;
  }

  int calcularTempoDeUsoEmAnos() {
    return 2023 - anoFabricacao;
  }

  double calcularValorRevenda() {
    int tempoDeUsoEmAnos = calcularTempoDeUsoEmAnos();
    int vidaUtilEmAnos = 20;
    double valorRevenda = (precoCompra / vidaUtilEmAnos)
        * (vidaUtilEmAnos - tempoDeUsoEmAnos);

    if(valorRevenda < 0) {
      valorRevenda = 0;
    }
    return valorRevenda;
  }

}
