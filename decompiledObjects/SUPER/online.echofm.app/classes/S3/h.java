package S3;

import java.util.Comparator;

public abstract interface h
{
  public abstract h a();
  
  public abstract h b(Object paramObject1, Object paramObject2, Comparator paramComparator);
  
  public abstract h c(Object paramObject1, Object paramObject2, a parama, h paramh1, h paramh2);
  
  public abstract boolean d();
  
  public abstract void e(b paramb);
  
  public abstract h f();
  
  public abstract h g(Object paramObject, Comparator paramComparator);
  
  public abstract Object getKey();
  
  public abstract Object getValue();
  
  public abstract h h();
  
  public abstract h i();
  
  public abstract boolean isEmpty();
  
  public abstract int size();
  
  public static enum a
  {
    static
    {
      a locala1 = new a("RED", 0);
      o = locala1;
      a locala2 = new a("BLACK", 1);
      p = locala2;
      q = new a[] { locala1, locala2 };
    }
  }
  
  public static abstract class b
  {
    public abstract void a(Object paramObject1, Object paramObject2);
  }
}

/* Location:
 * Qualified Name:     S3.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */