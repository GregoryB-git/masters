package e;

import android.content.Intent;
import b.j;
import ec.i;

public abstract class a<I, O>
{
  public abstract Intent a(j paramj, Object paramObject);
  
  public a b(j paramj, Object paramObject)
  {
    i.e(paramj, "context");
    return null;
  }
  
  public abstract O c(int paramInt, Intent paramIntent);
  
  public static final class a<T>
  {
    public final T a;
    
    public a(T paramT)
    {
      a = paramT;
    }
  }
}

/* Location:
 * Qualified Name:     e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */