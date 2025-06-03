package pa;

import android.content.Context;
import java.io.File;
import t5.k;
import t5.r;
import t5.v;
import u5.n;
import u5.q;

/* loaded from: classes.dex */
public final class h implements k.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13094a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13095b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13096c;

    /* renamed from: d, reason: collision with root package name */
    public r.a f13097d;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0026, code lost:
    
        if (android.text.TextUtils.isEmpty(r9) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(android.content.Context r8, long r9, long r11, t5.s.a r13) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            ec.i.e(r8, r0)
            r7.<init>()
            r7.f13094a = r8
            r7.f13095b = r9
            r7.f13096c = r11
            android.content.Context r2 = r8.getApplicationContext()
            int r9 = v5.e0.f15881a
            java.lang.String r9 = "phone"
            java.lang.Object r9 = r8.getSystemService(r9)
            android.telephony.TelephonyManager r9 = (android.telephony.TelephonyManager) r9
            if (r9 == 0) goto L29
            java.lang.String r9 = r9.getNetworkCountryIso()
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L29
            goto L31
        L29:
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.String r9 = r9.getCountry()
        L31:
            java.lang.String r9 = x6.b.y0(r9)
            int[] r9 = t5.q.j(r9)
            java.util.HashMap r3 = new java.util.HashMap
            r10 = 8
            r3.<init>(r10)
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r0 = 1000000(0xf4240, double:4.940656E-318)
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            r3.put(r11, r12)
            r11 = 2
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            o7.l0 r0 = t5.q.f14562n
            r1 = r9[r10]
            java.lang.Object r1 = r0.get(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            r3.put(r12, r1)
            r12 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            o7.l0 r4 = t5.q.f14563o
            r5 = 1
            r5 = r9[r5]
            java.lang.Object r4 = r4.get(r5)
            java.lang.Long r4 = (java.lang.Long) r4
            r3.put(r1, r4)
            r1 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            o7.l0 r5 = t5.q.f14564p
            r11 = r9[r11]
            java.lang.Object r11 = r5.get(r11)
            java.lang.Long r11 = (java.lang.Long) r11
            r3.put(r4, r11)
            r11 = 5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            o7.l0 r5 = t5.q.f14565q
            r12 = r9[r12]
            java.lang.Object r12 = r5.get(r12)
            java.lang.Long r12 = (java.lang.Long) r12
            r3.put(r4, r12)
            r12 = 10
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            o7.l0 r4 = t5.q.f14566r
            r1 = r9[r1]
            java.lang.Object r1 = r4.get(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            r3.put(r12, r1)
            r12 = 9
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            o7.l0 r1 = t5.q.f14567s
            r11 = r9[r11]
            java.lang.Object r11 = r1.get(r11)
            java.lang.Long r11 = (java.lang.Long) r11
            r3.put(r12, r11)
            r11 = 7
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r9 = r9[r10]
            java.lang.Object r9 = r0.get(r9)
            java.lang.Long r9 = (java.lang.Long) r9
            r3.put(r11, r9)
            r4 = 2000(0x7d0, float:2.803E-42)
            v5.z r5 = v5.c.f15872a
            t5.q r9 = new t5.q
            r6 = 1
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            t5.r$a r10 = new t5.r$a
            r10.<init>(r8, r13)
            r7.f13097d = r10
            r10.f14592c = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.h.<init>(android.content.Context, long, long, t5.s$a):void");
    }

    @Override // t5.k.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final u5.c a() {
        f fVar = f.f13078a;
        Context context = this.f13094a;
        long j10 = this.f13095b;
        fVar.getClass();
        ec.i.e(context, "context");
        if (f.f13079b == null) {
            synchronized (f.class) {
                if (f.f13079b == null) {
                    f.f13079b = new q(new File(context.getCacheDir(), "betterPlayerCache"), new n(j10), new y3.c(context));
                }
                rb.h hVar = rb.h.f13851a;
            }
        }
        q qVar = f.f13079b;
        if (qVar == null) {
            throw new IllegalStateException("Cache can't be null.");
        }
        r.a aVar = this.f13097d;
        return new u5.c(qVar, aVar != null ? aVar.a() : null, new v(), new u5.b(qVar, this.f13096c));
    }
}
