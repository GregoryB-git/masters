package com.google.crypto.tink.shaded.protobuf;

public abstract class d
{
  public static boolean a;
  public static final Class b = a("libcore.io.Memory");
  public static final boolean c;
  
  static
  {
    boolean bool;
    if ((!a) && (a("org.robolectric.Robolectric") != null)) {
      bool = true;
    } else {
      bool = false;
    }
    c = bool;
  }
  
  public static Class a(String paramString)
  {
    try
    {
      paramString = Class.forName(paramString);
      return paramString;
    }
    finally {}
    return null;
  }
  
  public static Class b()
  {
    return b;
  }
  
  public static boolean c()
  {
    boolean bool;
    if ((!a) && ((b == null) || (c))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */