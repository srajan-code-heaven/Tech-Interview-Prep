class TrieNode(object):
    def __init__(self, val):
        self.val = val
        self.children = collections.OrderedDict()
        self.isEnd = False

class Trie(object):
    def __init__(self):
        self.root = TrieNode(None)
    
    def insert(self, word):
        node = self.root
        for char in word:
            if char not in node.children.keys():
                node.children[char] = TrieNode(char)
            node = node.children[char]
        
        node.isEnd = True
    
    def getSuggestions(self, searchWord):
        suggestions = []
        node = self.root
        for char in searchWord:
            if char not in node.children.keys():
                return suggestions
            node = node.children[char]
        
        suggestions = self.dfs(node, searchWord[:-1], "", [])
        return suggestions
    
    def dfs(self, node, prefix, path, res):
        if len(res) >= 3:
            return res
        
        path += node.val
        
        if node.isEnd:
            res.append(prefix + path[:])
        
        for key, child in node.children.items():
            res = self.dfs(child, prefix, path[:], res)
        
        return res
                
        
class Solution(object):
    def suggestedProducts(self, products, searchWord):
        """
        :type products: List[str]
        :type searchWord: str
        :rtype: List[List[str]]
        """
        
        trie = Trie()
        products.sort()
        for product in products:
            trie.insert(product)
        res = []
        curr_searchWord = ""
        for char in searchWord:
            curr_searchWord += char
            suggestions = trie.getSuggestions(curr_searchWord)
            res.append(suggestions)
        
        return res