package com.google.protobuf;

/* loaded from: classes.dex */
public final class Y implements I {

    /* renamed from: a, reason: collision with root package name */
    public final K f12012a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12013b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f12014c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12015d;

    public Y(K k7, String str, Object[] objArr) {
        char charAt;
        this.f12012a = k7;
        this.f12013b = str;
        this.f12014c = objArr;
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
        this.f12015d = charAt2;
    }

    @Override // com.google.protobuf.I
    public boolean a() {
        return (this.f12015d & 2) == 2;
    }

    @Override // com.google.protobuf.I
    public V b() {
        return (this.f12015d & 1) == 1 ? V.PROTO2 : V.PROTO3;
    }

    @Override // com.google.protobuf.I
    public K c() {
        return this.f12012a;
    }

    public Object[] d() {
        return this.f12014c;
    }

    public String e() {
        return this.f12013b;
    }
}
