package r5;

import v5.m;
import z4.i0;

public final class h$a
{
  public final i0 a;
  public final int[] b;
  public final int c;
  
  public h$a() {}
  
  public h$a(int paramInt, i0 parami0, int[] paramArrayOfInt)
  {
    if (paramArrayOfInt.length == 0) {
      m.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
    }
    a = parami0;
    b = paramArrayOfInt;
    c = paramInt;
  }
}

/* Location:
 * Qualified Name:     r5.h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */