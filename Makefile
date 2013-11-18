all: FormScanner.class
	
FormScanner.class: FormScanner.java
	javac FormScanner.java

clean:
	rm -rf *.class
