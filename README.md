# 📚 Data Structures & Algorithms (DSA)

> A complete, well-organized collection of Data Structures and Algorithms implemented from scratch — covering everything from basic arrays to advanced graphs, dynamic programming, and beyond.

---

## 👨‍💻 About This Repository

This repository is my personal DSA preparation and learning journey. It contains clean implementations, detailed explanations, and practice problems for every major topic in Data Structures & Algorithms — suitable for coding interviews, competitive programming, and building a strong CS foundation.

---


---

## 🧠 Topics Covered

### 🔷 Data Structures

| # | Topic | Status |
|---|-------|--------|
| 1 | Arrays & Strings | ✅ Done |
| 2 | Linked List (Singly, Doubly, Circular) | ✅ Done |
| 3 | Stack | ✅ Done |
| 4 | Queue & Deque | ✅ Done |
| 5 | Hashing / Hash Map | ✅ Done |
| 6 | Trees (Binary Tree, BST, AVL) | ✅ Done |
| 7 | Heaps / Priority Queue | ✅ Done |
| 8 | Graphs (Adjacency List & Matrix) | ✅ Done |
| 9 | Trie | ✅ Done |
| 10 | Segment Tree | ✅ Done |

### 🔶 Algorithms




| # | Topic | Status |
|---|-------|--------|
| 1 | Sorting (Bubble, Merge, Quick, Heap, etc.) | ✅ Done |
| 2 | Searching (Linear, Binary Search) | ✅ Done |
| 3 | Recursion & Backtracking | ✅ Done |
| 4 | Two Pointer & Sliding Window | ✅ Done |
| 5 | Divide and Conquer | ✅ Done |
| 6 | Greedy Algorithms | ✅ Done |
| 7 | Dynamic Programming | ✅ Done |
| 8 | Graph Algorithms (BFS, DFS, Dijkstra, etc.) | ✅ Done |
| 9 | Bit Manipulation | ✅ Done |

---

## 🚀 Key Algorithm Cheat Sheet

### Sorting Complexities

| Algorithm | Best | Average | Worst | Space |
|-----------|------|---------|-------|-------|
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) |
| Heap Sort | O(n log n) | O(n log n) | O(n log n) | O(1) |

### Graph Algorithm Complexities



| Algorithm | Time | Space | Use Case |
|-----------|------|-------|----------|
| BFS | O(V + E) | O(V) | Shortest path (unweighted) |
| DFS | O(V + E) | O(V) | Cycle detection, Topological sort |
| Dijkstra | O((V + E) log V) | O(V) | Shortest path (weighted, no -ve) |
| Bellman-Ford | O(V × E) | O(V) | Shortest path (with -ve weights) |
| Floyd-Warshall | O(V³) | O(V²) | All pairs shortest path |
| Kruskal's MST | O(E log E) | O(V) | Minimum spanning tree |
| Prim's MST | O(E log V) | O(V) | Minimum spanning tree |

---

## 📝 Dynamic Programming Patterns

- **0/1 Knapsack Pattern** — Subset sum, target sum, partition equal subset
- **Unbounded Knapsack Pattern** — Coin change, rod cutting
- **Fibonacci Pattern** — Climbing stairs, house robber
- **Longest Common Subsequence Pattern** — Edit distance, shortest common supersequence
- **Matrix Chain Multiplication Pattern** — Burst balloons, palindrome partitioning
- **DP on Trees** — Diameter, max path sum
- **Interval DP** — Matrix chain, minimum cost to cut a stick
- **Bitmask DP** — Traveling salesman problem

---

## 🔁 Recursion & Backtracking Problems

- N-Queens Problem
- Rat in a Maze
- Sudoku Solver
- Word Search
- Permutations & Combinations
- Subset Generation
- M-Coloring Problem

---

## 🌳 Tree Traversals

```
Inorder   → Left → Root → Right   (gives sorted order in BST)
Preorder  → Root → Left → Right   (used for copying tree)
Postorder → Left → Right → Root   (used for deleting tree)
Level Order → BFS using Queue
```

---

## 💡 Tips & Tricks

- Always draw the problem before coding.
- Use dry runs on small examples to verify logic.
- For DP, always think: can this be broken into subproblems?
- For graphs, identify if it's directed/undirected and weighted/unweighted first.
- Binary search works on any monotonic function, not just sorted arrays.
- Two-pointer works when input is sorted or when you need O(n) over O(n²).

---

## 🛠️ Tech Stack Used

- **Language:** C++ / Java / Python *(based on folder/file)*
- **Platform:** VS Code / IntelliJ / Online Judges
- **Practice Sites:** LeetCode, GeeksForGeeks, Codeforces, HackerRank

---

## 📌 How to Use This Repo

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/DSA.git
   cd DSA
   ```

2. Navigate to the topic you want to study:
   ```bash
   cd 13_Dynamic_Programming
   ```

3. Compile and run (C++ example):
   ```bash
   g++ filename.cpp -o output
   ./output
   ```

4. Or run Python files:
   ```bash
   python3 filename.py
   ```

---

## 🏆 Practice Problems Index

> Problems are organized inside `problems/` subdirectories under each topic.

| Topic | Number of Problems |
|-------|--------------------|
| Arrays | 30+ |
| Strings | 20+ |
| Linked List | 20+ |
| Stack & Queue | 15+ |
| Trees | 30+ |
| Graphs | 25+ |
| Dynamic Programming | 40+ |
| Greedy | 15+ |
| Backtracking | 10+ |
| Bit Manipulation | 10+ |
| **Total** | **200+** |

---

## 📈 Progress Tracker

- [x] Arrays & Strings
- [x] Linked Lists
- [x] Stack & Queue
- [x] Recursion & Backtracking
- [x] Sorting & Searching
- [x] Hashing
- [x] Trees & BST
- [x] Heaps
- [x] Graphs
- [x] Dynamic Programming
- [x] Greedy
- [x] Trie
- [x] Segment Tree
- [x] Bit Manipulation

---

## 🤝 Contributing

Feel free to open issues or pull requests if you find any bugs, have better solutions, or want to add more problems.

1. Fork this repository
2. Create your feature branch: `git checkout -b feature/add-problem`
3. Commit your changes: `git commit -m 'Add new DP problem'`
4. Push to the branch: `git push origin feature/add-problem`
5. Open a Pull Request

---

## 📬 Connect With Me

- **GitHub:** [@your-username](https://github.com/your-username)
- **LinkedIn:** [Your Name](https://linkedin.com/in/your-profile)
- **LeetCode:** [your-leetcode](https://leetcode.com/your-profile)

---

## ⭐ Star This Repo

If this repository helped you in any way, please consider giving it a ⭐ — it motivates me to keep adding more content!

---

<p align="center">
  Made with ❤️ by <strong>Your Name</strong> | Happy Coding! 🚀
</p>
