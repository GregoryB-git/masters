package F0;

import d0.C1194q;
import d0.InterfaceC1186i;
import java.util.Arrays;

/* loaded from: classes.dex */
public interface T {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f1805a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f1806b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1807c;

        /* renamed from: d, reason: collision with root package name */
        public final int f1808d;

        public a(int i7, byte[] bArr, int i8, int i9) {
            this.f1805a = i7;
            this.f1806b = bArr;
            this.f1807c = i8;
            this.f1808d = i9;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f1805a == aVar.f1805a && this.f1807c == aVar.f1807c && this.f1808d == aVar.f1808d && Arrays.equals(this.f1806b, aVar.f1806b);
        }

        public int hashCode() {
            return (((((this.f1805a * 31) + Arrays.hashCode(this.f1806b)) * 31) + this.f1807c) * 31) + this.f1808d;
        }
    }

    void a(g0.z zVar, int i7, int i8);

    void b(long j7, int i7, int i8, int i9, a aVar);

    int c(InterfaceC1186i interfaceC1186i, int i7, boolean z7, int i8);

    void d(C1194q c1194q);

    void e(g0.z zVar, int i7);

    int f(InterfaceC1186i interfaceC1186i, int i7, boolean z7);
}
