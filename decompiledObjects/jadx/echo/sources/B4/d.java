package B4;

import G4.h;
import M4.g;
import android.app.Activity;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Map;
import w.f;

/* loaded from: classes.dex */
public class d {

    /* renamed from: e, reason: collision with root package name */
    public static final F4.a f837e = F4.a.e();

    /* renamed from: a, reason: collision with root package name */
    public final Activity f838a;

    /* renamed from: b, reason: collision with root package name */
    public final f f839b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f840c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f841d;

    public d(Activity activity) {
        this(activity, new f(), new HashMap());
    }

    public static boolean a() {
        return true;
    }

    public final g b() {
        if (!this.f841d) {
            f837e.a("No recording has been started.");
            return g.a();
        }
        SparseIntArray[] b7 = this.f839b.b();
        if (b7 == null) {
            f837e.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return g.a();
        }
        if (b7[0] != null) {
            return g.e(h.a(b7));
        }
        f837e.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
        return g.a();
    }

    public void c() {
        if (this.f841d) {
            f837e.b("FrameMetricsAggregator is already recording %s", this.f838a.getClass().getSimpleName());
        } else {
            this.f839b.a(this.f838a);
            this.f841d = true;
        }
    }

    public void d(Fragment fragment) {
        if (!this.f841d) {
            f837e.a("Cannot start sub-recording because FrameMetricsAggregator is not recording");
            return;
        }
        if (this.f840c.containsKey(fragment)) {
            f837e.b("Cannot start sub-recording because one is already ongoing with the key %s", fragment.getClass().getSimpleName());
            return;
        }
        g b7 = b();
        if (b7.d()) {
            this.f840c.put(fragment, (h.a) b7.c());
        } else {
            f837e.b("startFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        }
    }

    public g e() {
        if (!this.f841d) {
            f837e.a("Cannot stop because no recording was started");
            return g.a();
        }
        if (!this.f840c.isEmpty()) {
            f837e.a("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
            this.f840c.clear();
        }
        g b7 = b();
        try {
            this.f839b.c(this.f838a);
        } catch (IllegalArgumentException | NullPointerException e7) {
            if ((e7 instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                throw e7;
            }
            f837e.k("View not hardware accelerated. Unable to collect FrameMetrics. %s", e7.toString());
            b7 = g.a();
        }
        this.f839b.d();
        this.f841d = false;
        return b7;
    }

    public g f(Fragment fragment) {
        if (!this.f841d) {
            f837e.a("Cannot stop sub-recording because FrameMetricsAggregator is not recording");
            return g.a();
        }
        if (!this.f840c.containsKey(fragment)) {
            f837e.b("Sub-recording associated with key %s was not started or does not exist", fragment.getClass().getSimpleName());
            return g.a();
        }
        h.a aVar = (h.a) this.f840c.remove(fragment);
        g b7 = b();
        if (b7.d()) {
            return g.e(((h.a) b7.c()).a(aVar));
        }
        f837e.b("stopFragment(%s): snapshot() failed", fragment.getClass().getSimpleName());
        return g.a();
    }

    public d(Activity activity, f fVar, Map map) {
        this.f841d = false;
        this.f838a = activity;
        this.f839b = fVar;
        this.f840c = map;
    }
}
