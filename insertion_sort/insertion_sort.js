function insertionSort(array) {

    var temp;

    for (var outer = 1; outer < array.length; outer++) {

        var pointer = outer;

        for (var inner = outer; inner > 0; inner--) {

            if (array[pointer - 1] > array[pointer]) {
                temp = array[pointer];
                array[pointer] = array[pointer - 1];
                array[pointer - 1] = temp;
                pointer -= 1;
            }

        }

    }

    return array;

}

var array = [2, 8, 2, 14, 11, 5, 1, 9, 0, 4];
console.log(insertionSort(array));