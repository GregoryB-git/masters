package X2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class J {

    public class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f7062a;

        public a(Comparator comparator) {
            this.f7062a = comparator;
        }

        @Override // X2.J.d
        public Map c() {
            return new TreeMap(this.f7062a);
        }
    }

    public static final class b implements W2.s, Serializable {

        /* renamed from: o, reason: collision with root package name */
        public final int f7063o;

        public b(int i7) {
            this.f7063o = AbstractC0691i.b(i7, "expectedValuesPerKey");
        }

        @Override // W2.s
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List get() {
            return new ArrayList(this.f7063o);
        }
    }

    public static abstract class c extends J {
        public c() {
            super(null);
        }

        public abstract D c();
    }

    public static abstract class d {

        public class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f7064a;

            public a(int i7) {
                this.f7064a = i7;
            }

            @Override // X2.J.c
            public D c() {
                return K.b(d.this.c(), new b(this.f7064a));
            }
        }

        public c a() {
            return b(2);
        }

        public c b(int i7) {
            AbstractC0691i.b(i7, "expectedValuesPerKey");
            return new a(i7);
        }

        public abstract Map c();
    }

    public J() {
    }

    public /* synthetic */ J(I i7) {
        this();
    }

    public static d a() {
        return b(P.d());
    }

    public static d b(Comparator comparator) {
        W2.m.j(comparator);
        return new a(comparator);
    }
}
