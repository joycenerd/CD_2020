all:
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool myCompiler.g
	javac -cp antlr-3.5.2-complete.jar:. myCompiler_test.java
	java -cp antlr-3.5.2-complete.jar:. myCompiler_test test_1.c > test_1.j
	java -cp antlr-3.5.2-complete.jar:. myCompiler_test test_2.c > test_2.j
	java -cp antlr-3.5.2-complete.jar:. myCompiler_test test_3.c > test_3.j
	java -cp antlr-3.5.2-complete.jar:. myCompiler_test test_4.c > test_4.j
clean:
	rm -f *.class *.tokens myCompilerLexer.java myCompilerParser.java *.j