package o0;

/* loaded from: classes.dex */
public final class h<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11602a = new a();

    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0085 -> B:13:0x0067). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0088 -> B:13:0x0067). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.Object a(o0.h.a r5, java.util.List r6, o0.k r7, ub.e r8) {
            /*
                r5.getClass()
                boolean r0 = r8 instanceof o0.f
                if (r0 == 0) goto L16
                r0 = r8
                o0.f r0 = (o0.f) r0
                int r1 = r0.f11593e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L16
                int r1 = r1 - r2
                r0.f11593e = r1
                goto L1b
            L16:
                o0.f r0 = new o0.f
                r0.<init>(r5, r8)
            L1b:
                java.lang.Object r5 = r0.f11591c
                vb.a r8 = vb.a.f16085a
                int r1 = r0.f11593e
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L43
                if (r1 == r2) goto L3b
                if (r1 != r3) goto L33
                java.util.Iterator r6 = r0.f11590b
                java.io.Serializable r7 = r0.f11589a
                ec.s r7 = (ec.s) r7
                rb.f.b(r5)     // Catch: java.lang.Throwable -> L80
                goto L67
            L33:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L3b:
                java.io.Serializable r6 = r0.f11589a
                java.util.List r6 = (java.util.List) r6
                rb.f.b(r5)
                goto L5d
            L43:
                rb.f.b(r5)
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                o0.g r1 = new o0.g
                r4 = 0
                r1.<init>(r6, r5, r4)
                r0.f11589a = r5
                r0.f11593e = r2
                java.lang.Object r6 = r7.a(r1, r0)
                if (r6 != r8) goto L5c
                goto L96
            L5c:
                r6 = r5
            L5d:
                ec.s r5 = new ec.s
                r5.<init>()
                java.util.Iterator r6 = r6.iterator()
                r7 = r5
            L67:
                boolean r5 = r6.hasNext()
                if (r5 == 0) goto L8e
                java.lang.Object r5 = r6.next()
                dc.l r5 = (dc.l) r5
                r0.f11589a = r7     // Catch: java.lang.Throwable -> L80
                r0.f11590b = r6     // Catch: java.lang.Throwable -> L80
                r0.f11593e = r3     // Catch: java.lang.Throwable -> L80
                java.lang.Object r5 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L80
                if (r5 != r8) goto L67
                goto L96
            L80:
                r5 = move-exception
                T r1 = r7.f5272a
                if (r1 != 0) goto L88
                r7.f5272a = r5
                goto L67
            L88:
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                x6.b.e(r1, r5)
                goto L67
            L8e:
                T r5 = r7.f5272a
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                if (r5 != 0) goto L97
                rb.h r8 = rb.h.f13851a
            L96:
                return r8
            L97:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o0.h.a.a(o0.h$a, java.util.List, o0.k, ub.e):java.lang.Object");
        }
    }
}
