package Q1;

import O1.P;
import android.os.Build;
import android.os.Build.VERSION;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
{
  public static final b h = new b(null);
  public String a;
  public c b;
  public JSONArray c;
  public String d;
  public String e;
  public String f;
  public Long g;
  
  public c(File paramFile)
  {
    paramFile = paramFile.getName();
    Intrinsics.checkNotNullExpressionValue(paramFile, "file.name");
    a = paramFile;
    b = b.a(h, paramFile);
    paramFile = k.a;
    paramFile = k.r(a, true);
    if (paramFile != null)
    {
      g = Long.valueOf(paramFile.optLong("timestamp", 0L));
      d = paramFile.optString("app_version", null);
      e = paramFile.optString("reason", null);
      f = paramFile.optString("callstack", null);
      c = paramFile.optJSONArray("feature_names");
    }
  }
  
  public c(String paramString1, String paramString2)
  {
    b = c.q;
    d = P.v();
    e = paramString1;
    f = paramString2;
    g = Long.valueOf(System.currentTimeMillis() / 'Ϩ');
    paramString1 = new StringBuffer();
    paramString1.append("anr_log_");
    paramString1.append(String.valueOf(g));
    paramString1.append(".json");
    paramString1 = paramString1.toString();
    Intrinsics.checkNotNullExpressionValue(paramString1, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
    a = paramString1;
  }
  
  public c(Throwable paramThrowable, c paramc)
  {
    b = paramc;
    d = P.v();
    e = k.e(paramThrowable);
    f = k.h(paramThrowable);
    g = Long.valueOf(System.currentTimeMillis() / 'Ϩ');
    paramThrowable = new StringBuffer();
    paramThrowable.append(paramc.e());
    paramThrowable.append(String.valueOf(g));
    paramThrowable.append(".json");
    paramThrowable = paramThrowable.toString();
    Intrinsics.checkNotNullExpressionValue(paramThrowable, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
    a = paramThrowable;
  }
  
  public c(JSONArray paramJSONArray)
  {
    b = c.p;
    g = Long.valueOf(System.currentTimeMillis() / 'Ϩ');
    c = paramJSONArray;
    paramJSONArray = new StringBuffer();
    paramJSONArray.append("analysis_log_");
    paramJSONArray.append(String.valueOf(g));
    paramJSONArray.append(".json");
    paramJSONArray = paramJSONArray.toString();
    Intrinsics.checkNotNullExpressionValue(paramJSONArray, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
    a = paramJSONArray;
  }
  
  public final void a()
  {
    k localk = k.a;
    k.d(a);
  }
  
  public final int b(c paramc)
  {
    Intrinsics.checkNotNullParameter(paramc, "data");
    Long localLong = g;
    if (localLong == null) {
      return -1;
    }
    long l = localLong.longValue();
    paramc = g;
    if (paramc == null) {
      return 1;
    }
    return Intrinsics.e(paramc.longValue(), l);
  }
  
  public final JSONObject c()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      Object localObject = c;
      if (localObject != null) {
        localJSONObject.put("feature_names", localObject);
      }
      localObject = g;
      if (localObject != null) {
        localJSONObject.put("timestamp", localObject);
      }
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  public final JSONObject d()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("device_os_version", Build.VERSION.RELEASE);
      localJSONObject.put("device_model", Build.MODEL);
      Object localObject = d;
      if (localObject != null) {
        localJSONObject.put("app_version", localObject);
      }
      localObject = g;
      if (localObject != null) {
        localJSONObject.put("timestamp", localObject);
      }
      localObject = e;
      if (localObject != null) {
        localJSONObject.put("reason", localObject);
      }
      localObject = f;
      if (localObject != null) {
        localJSONObject.put("callstack", localObject);
      }
      localObject = b;
      if (localObject != null) {
        localJSONObject.put("type", localObject);
      }
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return null;
  }
  
  public final JSONObject e()
  {
    Object localObject = b;
    int i;
    if (localObject == null) {
      i = -1;
    } else {
      i = d.a[localObject.ordinal()];
    }
    if (i != 1)
    {
      if ((i != 2) && (i != 3) && (i != 4) && (i != 5)) {
        localObject = null;
      } else {
        localObject = d();
      }
    }
    else {
      localObject = c();
    }
    return (JSONObject)localObject;
  }
  
  public final boolean f()
  {
    c localc = b;
    int i;
    if (localc == null) {
      i = -1;
    } else {
      i = d.a[localc.ordinal()];
    }
    boolean bool1 = false;
    boolean bool2;
    if (i != 1) {
      if (i != 2)
      {
        if ((i != 3) && (i != 4) && (i != 5))
        {
          bool2 = bool1;
          break label138;
        }
        bool2 = bool1;
        if (f == null) {
          break label138;
        }
        bool2 = bool1;
        if (g == null) {
          break label138;
        }
      }
    }
    do
    {
      for (;;)
      {
        bool2 = true;
        break;
        bool2 = bool1;
        if (f == null) {
          break;
        }
        bool2 = bool1;
        if (e == null) {
          break;
        }
        bool2 = bool1;
        if (g == null) {
          break;
        }
      }
      bool2 = bool1;
      if (c == null) {
        break;
      }
      bool2 = bool1;
    } while (g != null);
    label138:
    return bool2;
  }
  
  public final void g()
  {
    if (!f()) {
      return;
    }
    k localk = k.a;
    k.t(a, toString());
  }
  
  public String toString()
  {
    Object localObject = e();
    if (localObject == null) {
      localObject = new JSONObject().toString();
    }
    for (String str = "JSONObject().toString()";; str = "params.toString()")
    {
      Intrinsics.checkNotNullExpressionValue(localObject, str);
      return (String)localObject;
      localObject = ((JSONObject)localObject).toString();
    }
  }
  
  public static final class a
  {
    public static final a a = new a();
    
    public static final c a(String paramString1, String paramString2)
    {
      return new c(paramString1, paramString2, null);
    }
    
    public static final c b(Throwable paramThrowable, c.c paramc)
    {
      Intrinsics.checkNotNullParameter(paramc, "t");
      return new c(paramThrowable, paramc, null);
    }
    
    public static final c c(JSONArray paramJSONArray)
    {
      Intrinsics.checkNotNullParameter(paramJSONArray, "features");
      return new c(paramJSONArray, null);
    }
    
    public static final c d(File paramFile)
    {
      Intrinsics.checkNotNullParameter(paramFile, "file");
      return new c(paramFile, null);
    }
  }
  
  public static final class b
  {
    public final c.c b(String paramString)
    {
      if (i.s(paramString, "crash_log_", false, 2, null)) {
        return c.c.r;
      }
      if (i.s(paramString, "shield_log_", false, 2, null)) {
        return c.c.s;
      }
      if (i.s(paramString, "thread_check_log_", false, 2, null)) {
        return c.c.t;
      }
      if (i.s(paramString, "analysis_log_", false, 2, null)) {
        return c.c.p;
      }
      if (i.s(paramString, "anr_log_", false, 2, null)) {
        return c.c.q;
      }
      return c.c.o;
    }
  }
  
  public static enum c
  {
    public final String e()
    {
      int i = a.a[ordinal()];
      String str;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4)
            {
              if (i != 5) {
                str = "Unknown";
              } else {
                str = "thread_check_log_";
              }
            }
            else {
              str = "shield_log_";
            }
          }
          else {
            str = "crash_log_";
          }
        }
        else {
          str = "anr_log_";
        }
      }
      else {
        str = "analysis_log_";
      }
      return str;
    }
    
    public String toString()
    {
      int i = a.a[ordinal()];
      String str;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 4)
            {
              if (i != 5) {
                str = "Unknown";
              } else {
                str = "ThreadCheck";
              }
            }
            else {
              str = "CrashShield";
            }
          }
          else {
            str = "CrashReport";
          }
        }
        else {
          str = "AnrReport";
        }
      }
      else {
        str = "Analysis";
      }
      return str;
    }
  }
}

/* Location:
 * Qualified Name:     Q1.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */