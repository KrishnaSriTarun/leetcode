class Solution(object):
    def lengthOfLastWord(self, s):
        a=s.split()
        k=a[-1]
        return len(k)
        