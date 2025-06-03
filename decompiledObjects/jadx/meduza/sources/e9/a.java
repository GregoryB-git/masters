package e9;

import com.google.android.gms.tasks.Task;
import eb.t0;
import i9.a0;
import i9.b0;
import i9.f;
import i9.f0;
import i9.g0;
import i9.l1;
import java.nio.ByteBuffer;
import n9.j;
import n9.l;

/* loaded from: classes.dex */
public abstract class a implements p4.b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4846a = 0;

    public abstract void A();

    public abstract void B();

    @Override // p4.b
    public p4.a a(p4.d dVar) {
        ByteBuffer byteBuffer = dVar.f17532c;
        byteBuffer.getClass();
        x6.b.q(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (dVar.n()) {
            return null;
        }
        return i(dVar, byteBuffer);
    }

    public abstract String b();

    public abstract p4.a i(p4.d dVar, ByteBuffer byteBuffer);

    public abstract i9.a j();

    public abstract i9.b k(e eVar);

    public abstract i9.d l();

    public abstract f m(e eVar);

    public abstract a0 n(e eVar, f fVar);

    public abstract b0 o();

    public abstract f0 p();

    public abstract g0 q();

    public abstract l1 r();

    public abstract Task s();

    public abstract void t();

    public abstract boolean u();

    public abstract eb.e v(t0 t0Var, eb.c cVar);

    public abstract void w();

    public abstract Object x(String str, l lVar);

    public abstract void y(String str, Runnable runnable);

    public abstract void z(j jVar);
}
