//Getting user input

#include <iostream>

using namespace std;

int main()
{
	int length;
	int width;

	cout << "Enter Lenght: ";
	cin >> length;

	cout << "Enter width: ";
	cin >> width;

	cout << "The Area is = ";
	cout << length * width;
	cout << "\n";			//The '\n' character is the new line character.

	return 0;
}
