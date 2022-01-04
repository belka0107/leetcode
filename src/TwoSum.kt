

fun main(args: Array<String>){
//    val res = TwoSum().twoSum(intArrayOf(1, 3, 5), 6)

//    println("$res[0]  $res[1]")

    val res2 = Solutions().bitwiseComplement(5)
    println("$res2")
}

class Solutions {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        for(i in nums.indices){
            for(j in nums.indices) {
                if(i == j)
                    continue
                if (nums[i] + nums[j] == target)
                {
                    return intArrayOf(i, j)
                }
            }

        }
        return IntArray(0)
    }

    fun bitwiseComplement(n: Int): Int {
        val binary = Integer.toBinaryString(n)

        val replace = binary
            .replace('1', 'a').replace('0', 'b')
            .replace('a', '0').replace('b', '1')

        return Integer.parseInt(replace, 2)
    }
}