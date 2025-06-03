package m4;

public final class d0$d
{
  public final String a;
  public final int b;
  public final int c;
  public int d;
  public String e;
  
  public d0$d(int paramInt1, int paramInt2)
  {
    this(Integer.MIN_VALUE, paramInt1, paramInt2);
  }
  
  public d0$d(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject;
    if (paramInt1 != Integer.MIN_VALUE)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramInt1);
      ((StringBuilder)localObject).append("/");
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = "";
    }
    a = ((String)localObject);
    b = paramInt2;
    c = paramInt3;
    d = Integer.MIN_VALUE;
    e = "";
  }
  
  public final void a()
  {
    int i = d;
    if (i == Integer.MIN_VALUE) {
      i = b;
    } else {
      i += c;
    }
    d = i;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a);
    localStringBuilder.append(d);
    e = localStringBuilder.toString();
  }
  
  public final void b()
  {
    if (d != Integer.MIN_VALUE) {
      return;
    }
    throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
  }
}

/* Location:
 * Qualified Name:     m4.d0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */