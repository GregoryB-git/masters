package okhttp3.internal.cache;

import java.io.IOException;
import xc.f;
import xc.j;

class FaultHidingSink
  extends j
{
  public boolean b;
  
  public final void close()
  {
    if (b) {
      return;
    }
    try
    {
      super.close();
    }
    catch (IOException localIOException)
    {
      b = true;
      f();
    }
  }
  
  public void f() {}
  
  public final void flush()
  {
    if (b) {
      return;
    }
    try
    {
      super.flush();
    }
    catch (IOException localIOException)
    {
      b = true;
      f();
    }
  }
  
  public final void g0(f paramf, long paramLong)
  {
    if (b)
    {
      paramf.skip(paramLong);
      return;
    }
    try
    {
      super.g0(paramf, paramLong);
    }
    catch (IOException paramf)
    {
      b = true;
      f();
    }
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.cache.FaultHidingSink
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */