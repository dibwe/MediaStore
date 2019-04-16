/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author Acer
 */
public class MediaManagement {
    private int id = -1;
    private String title;
    private float price;
    private String categorie;
    
    private String publisher;
    private String listeAuteur;
    
    private float lenght;
    private String director;
    
    public MediaManagement(){}
    
    public MediaManagement(int id , String title , float price , String categorie, float lenght, String director){
        this.id = id;
        this.title = title;
        this.price = price;
        this.categorie = categorie;
        this.lenght = lenght;
        this.director = director;
    }
    public MediaManagement(int id , String title , float price , String categorie, String publisher, String listeAuteur){
        this.id = id;
        this.title = title;
        this.price = price;
        this.categorie = categorie;
        this.publisher = publisher;
        this.listeAuteur = listeAuteur;
    }
    
    //================================MUTATEURS================================
    public void setId(int id){
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public void setCategorie(String categorie){
        this.categorie = categorie;
     
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    
    }
    public void setListeAuteur(String listeAuteur){
       this.listeAuteur = listeAuteur;
    }
    public void setLenght(float lenght){
       this.lenght = lenght;
    }
     public void setDirector(String String){
       this.director = director;  
   }
    
    //==============================ACCESSEURS===================================
    public int getId(){
        return this.id;
    } 
    public String getTitle(){
        
        return this.title;
    }
    public float getPrice(){
        return this.price;
    }
    public String getCategorie(){
        return this.categorie;
    }
    public String getPublisher(){
       return this.publisher;
    }
    public String getListeAuteur(){
     return this.listeAuteur;
    }
    public float getLenght(){
    return this.lenght;
    }
    public String getDirector(){
     return this.director;
    }
}
