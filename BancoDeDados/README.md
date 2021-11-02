<img alt="logo banco pan e gama academy" src="https://github.com/joaomhernandes/PAN-Academy/blob/main/Assets/gama-pan-academy-logo.svg" style="width: 300%, height: auto, margin-left: auto, margin-left: auto" />

# PAN Academy: Repositório de atividade de banco de dados

## Atividade MongoDB

Deve-se criar um banco de dados novo (database) e uma coleção com um nome pertinente, de acordo com os dados e tema escolhidos. Os seguintes comandos 
devem ser feitos e entregues:

- Inserção de documentos
- Atualização de documentos
- Exclusão de documentos
- Consulta com projeção
- Consulta utilizando combinação entre os seletores
- Consulta paginada e ordenada (utilizar ignorar , limitar e classificar )

## Resolução

 - Foi utilizado o comando "use PetCare" para separar minha data base da que vinhamos utilizando

 - Foi utilizado o comando "db.createCollection('Petshop')" - Para criar uma nova Collection;

 - Foi realizada a incerção de dados via Robo3T, porém poderia ser utilizado o comando "db.collection.insertOne()" inserindo os dados via JSON;

 - Foi realizada a atualização de dados com o comando entre aspas abaixo:
"db.getCollection('Petshop').update(
    // query 
    {
        "pet.nome" : "Flecha"
    },
    
    // update 
    {$set:
        {
            "valor": 68
            }
        
    },
    
    // options 
    {
        "multi" : false,  // update only one document 
        "upsert" : false  // insert a new document, if no existing document match the query 
 }
);"

 - Foi realizada a exclusão de documento com o seguinte comando "db.Petshop.remove({"pet.nome" : "Caramelo"})";

 - Foi realizada a consulta com projeção com o comando "db.getCollection('Petshop').find({},{"dataHora" : 1, "_id" : 0});

 - Foi realizada a consulta utilizando combinação de seletores com o seguinte comando "db.getCollection('Petshop').find({"pet.tutor": /.*João.*/, 
"pet.nome": /.*Flecha.*/})";

 - Foi realizada a consulta paginada e ordenada (utilizar ignorar , limitar e classificar ) com o comando "db.getCollection('Petshop').find({"pet.tutor": /.*João.*/, "pet.nome": /.*Flecha.*/}).limit(2)".

##Database resultante

[PetshopDB](https://github.com/joaomhernandes/PAN-Academy/tree/main/https://github.com/joaomhernandes/PAN-Academy/tree/main/BancoDeDados/PetshopDB.js)



