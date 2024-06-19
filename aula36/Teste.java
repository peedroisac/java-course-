package aula36;

public class Teste {

    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Tyrion");
//        contato.setEndereco("Kings Landing");
//        contato.setTelefone("11 9999-9999");

        //relacionamento tem-um endereco
        Endereco end = new Endereco();
        end.setNomeRua("Rua Game of Thrones");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("Kings Landing");
        end.setEstado("Westeros");
        end.setCep("9999999");

        contato.setEndereco(end);

        //relacionamento tem-um telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("celular");
        telefone.setDdd("21");
        telefone.setNumero("99999-9912");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("casa");
        telefone2.setDdd("21");
        telefone2.setNumero("88888-9912");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        //contato.setTelefone(tel);
        contato.setTelefones(telefones);


        //teste saída no console
        System.out.println(contato.getNome());
        //System.out.println(contato.getTelefone());

        if (contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        /*if (contato.getTelefone() != null){
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
          }*/


        if (contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }
    }
}
/*
        //Criar objeto Telefone


        System.out.println(contato.getNome());
        System.out.println(contato.getEndereco().getCidade());
        System.out.println(contato.getTelefone().getNumero());

        if (contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }
    }
}
*/