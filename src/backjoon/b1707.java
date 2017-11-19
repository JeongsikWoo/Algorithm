package backjoon;

/*
 #include <iostream>
#include <vector>
#include <queue>

#define MAX_N 20001

using namespace std;

vector<int> Graph[MAX_N];
int color[MAX_N] = {0,};

bool BFS(int start)
{
    queue<int> q;
    
    q.push(start);
    color[start] = 1;
    
    while (!q.empty())
    {
        int current = q.front();
        q.pop();
        
        for (int i = 0; i < Graph[current].size(); i++)
        {
            int next = Graph[current][i];
            
            if (color[next] == 0)
            {
                color[next] = -color[current];
                q.push(next);
            }
            else
            {
                if (color[next] == color[current])
                    return false;
            }
        }
    }
    
    return true;
}

int main()
{
    int T, V, E;
    cin >> T;
    
    while (T--)
    {
        int x, y;
        bool result = true;
        
        cin >> V >> E;
        
        for (int i = 1; i <= V; i++){
            Graph[i].clear();
            color[i] = 0;
        }
        
        for (int i = 0; i < E; i++)
        {
            cin >> x >> y;
            Graph[x].push_back(y);
            Graph[y].push_back(x);
        }
        
        for (int i = 1; i <= V; i++)
        {
            if (color[i] == 0)
                result &= BFS(i);
        }
        
        if (result == true)
            cout << "YES" << endl;
        else
            cout << "NO" << endl;
    }
    return 0;
} 
 */