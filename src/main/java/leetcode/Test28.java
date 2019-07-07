class Solution {
    public int strStr(String haystack, String needle) {
        int[][] dfa;
        int M = needle.length();
        int R = 256;
        dfa = new int[R][M];
        int N = haystack.length();
        if( M==0){
            return 0;
        }
        dfa[needle.charAt(0)][0]=1;
        for (int X=0,j=1;j<M;j++){
            for (int c=0;c<R;c++){
                dfa[c][j]=dfa[c][X];
            }
            dfa[needle.charAt(j)][j]=j+1;
            X=dfa[needle.charAt(j)][X];
        }

        int i,j;
        for (i=0,j=0;i<N && j<M;i++){
            j=dfa[haystack.charAt(i)][j];
        }
        if (j==M) return i-M;
        else return -1;
        
    }
}
