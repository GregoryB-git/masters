package Y;

import androidx.lifecycle.h;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import t.i;

/* loaded from: classes.dex */
public class b extends Y.a {

    /* renamed from: a, reason: collision with root package name */
    public final h f7294a;

    /* renamed from: b, reason: collision with root package name */
    public final a f7295b;

    public static class a extends r {

        /* renamed from: e, reason: collision with root package name */
        public static final s.a f7296e = new C0131a();

        /* renamed from: c, reason: collision with root package name */
        public i f7297c = new i();

        /* renamed from: d, reason: collision with root package name */
        public boolean f7298d = false;

        /* renamed from: Y.b$a$a, reason: collision with other inner class name */
        public static class C0131a implements s.a {
            @Override // androidx.lifecycle.s.a
            public r a(Class cls) {
                return new a();
            }
        }

        public static a f(t tVar) {
            return (a) new s(tVar, f7296e).a(a.class);
        }

        @Override // androidx.lifecycle.r
        public void d() {
            super.d();
            if (this.f7297c.o() <= 0) {
                this.f7297c.b();
            } else {
                android.support.v4.media.a.a(this.f7297c.p(0));
                throw null;
            }
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f7297c.o() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                if (this.f7297c.o() <= 0) {
                    return;
                }
                android.support.v4.media.a.a(this.f7297c.p(0));
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f7297c.l(0));
                printWriter.print(": ");
                throw null;
            }
        }

        public void g() {
            if (this.f7297c.o() <= 0) {
                return;
            }
            android.support.v4.media.a.a(this.f7297c.p(0));
            throw null;
        }
    }

    public b(h hVar, t tVar) {
        this.f7294a = hVar;
        this.f7295b = a.f(tVar);
    }

    @Override // Y.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f7295b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // Y.a
    public void c() {
        this.f7295b.g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        H.b.a(this.f7294a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
