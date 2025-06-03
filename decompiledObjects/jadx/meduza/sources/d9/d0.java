package d9;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: g, reason: collision with root package name */
    public static final d0 f3654g = new d0(0, 0, 0, 0, null, 3);

    /* renamed from: a, reason: collision with root package name */
    public final int f3655a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3656b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3657c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3658d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3659e;
    public final Exception f;

    public d0(int i10, int i11, long j10, long j11, com.google.firebase.firestore.f fVar, int i12) {
        this.f3655a = i10;
        this.f3656b = i11;
        this.f3657c = j10;
        this.f3658d = j11;
        this.f3659e = i12;
        this.f = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d0.class != obj.getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f3655a != d0Var.f3655a || this.f3656b != d0Var.f3656b || this.f3657c != d0Var.f3657c || this.f3658d != d0Var.f3658d || this.f3659e != d0Var.f3659e) {
            return false;
        }
        Exception exc = this.f;
        Exception exc2 = d0Var.f;
        return exc != null ? exc.equals(exc2) : exc2 == null;
    }

    public final int hashCode() {
        int i10 = ((this.f3655a * 31) + this.f3656b) * 31;
        long j10 = this.f3657c;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f3658d;
        int c10 = (q0.g.c(this.f3659e) + ((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31)) * 31;
        Exception exc = this.f;
        return c10 + (exc != null ? exc.hashCode() : 0);
    }
}
