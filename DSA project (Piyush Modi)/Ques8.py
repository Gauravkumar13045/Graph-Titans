my_list = [1, 3, 4, 2, 2]
seen_list = []
answer = -1

for number in my_list:
    found = False
    for value in seen_list:
        if number == value:
            found = True
    if found:
        answer = number
        break
    else:
        seen_list.append(number)

print(answer)
