class BubbleSort
  def self.sort (array)
    (1...array.size - 1).each do |m|
      (0...array.size - m).each do |n|
        if array[n] > array[n + 1]
          temp = array[n]
          array[n] = array[n + 1]
          array[n + 1] = temp
        end
      end
    end
    array
  end
end

array = [2, 8, 2, 14, 11, 5, 1, 9, 0, 4]
print BubbleSort.sort(array)