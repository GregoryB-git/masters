// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.activity;

import android.content.IntentSender;
import android.annotation.SuppressLint;
import androidx.lifecycle.q;
import androidx.savedstate.SavedStateRegistry;
import androidx.lifecycle.w;
import androidx.lifecycle.v;
import android.view.ViewGroup$LayoutParams;
import androidx.lifecycle.g;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.f;
import android.os.Build$VERSION;
import android.os.Bundle;
import java.io.Serializable;
import android.content.Intent;
import android.content.IntentSender$SendIntentException;
import android.app.Activity;
import android.os.Process;
import java.util.ArrayList;
import android.os.Handler;
import android.os.Looper;
import android.content.Context;
import android.text.TextUtils;
import androidx.activity.result.ActivityResultRegistry;
import java.util.concurrent.atomic.AtomicInteger;
import androidx.lifecycle.t;
import androidx.savedstate.b;
import androidx.lifecycle.i;
import c.a;
import androidx.activity.result.d;
import androidx.savedstate.c;
import androidx.lifecycle.u;
import androidx.lifecycle.h;
import w.e;

public abstract class ComponentActivity extends e implements h, u, androidx.savedstate.c, androidx.activity.c, d
{
    public final c.a q;
    public final i r;
    public final b s;
    public t t;
    public final OnBackPressedDispatcher u;
    public int v;
    public final AtomicInteger w;
    public ActivityResultRegistry x;
    
    public ComponentActivity() {
        this.q = new c.a();
        this.r = new i(this);
        this.s = androidx.savedstate.b.a(this);
        this.u = new OnBackPressedDispatcher(new Runnable() {
            @Override
            public void run() {
                try {
                    ComponentActivity.e(ComponentActivity.this);
                }
                catch (IllegalStateException ex) {
                    if (TextUtils.equals((CharSequence)ex.getMessage(), (CharSequence)"Can not perform this action after onSaveInstanceState")) {
                        return;
                    }
                    throw ex;
                }
            }
        });
        this.w = new AtomicInteger();
        this.x = new ActivityResultRegistry() {
            @Override
            public void f(final int n, final d.a a, final Object o, final w.b b) {
                final ComponentActivity h = ComponentActivity.this;
                final d.a.a b2 = a.b((Context)h, o);
                if (b2 != null) {
                    new Handler(Looper.getMainLooper()).post((Runnable)new Runnable() {
                        @Override
                        public void run() {
                            ActivityResultRegistry.this.c(n, b2.a());
                        }
                    });
                    return;
                }
                final Intent a2 = a.a((Context)h, o);
                Bundle bundleExtra;
                if (a2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                    bundleExtra = a2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    a2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                }
                else {
                    bundleExtra = null;
                }
                if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a2.getAction())) {
                    final String[] stringArrayExtra = a2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    if (stringArrayExtra == null) {
                        return;
                    }
                    final ArrayList<String> list = new ArrayList<String>();
                    for (int length = stringArrayExtra.length, i = 0; i < length; ++i) {
                        final String s = stringArrayExtra[i];
                        if (((Context)ComponentActivity.this).checkPermission(s, Process.myPid(), Process.myUid()) != 0) {
                            list.add(s);
                        }
                    }
                    if (!list.isEmpty()) {
                        w.a.l(h, list.toArray(new String[0]), n);
                    }
                }
                else {
                    if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a2.getAction())) {
                        final androidx.activity.result.e e = (androidx.activity.result.e)a2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                        try {
                            w.a.o(h, e.d(), n, e.a(), e.b(), e.c(), 0, bundleExtra);
                            return;
                        }
                        catch (IntentSender$SendIntentException ex) {
                            new Handler(Looper.getMainLooper()).post((Runnable)new Runnable() {
                                @Override
                                public void run() {
                                    ActivityResultRegistry.this.b(n, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable)ex));
                                }
                            });
                            return;
                        }
                    }
                    w.a.n(h, a2, n, bundleExtra);
                }
            }
        };
        if (this.g() != null) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            this.g().a(new androidx.lifecycle.f() {
                @Override
                public void a(final h h, final androidx.lifecycle.d.b b) {
                    if (b == d.b.ON_STOP) {
                        final Window window = ComponentActivity.this.getWindow();
                        View peekDecorView;
                        if (window != null) {
                            peekDecorView = window.peekDecorView();
                        }
                        else {
                            peekDecorView = null;
                        }
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
            this.g().a(new androidx.lifecycle.f() {
                @Override
                public void a(final h h, final androidx.lifecycle.d.b b) {
                    if (b == d.b.ON_DESTROY) {
                        ComponentActivity.this.q.b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.d().a();
                        }
                    }
                }
            });
            this.g().a(new androidx.lifecycle.f() {
                @Override
                public void a(final h h, final androidx.lifecycle.d.b b) {
                    ComponentActivity.this.h();
                    ComponentActivity.this.g().c(this);
                }
            });
            if (sdk_INT <= 23) {
                this.g().a(new ImmLeaksCleaner(this));
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }
    
    public static /* synthetic */ void e(final ComponentActivity componentActivity) {
        componentActivity.onBackPressed();
    }
    
    public void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.i();
        super.addContentView(view, viewGroup$LayoutParams);
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
    
    public final void f(final c.b b) {
        this.q.a(b);
    }
    
    @Override
    public androidx.lifecycle.d g() {
        return this.r;
    }
    
    public void h() {
        if (this.t == null) {
            final c c = (c)this.getLastNonConfigurationInstance();
            if (c != null) {
                this.t = c.b;
            }
            if (this.t == null) {
                this.t = new t();
            }
        }
    }
    
    public final void i() {
        androidx.lifecycle.v.a(this.getWindow().getDecorView(), this);
        androidx.lifecycle.w.a(this.getWindow().getDecorView(), this);
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
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        if (!this.x.b(n, n2, intent)) {
            super.onActivityResult(n, n2, intent);
        }
    }
    
    public void onBackPressed() {
        this.u.c();
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        this.s.c(bundle);
        this.q.c((Context)this);
        super.onCreate(bundle);
        this.x.g(bundle);
        androidx.lifecycle.q.g(this);
        final int v = this.v;
        if (v != 0) {
            this.setContentView(v);
        }
    }
    
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        if (!this.x.b(n, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", array).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", array2))) {
            super.onRequestPermissionsResult(n, array, array2);
        }
    }
    
    public final Object onRetainNonConfigurationInstance() {
        final Object l = this.l();
        t b;
        final t t = b = this.t;
        if (t == null) {
            final c c = (c)this.getLastNonConfigurationInstance();
            b = t;
            if (c != null) {
                b = c.b;
            }
        }
        if (b == null && l == null) {
            return null;
        }
        final c c2 = new c();
        c2.a = l;
        c2.b = b;
        return c2;
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        final androidx.lifecycle.d g = this.g();
        if (g instanceof i) {
            ((i)g).o(androidx.lifecycle.d.c.q);
        }
        super.onSaveInstanceState(bundle);
        this.s.d(bundle);
        this.x.h(bundle);
    }
    
    public void reportFullyDrawn() {
        while (true) {
            try {
                if (t1.b.h()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("reportFullyDrawn() for ");
                    sb.append(this.getComponentName());
                    t1.b.c(sb.toString());
                }
                super.reportFullyDrawn();
                t1.b.f();
                return;
                t1.b.f();
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void setContentView(final int contentView) {
        this.i();
        super.setContentView(contentView);
    }
    
    public void setContentView(@SuppressLint({ "UnknownNullness", "MissingNullability" }) final View contentView) {
        this.i();
        super.setContentView(contentView);
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.i();
        super.setContentView(view, viewGroup$LayoutParams);
    }
    
    public void startActivityForResult(final Intent intent, final int n) {
        super.startActivityForResult(intent, n);
    }
    
    public void startActivityForResult(final Intent intent, final int n, final Bundle bundle) {
        super.startActivityForResult(intent, n, bundle);
    }
    
    public void startIntentSenderForResult(final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4) {
        super.startIntentSenderForResult(intentSender, n, intent, n2, n3, n4);
    }
    
    public void startIntentSenderForResult(final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4, final Bundle bundle) {
        super.startIntentSenderForResult(intentSender, n, intent, n2, n3, n4, bundle);
    }
    
    public static final class c
    {
        public Object a;
        public t b;
    }
}
