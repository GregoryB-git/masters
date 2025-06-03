package lb;

import defpackage.f;
import eb.e1;
import eb.g1;
import eb.j0;
import eb.t0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import ma.b0;
import ma.b1;
import ma.i;
import ma.o;
import ma.s0;
import ma.w;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile o f9824a = o.a();

    public static final class a<T extends s0> implements t0.b {

        /* renamed from: d, reason: collision with root package name */
        public static final ThreadLocal<Reference<byte[]>> f9825d = new ThreadLocal<>();

        /* renamed from: a, reason: collision with root package name */
        public final b1<T> f9826a;

        /* renamed from: b, reason: collision with root package name */
        public final T f9827b;

        /* renamed from: c, reason: collision with root package name */
        public final int f9828c;

        public a(w wVar) {
            x6.b.y(wVar, "defaultInstance cannot be null");
            this.f9827b = wVar;
            this.f9826a = wVar.v();
            this.f9828c = -1;
        }

        @Override // eb.t0.b
        public final s0 a(InputStream inputStream) {
            byte[] bArr;
            if ((inputStream instanceof lb.a) && ((lb.a) inputStream).f9822b == this.f9826a) {
                try {
                    s0 s0Var = ((lb.a) inputStream).f9821a;
                    if (s0Var != null) {
                        return s0Var;
                    }
                    throw new IllegalStateException("message not available");
                } catch (IllegalStateException unused) {
                }
            }
            i iVar = null;
            try {
                if (inputStream instanceof j0) {
                    int available = inputStream.available();
                    if (available > 0 && available <= 4194304) {
                        ThreadLocal<Reference<byte[]>> threadLocal = f9825d;
                        Reference<byte[]> reference = threadLocal.get();
                        if (reference == null || (bArr = reference.get()) == null || bArr.length < available) {
                            bArr = new byte[available];
                            threadLocal.set(new WeakReference(bArr));
                        }
                        int i10 = available;
                        while (i10 > 0) {
                            int read = inputStream.read(bArr, available - i10, i10);
                            if (read == -1) {
                                break;
                            }
                            i10 -= read;
                        }
                        if (i10 != 0) {
                            throw new RuntimeException("size inaccurate: " + available + " != " + (available - i10));
                        }
                        iVar = i.f(bArr, 0, available, false);
                    } else if (available == 0) {
                        return this.f9827b;
                    }
                }
                if (iVar == null) {
                    iVar = new i.c(inputStream);
                }
                iVar.f10981c = Integer.MAX_VALUE;
                int i11 = this.f9828c;
                if (i11 >= 0) {
                    if (i11 < 0) {
                        throw new IllegalArgumentException(f.h("Recursion limit cannot be negative: ", i11));
                    }
                    iVar.f10980b = i11;
                }
                try {
                    s0 a10 = this.f9826a.a(iVar, b.f9824a);
                    try {
                        iVar.a(0);
                        return a10;
                    } catch (b0 e10) {
                        e10.f10917a = a10;
                        throw e10;
                    }
                } catch (b0 e11) {
                    throw new g1(e1.f5077m.g("Invalid protobuf byte sequence").f(e11));
                }
            } catch (IOException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // eb.t0.b
        public final lb.a b(Object obj) {
            return new lb.a((s0) obj, this.f9826a);
        }
    }
}
