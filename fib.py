def fib(numAlong):     #iterative fib function
    if numAlong == 1:  #if numAlong is one the standard algorithm won't work correctly - this fixes this
        return 0

    nums = [0,1]

    for i in range(numAlong-2):    #-2 to allow for 0,1 already in nums array
        tmp = nums[1]
        nums[1] = nums[0]+nums[1]
        nums[0] = tmp
    
    return nums[1]

#fib function using recursion
def fibRec(numAlong,nums = [0,1],count = 1):    #defaults set for first call to initialise all in their starting values
    if numAlong == count:
        return nums[0]

    tmp = nums[1]
    nums[1] = nums[0] + nums[1]
    nums[0] = tmp

    count += 1

    return fibRec(numAlong,nums,count)

numAlong = int(input("How far along in the fibonacci sequence do you want printing? "))

print(fib(numAlong))
print(fibRec(numAlong))