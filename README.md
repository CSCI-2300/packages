# Manually compiling code with packages is hard
This example demonstrates the challenges that come up when you compile code that is organized in packages manually (with javac) 
The src directory contains two sub-directories: first and second. Code in <code>second</code> depends on the code in <code>firsr</code>. Therefore, we must compile code in <code>first</code> first. We also want to place compiled code into its own directory: <code>bin</code>

```
cd src/first
javac -d ../../bin *.java
```

Now, navigate to the <code>bin</code>directory. You'll see that it contains a <code>first</code> sub-directory, that got created as a result of compilation. This is because the code we were compiling is part of a package called first.

Now, in order to compile the code in the <code>second</code> directory, we need to ensure that our CLASSPATH contains the <code>bin/first</code> directory. 

From the root of our repository clone, we can update CLASSPATH (in bash shell) as follows on Linux or Mac: 
```
export CLASSPATH=$CLASSPATH:bin/first
```
or on Windows as:
```
export CLASSPATH=$CLASSPATH;bin/first
```

Now we can compile the code in the <code>second</code> subdirectory:
```
cd src/second
javac -d ../../bin *.java
```

