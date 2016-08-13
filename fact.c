#include <stdio.h>

int main()
{
  int f,fact=1,i;
  scanf("%d",&f);
  for(i=1;i<=f;i++)
  {
      fact=fact*i;
  }
  printf("%d",fact);
    return 0;
}
