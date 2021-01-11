# jsr-validations


#Sample Request

`curl --location --request POST 'localhost:8080/user' \
--header 'Content-Type: application/json' \
--data-raw '{
    "email":"amrit@gmail.com",
    "firstName":"amrit",
    "lastName":"singh",
    "password":"password",
    "dob":"1994-10-10"
}'`