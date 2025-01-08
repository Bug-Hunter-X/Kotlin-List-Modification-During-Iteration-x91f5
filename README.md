# Kotlin List Modification During Iteration

This repository demonstrates a common error in Kotlin when modifying a list while iterating through it.  The examples highlight the potential issues and provide a safe solution for removing even numbers from a list.

## Bug

The `bug.kt` file shows two approaches to removing even numbers. The first uses `removeIf`, while the second iterates backwards and uses `removeAt`. The second approach is safer because it doesn't affect the indices of remaining elements.

## Solution

The `bugSolution.kt` file shows the safe approach (iterating backwards) for modifying a list during iteration. This approach avoids ConcurrentModificationException and ensures that the iteration is unaffected.