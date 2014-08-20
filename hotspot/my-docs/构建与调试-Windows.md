这里以32位Windows 7为例

## 安装必须的软件

[JDK1.8](http://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html)<br>
[Cygwin](http://www.cygwin.com/install.html)<br>
[Microsoft Visual Studio 2010](http://www.microsoft.com/visualstudio/zh-cn/products/2010-editions)<br>

这里就不介绍怎么安装这些软件了，假设安装后的目录名分别是: <br>
(请根据你的实际情况调整这些目录名）<br>

D:\JavaSE1.8 <br>
D:\Cygwin <br>
D:\VS2010 <br>

增加环境变量JAVA_HOME指向D:\JavaSE1.8，<br>
并把D:\JavaSE1.8\bin;D:\Cygwin\bin;D:\VS2010\VC\bin加到Path环境变量。

## 下载源代码

用Git clone源代码，假设顶层目录是 D:\openjdk (请根据你的实际情况调整这个目录名)<br>
    ```
git clone https://github.com/codefollower/OpenJDK-Research.git D:\openjdk
    ```

## 生成Visual Studio项目

打开一个命令行窗口，切换到D:\openjdk\hotspot\make\windows目录，运行下面的命令:<br>

D:\VS2010\Common7\Tools\vsvars32.bat <br>
set HOTSPOTMKSHOME=D:\Cygwin\bin <br>
create D:\JavaSE1.8 (注: create对应当前目当下的create.bat文件)<br>

会在D:\openjdk\hotspot\build\vs-i486目录中生成Visual Studio项目文件

## 导入项目

运行Microsoft Visual Studio 2010，
按Ctrl + Shift + O，打开D:\openjdk\hotspot\build\vs-i486\jvm.vcxproj，
然后右击左边的jvm项目名，选择Build就可以构建jvm了。

## 调试JVM

在Visual Studio 2010中打开jvm\share\vm\runtime\thread.cpp文件，
在create_vm方法中(3269行)打个断点，然后按F5就可以了。

观察调用堆栈，你会发现自己找不到 main 函数，第一个可以找到的函数是  	

```
jvm.dll!JNI_CreateJavaVM(JavaVM_ * * vm, void * * penv, void * args) 
```

调用它的是 `java.exe!00xxxxxx`

观察一下项目属性->配置属性->调试，会发现命令处是 `java.exe` 的路径，命令参数是 `-XXaltjvm=$(TargetDir)  -Dsun.java.launcher=gamma`，结合上面的调用堆栈，可以明白，我们用 Visual Studio 编译出的是 `jvm.dll`，运行时，是运行 `java.exe`，它加载我们编译出的 `jvm.dll` 并运行。由于我们并没有编译 `java.exe` 的源代码，所以看不到 `main` 函数，只能看到运行的时候 `jvm.dll` 中的代码。
