class Solution {
public:
    void sortColors(vector<int>& v) 
    {
        sort(v.begin() , v.end());
        for(auto i :v)
        {
            cout<<i<<"," ;
        }
        
    }
};