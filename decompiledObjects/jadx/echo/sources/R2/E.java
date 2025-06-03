package R2;

import A2.AbstractC0328n;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final String f4640a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4641b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4642c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4643d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4644e;

    /* renamed from: f, reason: collision with root package name */
    public final long f4645f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4646g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f4647h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f4648i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f4649j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f4650k;

    public E(String str, String str2, long j7, long j8, long j9, long j10, long j11, Long l7, Long l8, Long l9, Boolean bool) {
        AbstractC0328n.e(str);
        AbstractC0328n.e(str2);
        AbstractC0328n.a(j7 >= 0);
        AbstractC0328n.a(j8 >= 0);
        AbstractC0328n.a(j9 >= 0);
        AbstractC0328n.a(j11 >= 0);
        this.f4640a = str;
        this.f4641b = str2;
        this.f4642c = j7;
        this.f4643d = j8;
        this.f4644e = j9;
        this.f4645f = j10;
        this.f4646g = j11;
        this.f4647h = l7;
        this.f4648i = l8;
        this.f4649j = l9;
        this.f4650k = bool;
    }

    public final E a(long j7) {
        return new E(this.f4640a, this.f4641b, this.f4642c, this.f4643d, this.f4644e, j7, this.f4646g, this.f4647h, this.f4648i, this.f4649j, this.f4650k);
    }

    public final E b(long j7, long j8) {
        return new E(this.f4640a, this.f4641b, this.f4642c, this.f4643d, this.f4644e, this.f4645f, j7, Long.valueOf(j8), this.f4648i, this.f4649j, this.f4650k);
    }

    public final E c(Long l7, Long l8, Boolean bool) {
        return new E(this.f4640a, this.f4641b, this.f4642c, this.f4643d, this.f4644e, this.f4645f, this.f4646g, this.f4647h, l7, l8, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public E(String str, String str2, long j7, long j8, long j9, long j10, Long l7, Long l8, Long l9, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j9, 0L, null, null, null, null);
    }
}
