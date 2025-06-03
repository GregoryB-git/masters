package lc;

import dc.p;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements kc.b<ic.f> {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f9830a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9831b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9832c;

    /* renamed from: d, reason: collision with root package name */
    public final p<CharSequence, Integer, rb.d<Integer, Integer>> f9833d;

    public static final class a implements Iterator<ic.f> {

        /* renamed from: a, reason: collision with root package name */
        public int f9834a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f9835b;

        /* renamed from: c, reason: collision with root package name */
        public int f9836c;

        /* renamed from: d, reason: collision with root package name */
        public ic.f f9837d;

        /* renamed from: e, reason: collision with root package name */
        public int f9838e;

        public a() {
            int i10 = b.this.f9831b;
            int length = b.this.f9830a.length();
            if (length >= 0) {
                if (i10 < 0) {
                    i10 = 0;
                } else if (i10 > length) {
                    i10 = length;
                }
                this.f9835b = i10;
                this.f9836c = i10;
                return;
            }
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        
            if (r6 < r3) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r7 = this;
                int r0 = r7.f9836c
                r1 = 0
                if (r0 >= 0) goto Lc
                r7.f9834a = r1
                r0 = 0
                r7.f9837d = r0
                goto L7e
            Lc:
                lc.b r2 = lc.b.this
                int r3 = r2.f9832c
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L1b
                int r6 = r7.f9838e
                int r6 = r6 + r5
                r7.f9838e = r6
                if (r6 >= r3) goto L23
            L1b:
                java.lang.CharSequence r2 = r2.f9830a
                int r2 = r2.length()
                if (r0 <= r2) goto L37
            L23:
                ic.f r0 = new ic.f
                int r1 = r7.f9835b
                lc.b r2 = lc.b.this
                java.lang.CharSequence r2 = r2.f9830a
                int r2 = lc.k.p0(r2)
                r0.<init>(r1, r2)
            L32:
                r7.f9837d = r0
                r7.f9836c = r4
                goto L7c
            L37:
                lc.b r0 = lc.b.this
                dc.p<java.lang.CharSequence, java.lang.Integer, rb.d<java.lang.Integer, java.lang.Integer>> r2 = r0.f9833d
                java.lang.CharSequence r0 = r0.f9830a
                int r3 = r7.f9836c
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r2.invoke(r0, r3)
                rb.d r0 = (rb.d) r0
                if (r0 != 0) goto L5b
                ic.f r0 = new ic.f
                int r1 = r7.f9835b
                lc.b r2 = lc.b.this
                java.lang.CharSequence r2 = r2.f9830a
                int r2 = lc.k.p0(r2)
                r0.<init>(r1, r2)
                goto L32
            L5b:
                A r2 = r0.f13844a
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f13845b
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f9835b
                ic.f r3 = ic.g.O(r3, r2)
                r7.f9837d = r3
                int r2 = r2 + r0
                r7.f9835b = r2
                if (r0 != 0) goto L79
                r1 = r5
            L79:
                int r2 = r2 + r1
                r7.f9836c = r2
            L7c:
                r7.f9834a = r5
            L7e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lc.b.a.a():void");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f9834a == -1) {
                a();
            }
            return this.f9834a == 1;
        }

        @Override // java.util.Iterator
        public final ic.f next() {
            if (this.f9834a == -1) {
                a();
            }
            if (this.f9834a == 0) {
                throw new NoSuchElementException();
            }
            ic.f fVar = this.f9837d;
            ec.i.c(fVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f9837d = null;
            this.f9834a = -1;
            return fVar;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(CharSequence charSequence, int i10, int i11, p<? super CharSequence, ? super Integer, rb.d<Integer, Integer>> pVar) {
        ec.i.e(charSequence, "input");
        this.f9830a = charSequence;
        this.f9831b = i10;
        this.f9832c = i11;
        this.f9833d = pVar;
    }

    @Override // kc.b
    public final Iterator<ic.f> iterator() {
        return new a();
    }
}
