package y4;

import com.google.firebase.messaging.M;

public final class b
{
  public static final b b = new a().a();
  public final a a;
  
  public b(a parama)
  {
    a = parama;
  }
  
  public static a b()
  {
    return new a();
  }
  
  public a a()
  {
    return a;
  }
  
  public byte[] c()
  {
    return M.a(this);
  }
  
  public static final class a
  {
    public a a = null;
    
    public b a()
    {
      return new b(a);
    }
    
    public a b(a parama)
    {
      a = parama;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     y4.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */