package f5;

import a4.d;

public class e$d
  implements Comparable<Long>
{
  public final String a;
  public final e.c b;
  public final long c;
  public final int d;
  public final long e;
  public final d f;
  public final String o;
  public final String p;
  public final long q;
  public final long r;
  public final boolean s;
  
  public e$d(String paramString1, e.c paramc, long paramLong1, int paramInt, long paramLong2, d paramd, String paramString2, String paramString3, long paramLong3, long paramLong4, boolean paramBoolean)
  {
    a = paramString1;
    b = paramc;
    c = paramLong1;
    d = paramInt;
    e = paramLong2;
    f = paramd;
    o = paramString2;
    p = paramString3;
    q = paramLong3;
    r = paramLong4;
    s = paramBoolean;
  }
  
  public final int compareTo(Object paramObject)
  {
    paramObject = (Long)paramObject;
    int i;
    if (e > ((Long)paramObject).longValue()) {
      i = 1;
    } else if (e < ((Long)paramObject).longValue()) {
      i = -1;
    } else {
      i = 0;
    }
    return i;
  }
}

/* Location:
 * Qualified Name:     f5.e.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */