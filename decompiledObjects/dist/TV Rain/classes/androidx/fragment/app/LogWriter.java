package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

final class LogWriter
  extends Writer
{
  private StringBuilder mBuilder = new StringBuilder(128);
  private final String mTag;
  
  public LogWriter(String paramString)
  {
    mTag = paramString;
  }
  
  private void flushBuilder()
  {
    if (mBuilder.length() > 0)
    {
      Log.d(mTag, mBuilder.toString());
      StringBuilder localStringBuilder = mBuilder;
      localStringBuilder.delete(0, localStringBuilder.length());
    }
  }
  
  public void close()
  {
    flushBuilder();
  }
  
  public void flush()
  {
    flushBuilder();
  }
  
  public void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    for (int i = 0; i < paramInt2; i++)
    {
      char c = paramArrayOfChar[(paramInt1 + i)];
      if (c == '\n') {
        flushBuilder();
      } else {
        mBuilder.append(c);
      }
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.LogWriter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */