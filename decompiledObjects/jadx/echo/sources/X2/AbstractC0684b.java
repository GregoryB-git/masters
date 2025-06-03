package X2;

import java.util.NoSuchElementException;

/* renamed from: X2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0684b extends g0 {

    /* renamed from: o, reason: collision with root package name */
    public EnumC0124b f7103o = EnumC0124b.NOT_READY;

    /* renamed from: p, reason: collision with root package name */
    public Object f7104p;

    /* renamed from: X2.b$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7105a;

        static {
            int[] iArr = new int[EnumC0124b.values().length];
            f7105a = iArr;
            try {
                iArr[EnumC0124b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7105a[EnumC0124b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: X2.b$b, reason: collision with other inner class name */
    public enum EnumC0124b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract Object b();

    public final Object d() {
        this.f7103o = EnumC0124b.DONE;
        return null;
    }

    public final boolean e() {
        this.f7103o = EnumC0124b.FAILED;
        this.f7104p = b();
        if (this.f7103o == EnumC0124b.DONE) {
            return false;
        }
        this.f7103o = EnumC0124b.READY;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        W2.m.o(this.f7103o != EnumC0124b.FAILED);
        int i7 = a.f7105a[this.f7103o.ordinal()];
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
        this.f7103o = EnumC0124b.NOT_READY;
        Object a7 = N.a(this.f7104p);
        this.f7104p = null;
        return a7;
    }
}
