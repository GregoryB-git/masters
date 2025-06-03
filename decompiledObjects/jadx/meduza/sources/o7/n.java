package o7;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final a f12025a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final b f12026b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    public static final b f12027c = new b(1);

    public class a extends n {
        public static n f(int i10) {
            return i10 < 0 ? n.f12026b : i10 > 0 ? n.f12027c : n.f12025a;
        }

        @Override // o7.n
        public final n a(int i10, int i11) {
            return f(i10 < i11 ? -1 : i10 > i11 ? 1 : 0);
        }

        @Override // o7.n
        public final <T> n b(T t, T t10, Comparator<T> comparator) {
            return f(comparator.compare(t, t10));
        }

        @Override // o7.n
        public final n c(boolean z10, boolean z11) {
            return f(z10 == z11 ? 0 : z10 ? 1 : -1);
        }

        @Override // o7.n
        public final n d(boolean z10, boolean z11) {
            return f(z11 == z10 ? 0 : z11 ? 1 : -1);
        }

        @Override // o7.n
        public final int e() {
            return 0;
        }
    }

    public static final class b extends n {

        /* renamed from: d, reason: collision with root package name */
        public final int f12028d;

        public b(int i10) {
            this.f12028d = i10;
        }

        @Override // o7.n
        public final n a(int i10, int i11) {
            return this;
        }

        @Override // o7.n
        public final <T> n b(T t, T t10, Comparator<T> comparator) {
            return this;
        }

        @Override // o7.n
        public final n c(boolean z10, boolean z11) {
            return this;
        }

        @Override // o7.n
        public final n d(boolean z10, boolean z11) {
            return this;
        }

        @Override // o7.n
        public final int e() {
            return this.f12028d;
        }
    }

    public abstract n a(int i10, int i11);

    public abstract <T> n b(T t, T t10, Comparator<T> comparator);

    public abstract n c(boolean z10, boolean z11);

    public abstract n d(boolean z10, boolean z11);

    public abstract int e();
}
