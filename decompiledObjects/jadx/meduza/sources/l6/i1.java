package l6;

import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzh;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f9692a = Collections.synchronizedMap(new r.b());

    /* renamed from: b, reason: collision with root package name */
    public int f9693b = 0;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f9694c;

    public final void a(String str, f fVar) {
        if (this.f9692a.containsKey(str)) {
            throw new IllegalArgumentException(defpackage.g.e("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        this.f9692a.put(str, fVar);
        if (this.f9693b > 0) {
            new zzh(Looper.getMainLooper()).post(new i6.n(this, fVar, str));
        }
    }

    public final void b(Bundle bundle) {
        this.f9693b = 1;
        this.f9694c = bundle;
        for (Map.Entry entry : this.f9692a.entrySet()) {
            ((f) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void c() {
        this.f9693b = 5;
        Iterator it = this.f9692a.values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).onDestroy();
        }
    }

    public final void d() {
        this.f9693b = 3;
        Iterator it = this.f9692a.values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).onResume();
        }
    }

    public final void e(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f9692a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((f) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public final void f() {
        this.f9693b = 2;
        Iterator it = this.f9692a.values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).onStart();
        }
    }

    public final void g() {
        this.f9693b = 4;
        Iterator it = this.f9692a.values().iterator();
        while (it.hasNext()) {
            ((f) it.next()).onStop();
        }
    }
}
