class Solution:

    def shuffle(self, nums: list[int], n: int) -> list[int]:
        result = []

        # i tracks the x elements, i + n tracks the y elements
        for i in range(n):
            result.append(nums[i])
            result.append(nums[i + n])

        return result

