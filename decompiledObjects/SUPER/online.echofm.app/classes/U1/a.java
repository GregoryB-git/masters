package U1;

import Q1.k;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public static final a d = new a(null);
  public String a;
  public String b;
  public Long c;
  
  public a(File paramFile)
  {
    paramFile = paramFile.getName();
    Intrinsics.checkNotNullExpressionValue(paramFile, "file.name");
    a = paramFile;
    paramFile = k.r(paramFile, true);
    if (paramFile != null)
    {
      c = Long.valueOf(paramFile.optLong("timestamp", 0L));
      b = paramFile.optString("error_message", null);
    }
  }
  
  public a(String paramString)
  {
    c = Long.valueOf(System.currentTimeMillis() / 'Ϩ');
    b = paramString;
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("error_log_");
    paramString = c;
    if (paramString != null)
    {
      localStringBuffer.append(paramString.longValue());
      localStringBuffer.append(".json");
      paramString = localStringBuffer.toString();
      Intrinsics.checkNotNullExpressionValue(paramString, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
      a = paramString;
      return;
    }
    throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
  }
  
  public final void a()
  {
    k localk = k.a;
    k.d(a);
  }
  
  public final int b(a parama)
  {
    Intrinsics.checkNotNullParameter(parama, "data");
    Long localLong = c;
    if (localLong == null) {
      return -1;
    }
    long l = localLong.longValue();
    parama = c;
    if (parama == null) {
      return 1;
    }
    return Intrinsics.e(parama.longValue(), l);
  }
  
  public final JSONObject c()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      Long localLong = c;
      if (localLong != null) {
        localJSONObject.put("timestamp", localLong);
      }
      localJSONObject.put("error_message", b);
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  public final boolean d()
  {
    boolean bool;
    if ((b != null) && (c != null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void e()
  {
    if (d())
    {
      k localk = k.a;
      k.t(a, toString());
    }
  }
  
  public String toString()
  {
    Object localObject = c();
    if (localObject == null) {
      return super.toString();
    }
    localObject = ((JSONObject)localObject).toString();
    Intrinsics.checkNotNullExpressionValue(localObject, "params.toString()");
    return (String)localObject;
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     U1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */