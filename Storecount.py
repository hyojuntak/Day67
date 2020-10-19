def storecount():

    store_count = int(input())

    value_count = list(map(int, input().split()))

    even = 0; odd = 0


    for i in range(store_count):
        if(i%2==0):
            even+=value_count[i]
        else:
            odd+=value_count[i]


    if(even>odd) : print(even)
    else : print(odd)



storecount()
