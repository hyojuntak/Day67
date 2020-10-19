def store_count():

    N = int(input())
    K = list(map(int, input().split()))

    sum = 0
    max = 0

    for i in range(N):
        for j in range(2,N):
            if (j-i>1):
                sum=K[j]+K[i]
                if(max<sum):
                    max=sum
            else:
                pass
        

    #return max
    print(max)





for i in range(3):
  store_count()
