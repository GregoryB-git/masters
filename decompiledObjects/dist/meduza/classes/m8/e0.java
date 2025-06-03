package m8;

import f;

public final class e0
  extends g0.c
{
  public final String a;
  public final String b;
  public final boolean c;
  
  public e0(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (paramString1 != null)
    {
      a = paramString1;
      if (paramString2 != null)
      {
        b = paramString2;
        c = paramBoolean;
        return;
      }
      throw new NullPointerException("Null osCodeName");
    }
    throw new NullPointerException("Null osRelease");
  }
  
  public final boolean a()
  {
    return c;
  }
  
  public final String b()
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
    if ((paramObject instanceof g0.c))
    {
      paramObject = (g0.c)paramObject;
      if ((!a.equals(((g0.c)paramObject).c())) || (!b.equals(((g0.c)paramObject).b())) || (c != ((g0.c)paramObject).a())) {
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
    int k;
    if (c) {
      k = 1231;
    } else {
      k = 1237;
    }
    return ((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = f.l("OsData{osRelease=");
    localStringBuilder.append(a);
    localStringBuilder.append(", osCodeName=");
    localStringBuilder.append(b);
    localStringBuilder.append(", isRooted=");
    localStringBuilder.append(c);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     m8.e0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */