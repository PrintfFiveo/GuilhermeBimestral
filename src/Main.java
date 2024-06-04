public class Main {

    public static void main(String[] args) {



        aluno abner = new aluno();
        abner.setCidade("aaa");


      try {
          abner.getCidade();


      }
      catch (Exception e) {
          System.out.println(e.getMessage());
      }



        abner.setRA(1);


        try {
            abner.getRA();


        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }


        abner.setNome("Abner");


        try {
            abner.getNome();


        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }





    }


    }

