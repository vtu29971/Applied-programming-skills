class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        # Define the set of all vowels for O(1) lookups
        vowels = set("aeiouAEIOU")
        
        # Find the midpoint of the string
        mid = len(s) // 2
        
        # Split the string into two halves
        a = s[:mid]
        b = s[mid:]
        
        # Count vowels in each half
        count_a = sum(1 for char in a if char in vowels)
        count_b = sum(1 for char in b if char in vowels)
        
        # Return True if they have the same number of vowels
        return count_a == count_b

