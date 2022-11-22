
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:

        str1, str2 = min(strs), max(strs)
        i = 0
        while i < len(str1):
            if str1[i] != str2[i]:
                break
            i +=1

        return str1[:i]