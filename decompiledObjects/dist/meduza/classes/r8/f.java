package r8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import d2.h0;
import g.s;
import j8.w;
import java.util.concurrent.atomic.AtomicReference;
import nc.g0;
import org.json.JSONObject;
import q0.g;

public final class f
  implements h
{
  public final Context a;
  public final i b;
  public final s c;
  public final g0 d;
  public final h0 e;
  public final j f;
  public final w g;
  public final AtomicReference<c> h;
  public final AtomicReference<TaskCompletionSource<c>> i;
  
  public f(Context paramContext, i parami, g0 paramg0, s params, h0 paramh0, b paramb, w paramw)
  {
    AtomicReference localAtomicReference = new AtomicReference();
    h = localAtomicReference;
    i = new AtomicReference(new TaskCompletionSource());
    a = paramContext;
    b = parami;
    d = paramg0;
    c = params;
    e = paramh0;
    f = paramb;
    g = paramw;
    localAtomicReference.set(a.b(paramg0));
  }
  
  public static void c(JSONObject paramJSONObject, String paramString)
  {
    paramString = f.l(paramString);
    paramString.append(paramJSONObject.toString());
    paramJSONObject = paramString.toString();
    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
      Log.d("FirebaseCrashlytics", paramJSONObject, null);
    }
  }
  
  public final c a(int paramInt)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = localObject1;
    try
    {
      if (!g.b(2, paramInt))
      {
        JSONObject localJSONObject = e.l();
        int j = 0;
        if (localJSONObject != null)
        {
          localObject3 = c.d(localJSONObject);
          if (localObject3 != null)
          {
            c(localJSONObject, "Loaded cached settings: ");
            d.getClass();
            long l = System.currentTimeMillis();
            if (!g.b(3, paramInt))
            {
              paramInt = j;
              if (c < l) {
                paramInt = 1;
              }
              if (paramInt != 0)
              {
                localObject3 = localObject1;
                if (!Log.isLoggable("FirebaseCrashlytics", 2)) {
                  break label209;
                }
                Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                localObject3 = localObject1;
              }
            }
          }
        }
      }
    }
    catch (Exception localException1)
    {
      localObject3 = localObject2;
      break label200;
      try
      {
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
          Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
        }
      }
      catch (Exception localException2)
      {
        break label200;
      }
      Log.e("FirebaseCrashlytics", "Failed to parse cached settings data.", null);
      localObject3 = localException2;
      break label209;
      localObject3 = localException2;
      if (Log.isLoggable("FirebaseCrashlytics", 3))
      {
        Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
        localObject3 = localException2;
        break label209;
        label200:
        Log.e("FirebaseCrashlytics", "Failed to get cached settings", localException2);
      }
    }
    label209:
    return (c)localObject3;
  }
  
  public final c b()
  {
    return (c)h.get();
  }
}

/* Location:
 * Qualified Name:     r8.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */