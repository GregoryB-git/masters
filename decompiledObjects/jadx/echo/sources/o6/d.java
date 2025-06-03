package o6;

import a6.InterfaceC0753a;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: p, reason: collision with root package name */
    public static final d f18204p = new d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* renamed from: q, reason: collision with root package name */
    public static final d f18205q = new d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* renamed from: r, reason: collision with root package name */
    public static final d f18206r = new d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* renamed from: s, reason: collision with root package name */
    public static final d f18207s = new d("SECONDS", 3, TimeUnit.SECONDS);

    /* renamed from: t, reason: collision with root package name */
    public static final d f18208t = new d("MINUTES", 4, TimeUnit.MINUTES);

    /* renamed from: u, reason: collision with root package name */
    public static final d f18209u = new d("HOURS", 5, TimeUnit.HOURS);

    /* renamed from: v, reason: collision with root package name */
    public static final d f18210v = new d("DAYS", 6, TimeUnit.DAYS);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ d[] f18211w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0753a f18212x;

    /* renamed from: o, reason: collision with root package name */
    public final TimeUnit f18213o;

    static {
        d[] c7 = c();
        f18211w = c7;
        f18212x = a6.b.a(c7);
    }

    public d(String str, int i7, TimeUnit timeUnit) {
        this.f18213o = timeUnit;
    }

    public static final /* synthetic */ d[] c() {
        return new d[]{f18204p, f18205q, f18206r, f18207s, f18208t, f18209u, f18210v};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f18211w.clone();
    }

    public final TimeUnit e() {
        return this.f18213o;
    }
}
