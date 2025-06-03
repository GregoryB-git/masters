package o0;

import android.net.Uri;
import d0.q;
import java.util.List;
import n0.g;

public class j$c
  extends j
{
  public final Uri i;
  public final long j;
  public final String k;
  public final i l;
  public final m m;
  
  public j$c(long paramLong1, q paramq, List paramList1, k.e parame, List paramList2, List paramList3, List paramList4, String paramString, long paramLong2)
  {
    super(paramLong1, paramq, paramList1, parame, paramList2, paramList3, paramList4, null);
    i = Uri.parse(get0a);
    paramq = parame.c();
    l = paramq;
    k = paramString;
    j = paramLong2;
    if (paramq != null) {
      paramq = null;
    } else {
      paramq = new m(new i(null, 0L, paramLong2));
    }
    m = paramq;
  }
  
  public String k()
  {
    return k;
  }
  
  public g l()
  {
    return m;
  }
  
  public i m()
  {
    return l;
  }
}

/* Location:
 * Qualified Name:     o0.j.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */