package o7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b0 {

    public static final class a<T> extends o7.a<T> {

        /* renamed from: e, reason: collision with root package name */
        public static final a f11940e = new a(new Object[0]);

        /* renamed from: c, reason: collision with root package name */
        public final T[] f11941c;

        /* renamed from: d, reason: collision with root package name */
        public final int f11942d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object[] objArr) {
            super(0, 0);
            this.f11941c = objArr;
            this.f11942d = 0;
        }

        @Override // o7.a
        public final T b(int i10) {
            return this.f11941c[this.f11942d + i10];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b implements Iterator<Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f11943a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ b[] f11944b;

        static {
            b bVar = new b();
            f11943a = bVar;
            f11944b = new b[]{bVar};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f11944b.clone();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public final Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            x6.b.I(false, "no calls to next() since the last call to remove()");
        }
    }

    public static Object a(Iterator it, String str) {
        return it.hasNext() ? it.next() : str;
    }
}
