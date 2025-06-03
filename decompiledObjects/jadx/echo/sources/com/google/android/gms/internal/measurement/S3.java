package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class S3 {

    /* renamed from: d, reason: collision with root package name */
    public static final S3 f10580d = new S3(true);

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0888d5 f10581a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10582b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10583c;

    public S3() {
        this.f10581a = AbstractC0888d5.b(16);
    }

    public static int b(U3 u32, Object obj) {
        K5 b7 = u32.b();
        int a7 = u32.a();
        if (!u32.f()) {
            return c(b7, a7, obj);
        }
        List list = (List) obj;
        int i7 = 0;
        if (!u32.d()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i7 += c(b7, a7, it.next());
            }
            return i7;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i7 += d(b7, it2.next());
        }
        return J3.s0(a7) + i7 + J3.v0(i7);
    }

    public static int c(K5 k52, int i7, Object obj) {
        int s02 = J3.s0(i7);
        if (k52 == K5.f10473z) {
            AbstractC0860a4.g((I4) obj);
            s02 <<= 1;
        }
        return s02 + d(k52, obj);
    }

    public static int d(K5 k52, Object obj) {
        switch (R3.f10567b[k52.ordinal()]) {
            case 1:
                return J3.c(((Double) obj).doubleValue());
            case 2:
                return J3.d(((Float) obj).floatValue());
            case 3:
                return J3.a0(((Long) obj).longValue());
            case 4:
                return J3.n0(((Long) obj).longValue());
            case 5:
                return J3.g0(((Integer) obj).intValue());
            case 6:
                return J3.S(((Long) obj).longValue());
            case 7:
                return J3.c0(((Integer) obj).intValue());
            case 8:
                return J3.h(((Boolean) obj).booleanValue());
            case 9:
                return J3.B((I4) obj);
            case 10:
                return J3.T((I4) obj);
            case 11:
                return obj instanceof AbstractC1003q3 ? J3.A((AbstractC1003q3) obj) : J3.C((String) obj);
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return obj instanceof AbstractC1003q3 ? J3.A((AbstractC1003q3) obj) : J3.i((byte[]) obj);
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return J3.v0(((Integer) obj).intValue());
            case 14:
                return J3.k0(((Integer) obj).intValue());
            case 15:
                return J3.f0(((Long) obj).longValue());
            case 16:
                return J3.o0(((Integer) obj).intValue());
            case 17:
                return J3.j0(((Long) obj).longValue());
            case 18:
                return obj instanceof InterfaceC0896e4 ? J3.X(((InterfaceC0896e4) obj).a()) : J3.X(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int e(Map.Entry entry) {
        android.support.v4.media.a.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void j(com.google.android.gms.internal.measurement.U3 r4, java.lang.Object r5) {
        /*
            com.google.android.gms.internal.measurement.K5 r0 = r4.b()
            com.google.android.gms.internal.measurement.AbstractC0860a4.e(r5)
            int[] r1 = com.google.android.gms.internal.measurement.R3.f10566a
            com.google.android.gms.internal.measurement.U5 r0 = r0.c()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L3d;
                case 2: goto L3a;
                case 3: goto L37;
                case 4: goto L34;
                case 5: goto L31;
                case 6: goto L2e;
                case 7: goto L25;
                case 8: goto L1c;
                case 9: goto L17;
                default: goto L16;
            }
        L16:
            goto L42
        L17:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.I4
            if (r0 == 0) goto L42
            goto L41
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.InterfaceC0896e4
            if (r0 == 0) goto L42
            goto L41
        L25:
            boolean r0 = r5 instanceof com.google.android.gms.internal.measurement.AbstractC1003q3
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L42
            goto L41
        L2e:
            boolean r0 = r5 instanceof java.lang.String
            goto L3f
        L31:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3f
        L34:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3f
        L37:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3f
        L3a:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3f
        L3d:
            boolean r0 = r5 instanceof java.lang.Integer
        L3f:
            if (r0 == 0) goto L42
        L41:
            return
        L42:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r4.a()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.measurement.K5 r4 = r4.b()
            com.google.android.gms.internal.measurement.U5 r4 = r4.c()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            r2[r1] = r4
            r4 = 2
            r2[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.S3.j(com.google.android.gms.internal.measurement.U3, java.lang.Object):void");
    }

    public static boolean k(Map.Entry entry) {
        android.support.v4.media.a.a(entry.getKey());
        throw null;
    }

    public final int a() {
        int i7 = 0;
        for (int i8 = 0; i8 < this.f10581a.g(); i8++) {
            i7 += e(this.f10581a.h(i8));
        }
        Iterator it = this.f10581a.j().iterator();
        while (it.hasNext()) {
            i7 += e((Map.Entry) it.next());
        }
        return i7;
    }

    public final /* synthetic */ Object clone() {
        S3 s32 = new S3();
        for (int i7 = 0; i7 < this.f10581a.g(); i7++) {
            Map.Entry h7 = this.f10581a.h(i7);
            android.support.v4.media.a.a(h7.getKey());
            s32.g(null, h7.getValue());
        }
        for (Map.Entry entry : this.f10581a.j()) {
            android.support.v4.media.a.a(entry.getKey());
            s32.g(null, entry.getValue());
        }
        s32.f10583c = this.f10583c;
        return s32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof S3) {
            return this.f10581a.equals(((S3) obj).f10581a);
        }
        return false;
    }

    public final void f(S3 s32) {
        for (int i7 = 0; i7 < s32.f10581a.g(); i7++) {
            h(s32.f10581a.h(i7));
        }
        Iterator it = s32.f10581a.j().iterator();
        while (it.hasNext()) {
            h((Map.Entry) it.next());
        }
    }

    public final void g(U3 u32, Object obj) {
        if (!u32.f()) {
            j(u32, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj2 = arrayList.get(i7);
                i7++;
                j(u32, obj2);
            }
            obj = arrayList;
        }
        this.f10581a.put(u32, obj);
    }

    public final void h(Map.Entry entry) {
        android.support.v4.media.a.a(entry.getKey());
        entry.getValue();
        throw null;
    }

    public final int hashCode() {
        return this.f10581a.hashCode();
    }

    public final Iterator i() {
        return this.f10583c ? new C0968m4(this.f10581a.m().iterator()) : this.f10581a.m().iterator();
    }

    public final Iterator l() {
        return this.f10583c ? new C0968m4(this.f10581a.entrySet().iterator()) : this.f10581a.entrySet().iterator();
    }

    public final void m() {
        if (this.f10582b) {
            return;
        }
        for (int i7 = 0; i7 < this.f10581a.g(); i7++) {
            Map.Entry h7 = this.f10581a.h(i7);
            if (h7.getValue() instanceof Y3) {
                ((Y3) h7.getValue()).C();
            }
        }
        this.f10581a.f();
        this.f10582b = true;
    }

    public final boolean n() {
        for (int i7 = 0; i7 < this.f10581a.g(); i7++) {
            if (!k(this.f10581a.h(i7))) {
                return false;
            }
        }
        Iterator it = this.f10581a.j().iterator();
        while (it.hasNext()) {
            if (!k((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public S3(AbstractC0888d5 abstractC0888d5) {
        this.f10581a = abstractC0888d5;
        m();
    }

    public S3(boolean z7) {
        this(AbstractC0888d5.b(0));
        m();
    }
}
