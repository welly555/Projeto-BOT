import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Central central = new Central();
    Scanner sc = new Scanner(System.in);
    int aux = 6;
    int escolha;
    String escolhaNome;
    String login,senha;
    UsuarioCad logado = new UsuarioCad();



  

    while(aux != 0){
      System.out.println("\n------------Menu-----------"+"\n1-Cadastrar usuario\n2-Cadastrar Empresa\n3-Realiazar Login\n4-Mostrar vagas\n5-Buscar vaga\n6-Buscar Empresa\n0-Sair");
    aux = sc.nextInt();
      if(aux == 1){
        central.addUsuarioCad(cadastrarUsuario());
      }else if(aux == 2){
        central.addEmpresa(cadastrarEmpresa());
      }else if(aux == 3){
        System.out.println("Login");
        login = sc.next();
        System.out.println("Senha");
        senha = sc.next();
        logado = central.buscarUsuario(login);
        logado.proxy(login,senha);
        if(logado.proxy(login,senha) == true){
          
        }else{
          logado = new UsuarioCad();
        } 
      }else if(aux == 4){
        central.mostrarTodasVagas();
        System.out.println("Se interessou por alguma vaga? se sim digite o id dela se não coloque 0");
        escolha = sc.nextInt();
        if(escolha != 0){
          central.ConcorrerVaga(escolha,logado.getCurriculo());
        }
      }else if(aux == 5){
        System.out.println("Deseja ver informações de alguma vaga? Digite o id dela: ");
        escolha = sc.nextInt();
        central.buscarVaga(escolha);
      }
      else if(aux == 6){
        System.out.println("Digite o nome da Empresa que deseja ver: ");
        escolhaNome = sc.next();
        exibirEmpresa(central.buscarEmpresa(escolhaNome));
      }
    }
    
    
    

    
  }

  public static Curriculo preencherCurriculo(){
    Curriculo curriculo = new Curriculo();
    curriculo.setNomeUsuario("Pedrinho Pegacao");
    curriculo.setTelefone("(99) 94002-8922");
    curriculo.setEmail("Pedrinho.estourado@gmai.com");
    curriculo.setDescricao("Adoraria ter a chance de conversar mais sobre como as minhas habilidades e experiências poderiam contribuir para o crescimento da empresa.");
    curriculo.setFormacao("Escola da vida, 1996-2022");

    return curriculo;
  }

  public static UsuarioCad cadastrarUsuario(){
    UsuarioCad usuario = new UsuarioCad();
    usuario.setLogin("loginUsuario");
    usuario.setSenha("11111");
    usuario.setEmpresaTrab("Stark Tecnologia");
    
    usuario.setCurriculo(preencherCurriculo());

    return usuario;
  }

  public static Empresa cadastrarEmpresa(){
    Empresa empresa = new Empresa();
    Vaga vaga = new Vaga();
    empresa.setLogin("EmpresaStark");
    empresa.setSenha("12345");
    empresa.setNomeEmpresa("Stark Tecnologia");
    empresa.setCnpj("123.456.789/0001-18");
    empresa.setEmailEmpresa("starktecnologia@gmail.com");
    vaga.setNomeVaga("Faxineiro");
    vaga.setIDVaga(1001);
    vaga.setDescricaoVaga("Vaga para Faxineiro em tempo integral, das 08:00 as 17:00");
    vaga.setRemuneracao("R$ 1.850,00");
    empresa.addVaga(vaga);

    return empresa;
  }

  public static void exibirEmpresa(Empresa empresa){
    System.out.println("\n---------Empresa---------\\nNome : " +empresa.getNomeEmpresa()+ "\nCNPJ: " +empresa.getCnpj()+ "\nEmail: "+empresa.getEmailEmpresa());
    ArrayList<Vaga> vagas = empresa.getVaga();
    for (Vaga exibir: vagas){
      System.out.println("\n---------Cargos---------\nNome: "+ exibir.getNomeVaga()+"\nID Vaga: "+exibir.getIDVaga()+"\nRemunerecao: "+exibir.getremuneracao()+"\nDescricao: "+exibir.getDescricaoVaga()+"\n\n");
    }
  }
}