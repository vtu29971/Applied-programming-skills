class Solution:

    def maximumWealth(self, accounts: list[list[int]]) -> int:
        max_wealth = 0

        for customer in accounts:
            # Calculate total wealth for the current customer
            current_wealth = sum(customer)
            # Update the maximum wealth found so far
            if current_wealth > max_wealth:
                max_wealth = current_wealth

        return max_wealth

