package m8;

import f;
import g8.c;

public final class c0
  extends g0.a
{
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final int e;
  public final c f;
  
  public c0(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt, c paramc)
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
            if (paramc != null)
            {
              f = paramc;
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
  
  public final String a()
  {
    return a;
  }
  
  public final int b()
  {
    return e;
  }
  
  public final c c()
  {
    return f;
  }
  
  public final String d()
  {
    return d;
  }
  
  public final String e()
  {
    return b;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof g0.a))
    {
      paramObject = (g0.a)paramObject;
      if ((!a.equals(((g0.a)paramObject).a())) || (!b.equals(((g0.a)paramObject).e())) || (!c.equals(((g0.a)paramObject).f())) || (!d.equals(((g0.a)paramObject).d())) || (e != ((g0.a)paramObject).b()) || (!f.equals(((g0.a)paramObject).c()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public final String f()
  {
    return c;
  }
  
  public final int hashCode()
  {
    return (((((a.hashCode() ^ 0xF4243) * 1000003 ^ b.hashCode()) * 1000003 ^ c.hashCode()) * 1000003 ^ d.hashCode()) * 1000003 ^ e) * 1000003 ^ f.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("AppData{appIdentifier=");
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
 * Qualified Name:     m8.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */