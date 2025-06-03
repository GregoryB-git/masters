package x0;

import android.util.Log;
import java.io.Writer;

public final class p0
  extends Writer
{
  public final String a = "FragmentManager";
  public StringBuilder b = new StringBuilder(128);
  
  public final void close()
  {
    f();
  }
  
  public final void f()
  {
    if (b.length() > 0)
    {
      Log.d(a, b.toString());
      StringBuilder localStringBuilder = b;
      localStringBuilder.delete(0, localStringBuilder.length());
    }
  }
  
  public final void flush()
  {
    f();
  }
  
  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    for (int i = 0; i < paramInt2; i++)
    {
      char c = paramArrayOfChar[(paramInt1 + i)];
      if (c == '\n') {
        f();
      } else {
        b.append(c);
      }
    }
  }
}

/* Location:
 * Qualified Name:     x0.p0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */