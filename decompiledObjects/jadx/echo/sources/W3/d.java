package W3;

import V3.k;
import d4.C1227b;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final a f6857a;

    /* renamed from: b, reason: collision with root package name */
    public final e f6858b;

    /* renamed from: c, reason: collision with root package name */
    public final k f6859c;

    public enum a {
        Overwrite,
        Merge,
        AckUserWrite,
        ListenComplete
    }

    public d(a aVar, e eVar, k kVar) {
        this.f6857a = aVar;
        this.f6858b = eVar;
        this.f6859c = kVar;
    }

    public k a() {
        return this.f6859c;
    }

    public e b() {
        return this.f6858b;
    }

    public a c() {
        return this.f6857a;
    }

    public abstract d d(C1227b c1227b);
}
