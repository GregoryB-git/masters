package g;

import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import androidx.work.impl.WorkDatabase;
import b8.c.a;
import b8.r;
import c8.a1;
import c8.i;
import c8.i0;
import c8.y;
import com.google.android.gms.internal.firebase_auth_api.zzabq;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import d2.k0;
import java.util.Iterator;
import java.util.Set;
import m6.j;
import nc.g0;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import r8.g;
import r8.k;

public final class s
  implements k0, Continuation, OnFailureListener, h8.b, i8.b
{
  public Object b;
  
  public s(WorkDatabase paramWorkDatabase)
  {
    b = paramWorkDatabase;
  }
  
  public s(TaskCompletionSource paramTaskCompletionSource) {}
  
  public s(l8.n paramn)
  {
    b = paramn;
  }
  
  public static String e(Bundle paramBundle, String paramString)
  {
    JSONObject localJSONObject1 = new JSONObject();
    JSONObject localJSONObject2 = new JSONObject();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localJSONObject2.put(str, paramBundle.get(str));
    }
    localJSONObject1.put("name", paramString);
    localJSONObject1.put("parameters", localJSONObject2);
    return localJSONObject1.toString();
  }
  
  public final String[] a()
  {
    return ((WebViewProviderFactoryBoundaryInterface)b).getSupportedFeatures();
  }
  
  public final void b(Bundle paramBundle, String paramString)
  {
    i8.a locala = (i8.a)b;
    if (locala != null) {
      try
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("$A$:");
        localStringBuilder.append(e(paramBundle, paramString));
        locala.a(localStringBuilder.toString());
      }
      catch (JSONException paramBundle)
      {
        Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
      }
    }
  }
  
  public final void c(i8.a parama)
  {
    b = parama;
    int i;
    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
    }
  }
  
  public final WebViewProviderBoundaryInterface createWebView(WebView paramWebView)
  {
    return (WebViewProviderBoundaryInterface)zc.a.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface)b).createWebView(paramWebView));
  }
  
  public final r8.c d(JSONObject paramJSONObject)
  {
    int i = paramJSONObject.getInt("settings_version");
    Object localObject;
    if (i != 3)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Could not determine SettingsJsonTransform for settings version ");
      ((StringBuilder)localObject).append(i);
      ((StringBuilder)localObject).append(". Using default settings values.");
      Log.e("FirebaseCrashlytics", ((StringBuilder)localObject).toString(), null);
      localObject = new r8.a();
    }
    else
    {
      localObject = new k();
    }
    return ((g)localObject).a((g0)b, paramJSONObject);
  }
  
  public final ProxyControllerBoundaryInterface getProxyController()
  {
    return (ProxyControllerBoundaryInterface)zc.a.a(ProxyControllerBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface)b).getProxyController());
  }
  
  public final ServiceWorkerControllerBoundaryInterface getServiceWorkerController()
  {
    return (ServiceWorkerControllerBoundaryInterface)zc.a.a(ServiceWorkerControllerBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface)b).getServiceWorkerController());
  }
  
  public final StaticsBoundaryInterface getStatics()
  {
    return (StaticsBoundaryInterface)zc.a.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface)b).getStatics());
  }
  
  public final TracingControllerBoundaryInterface getTracingController()
  {
    return (TracingControllerBoundaryInterface)zc.a.a(TracingControllerBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface)b).getTracingController());
  }
  
  public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter()
  {
    return (WebkitToCompatConverterBoundaryInterface)zc.a.a(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface)b).getWebkitToCompatConverter());
  }
  
  public final void onFailure(Exception paramException)
  {
    y localy = y.b;
    Log.e("y", String.format("Failed to get reCAPTCHA token with error [%s]- calling backend without app verification", new Object[] { paramException.getMessage() }));
    if (((paramException instanceof b8.l)) && (a.endsWith("UNAUTHORIZED_DOMAIN")))
    {
      ((TaskCompletionSource)b).setException(paramException);
      return;
    }
    ((TaskCompletionSource)b).setResult(new a1(null, null, null));
  }
  
  public final Object then(Task paramTask)
  {
    switch (a)
    {
    default: 
      break;
    case 5: 
      localObject1 = (i0)b;
      if (!paramTask.isSuccessful())
      {
        paramTask = paramTask.getException();
        j.i(paramTask);
        paramTask = paramTask.getMessage();
        localObject2 = new StringBuilder("Failed to get Recaptcha token, error - ");
        ((StringBuilder)localObject2).append(paramTask);
        ((StringBuilder)localObject2).append("\n\n Failing open with a fake token.");
        Log.e("RecaptchaCallWrapper", ((StringBuilder)localObject2).toString());
        paramTask = "NO_RECAPTCHA";
      }
      else
      {
        paramTask = (String)paramTask.getResult();
      }
      return ((i0)localObject1).b(paramTask);
    case 4: 
      if (!paramTask.isSuccessful())
      {
        paramTask = Tasks.forException(paramTask.getException());
      }
      else
      {
        paramTask = getResulta;
        localObject2 = b).a;
        j.e(paramTask);
        localObject1 = new c8.n();
        a = paramTask;
        e = ((i)localObject2);
        paramTask = Tasks.forResult(localObject1);
      }
      return paramTask;
    }
    paramTask = (b8.s)paramTask.getResult();
    Object localObject1 = FirebaseAuth.getInstance(((r)b).K());
    Object localObject2 = a;
    j.i(localObject2);
    paramTask = null;
    localObject1.getClass();
    j.e((String)localObject2);
    if (i != null)
    {
      paramTask = new b8.c(new c.a());
      p = i;
    }
    return e.zza(a, paramTask, (String)localObject2);
  }
}

/* Location:
 * Qualified Name:     g.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */