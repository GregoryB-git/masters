package X2;

import X2.Y;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0705x extends AbstractC0689g implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: r, reason: collision with root package name */
    public final transient AbstractC0704w f7210r;

    /* renamed from: s, reason: collision with root package name */
    public final transient int f7211s;

    /* renamed from: X2.x$a */
    public class a extends g0 {

        /* renamed from: o, reason: collision with root package name */
        public Iterator f7212o;

        /* renamed from: p, reason: collision with root package name */
        public Iterator f7213p = C.f();

        public a() {
            this.f7212o = AbstractC0705x.this.f7210r.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7213p.hasNext() || this.f7212o.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f7213p.hasNext()) {
                this.f7213p = ((AbstractC0701t) this.f7212o.next()).iterator();
            }
            return this.f7213p.next();
        }
    }

    /* renamed from: X2.x$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Map f7215a = Q.c();

        /* renamed from: b, reason: collision with root package name */
        public Comparator f7216b;

        /* renamed from: c, reason: collision with root package name */
        public Comparator f7217c;
    }

    /* renamed from: X2.x$c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public static final Y.b f7218a = Y.a(AbstractC0705x.class, "map");

        /* renamed from: b, reason: collision with root package name */
        public static final Y.b f7219b = Y.a(AbstractC0705x.class, "size");
    }

    /* renamed from: X2.x$d */
    public static final class d extends AbstractC0701t {
        private static final long serialVersionUID = 0;

        /* renamed from: p, reason: collision with root package name */
        public final transient AbstractC0705x f7220p;

        public d(AbstractC0705x abstractC0705x) {
            this.f7220p = abstractC0705x;
        }

        @Override // X2.AbstractC0701t, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f7220p.b(obj);
        }

        @Override // X2.AbstractC0701t
        public int d(Object[] objArr, int i7) {
            g0 it = this.f7220p.f7210r.values().iterator();
            while (it.hasNext()) {
                i7 = ((AbstractC0701t) it.next()).d(objArr, i7);
            }
            return i7;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: q */
        public g0 iterator() {
            return this.f7220p.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f7220p.size();
        }

        @Override // X2.AbstractC0701t
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public AbstractC0705x(AbstractC0704w abstractC0704w, int i7) {
        this.f7210r = abstractC0704w;
        this.f7211s = i7;
    }

    @Override // X2.AbstractC0688f
    public boolean b(Object obj) {
        return obj != null && super.b(obj);
    }

    @Override // X2.AbstractC0688f
    public Map c() {
        throw new AssertionError("should never be called");
    }

    @Override // X2.H
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // X2.AbstractC0688f
    public Set d() {
        throw new AssertionError("unreachable");
    }

    @Override // X2.AbstractC0688f
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // X2.AbstractC0688f, X2.H
    /* renamed from: h */
    public AbstractC0704w a() {
        return this.f7210r;
    }

    @Override // X2.AbstractC0688f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // X2.AbstractC0688f
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public AbstractC0701t e() {
        return new d(this);
    }

    @Override // X2.AbstractC0688f
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public g0 g() {
        return new a();
    }

    @Override // X2.AbstractC0688f, X2.H
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC0701t values() {
        return (AbstractC0701t) super.values();
    }

    @Override // X2.H
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // X2.H
    public int size() {
        return this.f7211s;
    }

    @Override // X2.AbstractC0688f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
