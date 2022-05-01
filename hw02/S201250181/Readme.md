### 任务一

#### 类图

### ![participants](https://i.loli.net/2021/09/22/kE4D8WQuc3atl52.png)



#### 时序图

![timeline](https://i.loli.net/2021/09/21/4T8r6NsgYaK5VIb.png)

#### example设计理念的好处和坏处

##### 好处

example 的类型设计中，各个类各自有单一的职责，例如 Line 负责承载待排序的对象，Gourd 是待排序的对象，sorter 是排序的工具，Geezer 持有sorter，负责记录排序过程。这样做的好处是条理清晰，降低了代码的复杂度，提高了代码的可读性和可理解性，并且提高了可修改性，使得对一个类修改时尽量减少对其他类的影响。

并且 Gourd 通过实现 linable 接口来体现它是一个可排在一条线上的排序对象，Bubble Sorter 通过实现 sorter 接口来体现它是用作排序的工具。这样做的好处是提高了程序的可扩展性，比如，当我们要让别的类作为待排序的对象排成一条线，那么我们只要在这个新的类中实现 linable 接口；或者我们想使用别的排序算法，比如快速排序，那么我们只需要创建一个新的类 QuickSorter implements Sorter。

 ##### 不足

排序依赖 rank 这一属性，在某些情境下不容易设计 rank，比如，要对一种新的对象排序，但是排序的 key 难以量化为整型。（如果能像 C++ 中的sort函数那样可以传入一个 cmp 函数对待排序对象的大小进行判断，可扩展性会更强。）

### 任务二

#### 类图

![participants2](https://i.loli.net/2021/09/22/Dbf9vP7hiONzlMF.png)

#### 排序可视化链接

使用快排的版本 https://asciinema.org/a/437262

使用插排的版本 https://asciinema.org/a/437267



### 任务三

![participants2](https://i.loli.net/2021/09/26/cuMObLUq8pNh24K.png)

类型设计和任务二差不多，Line 类改成了 Matrix 类，修改了 Line 的一些接口，使得它符合 Matrix 的行为。

#### 排序可视化链接

快排版本：https://asciinema.org/a/438290

插排版本：https://asciinema.org/a/438289



### 版本发布：

v1.0      64x1 version

v1.1      8x8 version 1.0

v1.2     8x8 version  2.0

v1.3     8x8 version   final 8x8 version

