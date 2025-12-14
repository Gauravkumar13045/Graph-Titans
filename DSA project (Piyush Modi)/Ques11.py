list_one = [1, 5, 10]
list_two = [3, 5, 10]
list_three = [5, 10, 20]

index_one = 0
index_two = 0
index_three = 0

common_list = []

while index_one < len(list_one) and index_two < len(list_two) and index_three < len(list_three):
    if list_one[index_one] == list_two[index_two] and list_two[index_two] == list_three[index_three]:
        common_list.append(list_one[index_one])
        index_one = index_one + 1
        index_two = index_two + 1
        index_three = index_three + 1
    elif list_one[index_one] < list_two[index_two]:
        index_one = index_one + 1
    elif list_two[index_two] < list_three[index_three]:
        index_two = index_two + 1
    else:
        index_three = index_three + 1

print(common_list)
