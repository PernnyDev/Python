# 15 Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno. (*) Dicas: (*) Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro; (*) Triângulo Equilátero: três lados iguais; (*) Triângulo Isósceles: quaisquer dois lados iguais; (*) Triângulo Escaleno: três lados diferentes;

lado1 = float(input("Digite o primeiro lado: "))
lado2 = float(input("Digite o segundo lado: "))
lado3 = float(input("Digite o terceiro lado: "))

while True:
    if lado1 + lado2 > lado3:
        if lado1 + lado3 > lado2:
            if lado2 + lado3 > lado1:
                if lado1 == lado2 and lado2 == lado3:
                    print("Triângulo Equilátero")
                elif lado1 == lado2 or lado2 == lado3 or lado1 == lado3:
                    print("Triângulo Isósceles")
                else:
                    print("Triângulo Escaleno")
                break
            else:
                  print("Não é um triângulo digite novamente")          
                  lado1 = float(input("Digite o primeiro lado: "))
                  lado2 = float(input("Digite o segundo lado: "))
                  lado3 = float(input("Digite o terceiro lado: "))
