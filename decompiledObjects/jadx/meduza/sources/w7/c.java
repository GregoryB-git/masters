package w7;

import java.util.concurrent.ConcurrentHashMap;
import m6.j;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f16438c;

    /* renamed from: a, reason: collision with root package name */
    public final d7.a f16439a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f16440b;

    public c(d7.a aVar) {
        j.i(aVar);
        this.f16439a = aVar;
        this.f16440b = new ConcurrentHashMap();
    }

    @Override // w7.a
    public final b a(String str, f8.b bVar) {
        if (!(!x7.b.f17205c.contains(str))) {
            return null;
        }
        if ((str.isEmpty() || !this.f16440b.containsKey(str) || this.f16440b.get(str) == null) ? false : true) {
            return null;
        }
        d7.a aVar = this.f16439a;
        Object aVar2 = "fiam".equals(str) ? new x7.a(aVar, bVar) : "clx".equals(str) ? new x7.c(aVar, bVar) : null;
        if (aVar2 == null) {
            return null;
        }
        this.f16440b.put(str, aVar2);
        return new b();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    @Override // w7.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.String r7, java.lang.String r8, android.os.Bundle r9) {
        /*
            r6 = this;
            if (r9 != 0) goto L7
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
        L7:
            o7.l0 r0 = x7.b.f17205c
            boolean r0 = r0.contains(r7)
            r1 = 1
            r0 = r0 ^ r1
            if (r0 != 0) goto L12
            return
        L12:
            o7.l0 r0 = x7.b.f17204b
            boolean r0 = r0.contains(r8)
            r2 = 0
            if (r0 == 0) goto L1c
            goto L31
        L1c:
            o7.l0 r0 = x7.b.f17206d
            int r3 = r0.f12011d
            r4 = r2
        L21:
            if (r4 >= r3) goto L33
            java.lang.Object r5 = r0.get(r4)
            int r4 = r4 + 1
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r9.containsKey(r5)
            if (r5 == 0) goto L21
        L31:
            r0 = r2
            goto L34
        L33:
            r0 = r1
        L34:
            if (r0 != 0) goto L37
            return
        L37:
            java.lang.String r0 = "_cmp"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L41
            goto L9c
        L41:
            o7.l0 r0 = x7.b.f17205c
            boolean r0 = r0.contains(r7)
            r0 = r0 ^ r1
            if (r0 != 0) goto L4b
            goto L8d
        L4b:
            o7.l0 r0 = x7.b.f17206d
            int r3 = r0.f12011d
            r4 = r2
        L50:
            if (r4 >= r3) goto L61
            java.lang.Object r5 = r0.get(r4)
            int r4 = r4 + 1
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r9.containsKey(r5)
            if (r5 == 0) goto L50
            goto L8d
        L61:
            r0 = -1
            int r3 = r7.hashCode()
            switch(r3) {
                case 101200: goto L80;
                case 101230: goto L75;
                case 3142703: goto L6a;
                default: goto L69;
            }
        L69:
            goto L8a
        L6a:
            java.lang.String r3 = "fiam"
            boolean r3 = r7.equals(r3)
            if (r3 != 0) goto L73
            goto L8a
        L73:
            r0 = 2
            goto L8a
        L75:
            java.lang.String r3 = "fdl"
            boolean r3 = r7.equals(r3)
            if (r3 != 0) goto L7e
            goto L8a
        L7e:
            r0 = r1
            goto L8a
        L80:
            java.lang.String r3 = "fcm"
            boolean r3 = r7.equals(r3)
            if (r3 != 0) goto L89
            goto L8a
        L89:
            r0 = r2
        L8a:
            switch(r0) {
                case 0: goto L95;
                case 1: goto L92;
                case 2: goto L8f;
                default: goto L8d;
            }
        L8d:
            r1 = r2
            goto L9c
        L8f:
            java.lang.String r0 = "fiam_integration"
            goto L97
        L92:
            java.lang.String r0 = "fdl_integration"
            goto L97
        L95:
            java.lang.String r0 = "fcm_integration"
        L97:
            java.lang.String r2 = "_cis"
            r9.putString(r2, r0)
        L9c:
            if (r1 != 0) goto L9f
            return
        L9f:
            java.lang.String r0 = "clx"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto Lb6
            java.lang.String r0 = "_ae"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto Lb6
            r0 = 1
            java.lang.String r2 = "_r"
            r9.putLong(r2, r0)
        Lb6:
            d7.a r0 = r6.f16439a
            com.google.android.gms.internal.measurement.zzed r0 = r0.f3580a
            r0.zzb(r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w7.c.b(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    @Override // w7.a
    public final void c(String str) {
        if (!x7.b.f17205c.contains("fcm")) {
            this.f16439a.f3580a.zza("fcm", "_ln", (Object) str, true);
        }
    }
}
