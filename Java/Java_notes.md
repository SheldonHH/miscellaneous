#####1. out.printf() vs print()
The printf() family of functions uses % character as a placeholder. When a % is encountered, printf reads the characters following the % to determine what to do:

%s - Take the next argument and print it as a string
%d - Take the next argument and print it as an int
```
int a = 10;
int b = 20;
// Tedious string concatenation.
System.out.println("a: " + a + " b: " + b);

// Output using string formatting.
System.out.printf("a: %d b: %d\n", a, b);
```

#####2. Buffer() vs print()





#####3. next() vs nextLine()
nextLine() automatically moves the scanner down after returning the current line.
next() will return the content before the space
