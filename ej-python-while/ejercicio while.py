limite = True
cadena = "%s\t%s\t%s\n" % ("Nombres", "Apellidos", "Edad")
while limite:
    nombre = input("Ingrese su nombre: \n")
    apellido = input("Ingrese su apellido: \n")
    edad = input("Ingrese su edad: \n")
    cadena = "%s%s\t%s\t\t%d\n" % (cadena, nombre, apellido, int(edad))
    seguir =input("desea ingresar mas Datos:\n")
    if seguir=="si":
    	limite= True
    else :
    	limite= False 
print(cadena)
