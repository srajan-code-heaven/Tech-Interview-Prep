class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        premap={i:[] for i in range(numCourses)}
        
        for crs,pre in prerequisites:
            premap[crs].append(pre)
        visited=set()
        recstack=set()
        def dfs(crs):
            if crs in recstack:
                return False
            if crs in visited:
                return True
            if premap[crs]==[]:
                return True
            visited.add(crs)
            recstack.add(crs)
            for pre in premap[crs]:
                if not dfs(pre): return False
            recstack.remove(crs)
            return True
        for i in range(numCourses):
            if not dfs(i): return False
        return True
                