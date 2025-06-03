package l4;

import c4.j;
import c4.t;
import c4.v;
import l4.b;
import v3.i0;
import v5.u;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: b, reason: collision with root package name */
    public v f9597b;

    /* renamed from: c, reason: collision with root package name */
    public j f9598c;

    /* renamed from: d, reason: collision with root package name */
    public f f9599d;

    /* renamed from: e, reason: collision with root package name */
    public long f9600e;
    public long f;

    /* renamed from: g, reason: collision with root package name */
    public long f9601g;

    /* renamed from: h, reason: collision with root package name */
    public int f9602h;

    /* renamed from: i, reason: collision with root package name */
    public int f9603i;

    /* renamed from: k, reason: collision with root package name */
    public long f9605k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9606l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9607m;

    /* renamed from: a, reason: collision with root package name */
    public final d f9596a = new d();

    /* renamed from: j, reason: collision with root package name */
    public a f9604j = new a();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public i0 f9608a;

        /* renamed from: b, reason: collision with root package name */
        public b.a f9609b;
    }

    public static final class b implements f {
        @Override // l4.f
        public final t a() {
            return new t.b(-9223372036854775807L);
        }

        @Override // l4.f
        public final long b(c4.i iVar) {
            return -1L;
        }

        @Override // l4.f
        public final void c(long j10) {
        }
    }

    public void a(long j10) {
        this.f9601g = j10;
    }

    public abstract long b(u uVar);

    public abstract boolean c(u uVar, long j10, a aVar);

    public void d(boolean z10) {
        int i10;
        if (z10) {
            this.f9604j = new a();
            this.f = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f9602h = i10;
        this.f9600e = -1L;
        this.f9601g = 0L;
    }
}
