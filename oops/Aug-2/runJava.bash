#!/bin/bash

# Get the class name by removing the file extension from the first argument
className=$(echo $1 | cut -d '.' -f 1)

# Compile the Java file
echo "javac $1"
javac $1

# Check if the compilation was successful
if [ $? -eq 0 ]; then
	# Check if the second argument is provided
	if [ -n "$2" ]; then
		# Run the Java class with the second argument as stdin
		echo "java $className < $2"
		java $className <"$2"
	else
		# Run the Java class without any stdin redirection
		echo "java $className"
		java $className
	fi
else
	echo "Compilation failed. Exiting."
	exit 1
fi
