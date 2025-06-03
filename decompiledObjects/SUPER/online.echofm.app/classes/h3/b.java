package h3;

import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

public abstract class b
{
  public static final Logger a = Logger.getLogger(b.class.getName());
  public static final AtomicBoolean b = new AtomicBoolean(false);
  
  public static Boolean a()
  {
    try
    {
      Boolean localBoolean = (Boolean)Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
      return localBoolean;
    }
    catch (Exception localException)
    {
      a.info("Conscrypt is not available or does not support checking for FIPS build.");
    }
    return Boolean.FALSE;
  }
  
  public static boolean b()
  {
    return a().booleanValue();
  }
  
  public static boolean c()
  {
    boolean bool;
    if ((!a.a()) && (!b.get())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static abstract enum b
  {
    static
    {
      a locala = new a("ALGORITHM_NOT_FIPS", 0);
      o = locala;
      b localb = new b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
      p = localb;
      q = new b[] { locala, localb };
    }
    
    public abstract boolean c();
    
    public enum a
    {
      public a()
      {
        super(paramInt, null);
      }
      
      public boolean c()
      {
        return b.c() ^ true;
      }
    }
    
    public enum b
    {
      public b()
      {
        super(paramInt, null);
      }
      
      public boolean c()
      {
        boolean bool;
        if ((b.c()) && (!b.b())) {
          bool = false;
        } else {
          bool = true;
        }
        return bool;
      }
    }
  }
}

/* Location:
 * Qualified Name:     h3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */