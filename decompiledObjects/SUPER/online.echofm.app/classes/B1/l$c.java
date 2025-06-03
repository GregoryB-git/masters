package B1;

import C1.f;
import G1.g;
import O1.z;
import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import java.lang.ref.Reference;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class l$c
  extends TimerTask
{
  public l$c(l paraml) {}
  
  public void run()
  {
    try
    {
      Activity localActivity = (Activity)l.c(o).get();
      localView = g.e(localActivity);
      if ((localActivity != null) && (localView != null))
      {
        str2 = localActivity.getClass().getSimpleName();
        if (!e.h()) {
          return;
        }
        if (z.b())
        {
          C1.e.a();
          return;
        }
      }
    }
    catch (Exception localException1)
    {
      View localView;
      String str2;
      break label219;
      Object localObject2 = new java/util/concurrent/FutureTask;
      Object localObject1 = new B1/l$b;
      ((l.b)localObject1).<init>(localView);
      ((FutureTask)localObject2).<init>((Callable)localObject1);
      l.e(o).post((Runnable)localObject2);
      localObject1 = "";
      try
      {
        localObject2 = (String)((FutureTask)localObject2).get(1L, TimeUnit.SECONDS);
        localObject1 = localObject2;
      }
      catch (Exception localException2)
      {
        Log.e(l.d(), "Failed to take screenshot.", localException2);
      }
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      try
      {
        localJSONObject.put("screenname", str2);
        localJSONObject.put("screenshot", localObject1);
        localObject1 = new org/json/JSONArray;
        ((JSONArray)localObject1).<init>();
        ((JSONArray)localObject1).put(f.d(localView));
        localJSONObject.put("view", localObject1);
      }
      catch (JSONException localJSONException)
      {
        Log.e(l.d(), "Failed to create JSONObject");
      }
      String str1 = localJSONObject.toString();
      Intrinsics.checkNotNullExpressionValue(str1, "viewTree.toString()");
      l.f(o, str1);
      return;
      return;
      label219:
      Log.e(l.d(), "UI Component tree indexing failure!", str1);
    }
  }
}

/* Location:
 * Qualified Name:     B1.l.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */