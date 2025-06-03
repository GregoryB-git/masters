package com.google.protobuf;

import java.util.Collections;
import java.util.Map;

public class k
{
  public static boolean b = true;
  public static volatile k c;
  public static final k d = new k(true);
  public final Map a = Collections.emptyMap();
  
  public k(boolean paramBoolean) {}
  
  public static k a()
  {
    k localk1 = c;
    k localk2 = localk1;
    k localk3;
    if (localk1 == null)
    {
      try
      {
        localk1 = c;
        localk2 = localk1;
        if (localk1 != null) {
          break label48;
        }
        if (b) {
          localk2 = j.a();
        }
      }
      finally
      {
        break label54;
      }
      localk3 = d;
      c = localk3;
      label48:
      return localk3;
      label54:
      throw localk3;
    }
    return localk3;
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */