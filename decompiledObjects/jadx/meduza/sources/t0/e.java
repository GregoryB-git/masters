package t0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<u0.a> f14391d = new ThreadLocal<>();

    /* renamed from: a, reason: collision with root package name */
    public final int f14392a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.emoji2.text.h f14393b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f14394c = 0;

    public e(androidx.emoji2.text.h hVar, int i10) {
        this.f14393b = hVar;
        this.f14392a = i10;
    }

    public final int a(int i10) {
        u0.a c10 = c();
        int a10 = c10.a(16);
        if (a10 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = c10.f14883b;
        int i11 = a10 + c10.f14882a;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
    }

    public final int b() {
        u0.a c10 = c();
        int a10 = c10.a(16);
        if (a10 == 0) {
            return 0;
        }
        int i10 = a10 + c10.f14882a;
        return c10.f14883b.getInt(c10.f14883b.getInt(i10) + i10);
    }

    public final u0.a c() {
        short s10;
        ThreadLocal<u0.a> threadLocal = f14391d;
        u0.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new u0.a();
            threadLocal.set(aVar);
        }
        u0.b bVar = this.f14393b.f1012a;
        int i10 = this.f14392a;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i11 = a10 + bVar.f14882a;
            int i12 = (i10 * 4) + bVar.f14883b.getInt(i11) + i11 + 4;
            int i13 = bVar.f14883b.getInt(i12) + i12;
            ByteBuffer byteBuffer = bVar.f14883b;
            aVar.f14883b = byteBuffer;
            if (byteBuffer != null) {
                aVar.f14882a = i13;
                int i14 = i13 - byteBuffer.getInt(i13);
                aVar.f14884c = i14;
                s10 = aVar.f14883b.getShort(i14);
            } else {
                s10 = 0;
                aVar.f14882a = 0;
                aVar.f14884c = 0;
            }
            aVar.f14885d = s10;
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        u0.a c10 = c();
        int a10 = c10.a(4);
        sb2.append(Integer.toHexString(a10 != 0 ? c10.f14883b.getInt(a10 + c10.f14882a) : 0));
        sb2.append(", codepoints:");
        int b10 = b();
        for (int i10 = 0; i10 < b10; i10++) {
            sb2.append(Integer.toHexString(a(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
