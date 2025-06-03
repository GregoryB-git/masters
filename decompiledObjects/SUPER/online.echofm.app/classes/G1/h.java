package G1;

import O1.C.a;
import O1.P;
import O1.a;
import V5.m;
import V5.q;
import android.content.Context;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import x1.N;
import y1.p;
import y1.p.a;

public final class h
{
  public static final h a = new h();
  public static final Map b = W5.C.e(new m[] { q.a(a.o, "MOBILE_APP_INSTALL"), q.a(a.p, "CUSTOM_APP_EVENTS") });
  
  public static final JSONObject a(a parama, a parama1, String paramString, boolean paramBoolean, Context paramContext)
  {
    Intrinsics.checkNotNullParameter(parama, "activityType");
    Intrinsics.checkNotNullParameter(paramContext, "context");
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("event", b.get(parama));
    parama = p.b.f();
    if (parama != null) {
      localJSONObject.put("app_user_id", parama);
    }
    P.C0(localJSONObject, parama1, paramString, paramBoolean, paramContext);
    try
    {
      P.D0(localJSONObject, paramContext);
    }
    catch (Exception parama)
    {
      O1.C.e.c(N.s, "AppEvents", "Fetching extended device info parameters failed: '%s'", new Object[] { parama.toString() });
    }
    paramString = P.C();
    if (paramString != null)
    {
      parama1 = paramString.keys();
      while (parama1.hasNext())
      {
        parama = (String)parama1.next();
        localJSONObject.put(parama, paramString.get(parama));
      }
    }
    localJSONObject.put("application_package_name", paramContext.getPackageName());
    return localJSONObject;
  }
  
  public static enum a {}
}

/* Location:
 * Qualified Name:     G1.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */