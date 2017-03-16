
Problem: given a set of authors and a set of papers that they co-signed, compute the Erdös number of the authors.

https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=12&page=show_problem&problem=985


TODO

### no scenarios
    0

### no papers
    1
    0 1
    Foo, B.
### one paper one author
    1
    1 1
    Foo, B.: Paper title
    Foo, B.
### one paper two authors
    1
    1 2
    Foo, B., Bar, B.: Paper title
    Foo, B.
    Bar, B.
### one paper by Erdos alone
    1
    1 1
    Erdos, P.: Paper title
    Erdos, P
### one paper by Erdos and someone else
    1
    1 1
    Smith, M.N., Erdos, P.: Paper title
    Smith, M.N.
### one author has erdos 2
    1
    2 2
    Smith, M.N., Erdos, P.: Paper title
    Martin, G., Smith, M.N: Another paper
    Smith, M.N.
    Martin, G.
### more than one path to Erdos
    1
    4 1
    Aaa, A., Erdos, P., Ddd, D.: Paper title
    Bbb, B., Aaa, A.: Something else
    Bbb, B., Ccc, C.: Another paper
    Ddd, D., Ccc, C.: Ninja paper
    Ccc, C.






