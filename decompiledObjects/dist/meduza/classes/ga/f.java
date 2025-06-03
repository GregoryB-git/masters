package ga;

import android.net.Uri;
import android.net.Uri.Builder;
import java.net.URL;
import java.util.Map;

public final class f
  implements a
{
  public final ea.b a;
  public final ub.h b;
  public final String c;
  
  public f(ea.b paramb, ub.h paramh)
  {
    a = paramb;
    b = paramh;
    c = "firebase-settings.crashlytics.com";
  }
  
  public static final URL b(f paramf)
  {
    paramf.getClass();
    return new URL(new Uri.Builder().scheme("https").authority(c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(a.a).appendPath("settings").appendQueryParameter("build_version", a.f.c).appendQueryParameter("display_version", a.f.b).build().toString());
  }
  
  public final Object a(Map paramMap, d.b paramb, d.c paramc, d.a parama)
  {
    paramMap = x6.b.z0(parama, b, new e(this, paramMap, paramb, paramc, null));
    if (paramMap == vb.a.a) {
      return paramMap;
    }
    return rb.h.a;
  }
}

/* Location:
 * Qualified Name:     ga.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */