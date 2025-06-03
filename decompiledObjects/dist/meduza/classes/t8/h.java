package t8;

import java.util.Comparator;

public abstract interface h<K, V>
{
  public abstract h<K, V> a();
  
  public abstract h<K, V> b(K paramK, V paramV, Comparator<K> paramComparator);
  
  public abstract h<K, V> c(K paramK, Comparator<K> paramComparator);
  
  public abstract h d(a parama, j paramj1, j paramj2);
  
  public abstract boolean e();
  
  public abstract h<K, V> f();
  
  public abstract h<K, V> g();
  
  public abstract K getKey();
  
  public abstract V getValue();
  
  public abstract h<K, V> h();
  
  public abstract boolean isEmpty();
  
  public abstract int size();
  
  public static enum a
  {
    static
    {
      a locala1 = new a("RED", 0);
      a = locala1;
      a locala2 = new a("BLACK", 1);
      b = locala2;
      c = new a[] { locala1, locala2 };
    }
    
    public a() {}
  }
}

/* Location:
 * Qualified Name:     t8.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */