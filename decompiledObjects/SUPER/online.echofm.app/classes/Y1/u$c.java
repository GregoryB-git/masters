package Y1;

import O1.d;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class u$c
{
  public final String a()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("init", System.currentTimeMillis());
      String str = localJSONObject.toString();
      Intrinsics.checkNotNullExpressionValue(str, "e2e.toString()");
      return str;
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
  
  public final int b()
  {
    return d.p.e();
  }
}

/* Location:
 * Qualified Name:     Y1.u.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */