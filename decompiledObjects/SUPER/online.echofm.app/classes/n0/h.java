package n0;

import android.net.Uri;
import i0.k;
import i0.k.b;
import java.util.List;
import java.util.Map;
import o0.b;
import o0.i;
import o0.j;

public abstract class h
{
  public static k a(j paramj, String paramString, i parami, int paramInt, Map paramMap)
  {
    return new k.b().i(parami.b(paramString)).h(a).g(b).f(b(paramj, parami)).b(paramInt).e(paramMap).a();
  }
  
  public static String b(j paramj, i parami)
  {
    String str = paramj.k();
    if (str != null) {
      paramj = str;
    } else {
      paramj = parami.b(c.get(0)).a).toString();
    }
    return paramj;
  }
}

/* Location:
 * Qualified Name:     n0.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */