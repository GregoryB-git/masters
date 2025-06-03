package l6;

public final class c
  extends a
{
  public static final a s = new a(null);
  public static final c t = new c(1, 0);
  
  public c(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2, 1);
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof c)) {
      if ((!isEmpty()) || (!((c)paramObject).isEmpty()))
      {
        int i = a();
        paramObject = (c)paramObject;
        if ((i != ((a)paramObject).a()) || (d() != ((a)paramObject).d())) {}
      }
      else
      {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public int hashCode()
  {
    int i;
    if (isEmpty()) {
      i = -1;
    } else {
      i = a() * 31 + d();
    }
    return i;
  }
  
  public boolean isEmpty()
  {
    boolean bool;
    if (a() > d()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Integer k()
  {
    return Integer.valueOf(d());
  }
  
  public Integer q()
  {
    return Integer.valueOf(a());
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a());
    localStringBuilder.append("..");
    localStringBuilder.append(d());
    return localStringBuilder.toString();
  }
  
  public static final class a
  {
    public final c a()
    {
      return c.i();
    }
  }
}

/* Location:
 * Qualified Name:     l6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */