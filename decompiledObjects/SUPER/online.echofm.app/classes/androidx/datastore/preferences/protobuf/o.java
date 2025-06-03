package androidx.datastore.preferences.protobuf;

import android.support.v4.media.a;
import java.util.Collections;
import java.util.Map;

public class o
{
  public static boolean b = true;
  public static final Class c = ;
  public static volatile o d;
  public static final o e = new o(true);
  public final Map a = Collections.emptyMap();
  
  public o(boolean paramBoolean) {}
  
  public static o b()
  {
    o localo1 = d;
    o localo2 = localo1;
    o localo3;
    if (localo1 == null)
    {
      try
      {
        localo1 = d;
        localo2 = localo1;
        if (localo1 != null) {
          break label48;
        }
        if (b) {
          localo2 = n.a();
        }
      }
      finally
      {
        break label54;
      }
      localo3 = e;
      d = localo3;
      label48:
      return localo3;
      label54:
      throw localo3;
    }
    return localo3;
  }
  
  public static Class c()
  {
    try
    {
      Class localClass = Class.forName("androidx.datastore.preferences.protobuf.Extension");
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return null;
  }
  
  public w.c a(O paramO, int paramInt)
  {
    a.a(a.get(new a(paramO, paramInt)));
    return null;
  }
  
  public static final class a
  {
    public final Object a;
    public final int b;
    
    public a(Object paramObject, int paramInt)
    {
      a = paramObject;
      b = paramInt;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof a;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (a)paramObject;
      bool1 = bool2;
      if (a == a)
      {
        bool1 = bool2;
        if (b == b) {
          bool1 = true;
        }
      }
      return bool1;
    }
    
    public int hashCode()
    {
      return System.identityHashCode(a) * 65535 + b;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */