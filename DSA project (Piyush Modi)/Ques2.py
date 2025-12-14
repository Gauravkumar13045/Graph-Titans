my_list = [1, 7, 3, 6, 5, 6]

total_sum = 0
for number in my_list:
    total_sum = total_sum + number

left_sum = 0
pivot_index = -1

for index in range(len(my_list)):
    right_sum = total_sum - left_sum - my_list[index]
    if left_sum == right_sum:
        pivot_index = index
        break
    left_sum = left_sum + my_list[index]

print(pivot_index)
