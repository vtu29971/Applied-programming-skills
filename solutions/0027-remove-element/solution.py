class Solution:

    def removeElement(self, nums: list[int], val: int) -> int:
        # k keeps track of the index for valid elements
        k = 0

        for i in range(len(nums)):
            # If the current element is not the target value
            if nums[i] != val:
                # Move it to the front of the array
                nums[k] = nums[i]
                k += 1

        return k

