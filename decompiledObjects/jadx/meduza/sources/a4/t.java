package a4;

import a4.o;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import o7.m0;
import t5.k;
import t5.s;
import v5.e0;

/* loaded from: classes.dex */
public final class t implements w {

    /* renamed from: a, reason: collision with root package name */
    public final k.a f202a;

    /* renamed from: b, reason: collision with root package name */
    public final String f203b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f204c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f205d;

    public t(String str, boolean z10, s.a aVar) {
        x6.b.q((z10 && TextUtils.isEmpty(str)) ? false : true);
        this.f202a = aVar;
        this.f203b = str;
        this.f204c = z10;
        this.f205d = new HashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        r4 = r4 + 1;
        r8 = r3.f14548b;
        r0 = r3.f14549c;
        r6 = r3.f14550d;
        r10 = r3.f14551e;
        r11 = r3.f;
        r13 = r3.f14552g;
        r15 = r3.f14553h;
        r2 = r3.f14554i;
        r3 = r3.f14555j;
        r19 = android.net.Uri.parse(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        if (r19 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        r7 = new t5.n(r19, r8, r0, r6, r10, r11, r13, r15, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        v5.e0.g(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        r3 = r7;
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        throw new java.lang.IllegalStateException("The uri must be set.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] c(t5.k.a r32, java.lang.String r33, byte[] r34, java.util.Map<java.lang.String, java.lang.String> r35) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.t.c(t5.k$a, java.lang.String, byte[], java.util.Map):byte[]");
    }

    @Override // a4.w
    public final byte[] a(o.d dVar) {
        return c(this.f202a, dVar.f191b + "&signedRequest=" + e0.n(dVar.f190a), null, Collections.emptyMap());
    }

    @Override // a4.w
    public final byte[] b(UUID uuid, o.a aVar) {
        String str = aVar.f189b;
        if (this.f204c || TextUtils.isEmpty(str)) {
            str = this.f203b;
        }
        if (TextUtils.isEmpty(str)) {
            Map emptyMap = Collections.emptyMap();
            Uri uri = Uri.EMPTY;
            if (uri != null) {
                throw new x(new t5.n(uri, 0L, 1, null, emptyMap, 0L, -1L, null, 0, null), Uri.EMPTY, m0.f12013o, 0L, new IllegalStateException("No license URL"));
            }
            throw new IllegalStateException("The uri must be set.");
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = v3.h.f15398e;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : v3.h.f15396c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f205d) {
            hashMap.putAll(this.f205d);
        }
        return c(this.f202a, str, aVar.f188a, hashMap);
    }
}
