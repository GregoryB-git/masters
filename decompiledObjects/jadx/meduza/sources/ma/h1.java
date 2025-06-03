package ma;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import ma.h;
import ma.i;

/* loaded from: classes.dex */
public final class h1 extends h {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f10969q = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: d, reason: collision with root package name */
    public final int f10970d;

    /* renamed from: e, reason: collision with root package name */
    public final h f10971e;
    public final h f;

    /* renamed from: o, reason: collision with root package name */
    public final int f10972o;

    /* renamed from: p, reason: collision with root package name */
    public final int f10973p;

    public class a extends h.b {

        /* renamed from: a, reason: collision with root package name */
        public final c f10974a;

        /* renamed from: b, reason: collision with root package name */
        public h.f f10975b = a();

        public a(h1 h1Var) {
            this.f10974a = new c(h1Var);
        }

        public final h.a a() {
            if (this.f10974a.hasNext()) {
                return new h.a();
            }
            return null;
        }

        @Override // ma.h.f
        public final byte f() {
            h.f fVar = this.f10975b;
            if (fVar == null) {
                throw new NoSuchElementException();
            }
            byte f = fVar.f();
            if (!this.f10975b.hasNext()) {
                this.f10975b = a();
            }
            return f;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f10975b != null;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayDeque<h> f10976a = new ArrayDeque<>();

        public final void a(h hVar) {
            if (!hVar.q()) {
                if (!(hVar instanceof h1)) {
                    StringBuilder l10 = defpackage.f.l("Has a new type of ByteString been created? Found ");
                    l10.append(hVar.getClass());
                    throw new IllegalArgumentException(l10.toString());
                }
                h1 h1Var = (h1) hVar;
                a(h1Var.f10971e);
                a(h1Var.f);
                return;
            }
            int binarySearch = Arrays.binarySearch(h1.f10969q, hVar.size());
            if (binarySearch < 0) {
                binarySearch = (-(binarySearch + 1)) - 1;
            }
            int C = h1.C(binarySearch + 1);
            if (this.f10976a.isEmpty() || this.f10976a.peek().size() >= C) {
                this.f10976a.push(hVar);
                return;
            }
            int C2 = h1.C(binarySearch);
            h pop = this.f10976a.pop();
            while (!this.f10976a.isEmpty() && this.f10976a.peek().size() < C2) {
                pop = new h1(this.f10976a.pop(), pop);
            }
            h1 h1Var2 = new h1(pop, hVar);
            while (!this.f10976a.isEmpty()) {
                int binarySearch2 = Arrays.binarySearch(h1.f10969q, h1Var2.f10970d);
                if (binarySearch2 < 0) {
                    binarySearch2 = (-(binarySearch2 + 1)) - 1;
                }
                if (this.f10976a.peek().size() >= h1.C(binarySearch2 + 1)) {
                    break;
                } else {
                    h1Var2 = new h1(this.f10976a.pop(), h1Var2);
                }
            }
            this.f10976a.push(h1Var2);
        }
    }

    public static final class c implements Iterator<h.g> {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayDeque<h1> f10977a;

        /* renamed from: b, reason: collision with root package name */
        public h.g f10978b;

        public c(h hVar) {
            h.g gVar;
            if (hVar instanceof h1) {
                h1 h1Var = (h1) hVar;
                ArrayDeque<h1> arrayDeque = new ArrayDeque<>(h1Var.f10973p);
                this.f10977a = arrayDeque;
                arrayDeque.push(h1Var);
                h hVar2 = h1Var.f10971e;
                while (hVar2 instanceof h1) {
                    h1 h1Var2 = (h1) hVar2;
                    this.f10977a.push(h1Var2);
                    hVar2 = h1Var2.f10971e;
                }
                gVar = (h.g) hVar2;
            } else {
                this.f10977a = null;
                gVar = (h.g) hVar;
            }
            this.f10978b = gVar;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h.g next() {
            h.g gVar;
            h.g gVar2 = this.f10978b;
            if (gVar2 == null) {
                throw new NoSuchElementException();
            }
            do {
                ArrayDeque<h1> arrayDeque = this.f10977a;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    gVar = null;
                    break;
                }
                h hVar = this.f10977a.pop().f;
                while (hVar instanceof h1) {
                    h1 h1Var = (h1) hVar;
                    this.f10977a.push(h1Var);
                    hVar = h1Var.f10971e;
                }
                gVar = (h.g) hVar;
            } while (gVar.isEmpty());
            this.f10978b = gVar;
            return gVar2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f10978b != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public /* synthetic */ h1() {
        throw null;
    }

    public h1(h hVar, h hVar2) {
        this.f10971e = hVar;
        this.f = hVar2;
        int size = hVar.size();
        this.f10972o = size;
        this.f10970d = hVar2.size() + size;
        this.f10973p = Math.max(hVar.o(), hVar2.o()) + 1;
    }

    public static int C(int i10) {
        int[] iArr = f10969q;
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    @Override // ma.h
    public final String A(Charset charset) {
        return new String(z(), charset);
    }

    @Override // ma.h
    public final void B(m.e eVar) {
        this.f10971e.B(eVar);
        this.f.B(eVar);
    }

    @Override // ma.h
    public final ByteBuffer a() {
        return ByteBuffer.wrap(z()).asReadOnlyBuffer();
    }

    @Override // ma.h
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f10970d != hVar.size()) {
            return false;
        }
        if (this.f10970d == 0) {
            return true;
        }
        int i10 = this.f10963a;
        int i11 = hVar.f10963a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        c cVar = new c(this);
        h.g next = cVar.next();
        c cVar2 = new c(hVar);
        h.g next2 = cVar2.next();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int size = next.size() - i12;
            int size2 = next2.size() - i13;
            int min = Math.min(size, size2);
            if (!(i12 == 0 ? next.C(next2, i13, min) : next2.C(next, i12, min))) {
                return false;
            }
            i14 += min;
            int i15 = this.f10970d;
            if (i14 >= i15) {
                if (i14 == i15) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                i12 = 0;
                next = cVar.next();
            } else {
                i12 += min;
                next = next;
            }
            if (min == size2) {
                next2 = cVar2.next();
                i13 = 0;
            } else {
                i13 += min;
            }
        }
    }

    @Override // ma.h
    public final byte i(int i10) {
        h.k(i10, this.f10970d);
        return p(i10);
    }

    @Override // ma.h, java.lang.Iterable
    public final Iterator<Byte> iterator() {
        return new a(this);
    }

    @Override // ma.h
    public final void n(int i10, byte[] bArr, int i11, int i12) {
        h hVar;
        int i13 = i10 + i12;
        int i14 = this.f10972o;
        if (i13 <= i14) {
            hVar = this.f10971e;
        } else {
            if (i10 < i14) {
                int i15 = i14 - i10;
                this.f10971e.n(i10, bArr, i11, i15);
                this.f.n(0, bArr, i11 + i15, i12 - i15);
                return;
            }
            hVar = this.f;
            i10 -= i14;
        }
        hVar.n(i10, bArr, i11, i12);
    }

    @Override // ma.h
    public final int o() {
        return this.f10973p;
    }

    @Override // ma.h
    public final byte p(int i10) {
        int i11 = this.f10972o;
        return i10 < i11 ? this.f10971e.p(i10) : this.f.p(i10 - i11);
    }

    @Override // ma.h
    public final boolean q() {
        return this.f10970d >= C(this.f10973p);
    }

    @Override // ma.h
    public final boolean r() {
        int x10 = this.f10971e.x(0, 0, this.f10972o);
        h hVar = this.f;
        return hVar.x(x10, 0, hVar.size()) == 0;
    }

    @Override // ma.h
    /* renamed from: s */
    public final h.f iterator() {
        return new a(this);
    }

    @Override // ma.h
    public final int size() {
        return this.f10970d;
    }

    @Override // ma.h
    public final i t() {
        h.g gVar;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.f10973p);
        arrayDeque.push(this);
        h hVar = this.f10971e;
        while (hVar instanceof h1) {
            h1 h1Var = (h1) hVar;
            arrayDeque.push(h1Var);
            hVar = h1Var.f10971e;
        }
        h.g gVar2 = (h.g) hVar;
        while (true) {
            int i10 = 0;
            if (!(gVar2 != null)) {
                Iterator it = arrayList.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    ByteBuffer byteBuffer = (ByteBuffer) it.next();
                    i11 += byteBuffer.remaining();
                    i10 = byteBuffer.hasArray() ? i10 | 1 : byteBuffer.isDirect() ? i10 | 2 : i10 | 4;
                }
                return i10 == 2 ? new i.b(arrayList, i11) : new i.c(new c0(arrayList));
            }
            if (gVar2 == null) {
                throw new NoSuchElementException();
            }
            while (true) {
                if (arrayDeque.isEmpty()) {
                    gVar = null;
                    break;
                }
                h hVar2 = ((h1) arrayDeque.pop()).f;
                while (hVar2 instanceof h1) {
                    h1 h1Var2 = (h1) hVar2;
                    arrayDeque.push(h1Var2);
                    hVar2 = h1Var2.f10971e;
                }
                gVar = (h.g) hVar2;
                if (!gVar.isEmpty()) {
                    break;
                }
            }
            arrayList.add(gVar2.a());
            gVar2 = gVar;
        }
    }

    @Override // ma.h
    public final int u(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f10972o;
        if (i13 <= i14) {
            return this.f10971e.u(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f.u(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f.u(this.f10971e.u(i10, i11, i15), 0, i12 - i15);
    }

    @Override // ma.h
    public final int x(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f10972o;
        if (i13 <= i14) {
            return this.f10971e.x(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f.x(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f.x(this.f10971e.x(i10, i11, i15), 0, i12 - i15);
    }

    @Override // ma.h
    public final h y(int i10, int i11) {
        int l10 = h.l(i10, i11, this.f10970d);
        if (l10 == 0) {
            return h.f10961b;
        }
        if (l10 == this.f10970d) {
            return this;
        }
        int i12 = this.f10972o;
        if (i11 <= i12) {
            return this.f10971e.y(i10, i11);
        }
        if (i10 >= i12) {
            return this.f.y(i10 - i12, i11 - i12);
        }
        h hVar = this.f10971e;
        return new h1(hVar.y(i10, hVar.size()), this.f.y(0, i11 - this.f10972o));
    }
}
