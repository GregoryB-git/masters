package X2;

import java.util.Map;

public abstract class J$d
{
  public J.c a()
  {
    return b(2);
  }
  
  public J.c b(final int paramInt)
  {
    i.b(paramInt, "expectedValuesPerKey");
    return new a(paramInt);
  }
  
  public abstract Map c();
  
  public class a
    extends J.c
  {
    public a(int paramInt) {}
    
    public D c()
    {
      return K.b(c(), new J.b(paramInt));
    }
  }
}

/* Location:
 * Qualified Name:     X2.J.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */