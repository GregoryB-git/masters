package p1;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class l implements t1.e, t1.d {

    /* renamed from: q, reason: collision with root package name */
    public static final TreeMap<Integer, l> f12827q = new TreeMap<>();

    /* renamed from: a, reason: collision with root package name */
    public final int f12828a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f12829b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f12830c;

    /* renamed from: d, reason: collision with root package name */
    public final double[] f12831d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f12832e;
    public final byte[][] f;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f12833o;

    /* renamed from: p, reason: collision with root package name */
    public int f12834p;

    public l(int i10) {
        this.f12828a = i10;
        int i11 = i10 + 1;
        this.f12833o = new int[i11];
        this.f12830c = new long[i11];
        this.f12831d = new double[i11];
        this.f12832e = new String[i11];
        this.f = new byte[i11][];
    }

    public static final l C(int i10, String str) {
        ec.i.e(str, "query");
        TreeMap<Integer, l> treeMap = f12827q;
        synchronized (treeMap) {
            Map.Entry<Integer, l> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry == null) {
                rb.h hVar = rb.h.f13851a;
                l lVar = new l(i10);
                lVar.f12829b = str;
                lVar.f12834p = i10;
                return lVar;
            }
            treeMap.remove(ceilingEntry.getKey());
            l value = ceilingEntry.getValue();
            value.getClass();
            value.f12829b = str;
            value.f12834p = i10;
            return value;
        }
    }

    @Override // t1.d
    public final void F(int i10, long j10) {
        this.f12833o[i10] = 2;
        this.f12830c[i10] = j10;
    }

    public final void H() {
        TreeMap<Integer, l> treeMap = f12827q;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f12828a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                ec.i.d(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
            rb.h hVar = rb.h.f13851a;
        }
    }

    @Override // t1.d
    public final void T(byte[] bArr, int i10) {
        this.f12833o[i10] = 5;
        this.f[i10] = bArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // t1.d
    public final void d0(int i10) {
        this.f12833o[i10] = 1;
    }

    @Override // t1.e
    public final void f(t1.d dVar) {
        int i10 = this.f12834p;
        if (1 > i10) {
            return;
        }
        int i11 = 1;
        while (true) {
            int i12 = this.f12833o[i11];
            if (i12 == 1) {
                dVar.d0(i11);
            } else if (i12 == 2) {
                dVar.F(i11, this.f12830c[i11]);
            } else if (i12 == 3) {
                dVar.s(i11, this.f12831d[i11]);
            } else if (i12 == 4) {
                String str = this.f12832e[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                dVar.n(i11, str);
            } else if (i12 == 5) {
                byte[] bArr = this.f[i11];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                dVar.T(bArr, i11);
            }
            if (i11 == i10) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // t1.e
    public final String g() {
        String str = this.f12829b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // t1.d
    public final void n(int i10, String str) {
        ec.i.e(str, "value");
        this.f12833o[i10] = 4;
        this.f12832e[i10] = str;
    }

    @Override // t1.d
    public final void s(int i10, double d10) {
        this.f12833o[i10] = 3;
        this.f12831d[i10] = d10;
    }
}
