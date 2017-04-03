function selectionSort(array) {
    var smallest;
    for (var m = 0; m < array.length - 1; m++) {
        for (var n = 1; n < array.length - m; n++) {
            smallest = array[m]
            if (smallest > array[m + n]) {
                array[m] = array[m + n]
                array[m + n] = smallest
            }
        }
    }
    return array
}

var array = [2, 8, 2, 14, 11, 5, 1, 9, 0, 4];
console.log(selectionSort(array));