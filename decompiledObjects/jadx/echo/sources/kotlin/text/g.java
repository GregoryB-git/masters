package kotlin.text;

import W5.AbstractC0671a;
import W5.w;
import java.util.Iterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Matcher f16258a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f16259b;

    /* renamed from: c, reason: collision with root package name */
    public final e f16260c;

    public static final class a extends AbstractC0671a implements e {

        /* renamed from: kotlin.text.g$a$a, reason: collision with other inner class name */
        public static final class C0230a extends kotlin.jvm.internal.l implements g6.l {
            public C0230a() {
                super(1);
            }

            public final d a(int i7) {
                return a.this.get(i7);
            }

            @Override // g6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        public a() {
        }

        @Override // W5.AbstractC0671a
        public int a() {
            return g.this.c().groupCount() + 1;
        }

        @Override // W5.AbstractC0671a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null || (obj instanceof d)) {
                return d((d) obj);
            }
            return false;
        }

        public /* bridge */ boolean d(d dVar) {
            return super.contains(dVar);
        }

        @Override // kotlin.text.e
        public d get(int i7) {
            l6.c d7;
            d7 = h.d(g.this.c(), i7);
            if (d7.q().intValue() < 0) {
                return null;
            }
            String group = g.this.c().group(i7);
            Intrinsics.checkNotNullExpressionValue(group, "group(...)");
            return new d(group, d7);
        }

        @Override // W5.AbstractC0671a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            l6.c g7;
            n6.b n7;
            n6.b d7;
            g7 = W5.o.g(this);
            n7 = w.n(g7);
            d7 = n6.h.d(n7, new C0230a());
            return d7.iterator();
        }
    }

    public g(Matcher matcher, CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f16258a = matcher;
        this.f16259b = input;
        this.f16260c = new a();
    }

    @Override // kotlin.text.f
    public e a() {
        return this.f16260c;
    }

    public final MatchResult c() {
        return this.f16258a;
    }
}
