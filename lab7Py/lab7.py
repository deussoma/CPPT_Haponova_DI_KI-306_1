import sys

size = int(input("Введіть розмір квадратної матриці: "))
filler = input("Введіть символ-заповнювач: ")

if len(filler) == 0:
    print("Не введено символ-заповнювач")
    sys.exit(1)
elif len(filler) > 1:
    print("Забагато символів-заповнювачів")
    sys.exit(1)

lst = []

endOfArrPointer = 0
center = size // 2

for i in range(center):
    endOfArrPointer += 1
    lst.append([' '] * endOfArrPointer)

for i in range(center, size):
    endOfArrPointer += 1
    lst.append([' '] * endOfArrPointer)
    
    for j in range(size - i - 1, i + 1):
        lst[i][j] = filler

for row in lst:
    print(''.join(row))
