package D0;

import android.view.Surface;
import t0.C1986o;

/* loaded from: classes.dex */
public class j extends C1986o {

    /* renamed from: r, reason: collision with root package name */
    public final int f1121r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1122s;

    public j(Throwable th, t0.p pVar, Surface surface) {
        super(th, pVar);
        this.f1121r = System.identityHashCode(surface);
        this.f1122s = surface == null || surface.isValid();
    }
}
