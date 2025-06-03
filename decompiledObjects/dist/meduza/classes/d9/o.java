package d9;

import java.util.List;

public abstract class o
{
  public static final c a = new c();
  public static final e b = new e();
  
  public abstract String a();
  
  public static final class a
    extends o
  {
    public final List<Object> c;
    
    public a(List<Object> paramList)
    {
      c = paramList;
    }
    
    public final String a()
    {
      return "FieldValue.arrayRemove";
    }
  }
  
  public static final class b
    extends o
  {
    public final List<Object> c;
    
    public b(List<Object> paramList)
    {
      c = paramList;
    }
    
    public final String a()
    {
      return "FieldValue.arrayUnion";
    }
  }
  
  public static final class c
    extends o
  {
    public final String a()
    {
      return "FieldValue.delete";
    }
  }
  
  public static final class d
    extends o
  {
    public final Number c;
    
    public d(Number paramNumber)
    {
      c = paramNumber;
    }
    
    public final String a()
    {
      return "FieldValue.increment";
    }
  }
  
  public static final class e
    extends o
  {
    public final String a()
    {
      return "FieldValue.serverTimestamp";
    }
  }
}

/* Location:
 * Qualified Name:     d9.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */