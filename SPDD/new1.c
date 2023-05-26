#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
int _stdcall WinMain(HINSTANCE hinstance, HINSTANCE hprevinstance, LPSTR ipsz, int cmdshow)
{
  char str[10];
  sprintf(str, "HINSTANCE value: %d", hinstance);
  MessageBox(0, str, "Smit Khobragade", MB_ABORTRETRYIGNORE);
  return 0;
}