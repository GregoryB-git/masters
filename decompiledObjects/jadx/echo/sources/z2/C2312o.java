package z2;

import V2.C0660k;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: z2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2312o {

    /* renamed from: a, reason: collision with root package name */
    public final Map f21745a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public final Map f21746b = Collections.synchronizedMap(new WeakHashMap());

    public final void b(C0660k c0660k, boolean z7) {
        this.f21746b.put(c0660k, Boolean.valueOf(z7));
        c0660k.a().b(new C2311n(this, c0660k));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The connection to Google Play services was lost"
            r0.<init>(r1)
            r1 = 1
            if (r4 != r1) goto L10
            java.lang.String r4 = " due to service disconnection."
        Lc:
            r0.append(r4)
            goto L16
        L10:
            r2 = 3
            if (r4 != r2) goto L16
            java.lang.String r4 = " due to dead object exception."
            goto Lc
        L16:
            if (r5 == 0) goto L20
            java.lang.String r4 = " Last reason for disconnect: "
            r0.append(r4)
            r0.append(r5)
        L20:
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status
            r5 = 20
            java.lang.String r0 = r0.toString()
            r4.<init>(r5, r0)
            r3.f(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.C2312o.c(int, java.lang.String):void");
    }

    public final void d() {
        f(false, C2302e.f21714F);
    }

    public final boolean e() {
        return (this.f21745a.isEmpty() && this.f21746b.isEmpty()) ? false : true;
    }

    public final void f(boolean z7, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f21745a) {
            hashMap = new HashMap(this.f21745a);
        }
        synchronized (this.f21746b) {
            hashMap2 = new HashMap(this.f21746b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z7 || ((Boolean) entry.getValue()).booleanValue()) {
                android.support.v4.media.a.a(entry.getKey());
                throw null;
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z7 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C0660k) entry2.getKey()).d(new y2.b(status));
            }
        }
    }
}
