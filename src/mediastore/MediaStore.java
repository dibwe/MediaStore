/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediastore;

import controleur.Media;
import controleur.Order;
import java.util.Scanner;
import modele.MediaManagement;
import modele.OrderManagement;

/**
 *
 * @author Acer
 */
public class MediaStore {

    /**
     * @param args the command line arguments
     */
    public static Media media = new Media();
    public static Order order = new Order();
    
    public static void main(String[] args) {
        
        // TODO code application logic here
      
        
        menuPrincipale();
    }
    public static void saisieInfo(int option){
       
        if (1<= option && option <=10) {
            switch(option){
                case 1:
                    //
                    int cat = media.chooseCat();
                    
                    if(cat == 1){
                        System.out.println("Creation d'un nouvel objet Book");
                        System.out.println("-------------------------");

                        int id = media.nbrMedia() + 1;
                        
                        System.out.print("ID : " + id);
                        System.out.println();
                        
                        System.out.print("Entrez title : ");
                        Scanner titleSc = new Scanner(System.in);
                        String title = titleSc.nextLine();
                        System.out.println();
                        
                        System.out.print("Entrer price: ");
                        Scanner pricesc = new Scanner(System.in);
                         float price = pricesc.nextFloat();
                         System.out.println("");
                         
                         System.out.print("categorie: " + "Book");
                         String categorie = "Book";
                         System.out.println("");
                         
                         System.out.print("Enter publisher : ");
                         Scanner publishersc = new Scanner(System.in);
                         String publisher = publishersc.nextLine();
                         System.out.println("");
                         
                         System.out.print("Entrer liste auteur : ");
                         Scanner listeAuteursc = new Scanner(System.in);
                         String listeAuteur = listeAuteursc.nextLine();
                         System.out.println("");
                         
                         MediaManagement mediaManagement = new MediaManagement(id,title,price,categorie,publisher,listeAuteur);
                        
                        media.createMediat(mediaManagement);
                        
                    } else if(cat == 2){
                        System.out.println("Creation de l'objet DigitalVideoDisk");
                        System.out.println("--------------------------------------");
                        
                        System.out.print("Entrez l'ID : ");
                        Scanner idSc = new Scanner(System.in);
                        int id = idSc.nextInt();
                        System.out.println();
                        
                        System.out.print("Entrez title : ");
                        Scanner titleSc = new Scanner(System.in);
                        String title = titleSc.nextLine();
                        System.out.println();
                        
                        System.out.println("Entrer price: ");
                        Scanner pricesc = new Scanner(System.in);
                         float price = pricesc.nextFloat();
                         System.out.println("");
                         
                         System.out.println("Entrer categorie : ");
                         Scanner categoriesc = new Scanner(System.in);
                         String categorie = categoriesc.nextLine();
                         System.out.println("");
                         
                         System.out.println(" Entrer length : ");
                         Scanner lengthsc = new Scanner(System.in);
                         float length = lengthsc.nextFloat();
                         System.out.println("");
                         
                         System.out.println(" Entrer director : ");
                         Scanner directorsc = new Scanner(System.in);
                         String directore = directorsc.nextLine();
                         System.out.println("");
                         
                         MediaManagement mediaManagement = new MediaManagement(id ,title , price, categorie , length,directore );
                        
                        media.createMediat(mediaManagement);
                 }
                 else if(cat == 3){
                     System.out.println("Creation de l'objet CompactDisk");
                        
                        System.out.print("Entrez l'ID : ");
                        Scanner idSc = new Scanner(System.in);
                        int id = idSc.nextInt();
                        System.out.println();
                        
                        System.out.print("Entrez title : ");
                        Scanner titleSc = new Scanner(System.in);
                        String title = titleSc.nextLine();
                        System.out.println();
                        
                        System.out.println("Entrer price: ");
                        Scanner pricesc = new Scanner(System.in);
                         float price = pricesc.nextFloat();
                         System.out.println("");
                         
                         System.out.println("Entrer categorie : ");
                         Scanner categoriesc = new Scanner(System.in);
                         String categorie = categoriesc.nextLine();
                         System.out.println("");
                     
                         System.out.print("Entrez publisher : ");
                        Scanner publishersc = new Scanner(System.in);
                        String publisher = publishersc.nextLine();
                        System.out.println();
                        
                        System.out.print("Entrez listeAuteur : ");
                        Scanner listeAuteursc = new Scanner(System.in);
                        String listeAuteur = titleSc.nextLine();
                        System.out.println();
                      
                        MediaManagement mediaManagement = new MediaManagement(id ,title , price, categorie ,publisher,listeAuteur);
                        
                        media.createMediat(mediaManagement);
                         
                }
                    break;
                case 2:
                    //
                    System.out.println("Mise a jour d'un media"); 
                    System.out.println("-----------------------");
                    
                    System.out.println("Veuillez enttrez l'ID de l'objet");
                    Scanner sc = new Scanner(System.in);
                    
                    MediaManagement objet;
                    do{
                    int id = sc.nextInt();
                    
                    objet = media.getMedia(id);
                    
                    
                        if(objet.getId() >= 1){
                            
                            
                            System.out.println("ID :" + objet.getId());
                            
                            int idObjet = objet.getId();
                            
                            System.out.println("Title :" + objet.getTitle());
                            System.out.print("Enter new title : ");
                            Scanner sctitle =  new Scanner(System.in);
                            String newTitle = sctitle.nextLine();
                            System.out.println("");
            
                            System.out.println("Price :" + objet.getPrice());
                            System.out.print("Enter new price : ");
                            Scanner scprice =  new Scanner(System.in);
                            float newPrice = scprice.nextFloat();
                            System.out.println("");
        
                            System.out.println("Categorie :" + objet.getCategorie());
                            System.out.print("Enter new category : ");
                            Scanner sccat=  new Scanner(System.in);
                            String newCat = scprice.nextLine();
                            System.out.println("");
                            
                            if(objet.getCategorie() == "Book"){
                                
                                System.out.println("Liste Auteurs :" + objet.getListeAuteur());
                                System.out.print("Enter new List Auteur : ");
                                Scanner scauteur =  new Scanner(System.in);
                                String newListAuteur = scauteur.nextLine();
                                System.out.println("");
        
                                System.out.println("Publisher :" + objet.getPublisher());
                                System.out.print("Enter new Publisher : ");
                                Scanner scpublisher =  new Scanner(System.in);
                                String newPublisher = scpublisher.nextLine();
                                System.out.println("");
        
                                MediaManagement mediaManagement = new MediaManagement(id, newTitle, newPrice, newCat, newListAuteur,newPublisher);
                               
                                media.updateMedia(mediaManagement, id);
                            }
                        }
                        else{
                            System.out.println("Aucun media retrouve !");
                            System.out.println("Veuillez entrez un ID correcte");
                        }
                    }while(objet.getId() < 0);
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    System.out.println("Create new order");
                    
                    int id = order.nbrOrder() + 1;
                    
                    System.out.println("ID : " + id);
                    
                    System.out.println("Entrer la date : ");
                    Scanner scdate = new Scanner(System.in);
                    String date = scdate.nextLine();
                    
                    
                    
                    OrderManagement orderObject = new OrderManagement();
                    
                    order.createOrder(orderObject);
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    
                    break;
                    
                case 10:
                    System.exit(0);
                    break;
            }
        }
        else{
            System.out.println(" veuillez entrer un nombre entre 1 et 10 ");
        }
    }
    public static void menuPrincipale(){
        System.out.println("1. Create new media");
        System.out.println("2. Update an existing media object by ID");
        System.out.println("3. Delete a media object by ID");
        System.out.println("4. Find media object by name");
        System.out.println("5. Find a media object by ID");
        System.out.println("6. Create a new order");
        System.out.println("7. Update an order by ID");
        System.out.println("8. List all orders by date");
        System.out.println("9. Find order by ID");
        System.out.println("10. Exit the program");
        System.out.println("Please choose a number from 1 to 10.");
        
        Scanner choix = new Scanner(System.in);
        int option = choix.nextInt();
        
        //Ceci concerne la creation d'un nouvel objet !
        saisieInfo(option);
        
        //Ceci concerne la mise a jour d'un objet existant !
        
    }
}
