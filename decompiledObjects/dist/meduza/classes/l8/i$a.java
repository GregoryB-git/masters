package l8;

import a0.j;

public final class i$a
{
  public static final a c = new a(0, 0);
  public final int a;
  public final int b;
  
  public i$a(int paramInt1, int paramInt2)
  {
    a = paramInt1;
    b = paramInt2;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(a.class.getSimpleName());
    localStringBuilder.append("[position = ");
    localStringBuilder.append(a);
    localStringBuilder.append(", length = ");
    return j.m(localStringBuilder, b, "]");
  }
}

/* Location:
 * Qualified Name:     l8.i.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */