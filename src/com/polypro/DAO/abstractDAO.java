
package com.polypro.DAO;


import java.util.List;
//import javax.swing.text.html.parser.Entity;
//import org.w3c.dom.Entity;
//import com.sun.xml.internal.stream.Entity;


abstract class abstractDAO <E , K> {
// them
   abstract public void insert(E entity);
// xoa
   abstract public void delete(K id);
// sua
   abstract public  void update(E entity);
//truy van
   abstract public  List<E> select();
// select id
   abstract public E selectID(K id); 
// select 
   abstract protected List<E> selectBySql(String sql, Object... args);
 
}
