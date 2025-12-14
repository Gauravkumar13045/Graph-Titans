my_list = [-1, 2, -3, 4, -5]
new_list = []

for number in my_list:
    if number < 0:
        new_list.append(number)

for number in my_list:
    if number >= 0:
        new_list.append(number)

print(new_list)
