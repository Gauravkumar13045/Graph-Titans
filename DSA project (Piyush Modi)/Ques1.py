my_list = [1, 4, 45, 6, 10]
target_value = 16

answer = False

for first_index in range(len(my_list)):
    for second_index in range(first_index + 1, len(my_list)):
        current_sum = my_list[first_index] + my_list[second_index]
        if current_sum == target_value:
            answer = True

print(answer)
