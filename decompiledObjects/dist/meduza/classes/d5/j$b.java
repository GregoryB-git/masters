package d5;

import android.net.Uri;
import c5.c;
import d2.h0;
import java.util.ArrayList;
import java.util.List;
import o7.t;
import v3.i0;

public final class j$b
  extends j
{
  public final String p;
  public final i q;
  public final h0 r;
  
  public j$b(long paramLong, i0 parami0, t paramt, k.e parame, ArrayList paramArrayList, List paramList1, List paramList2)
  {
    super(parami0, paramt, parame, paramArrayList, paramList1, paramList2);
    Uri.parse(get0a);
    paramLong = e;
    paramt = null;
    if (paramLong <= 0L) {
      parami0 = null;
    } else {
      parami0 = new i(d, paramLong, null);
    }
    q = parami0;
    p = null;
    if (parami0 != null) {
      parami0 = paramt;
    } else {
      parami0 = new h0(new i(0L, -1L, null), 2);
    }
    r = parami0;
  }
  
  public final String c()
  {
    return p;
  }
  
  public final c l()
  {
    return r;
  }
  
  public final i m()
  {
    return q;
  }
}

/* Location:
 * Qualified Name:     d5.j.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */