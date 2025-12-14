my_list = [1, 1, 2, 2, 3]
new_list = []

for number in my_list:
    found = False
    for value in new_list:
        if number == value:
            found = True
    if found == False:
        new_list.append(number)

print(new_list)
