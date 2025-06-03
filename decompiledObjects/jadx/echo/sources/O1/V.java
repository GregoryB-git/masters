package O1;

import O1.V;
import W5.C0680j;
import a2.C0743a;
import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Bundle;
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
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.C2146B;
import x1.C2148a;
import x1.C2160m;
import x1.C2162o;
import x1.C2163p;
import x1.C2164q;
import x1.F;

/* loaded from: classes.dex */
public class V extends Dialog {

    /* renamed from: A, reason: collision with root package name */
    public static final b f3770A = new b(null);

    /* renamed from: B, reason: collision with root package name */
    public static final int f3771B = M1.e.f3498a;

    /* renamed from: C, reason: collision with root package name */
    public static volatile int f3772C;

    /* renamed from: o, reason: collision with root package name */
    public String f3773o;

    /* renamed from: p, reason: collision with root package name */
    public String f3774p;

    /* renamed from: q, reason: collision with root package name */
    public d f3775q;

    /* renamed from: r, reason: collision with root package name */
    public WebView f3776r;

    /* renamed from: s, reason: collision with root package name */
    public ProgressDialog f3777s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f3778t;

    /* renamed from: u, reason: collision with root package name */
    public FrameLayout f3779u;

    /* renamed from: v, reason: collision with root package name */
    public e f3780v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3781w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3782x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3783y;

    /* renamed from: z, reason: collision with root package name */
    public WindowManager.LayoutParams f3784z;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Context f3785a;

        /* renamed from: b, reason: collision with root package name */
        public String f3786b;

        /* renamed from: c, reason: collision with root package name */
        public String f3787c;

        /* renamed from: d, reason: collision with root package name */
        public int f3788d;

        /* renamed from: e, reason: collision with root package name */
        public d f3789e;

        /* renamed from: f, reason: collision with root package name */
        public Bundle f3790f;

        /* renamed from: g, reason: collision with root package name */
        public C2148a f3791g;

        public a(Context context, String action, Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(action, "action");
            C2148a.c cVar = C2148a.f21014z;
            this.f3791g = cVar.e();
            if (!cVar.g()) {
                String J6 = P.J(context);
                if (J6 == null) {
                    throw new C2162o("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
                this.f3786b = J6;
            }
            b(context, action, bundle);
        }

        public V a() {
            C2148a c2148a = this.f3791g;
            if (c2148a != null) {
                Bundle bundle = this.f3790f;
                if (bundle != null) {
                    bundle.putString("app_id", c2148a == null ? null : c2148a.c());
                }
                Bundle bundle2 = this.f3790f;
                if (bundle2 != null) {
                    C2148a c2148a2 = this.f3791g;
                    bundle2.putString("access_token", c2148a2 != null ? c2148a2.l() : null);
                }
            } else {
                Bundle bundle3 = this.f3790f;
                if (bundle3 != null) {
                    bundle3.putString("app_id", this.f3786b);
                }
            }
            b bVar = V.f3770A;
            Context context = this.f3785a;
            if (context != null) {
                return bVar.c(context, this.f3787c, this.f3790f, this.f3788d, this.f3789e);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }

        public final void b(Context context, String str, Bundle bundle) {
            this.f3785a = context;
            this.f3787c = str;
            if (bundle != null) {
                this.f3790f = bundle;
            } else {
                this.f3790f = new Bundle();
            }
        }

        public final String c() {
            return this.f3786b;
        }

        public final Context d() {
            return this.f3785a;
        }

        public final d e() {
            return this.f3789e;
        }

        public final Bundle f() {
            return this.f3790f;
        }

        public final int g() {
            return this.f3788d;
        }

        public final a h(d dVar) {
            this.f3789e = dVar;
            return this;
        }

        public a(Context context, String str, String action, Bundle bundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f3786b = Q.k(str == null ? P.J(context) : str, "applicationId");
            b(context, action, bundle);
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final int a() {
            Q.l();
            return V.f3772C;
        }

        public final void b(Context context) {
            if (context == null) {
                return;
            }
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if ((applicationInfo == null ? null : applicationInfo.metaData) != null && V.f3772C == 0) {
                    e(applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }

        public final V c(Context context, String str, Bundle bundle, int i7, d dVar) {
            Intrinsics.checkNotNullParameter(context, "context");
            V.s(context);
            return new V(context, str, bundle, i7, Y1.B.FACEBOOK, dVar, null);
        }

        public final V d(Context context, String str, Bundle bundle, int i7, Y1.B targetApp, d dVar) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(targetApp, "targetApp");
            V.s(context);
            return new V(context, str, bundle, i7, targetApp, dVar, null);
        }

        public final void e(int i7) {
            if (i7 == 0) {
                i7 = V.f3771B;
            }
            V.f3772C = i7;
        }
    }

    public final class c extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ V f3792a;

        public c(V this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f3792a = this$0;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            ProgressDialog progressDialog;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            super.onPageFinished(view, url);
            if (!this.f3792a.f3782x && (progressDialog = this.f3792a.f3777s) != null) {
                progressDialog.dismiss();
            }
            FrameLayout frameLayout = this.f3792a.f3779u;
            if (frameLayout != null) {
                frameLayout.setBackgroundColor(0);
            }
            WebView r7 = this.f3792a.r();
            if (r7 != null) {
                r7.setVisibility(0);
            }
            ImageView imageView = this.f3792a.f3778t;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            this.f3792a.f3783y = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap bitmap) {
            ProgressDialog progressDialog;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            P p7 = P.f3756a;
            P.j0("FacebookSDK.WebDialog", Intrinsics.i("Webview loading URL: ", url));
            super.onPageStarted(view, url, bitmap);
            if (this.f3792a.f3782x || (progressDialog = this.f3792a.f3777s) == null) {
                return;
            }
            progressDialog.show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int i7, String description, String failingUrl) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
            super.onReceivedError(view, i7, description, failingUrl);
            this.f3792a.y(new C2160m(description, i7, failingUrl));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(error, "error");
            super.onReceivedSslError(view, handler, error);
            handler.cancel();
            this.f3792a.y(new C2160m(null, -11, null));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            boolean s7;
            boolean s8;
            boolean v7;
            int i7;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            P p7 = P.f3756a;
            P.j0("FacebookSDK.WebDialog", Intrinsics.i("Redirect URL: ", url));
            Uri parse = Uri.parse(url);
            boolean z7 = parse.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", parse.getPath());
            s7 = kotlin.text.r.s(url, this.f3792a.f3774p, false, 2, null);
            if (!s7) {
                s8 = kotlin.text.r.s(url, "fbconnect://cancel", false, 2, null);
                if (s8) {
                    this.f3792a.cancel();
                    return true;
                }
                if (!z7) {
                    v7 = kotlin.text.s.v(url, "touch", false, 2, null);
                    if (!v7) {
                        try {
                            this.f3792a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                            return true;
                        } catch (ActivityNotFoundException unused) {
                            return false;
                        }
                    }
                }
                return false;
            }
            Bundle w7 = this.f3792a.w(url);
            String string = w7.getString("error");
            if (string == null) {
                string = w7.getString("error_type");
            }
            String string2 = w7.getString("error_msg");
            if (string2 == null) {
                string2 = w7.getString("error_message");
            }
            if (string2 == null) {
                string2 = w7.getString("error_description");
            }
            String string3 = w7.getString("error_code");
            if (string3 != null && !P.c0(string3)) {
                try {
                    i7 = Integer.parseInt(string3);
                } catch (NumberFormatException unused2) {
                }
                if (!P.c0(string) && P.c0(string2) && i7 == -1) {
                    this.f3792a.z(w7);
                } else if ((string == null && (Intrinsics.a(string, "access_denied") || Intrinsics.a(string, "OAuthAccessDeniedException"))) || i7 == 4201) {
                    this.f3792a.cancel();
                } else {
                    this.f3792a.y(new x1.D(new x1.r(i7, string, string2), string2));
                }
                return true;
            }
            i7 = -1;
            if (!P.c0(string)) {
            }
            if (string == null) {
            }
            this.f3792a.y(new x1.D(new x1.r(i7, string, string2), string2));
            return true;
        }
    }

    public interface d {
        void a(Bundle bundle, C2162o c2162o);
    }

    public final class e extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        public final String f3793a;

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f3794b;

        /* renamed from: c, reason: collision with root package name */
        public Exception[] f3795c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ V f3796d;

        public e(V this$0, String action, Bundle parameters) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.f3796d = this$0;
            this.f3793a = action;
            this.f3794b = parameters;
            this.f3795c = new Exception[0];
        }

        public static final void c(String[] results, int i7, e this$0, CountDownLatch latch, x1.K response) {
            x1.r b7;
            String str;
            Intrinsics.checkNotNullParameter(results, "$results");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(latch, "$latch");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                b7 = response.b();
                str = "Error staging photo.";
            } catch (Exception e7) {
                this$0.f3795c[i7] = e7;
            }
            if (b7 != null) {
                String c7 = b7.c();
                if (c7 != null) {
                    str = c7;
                }
                throw new C2163p(response, str);
            }
            JSONObject c8 = response.c();
            if (c8 == null) {
                throw new C2162o("Error staging photo.");
            }
            String optString = c8.optString("uri");
            if (optString == null) {
                throw new C2162o("Error staging photo.");
            }
            results[i7] = optString;
            latch.countDown();
        }

        public String[] b(Void... p02) {
            if (T1.a.d(this)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(p02, "p0");
                String[] stringArray = this.f3794b.getStringArray("media");
                if (stringArray == null) {
                    return null;
                }
                final String[] strArr = new String[stringArray.length];
                this.f3795c = new Exception[stringArray.length];
                final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                C2148a e7 = C2148a.f21014z.e();
                try {
                    int length = stringArray.length - 1;
                    if (length >= 0) {
                        final int i7 = 0;
                        while (true) {
                            int i8 = i7 + 1;
                            if (isCancelled()) {
                                Iterator it = concurrentLinkedQueue.iterator();
                                while (it.hasNext()) {
                                    ((x1.I) it.next()).cancel(true);
                                }
                                return null;
                            }
                            Uri uri = Uri.parse(stringArray[i7]);
                            if (P.e0(uri)) {
                                strArr[i7] = uri.toString();
                                countDownLatch.countDown();
                            } else {
                                F.b bVar = new F.b() { // from class: O1.W
                                    @Override // x1.F.b
                                    public final void a(x1.K k7) {
                                        V.e.c(strArr, i7, this, countDownLatch, k7);
                                    }
                                };
                                C0743a c0743a = C0743a.f8070a;
                                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                                concurrentLinkedQueue.add(C0743a.a(e7, uri, bVar).l());
                            }
                            if (i8 > length) {
                                break;
                            }
                            i7 = i8;
                        }
                    }
                    countDownLatch.await();
                    return strArr;
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((x1.I) it2.next()).cancel(true);
                    }
                    return null;
                }
            } catch (Throwable th) {
                T1.a.b(th, this);
                return null;
            }
        }

        public void d(String[] strArr) {
            if (T1.a.d(this)) {
                return;
            }
            try {
                ProgressDialog progressDialog = this.f3796d.f3777s;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                Exception[] excArr = this.f3795c;
                int length = excArr.length;
                int i7 = 0;
                while (i7 < length) {
                    Exception exc = excArr[i7];
                    i7++;
                    if (exc != null) {
                        this.f3796d.y(exc);
                        return;
                    }
                }
                if (strArr == null) {
                    this.f3796d.y(new C2162o("Failed to stage photos for web dialog"));
                    return;
                }
                List b7 = C0680j.b(strArr);
                if (b7.contains(null)) {
                    this.f3796d.y(new C2162o("Failed to stage photos for web dialog"));
                    return;
                }
                P p7 = P.f3756a;
                P.p0(this.f3794b, "media", new JSONArray((Collection) b7));
                this.f3796d.f3773o = P.g(H.b(), C2146B.w() + "/dialog/" + this.f3793a, this.f3794b).toString();
                ImageView imageView = this.f3796d.f3778t;
                if (imageView == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                this.f3796d.C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
            } catch (Throwable th) {
                T1.a.b(th, this);
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
            if (T1.a.d(this)) {
                return null;
            }
            try {
                return b((Void[]) objArr);
            } catch (Throwable th) {
                T1.a.b(th, this);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            if (T1.a.d(this)) {
                return;
            }
            try {
                d((String[]) obj);
            } catch (Throwable th) {
                T1.a.b(th, this);
            }
        }
    }

    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3797a;

        static {
            int[] iArr = new int[Y1.B.valuesCustom().length];
            iArr[Y1.B.INSTAGRAM.ordinal()] = 1;
            f3797a = iArr;
        }
    }

    public static final class g extends WebView {
        public g(Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onWindowFocusChanged(boolean z7) {
            try {
                super.onWindowFocusChanged(z7);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public V(Context context, String url) {
        this(context, url, f3770A.a());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
    }

    public static final boolean D(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    public static final void p(V this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cancel();
    }

    public static final void s(Context context) {
        f3770A.b(context);
    }

    public static final void v(V this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.cancel();
    }

    public final void A(String expectedRedirectUrl) {
        Intrinsics.checkNotNullParameter(expectedRedirectUrl, "expectedRedirectUrl");
        this.f3774p = expectedRedirectUrl;
    }

    public final void B(d dVar) {
        this.f3775q = dVar;
    }

    public final void C(int i7) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        g gVar = new g(getContext());
        this.f3776r = gVar;
        gVar.setVerticalScrollBarEnabled(false);
        WebView webView = this.f3776r;
        if (webView != null) {
            webView.setHorizontalScrollBarEnabled(false);
        }
        WebView webView2 = this.f3776r;
        if (webView2 != null) {
            webView2.setWebViewClient(new c(this));
        }
        WebView webView3 = this.f3776r;
        WebSettings settings = webView3 == null ? null : webView3.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
        }
        WebView webView4 = this.f3776r;
        if (webView4 != null) {
            String str = this.f3773o;
            if (str == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            webView4.loadUrl(str);
        }
        WebView webView5 = this.f3776r;
        if (webView5 != null) {
            webView5.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        WebView webView6 = this.f3776r;
        if (webView6 != null) {
            webView6.setVisibility(4);
        }
        WebView webView7 = this.f3776r;
        WebSettings settings2 = webView7 == null ? null : webView7.getSettings();
        if (settings2 != null) {
            settings2.setSavePassword(false);
        }
        WebView webView8 = this.f3776r;
        WebSettings settings3 = webView8 != null ? webView8.getSettings() : null;
        if (settings3 != null) {
            settings3.setSaveFormData(false);
        }
        WebView webView9 = this.f3776r;
        if (webView9 != null) {
            webView9.setFocusable(true);
        }
        WebView webView10 = this.f3776r;
        if (webView10 != null) {
            webView10.setFocusableInTouchMode(true);
        }
        WebView webView11 = this.f3776r;
        if (webView11 != null) {
            webView11.setOnTouchListener(new View.OnTouchListener() { // from class: O1.S
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean D7;
                    D7 = V.D(view, motionEvent);
                    return D7;
                }
            });
        }
        linearLayout.setPadding(i7, i7, i7, i7);
        linearLayout.addView(this.f3776r);
        linearLayout.setBackgroundColor(-872415232);
        FrameLayout frameLayout = this.f3779u;
        if (frameLayout == null) {
            return;
        }
        frameLayout.addView(linearLayout);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f3775q == null || this.f3781w) {
            return;
        }
        y(new C2164q());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f3776r;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f3782x && (progressDialog = this.f3777s) != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        super.dismiss();
    }

    public final void o() {
        ImageView imageView = new ImageView(getContext());
        this.f3778t = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: O1.U
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                V.p(V.this, view);
            }
        });
        Drawable drawable = getContext().getResources().getDrawable(M1.a.f3480a);
        ImageView imageView2 = this.f3778t;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
        ImageView imageView3 = this.f3778t;
        if (imageView3 == null) {
            return;
        }
        imageView3.setVisibility(4);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        WindowManager.LayoutParams attributes;
        this.f3782x = false;
        P p7 = P.f3756a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        if (P.n0(context) && (layoutParams = this.f3784z) != null) {
            if ((layoutParams == null ? null : layoutParams.token) == null) {
                if (layoutParams != null) {
                    Activity ownerActivity = getOwnerActivity();
                    Window window = ownerActivity == null ? null : ownerActivity.getWindow();
                    layoutParams.token = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                }
                WindowManager.LayoutParams layoutParams2 = this.f3784z;
                P.j0("FacebookSDK.WebDialog", Intrinsics.i("Set token on onAttachedToWindow(): ", layoutParams2 != null ? layoutParams2.token : null));
            }
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f3777s = progressDialog;
        progressDialog.requestWindowFeature(1);
        ProgressDialog progressDialog2 = this.f3777s;
        if (progressDialog2 != null) {
            progressDialog2.setMessage(getContext().getString(M1.d.f3494d));
        }
        ProgressDialog progressDialog3 = this.f3777s;
        if (progressDialog3 != null) {
            progressDialog3.setCanceledOnTouchOutside(false);
        }
        ProgressDialog progressDialog4 = this.f3777s;
        if (progressDialog4 != null) {
            progressDialog4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: O1.T
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    V.v(V.this, dialogInterface);
                }
            });
        }
        requestWindowFeature(1);
        this.f3779u = new FrameLayout(getContext());
        x();
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(16);
        }
        o();
        if (this.f3773o != null) {
            ImageView imageView = this.f3778t;
            if (imageView == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            C((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        FrameLayout frameLayout = this.f3779u;
        if (frameLayout != null) {
            frameLayout.addView(this.f3778t, new ViewGroup.LayoutParams(-2, -2));
        }
        FrameLayout frameLayout2 = this.f3779u;
        if (frameLayout2 == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        setContentView(frameLayout2);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f3782x = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (i7 == 4) {
            WebView webView = this.f3776r;
            if (webView != null) {
                if (Intrinsics.a(webView == null ? null : Boolean.valueOf(webView.canGoBack()), Boolean.TRUE)) {
                    WebView webView2 = this.f3776r;
                    if (webView2 == null) {
                        return true;
                    }
                    webView2.goBack();
                    return true;
                }
            }
            cancel();
        }
        return super.onKeyDown(i7, event);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        e eVar = this.f3780v;
        if (eVar != null) {
            if ((eVar == null ? null : eVar.getStatus()) == AsyncTask.Status.PENDING) {
                e eVar2 = this.f3780v;
                if (eVar2 != null) {
                    eVar2.execute(new Void[0]);
                }
                ProgressDialog progressDialog = this.f3777s;
                if (progressDialog == null) {
                    return;
                }
                progressDialog.show();
                return;
            }
        }
        x();
    }

    @Override // android.app.Dialog
    public void onStop() {
        e eVar = this.f3780v;
        if (eVar != null) {
            eVar.cancel(true);
            ProgressDialog progressDialog = this.f3777s;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.token == null) {
            this.f3784z = params;
        }
        super.onWindowAttributesChanged(params);
    }

    public final int q(int i7, float f7, int i8, int i9) {
        int i10 = (int) (i7 / f7);
        return (int) (i7 * (i10 <= i8 ? 1.0d : i10 >= i9 ? 0.5d : (((i9 - i10) / (i9 - i8)) * 0.5d) + 0.5d));
    }

    public final WebView r() {
        return this.f3776r;
    }

    public final boolean t() {
        return this.f3781w;
    }

    public final boolean u() {
        return this.f3783y;
    }

    public Bundle w(String str) {
        Uri parse = Uri.parse(str);
        P p7 = P.f3756a;
        Bundle o02 = P.o0(parse.getQuery());
        o02.putAll(P.o0(parse.getFragment()));
        return o02;
    }

    public final void x() {
        Object systemService = getContext().getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i7 = displayMetrics.widthPixels;
        int i8 = displayMetrics.heightPixels;
        int i9 = i7 < i8 ? i7 : i8;
        if (i7 < i8) {
            i7 = i8;
        }
        int min = Math.min(q(i9, displayMetrics.density, 480, 800), displayMetrics.widthPixels);
        int min2 = Math.min(q(i7, displayMetrics.density, 800, 1280), displayMetrics.heightPixels);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setLayout(min, min2);
    }

    public final void y(Throwable th) {
        if (this.f3775q == null || this.f3781w) {
            return;
        }
        this.f3781w = true;
        C2162o c2162o = th instanceof C2162o ? (C2162o) th : new C2162o(th);
        d dVar = this.f3775q;
        if (dVar != null) {
            dVar.a(null, c2162o);
        }
        dismiss();
    }

    public final void z(Bundle bundle) {
        d dVar = this.f3775q;
        if (dVar == null || this.f3781w) {
            return;
        }
        this.f3781w = true;
        if (dVar != null) {
            dVar.a(bundle, null);
        }
        dismiss();
    }

    public V(Context context, String str, int i7) {
        super(context, i7 == 0 ? f3770A.a() : i7);
        this.f3774p = "fbconnect://success";
        this.f3773o = str;
    }

    public V(Context context, String str, Bundle bundle, int i7, Y1.B b7, d dVar) {
        super(context, i7 == 0 ? f3770A.a() : i7);
        String b8;
        String str2;
        this.f3774p = "fbconnect://success";
        bundle = bundle == null ? new Bundle() : bundle;
        String str3 = P.W(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f3774p = str3;
        bundle.putString("redirect_uri", str3);
        bundle.putString("display", "touch");
        bundle.putString("client_id", C2146B.m());
        kotlin.jvm.internal.x xVar = kotlin.jvm.internal.x.f16233a;
        String format = String.format(Locale.ROOT, "android-%s", Arrays.copyOf(new Object[]{C2146B.B()}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
        bundle.putString("sdk", format);
        this.f3775q = dVar;
        if (Intrinsics.a(str, "share") && bundle.containsKey("media")) {
            this.f3780v = new e(this, str, bundle);
            return;
        }
        if (f.f3797a[b7.ordinal()] == 1) {
            b8 = H.k();
            str2 = "oauth/authorize";
        } else {
            b8 = H.b();
            str2 = C2146B.w() + "/dialog/" + ((Object) str);
        }
        this.f3773o = P.g(b8, str2, bundle).toString();
    }

    public /* synthetic */ V(Context context, String str, Bundle bundle, int i7, Y1.B b7, d dVar, kotlin.jvm.internal.g gVar) {
        this(context, str, bundle, i7, b7, dVar);
    }
}
