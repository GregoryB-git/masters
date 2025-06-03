// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B4;

import android.os.Build$VERSION;
import androidx.fragment.app.Fragment;
import android.util.SparseIntArray;
import G4.h;
import M4.g;
import java.util.HashMap;
import java.util.Map;
import w.f;
import android.app.Activity;
import F4.a;

public class d
{
    public static final a e;
    public final Activity a;
    public final f b;
    public final Map c;
    public boolean d;
    
    static {
        e = a.e();
    }
    
    public d(final Activity activity) {
        this(activity, new f(), new HashMap());
    }
    
    public d(final Activity a, final f b, final Map c) {
        this.d = false;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static boolean a() {
        return true;
    }
    
    public final g b() {
        if (!this.d) {
            B4.d.e.a("No recording has been started.");
            return g.a();
        }
        final SparseIntArray[] b = this.b.b();
        if (b == null) {
            B4.d.e.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return g.a();
        }
        if (b[0] == null) {
            B4.d.e.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return g.a();
        }
        return g.e(h.a(b));
    }
    
    public void c() {
        if (this.d) {
            B4.d.e.b("FrameMetricsAggregator is already recording %s", this.a.getClass().getSimpleName());
            return;
        }
        this.b.a(this.a);
        this.d = true;
    }
    
    public void d(final Fragment fragment) {
        if (!this.d) {
            B4.d.e.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (this.c.containsKey(fragment)) {
            B4.d.e.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        final g b = this.b();
        if (!b.d()) {
            B4.d.e.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
            return;
        }
        this.c.put(fragment, b.c());
    }
    
    public g e() {
        if (!this.d) {
            B4.d.e.a("Cannot stop because no recording was started");
            return g.a();
        }
        if (!this.c.isEmpty()) {
            B4.d.e.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.c.clear();
        }
        g g = this.b();
        Label_0116: {
            try {
                this.b.c(this.a);
                break Label_0116;
            }
            catch (NullPointerException g) {}
            catch (IllegalArgumentException ex) {}
            if (g instanceof NullPointerException && Build$VERSION.SDK_INT > 28) {
                throw g;
            }
            B4.d.e.k("View not hardware accelerated. Unable to collect FrameMetrics. %s", g.toString());
            g = M4.g.a();
        }
        this.b.d();
        this.d = false;
        return g;
    }
    
    public g f(final Fragment fragment) {
        if (!this.d) {
            B4.d.e.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return g.a();
        }
        if (!this.c.containsKey(fragment)) {
            B4.d.e.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return g.a();
        }
        final h.a a = this.c.remove(fragment);
        final g b = this.b();
        if (!b.d()) {
            B4.d.e.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
            return g.a();
        }
        return g.e(((h.a)b.c()).a(a));
    }
}
