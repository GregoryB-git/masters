package B0;

import g0.AbstractC1297a;
import java.io.IOException;
import x0.C2139u;

/* loaded from: classes.dex */
public interface m {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f621a;

        /* renamed from: b, reason: collision with root package name */
        public final int f622b;

        /* renamed from: c, reason: collision with root package name */
        public final int f623c;

        /* renamed from: d, reason: collision with root package name */
        public final int f624d;

        public a(int i7, int i8, int i9, int i10) {
            this.f621a = i7;
            this.f622b = i8;
            this.f623c = i9;
            this.f624d = i10;
        }

        public boolean a(int i7) {
            if (i7 == 1) {
                if (this.f621a - this.f622b <= 1) {
                    return false;
                }
            } else if (this.f623c - this.f624d <= 1) {
                return false;
            }
            return true;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f625a;

        /* renamed from: b, reason: collision with root package name */
        public final long f626b;

        public b(int i7, long j7) {
            AbstractC1297a.a(j7 >= 0);
            this.f625a = i7;
            this.f626b = j7;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final x0.r f627a;

        /* renamed from: b, reason: collision with root package name */
        public final C2139u f628b;

        /* renamed from: c, reason: collision with root package name */
        public final IOException f629c;

        /* renamed from: d, reason: collision with root package name */
        public final int f630d;

        public c(x0.r rVar, C2139u c2139u, IOException iOException, int i7) {
            this.f627a = rVar;
            this.f628b = c2139u;
            this.f629c = iOException;
            this.f630d = i7;
        }
    }

    void a(long j7);

    b b(a aVar, c cVar);

    long c(c cVar);

    int d(int i7);
}
