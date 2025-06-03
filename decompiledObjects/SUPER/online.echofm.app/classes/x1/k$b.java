package x1;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class k$b
{
  public final String a(JSONObject paramJSONObject, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramJSONObject, "<this>");
    Intrinsics.checkNotNullParameter(paramString, "name");
    if (paramJSONObject.has(paramString)) {
      return paramJSONObject.getString(paramString);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     x1.k.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */