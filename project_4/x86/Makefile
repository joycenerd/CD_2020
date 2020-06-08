all:
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool myCompiler.g
	javac -cp antlr-3.5.2-complete.jar:. myCompiler_test.java
	java -cp antlr-3.5.2-complete.jar:. myCompiler_test test1.c > test1.s
	java -cp antlr-3.5.2-complete.jar:. myCompiler_test test2.c > test2.s
	java -cp antlr-3.5.2-complete.jar:. myCompiler_test test3.c > test3.s
	gcc -O0 test1.s -o test1
	gcc -O0 test2.s -o test2
	gcc -O0 test3.s -o test3
	./test1
	./test2
	./test3
clean:
	rm -f *.class *.tokens myCompilerLexer.java myCompilerParser.java *.s test1 test2 test3