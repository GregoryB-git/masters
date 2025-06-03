package m8;

import a0.j;
import f;

public final class t
  extends f0.e.d.a.c
{
  public final String a;
  public final int b;
  public final int c;
  public final boolean d;
  
  public t(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    a = paramString;
    b = paramInt1;
    c = paramInt2;
    d = paramBoolean;
  }
  
  public final int a()
  {
    return c;
  }
  
  public final int b()
  {
    return b;
  }
  
  public final String c()
  {
    return a;
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
    if ((paramObject instanceof f0.e.d.a.c))
    {
      paramObject = (f0.e.d.a.c)paramObject;
      if ((!a.equals(((f0.e.d.a.c)paramObject).c())) || (b != ((f0.e.d.a.c)paramObject).b()) || (c != ((f0.e.d.a.c)paramObject).a()) || (d != ((f0.e.d.a.c)paramObject).d())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = a.hashCode();
    int j = b;
    int k = c;
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
    StringBuilder localStringBuilder = f.l("ProcessDetails{processName=");
    localStringBuilder.append(a);
    localStringBuilder.append(", pid=");
    localStringBuilder.append(b);
    localStringBuilder.append(", importance=");
    localStringBuilder.append(c);
    localStringBuilder.append(", defaultProcess=");
    localStringBuilder.append(d);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public static final class a
    extends f0.e.d.a.c.a
  {
    public String a;
    public int b;
    public int c;
    public boolean d;
    public byte e;
    
    public final t a()
    {
      if (e == 7)
      {
        localObject = a;
        if (localObject != null) {
          return new t((String)localObject, b, c, d);
        }
      }
      Object localObject = new StringBuilder();
      if (a == null) {
        ((StringBuilder)localObject).append(" processName");
      }
      if ((e & 0x1) == 0) {
        ((StringBuilder)localObject).append(" pid");
      }
      if ((e & 0x2) == 0) {
        ((StringBuilder)localObject).append(" importance");
      }
      if ((e & 0x4) == 0) {
        ((StringBuilder)localObject).append(" defaultProcess");
      }
      throw new IllegalStateException(j.l("Missing required properties:", (StringBuilder)localObject));
    }
  }
}

/* Location:
 * Qualified Name:     m8.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */