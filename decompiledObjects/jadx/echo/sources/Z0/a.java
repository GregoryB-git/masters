package Z0;

import g0.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f7633a;

    /* renamed from: Z0.a$a, reason: collision with other inner class name */
    public static final class C0134a extends a {

        /* renamed from: b, reason: collision with root package name */
        public final long f7634b;

        /* renamed from: c, reason: collision with root package name */
        public final List f7635c;

        /* renamed from: d, reason: collision with root package name */
        public final List f7636d;

        public C0134a(int i7, long j7) {
            super(i7);
            this.f7634b = j7;
            this.f7635c = new ArrayList();
            this.f7636d = new ArrayList();
        }

        public void d(C0134a c0134a) {
            this.f7636d.add(c0134a);
        }

        public void e(b bVar) {
            this.f7635c.add(bVar);
        }

        public C0134a f(int i7) {
            int size = this.f7636d.size();
            for (int i8 = 0; i8 < size; i8++) {
                C0134a c0134a = (C0134a) this.f7636d.get(i8);
                if (c0134a.f7633a == i7) {
                    return c0134a;
                }
            }
            return null;
        }

        public b g(int i7) {
            int size = this.f7635c.size();
            for (int i8 = 0; i8 < size; i8++) {
                b bVar = (b) this.f7635c.get(i8);
                if (bVar.f7633a == i7) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // Z0.a
        public String toString() {
            return a.a(this.f7633a) + " leaves: " + Arrays.toString(this.f7635c.toArray()) + " containers: " + Arrays.toString(this.f7636d.toArray());
        }
    }

    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public final z f7637b;

        public b(int i7, z zVar) {
            super(i7);
            this.f7637b = zVar;
        }
    }

    public a(int i7) {
        this.f7633a = i7;
    }

    public static String a(int i7) {
        return "" + ((char) ((i7 >> 24) & 255)) + ((char) ((i7 >> 16) & 255)) + ((char) ((i7 >> 8) & 255)) + ((char) (i7 & 255));
    }

    public static int b(int i7) {
        return i7 & 16777215;
    }

    public static int c(int i7) {
        return (i7 >> 24) & 255;
    }

    public String toString() {
        return a(this.f7633a);
    }
}
