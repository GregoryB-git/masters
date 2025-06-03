package x1;

import android.os.BaseBundle;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

public final class g$a
{
  public final F c(a parama, F.b paramb)
  {
    g.e locale = f(parama);
    Bundle localBundle = new Bundle();
    localBundle.putString("grant_type", locale.b());
    localBundle.putString("client_id", parama.c());
    localBundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
    parama = F.n.x(parama, locale.a(), paramb);
    parama.G(localBundle);
    parama.F(L.o);
    return parama;
  }
  
  public final F d(a parama, F.b paramb)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("fields", "permission,status");
    parama = F.n.x(parama, "me/permissions", paramb);
    parama.G(localBundle);
    parama.F(L.o);
    return parama;
  }
  
  public final g e()
  {
    Object localObject1 = g.e();
    if (localObject1 == null)
    {
      try
      {
        Object localObject2 = g.e();
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          Z.a locala = Z.a.b(B.l());
          Intrinsics.checkNotNullExpressionValue(locala, "getInstance(applicationContext)");
          localObject2 = new x1/b;
          ((b)localObject2).<init>();
          localObject1 = new x1/g;
          ((g)localObject1).<init>(locala, (b)localObject2);
          g.f((g)localObject1);
        }
      }
      finally
      {
        break label66;
      }
      return localg;
      label66:
      throw localg;
    }
    return localg;
  }
  
  public final g.e f(a parama)
  {
    String str = parama.h();
    parama = str;
    if (str == null) {
      parama = "facebook";
    }
    if (Intrinsics.a(parama, "instagram")) {
      parama = new g.c();
    } else {
      parama = new g.b();
    }
    return parama;
  }
}

/* Location:
 * Qualified Name:     x1.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */