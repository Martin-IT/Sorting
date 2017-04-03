function bubbleSort(array) {
    var temp;
    for (var m = 1; m < array.length - 1; m++) {
        for (var n = 0; n < array.length - m; n++) {
            if (array[n] > array[n + 1]) {
                temp = array[n]
                array[n] = array[n + 1]
                array[n + 1] = temp
            }
        }
    }
    return array
}

var array = [2, 8, 2, 14, 11, 5, 1, 9, 0, 4];
console.log(bubbleSort(array));