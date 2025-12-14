my_list = [1, 2, 2, 4, 5]

n = len(my_list)

expected_sum = n * (n + 1) // 2

actual_sum = 0
for number in my_list:
    actual_sum = actual_sum + number

answer = expected_sum - actual_sum
print(answer)