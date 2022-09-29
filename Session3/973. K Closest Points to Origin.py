    def kClosest(self, points: List[List[int]], K: int) -> List[List[int]]:
        heap = []

        for (x, y) in points:
            d = -(x**2 + y**2)
            heapq.heappush(heap, (d, x, y))
            if len(heap) > K:
                heapq.heappop(heap)
        return [x[1:] for x in heap]