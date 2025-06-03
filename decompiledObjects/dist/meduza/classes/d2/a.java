package d2;

import android.os.Build;
import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public abstract class a
  implements p
{
  public static final HashSet c = new HashSet();
  public final String a;
  public final String b;
  
  public a(String paramString1, String paramString2)
  {
    a = paramString1;
    b = paramString2;
    c.add(this);
  }
  
  public final String a()
  {
    return a;
  }
  
  public final boolean b()
  {
    boolean bool;
    if ((!c()) && (!d())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public abstract boolean c();
  
  public boolean d()
  {
    HashSet localHashSet = a.a;
    String str = b;
    boolean bool1 = localHashSet.contains(str);
    boolean bool2 = false;
    if (!bool1)
    {
      Object localObject = Build.TYPE;
      int i;
      if ((!"eng".equals(localObject)) && (!"userdebug".equals(localObject))) {
        i = 0;
      } else {
        i = 1;
      }
      bool1 = bool2;
      if (i != 0)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(str);
        ((StringBuilder)localObject).append(":dev");
        bool1 = bool2;
        if (!localHashSet.contains(((StringBuilder)localObject).toString())) {}
      }
    }
    else
    {
      bool1 = true;
    }
    return bool1;
  }
  
  public static final class a
  {
    public static final HashSet a = new HashSet(Arrays.asList(j0.b.a.a()));
  }
  
  public static final class b
    extends a
  {
    public b(String paramString1, String paramString2)
    {
      super(paramString2);
    }
    
    public final boolean c()
    {
      return true;
    }
  }
  
  public static final class c
    extends a
  {
    public c(String paramString1, String paramString2)
    {
      super(paramString2);
    }
    
    public final boolean c()
    {
      boolean bool;
      if (Build.VERSION.SDK_INT >= 24) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static class d
    extends a
  {
    public d(String paramString1, String paramString2)
    {
      super(paramString2);
    }
    
    public final boolean c()
    {
      return false;
    }
  }
  
  public static final class e
    extends a
  {
    public e(String paramString1, String paramString2)
    {
      super(paramString2);
    }
    
    public final boolean c()
    {
      boolean bool;
      if (Build.VERSION.SDK_INT >= 26) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static final class f
    extends a
  {
    public f(String paramString1, String paramString2)
    {
      super(paramString2);
    }
    
    public final boolean c()
    {
      boolean bool;
      if (Build.VERSION.SDK_INT >= 27) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static final class g
    extends a
  {
    public g()
    {
      super("TRACING_CONTROLLER_BASIC_USAGE");
    }
    
    public final boolean c()
    {
      boolean bool;
      if (Build.VERSION.SDK_INT >= 28) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static final class h
    extends a
  {
    public h(String paramString1, String paramString2)
    {
      super(paramString2);
    }
    
    public final boolean c()
    {
      boolean bool;
      if (Build.VERSION.SDK_INT >= 29) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static class i
    extends a
  {
    public i()
    {
      super("ALGORITHMIC_DARKENING");
    }
    
    public final boolean c()
    {
      boolean bool;
      if (Build.VERSION.SDK_INT >= 33) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     d2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */