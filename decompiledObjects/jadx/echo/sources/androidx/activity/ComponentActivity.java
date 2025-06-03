package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.d;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.q;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.savedstate.SavedStateRegistry;
import c.C0809a;
import c.InterfaceC0810b;
import d.AbstractC1161a;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import w.AbstractC2072a;
import w.e;

/* loaded from: classes.dex */
public abstract class ComponentActivity extends e implements h, u, androidx.savedstate.c, androidx.activity.c, d {

    /* renamed from: t, reason: collision with root package name */
    public t f8290t;

    /* renamed from: v, reason: collision with root package name */
    public int f8292v;

    /* renamed from: q, reason: collision with root package name */
    public final C0809a f8287q = new C0809a();

    /* renamed from: r, reason: collision with root package name */
    public final i f8288r = new i(this);

    /* renamed from: s, reason: collision with root package name */
    public final androidx.savedstate.b f8289s = androidx.savedstate.b.a(this);

    /* renamed from: u, reason: collision with root package name */
    public final OnBackPressedDispatcher f8291u = new OnBackPressedDispatcher(new a());

    /* renamed from: w, reason: collision with root package name */
    public final AtomicInteger f8293w = new AtomicInteger();

    /* renamed from: x, reason: collision with root package name */
    public ActivityResultRegistry f8294x = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e7) {
                if (!TextUtils.equals(e7.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e7;
                }
            }
        }
    }

    public class b extends ActivityResultRegistry {

        public class a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ int f8300o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ AbstractC1161a.C0185a f8301p;

            public a(int i7, AbstractC1161a.C0185a c0185a) {
                this.f8300o = i7;
                this.f8301p = c0185a;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.f8300o, this.f8301p.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b, reason: collision with other inner class name */
        public class RunnableC0150b implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ int f8303o;

            /* renamed from: p, reason: collision with root package name */
            public final /* synthetic */ IntentSender.SendIntentException f8304p;

            public RunnableC0150b(int i7, IntentSender.SendIntentException sendIntentException) {
                this.f8303o = i7;
                this.f8304p = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f8303o, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f8304p));
            }
        }

        public b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public void f(int i7, AbstractC1161a abstractC1161a, Object obj, w.b bVar) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            AbstractC1161a.C0185a b7 = abstractC1161a.b(componentActivity, obj);
            if (b7 != null) {
                new Handler(Looper.getMainLooper()).post(new a(i7, b7));
                return;
            }
            Intent a7 = abstractC1161a.a(componentActivity, obj);
            if (a7.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = a7.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a7.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a7.getAction())) {
                if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a7.getAction())) {
                    AbstractC2072a.n(componentActivity, a7, i7, bundle);
                    return;
                }
                androidx.activity.result.e eVar = (androidx.activity.result.e) a7.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    AbstractC2072a.o(componentActivity, eVar.d(), i7, eVar.a(), eVar.b(), eVar.c(), 0, bundle);
                    return;
                } catch (IntentSender.SendIntentException e7) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0150b(i7, e7));
                    return;
                }
            }
            String[] stringArrayExtra = a7.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : stringArrayExtra) {
                if (ComponentActivity.this.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AbstractC2072a.l(componentActivity, (String[]) arrayList.toArray(new String[0]), i7);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public Object f8306a;

        /* renamed from: b, reason: collision with root package name */
        public t f8307b;
    }

    public ComponentActivity() {
        if (g() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i7 = Build.VERSION.SDK_INT;
        g().a(new f() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.f
            public void a(h hVar, d.b bVar) {
                if (bVar == d.b.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        g().a(new f() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.f
            public void a(h hVar, d.b bVar) {
                if (bVar == d.b.ON_DESTROY) {
                    ComponentActivity.this.f8287q.b();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.d().a();
                }
            }
        });
        g().a(new f() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.f
            public void a(h hVar, d.b bVar) {
                ComponentActivity.this.h();
                ComponentActivity.this.g().c(this);
            }
        });
        if (i7 <= 23) {
            g().a(new ImmLeaksCleaner(this));
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.result.d
    public final ActivityResultRegistry c() {
        return this.f8294x;
    }

    @Override // androidx.lifecycle.u
    public t d() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        h();
        return this.f8290t;
    }

    public final void f(InterfaceC0810b interfaceC0810b) {
        this.f8287q.a(interfaceC0810b);
    }

    @Override // androidx.lifecycle.h
    public androidx.lifecycle.d g() {
        return this.f8288r;
    }

    public void h() {
        if (this.f8290t == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.f8290t = cVar.f8307b;
            }
            if (this.f8290t == null) {
                this.f8290t = new t();
            }
        }
    }

    public final void i() {
        v.a(getWindow().getDecorView(), this);
        w.a(getWindow().getDecorView(), this);
        androidx.savedstate.d.a(getWindow().getDecorView(), this);
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher j() {
        return this.f8291u;
    }

    @Override // androidx.savedstate.c
    public final SavedStateRegistry k() {
        return this.f8289s.b();
    }

    public Object l() {
        return null;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        if (this.f8294x.b(i7, i8, intent)) {
            return;
        }
        super.onActivityResult(i7, i8, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f8291u.c();
    }

    @Override // w.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f8289s.c(bundle);
        this.f8287q.c(this);
        super.onCreate(bundle);
        this.f8294x.g(bundle);
        q.g(this);
        int i7 = this.f8292v;
        if (i7 != 0) {
            setContentView(i7);
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        if (this.f8294x.b(i7, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object l7 = l();
        t tVar = this.f8290t;
        if (tVar == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            tVar = cVar.f8307b;
        }
        if (tVar == null && l7 == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.f8306a = l7;
        cVar2.f8307b = tVar;
        return cVar2;
    }

    @Override // w.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.d g7 = g();
        if (g7 instanceof i) {
            ((i) g7).o(d.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f8289s.d(bundle);
        this.f8294x.h(bundle);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (t1.b.h()) {
                t1.b.c("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
            t1.b.f();
        } catch (Throwable th) {
            t1.b.f();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i7) {
        i();
        super.setContentView(i7);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i7) {
        super.startActivityForResult(intent, i7);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10) {
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        i();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i7, Bundle bundle) {
        super.startActivityForResult(intent, i7, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        super.setContentView(view, layoutParams);
    }
}
