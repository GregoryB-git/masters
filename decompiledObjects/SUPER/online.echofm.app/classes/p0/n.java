package p0;

import j0.b;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

public abstract interface n
{
  public abstract void a(v.a parama);
  
  public abstract boolean b();
  
  public abstract Map c();
  
  public abstract UUID d();
  
  public abstract void e(v.a parama);
  
  public abstract boolean f(String paramString);
  
  public abstract a g();
  
  public abstract int getState();
  
  public abstract b h();
  
  public static class a
    extends IOException
  {
    public final int o;
    
    public a(Throwable paramThrowable, int paramInt)
    {
      super();
      o = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     p0.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */