package m9;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f10839b = new m0();

    /* renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList<AtomicReference<c>> f10840a = new CopyOnWriteArrayList<>();

    public static abstract class a {
        public abstract boolean a();

        public abstract int b();

        public abstract g c();

        public abstract int d();

        public abstract int e();
    }

    public static abstract class b {
        public abstract a a();

        public abstract String b();

        public abstract int c();

        public abstract int d();

        public abstract String e();
    }

    public interface c {
        void a();
    }
}
