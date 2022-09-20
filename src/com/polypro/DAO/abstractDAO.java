
package com.polypro.DAO;


import java.util.List;
//import javax.swing.text.html.parser.Entity;
//import org.w3c.dom.Entity;
//import com.sun.xml.internal.stream.Entity;


abstract class abstractDAO <E , K> {
// them
  public abstract void insert(E entity);
// xoa
  public abstract void delete(K id);
// sua
  public abstract  void update(E entity);
//truy van
  public abstract  List<E> select();
}
