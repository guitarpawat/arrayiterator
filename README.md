# This is Array Iterator!
## About ArrayIterator
Because many collections and data structures provide an Iterator, but not array. This Array Iterator make us iterate the arrays.
## Usage
* `ArrayIterator(T[] array)` is a constructor for initialize ArrayIterator.
* `T next()` return next non-null element in the array, else throws NoSuchElementException.
* `boolean hasNext()` retutn true if the array has next non-null element, otherwise return false.
* `void remove()` remove the current element in the array. If it already null then throws IllegalStateException.
* `T[] getArray()` return the current array in the object.
