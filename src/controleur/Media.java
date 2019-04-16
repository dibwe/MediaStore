package controleur;


import java.util.ArrayList;
import java.util.Scanner;
import mediastore.MediaStore;
import modele.MediaManagement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class Media {
   public int id;
   public String title;
   public float price;
   public String categorie;
   
   public static ArrayList<MediaManagement> listeMedia = new ArrayList();
   
   public static boolean idExist(int id){
       
       boolean isExist = false;
       
       for(int i = 0; i < listeMedia.size(); i++){
           if(listeMedia.get(i).getId() == id){
               isExist = true;
               return isExist;
           }
           else{
               isExist = false;
           }
       }
       return isExist;
   }
   public static int nbrMedia(){
       
      return listeMedia.size();
   }
   public static MediaManagement getMedia(int id){
       
       MediaManagement objet = new MediaManagement();
       
       for(int i = 0; i < listeMedia.size(); i++){
           
           if(listeMedia.get(i).getId() == id){
               objet  = listeMedia.get(i);
               return objet;
           }
       }
       return objet;
   }
   public static int chooseCat(){
       System.out.println("choisir la catgorie du media : ");
       System.out.println("1. Book");
       System.out.println("2. DVD");
       System.out.println("3. CD");
       Scanner sc = new Scanner(System.in);
       int cat = sc.nextInt();
       if (1<=cat && cat<=3) {
           return cat;
       }
       else{
           System.out.println("veuillez choisir un nombre entre 1 et 3 ");
       }
    return 0;
   }
   public static void createMediat(MediaManagement mediaManagement){
       
       MediaStore main = new MediaStore();
       listeMedia.add(mediaManagement);  
       int rep;
       
       do{
       System.out.println("Voulez-vous ajouter un autre objet media ?");
       System.out.println("1. Oui");
       System.out.println("2. Non");
       System.out.println("3. Afficher tous les medias");
       Scanner sc = new Scanner(System.in);
       rep = sc.nextInt();
       if(rep == 1){
           
           //
          main.saisieInfo(1);
        }
       else if(rep == 2){
           //
           
           main.menuPrincipale();
       }
       else if(rep == 3){
           System.out.println("LISTE DES TOUS LES MEDIAS");
           System.out.println("--------------------------");
           for(int i = 0; i < listeMedia.size(); i++){
               System.out.println("---------------------------------------------------------------");
               System.out.println(listeMedia.get(i).getId() + " | " + listeMedia.get(i).getTitle()+" | "+ listeMedia.get(i).getCategorie()+" | "+listeMedia.get(i).getPublisher()+"| "+listeMedia.get(i).getDirector()+" | "+ listeMedia.get(i).getListeAuteur());
           }
       }
       else{
           System.out.println("Votre choix doit etre 1 ou 2");
       }
       }while(rep != 2); 
   }
   public static void updateMedia(MediaManagement mediaManagement, int id){
       
       MediaStore main = new MediaStore();
       listeMedia.set(id - 1, mediaManagement);
       int rep;
       do{
        System.out.println("Mise a jour effectue avec succes");
        System.out.println("1. Afficher tous les les medias");
        System.out.println("2. Revenir au Menu Principal");

        Scanner sc = new Scanner(System.in);
        rep = sc.nextInt();
        if(rep == 1){

            //
             System.out.println("LISTE DES TOUS LES MEDIAS");
            System.out.println("--------------------------");
            for(int i = 0; i < listeMedia.size(); i++){
                System.out.println("---------------------------------------------------------------");
                System.out.println(listeMedia.get(i).getId() + " | " + listeMedia.get(i).getTitle()+" | "+ listeMedia.get(i).getCategorie()+" | "+listeMedia.get(i).getPublisher()+"| "+listeMedia.get(i).getDirector()+" | "+ listeMedia.get(i).getListeAuteur());
            }
          
         }
        else if(rep == 2){
            //
           main.menuPrincipale();  
        }
        else{
            System.out.println("Votre choix doit etre 1 ou 2");
        }
       }while(rep != 2);
           
   }
}
