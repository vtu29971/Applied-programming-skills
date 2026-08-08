class Solution:

    def runningSum(self, nums: list[int]) -> list[int]:
        # Start from the second element
        for i in range(1, len(nums)):
            # Add the previous cumulative sum to the current element
            nums[i] += nums[i - 1]

        return nums

