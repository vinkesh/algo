class Solution
  # param a : array of integers
  #return an integer
  def trap(a)
    needDirection = -1;
    startIndex = -1;
    endIndex = -1;
    a.each_with_index do |value, index|
      if(needDirection < 0)
        if(value < a[index + 1])
          next
        else
          startIndex = startIndex == -1 ? index : startIndex
        end
      end
    end


  end
end

x = Solution.new()
x.trap [1,2,5,3]