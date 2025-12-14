my_list = [1, 12, -5, -6, 50, 3]
window_size = 4

max_sum = None

for start_index in range(len(my_list) - window_size + 1):
    current_sum = 0
    for index in range(start_index, start_index + window_size):
        current_sum = current_sum + my_list[index]
    if max_sum is None or current_sum > max_sum:
        max_sum = current_sum

average = max_sum / window_size
print(average)
