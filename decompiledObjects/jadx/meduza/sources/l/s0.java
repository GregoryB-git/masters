package l;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public int f9455a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f9456b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f9457c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f9458d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f9459e = 0;
    public int f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9460g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9461h = false;

    public final void a(int i10, int i11) {
        this.f9457c = i10;
        this.f9458d = i11;
        this.f9461h = true;
        if (this.f9460g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f9455a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f9456b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f9455a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f9456b = i11;
        }
    }
}
