package z2;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
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
public final class Z extends Fragment implements InterfaceC2304g {

    /* renamed from: r, reason: collision with root package name */
    public static final WeakHashMap f21694r = new WeakHashMap();

    /* renamed from: o, reason: collision with root package name */
    public final Map f21695o = Collections.synchronizedMap(new C1958a());

    /* renamed from: p, reason: collision with root package name */
    public int f21696p = 0;

    /* renamed from: q, reason: collision with root package name */
    public Bundle f21697q;

    public static Z f(Activity activity) {
        Z z7;
        WeakHashMap weakHashMap = f21694r;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (z7 = (Z) weakReference.get()) != null) {
            return z7;
        }
        try {
            Z z8 = (Z) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (z8 == null || z8.isRemoving()) {
                z8 = new Z();
                activity.getFragmentManager().beginTransaction().add(z8, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(z8));
            return z8;
        } catch (ClassCastException e7) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e7);
        }
    }

    @Override // z2.InterfaceC2304g
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f21695o.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f21695o.put(str, lifecycleCallback);
        if (this.f21696p > 0) {
            new M2.e(Looper.getMainLooper()).post(new Y(this, lifecycleCallback, str));
        }
    }

    @Override // z2.InterfaceC2304g
    public final LifecycleCallback b(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f21695o.get(str));
    }

    @Override // z2.InterfaceC2304g
    public final Activity c() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f21695o.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i7, int i8, Intent intent) {
        super.onActivityResult(i7, i8, intent);
        Iterator it = this.f21695o.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i7, i8, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f21696p = 1;
        this.f21697q = bundle;
        for (Map.Entry entry : this.f21695o.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f21696p = 5;
        Iterator it = this.f21695o.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f21696p = 3;
        Iterator it = this.f21695o.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f21695o.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f21696p = 2;
        Iterator it = this.f21695o.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f21696p = 4;
        Iterator it = this.f21695o.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }
}
