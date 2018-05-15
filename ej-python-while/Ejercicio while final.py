cont=1
lim= 3.0
cadena = "%s\t%s\t%s\t%s\t%s\n" % ("Nombre", "Nota1", "Nota2","Nota3","Promedio")
while cont<=lim:
      nombre= str (input ("Ingrese el nombre del estudiante:\n"))
      print ("Ingrese las calificaciones del estudiante")
      n1=float(input("Ingrese la primera calificación:\n "))
      n2=float(input("Ingrese la segunda calificación:\n "))
      n3=float(input("Ingrese la tercera calificación:\n "))
      suma=n1+n2+n3
      prom=suma/lim
      cadena = "%s%s\t%.f\t%.f\t%.f\t%.2f\n" % (cadena,nombre,int(n1),int(n2),int(n3),float(prom)) 
      cont=cont+1
print (cadena)
