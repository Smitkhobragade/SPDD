#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
int _stdcall WinMain(HINSTANCE hinstance, HINSTANCE hprevinstance, LPSTR ipsz, int cmdshow)
{
  char str[50];
  sprintf(str, "%s", ipsz);
  int count = 0, i = 0;
  while (str[i] != '\0')
  {
    if (str[i] == ' ')
    {
      count++;
    }
    i++;
  }
  sprintf(str, "%d", count + 1);
  MessageBox(0, str, "Number of words (Smit Khobragade)", MB_OK);
  return 0;
}