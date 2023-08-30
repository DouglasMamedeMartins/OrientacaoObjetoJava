public class Principal {

  public static void main(String[] args) {

    Pessoa proprietario = new Pessoa();
    proprietario.nome = "Douglas Mamede";
    proprietario.cpf = "111.222.333-44";
    proprietario.anoNascimento = 1999;

    Carro meuCarro = new Carro();
    meuCarro.anoFabricacao = 2020 ;
    meuCarro.cor = "Preto";
    meuCarro.fabricante = "Honda";
    meuCarro.modelo = "HR-V";
    meuCarro.precoCompra = 90000;
    meuCarro.proprietario = proprietario;

    Pessoa novoProprietario = new Pessoa();
    novoProprietario.nome = "Jao das conchas";
    novoProprietario.cpf = "222.333.444.55";
    novoProprietario.anoNascimento = 2001;

    Carro novoCarro = new Carro();
    novoCarro.anoFabricacao = 2015;
    novoCarro.cor = "vermelho";
    novoCarro.fabricante = "Porsche";
    novoCarro.modelo = "911-turbo";
    novoCarro.precoCompra = 908000;
    novoCarro.proprietario = novoProprietario;

    System.out.printf("Meu Carro Modelo: %s%n", meuCarro.modelo);
    System.out.printf("Meu Carro Ano: %s%n", meuCarro.anoFabricacao);
    System.out.printf("Meu Carro Fabricante: %s%n", meuCarro.fabricante);
    System.out.printf("Meu Carro Ano: %s%n", meuCarro.cor);

    System.out.println();

    System.out.printf("O proprietário do carro: %s%n", meuCarro.proprietario.nome);
    System.out.printf("O cpf do proprietário do carro: %s%n", meuCarro.proprietario.cpf);
    System.out.printf("O ano de nascimento do proprietário do carro: %s%n", meuCarro.proprietario.anoNascimento);


    System.out.println();

    System.out.printf("seu novo Carro Modelo: %s%n", novoCarro.modelo);
    System.out.printf("seu novo Carro Ano: %s%n", novoCarro.anoFabricacao);
    System.out.printf("seu novo Carro Fabricante: %s%n", novoCarro.fabricante);
    System.out.printf("seu novo Carro Ano: %s%n", novoCarro.cor);

    System.out.println();

    System.out.printf("O novo propriétario do carro: %s%n", novoCarro.proprietario.nome);
    System.out.printf("O cpf do novo propriétario do carro: %s%n", novoCarro.proprietario.cpf);
    System.out.printf("O ano de nascimento do novo propriétario do carro: %s%n",
        novoCarro.proprietario.anoNascimento);

    System.out.println();

   meuCarro.imprimirResumoDepreciacao();

    System.out.println();

   novoCarro.imprimirResumoDepreciacao();

    System.out.println();

    System.out.printf("Calculo Ipva do meu carro: %6.2f%n", meuCarro.calcularIpva());
    System.out.printf("Calculo Ipva do novo carro: %6.2f%n", novoCarro.calcularIpva());

  }
}
