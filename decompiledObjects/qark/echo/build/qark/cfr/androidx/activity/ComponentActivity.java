/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.Application
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.content.IntentSender$SendIntentException
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.os.Process
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.concurrent.atomic.AtomicInteger
 */
package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ImmLeaksCleaner;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.d;
import androidx.activity.result.e;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.q;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.b;
import c.a;
import d.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class ComponentActivity
extends w.e
implements h,
u,
androidx.savedstate.c,
androidx.activity.c,
d {
    public final a q = new a();
    public final i r;
    public final b s;
    public t t;
    public final OnBackPressedDispatcher u;
    public int v;
    public final AtomicInteger w;
    public ActivityResultRegistry x;

    public ComponentActivity() {
        this.r = new i(this);
        this.s = b.a(this);
        this.u = new OnBackPressedDispatcher(new Runnable(){

            public void run() {
                try {
                    Activity.ComponentActivity.super.onBackPressed();
                    return;
                }
                catch (IllegalStateException illegalStateException) {
                    if (TextUtils.equals((CharSequence)illegalStateException.getMessage(), (CharSequence)"Can not perform this action after onSaveInstanceState")) {
                        return;
                    }
                    throw illegalStateException;
                }
            }
        });
        this.w = new AtomicInteger();
        this.x = new ActivityResultRegistry(){

            @Override
            public void f(final int n8, d.a arrstring, Object object, w.b object2) {
                object2 = ComponentActivity.this;
                final a.a object32 = arrstring.b((Context)object2, object);
                if (object32 != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable(){

                        public void run() {
                            b.this.c(n8, object32.a());
                        }
                    });
                    return;
                }
                if ((object = arrstring.a((Context)object2, object)).hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                    arrstring = object.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    object.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                } else {
                    arrstring = null;
                }
                if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals((Object)object.getAction())) {
                    arrstring = object.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    if (arrstring == null) {
                        return;
                    }
                    object = new ArrayList();
                    for (String string2 : arrstring) {
                        if (ComponentActivity.this.checkPermission(string2, Process.myPid(), Process.myUid()) == 0) continue;
                        object.add((Object)string2);
                    }
                    if (!object.isEmpty()) {
                        w.a.l((Activity)object2, (String[])object.toArray((Object[])new String[0]), n8);
                        return;
                    }
                } else {
                    if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals((Object)object.getAction())) {
                        object = (e)object.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                        try {
                            w.a.o((Activity)object2, object.d(), n8, object.a(), object.b(), object.c(), 0, (Bundle)arrstring);
                            return;
                        }
                        catch (IntentSender.SendIntentException sendIntentException) {
                            new Handler(Looper.getMainLooper()).post(new Runnable(){

                                public void run() {
                                    b.this.b(n8, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable)sendIntentException));
                                }
                            });
                            return;
                        }
                    }
                    w.a.n((Activity)object2, (Intent)object, n8, (Bundle)arrstring);
                }
            }

        };
        if (this.g() != null) {
            int n8 = Build.VERSION.SDK_INT;
            this.g().a(new f(){

                @Override
                public void a(h h8, d.b b8) {
                    if (b8 == d.b.ON_STOP) {
                        h8 = ComponentActivity.this.getWindow();
                        h8 = h8 != null ? h8.peekDecorView() : null;
                        if (h8 != null) {
                            h8.cancelPendingInputEvents();
                        }
                    }
                }
            });
            this.g().a(new f(){

                @Override
                public void a(h h8, d.b b8) {
                    if (b8 == d.b.ON_DESTROY) {
                        ComponentActivity.this.q.b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.d().a();
                        }
                    }
                }
            });
            this.g().a(new f(){

                @Override
                public void a(h h8, d.b b8) {
                    ComponentActivity.this.h();
                    ComponentActivity.this.g().c(this);
                }
            });
            if (n8 <= 23) {
                this.g().a(new ImmLeaksCleaner(this));
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.i();
        Activity.super.addContentView(view, layoutParams);
    }

    @Override
    public final ActivityResultRegistry c() {
        return this.x;
    }

    @Override
    public t d() {
        if (this.getApplication() != null) {
            this.h();
            return this.t;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final void f(c.b b8) {
        this.q.a(b8);
    }

    @Override
    public androidx.lifecycle.d g() {
        return this.r;
    }

    public void h() {
        if (this.t == null) {
            c c8 = (c)this.getLastNonConfigurationInstance();
            if (c8 != null) {
                this.t = c8.b;
            }
            if (this.t == null) {
                this.t = new t();
            }
        }
    }

    public final void i() {
        v.a(this.getWindow().getDecorView(), this);
        w.a(this.getWindow().getDecorView(), this);
        androidx.savedstate.d.a(this.getWindow().getDecorView(), this);
    }

    @Override
    public final OnBackPressedDispatcher j() {
        return this.u;
    }

    @Override
    public final SavedStateRegistry k() {
        return this.s.b();
    }

    public Object l() {
        return null;
    }

    public void onActivityResult(int n8, int n9, Intent intent) {
        if (!this.x.b(n8, n9, intent)) {
            Activity.super.onActivityResult(n8, n9, intent);
        }
    }

    public void onBackPressed() {
        this.u.c();
    }

    @Override
    public void onCreate(Bundle bundle) {
        this.s.c(bundle);
        this.q.c((Context)this);
        super.onCreate(bundle);
        this.x.g(bundle);
        q.g(this);
        int n8 = this.v;
        if (n8 != 0) {
            this.setContentView(n8);
        }
    }

    public void onRequestPermissionsResult(int n8, String[] arrstring, int[] arrn) {
        if (!this.x.b(n8, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", arrstring).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", arrn))) {
            Activity.super.onRequestPermissionsResult(n8, arrstring, arrn);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        Object object = this.l();
        Object object2 = this.t;
        t t8 = object2;
        if (object2 == null) {
            c c8 = (c)this.getLastNonConfigurationInstance();
            t8 = object2;
            if (c8 != null) {
                t8 = c8.b;
            }
        }
        if (t8 == null && object == null) {
            return null;
        }
        object2 = new c();
        object2.a = object;
        object2.b = t8;
        return object2;
    }

    @Override
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.d d8 = this.g();
        if (d8 instanceof i) {
            ((i)d8).o(d.c.q);
        }
        super.onSaveInstanceState(bundle);
        this.s.d(bundle);
        this.x.h(bundle);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void reportFullyDrawn() {
        try {
            if (t1.b.h()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("reportFullyDrawn() for ");
                stringBuilder.append((Object)this.getComponentName());
                t1.b.c(stringBuilder.toString());
            }
            Activity.super.reportFullyDrawn();
        }
        catch (Throwable throwable) {}
        t1.b.f();
        return;
        t1.b.f();
        throw throwable;
    }

    public void setContentView(int n8) {
        this.i();
        Activity.super.setContentView(n8);
    }

    public void setContentView(@SuppressLint(value={"UnknownNullness", "MissingNullability"}) View view) {
        this.i();
        Activity.super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.i();
        Activity.super.setContentView(view, layoutParams);
    }

    public void startActivityForResult(Intent intent, int n8) {
        Activity.super.startActivityForResult(intent, n8);
    }

    public void startActivityForResult(Intent intent, int n8, Bundle bundle) {
        Activity.super.startActivityForResult(intent, n8, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int n8, Intent intent, int n9, int n10, int n11) {
        Activity.super.startIntentSenderForResult(intentSender, n8, intent, n9, n10, n11);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int n8, Intent intent, int n9, int n10, int n11, Bundle bundle) {
        Activity.super.startIntentSenderForResult(intentSender, n8, intent, n9, n10, n11, bundle);
    }

    public static final class c {
        public Object a;
        public t b;
    }

}

