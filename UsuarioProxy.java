public class UsuarioProxy extends Usuario{


  public boolean proxy(String loginE, String senhaE){
    if(this.login.equals(loginE) == true && this.senha.equals(senhaE) == true){
      System.out.println("Usuario validado");
      return true;
    }else{
      System.out.println("Usuario não validado");
      return false;
    }
  }

  
}