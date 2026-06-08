# Java Text Analyzer

A simple command-line Java application for analyzing text input.

## Features

- Word count
- Sentence count
- Letter count
- Character analysis (with and without spaces)
- Word frequency analysis

## Technologies

- Java
- Object-Oriented Programming (OOP)
- BreakIterator (sentence detection)

## Project Structure

- TextAnalyzer.java → Main logic + CLI
- TextStatistics.java → Data model for results

## Usage

Run the program and pass text as arguments:

java TextAnalyzer "Hello world. This is a test."

Or run without arguments to use default text.

## Example Output

TextStatistics {
  words=5,
  sentences=2,
  letters=21,
  chars (no spaces)=26,
  chars (with spaces)=31
}

## German Krüger

Self-developed project for learning Java and software fundamentals.
