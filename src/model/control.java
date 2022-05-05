package model;

import java.util.Date;

public class control {

    private NodePerson  nodPerson;
    private alvTree tree;

    public void CreateNodePerson(String name, String lastname, char gender,
                                 Date dateOfBirthaN, int heightPerson, String nacionality, String Photography){

        nodPerson= new NodePerson( name,  lastname,  gender,  dateOfBirthaN, heightPerson,  nacionality,  Photography);

    }
    //aqui vemos con que kay vamos a trabajar para la seleccion del arbol.
    public String alvAddTree_alv(NodePerson  nodPerson,int typeTree){
        Node N=new Node (nodPerson,nodPerson.getName());
        Node N1=new Node (nodPerson,nodPerson.getCodigo());
        Node N2=new Node(nodPerson,nodPerson.getNacionality());

        alvTree addtreeNama=new alvTree(N);
        alvTree addtreeCodigo=new alvTree(N1);
        alvTree addtreeNacion=new alvTree(N2);


        return  "add successful";
    }



}
