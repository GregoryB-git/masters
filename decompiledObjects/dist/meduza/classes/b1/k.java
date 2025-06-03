package b1;

import ec.i;
import java.util.concurrent.atomic.AtomicReference;

public abstract class k
{
  public k()
  {
    new AtomicReference();
  }
  
  public abstract void a(n paramn);
  
  public abstract b b();
  
  public abstract void c(n paramn);
  
  public static enum a
  {
    public static final a Companion = new a();
    
    static
    {
      a locala1 = new a("ON_CREATE", 0);
      ON_CREATE = locala1;
      a locala2 = new a("ON_START", 1);
      ON_START = locala2;
      a locala3 = new a("ON_RESUME", 2);
      ON_RESUME = locala3;
      a locala4 = new a("ON_PAUSE", 3);
      ON_PAUSE = locala4;
      a locala5 = new a("ON_STOP", 4);
      ON_STOP = locala5;
      a locala6 = new a("ON_DESTROY", 5);
      ON_DESTROY = locala6;
      a locala7 = new a("ON_ANY", 6);
      ON_ANY = locala7;
      $VALUES = new a[] { locala1, locala2, locala3, locala4, locala5, locala6, locala7 };
    }
    
    public a() {}
    
    public final k.b f()
    {
      switch (b.a[ordinal()])
      {
      default: 
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(this);
        localStringBuilder.append(" has no target state");
        throw new IllegalArgumentException(localStringBuilder.toString());
      case 6: 
        return k.b.a;
      case 5: 
        return k.b.e;
      case 3: 
      case 4: 
        return k.b.d;
      }
      return k.b.c;
    }
    
    public static final class a
    {
      public static k.a a(k.b paramb)
      {
        i.e(paramb, "state");
        int i = paramb.ordinal();
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4) {
              paramb = null;
            } else {
              paramb = k.a.ON_PAUSE;
            }
          }
          else {
            paramb = k.a.ON_STOP;
          }
        }
        else {
          paramb = k.a.ON_DESTROY;
        }
        return paramb;
      }
      
      public static k.a b(k.b paramb)
      {
        i.e(paramb, "state");
        int i = paramb.ordinal();
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3) {
              paramb = null;
            } else {
              paramb = k.a.ON_RESUME;
            }
          }
          else {
            paramb = k.a.ON_START;
          }
        }
        else {
          paramb = k.a.ON_CREATE;
        }
        return paramb;
      }
    }
  }
  
  public static enum b
  {
    static
    {
      b localb1 = new b("DESTROYED", 0);
      a = localb1;
      b localb2 = new b("INITIALIZED", 1);
      b = localb2;
      b localb3 = new b("CREATED", 2);
      c = localb3;
      b localb4 = new b("STARTED", 3);
      d = localb4;
      b localb5 = new b("RESUMED", 4);
      e = localb5;
      f = new b[] { localb1, localb2, localb3, localb4, localb5 };
    }
    
    public b() {}
    
    public final boolean f(b paramb)
    {
      boolean bool;
      if (compareTo(paramb) >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     b1.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */