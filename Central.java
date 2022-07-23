import java.util.ArrayList;

public class Central{
  private ArrayList<UsuarioCad> usuarios = new ArrayList<>();
  private ArrayList<Empresa> empresas = new ArrayList<>();

  public Central(){
  }
  
  public void addUsuarioCad(UsuarioCad usuario){
    this.usuarios.add(usuario);
  }
  public void addEmpresa(Empresa empresa){
    this.empresas.add(empresa);
  }

  public void excluirEmpresa(String login){
    for(Empresa e: empresas){
      if(e.getLogin().equals(login)){
        empresas.remove(e);
      }
    }
  }

  public void excluirUsuario(String login){
    for(UsuarioCad u: usuarios){
      if(u.getLogin().equals(login)){
        empresas.remove(u);
      }
    }
  }


  public void mostrarTodasVagas(){
    for (Empresa v: empresas){
      ArrayList<Vaga> vagas = v.getVaga();
      for (Vaga exibir: vagas){
        System.out.println("Nome: "+ exibir.getNomeVaga()+"\nID Vaga: "+exibir.getIDVaga()+"\nRemunerecao: "+exibir.getremuneracao()+"\nDescricao: "+exibir.getDescricaoVaga());
      }
    }
  }

  public void buscarVaga(int escolha){
    for (Empresa v: empresas){
      ArrayList<Vaga> vagas = v.getVaga();
      for (Vaga exibir: vagas){
        if(exibir.getIDVaga() == escolha){
          System.out.println("Nome: "+ exibir.getNomeVaga()+"\nID Vaga: "+exibir.getIDVaga()+"\nRemunerecao: "+exibir.getremuneracao()+"\nDescricao: "+exibir.getDescricaoVaga());
        }
      }
    }
  }

  public Empresa buscarEmpresa(String login){
    for(Empresa e: empresas){
      if(e.getLogin().equals(login)){
        return e;
      }
    }
    return null;
  }
  
  public void ConcorrerVaga(int idVaga, Curriculo curriculo){
    for (Empresa e: empresas){
      ArrayList<Vaga> vagas = e.getVaga();
      for (Vaga v: vagas){
        if(v.getIDVaga() == idVaga){
          v.addCurriculo(curriculo);
          System.out.println("Parabens voce esta concorrendo a vaga, agora so esperar ser chamado. \n Boa sorte!!!");
        }
      }
    }
  }

  public UsuarioCad buscarUsuario(String login){
    for(UsuarioCad u: usuarios){
      if(u.getLogin().equals(login)){
        System.out.println("Usuario encontrado");
        return u;
      }
    }
    return null;
  }
  
}