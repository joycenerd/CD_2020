all:
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool myCompiler.g
	javac -cp antlr-3.5.2-complete.jar:. myCompiler_test.java
	java -cp antlr-3.5.2-complete.jar:. myCompiler_test test_1.c | tee test_1.j
	java -cp antlr-3.5.2-complete.jar:. myCompiler_test test_2.c | tee test_2.j
	java -cp antlr-3.5.2-complete.jar:. myCompiler_test test_3.c | tee test_3.j
	java -cp antlr-3.5.2-complete.jar:. myCompiler_test test_4.c | tee test_4.j
	java -cp antlr-3.5.2-complete.jar:. myCompiler_test test_5.c | tee test_5.j
clean:
	rm -f *.class *.tokens myCompilerLexer.java myCompilerParser.java *.j