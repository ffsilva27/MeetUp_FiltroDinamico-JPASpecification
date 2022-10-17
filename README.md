# :man_technologist: MeetUp - Filtros Dinâmicos Utilizando Kotlin + JPA Specification

O projeto fez parte de minha meta individual onde tive que apresentar, através de um projeto, a funcionalidade do JPA Specificantion em
uma aplicação Kotlin.

___________________________________________________________________________________________________________________________________________________________________

### :chains: Tecnologias
- Kotlin
- Spring (Data JPA | JPA Specification | MVC)
- Banco de dados H2
- Gradle

___________________________________________________________________________________________________________________________________________________________________

### :man_technologist: Implementações


#### :chart: Listar consumidores (Multiplos filtros/dinâmicamente)

##### Método HTTP para obter a listagem total dos consumidores (paginada)
 - (GET) `localhost:8080/customer?name={nameOfCustomer}`

Obs.: Para obtenção de informações de um consumidor em específico deve informar qual o critério de pesquisa, podendo ser multiplo, sendo eles:
 - name
 - lastName
 - carModel
 - carManufacturer
 - minAge
 - maxAge

##### Retorno da aplicação/JSON
```json
{
	{
	"totalElements": 1,
	"totalPages": 1,
	"customers": [
		{
			"id": 1,
			"firstName": "Filipe",
			"lastName": "Silva",
			"age": 35,
			"car": {
				"model": "X6",
				"licensePlate": "MMM-7788",
				"manufacturer": {
					"name": "BMW"
				}
			}
		}
	]
}
```
________________________________________________________________________________________________________________

### Spring
O projeto foi desenvolvido em Spring, portanto para execução realize os seguintes passos:

1. Clone o repositório;
2. Abra a pasta no IntelliJ ou IDE de sua preferência;
3. Execute a API;
4. A API será executada em `http://localhost:8080`
