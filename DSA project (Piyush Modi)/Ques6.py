my_list = [2, 0, 2, 1, 1, 0]

count_zero = 0
count_one = 0
count_two = 0

for number in my_list:
    if number == 0:
        count_zero = count_zero + 1
    elif number == 1:
        count_one = count_one + 1
    else:
        count_two = count_two + 1

sorted_list = []

for i in range(count_zero):
    sorted_list.append(0)
for i in range(count_one):
    sorted_list.append(1)
for i in range(count_two):
    sorted_list.append(2)

print(sorted_list)
