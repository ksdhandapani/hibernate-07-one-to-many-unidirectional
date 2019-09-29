# hibernate-07-one-to-many-unidirectional
One To Many unidirectional example
In this example One to Many mapping is mapped between Employee and Address entities
- Database tables screenshots are attached inside src/main/resources/images/ folder
- Postman Request and Response
- **Method :** POST
- **URL :** http://localhost:8080/hibernate-07-one-to-many-unidirectional/api/employee
- **Request Body**
```
{
	"employeeId": 0,
	"employeeName":"Chandru R",
	"department":"Development",
	"gender": "Male",
	"addressList": [{
		"streetName":"Sankara Madam Street",
		"city":"Emakandanur",
		"state": "Tamil Nadu",
		"country": "India"
	},
	{
		"streetName":"Sanjeevi Street",
		"city":"Chennai",
		"state": "Tamil Nadu",
		"country": "India"
		
	}]
}
```
- **Response Body**
```
{
    "data": {
        "employeeId": 1,
        "employeeName": "Chandru R",
        "gender": "Male",
        "department": "Development",
        "addressList": [
            {
                "addressId": 1,
                "streetName": "Sankara Madam Street",
                "city": "Emakandanur",
                "state": "Tamil Nadu",
                "country": "India"
            },
            {
                "addressId": 2,
                "streetName": "Sanjeevi Street",
                "city": "Chennai",
                "state": "Tamil Nadu",
                "country": "India"
            }
        ]
    },
    "message": "Employee saved successfully",
    "exception": false,
    "success": true
}
```
