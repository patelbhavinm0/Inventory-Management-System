# Inventor Management System
 Week 2 Assignment 1

# W2Assignment1
Inventory Management System

SpringBoot project for Inventory Management


Use Spring Initializr (start.spring.io) to generate a new SpringBoot project.
https://start.spring.io/

Select dependencies: 
Spring Web, Spring Data JPA, MySQL Driver, Lombok

Download and unzip the generated project.

Configure the application.properties
https://spring.io/guides/gs/accessing-data-mysql



1) Get ALL Items

localhost:8080/item/all

Response Body: [
    {
        "id": 52,
        "name": "shop",
        "price": 10.99,
        "description": "detergent product, ",
        "quantity": 20
    },
    {
        "id": 53,
        "name": "Dish",
        "price": 1.49,
        "description": "Glass Disah available at discounted price ",
        "quantity": 400
    },	
    {
     "id": 54,
    "name": "Drawer",
    "price": 5.99,
    "description": "furniture products",
    "quantity": 44
     }
]


2) Add
   
localhost:8080/item/add

Request Body:
{   
        "name": "Drawer",
        "price": 5.99,
        "description": "furniture products",
        "quantity": 44
}

Response Body:
{
    "id": 54,
    "name": "Drawer",
    "price": 5.99,
    "description": "furniture products",
    "quantity": 44
}

3) Get Item by Id

localhost:8080/item/54

Response Body
{
    "id": 54,
    "name": "Drawer",
    "price": 5.99,
    "description": "furniture products",
    "quantity": 44
}

4) Delete

localhost:8080/item/delete/53
Request Body{
    "id": 53,
    "name": "Dish",
    "price": 1.49,
    "description": "Glass Disah available at discounted price ",
    "quantity": 400
}

5) Update

localhost:8080/item/update

Request Body
{
     "id": 52,
        "name": "shop",
        "price": 9.99,
        "description": "detergent product, ",
        "quantity": 2000
}

Response Body
{
    "id": 52,
    "name": "shop",
    "price": 9.99,
    "description": "detergent product, ",
    "quantity": 2000
}
