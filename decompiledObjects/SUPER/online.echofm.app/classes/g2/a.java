package g2;

import java.util.Arrays;

public final class a
  extends f
{
  public final Iterable a;
  public final byte[] b;
  
  public a(Iterable paramIterable, byte[] paramArrayOfByte)
  {
    a = paramIterable;
    b = paramArrayOfByte;
  }
  
  public Iterable b()
  {
    return a;
  }
  
  public byte[] c()
  {
    return b;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f))
    {
      paramObject = (f)paramObject;
      if (a.equals(((f)paramObject).b()))
      {
        byte[] arrayOfByte = b;
        if ((paramObject instanceof a)) {
          paramObject = b;
        } else {
          paramObject = ((f)paramObject).c();
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
    localStringBuilder.append("BackendRequest{events=");
    localStringBuilder.append(a);
    localStringBuilder.append(", extras=");
    localStringBuilder.append(Arrays.toString(b));
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class b
    extends f.a
  {
    public Iterable a;
    public byte[] b;
    
    public f a()
    {
      Object localObject1 = a;
      Object localObject2 = "";
      if (localObject1 == null)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("");
        ((StringBuilder)localObject2).append(" events");
        localObject2 = ((StringBuilder)localObject2).toString();
      }
      if (((String)localObject2).isEmpty()) {
        return new a(a, b, null);
      }
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Missing required properties:");
      ((StringBuilder)localObject1).append((String)localObject2);
      throw new IllegalStateException(((StringBuilder)localObject1).toString());
    }
    
    public f.a b(Iterable paramIterable)
    {
      if (paramIterable != null)
      {
        a = paramIterable;
        return this;
      }
      throw new NullPointerException("Null events");
    }
    
    public f.a c(byte[] paramArrayOfByte)
    {
      b = paramArrayOfByte;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     g2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */