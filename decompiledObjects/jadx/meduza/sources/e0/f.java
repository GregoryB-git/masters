package e0;

import android.content.Context;
import android.view.VelocityTracker;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3786a;

    /* renamed from: b, reason: collision with root package name */
    public final g f3787b;

    /* renamed from: c, reason: collision with root package name */
    public final b f3788c;

    /* renamed from: d, reason: collision with root package name */
    public final a f3789d;

    /* renamed from: e, reason: collision with root package name */
    public VelocityTracker f3790e;
    public float f;

    /* renamed from: g, reason: collision with root package name */
    public int f3791g;

    /* renamed from: h, reason: collision with root package name */
    public int f3792h;

    /* renamed from: i, reason: collision with root package name */
    public int f3793i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f3794j;

    public interface a {
    }

    public interface b {
    }

    public f(Context context, NestedScrollView.c cVar) {
        d dVar = new d(0);
        e eVar = new e(0);
        this.f3791g = -1;
        this.f3792h = -1;
        this.f3793i = -1;
        this.f3794j = new int[]{Integer.MAX_VALUE, 0};
        this.f3786a = context;
        this.f3787b = cVar;
        this.f3788c = dVar;
        this.f3789d = eVar;
    }
}
