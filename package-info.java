/**
 * This package contains three classes that demonstrate inheritance,
 * composition, and code reuse. The OrderedSeries class creates a template
 * for creating different types of data structures that sort added data.
 * The OrderedLL class does so with a LinkedList structure. The Main class
 * demonstrates how the OrderedLL class can be used. Use Oracle guidelines.
 * 
 * Software reuse examples:
 * 1) List interface in OrderedSeries class
 * 2) LinkedList class in OrderedLL class
 * 3) add() method in OrderedSeries class -> addSortedElement method
 * 4) sort() method in OrderedSeries class -> addSortedElement method
 * 5) OrderedLL inheriting methods and instance variable from OrderedSeries
 * 6) OrderedSeries designed to easily add new List implementations like Stack
 * 7) Other built in methods such as the Scanner and getClass()
 * 
 * Command information:
 * To compile:          javac -d orderedSeries  *.java
 * To run:              java -cp orderedSeries Main.java
 * To create Javadocs:  javadoc -d docs *.java
 * 
 * 
 * 
 * @author Amanda Menier
 * @version 1.0
 * @since CSC6301 - Week 4
 * 
 */

package orderedSeries;
