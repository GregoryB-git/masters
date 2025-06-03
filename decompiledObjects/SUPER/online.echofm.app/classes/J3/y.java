package J3;

import E3.e;

public final class y
  extends D.a
{
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final int e;
  public final e f;
  
  public y(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, e parame)
  {
    if (paramString1 != null)
    {
      a = paramString1;
      if (paramString2 != null)
      {
        b = paramString2;
        if (paramString3 != null)
        {
          c = paramString3;
          if (paramString4 != null)
          {
            d = paramString4;
            e = paramInt;
            if (parame != null)
            {
              f = parame;
              return;
            }
            throw new NullPointerException("Null developmentPlatformProvider");
          }
          throw new NullPointerException("Null installUuid");
        }
        throw new NullPointerException("Null versionName");
      }
      throw new NullPointerException("Null versionCode");
    }
    throw new NullPointerException("Null appIdentifier");
  }
  
  public String a()
  {
    return a;
  }
  
  public int c()
  {
    return e;
  }
  
  public e d()
  {
    return f;
  }
  
  public String e()
  {
    return d;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof D.a))
    {
      paramObject = (D.a)paramObject;
      if ((!a.equals(((D.a)paramObject).a())) || (!b.equals(((D.a)paramObject).f())) || (!c.equals(((D.a)paramObject).g())) || (!d.equals(((D.a)paramObject).e())) || (e != ((D.a)paramObject).c()) || (!f.equals(((D.a)paramObject).d()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public String f()
  {
    return b;
  }
  
  public String g()
  {
    return c;
  }
  
  public int hashCode()
  {
    return (((((a.hashCode() ^ 0xF4243) * 1000003 ^ b.hashCode()) * 1000003 ^ c.hashCode()) * 1000003 ^ d.hashCode()) * 1000003 ^ e) * 1000003 ^ f.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AppData{appIdentifier=");
    localStringBuilder.append(a);
    localStringBuilder.append(", versionCode=");
    localStringBuilder.append(b);
    localStringBuilder.append(", versionName=");
    localStringBuilder.append(c);
    localStringBuilder.append(", installUuid=");
    localStringBuilder.append(d);
    localStringBuilder.append(", deliveryMechanism=");
    localStringBuilder.append(e);
    localStringBuilder.append(", developmentPlatformProvider=");
    localStringBuilder.append(f);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     J3.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */