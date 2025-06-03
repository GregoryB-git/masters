package s0;

/* loaded from: classes.dex */
public final class a1 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final o0 f13942a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13943b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f13944c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13945d;

    public a1(v vVar, String str, Object[] objArr) {
        char charAt;
        this.f13942a = vVar;
        this.f13943b = str;
        this.f13944c = objArr;
        int charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            int i10 = charAt2 & 8191;
            int i11 = 1;
            int i12 = 13;
            while (true) {
                int i13 = i11 + 1;
                charAt = str.charAt(i11);
                if (charAt < 55296) {
                    break;
                }
                i10 |= (charAt & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
            charAt2 = i10 | (charAt << i12);
        }
        this.f13945d = charAt2;
    }

    @Override // s0.m0
    public final boolean a() {
        return (this.f13945d & 2) == 2;
    }

    @Override // s0.m0
    public final o0 b() {
        return this.f13942a;
    }

    @Override // s0.m0
    public final int c() {
        return (this.f13945d & 1) == 1 ? 1 : 2;
    }

    public final Object[] d() {
        return this.f13944c;
    }

    public final String e() {
        return this.f13943b;
    }
}
