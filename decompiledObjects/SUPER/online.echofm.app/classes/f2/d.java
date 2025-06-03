package f2;

import java.util.Arrays;

public final class d
  extends p
{
  public final String a;
  public final byte[] b;
  public final c2.d c;
  
  public d(String paramString, byte[] paramArrayOfByte, c2.d paramd)
  {
    a = paramString;
    b = paramArrayOfByte;
    c = paramd;
  }
  
  public String b()
  {
    return a;
  }
  
  public byte[] c()
  {
    return b;
  }
  
  public c2.d d()
  {
    return c;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof p))
    {
      p localp = (p)paramObject;
      if (a.equals(localp.b()))
      {
        byte[] arrayOfByte = b;
        if ((localp instanceof d)) {
          paramObject = b;
        } else {
          paramObject = localp.c();
        }
        if ((Arrays.equals(arrayOfByte, (byte[])paramObject)) && (c.equals(localp.d()))) {}
      }
      else
      {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    return ((a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(b)) * 1000003 ^ c.hashCode();
  }
  
  public static final class b
    extends p.a
  {
    public String a;
    public byte[] b;
    public c2.d c;
    
    public p a()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("");
        ((StringBuilder)localObject2).append(" backendName");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (c == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" priority");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      if (((String)localObject1).isEmpty()) {
        return new d(a, b, c, null);
      }
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Missing required properties:");
      ((StringBuilder)localObject2).append((String)localObject1);
      throw new IllegalStateException(((StringBuilder)localObject2).toString());
    }
    
    public p.a b(String paramString)
    {
      if (paramString != null)
      {
        a = paramString;
        return this;
      }
      throw new NullPointerException("Null backendName");
    }
    
    public p.a c(byte[] paramArrayOfByte)
    {
      b = paramArrayOfByte;
      return this;
    }
    
    public p.a d(c2.d paramd)
    {
      if (paramd != null)
      {
        c = paramd;
        return this;
      }
      throw new NullPointerException("Null priority");
    }
  }
}

/* Location:
 * Qualified Name:     f2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */