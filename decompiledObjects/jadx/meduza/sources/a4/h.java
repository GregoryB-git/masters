package a4;

import a4.e;
import a4.g;
import android.os.Looper;
import v3.i0;
import w3.a0;

/* loaded from: classes.dex */
public interface h {

    /* renamed from: a, reason: collision with root package name */
    public static final a f185a = new a();

    public class a implements h {
        @Override // a4.h
        public final /* synthetic */ void a() {
        }

        @Override // a4.h
        public final /* synthetic */ b b(g.a aVar, i0 i0Var) {
            return b.f186h;
        }

        @Override // a4.h
        public final void c(Looper looper, a0 a0Var) {
        }

        @Override // a4.h
        public final e d(g.a aVar, i0 i0Var) {
            if (i0Var.f15459w == null) {
                return null;
            }
            return new n(new e.a(6001, new y()));
        }

        @Override // a4.h
        public final int e(i0 i0Var) {
            return i0Var.f15459w != null ? 1 : 0;
        }

        @Override // a4.h
        public final /* synthetic */ void release() {
        }
    }

    public interface b {

        /* renamed from: h, reason: collision with root package name */
        public static final e0.e f186h = new e0.e(12);

        void release();
    }

    void a();

    b b(g.a aVar, i0 i0Var);

    void c(Looper looper, a0 a0Var);

    e d(g.a aVar, i0 i0Var);

    int e(i0 i0Var);

    void release();
}
