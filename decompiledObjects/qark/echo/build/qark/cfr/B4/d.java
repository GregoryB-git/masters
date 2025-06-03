/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.SparseIntArray
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package B4;

import F4.a;
import G4.h;
import M4.g;
import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Map;
import w.f;

public class d {
    public static final a e = a.e();
    public final Activity a;
    public final f b;
    public final Map c;
    public boolean d = false;

    public d(Activity activity) {
        this(activity, new f(), (Map)new HashMap());
    }

    public d(Activity activity, f f8, Map map) {
        this.a = activity;
        this.b = f8;
        this.c = map;
    }

    public static boolean a() {
        return true;
    }

    public final g b() {
        if (!this.d) {
            e.a("No recording has been started.");
            return g.a();
        }
        SparseIntArray[] arrsparseIntArray = this.b.b();
        if (arrsparseIntArray == null) {
            e.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return g.a();
        }
        if (arrsparseIntArray[0] == null) {
            e.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return g.a();
        }
        return g.e(h.a(arrsparseIntArray));
    }

    public void c() {
        if (this.d) {
            e.b("FrameMetricsAggregator is already recording %s", this.a.getClass().getSimpleName());
            return;
        }
        this.b.a(this.a);
        this.d = true;
    }

    public void d(Fragment fragment) {
        if (!this.d) {
            e.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (this.c.containsKey((Object)fragment)) {
            e.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        g g8 = this.b();
        if (!g8.d()) {
            e.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
            return;
        }
        this.c.put((Object)fragment, (Object)((h.a)g8.c()));
    }

    public g e() {
        g g8;
        block6 : {
            if (!this.d) {
                e.a("Cannot stop because no recording was started");
                return g.a();
            }
            if (!this.c.isEmpty()) {
                e.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
                this.c.clear();
            }
            g8 = this.b();
            try {
                this.b.c(this.a);
                break block6;
            }
            catch (NullPointerException nullPointerException) {
            }
            catch (IllegalArgumentException illegalArgumentException) {
                // empty catch block
            }
            if (g8 instanceof NullPointerException && Build.VERSION.SDK_INT > 28) {
                throw g8;
            }
            e.k("View not hardware accelerated. Unable to collect FrameMetrics. %s", g8.toString());
            g8 = g.a();
        }
        this.b.d();
        this.d = false;
        return g8;
    }

    public g f(Fragment fragment) {
        if (!this.d) {
            e.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return g.a();
        }
        if (!this.c.containsKey((Object)fragment)) {
            e.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return g.a();
        }
        h.a a8 = (h.a)this.c.remove((Object)fragment);
        g g8 = this.b();
        if (!g8.d()) {
            e.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
            return g.a();
        }
        return g.e(((h.a)g8.c()).a(a8));
    }
}

