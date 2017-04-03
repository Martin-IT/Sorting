class SelectionSort
  def self.sort(array)
    (0...array.size - 1).each do |m|
      (1...array.size - m).each do |n|
        smallest = array[m]
        if smallest > array[m + n]
          array[m] = array[m + n]
          array[m + n] = smallest
        end
      end
    end
    array
  end
end

array = [2, 8, 2, 14, 11, 5, 1, 9, 0, 4]
print SelectionSort.sort(array)