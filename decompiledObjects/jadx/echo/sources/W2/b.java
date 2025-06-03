package W2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class b implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public EnumC0114b f6808o = EnumC0114b.NOT_READY;

    /* renamed from: p, reason: collision with root package name */
    public Object f6809p;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6810a;

        static {
            int[] iArr = new int[EnumC0114b.values().length];
            f6810a = iArr;
            try {
                iArr[EnumC0114b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6810a[EnumC0114b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: W2.b$b, reason: collision with other inner class name */
    public enum EnumC0114b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract Object b();

    public final Object d() {
        this.f6808o = EnumC0114b.DONE;
        return null;
    }

    public final boolean e() {
        this.f6808o = EnumC0114b.FAILED;
        this.f6809p = b();
        if (this.f6808o == EnumC0114b.DONE) {
            return false;
        }
        this.f6808o = EnumC0114b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m.o(this.f6808o != EnumC0114b.FAILED);
        int i7 = a.f6810a[this.f6808o.ordinal()];
        if (i7 == 1) {
            return false;
        }
        if (i7 != 2) {
            return e();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f6808o = EnumC0114b.NOT_READY;
        Object a7 = j.a(this.f6809p);
        this.f6809p = null;
        return a7;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
