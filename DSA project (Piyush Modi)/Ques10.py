my_list = [1, 5, 3, 4, 3, 5, 6]
seen_list = []
answer = -1

for number in my_list:
    already_seen = False
    for value in seen_list:
        if number == value:
            already_seen = True
    if already_seen:
        answer = number
        break
    else:
        seen_list.append(number)

print(answer)
