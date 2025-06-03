package c4;

import java.util.Arrays;
import v3.i0;

/* loaded from: classes.dex */
public interface v {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f2321a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f2322b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2323c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2324d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f2321a = i10;
            this.f2322b = bArr;
            this.f2323c = i11;
            this.f2324d = i12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f2321a == aVar.f2321a && this.f2323c == aVar.f2323c && this.f2324d == aVar.f2324d && Arrays.equals(this.f2322b, aVar.f2322b);
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f2322b) + (this.f2321a * 31)) * 31) + this.f2323c) * 31) + this.f2324d;
        }
    }

    void a(int i10, v5.u uVar);

    void b(int i10, v5.u uVar);

    void c(long j10, int i10, int i11, int i12, a aVar);

    void d(i0 i0Var);

    int e(t5.h hVar, int i10, boolean z10);
}
