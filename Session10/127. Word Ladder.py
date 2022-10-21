class Solution:
    def ladderLength(self, beginWord: str, endWord: str, wordList: List[str]) -> int:
        queue = deque([beginWord])
        visited = set([beginWord])
        wordList = set(wordList)
        
        changes = 1
        
        alph = "abcdefghijklmnopqrstuvwxyz"
        
        
        if endWord not in wordList:
            return 0
        
        while queue:
            for l in range(len(queue)):
                curr_word = queue.popleft()
                if curr_word == endWord:
                    return changes

                for i in range(len(curr_word)):
                    prefix, suffix = curr_word[:i], curr_word[i+1:]
                    for al in alph:
                        w = prefix + al + suffix
                        if w in wordList and w not in visited:
                            queue.append(w)
                            visited.add(w)
            changes += 1
            
        return 0