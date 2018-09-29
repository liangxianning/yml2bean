# yml2bean 即 yml转换为bean

yml中的属性转换为java的各种类型

# 结果
```yml
person:
  name: liangxn
  age: 18

  play: #Map
    card: doudizhu
    xq: xiangqi

  hobby: game,travel,music #List
  study: #List
    - java
    - javascript
    - nodejs

  family: #Map<Map>
    child1:
      name: aaa
      age: 45
      bbb: zqwerty
    child2:
      nick: fasdf
      yyy: xidefj

  nodes1: #List<List>
    -
      - n1
      - n2
      - n3
    -
      - nn1
      - nn2

  nodes2: #Map<List>
    mm:
      - node1
      - node2
      - node3

  node3: #List<Map>
    -
      nodea: aaaa
      nodeb: bbbbb
      nodec: cccc
    -
      nodeaa: 123213
      nodebb: tyui
```

转换为对象打印如下： 

PersonBean{name='liangxn', age=18, play={card=doudizhu, xq=xiangqi}, hobby=[game, travel, music], study=[java, javascript, nodejs], family={child1={name=aaa, age=45, bbb=zqwerty}, child2={nick=fasdf, yyy=xidefj}}, nodes1=[[n1, n2, n3], [nn1, nn2]], nodes2={mm=[node1, node2, node3]}, node3=[{nodea=aaaa, nodeb=bbbbb, nodec=cccc}, {nodeaa=123213, nodebb=tyui}]}
