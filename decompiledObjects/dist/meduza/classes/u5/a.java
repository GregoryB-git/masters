package u5;

import java.io.File;
import java.io.IOException;

public abstract interface a
{
  public abstract r a(long paramLong1, long paramLong2, String paramString);
  
  public abstract void b(g paramg);
  
  public abstract m c(String paramString);
  
  public abstract long d(long paramLong1, long paramLong2, String paramString);
  
  public abstract File e(long paramLong1, long paramLong2, String paramString);
  
  public abstract void f(String paramString, l paraml);
  
  public abstract void g(g paramg);
  
  public abstract void h(File paramFile, long paramLong);
  
  public abstract long i();
  
  public abstract long j(long paramLong1, long paramLong2, String paramString);
  
  public abstract r k(long paramLong1, long paramLong2, String paramString);
  
  public static class a
    extends IOException
  {
    public a(String paramString)
    {
      super();
    }
    
    public a(String paramString, IOException paramIOException)
    {
      super(paramIOException);
    }
    
    public a(Throwable paramThrowable)
    {
      super();
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(g paramg);
    
    public abstract void d(a parama, g paramg);
    
    public abstract void e(a parama, g paramg, r paramr);
  }
}

/* Location:
 * Qualified Name:     u5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */