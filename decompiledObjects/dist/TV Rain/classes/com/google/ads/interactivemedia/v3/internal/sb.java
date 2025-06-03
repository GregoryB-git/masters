package com.google.ads.interactivemedia.v3.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Queue;

final class sb
{
  private final BufferedReader a;
  private final Queue<String> b;
  private String c;
  
  public sb(Queue<String> paramQueue, BufferedReader paramBufferedReader)
  {
    b = paramQueue;
    a = paramBufferedReader;
  }
  
  public final boolean a()
    throws IOException
  {
    if (c != null) {
      return true;
    }
    if (!b.isEmpty())
    {
      c = ((String)b.poll());
      return true;
    }
    String str;
    do
    {
      str = a.readLine();
      c = str;
      if (str == null) {
        break;
      }
      str = str.trim();
      c = str;
    } while (str.isEmpty());
    return true;
    return false;
  }
  
  public final String b()
    throws IOException
  {
    boolean bool = a();
    String str = null;
    if (bool)
    {
      str = c;
      c = null;
    }
    return str;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.sb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */