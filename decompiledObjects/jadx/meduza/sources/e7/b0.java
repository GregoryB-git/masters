package e7;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4087a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4088b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4089c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4090d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4091e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4092g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f4093h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f4094i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f4095j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f4096k;

    public b0(String str, String str2, long j10) {
        this(str, str2, 0L, 0L, 0L, j10, 0L, null, null, null, null);
    }

    public b0(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        m6.j.e(str);
        m6.j.e(str2);
        m6.j.b(j10 >= 0);
        m6.j.b(j11 >= 0);
        m6.j.b(j12 >= 0);
        m6.j.b(j14 >= 0);
        this.f4087a = str;
        this.f4088b = str2;
        this.f4089c = j10;
        this.f4090d = j11;
        this.f4091e = j12;
        this.f = j13;
        this.f4092g = j14;
        this.f4093h = l10;
        this.f4094i = l11;
        this.f4095j = l12;
        this.f4096k = bool;
    }

    public final b0 a(long j10, long j11) {
        return new b0(this.f4087a, this.f4088b, this.f4089c, this.f4090d, this.f4091e, this.f, j10, Long.valueOf(j11), this.f4094i, this.f4095j, this.f4096k);
    }

    public final b0 b(Long l10, Long l11, Boolean bool) {
        return new b0(this.f4087a, this.f4088b, this.f4089c, this.f4090d, this.f4091e, this.f, this.f4092g, this.f4093h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
