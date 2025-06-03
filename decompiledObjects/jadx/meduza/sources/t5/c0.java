package t5;

import java.io.IOException;

/* loaded from: classes.dex */
public interface c0 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f14455a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14456b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14457c;

        /* renamed from: d, reason: collision with root package name */
        public final int f14458d;

        public a(int i10, int i11, int i12, int i13) {
            this.f14455a = i10;
            this.f14456b = i11;
            this.f14457c = i12;
            this.f14458d = i13;
        }

        public final boolean a(int i10) {
            if (i10 == 1) {
                if (this.f14455a - this.f14456b <= 1) {
                    return false;
                }
            } else if (this.f14457c - this.f14458d <= 1) {
                return false;
            }
            return true;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f14459a;

        /* renamed from: b, reason: collision with root package name */
        public final long f14460b;

        public b(int i10, long j10) {
            x6.b.q(j10 >= 0);
            this.f14459a = i10;
            this.f14460b = j10;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final IOException f14461a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14462b;

        public c(IOException iOException, int i10) {
            this.f14461a = iOException;
            this.f14462b = i10;
        }
    }
}
