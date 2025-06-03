package m8;

import f;
import java.util.List;

public final class r
  extends f0.e.d.a.b.d
{
  public final String a;
  public final int b;
  public final List<f0.e.d.a.b.d.a> c;
  
  public r() {}
  
  public r(String paramString, int paramInt, List paramList)
  {
    a = paramString;
    b = paramInt;
    c = paramList;
  }
  
  public final List<f0.e.d.a.b.d.a> a()
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
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.e.d.a.b.d))
    {
      paramObject = (f0.e.d.a.b.d)paramObject;
      if ((!a.equals(((f0.e.d.a.b.d)paramObject).c())) || (b != ((f0.e.d.a.b.d)paramObject).b()) || (!c.equals(((f0.e.d.a.b.d)paramObject).a()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final int hashCode()
  {
    return ((a.hashCode() ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ c.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("Thread{name=");
    localStringBuilder.append(a);
    localStringBuilder.append(", importance=");
    localStringBuilder.append(b);
    localStringBuilder.append(", frames=");
    localStringBuilder.append(c);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     m8.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */