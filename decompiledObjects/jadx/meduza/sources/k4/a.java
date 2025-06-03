package k4;

import java.util.ArrayList;
import java.util.Arrays;
import v5.u;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f8931a;

    /* renamed from: k4.a$a, reason: collision with other inner class name */
    public static final class C0127a extends a {

        /* renamed from: b, reason: collision with root package name */
        public final long f8932b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f8933c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f8934d;

        public C0127a(int i10, long j10) {
            super(i10);
            this.f8932b = j10;
            this.f8933c = new ArrayList();
            this.f8934d = new ArrayList();
        }

        public final C0127a b(int i10) {
            int size = this.f8934d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0127a c0127a = (C0127a) this.f8934d.get(i11);
                if (c0127a.f8931a == i10) {
                    return c0127a;
                }
            }
            return null;
        }

        public final b c(int i10) {
            int size = this.f8933c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) this.f8933c.get(i11);
                if (bVar.f8931a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // k4.a
        public final String toString() {
            return a.a(this.f8931a) + " leaves: " + Arrays.toString(this.f8933c.toArray()) + " containers: " + Arrays.toString(this.f8934d.toArray());
        }
    }

    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public final u f8935b;

        public b(int i10, u uVar) {
            super(i10);
            this.f8935b = uVar;
        }
    }

    public a(int i10) {
        this.f8931a = i10;
    }

    public static String a(int i10) {
        StringBuilder l10 = defpackage.f.l("");
        l10.append((char) ((i10 >> 24) & 255));
        l10.append((char) ((i10 >> 16) & 255));
        l10.append((char) ((i10 >> 8) & 255));
        l10.append((char) (i10 & 255));
        return l10.toString();
    }

    public String toString() {
        return a(this.f8931a);
    }
}
