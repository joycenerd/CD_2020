all:
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool myCompiler.g
	javac -cp antlr-3.5.2-complete.jar:. myCompiler_test.java
	java -cp antlr-3.5.2-complete.jar:. myCompiler_test test_1.c > test_1.j
clean:
	rm -f *.class *.tokens myCompilerLexer.java myCompilerParser.java *.s, *.j test1 test2 test3