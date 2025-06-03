package r0;

import X2.v;
import d0.m;
import java.util.ArrayList;
import java.util.List;

public final class f$d
  extends f.e
{
  public final List A;
  public final String z;
  
  public f$d(String paramString1, long paramLong1, long paramLong2, String paramString2, String paramString3)
  {
    this(paramString1, null, "", 0L, -1, -9223372036854775807L, null, paramString2, paramString3, paramLong1, paramLong2, false, v.Y());
  }
  
  public f$d(String paramString1, d paramd, String paramString2, long paramLong1, int paramInt, long paramLong2, m paramm, String paramString3, String paramString4, long paramLong3, long paramLong4, boolean paramBoolean, List paramList)
  {
    super(paramString1, paramd, paramLong1, paramInt, paramLong2, paramm, paramString3, paramString4, paramLong3, paramLong4, paramBoolean, null);
    z = paramString2;
    A = v.U(paramList);
  }
  
  public d e(long paramLong, int paramInt)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    long l = paramLong;
    while (i < A.size())
    {
      f.b localb = (f.b)A.get(i);
      localArrayList.add(localb.e(l, paramInt));
      l += q;
      i++;
    }
    return new d(o, p, z, q, paramInt, paramLong, t, u, v, w, x, y, localArrayList);
  }
}

/* Location:
 * Qualified Name:     r0.f.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */