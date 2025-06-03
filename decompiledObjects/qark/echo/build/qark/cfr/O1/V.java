/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.app.ProgressDialog
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.net.http.SslError
 *  android.os.AsyncTask
 *  android.os.AsyncTask$Status
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.util.DisplayMetrics
 *  android.view.Display
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.webkit.SslErrorHandler
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Locale
 *  java.util.concurrent.ConcurrentLinkedQueue
 *  java.util.concurrent.CountDownLatch
 *  java.util.regex.Pattern
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package O1;

import O1.H;
import O1.P;
import O1.Q;
import O1.S;
import O1.T;
import O1.U;
import O1.W;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.x;
import kotlin.text.i;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.B;
import x1.D;
import x1.I;
import x1.K;
import x1.a;
import x1.m;
import x1.o;
import x1.p;
import x1.q;
import x1.r;

public class V
extends Dialog {
    public static final b A = new b(null);
    public static final int B = M1.e.a;
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

    public V(Context context, String string2) {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        Intrinsics.checkNotNullParameter(string2, "url");
        this(context, string2, A.a());
    }

    public V(Context context, String string2, int n8) {
        int n9 = n8;
        if (n8 == 0) {
            n9 = A.a();
        }
        super(context, n9);
        this.p = "fbconnect://success";
        this.o = string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public V(Context object, String string2, Bundle object2, int n8, Y1.B b8, d d8) {
        int n9 = n8;
        if (n8 == 0) {
            n9 = A.a();
        }
        super((Context)object, n9);
        String string3 = "fbconnect://success";
        this.p = "fbconnect://success";
        Object object3 = object2;
        if (object2 == null) {
            object3 = new Bundle();
        }
        object2 = string3;
        if (P.W((Context)object)) {
            object2 = "fbconnect://chrome_os_success";
        }
        this.p = object2;
        object3.putString("redirect_uri", (String)object2);
        object3.putString("display", "touch");
        object3.putString("client_id", B.m());
        object = x.a;
        object = String.format((Locale)Locale.ROOT, (String)"android-%s", (Object[])Arrays.copyOf((Object[])new Object[]{B.B()}, (int)1));
        Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(locale, format, *args)");
        object3.putString("sdk", (String)object);
        this.q = d8;
        if (Intrinsics.a(string2, "share") && object3.containsKey("media")) {
            this.v = new e(string2, (Bundle)object3);
            return;
        }
        if (f.a[b8.ordinal()] == 1) {
            object = H.k();
            string2 = "oauth/authorize";
        } else {
            object = H.b();
            object2 = new StringBuilder();
            object2.append(B.w());
            object2.append("/dialog/");
            object2.append((Object)string2);
            string2 = object2.toString();
        }
        object = P.g((String)object, string2, (Bundle)object3);
        this.o = object.toString();
    }

    public /* synthetic */ V(Context context, String string2, Bundle bundle, int n8, Y1.B b8, d d8, g g8) {
        this(context, string2, bundle, n8, b8, d8);
    }

    public static final boolean D(View view, MotionEvent motionEvent) {
        if (!view.hasFocus()) {
            view.requestFocus();
        }
        return false;
    }

    public static /* synthetic */ void a(V v8, DialogInterface dialogInterface) {
        V.v(v8, dialogInterface);
    }

    public static /* synthetic */ boolean b(View view, MotionEvent motionEvent) {
        return V.D(view, motionEvent);
    }

    public static /* synthetic */ void c(V v8, View view) {
        V.p(v8, view);
    }

    public static final /* synthetic */ void k(V v8, boolean bl) {
        v8.y = bl;
    }

    public static final /* synthetic */ void m(V v8, String string2) {
        v8.o = string2;
    }

    public static final /* synthetic */ void n(int n8) {
        C = n8;
    }

    public static final void p(V v8, View view) {
        Intrinsics.checkNotNullParameter((Object)v8, "this$0");
        v8.cancel();
    }

    public static final void s(Context context) {
        A.b(context);
    }

    public static final void v(V v8, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter((Object)v8, "this$0");
        v8.cancel();
    }

    public final void A(String string2) {
        Intrinsics.checkNotNullParameter(string2, "expectedRedirectUrl");
        this.p = string2;
    }

    public final void B(d d8) {
        this.q = d8;
    }

    public final void C(int n8) {
        block15 : {
            WebView webView;
            LinearLayout linearLayout;
            Object var3_4;
            block14 : {
                linearLayout = new LinearLayout(this.getContext());
                this.r = webView = new WebView(this.getContext()){

                    public void onWindowFocusChanged(boolean bl) {
                        try {
                            super.onWindowFocusChanged(bl);
                            return;
                        }
                        catch (NullPointerException nullPointerException) {
                            return;
                        }
                    }
                };
                webView.setVerticalScrollBarEnabled(false);
                webView = this.r;
                if (webView != null) {
                    webView.setHorizontalScrollBarEnabled(false);
                }
                webView = this.r;
                if (webView != null) {
                    webView.setWebViewClient((WebViewClient)new c());
                }
                webView = this.r;
                var3_4 = null;
                webView = webView == null ? null : webView.getSettings();
                if (webView != null) {
                    webView.setJavaScriptEnabled(true);
                }
                webView = this.r;
                if (webView == null) break block14;
                String string2 = this.o;
                if (string2 == null) break block15;
                webView.loadUrl(string2);
            }
            if ((webView = this.r) != null) {
                webView.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
            }
            webView = this.r;
            if (webView != null) {
                webView.setVisibility(4);
            }
            webView = this.r;
            webView = webView == null ? null : webView.getSettings();
            if (webView != null) {
                webView.setSavePassword(false);
            }
            webView = this.r;
            webView = webView == null ? var3_4 : webView.getSettings();
            if (webView != null) {
                webView.setSaveFormData(false);
            }
            webView = this.r;
            if (webView != null) {
                webView.setFocusable(true);
            }
            webView = this.r;
            if (webView != null) {
                webView.setFocusableInTouchMode(true);
            }
            webView = this.r;
            if (webView != null) {
                webView.setOnTouchListener((View.OnTouchListener)new S());
            }
            linearLayout.setPadding(n8, n8, n8, n8);
            linearLayout.addView((View)this.r);
            linearLayout.setBackgroundColor(-872415232);
            webView = this.u;
            if (webView == null) {
                return;
            }
            webView.addView((View)linearLayout);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public void cancel() {
        if (this.q != null && !this.w) {
            this.y((Throwable)new q());
        }
    }

    public void dismiss() {
        WebView webView = this.r;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.x && (webView = this.s) != null && webView.isShowing()) {
            webView.dismiss();
        }
        super.dismiss();
    }

    public final void o() {
        ImageView imageView;
        this.t = imageView = new ImageView(this.getContext());
        imageView.setOnClickListener((View.OnClickListener)new U(this));
        imageView = this.getContext().getResources().getDrawable(M1.a.a);
        ImageView imageView2 = this.t;
        if (imageView2 != null) {
            imageView2.setImageDrawable((Drawable)imageView);
        }
        imageView = this.t;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(4);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        this.x = false;
        P p8 = P.a;
        p8 = this.getContext();
        Intrinsics.checkNotNullExpressionValue(p8, "context");
        if (P.n0((Context)p8) && (layoutParams = this.z) != null) {
            Object var2_3 = null;
            p8 = layoutParams == null ? null : layoutParams.token;
            if (p8 == null) {
                if (layoutParams != null) {
                    p8 = this.getOwnerActivity();
                    p8 = p8 == null ? null : p8.getWindow();
                    p8 = p8 == null || (p8 = p8.getAttributes()) == null ? null : p8.token;
                    layoutParams.token = p8;
                }
                p8 = (p8 = this.z) == null ? var2_3 : p8.token;
                P.j0("FacebookSDK.WebDialog", Intrinsics.i("Set token on onAttachedToWindow(): ", p8));
            }
        }
        super.onAttachedToWindow();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = new ProgressDialog(this.getContext());
        this.s = bundle;
        bundle.requestWindowFeature(1);
        bundle = this.s;
        if (bundle != null) {
            bundle.setMessage((CharSequence)this.getContext().getString(M1.d.d));
        }
        bundle = this.s;
        if (bundle != null) {
            bundle.setCanceledOnTouchOutside(false);
        }
        bundle = this.s;
        if (bundle != null) {
            bundle.setOnCancelListener((DialogInterface.OnCancelListener)new T(this));
        }
        this.requestWindowFeature(1);
        this.u = new FrameLayout(this.getContext());
        this.x();
        bundle = this.getWindow();
        if (bundle != null) {
            bundle.setGravity(17);
        }
        bundle = this.getWindow();
        if (bundle != null) {
            bundle.setSoftInputMode(16);
        }
        this.o();
        if (this.o != null) {
            bundle = this.t;
            if (bundle != null) {
                this.C(bundle.getDrawable().getIntrinsicWidth() / 2 + 1);
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        if ((bundle = this.u) != null) {
            bundle.addView((View)this.t, new ViewGroup.LayoutParams(-2, -2));
        }
        bundle = this.u;
        if (bundle != null) {
            this.setContentView((View)bundle);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public void onDetachedFromWindow() {
        this.x = true;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int n8, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter((Object)keyEvent, "event");
        if (n8 == 4) {
            WebView webView = this.r;
            if (webView != null) {
                webView = webView == null ? null : Boolean.valueOf((boolean)webView.canGoBack());
                if (Intrinsics.a((Object)webView, (Object)Boolean.TRUE)) {
                    keyEvent = this.r;
                    if (keyEvent != null) {
                        keyEvent.goBack();
                    }
                    return true;
                }
            }
            this.cancel();
        }
        return super.onKeyDown(n8, keyEvent);
    }

    public void onStart() {
        super.onStart();
        e e8 = this.v;
        if (e8 != null) {
            e8 = e8 == null ? null : e8.getStatus();
            if (e8 == AsyncTask.Status.PENDING) {
                e8 = this.v;
                if (e8 != null) {
                    e8.execute((Object[])new Void[0]);
                }
                e8 = this.s;
                if (e8 == null) {
                    return;
                }
                e8.show();
                return;
            }
        }
        this.x();
    }

    public void onStop() {
        e e8 = this.v;
        if (e8 != null) {
            e8.cancel(true);
            e8 = this.s;
            if (e8 != null) {
                e8.dismiss();
            }
        }
        super.onStop();
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter((Object)layoutParams, "params");
        if (layoutParams.token == null) {
            this.z = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    public final int q(int n8, float f8, int n9, int n10) {
        int n11 = (int)((float)n8 / f8);
        double d8 = n11 <= n9 ? 1.0 : (n11 >= n10 ? 0.5 : (double)(n10 - n11) / (double)(n10 - n9) * 0.5 + 0.5);
        return (int)((double)n8 * d8);
    }

    public final WebView r() {
        return this.r;
    }

    public final boolean t() {
        return this.w;
    }

    public final boolean u() {
        return this.y;
    }

    public Bundle w(String string2) {
        string2 = Uri.parse((String)string2);
        P p8 = P.a;
        p8 = P.o0(string2.getQuery());
        p8.putAll(P.o0(string2.getFragment()));
        return p8;
    }

    public final void x() {
        Object object = this.getContext().getSystemService("window");
        if (object != null) {
            object = ((WindowManager)object).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            object.getMetrics(displayMetrics);
            int n8 = displayMetrics.widthPixels;
            int n9 = displayMetrics.heightPixels;
            int n10 = n8 < n9 ? n8 : n9;
            int n11 = n8;
            if (n8 < n9) {
                n11 = n9;
            }
            n8 = Math.min((int)this.q(n10, displayMetrics.density, 480, 800), (int)displayMetrics.widthPixels);
            n9 = Math.min((int)this.q(n11, displayMetrics.density, 800, 1280), (int)displayMetrics.heightPixels);
            object = this.getWindow();
            if (object == null) {
                return;
            }
            object.setLayout(n8, n9);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    public final void y(Throwable object) {
        if (this.q != null && !this.w) {
            this.w = true;
            object = object instanceof o ? (o)((Object)object) : new o((Throwable)object);
            d d8 = this.q;
            if (d8 != null) {
                d8.a(null, (o)((Object)object));
            }
            this.dismiss();
        }
    }

    public final void z(Bundle bundle) {
        d d8 = this.q;
        if (d8 != null && !this.w) {
            this.w = true;
            if (d8 != null) {
                d8.a(bundle, null);
            }
            this.dismiss();
        }
    }

    public static class a {
        public Context a;
        public String b;
        public String c;
        public int d;
        public d e;
        public Bundle f;
        public x1.a g;

        public a(Context context, String string2, Bundle bundle) {
            Intrinsics.checkNotNullParameter((Object)context, "context");
            Intrinsics.checkNotNullParameter(string2, "action");
            Object object = x1.a.z;
            this.g = object.e();
            if (!object.g()) {
                object = P.J(context);
                if (object != null) {
                    this.b = object;
                } else {
                    throw new o("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
            }
            this.b(context, string2, bundle);
        }

        public a(Context context, String string2, String string3, Bundle bundle) {
            Intrinsics.checkNotNullParameter((Object)context, "context");
            Intrinsics.checkNotNullParameter(string3, "action");
            String string4 = string2;
            if (string2 == null) {
                string4 = P.J(context);
            }
            this.b = Q.k(string4, "applicationId");
            this.b(context, string3, bundle);
        }

        public V a() {
            Context context;
            Object object = this.g;
            if (object != null) {
                Bundle bundle = this.f;
                context = null;
                if (bundle != null) {
                    object = object == null ? null : object.c();
                    bundle.putString("app_id", (String)object);
                }
                if ((bundle = this.f) != null) {
                    object = this.g;
                    object = object == null ? context : object.l();
                    bundle.putString("access_token", (String)object);
                }
            } else {
                object = this.f;
                if (object != null) {
                    object.putString("app_id", this.b);
                }
            }
            object = V.A;
            context = this.a;
            if (context != null) {
                return object.c(context, this.c, this.f, this.d, this.e);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final void b(Context context, String string2, Bundle bundle) {
            this.a = context;
            this.c = string2;
            if (bundle != null) {
                this.f = bundle;
                return;
            }
            this.f = new Bundle();
        }

        public final String c() {
            return this.b;
        }

        public final Context d() {
            return this.a;
        }

        public final d e() {
            return this.e;
        }

        public final Bundle f() {
            return this.f;
        }

        public final int g() {
            return this.d;
        }

        public final a h(d d8) {
            this.e = d8;
            return this;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(g g8) {
            this();
        }

        public final int a() {
            Q.l();
            return C;
        }

        public final void b(Context context) {
            block4 : {
                if (context == null) {
                    return;
                }
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                    context = applicationInfo == null ? null : applicationInfo.metaData;
                    if (context != null) break block4;
                    return;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    return;
                }
            }
            if (C == 0) {
                this.e(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
            }
        }

        public final V c(Context context, String string2, Bundle bundle, int n8, d d8) {
            Intrinsics.checkNotNullParameter((Object)context, "context");
            V.s(context);
            return new V(context, string2, bundle, n8, Y1.B.q, d8, null);
        }

        public final V d(Context context, String string2, Bundle bundle, int n8, Y1.B b8, d d8) {
            Intrinsics.checkNotNullParameter((Object)context, "context");
            Intrinsics.checkNotNullParameter((Object)b8, "targetApp");
            V.s(context);
            return new V(context, string2, bundle, n8, b8, d8, null);
        }

        public final void e(int n8) {
            if (n8 == 0) {
                n8 = B;
            }
            V.n(n8);
        }
    }

    public final class c
    extends WebViewClient {
        public c() {
            Intrinsics.checkNotNullParameter((Object)V.this, "this$0");
        }

        public void onPageFinished(WebView webView, String string2) {
            Intrinsics.checkNotNullParameter((Object)webView, "view");
            Intrinsics.checkNotNullParameter(string2, "url");
            super.onPageFinished(webView, string2);
            if (!V.this.x && (webView = V.this.s) != null) {
                webView.dismiss();
            }
            if ((webView = V.this.u) != null) {
                webView.setBackgroundColor(0);
            }
            webView = V.this.r();
            if (webView != null) {
                webView.setVisibility(0);
            }
            webView = V.this.t;
            if (webView != null) {
                webView.setVisibility(0);
            }
            V.k(V.this, true);
        }

        public void onPageStarted(WebView webView, String string2, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter((Object)webView, "view");
            Intrinsics.checkNotNullParameter(string2, "url");
            P p8 = P.a;
            P.j0("FacebookSDK.WebDialog", Intrinsics.i("Webview loading URL: ", string2));
            super.onPageStarted(webView, string2, bitmap);
            if (!V.this.x) {
                webView = V.this.s;
                if (webView == null) {
                    return;
                }
                webView.show();
            }
        }

        public void onReceivedError(WebView webView, int n8, String string2, String string3) {
            Intrinsics.checkNotNullParameter((Object)webView, "view");
            Intrinsics.checkNotNullParameter(string2, "description");
            Intrinsics.checkNotNullParameter(string3, "failingUrl");
            super.onReceivedError(webView, n8, string2, string3);
            V.this.y((Throwable)new m(string2, n8, string3));
        }

        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            Intrinsics.checkNotNullParameter((Object)webView, "view");
            Intrinsics.checkNotNullParameter((Object)sslErrorHandler, "handler");
            Intrinsics.checkNotNullParameter((Object)sslError, "error");
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            V.this.y((Throwable)new m(null, -11, null));
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public boolean shouldOverrideUrlLoading(WebView object, String object2) {
            int n8;
            Bundle bundle;
            Object object3;
            block14 : {
                Intrinsics.checkNotNullParameter(object, "view");
                Intrinsics.checkNotNullParameter(object2, "url");
                object = P.a;
                P.j0("FacebookSDK.WebDialog", Intrinsics.i("Redirect URL: ", object2));
                object = Uri.parse((String)object2);
                n8 = object.getPath() != null && Pattern.matches((String)"^/(v\\d+\\.\\d+/)??dialog/.*", (CharSequence)object.getPath()) ? 1 : 0;
                if (i.s((String)object2, V.this.p, false, 2, null)) {
                    bundle = V.this.w((String)object2);
                    object2 = object = bundle.getString("error");
                    if (object == null) {
                        object2 = bundle.getString("error_type");
                    }
                    object = object3 = bundle.getString("error_msg");
                    if (object3 == null) {
                        object = bundle.getString("error_message");
                    }
                    object3 = object;
                    if (object == null) {
                        object3 = bundle.getString("error_description");
                    }
                    if ((object = bundle.getString("error_code")) != null && !P.c0((String)object)) {
                        n8 = Integer.parseInt((String)object);
                        break block14;
                    }
                } else {
                    if (i.s((String)object2, "fbconnect://cancel", false, 2, null)) {
                        V.this.cancel();
                        return true;
                    }
                    if (n8 != 0) return false;
                    if (i.v((CharSequence)object2, "touch", false, 2, null)) {
                        return false;
                    }
                    V.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)object2)));
                    return true;
                    catch (NumberFormatException numberFormatException) {}
                }
                n8 = -1;
            }
            if (P.c0((String)object2) && P.c0((String)object3) && n8 == -1) {
                V.this.z(bundle);
                return true;
            }
            if ((object2 == null || !Intrinsics.a(object2, "access_denied") && !Intrinsics.a(object2, "OAuthAccessDeniedException")) && n8 != 4201) {
                object = new r(n8, (String)object2, (String)object3);
                V.this.y((Throwable)new D((r)object, (String)object3));
                return true;
            }
            V.this.cancel();
            return true;
            catch (ActivityNotFoundException activityNotFoundException) {
                return false;
            }
        }
    }

    public static interface d {
        public void a(Bundle var1, o var2);
    }

    public final class e
    extends AsyncTask {
        public final String a;
        public final Bundle b;
        public Exception[] c;

        public e(String string2, Bundle bundle) {
            Intrinsics.checkNotNullParameter((Object)V.this, "this$0");
            Intrinsics.checkNotNullParameter(string2, "action");
            Intrinsics.checkNotNullParameter((Object)bundle, "parameters");
            this.a = string2;
            this.b = bundle;
            this.c = new Exception[0];
        }

        public static /* synthetic */ void a(String[] arrstring, int n8, e e8, CountDownLatch countDownLatch, K k8) {
            e.c(arrstring, n8, e8, countDownLatch, k8);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public static final void c(String[] object, int n8, e e8, CountDownLatch countDownLatch, K object2) {
            block5 : {
                Exception exception2;
                block4 : {
                    Intrinsics.checkNotNullParameter(object, "$results");
                    Intrinsics.checkNotNullParameter((Object)e8, "this$0");
                    Intrinsics.checkNotNullParameter((Object)countDownLatch, "$latch");
                    Intrinsics.checkNotNullParameter(object2, "response");
                    try {
                        r r8 = object2.b();
                        String string2 = "Error staging photo.";
                        if (r8 != null) {
                            object = r8.c();
                            if (object != null) throw new p((K)object2, (String)object);
                            object = string2;
                            throw new p((K)object2, (String)object);
                        }
                        if ((object2 = object2.c()) == null) throw new o("Error staging photo.");
                        if ((object2 = object2.optString("uri")) == null) break block4;
                    }
                    catch (Exception exception2) {}
                    object[n8] = object2;
                    break block5;
                }
                throw new o("Error staging photo.");
                e8.c[n8] = exception2;
            }
            countDownLatch.countDown();
        }

        /*
         * Unable to fully structure code
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public /* varargs */ String[] b(Void ... var1_1) {
            block17 : {
                if (T1.a.d((Object)this)) {
                    return null;
                }
                Intrinsics.checkNotNullParameter((Object)var1_1, "p0");
                var5_3 = this.b.getStringArray("media");
                if (var5_3 != null) break block17;
                return null;
            }
            var6_5 = new String[var5_3.length];
            this.c = new Exception[var5_3.length];
            var7_6 = new CountDownLatch(var5_3.length);
            var1_1 = new ConcurrentLinkedQueue();
            var8_7 = x1.a.z.e();
            var4_8 = var5_3.length - 1;
            if (var4_8 < 0) ** GOTO lbl38
            var2_9 = 0;
            do {
                block18 : {
                    var3_10 = var2_9 + 1;
                    try {
                        if (this.isCancelled()) {
                            var5_3 = var1_1.iterator();
                            while (var5_3.hasNext()) {
                                ((I)var5_3.next()).cancel(true);
                            }
                            return null;
                        }
                        var9_11 = Uri.parse((String)var5_3[var2_9]);
                        if (P.e0(var9_11)) {
                            var6_5[var2_9] = var9_11.toString();
                            var7_6.countDown();
                        } else {
                            var10_12 = new W(var6_5, var2_9, this, var7_6);
                            var11_13 = a2.a.a;
                            Intrinsics.checkNotNullExpressionValue((Object)var9_11, "uri");
                            var1_1.add((Object)a2.a.a(var8_7, var9_11, var10_12).l());
                        }
                        if (var3_10 <= var4_8) break block18;
lbl38: // 2 sources:
                        var7_6.await();
                        return var6_5;
                    }
                    catch (Throwable var1_2) {
                        ** continue;
                    }
lbl40: // 1 sources:
                    do {
                        var1_1 = var1_1.iterator();
                        while (var1_1.hasNext()) {
                            ((I)var1_1.next()).cancel(true);
                        }
                        return null;
                        break;
                    } while (true);
lbl47: // 1 sources:
                    do {
                        T1.a.b(var1_2, (Object)this);
                        return null;
                        break;
                    } while (true);
                    {
                        catch (Exception var5_4) {
                            ** continue;
                        }
                    }
                }
                var2_9 = var3_10;
            } while (true);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void d(String[] object) {
            Throwable throwable2;
            if (T1.a.d((Object)this)) {
                return;
            }
            Object object2 = V.this.s;
            if (object2 != null) {
                object2.dismiss();
            }
            for (Exception exception : this.c) {
                if (exception == null) continue;
                try {
                    V.this.y((Throwable)exception);
                    return;
                }
                catch (Throwable throwable2) {
                }
            }
            if (object == null) {
                V.this.y((Throwable)new o("Failed to stage photos for web dialog"));
                return;
            }
            if ((object = W5.g.b((Object[])object)).contains((Object)null)) {
                V.this.y((Throwable)new o("Failed to stage photos for web dialog"));
                return;
            }
            object2 = P.a;
            P.p0(this.b, "media", (Object)new JSONArray((Collection)object));
            object = H.b();
            object2 = new StringBuilder();
            object2.append(B.w());
            object2.append("/dialog/");
            object2.append(this.a);
            object = P.g((String)object, object2.toString(), this.b);
            V.m(V.this, object.toString());
            object = V.this.t;
            if (object != null) {
                int n8 = object.getDrawable().getIntrinsicWidth();
                V.this.C(n8 / 2 + 1);
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
            T1.a.b(throwable2, (Object)this);
        }
    }

    public abstract class f {
        public static final /* synthetic */ int[] a;

        static {
            int[] arrn = new int[Y1.B.values().length];
            arrn[Y1.B.r.ordinal()] = 1;
            a = arrn;
        }
    }

}

