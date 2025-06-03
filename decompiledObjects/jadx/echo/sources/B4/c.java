package B4;

import G4.h;
import L4.k;
import M4.g;
import M4.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.google.firebase.perf.metrics.Trace;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class c extends n.l {

    /* renamed from: f, reason: collision with root package name */
    public static final F4.a f831f = F4.a.e();

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f832a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final M4.a f833b;

    /* renamed from: c, reason: collision with root package name */
    public final k f834c;

    /* renamed from: d, reason: collision with root package name */
    public final a f835d;

    /* renamed from: e, reason: collision with root package name */
    public final d f836e;

    public c(M4.a aVar, k kVar, a aVar2, d dVar) {
        this.f833b = aVar;
        this.f834c = kVar;
        this.f835d = aVar2;
        this.f836e = dVar;
    }

    @Override // androidx.fragment.app.n.l
    public void f(n nVar, Fragment fragment) {
        super.f(nVar, fragment);
        F4.a aVar = f831f;
        aVar.b("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f832a.containsKey(fragment)) {
            aVar.k("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) this.f832a.get(fragment);
        this.f832a.remove(fragment);
        g f7 = this.f836e.f(fragment);
        if (!f7.d()) {
            aVar.k("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            j.a(trace, (h.a) f7.c());
            trace.stop();
        }
    }

    @Override // androidx.fragment.app.n.l
    public void i(n nVar, Fragment fragment) {
        super.i(nVar, fragment);
        f831f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(o(fragment), this.f834c, this.f833b, this.f835d);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment.E() == null ? "No parent" : fragment.E().getClass().getSimpleName());
        if (fragment.n() != null) {
            trace.putAttribute("Hosting_activity", fragment.n().getClass().getSimpleName());
        }
        this.f832a.put(fragment, trace);
        this.f836e.d(fragment);
    }

    public String o(Fragment fragment) {
        return "_st_" + fragment.getClass().getSimpleName();
    }
}
