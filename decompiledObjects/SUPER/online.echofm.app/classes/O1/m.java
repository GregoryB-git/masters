package O1;

import android.content.Context;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class m
  extends V
{
  public static final a E = new a(null);
  public static final String F = m.class.getName();
  public boolean D;
  
  public m(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext, paramString1);
    A(paramString2);
  }
  
  public static final void F(m paramm)
  {
    Intrinsics.checkNotNullParameter(paramm, "this$0");
    paramm.cancel();
  }
  
  public void cancel()
  {
    WebView localWebView = r();
    if ((u()) && (!t()) && (localWebView != null) && (localWebView.isShown()))
    {
      if (D) {
        return;
      }
      D = true;
      localWebView.loadUrl(Intrinsics.i("javascript:", "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();"));
      new Handler(Looper.getMainLooper()).postDelayed(new l(this), 1500L);
      return;
    }
    super.cancel();
  }
  
  public Bundle w(String paramString)
  {
    paramString = Uri.parse(paramString);
    Object localObject1 = P.a;
    paramString = P.o0(paramString.getQuery());
    Object localObject3 = paramString.getString("bridge_args");
    paramString.remove("bridge_args");
    if (!P.c0((String)localObject3)) {
      try
      {
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>((String)localObject3);
        paramString.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", c.a((JSONObject)localObject1));
      }
      catch (JSONException localJSONException1)
      {
        localObject3 = P.a;
        P.k0(F, "Unable to parse bridge_args JSON", localJSONException1);
      }
    }
    localObject3 = paramString.getString("method_results");
    paramString.remove("method_results");
    if (!P.c0((String)localObject3)) {
      try
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>((String)localObject3);
        paramString.putBundle("com.facebook.platform.protocol.RESULT_ARGS", c.a((JSONObject)localObject2));
      }
      catch (JSONException localJSONException2)
      {
        Object localObject2 = P.a;
        P.k0(F, "Unable to parse bridge_args JSON", localJSONException2);
      }
    }
    paramString.remove("version");
    paramString.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", E.t());
    return paramString;
  }
  
  public static final class a
  {
    public final m a(Context paramContext, String paramString1, String paramString2)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramString1, "url");
      Intrinsics.checkNotNullParameter(paramString2, "expectedRedirectUrl");
      V.s(paramContext);
      return new m(paramContext, paramString1, paramString2, null);
    }
  }
}

/* Location:
 * Qualified Name:     O1.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */