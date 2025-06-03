package X2;

import a3.AbstractC0744a;
import java.util.Comparator;

/* renamed from: X2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0696n {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0696n f7177a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC0696n f7178b = new b(-1);

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC0696n f7179c = new b(1);

    /* renamed from: X2.n$a */
    public class a extends AbstractC0696n {
        public a() {
            super(null);
        }

        @Override // X2.AbstractC0696n
        public AbstractC0696n d(int i7, int i8) {
            return k(a3.f.e(i7, i8));
        }

        @Override // X2.AbstractC0696n
        public AbstractC0696n e(long j7, long j8) {
            return k(a3.h.a(j7, j8));
        }

        @Override // X2.AbstractC0696n
        public AbstractC0696n f(Object obj, Object obj2, Comparator comparator) {
            return k(comparator.compare(obj, obj2));
        }

        @Override // X2.AbstractC0696n
        public AbstractC0696n g(boolean z7, boolean z8) {
            return k(AbstractC0744a.a(z7, z8));
        }

        @Override // X2.AbstractC0696n
        public AbstractC0696n h(boolean z7, boolean z8) {
            return k(AbstractC0744a.a(z8, z7));
        }

        @Override // X2.AbstractC0696n
        public int i() {
            return 0;
        }

        public AbstractC0696n k(int i7) {
            return i7 < 0 ? AbstractC0696n.f7178b : i7 > 0 ? AbstractC0696n.f7179c : AbstractC0696n.f7177a;
        }
    }

    public AbstractC0696n() {
    }

    public /* synthetic */ AbstractC0696n(a aVar) {
        this();
    }

    public static AbstractC0696n j() {
        return f7177a;
    }

    public abstract AbstractC0696n d(int i7, int i8);

    public abstract AbstractC0696n e(long j7, long j8);

    public abstract AbstractC0696n f(Object obj, Object obj2, Comparator comparator);

    public abstract AbstractC0696n g(boolean z7, boolean z8);

    public abstract AbstractC0696n h(boolean z7, boolean z8);

    public abstract int i();

    /* renamed from: X2.n$b */
    public static final class b extends AbstractC0696n {

        /* renamed from: d, reason: collision with root package name */
        public final int f7180d;

        public b(int i7) {
            super(null);
            this.f7180d = i7;
        }

        @Override // X2.AbstractC0696n
        public int i() {
            return this.f7180d;
        }

        @Override // X2.AbstractC0696n
        public AbstractC0696n d(int i7, int i8) {
            return this;
        }

        @Override // X2.AbstractC0696n
        public AbstractC0696n e(long j7, long j8) {
            return this;
        }

        @Override // X2.AbstractC0696n
        public AbstractC0696n g(boolean z7, boolean z8) {
            return this;
        }

        @Override // X2.AbstractC0696n
        public AbstractC0696n h(boolean z7, boolean z8) {
            return this;
        }

        @Override // X2.AbstractC0696n
        public AbstractC0696n f(Object obj, Object obj2, Comparator comparator) {
            return this;
        }
    }
}
