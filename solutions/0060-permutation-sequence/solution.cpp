class Solution {
public:
    string getPermutation(int n, int k) {
        int fact[10] = {1};
for (int i = 1; i <= n; i++)
fact[i] = fact[i - 1] * i;
int used[10] = {0};
char* result = (char*)malloc((n + 1) * sizeof(char));
k--; // Convert to 0-based index
for (int i = 0; i < n; i++) {
int idx = k / fact[n - i - 1];
k %= fact[n - i - 1];
int count = -1;
for (int j = 1; j <= n; j++) {
if (!used[j]) count++;
if (count == idx) {
result[i] = j + '0';
used[j] = 1;
break;
}
}
}
result[n] = '\0';
return result;
    }
};
