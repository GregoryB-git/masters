package m8;

import g;
import java.util.List;

public final class f
  extends f0.d
{
  public final List<f0.d.a> a;
  public final String b;
  
  public f(List paramList, String paramString)
  {
    a = paramList;
    b = paramString;
  }
  
  public final List<f0.d.a> a()
  {
    return a;
  }
  
  public final String b()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof f0.d))
    {
      Object localObject = (f0.d)paramObject;
      if (a.equals(((f0.d)localObject).a()))
      {
        paramObject = b;
        localObject = ((f0.d)localObject).b();
        if (paramObject == null ? localObject == null : ((String)paramObject).equals(localObject)) {}
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
    int i = a.hashCode();
    String str = b;
    int j;
    if (str == null) {
      j = 0;
    } else {
      j = str.hashCode();
    }
    return (i ^ 0xF4243) * 1000003 ^ j;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("FilesPayload{files=");
    localStringBuilder.append(a);
    localStringBuilder.append(", orgId=");
    return g.f(localStringBuilder, b, "}");
  }
}

/* Location:
 * Qualified Name:     m8.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */