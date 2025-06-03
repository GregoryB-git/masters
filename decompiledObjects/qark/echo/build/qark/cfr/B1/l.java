/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Base64
 *  android.util.Log
 *  android.view.View
 *  java.io.ByteArrayOutputStream
 *  java.io.OutputStream
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.Arrays
 *  java.util.Locale
 *  java.util.Timer
 *  java.util.TimerTask
 *  java.util.concurrent.Callable
 *  java.util.concurrent.FutureTask
 *  java.util.concurrent.RejectedExecutionException
 *  java.util.concurrent.TimeUnit
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package B1;

import B1.e;
import B1.i;
import B1.j;
import B1.k;
import C1.f;
import O1.C;
import O1.P;
import O1.z;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.F;
import x1.K;
import x1.N;
import x1.a;
import x1.r;

public final class l {
    public static final a e;
    public static final String f;
    public static l g;
    public final Handler a;
    public final WeakReference b;
    public Timer c;
    public String d;

    static {
        String string2;
        e = new a(null);
        String string3 = string2 = l.class.getCanonicalName();
        if (string2 == null) {
            string3 = "";
        }
        f = string3;
    }

    public l(Activity activity) {
        Intrinsics.checkNotNullParameter((Object)activity, "activity");
        this.b = new WeakReference((Object)activity);
        this.d = null;
        this.a = new Handler(Looper.getMainLooper());
        g = this;
    }

    public static /* synthetic */ void a(String string2, l l8) {
        l.k(string2, l8);
    }

    public static /* synthetic */ void b(l l8, TimerTask timerTask) {
        l.i(l8, timerTask);
    }

    public static final /* synthetic */ WeakReference c(l l8) {
        if (T1.a.d(l.class)) {
            return null;
        }
        try {
            l8 = l8.b;
            return l8;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, l.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        if (T1.a.d(l.class)) {
            return null;
        }
        try {
            String string2 = f;
            return string2;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Handler e(l l8) {
        if (T1.a.d(l.class)) {
            return null;
        }
        try {
            l8 = l8.a;
            return l8;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, l.class);
            return null;
        }
    }

    public static final /* synthetic */ void f(l l8, String string2) {
        if (T1.a.d(l.class)) {
            return;
        }
        try {
            l8.j(string2);
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, l.class);
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final void i(l l8, TimerTask timerTask) {
        Throwable throwable2222;
        block6 : {
            if (T1.a.d(l.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(l8, "this$0");
                Intrinsics.checkNotNullParameter((Object)timerTask, "$indexingTask");
                Timer timer = l8.c;
                if (timer != null) {
                    timer.cancel();
                }
                l8.d = null;
                timer = new Timer();
                timer.scheduleAtFixedRate(timerTask, 0L, 1000L);
                l8.c = timer;
                return;
            }
            catch (Throwable throwable2222) {
                break block6;
            }
            catch (Exception exception) {
                Log.e((String)f, (String)"Error scheduling indexing job", (Throwable)exception);
                return;
            }
        }
        T1.a.b(throwable2222, l.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void k(String string2, l l8) {
        if (T1.a.d(l.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(string2, "$tree");
            Intrinsics.checkNotNullParameter(l8, "this$0");
            String string3 = P.m0(string2);
            x1.a a8 = x1.a.z.e();
            if (string3 != null && Intrinsics.a(string3, l8.d)) {
                return;
            }
            l8.g(e.b(string2, a8, B.m(), "app_indexing"), string3);
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, l.class);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void g(F object, String string2) {
        if (T1.a.d(this)) {
            return;
        }
        if (object == null) {
            return;
        }
        try {
            object = object.k();
            JSONObject jSONObject = object.c();
            if (jSONObject == null) {
                Log.e((String)f, (String)Intrinsics.i("Error sending UI component tree to Facebook: ", object.b()));
                return;
            }
            if (Intrinsics.a("true", jSONObject.optString("success"))) {
                C.e.b(N.s, f, "Successfully send UI component tree to server");
                this.d = string2;
            }
            if (!jSONObject.has("is_app_indexing_enabled")) return;
            e.n(jSONObject.getBoolean("is_app_indexing_enabled"));
            return;
        }
        catch (Throwable throwable) {}
        T1.a.b(throwable, this);
        return;
        catch (JSONException jSONException) {}
        Log.e((String)f, (String)"Error decoding server response.", (Throwable)jSONException);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void h() {
        Throwable throwable2222;
        block5 : {
            if (T1.a.d(this)) {
                return;
            }
            try {
                TimerTask timerTask = new TimerTask(){

                    /*
                     * Unable to fully structure code
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     * Lifted jumps to return sites
                     */
                    public void run() {
                        var1_1 = (Activity)l.c(this).get();
                        var3_4 = G1.g.e((Activity)var1_1);
                        if (var1_1 == null) return;
                        if (var3_4 == null) {
                            return;
                        }
                        var4_5 = var1_1.getClass().getSimpleName();
                        if (!e.h()) {
                            return;
                        }
                        if (z.b()) {
                            C1.e.a();
                            return;
                        }
                        var2_6 = new FutureTask((Callable)new b(var3_4));
                        l.e(this).post((Runnable)var2_6);
                        var1_1 = "";
                        {
                            catch (Exception var1_3) {}
                        }
                        try {
                            var1_1 = var2_6 = (String)var2_6.get(1L, TimeUnit.SECONDS);
                            ** GOTO lbl23
                        }
                        catch (Exception var2_7) {
                            block10 : {
                                Log.e((String)l.d(), (String)"Failed to take screenshot.", (Throwable)var2_7);
lbl23: // 2 sources:
                                var2_6 = new JSONObject();
                                try {
                                    var2_6.put("screenname", (Object)var4_5);
                                    var2_6.put("screenshot", var1_1);
                                    var1_1 = new JSONArray();
                                    var1_1.put((Object)f.d(var3_4));
                                    var2_6.put("view", var1_1);
                                    break block10;
                                }
                                catch (JSONException var1_2) {}
                                Log.e((String)l.d(), (String)"Failed to create JSONObject");
                            }
                            var1_1 = var2_6.toString();
                            Intrinsics.checkNotNullExpressionValue(var1_1, "viewTree.toString()");
                            l.f(this, (String)var1_1);
                            return;
                        }
                        Log.e((String)l.d(), (String)"UI Component tree indexing failure!", (Throwable)var1_3);
                    }
                };
                B.t().execute((Runnable)new i(this, timerTask));
                return;
            }
            catch (Throwable throwable2222) {
                break block5;
            }
            catch (RejectedExecutionException rejectedExecutionException) {
                Log.e((String)f, (String)"Error scheduling indexing job", (Throwable)rejectedExecutionException);
                return;
            }
        }
        T1.a.b(throwable2222, this);
    }

    public final void j(String string2) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            B.t().execute((Runnable)new j(string2, this));
            return;
        }
        catch (Throwable throwable) {
            T1.a.b(throwable, this);
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void l() {
        Throwable throwable2222;
        block7 : {
            if (T1.a.d(this)) {
                return;
            }
            try {
                Activity activity = (Activity)this.b.get();
                if (activity == null) {
                    return;
                }
                activity = this.c;
                if (activity != null) {
                    activity.cancel();
                }
                this.c = null;
                return;
            }
            catch (Throwable throwable2222) {
                break block7;
            }
            catch (Exception exception) {
                Log.e((String)f, (String)"Error unscheduling indexing job", (Throwable)exception);
                return;
            }
        }
        T1.a.b(throwable2222, this);
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public static /* synthetic */ void a(K k8) {
            a.c(k8);
        }

        public static final void c(K k8) {
            Intrinsics.checkNotNullParameter(k8, "it");
            C.e.b(N.s, l.d(), "App index sent to FB!");
        }

        public final F b(String string2, x1.a object, String string3, String string4) {
            Intrinsics.checkNotNullParameter(string4, "requestType");
            if (string2 == null) {
                return null;
            }
            Object object2 = F.n;
            x x8 = x.a;
            string3 = String.format((Locale)Locale.US, (String)"%s/app_indexing", (Object[])Arrays.copyOf((Object[])new Object[]{string3}, (int)1));
            Intrinsics.checkNotNullExpressionValue(string3, "java.lang.String.format(locale, format, *args)");
            object2 = object2.A((x1.a)object, string3, null, null);
            string3 = object2.u();
            object = string3;
            if (string3 == null) {
                object = new Bundle();
            }
            object.putString("tree", string2);
            object.putString("app_version", G1.g.d());
            object.putString("platform", "android");
            object.putString("request_type", string4);
            if (Intrinsics.a(string4, "app_indexing")) {
                object.putString("device_session_id", e.g());
            }
            object2.G((Bundle)object);
            object2.C(new k());
            return object2;
        }
    }

    public static final class b
    implements Callable {
        public final WeakReference o;

        public b(View view) {
            Intrinsics.checkNotNullParameter((Object)view, "rootView");
            this.o = new WeakReference((Object)view);
        }

        public String a() {
            View view = (View)this.o.get();
            if (view != null && view.getWidth() != 0 && view.getHeight() != 0) {
                Object object = Bitmap.createBitmap((int)view.getWidth(), (int)view.getHeight(), (Bitmap.Config)Bitmap.Config.RGB_565);
                view.draw(new Canvas((Bitmap)object));
                view = new ByteArrayOutputStream();
                object.compress(Bitmap.CompressFormat.JPEG, 10, (OutputStream)view);
                object = Base64.encodeToString((byte[])view.toByteArray(), (int)2);
                Intrinsics.checkNotNullExpressionValue(object, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
                return object;
            }
            return "";
        }
    }

}

