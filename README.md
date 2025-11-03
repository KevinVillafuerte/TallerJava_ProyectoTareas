Evidencias de Pruebas:

Se crea un usuario con contraseña ya encriptada desde Postman
<img width="940" height="615" alt="image" src="https://github.com/user-attachments/assets/7239a91d-a813-4a06-9338-3455d3d3d5c1" />

Se valida que no existan usuarios repetidos Postman
<img width="940" height="577" alt="image" src="https://github.com/user-attachments/assets/495a9a78-5920-439f-9b2a-0d475ff87911" />

Iniciamos sesión con un usuario para ver que se genera el Token Postman
<img width="941" height="491" alt="image" src="https://github.com/user-attachments/assets/1ada11bb-2445-4949-94f8-654b766a28eb" />

Verificamos el Token:
<img width="941" height="459" alt="image" src="https://github.com/user-attachments/assets/ab260777-a305-467b-9799-ab23bb9f7c20" />

Se intenta crear una tarea con un usuario NO admin
<img width="940" height="473" alt="image" src="https://github.com/user-attachments/assets/4a56024c-d223-4759-99fe-1d7f343103ac" />

Verificamos la autenticidad con Swagger y vemos que se genere el Token
<img width="940" height="456" alt="image" src="https://github.com/user-attachments/assets/78a3aa02-ad3c-4906-bb09-c5b3c64c74da" />

Y nos autorizamos, debe de salir el candado abierto
<img width="941" height="158" alt="image" src="https://github.com/user-attachments/assets/e7fd8af1-3ab8-4092-b784-5aed8a20892b" />

Después debe salir así
<img width="941" height="129" alt="image" src="https://github.com/user-attachments/assets/fb87bed8-320d-4609-8568-5ff78cff75a0" />

Se crea una Tarea
<img width="940" height="350" alt="image" src="https://github.com/user-attachments/assets/7a0ff322-9a94-47d6-b6c5-7684bdf39998" />

Vemos que se creó correctamente
<img width="940" height="452" alt="image" src="https://github.com/user-attachments/assets/9b1f1c70-47d0-45fc-834f-35a3ce9e391b" />

Listamos las Tareas 
<img width="940" height="463" alt="image" src="https://github.com/user-attachments/assets/4548b4b7-7c85-43ed-8ff7-d23457c1e427" />

Buscamos Tarea Por ID
<img width="940" height="467" alt="image" src="https://github.com/user-attachments/assets/9a255cbe-a0bf-4b23-98cd-df634d7c7e68" />

Verificamos que no se creen Tareas con nombre vacío
<img width="940" height="442" alt="image" src="https://github.com/user-attachments/assets/48ac86d6-c214-4b3c-a9ec-08b745c118b1" />

Vemos que se eliminen por ID las tareas
<img width="940" height="463" alt="image" src="https://github.com/user-attachments/assets/2440dc06-a37b-4859-b558-438f20629933" />

Actualizamos la Tarea con el número 3 ya que el nombre es erróneo
<img width="940" height="402" alt="image" src="https://github.com/user-attachments/assets/7945588b-95d2-497f-9965-9f8b5030f42f" />

Volvemos a Listar y verificamos que se haya actualizado la tarea 3
<img width="940" height="400" alt="image" src="https://github.com/user-attachments/assets/c612394a-15d8-464f-a2b4-cf6f2ff966ef" />
