package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class c0 implements M {

    /* renamed from: a, reason: collision with root package name */
    public final O f8944a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8945b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f8946c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8947d;

    public c0(O o7, String str, Object[] objArr) {
        char charAt;
        this.f8944a = o7;
        this.f8945b = str;
        this.f8946c = objArr;
        int charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            int i7 = charAt2 & 8191;
            int i8 = 13;
            int i9 = 1;
            while (true) {
                int i10 = i9 + 1;
                charAt = str.charAt(i9);
                if (charAt < 55296) {
                    break;
                }
                i7 |= (charAt & 8191) << i8;
                i8 += 13;
                i9 = i10;
            }
            charAt2 = i7 | (charAt << i8);
        }
        this.f8947d = charAt2;
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public boolean a() {
        return (this.f8947d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public Z b() {
        return (this.f8947d & 1) == 1 ? Z.PROTO2 : Z.PROTO3;
    }

    @Override // androidx.datastore.preferences.protobuf.M
    public O c() {
        return this.f8944a;
    }

    public Object[] d() {
        return this.f8946c;
    }

    public String e() {
        return this.f8945b;
    }
}
