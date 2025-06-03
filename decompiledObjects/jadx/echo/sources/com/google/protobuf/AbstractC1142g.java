package com.google.protobuf;

/* renamed from: com.google.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1142g {

    /* renamed from: d, reason: collision with root package name */
    public static volatile int f12058d = 100;

    /* renamed from: a, reason: collision with root package name */
    public int f12059a;

    /* renamed from: b, reason: collision with root package name */
    public int f12060b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12061c;

    /* renamed from: com.google.protobuf.g$b */
    public static final class b extends AbstractC1142g {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f12062e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f12063f;

        /* renamed from: g, reason: collision with root package name */
        public int f12064g;

        /* renamed from: h, reason: collision with root package name */
        public int f12065h;

        /* renamed from: i, reason: collision with root package name */
        public int f12066i;

        /* renamed from: j, reason: collision with root package name */
        public int f12067j;

        /* renamed from: k, reason: collision with root package name */
        public int f12068k;

        public b(byte[] bArr, int i7, int i8, boolean z7) {
            super();
            this.f12068k = Integer.MAX_VALUE;
            this.f12062e = bArr;
            this.f12064g = i8 + i7;
            this.f12066i = i7;
            this.f12067j = i7;
            this.f12063f = z7;
        }

        public int d() {
            return this.f12066i - this.f12067j;
        }

        public int e(int i7) {
            if (i7 < 0) {
                throw C1156v.b();
            }
            int d7 = i7 + d();
            if (d7 < 0) {
                throw C1156v.c();
            }
            int i8 = this.f12068k;
            if (d7 > i8) {
                throw C1156v.d();
            }
            this.f12068k = d7;
            f();
            return i8;
        }

        public final void f() {
            int i7 = this.f12064g + this.f12065h;
            this.f12064g = i7;
            int i8 = i7 - this.f12067j;
            int i9 = this.f12068k;
            if (i8 <= i9) {
                this.f12065h = 0;
                return;
            }
            int i10 = i8 - i9;
            this.f12065h = i10;
            this.f12064g = i7 - i10;
        }
    }

    public AbstractC1142g() {
        this.f12059a = f12058d;
        this.f12060b = Integer.MAX_VALUE;
        this.f12061c = false;
    }

    public static AbstractC1142g a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static AbstractC1142g b(byte[] bArr, int i7, int i8) {
        return c(bArr, i7, i8, false);
    }

    public static AbstractC1142g c(byte[] bArr, int i7, int i8, boolean z7) {
        b bVar = new b(bArr, i7, i8, z7);
        try {
            bVar.e(i8);
            return bVar;
        } catch (C1156v e7) {
            throw new IllegalArgumentException(e7);
        }
    }
}
