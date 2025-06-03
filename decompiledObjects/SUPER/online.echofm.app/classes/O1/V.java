package O1;

import M1.d;
import M1.e;
import W5.g;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.D;
import x1.F;
import x1.I;
import x1.K;
import x1.a.c;
import x1.m;
import x1.o;
import x1.p;
import x1.q;
import x1.r;

public class V
  extends Dialog
{
  public static final b A = new b(null);
  public static final int B = e.a;
  public static volatile int C;
  public String o;
  public String p;
  public d q;
  public WebView r;
  public ProgressDialog s;
  public ImageView t;
  public FrameLayout u;
  public e v;
  public boolean w;
  public boolean x;
  public boolean y;
  public WindowManager.LayoutParams z;
  
  public V(Context paramContext, String paramString)
  {
    this(paramContext, paramString, A.a());
  }
  
  public V(Context paramContext, String paramString, int paramInt)
  {
    super(paramContext, i);
    p = "fbconnect://success";
    o = paramString;
  }
  
  public V(Context paramContext, String paramString, Bundle paramBundle, int paramInt, Y1.B paramB, d paramd)
  {
    super(paramContext, i);
    String str = "fbconnect://success";
    p = "fbconnect://success";
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    paramBundle = str;
    if (P.W(paramContext)) {
      paramBundle = "fbconnect://chrome_os_success";
    }
    p = paramBundle;
    localBundle.putString("redirect_uri", paramBundle);
    localBundle.putString("display", "touch");
    localBundle.putString("client_id", x1.B.m());
    paramContext = x.a;
    paramContext = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[] { x1.B.B() }, 1));
    Intrinsics.checkNotNullExpressionValue(paramContext, "java.lang.String.format(locale, format, *args)");
    localBundle.putString("sdk", paramContext);
    q = paramd;
    if ((Intrinsics.a(paramString, "share")) && (localBundle.containsKey("media")))
    {
      v = new e(paramString, localBundle);
    }
    else
    {
      if (f.a[paramB.ordinal()] == 1) {
        paramContext = H.k();
      }
      for (paramString = "oauth/authorize";; paramString = paramBundle.toString())
      {
        paramContext = P.g(paramContext, paramString, localBundle);
        break;
        paramContext = H.b();
        paramBundle = new StringBuilder();
        paramBundle.append(x1.B.w());
        paramBundle.append("/dialog/");
        paramBundle.append(paramString);
      }
      o = paramContext.toString();
    }
  }
  
  public static final boolean D(View paramView, MotionEvent paramMotionEvent)
  {
    if (!paramView.hasFocus()) {
      paramView.requestFocus();
    }
    return false;
  }
  
  public static final void p(V paramV, View paramView)
  {
    Intrinsics.checkNotNullParameter(paramV, "this$0");
    paramV.cancel();
  }
  
  public static final void s(Context paramContext)
  {
    A.b(paramContext);
  }
  
  public static final void v(V paramV, DialogInterface paramDialogInterface)
  {
    Intrinsics.checkNotNullParameter(paramV, "this$0");
    paramV.cancel();
  }
  
  public final void A(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "expectedRedirectUrl");
    p = paramString;
  }
  
  public final void B(d paramd)
  {
    q = paramd;
  }
  
  public final void C(int paramInt)
  {
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    Object localObject1 = new g(getContext());
    r = ((WebView)localObject1);
    ((View)localObject1).setVerticalScrollBarEnabled(false);
    localObject1 = r;
    if (localObject1 != null) {
      ((View)localObject1).setHorizontalScrollBarEnabled(false);
    }
    localObject1 = r;
    if (localObject1 != null) {
      ((WebView)localObject1).setWebViewClient(new c());
    }
    localObject1 = r;
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((WebView)localObject1).getSettings();
    }
    if (localObject1 != null) {
      ((WebSettings)localObject1).setJavaScriptEnabled(true);
    }
    WebView localWebView = r;
    if (localWebView != null)
    {
      localObject1 = o;
      if (localObject1 != null) {
        localWebView.loadUrl((String)localObject1);
      }
    }
    else
    {
      localObject1 = r;
      if (localObject1 != null) {
        ((WebView)localObject1).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
      }
      localObject1 = r;
      if (localObject1 != null) {
        ((View)localObject1).setVisibility(4);
      }
      localObject1 = r;
      if (localObject1 == null) {
        localObject1 = null;
      } else {
        localObject1 = ((WebView)localObject1).getSettings();
      }
      if (localObject1 != null) {
        ((WebSettings)localObject1).setSavePassword(false);
      }
      localObject1 = r;
      if (localObject1 == null) {
        localObject1 = localObject2;
      } else {
        localObject1 = ((WebView)localObject1).getSettings();
      }
      if (localObject1 != null) {
        ((WebSettings)localObject1).setSaveFormData(false);
      }
      localObject1 = r;
      if (localObject1 != null) {
        ((View)localObject1).setFocusable(true);
      }
      localObject1 = r;
      if (localObject1 != null) {
        ((View)localObject1).setFocusableInTouchMode(true);
      }
      localObject1 = r;
      if (localObject1 != null) {
        ((View)localObject1).setOnTouchListener(new S());
      }
      localLinearLayout.setPadding(paramInt, paramInt, paramInt, paramInt);
      localLinearLayout.addView(r);
      localLinearLayout.setBackgroundColor(-872415232);
      localObject1 = u;
      if (localObject1 != null) {
        ((ViewGroup)localObject1).addView(localLinearLayout);
      }
      return;
    }
    throw new IllegalStateException("Required value was null.".toString());
  }
  
  public void cancel()
  {
    if ((q != null) && (!w)) {
      y(new q());
    }
  }
  
  public void dismiss()
  {
    Object localObject = r;
    if (localObject != null) {
      ((WebView)localObject).stopLoading();
    }
    if (!x)
    {
      localObject = s;
      if ((localObject != null) && (((Dialog)localObject).isShowing())) {
        ((Dialog)localObject).dismiss();
      }
    }
    super.dismiss();
  }
  
  public final void o()
  {
    Object localObject = new ImageView(getContext());
    t = ((ImageView)localObject);
    ((View)localObject).setOnClickListener(new U(this));
    localObject = getContext().getResources().getDrawable(M1.a.a);
    ImageView localImageView = t;
    if (localImageView != null) {
      localImageView.setImageDrawable((Drawable)localObject);
    }
    localObject = t;
    if (localObject != null) {
      ((ImageView)localObject).setVisibility(4);
    }
  }
  
  public void onAttachedToWindow()
  {
    x = false;
    Object localObject1 = P.a;
    localObject1 = getContext();
    Intrinsics.checkNotNullExpressionValue(localObject1, "context");
    if (P.n0((Context)localObject1))
    {
      WindowManager.LayoutParams localLayoutParams = z;
      if (localLayoutParams != null)
      {
        Object localObject2 = null;
        if (localLayoutParams == null) {
          localObject1 = null;
        } else {
          localObject1 = token;
        }
        if (localObject1 == null)
        {
          if (localLayoutParams != null)
          {
            localObject1 = getOwnerActivity();
            if (localObject1 == null) {
              localObject1 = null;
            } else {
              localObject1 = ((Activity)localObject1).getWindow();
            }
            if (localObject1 == null) {}
            do
            {
              localObject1 = null;
              break;
              localObject1 = ((Window)localObject1).getAttributes();
            } while (localObject1 == null);
            localObject1 = token;
            token = ((IBinder)localObject1);
          }
          localObject1 = z;
          if (localObject1 == null) {
            localObject1 = localObject2;
          } else {
            localObject1 = token;
          }
          P.j0("FacebookSDK.WebDialog", Intrinsics.i("Set token on onAttachedToWindow(): ", localObject1));
        }
      }
    }
    super.onAttachedToWindow();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = new ProgressDialog(getContext());
    s = paramBundle;
    paramBundle.requestWindowFeature(1);
    paramBundle = s;
    if (paramBundle != null) {
      paramBundle.setMessage(getContext().getString(d.d));
    }
    paramBundle = s;
    if (paramBundle != null) {
      paramBundle.setCanceledOnTouchOutside(false);
    }
    paramBundle = s;
    if (paramBundle != null) {
      paramBundle.setOnCancelListener(new T(this));
    }
    requestWindowFeature(1);
    u = new FrameLayout(getContext());
    x();
    paramBundle = getWindow();
    if (paramBundle != null) {
      paramBundle.setGravity(17);
    }
    paramBundle = getWindow();
    if (paramBundle != null) {
      paramBundle.setSoftInputMode(16);
    }
    o();
    if (o != null)
    {
      paramBundle = t;
      if (paramBundle != null) {
        C(paramBundle.getDrawable().getIntrinsicWidth() / 2 + 1);
      } else {
        throw new IllegalStateException("Required value was null.".toString());
      }
    }
    paramBundle = u;
    if (paramBundle != null) {
      paramBundle.addView(t, new ViewGroup.LayoutParams(-2, -2));
    }
    paramBundle = u;
    if (paramBundle != null)
    {
      setContentView(paramBundle);
      return;
    }
    throw new IllegalStateException("Required value was null.".toString());
  }
  
  public void onDetachedFromWindow()
  {
    x = true;
    super.onDetachedFromWindow();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    Intrinsics.checkNotNullParameter(paramKeyEvent, "event");
    if (paramInt == 4)
    {
      Object localObject = r;
      if (localObject != null)
      {
        if (localObject == null) {
          localObject = null;
        } else {
          localObject = Boolean.valueOf(((WebView)localObject).canGoBack());
        }
        if (Intrinsics.a(localObject, Boolean.TRUE))
        {
          paramKeyEvent = r;
          if (paramKeyEvent != null) {
            paramKeyEvent.goBack();
          }
          return true;
        }
      }
      cancel();
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onStart()
  {
    super.onStart();
    Object localObject = v;
    if (localObject != null)
    {
      if (localObject == null) {
        localObject = null;
      } else {
        localObject = ((AsyncTask)localObject).getStatus();
      }
      if (localObject == AsyncTask.Status.PENDING)
      {
        localObject = v;
        if (localObject != null) {
          ((AsyncTask)localObject).execute(new Void[0]);
        }
        localObject = s;
        if (localObject == null) {
          return;
        }
        ((Dialog)localObject).show();
        return;
      }
    }
    x();
  }
  
  public void onStop()
  {
    Object localObject = v;
    if (localObject != null)
    {
      ((AsyncTask)localObject).cancel(true);
      localObject = s;
      if (localObject != null) {
        ((Dialog)localObject).dismiss();
      }
    }
    super.onStop();
  }
  
  public void onWindowAttributesChanged(WindowManager.LayoutParams paramLayoutParams)
  {
    Intrinsics.checkNotNullParameter(paramLayoutParams, "params");
    if (token == null) {
      z = paramLayoutParams;
    }
    super.onWindowAttributesChanged(paramLayoutParams);
  }
  
  public final int q(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    int i = (int)(paramInt1 / paramFloat);
    double d;
    if (i <= paramInt2) {
      d = 1.0D;
    } else if (i >= paramInt3) {
      d = 0.5D;
    } else {
      d = (paramInt3 - i) / (paramInt3 - paramInt2) * 0.5D + 0.5D;
    }
    return (int)(paramInt1 * d);
  }
  
  public final WebView r()
  {
    return r;
  }
  
  public final boolean t()
  {
    return w;
  }
  
  public final boolean u()
  {
    return y;
  }
  
  public Bundle w(String paramString)
  {
    paramString = Uri.parse(paramString);
    Object localObject = P.a;
    localObject = P.o0(paramString.getQuery());
    ((Bundle)localObject).putAll(P.o0(paramString.getFragment()));
    return (Bundle)localObject;
  }
  
  public final void x()
  {
    Object localObject = getContext().getSystemService("window");
    if (localObject != null)
    {
      Display localDisplay = ((WindowManager)localObject).getDefaultDisplay();
      localObject = new DisplayMetrics();
      localDisplay.getMetrics((DisplayMetrics)localObject);
      int i = widthPixels;
      int j = heightPixels;
      int k;
      if (i < j) {
        k = i;
      } else {
        k = j;
      }
      int m = i;
      if (i < j) {
        m = j;
      }
      j = Math.min(q(k, density, 480, 800), widthPixels);
      i = Math.min(q(m, density, 800, 1280), heightPixels);
      localObject = getWindow();
      if (localObject != null) {
        ((Window)localObject).setLayout(j, i);
      }
      return;
    }
    throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
  }
  
  public final void y(Throwable paramThrowable)
  {
    if ((q != null) && (!w))
    {
      w = true;
      if ((paramThrowable instanceof o)) {
        paramThrowable = (o)paramThrowable;
      } else {
        paramThrowable = new o(paramThrowable);
      }
      d locald = q;
      if (locald != null) {
        locald.a(null, paramThrowable);
      }
      dismiss();
    }
  }
  
  public final void z(Bundle paramBundle)
  {
    d locald = q;
    if ((locald != null) && (!w))
    {
      w = true;
      if (locald != null) {
        locald.a(paramBundle, null);
      }
      dismiss();
    }
  }
  
  public static class a
  {
    public Context a;
    public String b;
    public String c;
    public int d;
    public V.d e;
    public Bundle f;
    public x1.a g;
    
    public a(Context paramContext, String paramString, Bundle paramBundle)
    {
      Object localObject = x1.a.z;
      g = ((a.c)localObject).e();
      if (!((a.c)localObject).g())
      {
        localObject = P.J(paramContext);
        if (localObject != null) {
          b = ((String)localObject);
        } else {
          throw new o("Attempted to create a builder without a valid access token or a valid default Application ID.");
        }
      }
      b(paramContext, paramString, paramBundle);
    }
    
    public a(Context paramContext, String paramString1, String paramString2, Bundle paramBundle)
    {
      String str = paramString1;
      if (paramString1 == null) {
        str = P.J(paramContext);
      }
      b = Q.k(str, "applicationId");
      b(paramContext, paramString2, paramBundle);
    }
    
    public V a()
    {
      Object localObject = g;
      if (localObject != null)
      {
        Bundle localBundle = f;
        localb = null;
        if (localBundle != null)
        {
          if (localObject == null) {
            localObject = null;
          } else {
            localObject = ((x1.a)localObject).c();
          }
          localBundle.putString("app_id", (String)localObject);
        }
        localBundle = f;
        if (localBundle != null)
        {
          localObject = g;
          if (localObject == null) {
            localObject = localb;
          } else {
            localObject = ((x1.a)localObject).l();
          }
          localBundle.putString("access_token", (String)localObject);
        }
      }
      else
      {
        localObject = f;
        if (localObject != null) {
          ((BaseBundle)localObject).putString("app_id", b);
        }
      }
      V.b localb = V.A;
      localObject = a;
      if (localObject != null) {
        return localb.c((Context)localObject, c, f, d, e);
      }
      throw new IllegalStateException("Required value was null.".toString());
    }
    
    public final void b(Context paramContext, String paramString, Bundle paramBundle)
    {
      a = paramContext;
      c = paramString;
      if (paramBundle != null) {
        f = paramBundle;
      } else {
        f = new Bundle();
      }
    }
    
    public final String c()
    {
      return b;
    }
    
    public final Context d()
    {
      return a;
    }
    
    public final V.d e()
    {
      return e;
    }
    
    public final Bundle f()
    {
      return f;
    }
    
    public final int g()
    {
      return d;
    }
    
    public final a h(V.d paramd)
    {
      e = paramd;
      return this;
    }
  }
  
  public static final class b
  {
    public final int a()
    {
      Q.l();
      return V.i();
    }
    
    public final void b(Context paramContext)
    {
      if (paramContext == null) {
        return;
      }
      try
      {
        ApplicationInfo localApplicationInfo = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
        if (localApplicationInfo == null) {
          paramContext = null;
        } else {
          paramContext = metaData;
        }
        if (paramContext == null) {
          return;
        }
        if (V.i() == 0) {
          e(metaData.getInt("com.facebook.sdk.WebDialogTheme"));
        }
        return;
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        for (;;) {}
      }
    }
    
    public final V c(Context paramContext, String paramString, Bundle paramBundle, int paramInt, V.d paramd)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      V.s(paramContext);
      return new V(paramContext, paramString, paramBundle, paramInt, Y1.B.q, paramd, null);
    }
    
    public final V d(Context paramContext, String paramString, Bundle paramBundle, int paramInt, Y1.B paramB, V.d paramd)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramB, "targetApp");
      V.s(paramContext);
      return new V(paramContext, paramString, paramBundle, paramInt, paramB, paramd, null);
    }
    
    public final void e(int paramInt)
    {
      if (paramInt == 0) {
        paramInt = V.f();
      }
      V.n(paramInt);
    }
  }
  
  public final class c
    extends WebViewClient
  {
    public c() {}
    
    public void onPageFinished(WebView paramWebView, String paramString)
    {
      Intrinsics.checkNotNullParameter(paramWebView, "view");
      Intrinsics.checkNotNullParameter(paramString, "url");
      super.onPageFinished(paramWebView, paramString);
      if (!V.j(V.this))
      {
        paramWebView = V.h(V.this);
        if (paramWebView != null) {
          paramWebView.dismiss();
        }
      }
      paramWebView = V.d(V.this);
      if (paramWebView != null) {
        paramWebView.setBackgroundColor(0);
      }
      paramWebView = r();
      if (paramWebView != null) {
        paramWebView.setVisibility(0);
      }
      paramWebView = V.e(V.this);
      if (paramWebView != null) {
        paramWebView.setVisibility(0);
      }
      V.k(V.this, true);
    }
    
    public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      Intrinsics.checkNotNullParameter(paramWebView, "view");
      Intrinsics.checkNotNullParameter(paramString, "url");
      P localP = P.a;
      P.j0("FacebookSDK.WebDialog", Intrinsics.i("Webview loading URL: ", paramString));
      super.onPageStarted(paramWebView, paramString, paramBitmap);
      if (!V.j(V.this))
      {
        paramWebView = V.h(V.this);
        if (paramWebView != null) {
          paramWebView.show();
        }
      }
    }
    
    public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
    {
      Intrinsics.checkNotNullParameter(paramWebView, "view");
      Intrinsics.checkNotNullParameter(paramString1, "description");
      Intrinsics.checkNotNullParameter(paramString2, "failingUrl");
      super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
      y(new m(paramString1, paramInt, paramString2));
    }
    
    public void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
    {
      Intrinsics.checkNotNullParameter(paramWebView, "view");
      Intrinsics.checkNotNullParameter(paramSslErrorHandler, "handler");
      Intrinsics.checkNotNullParameter(paramSslError, "error");
      super.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
      paramSslErrorHandler.cancel();
      y(new m(null, -11, null));
    }
    
    public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
    {
      Intrinsics.checkNotNullParameter(paramWebView, "view");
      Intrinsics.checkNotNullParameter(paramString, "url");
      paramWebView = P.a;
      P.j0("FacebookSDK.WebDialog", Intrinsics.i("Redirect URL: ", paramString));
      paramWebView = Uri.parse(paramString);
      Object localObject = paramWebView.getPath();
      boolean bool = true;
      if ((localObject != null) && (Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", paramWebView.getPath()))) {
        i = 1;
      } else {
        i = 0;
      }
      Bundle localBundle;
      if (i.s(paramString, V.g(V.this), false, 2, null))
      {
        localBundle = w(paramString);
        paramWebView = localBundle.getString("error");
        paramString = paramWebView;
        if (paramWebView == null) {
          paramString = localBundle.getString("error_type");
        }
        localObject = localBundle.getString("error_msg");
        paramWebView = (WebView)localObject;
        if (localObject == null) {
          paramWebView = localBundle.getString("error_message");
        }
        localObject = paramWebView;
        if (paramWebView == null) {
          localObject = localBundle.getString("error_description");
        }
        paramWebView = localBundle.getString("error_code");
        if ((paramWebView == null) || (P.c0(paramWebView))) {}
      }
      try
      {
        i = Integer.parseInt(paramWebView);
      }
      catch (NumberFormatException paramWebView)
      {
        for (;;) {}
      }
      int i = -1;
      if ((P.c0(paramString)) && (P.c0((String)localObject)) && (i == -1))
      {
        z(localBundle);
      }
      else
      {
        if ((paramString != null) && ((Intrinsics.a(paramString, "access_denied")) || (Intrinsics.a(paramString, "OAuthAccessDeniedException")))) {}
        while (i == 4201)
        {
          cancel();
          break;
        }
        paramWebView = new r(i, paramString, (String)localObject);
        y(new D(paramWebView, (String)localObject));
      }
      return true;
      if (i.s(paramString, "fbconnect://cancel", false, 2, null))
      {
        cancel();
        return true;
      }
      if ((i == 0) && (!i.v(paramString, "touch", false, 2, null)))
      {
        try
        {
          localObject = getContext();
          paramWebView = new android/content/Intent;
          paramWebView.<init>("android.intent.action.VIEW", Uri.parse(paramString));
          ((Context)localObject).startActivity(paramWebView);
        }
        catch (ActivityNotFoundException paramWebView)
        {
          bool = false;
        }
        return bool;
      }
      return false;
    }
  }
  
  public static abstract interface d
  {
    public abstract void a(Bundle paramBundle, o paramo);
  }
  
  public final class e
    extends AsyncTask
  {
    public final String a;
    public final Bundle b;
    public Exception[] c;
    
    public e(String paramString, Bundle paramBundle)
    {
      a = paramString;
      b = paramBundle;
      c = new Exception[0];
    }
    
    public static final void c(String[] paramArrayOfString, int paramInt, e parame, CountDownLatch paramCountDownLatch, K paramK)
    {
      Intrinsics.checkNotNullParameter(paramArrayOfString, "$results");
      Intrinsics.checkNotNullParameter(parame, "this$0");
      Intrinsics.checkNotNullParameter(paramCountDownLatch, "$latch");
      Intrinsics.checkNotNullParameter(paramK, "response");
      try
      {
        r localr = paramK.b();
        Object localObject = "Error staging photo.";
        if (localr != null)
        {
          paramArrayOfString = localr.c();
          if (paramArrayOfString == null) {
            paramArrayOfString = (String[])localObject;
          }
          localObject = new x1/p;
          ((p)localObject).<init>(paramK, paramArrayOfString);
          throw ((Throwable)localObject);
        }
      }
      catch (Exception paramArrayOfString)
      {
        break label135;
        paramK = paramK.c();
        if (paramK != null)
        {
          paramK = paramK.optString("uri");
          if (paramK != null)
          {
            paramArrayOfString[paramInt] = paramK;
          }
          else
          {
            paramArrayOfString = new x1/o;
            paramArrayOfString.<init>("Error staging photo.");
            throw paramArrayOfString;
          }
        }
        else
        {
          paramArrayOfString = new x1/o;
          paramArrayOfString.<init>("Error staging photo.");
          throw paramArrayOfString;
          label135:
          c[paramInt] = paramArrayOfString;
        }
        paramCountDownLatch.countDown();
      }
    }
    
    public String[] b(Void... paramVarArgs)
    {
      if (T1.a.d(this)) {
        return null;
      }
      try
      {
        Intrinsics.checkNotNullParameter(paramVarArgs, "p0");
        String[] arrayOfString1 = b.getStringArray("media");
        if (arrayOfString1 == null) {
          return null;
        }
        String[] arrayOfString2 = new String[arrayOfString1.length];
        c = new Exception[arrayOfString1.length];
        Object localObject = new java/util/concurrent/CountDownLatch;
        ((CountDownLatch)localObject).<init>(arrayOfString1.length);
        paramVarArgs = new java/util/concurrent/ConcurrentLinkedQueue;
        paramVarArgs.<init>();
        x1.a locala = x1.a.z.e();
        int i;
        int j;
        int k;
        Uri localUri;
        W localW;
        a2.a locala1;
        label279:
        return null;
      }
      finally
      {
        try
        {
          i = arrayOfString1.length - 1;
          if (i >= 0) {
            for (j = 0;; j = k)
            {
              k = j + 1;
              if (isCancelled())
              {
                localObject = paramVarArgs.iterator();
                while (((Iterator)localObject).hasNext())
                {
                  ((I)((Iterator)localObject).next()).cancel(true);
                  continue;
                  paramVarArgs = finally;
                  break label279;
                }
                return null;
              }
              localUri = Uri.parse(arrayOfString1[j]);
              if (P.e0(localUri))
              {
                arrayOfString2[j] = localUri.toString();
                ((CountDownLatch)localObject).countDown();
              }
              else
              {
                localW = new O1/W;
                localW.<init>(arrayOfString2, j, this, (CountDownLatch)localObject);
                locala1 = a2.a.a;
                Intrinsics.checkNotNullExpressionValue(localUri, "uri");
                paramVarArgs.add(a2.a.a(locala, localUri, localW).l());
              }
              if (k > i) {
                break;
              }
            }
          }
          ((CountDownLatch)localObject).await();
          return arrayOfString2;
        }
        catch (Exception localException)
        {
          paramVarArgs = paramVarArgs.iterator();
          while (paramVarArgs.hasNext()) {
            ((I)paramVarArgs.next()).cancel(true);
          }
          return null;
        }
        T1.a.b(paramVarArgs, this);
      }
    }
    
    public void d(String[] paramArrayOfString)
    {
      if (T1.a.d(this)) {
        return;
      }
      try
      {
        localObject1 = V.h(V.this);
        if (localObject1 != null) {
          ((Dialog)localObject1).dismiss();
        }
        localObject2 = c;
        int i = localObject2.length;
        j = 0;
        while (j < i)
        {
          localObject1 = localObject2[j];
          j++;
          if (localObject1 != null)
          {
            y((Throwable)localObject1);
            return;
          }
        }
      }
      finally
      {
        int j;
        break label272;
        if (paramArrayOfString == null)
        {
          localObject1 = V.this;
          paramArrayOfString = new x1/o;
          paramArrayOfString.<init>("Failed to stage photos for web dialog");
          ((V)localObject1).y(paramArrayOfString);
          return;
        }
        paramArrayOfString = g.b(paramArrayOfString);
        if (paramArrayOfString.contains(null))
        {
          localObject1 = V.this;
          paramArrayOfString = new x1/o;
          paramArrayOfString.<init>("Failed to stage photos for web dialog");
          ((V)localObject1).y(paramArrayOfString);
          return;
        }
        Object localObject1 = P.a;
        localObject1 = b;
        Object localObject2 = new org/json/JSONArray;
        ((JSONArray)localObject2).<init>((Collection)paramArrayOfString);
        P.p0((Bundle)localObject1, "media", localObject2);
        paramArrayOfString = H.b();
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append(x1.B.w());
        ((StringBuilder)localObject1).append("/dialog/");
        ((StringBuilder)localObject1).append(a);
        paramArrayOfString = P.g(paramArrayOfString, ((StringBuilder)localObject1).toString(), b);
        V.m(V.this, paramArrayOfString.toString());
        paramArrayOfString = V.e(V.this);
        if (paramArrayOfString != null)
        {
          j = paramArrayOfString.getDrawable().getIntrinsicWidth();
          V.l(V.this, j / 2 + 1);
          return;
        }
        paramArrayOfString = new java/lang/IllegalStateException;
        paramArrayOfString.<init>("Required value was null.".toString());
        throw paramArrayOfString;
        label272:
        T1.a.b(paramArrayOfString, this);
      }
    }
  }
  
  public static final class g
    extends WebView
  {
    public g(Context paramContext)
    {
      super();
    }
    
    public void onWindowFocusChanged(boolean paramBoolean)
    {
      try
      {
        super.onWindowFocusChanged(paramBoolean);
        return;
      }
      catch (NullPointerException localNullPointerException)
      {
        for (;;) {}
      }
    }
  }
}

/* Location:
 * Qualified Name:     O1.V
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */