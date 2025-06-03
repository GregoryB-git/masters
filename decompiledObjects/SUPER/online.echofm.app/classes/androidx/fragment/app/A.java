package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

public final class A
  extends Writer
{
  public final String o;
  public StringBuilder p = new StringBuilder(128);
  
  public A(String paramString)
  {
    o = paramString;
  }
  
  public final void a()
  {
    if (p.length() > 0)
    {
      Log.d(o, p.toString());
      StringBuilder localStringBuilder = p;
      localStringBuilder.delete(0, localStringBuilder.length());
    }
  }
  
  public void close()
  {
    a();
  }
  
  public void flush()
  {
    a();
  }
  
  public void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    for (int i = 0; i < paramInt2; i++)
    {
      char c = paramArrayOfChar[(paramInt1 + i)];
      if (c == '\n') {
        a();
      } else {
        p.append(c);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */