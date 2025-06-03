package xc;

import java.io.Closeable;
import java.io.Flushable;

public abstract interface w
  extends Closeable, Flushable
{
  public abstract z c();
  
  public abstract void close();
  
  public abstract void flush();
  
  public abstract void g0(f paramf, long paramLong);
}

/* Location:
 * Qualified Name:     xc.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */