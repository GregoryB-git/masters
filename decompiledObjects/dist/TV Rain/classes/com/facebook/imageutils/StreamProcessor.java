package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;

class StreamProcessor
{
  public static int readPackedInt(InputStream paramInputStream, int paramInt, boolean paramBoolean)
    throws IOException
  {
    int i = 0;
    int j = 0;
    while (i < paramInt)
    {
      int k = paramInputStream.read();
      if (k != -1)
      {
        int m;
        if (paramBoolean)
        {
          k = (k & 0xFF) << i * 8;
          m = j;
          j = k;
        }
        else
        {
          m = j << 8;
          j = k & 0xFF;
        }
        j = m | j;
        i++;
      }
      else
      {
        throw new IOException("no more bytes");
      }
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imageutils.StreamProcessor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */