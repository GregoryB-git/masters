package ma;

/* loaded from: classes.dex */
public final class f1 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f10954a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10955b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f10956c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10957d;

    public f1(w wVar, String str, Object[] objArr) {
        char charAt;
        this.f10954a = wVar;
        this.f10955b = str;
        this.f10956c = objArr;
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
        this.f10957d = charAt2;
    }

    @Override // ma.q0
    public final boolean a() {
        return (this.f10957d & 2) == 2;
    }

    @Override // ma.q0
    public final s0 b() {
        return this.f10954a;
    }

    @Override // ma.q0
    public final int c() {
        int i10 = this.f10957d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }

    public final Object[] d() {
        return this.f10956c;
    }

    public final String e() {
        return this.f10955b;
    }
}
