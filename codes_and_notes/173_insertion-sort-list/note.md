```
@Copyright:LintCode
@Author:   baoyu2017
@Problem:  http://www.lintcode.com/problem/insertion-sort-list
@Language: Markdown
@Datetime: 16-07-26 16:37
```

插入链表的题目先要找到要插入的位置和要插入的节点。
然后把要插入的节点的next连上要插入的位置的next，再把要插入的next连上要插入的节点。
![单链表链表的插入操作](http://programming.xjtu.edu.cn/wskt/cai/cppcai/chapter14/content/images/1-2-3-11.gif)
注意p是指向当前要插入的位置的节点。
