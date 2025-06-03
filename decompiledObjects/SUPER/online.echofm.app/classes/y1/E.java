package y1;

import kotlin.jvm.internal.Intrinsics;

public final class E
{
  public int a;
  public D b = D.o;
  
  public final int a()
  {
    return a;
  }
  
  public final D b()
  {
    return b;
  }
  
  public final void c(int paramInt)
  {
    a = paramInt;
  }
  
  public final void d(D paramD)
  {
    Intrinsics.checkNotNullParameter(paramD, "<set-?>");
    b = paramD;
  }
}

/* Location:
 * Qualified Name:     y1.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */