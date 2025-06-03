package androidx.datastore.preferences.protobuf;

public abstract class d
{
  public static final Class a = a("libcore.io.Memory");
  public static final boolean b;
  
  static
  {
    boolean bool;
    if (a("org.robolectric.Robolectric") != null) {
      bool = true;
    } else {
      bool = false;
    }
    b = bool;
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
    return a;
  }
  
  public static boolean c()
  {
    boolean bool;
    if ((a != null) && (!b)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */