package J3;

import java.util.Arrays;

public final class g
  extends B.d.b
{
  public final String a;
  public final byte[] b;
  
  public g(String paramString, byte[] paramArrayOfByte)
  {
    a = paramString;
    b = paramArrayOfByte;
  }
  
  public byte[] b()
  {
    return b;
  }
  
  public String c()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof B.d.b))
    {
      paramObject = (B.d.b)paramObject;
      if (a.equals(((B.d.b)paramObject).c()))
      {
        byte[] arrayOfByte = b;
        if ((paramObject instanceof g)) {
          paramObject = b;
        } else {
          paramObject = ((B.d.b)paramObject).b();
        }
        if (Arrays.equals(arrayOfByte, (byte[])paramObject)) {}
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
    return (a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(b);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("File{filename=");
    localStringBuilder.append(a);
    localStringBuilder.append(", contents=");
    localStringBuilder.append(Arrays.toString(b));
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends B.d.b.a
  {
    public String a;
    public byte[] b;
    
    public B.d.b a()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("");
        ((StringBuilder)localObject2).append(" filename");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      localObject1 = localObject2;
      if (b == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" contents");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      if (((String)localObject1).isEmpty()) {
        return new g(a, b, null);
      }
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Missing required properties:");
      ((StringBuilder)localObject2).append((String)localObject1);
      throw new IllegalStateException(((StringBuilder)localObject2).toString());
    }
    
    public B.d.b.a b(byte[] paramArrayOfByte)
    {
      if (paramArrayOfByte != null)
      {
        b = paramArrayOfByte;
        return this;
      }
      throw new NullPointerException("Null contents");
    }
    
    public B.d.b.a c(String paramString)
    {
      if (paramString != null)
      {
        a = paramString;
        return this;
      }
      throw new NullPointerException("Null filename");
    }
  }
}

/* Location:
 * Qualified Name:     J3.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */