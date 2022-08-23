#include <stdio.h>
#include <wchar.h>
#include <locale.h>
 
int main() 
{   
    setlocale(LC_ALL,""); // ?로 출력되는 현상 방지
  
    wchar_t arr[] = L"강한친구 대한육군"; // 한글 배열 선언
  
    wprintf(L"%S",arr); // 대문자 S임에 유의
    wprintf(L"%S\n",arr); // 대문자 S임에 유의
}