all:
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool myparser.g
	javac -cp antlr-3.5.2-complete.jar:. testParser.java
	java -cp antlr-3.5.2-complete.jar:. testParser test1.c | tee test1_result.txt
	java -cp antlr-3.5.2-complete.jar:. testParser test2.c | tee test2_result.txt
	java -cp antlr-3.5.2-complete.jar:. testParser test3.c | tee test3_result.txt
clean:
	rm -f *.class *.tokens myparserLexer.java myparserParser.java *.txt
