#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
int _stdcall WinMain(HINSTANCE hinstance, HINSTANCE hprevinstance, LPSTR ipsz, int cmdshow)
{
  char str[10];
  int num, i, f = 1;
  num = atoi(ipsz);
  for (i = 1; i <= num; i++)
  {
    f = f * i;
  }
  sprintf(str, "Factorial of %d : %d", num, f);
  MessageBox(0, str, "Title", MB_OK);
  return 0;
}