package j6;

import b6.AbstractC0807b;
import java.io.Serializable;
import kotlin.jvm.internal.g;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: o, reason: collision with root package name */
    public static final a f15482o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final c f15483p = AbstractC0807b.f10012a.b();

    public static final class a extends c implements Serializable {

        /* renamed from: j6.c$a$a, reason: collision with other inner class name */
        public static final class C0224a implements Serializable {

            /* renamed from: o, reason: collision with root package name */
            public static final C0224a f15484o = new C0224a();
            private static final long serialVersionUID = 0;

            private final Object readResolve() {
                return c.f15482o;
            }
        }

        public a() {
        }

        private final Object writeReplace() {
            return C0224a.f15484o;
        }

        @Override // j6.c
        public int b(int i7) {
            return c.f15483p.b(i7);
        }

        @Override // j6.c
        public int c() {
            return c.f15483p.c();
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public abstract int b(int i7);

    public int c() {
        return b(32);
    }
}
