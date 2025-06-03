package androidx.media3.exoplayer.dash;

import X2.v;

public final class b$a
{
  public final int[] a;
  public final int b;
  public final int c;
  public final int d;
  public final int e;
  public final int f;
  public final int g;
  public final v h;
  
  public b$a(int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3, int paramInt4, int paramInt5, int paramInt6, v paramv)
  {
    b = paramInt1;
    a = paramArrayOfInt;
    c = paramInt2;
    e = paramInt3;
    f = paramInt4;
    g = paramInt5;
    d = paramInt6;
    h = paramv;
  }
  
  public static a a(int[] paramArrayOfInt, int paramInt, v paramv)
  {
    return new a(3, 1, paramArrayOfInt, paramInt, -1, -1, -1, paramv);
  }
  
  public static a b(int[] paramArrayOfInt, int paramInt)
  {
    return new a(5, 1, paramArrayOfInt, paramInt, -1, -1, -1, v.Y());
  }
  
  public static a c(int paramInt)
  {
    v localv = v.Y();
    return new a(5, 2, new int[0], -1, -1, -1, paramInt, localv);
  }
  
  public static a d(int paramInt1, int[] paramArrayOfInt, int paramInt2, int paramInt3, int paramInt4)
  {
    return new a(paramInt1, 0, paramArrayOfInt, paramInt2, paramInt3, paramInt4, -1, v.Y());
  }
}

/* Location:
 * Qualified Name:     androidx.media3.exoplayer.dash.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */