#RAT-MAZE Problem:BackTracking
n=4
#Checking if the particular slot is 0/1
def Safe(x,y,mat):
    if(x>=0 and y>=0 and x<n and y<n and mat[x][y]==1):
        return True
    return False

def PrintMat(res):
    for i in range(0,4):
        for j in range(0,4):
            print(res[i][j],end=" ")
        print("\n")

def SolveR(mat):
    res=[[0 for i in range(4)]for i in range(4)]
    if(SolveMaze(0,0,mat,res)):
        PrintMat(res)

    else:
        print("no solution")
    return True

def SolveMaze(x,y,mat,res):

    if(x==n-1 and y==n-1 and mat[x][y]==1):
        res[x][y]=1
        return True

    if(Safe(x,y,mat)):
        res[x][y]=1;
        if(SolveMaze(x+1,y,mat,res)):
            return True

        if(SolveMaze(x,y+1,mat,res)):
            return True

        res[x][y]=0
        return False

if __name__=="__main__":
    maze = [ [1, 0, 0, 0],
             [1, 1, 0, 1],
             [0, 1, 0, 0],
             [1, 1, 1, 1] ]

    SolveR(maze)
