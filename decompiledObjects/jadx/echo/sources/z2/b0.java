package z2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import t.C1958a;

/* loaded from: classes.dex */
public final class b0 extends Fragment implements InterfaceC2304g {

    /* renamed from: r0, reason: collision with root package name */
    public static final WeakHashMap f21705r0 = new WeakHashMap();

    /* renamed from: o0, reason: collision with root package name */
    public final Map f21706o0 = Collections.synchronizedMap(new C1958a());

    /* renamed from: p0, reason: collision with root package name */
    public int f21707p0 = 0;

    /* renamed from: q0, reason: collision with root package name */
    public Bundle f21708q0;

    public static b0 J1(androidx.fragment.app.e eVar) {
        b0 b0Var;
        WeakHashMap weakHashMap = f21705r0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(eVar);
        if (weakReference != null && (b0Var = (b0) weakReference.get()) != null) {
            return b0Var;
        }
        try {
            b0 b0Var2 = (b0) eVar.n().h0("SupportLifecycleFragmentImpl");
            if (b0Var2 == null || b0Var2.b0()) {
                b0Var2 = new b0();
                eVar.n().m().d(b0Var2, "SupportLifecycleFragmentImpl").g();
            }
            weakHashMap.put(eVar, new WeakReference(b0Var2));
            return b0Var2;
        } catch (ClassCastException e7) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e7);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void H0() {
        super.H0();
        this.f21707p0 = 3;
        Iterator it = this.f21706o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void I0(Bundle bundle) {
        super.I0(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f21706o0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void J0() {
        super.J0();
        this.f21707p0 = 2;
        Iterator it = this.f21706o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void K0() {
        super.K0();
        this.f21707p0 = 4;
        Iterator it = this.f21706o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }

    @Override // z2.InterfaceC2304g
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f21706o0.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f21706o0.put(str, lifecycleCallback);
        if (this.f21707p0 > 0) {
            new M2.e(Looper.getMainLooper()).post(new a0(this, lifecycleCallback, str));
        }
    }

    @Override // z2.InterfaceC2304g
    public final LifecycleCallback b(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f21706o0.get(str));
    }

    @Override // z2.InterfaceC2304g
    public final /* synthetic */ Activity c() {
        return n();
    }

    @Override // androidx.fragment.app.Fragment
    public final void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.h(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f21706o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0(int i7, int i8, Intent intent) {
        super.h0(i7, i8, intent);
        Iterator it = this.f21706o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i7, i8, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void m0(Bundle bundle) {
        super.m0(bundle);
        this.f21707p0 = 1;
        this.f21708q0 = bundle;
        for (Map.Entry entry : this.f21706o0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void r0() {
        super.r0();
        this.f21707p0 = 5;
        Iterator it = this.f21706o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }
}
