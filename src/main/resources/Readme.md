Function Interface:
Runnable -> run()
Callable -> call()
Comparable-> compareTo()
Comparator->compare()

Consumer->void accept(), default andThen() [foreach(pass consumer)]
Supplier -> T get(), orElseGet() //no input but expect an output
Predicate->boolean test() [filter(pass predicate]

Stream API:
It won't change the original data structure, it just give the result of pipeline operations
forEach(Consumer)
collect(Collector)
filter(Predicate)
sorted(Comparator)
map(Function)
flatmap(Function)
Map-> Datatransformation
Reduce (BinaryOperator)-> Aggregation

Optional->empty(),of(),ofNullable()

CompletetableFuture class
Option class
Executor class