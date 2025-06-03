// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B4;

import M4.g;
import M4.j;
import G4.h;
import com.google.firebase.perf.metrics.Trace;
import androidx.fragment.app.Fragment;
import L4.k;
import java.util.WeakHashMap;
import F4.a;
import androidx.fragment.app.n;

public class c extends l
{
    public static final a f;
    public final WeakHashMap a;
    public final M4.a b;
    public final L4.k c;
    public final B4.a d;
    public final d e;
    
    static {
        f = a.e();
    }
    
    public c(final M4.a b, final L4.k c, final B4.a d, final d e) {
        this.a = new WeakHashMap();
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public void f(final n n, final Fragment key) {
        super.f(n, key);
        final a f = B4.c.f;
        f.b("FragmentMonitor %s.onFragmentPaused ", key.getClass().getSimpleName());
        if (!this.a.containsKey(key)) {
            f.k("FragmentMonitor: missed a fragment trace from %s", key.getClass().getSimpleName());
            return;
        }
        final Trace trace = this.a.get(key);
        this.a.remove(key);
        final g f2 = this.e.f(key);
        if (!f2.d()) {
            f.k("onFragmentPaused: recorder failed to trace %s", key.getClass().getSimpleName());
            return;
        }
        M4.j.a(trace, (h.a)f2.c());
        trace.stop();
    }
    
    @Override
    public void i(final n n, final Fragment key) {
        super.i(n, key);
        B4.c.f.b("FragmentMonitor %s.onFragmentResumed", key.getClass().getSimpleName());
        final Trace value = new Trace(this.o(key), this.c, this.b, this.d);
        value.start();
        String simpleName;
        if (key.E() == null) {
            simpleName = "No parent";
        }
        else {
            simpleName = key.E().getClass().getSimpleName();
        }
        value.putAttribute("Parent_fragment", simpleName);
        if (key.n() != null) {
            value.putAttribute("Hosting_activity", key.n().getClass().getSimpleName());
        }
        this.a.put(key, value);
        this.e.d(key);
    }
    
    public String o(final Fragment fragment) {
        final StringBuilder sb = new StringBuilder();
        sb.append("_st_");
        sb.append(fragment.getClass().getSimpleName());
        return sb.toString();
    }
}
