package g5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import k4.k;
import v3.i0;
import y4.c;

public final class a
  implements y4.a<a>
{
  public final int a;
  public final int b;
  public final int c;
  public final boolean d;
  public final a e;
  public final b[] f;
  public final long g;
  public final long h;
  
  public a(int paramInt1, int paramInt2, long paramLong1, long paramLong2, int paramInt3, boolean paramBoolean, a parama, b[] paramArrayOfb)
  {
    a = paramInt1;
    b = paramInt2;
    g = paramLong1;
    h = paramLong2;
    c = paramInt3;
    d = paramBoolean;
    e = parama;
    f = paramArrayOfb;
  }
  
  public final Object a(List paramList)
  {
    ArrayList localArrayList1 = new ArrayList(paramList);
    Collections.sort(localArrayList1);
    ArrayList localArrayList2 = new ArrayList();
    ArrayList localArrayList3 = new ArrayList();
    paramList = null;
    int i = 0;
    while (i < localArrayList1.size())
    {
      c localc = (c)localArrayList1.get(i);
      b localb = f[b];
      if ((localb != paramList) && (paramList != null))
      {
        localArrayList2.add(paramList.a((i0[])localArrayList3.toArray(new i0[0])));
        localArrayList3.clear();
      }
      localArrayList3.add(j[c]);
      i++;
      paramList = localb;
    }
    if (paramList != null) {
      localArrayList2.add(paramList.a((i0[])localArrayList3.toArray(new i0[0])));
    }
    paramList = (b[])localArrayList2.toArray(new b[0]);
    return new a(a, b, g, h, c, d, e, paramList);
  }
  
  public static final class a
  {
    public final UUID a;
    public final byte[] b;
    public final k[] c;
    
    public a(UUID paramUUID, byte[] paramArrayOfByte, k[] paramArrayOfk)
    {
      a = paramUUID;
      b = paramArrayOfByte;
      c = paramArrayOfk;
    }
  }
  
  public static final class b
  {
    public final int a;
    public final String b;
    public final long c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    public final i0[] j;
    public final int k;
    public final String l;
    public final String m;
    public final List<Long> n;
    public final long[] o;
    public final long p;
    
    public b() {}
    
    public b(String paramString1, String paramString2, int paramInt1, String paramString3, long paramLong1, String paramString4, int paramInt2, int paramInt3, int paramInt4, int paramInt5, String paramString5, i0[] paramArrayOfi0, List<Long> paramList, long[] paramArrayOfLong, long paramLong2)
    {
      l = paramString1;
      m = paramString2;
      a = paramInt1;
      b = paramString3;
      c = paramLong1;
      d = paramString4;
      e = paramInt2;
      f = paramInt3;
      g = paramInt4;
      h = paramInt5;
      i = paramString5;
      j = paramArrayOfi0;
      n = paramList;
      o = paramArrayOfLong;
      p = paramLong2;
      k = paramList.size();
    }
    
    public final b a(i0[] paramArrayOfi0)
    {
      return new b(l, m, a, b, c, d, e, f, g, h, i, paramArrayOfi0, n, o, p);
    }
    
    public final long b(int paramInt)
    {
      long l1;
      if (paramInt == k - 1)
      {
        l1 = p;
      }
      else
      {
        long[] arrayOfLong = o;
        l1 = arrayOfLong[(paramInt + 1)] - arrayOfLong[paramInt];
      }
      return l1;
    }
  }
}

/* Location:
 * Qualified Name:     g5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */