n=8

def Safe(board,x,y):
    if(x>=0 and y>=0 and x<n and y<n and board[x][y]==-1):
        return True
    return False

def PrintBoard(board):
    for i in range(0,n):
        for j in range(0,n):
            print(board[i][j],end=" ")

def solveK(n):

    board=[[-1 for i in range(n)]for i in range(n)]

    mov_x=[2,1,-2,-1,2,1,-1,-2]
    mov_y=[1,2,1,2,-1,-2,-2,-1]

    board[0][0]=0

    pos=1

    if(not solveKT(board,0,0,mov_x,mov_y,pos)):
        print("No Solution available")
    else:
        PrintBoard(board)
    print()

def solveKT(board,cur_x,cur_y,mov_x,mov_y,pos):

    if(pos==n**2):
        return True

    for i in range(8):
        nx=cur_x+mov_x[i]
        ny=cur_y+mov_y[i]

        if(Safe(board,nx,ny)):
            board[nx][ny]=pos
            if(solveKT(board,nx,ny,mov_x,mov_y,pos+1)):
                print("checking")
                return True

            board[nx][ny] = -1

    return False

solveK(8)
