package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class W4 implements G4 {

    /* renamed from: a, reason: collision with root package name */
    public final I4 f10700a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10701b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f10702c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10703d;

    public W4(I4 i42, String str, Object[] objArr) {
        this.f10700a = i42;
        this.f10701b = str;
        this.f10702c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f10703d = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i8 = 13;
        int i9 = 1;
        while (true) {
            int i10 = i9 + 1;
            char charAt2 = str.charAt(i9);
            if (charAt2 < 55296) {
                this.f10703d = i7 | (charAt2 << i8);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i8;
                i8 += 13;
                i9 = i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.G4
    public final I4 a() {
        return this.f10700a;
    }

    @Override // com.google.android.gms.internal.measurement.G4
    public final V4 b() {
        int i7 = this.f10703d;
        return (i7 & 1) != 0 ? V4.PROTO2 : (i7 & 4) == 4 ? V4.EDITIONS : V4.PROTO3;
    }

    @Override // com.google.android.gms.internal.measurement.G4
    public final boolean c() {
        return (this.f10703d & 2) == 2;
    }

    public final String d() {
        return this.f10701b;
    }

    public final Object[] e() {
        return this.f10702c;
    }
}
