#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() 
{

    int n;
    scanf("%d", &n);
  	// Complete the code to print the pattern.
    
    for (int i = 0; i < 2*n-1; i++) {
        for (int j = 0; j < 2*n-1; j++) {

            int top = i;
            int left = j;
            int right = 2*n-2-j;
            int bottom = 2*n-2-i;

            int min = top;

            if (left < min)
                min = left;
            if (right < min)
                min = right;
            if (bottom < min)
                min = bottom;

            printf("%d ", n - min);
        }
        printf("\n");
    }

    
    return 0;
}
