package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements n6.b {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f16246a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16247b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16248c;

    /* renamed from: d, reason: collision with root package name */
    public final g6.p f16249d;

    public static final class a implements Iterator, h6.a {

        /* renamed from: o, reason: collision with root package name */
        public int f16250o = -1;

        /* renamed from: p, reason: collision with root package name */
        public int f16251p;

        /* renamed from: q, reason: collision with root package name */
        public int f16252q;

        /* renamed from: r, reason: collision with root package name */
        public l6.c f16253r;

        /* renamed from: s, reason: collision with root package name */
        public int f16254s;

        public a() {
            int d7;
            d7 = l6.f.d(c.this.f16247b, 0, c.this.f16246a.length());
            this.f16251p = d7;
            this.f16252q = d7;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 < r6.f16255t.f16248c) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b() {
            /*
                r6 = this;
                int r0 = r6.f16252q
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f16250o = r1
                r0 = 0
                r6.f16253r = r0
                goto L99
            Lc:
                kotlin.text.c r0 = kotlin.text.c.this
                int r0 = kotlin.text.c.c(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f16254s
                int r0 = r0 + r3
                r6.f16254s = r0
                kotlin.text.c r4 = kotlin.text.c.this
                int r4 = kotlin.text.c.c(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f16252q
                kotlin.text.c r4 = kotlin.text.c.this
                java.lang.CharSequence r4 = kotlin.text.c.b(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                l6.c r0 = new l6.c
                int r1 = r6.f16251p
                kotlin.text.c r4 = kotlin.text.c.this
                java.lang.CharSequence r4 = kotlin.text.c.b(r4)
                int r4 = kotlin.text.s.x(r4)
                r0.<init>(r1, r4)
            L42:
                r6.f16253r = r0
            L44:
                r6.f16252q = r2
                goto L97
            L47:
                kotlin.text.c r0 = kotlin.text.c.this
                g6.p r0 = kotlin.text.c.a(r0)
                kotlin.text.c r4 = kotlin.text.c.this
                java.lang.CharSequence r4 = kotlin.text.c.b(r4)
                int r5 = r6.f16252q
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                V5.m r0 = (V5.m) r0
                if (r0 != 0) goto L73
                l6.c r0 = new l6.c
                int r1 = r6.f16251p
                kotlin.text.c r4 = kotlin.text.c.this
                java.lang.CharSequence r4 = kotlin.text.c.b(r4)
                int r4 = kotlin.text.s.x(r4)
                r0.<init>(r1, r4)
                goto L42
            L73:
                java.lang.Object r2 = r0.a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f16251p
                l6.c r4 = l6.d.g(r4, r2)
                r6.f16253r = r4
                int r2 = r2 + r0
                r6.f16251p = r2
                if (r0 != 0) goto L95
                r1 = r3
            L95:
                int r2 = r2 + r1
                goto L44
            L97:
                r6.f16250o = r3
            L99:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.c.a.b():void");
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public l6.c next() {
            if (this.f16250o == -1) {
                b();
            }
            if (this.f16250o == 0) {
                throw new NoSuchElementException();
            }
            l6.c cVar = this.f16253r;
            Intrinsics.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f16253r = null;
            this.f16250o = -1;
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f16250o == -1) {
                b();
            }
            return this.f16250o == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(CharSequence input, int i7, int i8, g6.p getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.f16246a = input;
        this.f16247b = i7;
        this.f16248c = i8;
        this.f16249d = getNextMatch;
    }

    @Override // n6.b
    public Iterator iterator() {
        return new a();
    }
}
