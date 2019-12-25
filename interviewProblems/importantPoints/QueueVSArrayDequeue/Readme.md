1)ArrayDeque -since internal datastructure is array lookup willbe fast.

2)Queue -LinkedList internal datastructure is LinkedList

ArrayDeque VS LinkedList:
=========================

If you need add/remove of the both ends-
ArrayDeque is significantly better than a linked list. Random access each element is also O(1) for a cyclic queue.

The only better operation of a linked list is removing the current element during iteration.


ArrayDeque disadvantage
========================

it doubles capacity if exceeds initial capacity. but if we known size or size fixed then array deque is better.


    public void addFirst(E e) {
        if (e == null)
            throw new NullPointerException();
        elements[head = (head - 1) & (elements.length - 1)] = e;
        if (head == tail)
            doubleCapacity();
    }

LinkedList disadvantage:
========================

when no of elements increase linkedlist consume 

http://brianandstuff.com/2016/12/12/java-arraydeque-vs-linkedlist/

  At the test size of 9,900,000 elements, the LinkedList approach took ~165% longer than the ArrayDeque approach.

      If your requirement is storing 100 or 200 elements, it wouldn't make much of a 
      difference using either of the Queues.
      
      However, if you are developing on mobile, you may want to use an ArrayList or ArrayDeque 
      with a       good guess of maximum capacity that the list may be required to be
      because of strict memory constraint.

      


