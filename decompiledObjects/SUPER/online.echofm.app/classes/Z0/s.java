package Z0;

import d0.q;

public final class s
{
  public final int a;
  public final int b;
  public final long c;
  public final long d;
  public final long e;
  public final q f;
  public final int g;
  public final long[] h;
  public final long[] i;
  public final int j;
  public final t[] k;
  
  public s(int paramInt1, int paramInt2, long paramLong1, long paramLong2, long paramLong3, q paramq, int paramInt3, t[] paramArrayOft, int paramInt4, long[] paramArrayOfLong1, long[] paramArrayOfLong2)
  {
    a = paramInt1;
    b = paramInt2;
    c = paramLong1;
    d = paramLong2;
    e = paramLong3;
    f = paramq;
    g = paramInt3;
    k = paramArrayOft;
    j = paramInt4;
    h = paramArrayOfLong1;
    i = paramArrayOfLong2;
  }
  
  public t a(int paramInt)
  {
    Object localObject = k;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = localObject[paramInt];
    }
    return (t)localObject;
  }
}

/* Location:
 * Qualified Name:     Z0.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */