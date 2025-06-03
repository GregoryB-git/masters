// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import android.view.ViewGroup;
import android.os.BaseBundle;
import java.util.Collection;
import org.json.JSONArray;
import java.util.List;
import org.json.JSONObject;
import x1.r;
import x1.p;
import x1.K;
import java.util.concurrent.CountDownLatch;
import android.os.AsyncTask;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import x1.m;
import android.graphics.Bitmap;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import x1.o;
import android.view.Display;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.net.Uri;
import android.os.AsyncTask$Status;
import android.view.KeyEvent;
import android.content.DialogInterface$OnCancelListener;
import M1.d;
import android.view.Window;
import android.app.Activity;
import android.os.IBinder;
import android.graphics.drawable.Drawable;
import M1.a;
import android.view.View$OnClickListener;
import x1.q;
import android.webkit.WebSettings;
import android.view.View$OnTouchListener;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.content.DialogInterface;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.x;
import Y1.B;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import android.content.Context;
import M1.e;
import kotlin.jvm.internal.g;
import android.view.WindowManager$LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.app.ProgressDialog;
import android.webkit.WebView;
import android.app.Dialog;

public class V extends Dialog
{
    public static final b A;
    public static final int B;
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
    public WindowManager$LayoutParams z;
    
    static {
        A = new b(null);
        B = M1.e.a;
    }
    
    public V(final Context context, final String s) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(s, "url");
        this(context, s, V.A.a());
    }
    
    public V(final Context context, final String o, final int n) {
        int a = n;
        if (n == 0) {
            a = V.A.a();
        }
        super(context, a);
        this.p = "fbconnect://success";
        this.o = o;
    }
    
    public V(final Context context, String string, final Bundle bundle, final int n, final B b, final d q) {
        int a = n;
        if (n == 0) {
            a = V.A.a();
        }
        super(context, a);
        final String s = "fbconnect://success";
        this.p = "fbconnect://success";
        Bundle bundle2;
        if ((bundle2 = bundle) == null) {
            bundle2 = new Bundle();
        }
        String p6 = s;
        if (P.W(context)) {
            p6 = "fbconnect://chrome_os_success";
        }
        ((BaseBundle)bundle2).putString("redirect_uri", this.p = p6);
        ((BaseBundle)bundle2).putString("display", "touch");
        ((BaseBundle)bundle2).putString("client_id", x1.B.m());
        final x a2 = kotlin.jvm.internal.x.a;
        final String format = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[] { x1.B.B() }, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        ((BaseBundle)bundle2).putString("sdk", format);
        this.q = q;
        if (Intrinsics.a(string, "share") && ((BaseBundle)bundle2).containsKey("media")) {
            this.v = new e(string, bundle2);
            return;
        }
        String s2;
        if (f.a[b.ordinal()] == 1) {
            s2 = H.k();
            string = "oauth/authorize";
        }
        else {
            s2 = H.b();
            final StringBuilder sb = new StringBuilder();
            sb.append(x1.B.w());
            sb.append("/dialog/");
            sb.append((Object)string);
            string = sb.toString();
        }
        this.o = P.g(s2, string, bundle2).toString();
    }
    
    public static final boolean D(final View view, final MotionEvent motionEvent) {
        if (!view.hasFocus()) {
            view.requestFocus();
        }
        return false;
    }
    
    public static final /* synthetic */ FrameLayout d(final V v) {
        return v.u;
    }
    
    public static final /* synthetic */ ImageView e(final V v) {
        return v.t;
    }
    
    public static final /* synthetic */ int f() {
        return V.B;
    }
    
    public static final /* synthetic */ ProgressDialog h(final V v) {
        return v.s;
    }
    
    public static final /* synthetic */ int i() {
        return V.C;
    }
    
    public static final /* synthetic */ boolean j(final V v) {
        return v.x;
    }
    
    public static final /* synthetic */ void k(final V v, final boolean y) {
        v.y = y;
    }
    
    public static final /* synthetic */ void m(final V v, final String o) {
        v.o = o;
    }
    
    public static final /* synthetic */ void n(final int c) {
        V.C = c;
    }
    
    public static final void p(final V v, final View view) {
        Intrinsics.checkNotNullParameter(v, "this$0");
        v.cancel();
    }
    
    public static final void s(final Context context) {
        V.A.b(context);
    }
    
    public static final void v(final V v, final DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(v, "this$0");
        v.cancel();
    }
    
    public final void A(final String p) {
        Intrinsics.checkNotNullParameter(p, "expectedRedirectUrl");
        this.p = p;
    }
    
    public final void B(final d q) {
        this.q = q;
    }
    
    public final void C(final int n) {
        final LinearLayout linearLayout = new LinearLayout(this.getContext());
        ((View)(this.r = new WebView(this.getContext()) {
            public void onWindowFocusChanged(final boolean b) {
                try {
                    super.onWindowFocusChanged(b);
                }
                catch (NullPointerException ex) {}
            }
        })).setVerticalScrollBarEnabled(false);
        final WebView r = this.r;
        if (r != null) {
            ((View)r).setHorizontalScrollBarEnabled(false);
        }
        final WebView r2 = this.r;
        if (r2 != null) {
            r2.setWebViewClient((WebViewClient)new c());
        }
        final WebView r3 = this.r;
        final WebSettings webSettings = null;
        WebSettings settings;
        if (r3 == null) {
            settings = null;
        }
        else {
            settings = r3.getSettings();
        }
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        final WebView r4 = this.r;
        if (r4 != null) {
            final String o = this.o;
            if (o == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            r4.loadUrl(o);
        }
        final WebView r5 = this.r;
        if (r5 != null) {
            r5.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        }
        final WebView r6 = this.r;
        if (r6 != null) {
            ((View)r6).setVisibility(4);
        }
        final WebView r7 = this.r;
        WebSettings settings2;
        if (r7 == null) {
            settings2 = null;
        }
        else {
            settings2 = r7.getSettings();
        }
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        final WebView r8 = this.r;
        WebSettings settings3;
        if (r8 == null) {
            settings3 = webSettings;
        }
        else {
            settings3 = r8.getSettings();
        }
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        final WebView r9 = this.r;
        if (r9 != null) {
            ((View)r9).setFocusable(true);
        }
        final WebView r10 = this.r;
        if (r10 != null) {
            ((View)r10).setFocusableInTouchMode(true);
        }
        final WebView r11 = this.r;
        if (r11 != null) {
            ((View)r11).setOnTouchListener((View$OnTouchListener)new S());
        }
        ((View)linearLayout).setPadding(n, n, n, n);
        ((ViewGroup)linearLayout).addView((View)this.r);
        ((View)linearLayout).setBackgroundColor(-872415232);
        final FrameLayout u = this.u;
        if (u == null) {
            return;
        }
        ((ViewGroup)u).addView((View)linearLayout);
    }
    
    public void cancel() {
        if (this.q != null && !this.w) {
            this.y(new q());
        }
    }
    
    public void dismiss() {
        final WebView r = this.r;
        if (r != null) {
            r.stopLoading();
        }
        if (!this.x) {
            final ProgressDialog s = this.s;
            if (s != null) {
                if (((Dialog)s).isShowing()) {
                    ((Dialog)s).dismiss();
                }
            }
        }
        super.dismiss();
    }
    
    public final void o() {
        ((View)(this.t = new ImageView(this.getContext()))).setOnClickListener((View$OnClickListener)new U(this));
        final Drawable drawable = this.getContext().getResources().getDrawable(M1.a.a);
        final ImageView t = this.t;
        if (t != null) {
            t.setImageDrawable(drawable);
        }
        final ImageView t2 = this.t;
        if (t2 == null) {
            return;
        }
        t2.setVisibility(4);
    }
    
    public void onAttachedToWindow() {
        this.x = false;
        final P a = P.a;
        final Context context = this.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        if (P.n0(context)) {
            final WindowManager$LayoutParams z = this.z;
            if (z != null) {
                final Object o = null;
                IBinder token;
                if (z == null) {
                    token = null;
                }
                else {
                    token = z.token;
                }
                if (token == null) {
                    if (z != null) {
                        final Activity ownerActivity = this.getOwnerActivity();
                        Window window;
                        if (ownerActivity == null) {
                            window = null;
                        }
                        else {
                            window = ownerActivity.getWindow();
                        }
                        IBinder token2 = null;
                        Label_0108: {
                            if (window != null) {
                                final WindowManager$LayoutParams attributes = window.getAttributes();
                                if (attributes != null) {
                                    token2 = attributes.token;
                                    break Label_0108;
                                }
                            }
                            token2 = null;
                        }
                        z.token = token2;
                    }
                    final WindowManager$LayoutParams z2 = this.z;
                    Object token3;
                    if (z2 == null) {
                        token3 = o;
                    }
                    else {
                        token3 = z2.token;
                    }
                    P.j0("FacebookSDK.WebDialog", Intrinsics.i("Set token on onAttachedToWindow(): ", token3));
                }
            }
        }
        super.onAttachedToWindow();
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        ((Dialog)(this.s = new ProgressDialog(this.getContext()))).requestWindowFeature(1);
        final ProgressDialog s = this.s;
        if (s != null) {
            s.setMessage((CharSequence)this.getContext().getString(M1.d.d));
        }
        final ProgressDialog s2 = this.s;
        if (s2 != null) {
            ((Dialog)s2).setCanceledOnTouchOutside(false);
        }
        final ProgressDialog s3 = this.s;
        if (s3 != null) {
            ((Dialog)s3).setOnCancelListener((DialogInterface$OnCancelListener)new T(this));
        }
        this.requestWindowFeature(1);
        this.u = new FrameLayout(this.getContext());
        this.x();
        final Window window = this.getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        final Window window2 = this.getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        this.o();
        if (this.o != null) {
            final ImageView t = this.t;
            if (t == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            this.C(t.getDrawable().getIntrinsicWidth() / 2 + 1);
        }
        final FrameLayout u = this.u;
        if (u != null) {
            ((ViewGroup)u).addView((View)this.t, new ViewGroup$LayoutParams(-2, -2));
        }
        final FrameLayout u2 = this.u;
        if (u2 != null) {
            this.setContentView((View)u2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
    
    public void onDetachedFromWindow() {
        this.x = true;
        super.onDetachedFromWindow();
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "event");
        if (n == 4) {
            final WebView r = this.r;
            if (r != null) {
                Object value;
                if (r == null) {
                    value = null;
                }
                else {
                    value = r.canGoBack();
                }
                if (Intrinsics.a(value, Boolean.TRUE)) {
                    final WebView r2 = this.r;
                    if (r2 != null) {
                        r2.goBack();
                    }
                    return true;
                }
            }
            this.cancel();
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    public void onStart() {
        super.onStart();
        final e v = this.v;
        if (v != null) {
            AsyncTask$Status status;
            if (v == null) {
                status = null;
            }
            else {
                status = v.getStatus();
            }
            if (status == AsyncTask$Status.PENDING) {
                final e v2 = this.v;
                if (v2 != null) {
                    v2.execute((Object[])new Void[0]);
                }
                final ProgressDialog s = this.s;
                if (s == null) {
                    return;
                }
                ((Dialog)s).show();
                return;
            }
        }
        this.x();
    }
    
    public void onStop() {
        final e v = this.v;
        if (v != null) {
            v.cancel(true);
            final ProgressDialog s = this.s;
            if (s != null) {
                ((Dialog)s).dismiss();
            }
        }
        super.onStop();
    }
    
    public void onWindowAttributesChanged(final WindowManager$LayoutParams z) {
        Intrinsics.checkNotNullParameter(z, "params");
        if (z.token == null) {
            this.z = z;
        }
        super.onWindowAttributesChanged(z);
    }
    
    public final int q(final int n, final float n2, final int n3, final int n4) {
        final int n5 = (int)(n / n2);
        double n6;
        if (n5 <= n3) {
            n6 = 1.0;
        }
        else if (n5 >= n4) {
            n6 = 0.5;
        }
        else {
            n6 = (n4 - n5) / (double)(n4 - n3) * 0.5 + 0.5;
        }
        return (int)(n * n6);
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
    
    public Bundle w(final String s) {
        final Uri parse = Uri.parse(s);
        final P a = P.a;
        final Bundle o0 = P.o0(parse.getQuery());
        o0.putAll(P.o0(parse.getFragment()));
        return o0;
    }
    
    public final void x() {
        final Object systemService = this.getContext().getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        final Display defaultDisplay = ((WindowManager)systemService).getDefaultDisplay();
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        final int widthPixels = displayMetrics.widthPixels;
        final int heightPixels = displayMetrics.heightPixels;
        int n;
        if (widthPixels < heightPixels) {
            n = widthPixels;
        }
        else {
            n = heightPixels;
        }
        int n2 = widthPixels;
        if (widthPixels < heightPixels) {
            n2 = heightPixels;
        }
        final int min = Math.min(this.q(n, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        final int min2 = Math.min(this.q(n2, displayMetrics.density, 800, 1280), displayMetrics.heightPixels);
        final Window window = this.getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(min, min2);
    }
    
    public final void y(final Throwable t) {
        if (this.q != null && !this.w) {
            this.w = true;
            o o;
            if (t instanceof o) {
                o = (o)t;
            }
            else {
                o = new o(t);
            }
            final d q = this.q;
            if (q != null) {
                q.a(null, o);
            }
            this.dismiss();
        }
    }
    
    public final void z(final Bundle bundle) {
        final d q = this.q;
        if (q != null && !this.w) {
            this.w = true;
            if (q != null) {
                q.a(bundle, null);
            }
            this.dismiss();
        }
    }
    
    public static class a
    {
        public Context a;
        public String b;
        public String c;
        public int d;
        public d e;
        public Bundle f;
        public x1.a g;
        
        public a(final Context context, final String s, final Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(s, "action");
            final x1.a.c z = x1.a.z;
            this.g = z.e();
            if (!z.g()) {
                final String j = P.J(context);
                if (j == null) {
                    throw new o("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
                this.b = j;
            }
            this.b(context, s, bundle);
        }
        
        public a(final Context context, final String s, final String s2, final Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(s2, "action");
            String j = s;
            if (s == null) {
                j = P.J(context);
            }
            this.b = Q.k(j, "applicationId");
            this.b(context, s2, bundle);
        }
        
        public V a() {
            final x1.a g = this.g;
            if (g != null) {
                final Bundle f = this.f;
                final String s = null;
                if (f != null) {
                    String c;
                    if (g == null) {
                        c = null;
                    }
                    else {
                        c = g.c();
                    }
                    ((BaseBundle)f).putString("app_id", c);
                }
                final Bundle f2 = this.f;
                if (f2 != null) {
                    final x1.a g2 = this.g;
                    String l;
                    if (g2 == null) {
                        l = s;
                    }
                    else {
                        l = g2.l();
                    }
                    ((BaseBundle)f2).putString("access_token", l);
                }
            }
            else {
                final Bundle f3 = this.f;
                if (f3 != null) {
                    ((BaseBundle)f3).putString("app_id", this.b);
                }
            }
            final b a = V.A;
            final Context a2 = this.a;
            if (a2 != null) {
                return a.c(a2, this.c, this.f, this.d, this.e);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        
        public final void b(final Context a, final String c, final Bundle f) {
            this.a = a;
            this.c = c;
            if (f != null) {
                this.f = f;
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
        
        public final a h(final d e) {
            this.e = e;
            return this;
        }
    }
    
    public static final class b
    {
        public final int a() {
            Q.l();
            return V.i();
        }
        
        public final void b(final Context context) {
            if (context == null) {
                return;
            }
            try {
                final ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                Bundle metaData;
                if (applicationInfo == null) {
                    metaData = null;
                }
                else {
                    metaData = applicationInfo.metaData;
                }
                if (metaData == null) {
                    return;
                }
                if (V.i() == 0) {
                    this.e(((BaseBundle)applicationInfo.metaData).getInt("com.facebook.sdk.WebDialogTheme"));
                }
            }
            catch (PackageManager$NameNotFoundException ex) {}
        }
        
        public final V c(final Context context, final String s, final Bundle bundle, final int n, final d d) {
            Intrinsics.checkNotNullParameter(context, "context");
            V.s(context);
            return new V(context, s, bundle, n, Y1.B.q, d, null);
        }
        
        public final V d(final Context context, final String s, final Bundle bundle, final int n, final B b, final d d) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(b, "targetApp");
            V.s(context);
            return new V(context, s, bundle, n, b, d, null);
        }
        
        public final void e(int f) {
            if (f == 0) {
                f = V.f();
            }
            V.n(f);
        }
    }
    
    public final class c extends WebViewClient
    {
        public c() {
            Intrinsics.checkNotNullParameter(V.this, "this$0");
        }
        
        public void onPageFinished(WebView r, final String s) {
            Intrinsics.checkNotNullParameter(r, "view");
            Intrinsics.checkNotNullParameter(s, "url");
            super.onPageFinished(r, s);
            if (!V.j(V.this)) {
                final ProgressDialog h = V.h(V.this);
                if (h != null) {
                    ((Dialog)h).dismiss();
                }
            }
            final FrameLayout d = V.d(V.this);
            if (d != null) {
                ((View)d).setBackgroundColor(0);
            }
            r = V.this.r();
            if (r != null) {
                ((View)r).setVisibility(0);
            }
            final ImageView e = V.e(V.this);
            if (e != null) {
                e.setVisibility(0);
            }
            V.k(V.this, true);
        }
        
        public void onPageStarted(final WebView webView, final String s, final Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(webView, "view");
            Intrinsics.checkNotNullParameter(s, "url");
            final P a = P.a;
            P.j0("FacebookSDK.WebDialog", Intrinsics.i("Webview loading URL: ", s));
            super.onPageStarted(webView, s, bitmap);
            if (!V.j(V.this)) {
                final ProgressDialog h = V.h(V.this);
                if (h == null) {
                    return;
                }
                ((Dialog)h).show();
            }
        }
        
        public void onReceivedError(final WebView webView, final int n, final String s, final String s2) {
            Intrinsics.checkNotNullParameter(webView, "view");
            Intrinsics.checkNotNullParameter(s, "description");
            Intrinsics.checkNotNullParameter(s2, "failingUrl");
            super.onReceivedError(webView, n, s, s2);
            V.this.y(new m(s, n, s2));
        }
        
        public void onReceivedSslError(final WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
            Intrinsics.checkNotNullParameter(webView, "view");
            Intrinsics.checkNotNullParameter(sslErrorHandler, "handler");
            Intrinsics.checkNotNullParameter(sslError, "error");
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            V.this.y(new m(null, -11, null));
        }
        
        public boolean shouldOverrideUrlLoading(final WebView p0, final String p1) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "view"
            //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
            //     6: aload_2        
            //     7: ldc             "url"
            //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
            //    12: getstatic       O1/P.a:LO1/P;
            //    15: astore_1       
            //    16: ldc             "FacebookSDK.WebDialog"
            //    18: ldc             "Redirect URL: "
            //    20: aload_2        
            //    21: invokestatic    kotlin/jvm/internal/Intrinsics.i:(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
            //    24: invokestatic    O1/P.j0:(Ljava/lang/String;Ljava/lang/String;)V
            //    27: aload_2        
            //    28: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
            //    31: astore_1       
            //    32: aload_1        
            //    33: invokevirtual   android/net/Uri.getPath:()Ljava/lang/String;
            //    36: ifnull          56
            //    39: ldc             "^/(v\\d+\\.\\d+/)??dialog/.*"
            //    41: aload_1        
            //    42: invokevirtual   android/net/Uri.getPath:()Ljava/lang/String;
            //    45: invokestatic    java/util/regex/Pattern.matches:(Ljava/lang/String;Ljava/lang/CharSequence;)Z
            //    48: ifeq            56
            //    51: iconst_1       
            //    52: istore_3       
            //    53: goto            58
            //    56: iconst_0       
            //    57: istore_3       
            //    58: aload_2        
            //    59: aload_0        
            //    60: getfield        O1/V$c.a:LO1/V;
            //    63: invokestatic    O1/V.g:(LO1/V;)Ljava/lang/String;
            //    66: iconst_0       
            //    67: iconst_2       
            //    68: aconst_null    
            //    69: invokestatic    kotlin/text/i.s:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
            //    72: ifeq            280
            //    75: aload_0        
            //    76: getfield        O1/V$c.a:LO1/V;
            //    79: aload_2        
            //    80: invokevirtual   O1/V.w:(Ljava/lang/String;)Landroid/os/Bundle;
            //    83: astore          5
            //    85: aload           5
            //    87: ldc             "error"
            //    89: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
            //    92: astore_1       
            //    93: aload_1        
            //    94: astore_2       
            //    95: aload_1        
            //    96: ifnonnull       107
            //    99: aload           5
            //   101: ldc             "error_type"
            //   103: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
            //   106: astore_2       
            //   107: aload           5
            //   109: ldc             "error_msg"
            //   111: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
            //   114: astore          4
            //   116: aload           4
            //   118: astore_1       
            //   119: aload           4
            //   121: ifnonnull       132
            //   124: aload           5
            //   126: ldc             "error_message"
            //   128: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
            //   131: astore_1       
            //   132: aload_1        
            //   133: astore          4
            //   135: aload_1        
            //   136: ifnonnull       148
            //   139: aload           5
            //   141: ldc             "error_description"
            //   143: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
            //   146: astore          4
            //   148: aload           5
            //   150: ldc             "error_code"
            //   152: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
            //   155: astore_1       
            //   156: aload_1        
            //   157: ifnull          175
            //   160: aload_1        
            //   161: invokestatic    O1/P.c0:(Ljava/lang/String;)Z
            //   164: ifne            175
            //   167: aload_1        
            //   168: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
            //   171: istore_3       
            //   172: goto            177
            //   175: iconst_m1      
            //   176: istore_3       
            //   177: aload_2        
            //   178: invokestatic    O1/P.c0:(Ljava/lang/String;)Z
            //   181: ifeq            208
            //   184: aload           4
            //   186: invokestatic    O1/P.c0:(Ljava/lang/String;)Z
            //   189: ifeq            208
            //   192: iload_3        
            //   193: iconst_m1      
            //   194: if_icmpne       208
            //   197: aload_0        
            //   198: getfield        O1/V$c.a:LO1/V;
            //   201: aload           5
            //   203: invokevirtual   O1/V.z:(Landroid/os/Bundle;)V
            //   206: iconst_1       
            //   207: ireturn        
            //   208: aload_2        
            //   209: ifnull          239
            //   212: aload_2        
            //   213: ldc             "access_denied"
            //   215: invokestatic    kotlin/jvm/internal/Intrinsics.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   218: ifne            230
            //   221: aload_2        
            //   222: ldc             "OAuthAccessDeniedException"
            //   224: invokestatic    kotlin/jvm/internal/Intrinsics.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   227: ifeq            239
            //   230: aload_0        
            //   231: getfield        O1/V$c.a:LO1/V;
            //   234: invokevirtual   O1/V.cancel:()V
            //   237: iconst_1       
            //   238: ireturn        
            //   239: iload_3        
            //   240: sipush          4201
            //   243: if_icmpne       249
            //   246: goto            230
            //   249: new             Lx1/r;
            //   252: dup            
            //   253: iload_3        
            //   254: aload_2        
            //   255: aload           4
            //   257: invokespecial   x1/r.<init>:(ILjava/lang/String;Ljava/lang/String;)V
            //   260: astore_1       
            //   261: aload_0        
            //   262: getfield        O1/V$c.a:LO1/V;
            //   265: new             Lx1/D;
            //   268: dup            
            //   269: aload_1        
            //   270: aload           4
            //   272: invokespecial   x1/D.<init>:(Lx1/r;Ljava/lang/String;)V
            //   275: invokevirtual   O1/V.y:(Ljava/lang/Throwable;)V
            //   278: iconst_1       
            //   279: ireturn        
            //   280: aload_2        
            //   281: ldc             "fbconnect://cancel"
            //   283: iconst_0       
            //   284: iconst_2       
            //   285: aconst_null    
            //   286: invokestatic    kotlin/text/i.s:(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
            //   289: ifeq            301
            //   292: aload_0        
            //   293: getfield        O1/V$c.a:LO1/V;
            //   296: invokevirtual   O1/V.cancel:()V
            //   299: iconst_1       
            //   300: ireturn        
            //   301: iload_3        
            //   302: ifne            346
            //   305: aload_2        
            //   306: ldc             "touch"
            //   308: iconst_0       
            //   309: iconst_2       
            //   310: aconst_null    
            //   311: invokestatic    kotlin/text/i.v:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
            //   314: ifeq            319
            //   317: iconst_0       
            //   318: ireturn        
            //   319: aload_0        
            //   320: getfield        O1/V$c.a:LO1/V;
            //   323: invokevirtual   android/app/Dialog.getContext:()Landroid/content/Context;
            //   326: new             Landroid/content/Intent;
            //   329: dup            
            //   330: ldc             "android.intent.action.VIEW"
            //   332: aload_2        
            //   333: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
            //   336: invokespecial   android/content/Intent.<init>:(Ljava/lang/String;Landroid/net/Uri;)V
            //   339: invokevirtual   android/content/Context.startActivity:(Landroid/content/Intent;)V
            //   342: iconst_1       
            //   343: ireturn        
            //   344: iconst_0       
            //   345: ireturn        
            //   346: iconst_0       
            //   347: ireturn        
            //   348: astore_1       
            //   349: goto            175
            //   352: astore_1       
            //   353: goto            344
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                                       
            //  -----  -----  -----  -----  -------------------------------------------
            //  167    172    348    352    Ljava/lang/NumberFormatException;
            //  319    342    352    346    Landroid/content/ActivityNotFoundException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0319:
            //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
            //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
            //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
    }
    
    public interface d
    {
        void a(final Bundle p0, final o p1);
    }
    
    public final class e extends AsyncTask
    {
        public final String a;
        public final Bundle b;
        public Exception[] c;
        
        public e(final String a, final Bundle b) {
            Intrinsics.checkNotNullParameter(V.this, "this$0");
            Intrinsics.checkNotNullParameter(a, "action");
            Intrinsics.checkNotNullParameter(b, "parameters");
            this.a = a;
            this.b = b;
            this.c = new Exception[0];
        }
        
        public static final void c(final String[] array, final int n, final e e, final CountDownLatch countDownLatch, final K k) {
            Intrinsics.checkNotNullParameter(array, "$results");
            Intrinsics.checkNotNullParameter(e, "this$0");
            Intrinsics.checkNotNullParameter(countDownLatch, "$latch");
            Intrinsics.checkNotNullParameter(k, "response");
            while (true) {
                try {
                    final r b = k.b();
                    final String s = "Error staging photo.";
                    if (b != null) {
                        String c = b.c();
                        if (c == null) {
                            c = s;
                        }
                        throw new p(k, c);
                    }
                    final JSONObject c2 = k.c();
                    if (c2 == null) {
                        throw new o("Error staging photo.");
                    }
                    final String optString = c2.optString("uri");
                    while (true) {
                        if (optString != null) {
                            array[n] = optString;
                            countDownLatch.countDown();
                            return;
                        }
                        throw new o("Error staging photo.");
                        final Exception ex;
                        e.c[n] = ex;
                        continue;
                    }
                }
                catch (Exception ex2) {}
                final Exception ex2;
                final Exception ex = ex2;
                continue;
            }
        }
        
        public String[] b(final Void... p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokestatic    T1/a.d:(Ljava/lang/Object;)Z
            //     4: ifeq            9
            //     7: aconst_null    
            //     8: areturn        
            //     9: aload_1        
            //    10: ldc             "p0"
            //    12: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
            //    15: aload_0        
            //    16: getfield        O1/V$e.b:Landroid/os/Bundle;
            //    19: ldc             "media"
            //    21: invokevirtual   android/os/BaseBundle.getStringArray:(Ljava/lang/String;)[Ljava/lang/String;
            //    24: astore          5
            //    26: aload           5
            //    28: ifnonnull       33
            //    31: aconst_null    
            //    32: areturn        
            //    33: aload           5
            //    35: arraylength    
            //    36: anewarray       Ljava/lang/String;
            //    39: astore          6
            //    41: aload_0        
            //    42: aload           5
            //    44: arraylength    
            //    45: anewarray       Ljava/lang/Exception;
            //    48: putfield        O1/V$e.c:[Ljava/lang/Exception;
            //    51: new             Ljava/util/concurrent/CountDownLatch;
            //    54: dup            
            //    55: aload           5
            //    57: arraylength    
            //    58: invokespecial   java/util/concurrent/CountDownLatch.<init>:(I)V
            //    61: astore          7
            //    63: new             Ljava/util/concurrent/ConcurrentLinkedQueue;
            //    66: dup            
            //    67: invokespecial   java/util/concurrent/ConcurrentLinkedQueue.<init>:()V
            //    70: astore_1       
            //    71: getstatic       x1/a.z:Lx1/a$c;
            //    74: invokevirtual   x1/a$c.e:()Lx1/a;
            //    77: astore          8
            //    79: aload           5
            //    81: arraylength    
            //    82: iconst_1       
            //    83: isub           
            //    84: istore          4
            //    86: iload           4
            //    88: iflt            219
            //    91: iconst_0       
            //    92: istore_2       
            //    93: iload_2        
            //    94: iconst_1       
            //    95: iadd           
            //    96: istore_3       
            //    97: aload_0        
            //    98: invokevirtual   android/os/AsyncTask.isCancelled:()Z
            //   101: ifeq            138
            //   104: aload_1        
            //   105: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.iterator:()Ljava/util/Iterator;
            //   108: astore          5
            //   110: aload           5
            //   112: invokeinterface java/util/Iterator.hasNext:()Z
            //   117: ifeq            276
            //   120: aload           5
            //   122: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
            //   127: checkcast       Lx1/I;
            //   130: iconst_1       
            //   131: invokevirtual   android/os/AsyncTask.cancel:(Z)Z
            //   134: pop            
            //   135: goto            110
            //   138: aload           5
            //   140: iload_2        
            //   141: aaload         
            //   142: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
            //   145: astore          9
            //   147: aload           9
            //   149: invokestatic    O1/P.e0:(Landroid/net/Uri;)Z
            //   152: ifeq            172
            //   155: aload           6
            //   157: iload_2        
            //   158: aload           9
            //   160: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
            //   163: aastore        
            //   164: aload           7
            //   166: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
            //   169: goto            278
            //   172: new             LO1/W;
            //   175: dup            
            //   176: aload           6
            //   178: iload_2        
            //   179: aload_0        
            //   180: aload           7
            //   182: invokespecial   O1/W.<init>:([Ljava/lang/String;ILO1/V$e;Ljava/util/concurrent/CountDownLatch;)V
            //   185: astore          10
            //   187: getstatic       a2/a.a:La2/a;
            //   190: astore          11
            //   192: aload           9
            //   194: ldc             "uri"
            //   196: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
            //   199: aload_1        
            //   200: aload           8
            //   202: aload           9
            //   204: aload           10
            //   206: invokestatic    a2/a.a:(Lx1/a;Landroid/net/Uri;Lx1/F$b;)Lx1/F;
            //   209: invokevirtual   x1/F.l:()Lx1/I;
            //   212: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.add:(Ljava/lang/Object;)Z
            //   215: pop            
            //   216: goto            278
            //   219: aload           7
            //   221: invokevirtual   java/util/concurrent/CountDownLatch.await:()V
            //   224: aload           6
            //   226: areturn        
            //   227: aload_1        
            //   228: invokevirtual   java/util/concurrent/ConcurrentLinkedQueue.iterator:()Ljava/util/Iterator;
            //   231: astore_1       
            //   232: aload_1        
            //   233: invokeinterface java/util/Iterator.hasNext:()Z
            //   238: ifeq            258
            //   241: aload_1        
            //   242: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
            //   247: checkcast       Lx1/I;
            //   250: iconst_1       
            //   251: invokevirtual   android/os/AsyncTask.cancel:(Z)Z
            //   254: pop            
            //   255: goto            232
            //   258: aconst_null    
            //   259: areturn        
            //   260: aload_1        
            //   261: aload_0        
            //   262: invokestatic    T1/a.b:(Ljava/lang/Throwable;Ljava/lang/Object;)V
            //   265: aconst_null    
            //   266: areturn        
            //   267: astore          5
            //   269: goto            227
            //   272: astore_1       
            //   273: goto            260
            //   276: aconst_null    
            //   277: areturn        
            //   278: iload_3        
            //   279: iload           4
            //   281: if_icmple       287
            //   284: goto            219
            //   287: iload_3        
            //   288: istore_2       
            //   289: goto            93
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                 
            //  -----  -----  -----  -----  ---------------------
            //  9      26     272    267    Any
            //  33     79     272    267    Any
            //  79     86     267    260    Ljava/lang/Exception;
            //  79     86     272    267    Any
            //  97     110    267    260    Ljava/lang/Exception;
            //  97     110    272    267    Any
            //  110    135    267    260    Ljava/lang/Exception;
            //  110    135    272    267    Any
            //  138    169    267    260    Ljava/lang/Exception;
            //  138    169    272    267    Any
            //  172    216    267    260    Ljava/lang/Exception;
            //  172    216    272    267    Any
            //  219    224    267    260    Ljava/lang/Exception;
            //  219    224    272    267    Any
            //  227    232    272    267    Any
            //  232    255    272    267    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.NullPointerException
            //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
            //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:833)
            //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        public void d(final String[] array) {
            if (T1.a.d(this)) {
                return;
            }
            final Object[] array2;
            Label_0267: {
                Label_0076: {
                    try {
                        final ProgressDialog h = V.h(V.this);
                        if (h != null) {
                            ((Dialog)h).dismiss();
                        }
                        final Exception[] c = this.c;
                        final int length = c.length;
                        int i = 0;
                        Exception ex = null;
                        Block_8: {
                            while (i < length) {
                                ex = c[i];
                                ++i;
                                if (ex != null) {
                                    break Block_8;
                                }
                            }
                            break Label_0076;
                        }
                        V.this.y(ex);
                        return;
                    }
                    finally {
                        break Label_0267;
                    }
                }
                if (array2 == null) {
                    V.this.y(new o("Failed to stage photos for web dialog"));
                    return;
                }
                final List b = W5.g.b(array2);
                if (b.contains(null)) {
                    V.this.y(new o("Failed to stage photos for web dialog"));
                    return;
                }
                final P a = P.a;
                P.p0(this.b, "media", new JSONArray((Collection)b));
                final String b2 = H.b();
                final StringBuilder sb = new StringBuilder();
                sb.append(x1.B.w());
                sb.append("/dialog/");
                sb.append(this.a);
                V.m(V.this, P.g(b2, sb.toString(), this.b).toString());
                final ImageView e = V.e(V.this);
                if (e != null) {
                    V.this.C(e.getDrawable().getIntrinsicWidth() / 2 + 1);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            T1.a.b((Throwable)array2, this);
        }
    }
}
