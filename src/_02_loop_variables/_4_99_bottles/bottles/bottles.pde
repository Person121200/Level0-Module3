size (400, 400);
int bottles = 99;
int hd = 99;
for (int i = 0; i < 97; i = i+1) {
  println( bottles+" bottles of beer on the wall, " + bottles +" bottles of beer ");
  println("Take one down and pass it around "+ (bottles-1) + " bottles of beer on the wall");
  bottles= bottles -1;
}
println("1 bottle of beer on the wall, 1 bottle of beer");
println("Take on down and pass it around no more bottles of beer on the wall");
println("No more bottles of beer on the wall, no more bottles of beer");
print("Go to the store and buy some more, " + hd+ " bottles of beer on the wall");
