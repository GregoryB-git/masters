package k3;

import g;
import h3.e;
import java.util.Arrays;

public final class j
  extends s
{
  public final String a;
  public final byte[] b;
  public final e c;
  
  public j(String paramString, byte[] paramArrayOfByte, e parame)
  {
    a = paramString;
    b = paramArrayOfByte;
    c = parame;
  }
  
  public final String b()
  {
    return a;
  }
  
  public final byte[] c()
  {
    return b;
  }
  
  public final e d()
  {
    return c;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof s))
    {
      s locals = (s)paramObject;
      if (a.equals(locals.b()))
      {
        byte[] arrayOfByte = b;
        if ((locals instanceof j)) {
          paramObject = b;
        } else {
          paramObject = locals.c();
        }
        if ((Arrays.equals(arrayOfByte, (byte[])paramObject)) && (c.equals(locals.d()))) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return ((a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(b)) * 1000003 ^ c.hashCode();
  }
  
  public static final class a
    extends s.a
  {
    public String a;
    public byte[] b;
    public e c;
    
    public final j a()
    {
      String str1;
      if (a == null) {
        str1 = " backendName";
      } else {
        str1 = "";
      }
      String str2 = str1;
      if (c == null) {
        str2 = g.d(str1, " priority");
      }
      if (str2.isEmpty()) {
        return new j(a, b, c);
      }
      throw new IllegalStateException(g.d("Missing required properties:", str2));
    }
    
    public final a b(String paramString)
    {
      if (paramString != null)
      {
        a = paramString;
        return this;
      }
      throw new NullPointerException("Null backendName");
    }
    
    public final a c(e parame)
    {
      if (parame != null)
      {
        c = parame;
        return this;
      }
      throw new NullPointerException("Null priority");
    }
  }
}

/* Location:
 * Qualified Name:     k3.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */