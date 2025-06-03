package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.Writer;

final class zz
  extends Writer
{
  private final Appendable a;
  private final aac b = new aac();
  
  public zz(Appendable paramAppendable)
  {
    a = paramAppendable;
  }
  
  public final void close() {}
  
  public final void flush() {}
  
  public final void write(int paramInt)
    throws IOException
  {
    a.append((char)paramInt);
  }
  
  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
    throws IOException
  {
    aac localaac = b;
    a = paramArrayOfChar;
    a.append(localaac, paramInt1, paramInt2 + paramInt1);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.zz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */