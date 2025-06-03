package ib;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f7914a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f7915a = new ArrayList(20);
    }

    public d(a aVar) {
        ArrayList arrayList = aVar.f7915a;
        this.f7914a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String[] r1 = r7.f7914a
            int r1 = r1.length
            int r1 = r1 / 2
            r2 = 0
        Lb:
            if (r2 >= r1) goto L3b
            int r3 = r2 * 2
            r4 = 0
            if (r3 < 0) goto L1b
            java.lang.String[] r5 = r7.f7914a
            int r6 = r5.length
            if (r3 < r6) goto L18
            goto L1b
        L18:
            r5 = r5[r3]
            goto L1c
        L1b:
            r5 = r4
        L1c:
            r0.append(r5)
            java.lang.String r5 = ": "
            r0.append(r5)
            int r3 = r3 + 1
            if (r3 < 0) goto L30
            java.lang.String[] r5 = r7.f7914a
            int r6 = r5.length
            if (r3 < r6) goto L2e
            goto L30
        L2e:
            r4 = r5[r3]
        L30:
            r0.append(r4)
            java.lang.String r3 = "\n"
            r0.append(r3)
            int r2 = r2 + 1
            goto Lb
        L3b:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ib.d.toString():java.lang.String");
    }
}
