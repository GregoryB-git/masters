/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.WeakHashMap
 */
package B4;

import B4.a;
import B4.d;
import G4.h;
import L4.k;
import M4.g;
import M4.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import com.google.firebase.perf.metrics.Trace;
import java.util.WeakHashMap;

public class c
extends n.l {
    public static final F4.a f = F4.a.e();
    public final WeakHashMap a = new WeakHashMap();
    public final M4.a b;
    public final k c;
    public final a d;
    public final d e;

    public c(M4.a a8, k k8, a a9, d d8) {
        this.b = a8;
        this.c = k8;
        this.d = a9;
        this.e = d8;
    }

    @Override
    public void f(n object, Fragment fragment) {
        super.f((n)object, fragment);
        object = f;
        object.b("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.a.containsKey((Object)fragment)) {
            object.k("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace)this.a.get((Object)fragment);
        this.a.remove((Object)fragment);
        g g8 = this.e.f(fragment);
        if (!g8.d()) {
            object.k("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
            return;
        }
        j.a(trace, (h.a)g8.c());
        trace.stop();
    }

    @Override
    public void i(n object, Fragment fragment) {
        super.i((n)object, fragment);
        f.b("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(this.o(fragment), this.c, this.b, this.d);
        trace.start();
        object = fragment.E() == null ? "No parent" : fragment.E().getClass().getSimpleName();
        trace.putAttribute("Parent_fragment", (String)object);
        if (fragment.n() != null) {
            trace.putAttribute("Hosting_activity", fragment.n().getClass().getSimpleName());
        }
        this.a.put((Object)fragment, (Object)trace);
        this.e.d(fragment);
    }

    public String o(Fragment fragment) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("_st_");
        stringBuilder.append(fragment.getClass().getSimpleName());
        return stringBuilder.toString();
    }
}

