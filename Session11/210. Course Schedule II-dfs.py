class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        premap={i:[] for i in range(numCourses)}
        ans=deque()
        for crs,pre in prerequisites:
            premap[crs].append(pre)

        visited=set()
        recstack=set()
        def dfs(crs):
            if crs in recstack:
                return False
            if crs in visited:
                return True
            visited.add(crs)
            recstack.add(crs)
            for pre in premap[crs]:
                if not dfs(pre): return False
            recstack.remove(crs)
            ans.append(crs)
            return True
        for i in range(numCourses):
            if not dfs(i): return []
        return ans
                