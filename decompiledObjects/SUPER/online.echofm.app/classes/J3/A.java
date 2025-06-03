package J3;

public final class A
  extends D.c
{
  public final String a;
  public final String b;
  public final boolean c;
  
  public A(String paramString1, String paramString2, boolean paramBoolean)
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
  
  public boolean b()
  {
    return c;
  }
  
  public String c()
  {
    return b;
  }
  
  public String d()
  {
    return a;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof D.c))
    {
      paramObject = (D.c)paramObject;
      if ((!a.equals(((D.c)paramObject).d())) || (!b.equals(((D.c)paramObject).c())) || (c != ((D.c)paramObject).b())) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
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
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("OsData{osRelease=");
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
 * Qualified Name:     J3.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */