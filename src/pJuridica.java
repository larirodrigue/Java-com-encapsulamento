
public class pJuridica {
    private String razaoSocial, cnpj, email, logradouro, complemento; 
    private long telefone, cep;
    
    pFisica pFisica;

    public pJuridica(String razaoSocial, String cnpj, String email, String logradouro, String complemento, long telefone, long cep) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.email = email;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.telefone = telefone;
        this.cep = cep;
    }

    public void setrazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getrazaoSocial() {
        return razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getCnpj() {
        return cnpj;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getComplemento() {
        return complemento;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }
    public long getTelefone() {
        return telefone;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }
    public long getCep() {
        return cep;
    }
    public void setpFisica(pFisica pFisica) {
    	this.pFisica = pFisica;
    }
    public pFisica getpFisica() {
    	return pFisica;
    }

}