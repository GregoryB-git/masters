package n7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class b<T> implements Iterator<T> {

    /* renamed from: a, reason: collision with root package name */
    public int f11275a = 2;

    /* renamed from: b, reason: collision with root package name */
    public String f11276b;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        if (r4 >= r5) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r2.f11305d.b(r2.f11304c.charAt(r4)) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        if (r5 <= r4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
    
        r9 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        if (r2.f11305d.b(r2.f11304c.charAt(r9)) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0079, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
    
        if (r2.f11306e == false) goto L51;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean hasNext() {
        /*
            r10 = this;
            int r0 = r10.f11275a
            r1 = 1
            r2 = 4
            r3 = 0
            if (r0 == r2) goto L9
            r0 = r1
            goto La
        L9:
            r0 = r3
        La:
            x6.b.J(r0)
            int r0 = r10.f11275a
            int r0 = q0.g.c(r0)
            if (r0 == 0) goto Lbd
            r4 = 2
            if (r0 == r4) goto Lbc
            r0 = 3
            r10.f11275a = r2
            r2 = r10
            n7.o$a r2 = (n7.o.a) r2
        L1e:
            int r4 = r2.f
        L20:
            int r5 = r2.f
            r6 = -1
            if (r5 == r6) goto Lb0
            r7 = r2
            n7.m r7 = (n7.m) r7
            n7.n r8 = r7.f11298p
            n7.c r8 = r8.f11299a
            java.lang.CharSequence r7 = r7.f11304c
            int r5 = r8.a(r5, r7)
            if (r5 != r6) goto L3d
            java.lang.CharSequence r5 = r2.f11304c
            int r5 = r5.length()
            r2.f = r6
            goto L41
        L3d:
            int r7 = r5 + 1
            r2.f = r7
        L41:
            int r7 = r2.f
            if (r7 != r4) goto L54
            int r7 = r7 + 1
            r2.f = r7
            java.lang.CharSequence r5 = r2.f11304c
            int r5 = r5.length()
            if (r7 <= r5) goto L20
            r2.f = r6
            goto L20
        L54:
            if (r4 >= r5) goto L67
            n7.c r7 = r2.f11305d
            java.lang.CharSequence r8 = r2.f11304c
            char r8 = r8.charAt(r4)
            boolean r7 = r7.b(r8)
            if (r7 == 0) goto L67
            int r4 = r4 + 1
            goto L54
        L67:
            if (r5 <= r4) goto L7b
            n7.c r7 = r2.f11305d
            java.lang.CharSequence r8 = r2.f11304c
            int r9 = r5 + (-1)
            char r8 = r8.charAt(r9)
            boolean r7 = r7.b(r8)
            if (r7 == 0) goto L7b
            r5 = r9
            goto L67
        L7b:
            boolean r7 = r2.f11306e
            if (r7 == 0) goto L82
            if (r4 != r5) goto L82
            goto L1e
        L82:
            int r7 = r2.f11307o
            if (r7 != r1) goto La2
            java.lang.CharSequence r5 = r2.f11304c
            int r5 = r5.length()
            r2.f = r6
        L8e:
            if (r5 <= r4) goto La5
            n7.c r6 = r2.f11305d
            java.lang.CharSequence r7 = r2.f11304c
            int r8 = r5 + (-1)
            char r7 = r7.charAt(r8)
            boolean r6 = r6.b(r7)
            if (r6 == 0) goto La5
            r5 = r8
            goto L8e
        La2:
            int r7 = r7 - r1
            r2.f11307o = r7
        La5:
            java.lang.CharSequence r2 = r2.f11304c
            java.lang.CharSequence r2 = r2.subSequence(r4, r5)
            java.lang.String r2 = r2.toString()
            goto Lb3
        Lb0:
            r2.f11275a = r0
            r2 = 0
        Lb3:
            r10.f11276b = r2
            int r2 = r10.f11275a
            if (r2 == r0) goto Lbc
            r10.f11275a = r1
            goto Lbd
        Lbc:
            r1 = r3
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.b.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f11275a = 2;
        T t = (T) this.f11276b;
        this.f11276b = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
