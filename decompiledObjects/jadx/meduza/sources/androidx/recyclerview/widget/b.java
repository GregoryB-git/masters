package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0019b f1298a;

    /* renamed from: b, reason: collision with root package name */
    public final a f1299b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1300c = new ArrayList();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f1301a = 0;

        /* renamed from: b, reason: collision with root package name */
        public a f1302b;

        public final int a(int i10) {
            long j10;
            a aVar = this.f1302b;
            if (aVar == null) {
                if (i10 >= 64) {
                    j10 = this.f1301a;
                    return Long.bitCount(j10);
                }
            } else if (i10 >= 64) {
                return Long.bitCount(this.f1301a) + aVar.a(i10 - 64);
            }
            j10 = this.f1301a & ((1 << i10) - 1);
            return Long.bitCount(j10);
        }

        public final void b() {
            if (this.f1302b == null) {
                this.f1302b = new a();
            }
        }

        public final boolean c(int i10) {
            if (i10 < 64) {
                return (this.f1301a & (1 << i10)) != 0;
            }
            b();
            return this.f1302b.c(i10 - 64);
        }

        public final boolean d(int i10) {
            if (i10 >= 64) {
                b();
                return this.f1302b.d(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f1301a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f1301a = j12;
            long j13 = j10 - 1;
            this.f1301a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f1302b;
            if (aVar != null) {
                if (aVar.c(0)) {
                    f(63);
                }
                this.f1302b.d(0);
            }
            return z10;
        }

        public final void e() {
            this.f1301a = 0L;
            a aVar = this.f1302b;
            if (aVar != null) {
                aVar.e();
            }
        }

        public final void f(int i10) {
            if (i10 < 64) {
                this.f1301a |= 1 << i10;
            } else {
                b();
                this.f1302b.f(i10 - 64);
            }
        }

        public final String toString() {
            if (this.f1302b == null) {
                return Long.toBinaryString(this.f1301a);
            }
            return this.f1302b.toString() + "xx" + Long.toBinaryString(this.f1301a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    public interface InterfaceC0019b {
    }

    public b(k kVar) {
        this.f1298a = kVar;
    }

    public final View a(int i10) {
        return ((k) this.f1298a).f1358a.getChildAt(c(i10));
    }

    public final int b() {
        return ((k) this.f1298a).a() - this.f1300c.size();
    }

    public final int c(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int a10 = ((k) this.f1298a).a();
        int i11 = i10;
        while (i11 < a10) {
            int a11 = i10 - (i11 - this.f1299b.a(i11));
            if (a11 == 0) {
                while (this.f1299b.c(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += a11;
        }
        return -1;
    }

    public final View d(int i10) {
        return ((k) this.f1298a).f1358a.getChildAt(i10);
    }

    public final int e() {
        return ((k) this.f1298a).a();
    }

    public final void f(View view) {
        if (this.f1300c.remove(view)) {
            ((k) this.f1298a).getClass();
            RecyclerView.p(view);
        }
    }

    public final String toString() {
        return this.f1299b.toString() + ", hidden list:" + this.f1300c.size();
    }
}
