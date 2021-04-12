val forkJoinPool = new java.util.concurrent.ForkJoinPool(32) //32 threads
val parallelizedList = originalList.par
parallelizedList.tasksupport = new scala.collection.parallel.ForkJoinTaskSupport(forkJoinPool)

parallelizedList.forEach { item => operation(item)
}

forkJoinPool.shutdown
