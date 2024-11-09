# Java-Optimization-Solver | Java 求解器
这个项目演示了如何使用Apache Commons Math3库在Java中求解复杂的方程。
## 如何使用
 `git clone` 下载本工程。  
  - Java version: 1.8 
  - Gradle version: 8.5 
## 如何验证解是否正确
 当然是Excel，使用“规划功能”点点鼠标，就能计算出解。
## 文件简介
 - `Demo.xlse` 用于验证java的解与excel求解是否一致.
 - `SolverExample.java` 一个简单的求解案例.
 - `MultiVariableSolverExample.java` 两个自变量的复杂求解.

## 提醒
如果一个数学方程无解，即它在数学领域无解，代码也不会产生解。  
在高等数学中，有很多近似解并不精确，但对于工程来说足够，可以使用，专有词汇：堪用。   
在数学领域，Python比Java要更强大，如果你学过Python，请用Python解决你的工程问题，比如小波分析。  
在一维领域(Y=a×x+c)，数学可以求出准确的值；   
一个变量的二维领域(Y=a×x²+b×x+c)，有解的话，也可以求准确的一个或多个值；   
两个变量的一维领域(Y=a×x+b×y+c)，这个时候就已经不是一个解，会存在一组解；
两个变量的一维领域(Y=a×x²+b×y²+d×x+e×y+c)，不知道多少个解，能找到一个差不多的，就行了。
