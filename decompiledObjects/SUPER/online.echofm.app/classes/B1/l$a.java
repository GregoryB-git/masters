package B1;

import G1.g;
import O1.C;
import O1.C.a;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import x1.F;
import x1.F.c;
import x1.K;
import x1.N;
import x1.a;

public final class l$a
{
  public static final void c(K paramK)
  {
    Intrinsics.checkNotNullParameter(paramK, "it");
    C.e.b(N.s, l.d(), "App index sent to FB!");
  }
  
  public final F b(String paramString1, a parama, String paramString2, String paramString3)
  {
    Intrinsics.checkNotNullParameter(paramString3, "requestType");
    if (paramString1 == null) {
      return null;
    }
    Object localObject = F.n;
    x localx = x.a;
    paramString2 = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[] { paramString2 }, 1));
    Intrinsics.checkNotNullExpressionValue(paramString2, "java.lang.String.format(locale, format, *args)");
    localObject = ((F.c)localObject).A(parama, paramString2, null, null);
    paramString2 = ((F)localObject).u();
    parama = paramString2;
    if (paramString2 == null) {
      parama = new Bundle();
    }
    parama.putString("tree", paramString1);
    parama.putString("app_version", g.d());
    parama.putString("platform", "android");
    parama.putString("request_type", paramString3);
    if (Intrinsics.a(paramString3, "app_indexing")) {
      parama.putString("device_session_id", e.g());
    }
    ((F)localObject).G(parama);
    ((F)localObject).C(new k());
    return (F)localObject;
  }
}

/* Location:
 * Qualified Name:     B1.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */