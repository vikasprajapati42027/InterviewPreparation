# Java String Manipulation Project

This project is designed to demonstrate various string manipulation techniques in Java, ranging from basic to advanced levels. It is structured to provide a comprehensive guide for those preparing for programming interviews or anyone interested in improving their understanding of string manipulation in Java.

## Project Structure

The project is organized into several packages within the `src/main/java` directory, each focusing on a different level of string manipulation complexity:

- `basic`: Contains examples of basic string operations such as creation, concatenation, and comparison.
- `intermediate`: Demonstrates intermediate operations like checking if a string contains a certain sequence, extracting substrings, and replacing characters.
- `advanced`: Covers advanced operations including checking if a string starts or ends with a certain prefix/suffix, finding the index of a character or substring, and converting a string to a character array.
- `utils`: Provides utility methods for string manipulation, such as checking if a string is null or empty, reversing a string, and counting occurrences of a character.

Additionally, the `src/test/java` directory is intended for unit tests to ensure the reliability of the utility methods.

The `pom.xml` file is included for managing dependencies and project configuration, assuming the use of Maven as a build tool.

## Usage

To use the examples provided in this project, navigate to the respective class file for the level of string manipulation you're interested in. Each class contains a `main` method that demonstrates the usage of various string operations. You can run these classes individually to see the output of each operation.

### Basic String Operations

In `StringBasics.java`, you'll find examples of:

- Creating and printing strings
- Concatenating strings
- Finding the length of a string
- Converting strings to uppercase and lowercase
- Comparing strings for equality

### Intermediate String Operations

In `StringIntermediate.java`, the focus is on:

- Checking if a string contains a certain sequence
- Extracting substrings
- Replacing characters
- Splitting a string into an array of substrings
- Trimming leading and trailing spaces

### Advanced String Operations

`StringAdvanced.java` explores more complex operations like:

- Checking if a string starts or ends with a certain prefix/suffix
- Finding the index of a character or substring
- Converting a string to a character array
- Using `String.format` for string formatting

### Utility Methods

`StringUtils.java` provides utility methods that can be used across various parts of a project for:

- Checking if a string is null or empty
- Reversing a string
- Counting the number of occurrences of a character

## Contributing

Contributions to this project are welcome. Please feel free to fork the repository, make your changes, and submit a pull request.

## License

This project is open-sourced under the MIT License. See the LICENSE file for more details.
