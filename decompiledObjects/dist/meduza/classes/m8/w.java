package m8;

import a0.j;
import f;

public final class w
  extends f0.e.d.e
{
  public final f0.e.d.e.b a;
  public final String b;
  public final String c;
  public final long d;
  
  public w(f0.e.d.e.b paramb, String paramString1, String paramString2, long paramLong)
  {
    a = paramb;
    b = paramString1;
    c = paramString2;
    d = paramLong;
  }
  
  public final String a()
  {
    return b;
  }
  
  public final String b()
  {
    return c;
  }
  
  public final f0.e.d.e.b c()
  {
    return a;
  }
  
  public final long d()
  {
    return d;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.e.d.e))
    {
      paramObject = (f0.e.d.e)paramObject;
      if ((!a.equals(((f0.e.d.e)paramObject).c())) || (!b.equals(((f0.e.d.e)paramObject).a())) || (!c.equals(((f0.e.d.e)paramObject).b())) || (d != ((f0.e.d.e)paramObject).d())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b.hashCode();
    int k = c.hashCode();
    long l = d;
    return (((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ (int)(l ^ l >>> 32);
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("RolloutAssignment{rolloutVariant=");
    localStringBuilder.append(a);
    localStringBuilder.append(", parameterKey=");
    localStringBuilder.append(b);
    localStringBuilder.append(", parameterValue=");
    localStringBuilder.append(c);
    localStringBuilder.append(", templateVersion=");
    localStringBuilder.append(d);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class a
    extends f0.e.d.e.a
  {
    public f0.e.d.e.b a;
    public String b;
    public String c;
    public long d;
    public byte e;
    
    public final w a()
    {
      if (e == 1)
      {
        f0.e.d.e.b localb = a;
        if (localb != null)
        {
          localObject = b;
          if (localObject != null)
          {
            String str = c;
            if (str != null) {
              return new w(localb, (String)localObject, str, d);
            }
          }
        }
      }
      Object localObject = new StringBuilder();
      if (a == null) {
        ((StringBuilder)localObject).append(" rolloutVariant");
      }
      if (b == null) {
        ((StringBuilder)localObject).append(" parameterKey");
      }
      if (c == null) {
        ((StringBuilder)localObject).append(" parameterValue");
      }
      if ((0x1 & e) == 0) {
        ((StringBuilder)localObject).append(" templateVersion");
      }
      throw new IllegalStateException(j.l("Missing required properties:", (StringBuilder)localObject));
    }
  }
}

/* Location:
 * Qualified Name:     m8.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */