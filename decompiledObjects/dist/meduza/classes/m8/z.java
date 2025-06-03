package m8;

import a0.j;
import f;

public final class z
  extends f0.e.e
{
  public final int a;
  public final String b;
  public final String c;
  public final boolean d;
  
  public z(int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    a = paramInt;
    b = paramString1;
    c = paramString2;
    d = paramBoolean;
  }
  
  public final String a()
  {
    return c;
  }
  
  public final int b()
  {
    return a;
  }
  
  public final String c()
  {
    return b;
  }
  
  public final boolean d()
  {
    return d;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.e.e))
    {
      paramObject = (f0.e.e)paramObject;
      if ((a != ((f0.e.e)paramObject).b()) || (!b.equals(((f0.e.e)paramObject).c())) || (!c.equals(((f0.e.e)paramObject).a())) || (d != ((f0.e.e)paramObject).d())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a;
    int j = b.hashCode();
    int k = c.hashCode();
    int m;
    if (d) {
      m = 1231;
    } else {
      m = 1237;
    }
    return (((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ m;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("OperatingSystem{platform=");
    localStringBuilder.append(a);
    localStringBuilder.append(", version=");
    localStringBuilder.append(b);
    localStringBuilder.append(", buildVersion=");
    localStringBuilder.append(c);
    localStringBuilder.append(", jailbroken=");
    localStringBuilder.append(d);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class a
    extends f0.e.e.a
  {
    public int a;
    public String b;
    public String c;
    public boolean d;
    public byte e;
    
    public final z a()
    {
      if (e == 3)
      {
        String str = b;
        if (str != null)
        {
          localObject = c;
          if (localObject != null) {
            return new z(a, str, (String)localObject, d);
          }
        }
      }
      Object localObject = new StringBuilder();
      if ((e & 0x1) == 0) {
        ((StringBuilder)localObject).append(" platform");
      }
      if (b == null) {
        ((StringBuilder)localObject).append(" version");
      }
      if (c == null) {
        ((StringBuilder)localObject).append(" buildVersion");
      }
      if ((e & 0x2) == 0) {
        ((StringBuilder)localObject).append(" jailbroken");
      }
      throw new IllegalStateException(j.l("Missing required properties:", (StringBuilder)localObject));
    }
  }
}

/* Location:
 * Qualified Name:     m8.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */