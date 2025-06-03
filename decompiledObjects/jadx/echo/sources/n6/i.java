package n6;

import g6.l;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    public final b f18068a;

    /* renamed from: b, reason: collision with root package name */
    public final l f18069b;

    public static final class a implements Iterator, h6.a {

        /* renamed from: o, reason: collision with root package name */
        public final Iterator f18070o;

        public a() {
            this.f18070o = i.this.f18068a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f18070o.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return i.this.f18069b.invoke(this.f18070o.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public i(b sequence, l transformer) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        this.f18068a = sequence;
        this.f18069b = transformer;
    }

    @Override // n6.b
    public Iterator iterator() {
        return new a();
    }
}
