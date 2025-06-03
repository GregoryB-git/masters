package p0;

import X2.AbstractC0704w;
import android.net.Uri;
import android.text.TextUtils;
import d0.AbstractC1184g;
import g0.AbstractC1297a;
import i0.g;
import i0.k;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p0.F;

/* loaded from: classes.dex */
public final class O implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final g.a f18232a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18233b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f18234c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f18235d;

    public O(String str, boolean z7, g.a aVar) {
        AbstractC1297a.a((z7 && TextUtils.isEmpty(str)) ? false : true);
        this.f18232a = aVar;
        this.f18233b = str;
        this.f18234c = z7;
        this.f18235d = new HashMap();
    }

    public static byte[] c(g.a aVar, String str, byte[] bArr, Map map) {
        i0.x xVar = new i0.x(aVar.a());
        i0.k a7 = new k.b().j(str).e(map).d(2).c(bArr).b(1).a();
        int i7 = 0;
        i0.k kVar = a7;
        while (true) {
            try {
                i0.i iVar = new i0.i(xVar, kVar);
                try {
                    return Y2.a.b(iVar);
                } catch (i0.t e7) {
                    try {
                        String d7 = d(e7, i7);
                        if (d7 == null) {
                            throw e7;
                        }
                        i7++;
                        kVar = kVar.a().j(d7).a();
                    } finally {
                        g0.M.m(iVar);
                    }
                }
            } catch (Exception e8) {
                throw new S(a7, (Uri) AbstractC1297a.e(xVar.r()), xVar.g(), xVar.q(), e8);
            }
        }
    }

    public static String d(i0.t tVar, int i7) {
        Map map;
        List list;
        int i8 = tVar.f14720r;
        if ((i8 != 307 && i8 != 308) || i7 >= 5 || (map = tVar.f14722t) == null || (list = (List) map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    @Override // p0.Q
    public byte[] a(UUID uuid, F.d dVar) {
        return c(this.f18232a, dVar.b() + "&signedRequest=" + g0.M.H(dVar.a()), null, Collections.emptyMap());
    }

    @Override // p0.Q
    public byte[] b(UUID uuid, F.a aVar) {
        String b7 = aVar.b();
        if (this.f18234c || TextUtils.isEmpty(b7)) {
            b7 = this.f18233b;
        }
        if (TextUtils.isEmpty(b7)) {
            k.b bVar = new k.b();
            Uri uri = Uri.EMPTY;
            throw new S(bVar.i(uri).a(), uri, AbstractC0704w.j(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = AbstractC1184g.f12619e;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : AbstractC1184g.f12617c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f18235d) {
            hashMap.putAll(this.f18235d);
        }
        return c(this.f18232a, b7, aVar.a(), hashMap);
    }

    public void e(String str, String str2) {
        AbstractC1297a.e(str);
        AbstractC1297a.e(str2);
        synchronized (this.f18235d) {
            this.f18235d.put(str, str2);
        }
    }
}
