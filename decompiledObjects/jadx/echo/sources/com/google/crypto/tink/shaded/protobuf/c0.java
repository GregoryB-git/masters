package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public final class c0 implements M {

    /* renamed from: a, reason: collision with root package name */
    public final O f11322a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11323b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f11324c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11325d;

    public c0(O o7, String str, Object[] objArr) {
        char charAt;
        this.f11322a = o7;
        this.f11323b = str;
        this.f11324c = objArr;
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
        this.f11325d = charAt2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public boolean a() {
        return (this.f11325d & 2) == 2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public Z b() {
        return (this.f11325d & 1) == 1 ? Z.PROTO2 : Z.PROTO3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.M
    public O c() {
        return this.f11322a;
    }

    public Object[] d() {
        return this.f11324c;
    }

    public String e() {
        return this.f11323b;
    }
}
