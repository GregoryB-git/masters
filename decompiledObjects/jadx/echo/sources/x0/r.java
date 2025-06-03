package x0;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicLong f20814h = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final long f20815a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.k f20816b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f20817c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f20818d;

    /* renamed from: e, reason: collision with root package name */
    public final long f20819e;

    /* renamed from: f, reason: collision with root package name */
    public final long f20820f;

    /* renamed from: g, reason: collision with root package name */
    public final long f20821g;

    public r(long j7, i0.k kVar, long j8) {
        this(j7, kVar, kVar.f14652a, Collections.emptyMap(), j8, 0L, 0L);
    }

    public static long a() {
        return f20814h.getAndIncrement();
    }

    public r(long j7, i0.k kVar, Uri uri, Map map, long j8, long j9, long j10) {
        this.f20815a = j7;
        this.f20816b = kVar;
        this.f20817c = uri;
        this.f20818d = map;
        this.f20819e = j8;
        this.f20820f = j9;
        this.f20821g = j10;
    }
}
