package g;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static v f5664d;

    /* renamed from: a, reason: collision with root package name */
    public long f5665a;

    /* renamed from: b, reason: collision with root package name */
    public long f5666b;

    /* renamed from: c, reason: collision with root package name */
    public int f5667c;

    public final void a(long j10, double d10, double d11) {
        double d12 = (0.01720197f * ((j10 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d12) * 0.0053d) + Math.round((r3 - 9.0E-4f) - r9) + 9.0E-4f + ((-d11) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d13 = 0.01745329238474369d * d10;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d13))) / (Math.cos(asin) * Math.cos(d13));
        if (sin3 >= 1.0d) {
            this.f5667c = 1;
        } else {
            if (sin3 > -1.0d) {
                double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
                this.f5665a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
                long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
                this.f5666b = round;
                if (round >= j10 || this.f5665a <= j10) {
                    this.f5667c = 1;
                    return;
                } else {
                    this.f5667c = 0;
                    return;
                }
            }
            this.f5667c = 0;
        }
        this.f5665a = -1L;
        this.f5666b = -1L;
    }
}
