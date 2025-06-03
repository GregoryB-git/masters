package N3;

import H3.H;
import H3.v;
import J3.B;
import K3.h;
import O3.i;
import V2.j;
import V2.k;
import android.content.Context;
import c2.g;
import f2.u;

public class b
{
  public static final h c = new h();
  public static final String d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
  public static final String e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
  public static final c2.e f = new a();
  public final e a;
  public final c2.e b;
  
  public b(e parame, c2.e parame1)
  {
    a = parame;
    b = parame1;
  }
  
  public static b b(Context paramContext, i parami, H paramH)
  {
    u.f(paramContext);
    g localg = u.c().g(new d2.a(d, e));
    paramContext = c2.b.b("json");
    c2.e locale = f;
    return new b(new e(localg.a("FIREBASE_CRASHLYTICS_REPORT", B.class, paramContext, locale), parami.b(), paramH), locale);
  }
  
  public static String e(String paramString1, String paramString2)
  {
    int i = paramString1.length() - paramString2.length();
    if ((i >= 0) && (i <= 1))
    {
      StringBuilder localStringBuilder = new StringBuilder(paramString1.length() + paramString2.length());
      for (i = 0; i < paramString1.length(); i++)
      {
        localStringBuilder.append(paramString1.charAt(i));
        if (paramString2.length() > i) {
          localStringBuilder.append(paramString2.charAt(i));
        }
      }
      return localStringBuilder.toString();
    }
    throw new IllegalArgumentException("Invalid input received");
  }
  
  public j c(v paramv, boolean paramBoolean)
  {
    return a.i(paramv, paramBoolean).a();
  }
}

/* Location:
 * Qualified Name:     N3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */