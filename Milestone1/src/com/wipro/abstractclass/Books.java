package com.wipro.abstractclass;
class Books{
    public static void main(String args[])
    {
        Book b=new Book("One indian girl");
        Author a=new Author("Jyoshitha","jyoshitha@gmail.com",'f');
        b.setPrice();
        b.setQtyInStock();
        System.out.println("The name of the book is :"+b.getName());
        System.out.println("The price of the book is :"+b.getPrice());
        System.out.println("The stock is :"+b.getQtyInStock());
        b.getAuthor();
        
    }
}

class Author{
    public static String email;
   public static char gender;
    public static String name;
    Author(String Name,String Email,char Gender)
    {
        name=Name;
        email=Email;
        gender=Gender;
    }    
}
class Book{
    String name1,author;
    double price;
    int qtyInStock;
    Book(String n1)
    {
        name1=n1;
        
    }
    public void setPrice()
    {
        price=90;
    }
    public double getPrice()
    {
        return price;
    }
    public void setQtyInStock()
    {
        qtyInStock=55;
    }
    public int getQtyInStock()
    {
        return qtyInStock;
    }
    public String getName()
    {
        return name1;
    }
   public void getAuthor()
    {
       System.out.println("Name of the author is :"+Author.name);
       System.out.println("Author email id is :"+Author.email);
       System.out.println("Author gender is :"+Author.gender);
    }
    
}

