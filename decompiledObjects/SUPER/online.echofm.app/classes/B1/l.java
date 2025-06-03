package B1;

import C1.f;
import G1.g;
import O1.C;
import O1.C.a;
import O1.P;
import O1.z;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.F;
import x1.F.c;
import x1.K;
import x1.N;
import x1.a.c;

public final class l
{
  public static final a e = new a(null);
  public static final String f;
  public static l g;
  public final Handler a;
  public final WeakReference b;
  public Timer c;
  public String d;
  
  static
  {
    String str1 = l.class.getCanonicalName();
    String str2 = str1;
    if (str1 == null) {
      str2 = "";
    }
    f = str2;
  }
  
  public l(Activity paramActivity)
  {
    b = new WeakReference(paramActivity);
    d = null;
    a = new Handler(Looper.getMainLooper());
    g = this;
  }
  
  /* Error */
  public static final void i(l paraml, TimerTask paramTimerTask)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 91	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: ldc 104
    //   12: invokestatic 51	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc 106
    //   18: invokestatic 51	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   21: aload_0
    //   22: getfield 108	B1/l:c	Ljava/util/Timer;
    //   25: astore_2
    //   26: aload_2
    //   27: ifnonnull +6 -> 33
    //   30: goto +7 -> 37
    //   33: aload_2
    //   34: invokevirtual 113	java/util/Timer:cancel	()V
    //   37: aload_0
    //   38: aconst_null
    //   39: putfield 62	B1/l:d	Ljava/lang/String;
    //   42: new 110	java/util/Timer
    //   45: astore_2
    //   46: aload_2
    //   47: invokespecial 114	java/util/Timer:<init>	()V
    //   50: aload_2
    //   51: aload_1
    //   52: lconst_0
    //   53: ldc2_w 115
    //   56: invokevirtual 120	java/util/Timer:scheduleAtFixedRate	(Ljava/util/TimerTask;JJ)V
    //   59: aload_0
    //   60: aload_2
    //   61: putfield 108	B1/l:c	Ljava/util/Timer;
    //   64: goto +18 -> 82
    //   67: astore_0
    //   68: goto +15 -> 83
    //   71: astore_0
    //   72: getstatic 41	B1/l:f	Ljava/lang/String;
    //   75: ldc 122
    //   77: aload_0
    //   78: invokestatic 127	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   81: pop
    //   82: return
    //   83: aload_0
    //   84: ldc 2
    //   86: invokestatic 94	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   89: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	paraml	l
    //   0	90	1	paramTimerTask	TimerTask
    //   25	36	2	localTimer	Timer
    // Exception table:
    //   from	to	target	type
    //   9	21	67	finally
    //   21	26	67	finally
    //   33	37	67	finally
    //   37	64	67	finally
    //   72	82	67	finally
    //   21	26	71	java/lang/Exception
    //   33	37	71	java/lang/Exception
    //   37	64	71	java/lang/Exception
  }
  
  public static final void k(String paramString, l paraml)
  {
    if (T1.a.d(l.class)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString, "$tree");
      Intrinsics.checkNotNullParameter(paraml, "this$0");
      str = P.m0(paramString);
      locala = x1.a.z.e();
      if ((str != null) && (Intrinsics.a(str, d))) {
        return;
      }
    }
    finally
    {
      String str;
      x1.a locala;
      break label72;
      paraml.g(e.b(paramString, locala, B.m(), "app_indexing"), str);
      return;
      label72:
      T1.a.b(paramString, l.class);
    }
  }
  
  public final void g(F paramF, String paramString)
  {
    if (T1.a.d(this)) {
      return;
    }
    if (paramF == null) {
      return;
    }
    try
    {
      paramF = paramF.k();
      JSONObject localJSONObject;
      T1.a.b(paramF, this);
    }
    finally
    {
      try
      {
        localJSONObject = paramF.c();
        if (localJSONObject == null) {
          break label92;
        }
        if (!Intrinsics.a("true", localJSONObject.optString("success"))) {
          break label71;
        }
        C.e.b(N.s, f, "Successfully send UI component tree to server");
        d = paramString;
      }
      catch (JSONException paramF)
      {
        break label111;
        if (!localJSONObject.has("is_app_indexing_enabled")) {
          break label121;
        }
        e.n(localJSONObject.getBoolean("is_app_indexing_enabled"));
        break label121;
        Log.e(f, Intrinsics.i("Error sending UI component tree to Facebook: ", paramF.b()));
        break label121;
        Log.e(f, "Error decoding server response.", paramF);
        return;
      }
      paramF = finally;
    }
    label71:
    label92:
    label111:
    label121:
    return;
  }
  
  /* Error */
  public final void h()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 91	T1/a:d	(Ljava/lang/Object;)Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: new 12	B1/l$c
    //   11: astore_1
    //   12: aload_1
    //   13: aload_0
    //   14: invokespecial 235	B1/l$c:<init>	(LB1/l;)V
    //   17: invokestatic 239	x1/B:t	()Ljava/util/concurrent/Executor;
    //   20: astore_2
    //   21: new 241	B1/i
    //   24: astore_3
    //   25: aload_3
    //   26: aload_0
    //   27: aload_1
    //   28: invokespecial 243	B1/i:<init>	(LB1/l;Ljava/util/TimerTask;)V
    //   31: aload_2
    //   32: aload_3
    //   33: invokeinterface 249 2 0
    //   38: goto +18 -> 56
    //   41: astore_3
    //   42: goto +15 -> 57
    //   45: astore_3
    //   46: getstatic 41	B1/l:f	Ljava/lang/String;
    //   49: ldc 122
    //   51: aload_3
    //   52: invokestatic 127	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   55: pop
    //   56: return
    //   57: aload_3
    //   58: aload_0
    //   59: invokestatic 94	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   62: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	this	l
    //   11	17	1	localc	c
    //   20	12	2	localExecutor	Executor
    //   24	9	3	locali	i
    //   41	1	3	localObject	Object
    //   45	13	3	localRejectedExecutionException	java.util.concurrent.RejectedExecutionException
    // Exception table:
    //   from	to	target	type
    //   8	17	41	finally
    //   17	38	41	finally
    //   46	56	41	finally
    //   17	38	45	java/util/concurrent/RejectedExecutionException
  }
  
  public final void j(String paramString)
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      Executor localExecutor = B.t();
      j localj = new B1/j;
      localj.<init>(paramString, this);
      localExecutor.execute(localj);
      return;
    }
    finally
    {
      T1.a.b(paramString, this);
    }
  }
  
  /* Error */
  public final void l()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 91	T1/a:d	(Ljava/lang/Object;)Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield 60	B1/l:b	Ljava/lang/ref/WeakReference;
    //   12: invokevirtual 260	java/lang/ref/Reference:get	()Ljava/lang/Object;
    //   15: checkcast 262	android/app/Activity
    //   18: astore_1
    //   19: aload_1
    //   20: ifnonnull +4 -> 24
    //   23: return
    //   24: aload_0
    //   25: getfield 108	B1/l:c	Ljava/util/Timer;
    //   28: astore_1
    //   29: aload_1
    //   30: ifnonnull +6 -> 36
    //   33: goto +7 -> 40
    //   36: aload_1
    //   37: invokevirtual 113	java/util/Timer:cancel	()V
    //   40: aload_0
    //   41: aconst_null
    //   42: putfield 108	B1/l:c	Ljava/util/Timer;
    //   45: goto +19 -> 64
    //   48: astore_1
    //   49: goto +16 -> 65
    //   52: astore_1
    //   53: getstatic 41	B1/l:f	Ljava/lang/String;
    //   56: ldc_w 264
    //   59: aload_1
    //   60: invokestatic 127	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   63: pop
    //   64: return
    //   65: aload_1
    //   66: aload_0
    //   67: invokestatic 94	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   70: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	this	l
    //   18	19	1	localObject1	Object
    //   48	1	1	localObject2	Object
    //   52	14	1	localException	Exception
    // Exception table:
    //   from	to	target	type
    //   8	19	48	finally
    //   24	29	48	finally
    //   36	40	48	finally
    //   40	45	48	finally
    //   53	64	48	finally
    //   24	29	52	java/lang/Exception
    //   36	40	52	java/lang/Exception
    //   40	45	52	java/lang/Exception
  }
  
  public static final class a
  {
    public static final void c(K paramK)
    {
      Intrinsics.checkNotNullParameter(paramK, "it");
      C.e.b(N.s, l.d(), "App index sent to FB!");
    }
    
    public final F b(String paramString1, x1.a parama, String paramString2, String paramString3)
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
  
  public static final class b
    implements Callable
  {
    public final WeakReference o;
    
    public b(View paramView)
    {
      o = new WeakReference(paramView);
    }
    
    public String a()
    {
      Object localObject1 = (View)o.get();
      if ((localObject1 != null) && (((View)localObject1).getWidth() != 0) && (((View)localObject1).getHeight() != 0))
      {
        Object localObject2 = Bitmap.createBitmap(((View)localObject1).getWidth(), ((View)localObject1).getHeight(), Bitmap.Config.RGB_565);
        ((View)localObject1).draw(new Canvas((Bitmap)localObject2));
        localObject1 = new ByteArrayOutputStream();
        ((Bitmap)localObject2).compress(Bitmap.CompressFormat.JPEG, 10, (OutputStream)localObject1);
        localObject2 = Base64.encodeToString(((ByteArrayOutputStream)localObject1).toByteArray(), 2);
        Intrinsics.checkNotNullExpressionValue(localObject2, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
        return (String)localObject2;
      }
      return "";
    }
  }
  
  public static final class c
    extends TimerTask
  {
    public c(l paraml) {}
    
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
}

/* Location:
 * Qualified Name:     B1.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */