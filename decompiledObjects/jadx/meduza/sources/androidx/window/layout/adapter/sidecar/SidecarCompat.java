package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.layout.adapter.sidecar.b;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import d9.c0;
import ec.i;
import f2.i;
import g9.u;
import i2.k;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import rb.h;
import sb.s;
import v3.x0;

/* loaded from: classes.dex */
public final class SidecarCompat implements androidx.window.layout.adapter.sidecar.a {

    /* renamed from: a, reason: collision with root package name */
    public final SidecarInterface f1405a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.a f1406b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f1407c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f1408d;

    /* renamed from: e, reason: collision with root package name */
    public b f1409e;

    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
            SidecarInterface g10;
            i.e(sidecarDeviceState, "newDeviceState");
            Collection<Activity> values = SidecarCompat.this.f1407c.values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : values) {
                IBinder a10 = a.a(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (a10 != null && (g10 = sidecarCompat.g()) != null) {
                    sidecarWindowLayoutInfo = g10.getWindowLayoutInfo(a10);
                }
                b bVar = sidecarCompat.f1409e;
                if (bVar != null) {
                    bVar.a(activity, sidecarCompat.f1406b.e(sidecarWindowLayoutInfo, sidecarDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
            SidecarDeviceState sidecarDeviceState;
            i.e(iBinder, "windowToken");
            i.e(sidecarWindowLayoutInfo, "newLayout");
            Activity activity = (Activity) SidecarCompat.this.f1407c.get(iBinder);
            if (activity == null) {
                Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            l2.a aVar = SidecarCompat.this.f1406b;
            SidecarInterface g10 = SidecarCompat.this.g();
            if (g10 == null || (sidecarDeviceState = g10.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            k e10 = aVar.e(sidecarWindowLayoutInfo, sidecarDeviceState);
            b bVar = SidecarCompat.this.f1409e;
            if (bVar != null) {
                bVar.a(activity, e10);
            }
        }
    }

    public static final class a {
        public static IBinder a(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        public static SidecarInterface b(Context context) {
            i.e(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public static f2.i c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (!TextUtils.isEmpty(apiVersion)) {
                    f2.i iVar = f2.i.f;
                    return i.a.a(apiVersion);
                }
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            }
            return null;
        }
    }

    public static final class b implements a.InterfaceC0021a {

        /* renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0021a f1411a;

        /* renamed from: b, reason: collision with root package name */
        public final ReentrantLock f1412b = new ReentrantLock();

        /* renamed from: c, reason: collision with root package name */
        public final WeakHashMap<Activity, k> f1413c = new WeakHashMap<>();

        public b(b.a aVar) {
            this.f1411a = aVar;
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0021a
        public final void a(Activity activity, k kVar) {
            ec.i.e(activity, "activity");
            ReentrantLock reentrantLock = this.f1412b;
            reentrantLock.lock();
            try {
                if (ec.i.a(kVar, this.f1413c.get(activity))) {
                    return;
                }
                this.f1413c.put(activity, kVar);
                reentrantLock.unlock();
                this.f1411a.a(activity, kVar);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void b(Activity activity) {
            ec.i.e(activity, "activity");
            ReentrantLock reentrantLock = this.f1412b;
            reentrantLock.lock();
            try {
                this.f1413c.put(activity, null);
                h hVar = h.f13851a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final SidecarCompat f1414a;

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference<Activity> f1415b;

        public c(SidecarCompat sidecarCompat, Activity activity) {
            ec.i.e(sidecarCompat, "sidecarCompat");
            this.f1414a = sidecarCompat;
            this.f1415b = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            Window window;
            WindowManager.LayoutParams attributes;
            ec.i.e(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.f1415b.get();
            IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
            if (activity == null || iBinder == null) {
                return;
            }
            this.f1414a.i(iBinder, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ec.i.e(view, "view");
        }
    }

    public SidecarCompat(Context context) {
        ec.i.e(context, "context");
        SidecarInterface b10 = a.b(context);
        l2.a aVar = new l2.a(0);
        this.f1405a = b10;
        this.f1406b = aVar;
        this.f1407c = new LinkedHashMap();
        this.f1408d = new LinkedHashMap();
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public final void a(Activity activity) {
        IBinder a10 = a.a(activity);
        if (a10 != null) {
            i(a10, activity);
        } else {
            activity.getWindow().getDecorView().addOnAttachStateChangeListener(new c(this, activity));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.window.layout.adapter.sidecar.a
    public final void b(Activity activity) {
        SidecarInterface sidecarInterface;
        ec.i.e(activity, "activity");
        IBinder a10 = a.a(activity);
        if (a10 == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f1405a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(a10);
        }
        d0.a<Configuration> aVar = (d0.a) this.f1408d.get(activity);
        if (aVar != null) {
            if (activity instanceof v.c) {
                ((v.c) activity).removeOnConfigurationChangedListener(aVar);
            }
            this.f1408d.remove(activity);
        }
        b bVar = this.f1409e;
        if (bVar != null) {
            bVar.b(activity);
        }
        boolean z10 = this.f1407c.size() == 1;
        this.f1407c.remove(a10);
        if (!z10 || (sidecarInterface = this.f1405a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    @Override // androidx.window.layout.adapter.sidecar.a
    public final void c(b.a aVar) {
        this.f1409e = new b(aVar);
        SidecarInterface sidecarInterface = this.f1405a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f1406b, new TranslatingCallback()));
        }
    }

    public final SidecarInterface g() {
        return this.f1405a;
    }

    public final k h(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        IBinder a10 = a.a(activity);
        if (a10 == null) {
            return new k(s.f14324a);
        }
        SidecarInterface sidecarInterface = this.f1405a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(a10) : null;
        l2.a aVar = this.f1406b;
        SidecarInterface sidecarInterface2 = this.f1405a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return aVar.e(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(IBinder iBinder, final Activity activity) {
        SidecarInterface sidecarInterface;
        this.f1407c.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f1405a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        final int i10 = 0;
        if (this.f1407c.size() == 1 && (sidecarInterface = this.f1405a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        b bVar = this.f1409e;
        if (bVar != null) {
            bVar.a(activity, h(activity));
        }
        if (this.f1408d.get(activity) == null && (activity instanceof v.c)) {
            d0.a<Configuration> aVar = new d0.a() { // from class: l2.f
                @Override // d0.a
                public final void accept(Object obj) {
                    switch (i10) {
                        case 0:
                            SidecarCompat sidecarCompat = (SidecarCompat) this;
                            Activity activity2 = (Activity) activity;
                            ec.i.e(sidecarCompat, "this$0");
                            ec.i.e(activity2, "$activity");
                            SidecarCompat.b bVar2 = sidecarCompat.f1409e;
                            if (bVar2 != null) {
                                bVar2.a(activity2, sidecarCompat.h(activity2));
                                break;
                            }
                            break;
                        default:
                            InputStream inputStream = (InputStream) this;
                            c0 c0Var = (c0) activity;
                            u uVar = (u) obj;
                            uVar.d();
                            uVar.f6090d.a(new x0(uVar, new f9.f(uVar.f6091e, inputStream), c0Var, 4));
                            break;
                    }
                }
            };
            this.f1408d.put(activity, aVar);
            ((v.c) activity).addOnConfigurationChangedListener(aVar);
        }
    }

    public final boolean j() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f1405a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            if (!ec.i.a(returnType, Void.TYPE)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f1405a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f1405a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f1405a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!ec.i.a(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f1405a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!ec.i.a(returnType3, Void.TYPE)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f1405a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!ec.i.a(returnType4, Void.TYPE)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                ec.i.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) invoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            ec.i.d(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                ec.i.c(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (ec.i.a(arrayList, (List) invoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }
}
