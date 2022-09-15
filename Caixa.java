
package com.mycompany.lp1;
public class Caixa {
    private String destinatario;  
    private String conteudo;  
    private float peso;  
    private int tamanho;  
    private String distribuidora;  

    public String getDestinatario(){  
        return destinatario;  
    }  

    public void setDestinatario(String destinatario){  
        this.destinatario = destinatario;  
    }  

    public String getConteudo(){  
        return conteudo;  
    }  
    
    public void setConteudo(String conteudo){  
        this.conteudo = conteudo;  
    }  

     public float getPeso(){ 
        return peso;  
    }  

    public void setPeso(float peso){  
        this.peso = peso;  
    }  
    public int getTamanho(){  
        return tamanho;  
    }  

    public void setTamanho(int tamanho){  
        this.tamanho = tamanho;  

    } 
    public String getDistribuidora(){  
        return distribuidora;  

    }  

    public void setDistribuidora(String distribuidora){  
        this.distribuidora = distribuidora; 

    }  

     public boolean lacrar(){  
        return(true);  
    }  

    public boolean receber(){  
        return(true);  

    }  

 

    public String rotular(){  
        return("Rotulando caixa...");  
    }  

    public String transportar(){  
        return("transporte sendo realizado");  
    }  

    public String armazenarcaixa(){  
        return("Estao sendo armazenadas");  

    }  
    public static void main(String[] args) {  
        Caixa c1=new Caixa();  
        

    } 

 
     

     

} 
 
