package c5;

import android.net.Uri;
import d5.i;
import d5.j;
import java.util.Collections;
import java.util.Map;
import t5.n;
import v5.d0;

/* loaded from: classes.dex */
public final class d {
    public static n a(j jVar, String str, i iVar, int i10) {
        Map emptyMap = Collections.emptyMap();
        Uri d10 = d0.d(str, iVar.f3494c);
        long j10 = iVar.f3492a;
        long j11 = iVar.f3493b;
        String c10 = jVar.c();
        String uri = c10 != null ? c10 : d0.d(jVar.f3497b.get(0).f3447a, iVar.f3494c).toString();
        if (d10 != null) {
            return new n(d10, 0L, 1, null, emptyMap, j10, j11, uri, i10, null);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
