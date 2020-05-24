all:
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool myChecker.g
	javac -cp antlr-3.5.2-complete.jar:. myChecker_test.java
	java -cp antlr-3.5.2-complete.jar:. myChecker_test test1.c | tee test1_result.txt
	java -cp antlr-3.5.2-complete.jar:. myChecker_test test2.c | tee test2_result.txt
	java -cp antlr-3.5.2-complete.jar:. myChecker_test test3.c | tee test3_result.txt
clean:
	rm -f *.class *.tokens *result.txt