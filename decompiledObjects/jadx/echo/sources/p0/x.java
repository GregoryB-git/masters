package p0;

import android.os.Looper;
import d0.C1194q;
import l0.y1;
import p0.InterfaceC1782n;
import p0.v;

/* loaded from: classes.dex */
public interface x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f18348a = new a();

    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f18349a = new b() { // from class: p0.y
            @Override // p0.x.b
            public final void release() {
                z.a();
            }
        };

        void release();
    }

    void a(Looper looper, y1 y1Var);

    int b(C1194q c1194q);

    InterfaceC1782n c(v.a aVar, C1194q c1194q);

    b d(v.a aVar, C1194q c1194q);

    void g();

    void release();

    public class a implements x {
        @Override // p0.x
        public int b(C1194q c1194q) {
            return c1194q.f12730r != null ? 1 : 0;
        }

        @Override // p0.x
        public InterfaceC1782n c(v.a aVar, C1194q c1194q) {
            if (c1194q.f12730r == null) {
                return null;
            }
            return new D(new InterfaceC1782n.a(new T(1), 6001));
        }

        @Override // p0.x
        public /* synthetic */ b d(v.a aVar, C1194q c1194q) {
            return w.a(this, aVar, c1194q);
        }

        @Override // p0.x
        public /* synthetic */ void g() {
            w.b(this);
        }

        @Override // p0.x
        public /* synthetic */ void release() {
            w.c(this);
        }

        @Override // p0.x
        public void a(Looper looper, y1 y1Var) {
        }
    }
}
