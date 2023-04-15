import java.util.*;
public class Main {
	public static void main(String[] args) {
		pFisica pf1 = new pFisica("Larissa","1234567","17/05/2004","larissa@gmail.com","rua","casa",16999,1234);
		pFisica pf2 = new pFisica("Lari","1234568","17/10/2004","lari@gmail.com","rua","casa",16999,12344);
        pJuridica pj1 = new pJuridica("Embraer Airlines SA", "74531954", "contato@embraer.com","Bc","casa",113392,15670);
        pJuridica pj2 = new pJuridica("Amazon SA", "3487620", "contabilidade@amazon.com.br","Tr","casa",119437,30912);
        Empresa empresa = new Empresa("Ragnarok SA", "38912", "comercio@ragnarok.com.br","Rdv","Empresa",1197,302);
        
        empresa.setPj(new ArrayList<pJuridica>());
        empresa.setPf(new ArrayList<pFisica>());
        empresa.getPf().add(pf1);
        //empresa.getPf().add(pf2);
        empresa.getPj().add(pj1);
        //empresa.getPj().add(pj2);
        pj1.setpFisica(pf1);
        pj2.setpFisica(pf2);
        
      /*  for (pJuridica i: empresa.getPj()) {
        	System.out.println(i.getrazaoSocial());
        	System.out.println(i.getCnpj());
        	System.out.println(i.getEmail());
        	System.out.println(i.getLogradouro());
        	System.out.println(i.getComplemento());
        	System.out.println(i.getTelefone());
        	System.out.println(i.getCep());
        	
        }*/
        for(int i = 0; i < empresa.getPj().size(); i++) {
        	System.out.println(empresa.getrazaoSocial() + "\n" + empresa.getCnpj() + "\n" + empresa.getEmail());
        	}
        
	}
}
