# this script is called when the judge wants our compiler to compile a source file.
# print the compiled source, i.e. asm code, directly to stdout.
# don't print anything other to stdout.
# if you would like to print some debug information, please go to stderr.

set -e
cd "$(dirname "$0")"
export CCHK="java -classpath ./lib/antlr-4.7-intellij-1.8.4-version-complete.jar:./bin Main"
cat > program.txt   # save everything in stdin to program.txt
$CCHK