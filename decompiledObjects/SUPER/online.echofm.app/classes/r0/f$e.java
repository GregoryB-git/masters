package r0;

import d0.m;

public abstract class f$e
  implements Comparable
{
  public final String o;
  public final f.d p;
  public final long q;
  public final int r;
  public final long s;
  public final m t;
  public final String u;
  public final String v;
  public final long w;
  public final long x;
  public final boolean y;
  
  public f$e(String paramString1, f.d paramd, long paramLong1, int paramInt, long paramLong2, m paramm, String paramString2, String paramString3, long paramLong3, long paramLong4, boolean paramBoolean)
  {
    o = paramString1;
    p = paramd;
    q = paramLong1;
    r = paramInt;
    s = paramLong2;
    t = paramm;
    u = paramString2;
    v = paramString3;
    w = paramLong3;
    x = paramLong4;
    y = paramBoolean;
  }
  
  public int c(Long paramLong)
  {
    int i;
    if (s > paramLong.longValue()) {
      i = 1;
    } else if (s < paramLong.longValue()) {
      i = -1;
    } else {
      i = 0;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     r0.f.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */