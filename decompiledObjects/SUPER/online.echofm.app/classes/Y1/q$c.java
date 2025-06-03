package Y1;

import O1.P.a;
import android.os.BaseBundle;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import x1.o;

public final class q$c
  implements P.a
{
  public q$c(Bundle paramBundle, q paramq, u.e parame) {}
  
  public void a(JSONObject paramJSONObject)
  {
    try
    {
      Bundle localBundle = a;
      if (paramJSONObject == null) {
        paramJSONObject = null;
      } else {
        paramJSONObject = paramJSONObject.getString("id");
      }
      localBundle.putString("com.facebook.platform.extra.USER_ID", paramJSONObject);
      b.t(c, a);
    }
    catch (JSONException paramJSONObject)
    {
      b.d().f(u.f.c.d(u.f.w, b.d().o(), "Caught exception", paramJSONObject.getMessage(), null, 8, null));
    }
  }
  
  public void b(o paramo)
  {
    u localu = b.d();
    u.f.c localc = u.f.w;
    u.e locale = b.d().o();
    if (paramo == null) {}
    for (paramo = null;; paramo = paramo.getMessage()) {
      break;
    }
    localu.f(u.f.c.d(localc, locale, "Caught exception", paramo, null, 8, null));
  }
}

/* Location:
 * Qualified Name:     Y1.q.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */