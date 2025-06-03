package f2;

import android.util.Base64;
import c2.d;

public abstract class p
{
  public static a a()
  {
    return new d.b().d(d.o);
  }
  
  public abstract String b();
  
  public abstract byte[] c();
  
  public abstract d d();
  
  public boolean e()
  {
    boolean bool;
    if (c() != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public p f(d paramd)
  {
    return a().b(b()).d(paramd).c(c()).a();
  }
  
  public final String toString()
  {
    String str1 = b();
    d locald = d();
    String str2;
    if (c() == null) {
      str2 = "";
    } else {
      str2 = Base64.encodeToString(c(), 2);
    }
    return String.format("TransportContext(%s, %s, %s)", new Object[] { str1, locald, str2 });
  }
  
  public static abstract class a
  {
    public abstract p a();
    
    public abstract a b(String paramString);
    
    public abstract a c(byte[] paramArrayOfByte);
    
    public abstract a d(d paramd);
  }
}

/* Location:
 * Qualified Name:     f2.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */