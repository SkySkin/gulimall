### pig go 截图后所在位置

> /Users/austin/Library/Application Support/typora-user-images





### idea_  取消自动import .*

打开设置 > Editor > Code Style > Java > Scheme Default > Imports
① 将 Class count to use import with "*" 改为 99 （导入同一个包的类超过这个数值自动变为 * ）
② 将 Names count to use static import with "*" 改为 99 （同上，但这是静态导入的）
③ 将 Package to Use import with "*" 删掉默认的这两个包 （不管使用多少个类，只要在这个列表里都会变为 * ）
PS：Scheme Default 是针对全局的，你也可以只修改某个Project的

### Intellij IDEA 自动清除无效 import 和一键全量清除无效import引用

> 快捷键 **Ctrl+Alt+O** ![](https://s2.loli.net/2022/08/07/F6bJMHg9QjeWw2v.png)

### 修改idea commint ,使得commit按钮出现在左边，但是没有详细的信息 

> 取消勾选 Use non-modal commit interface

​	![image-20220807104248703](https://s2.loli.net/2022/08/07/hLlE1OkHNrjfc7Y.png)

