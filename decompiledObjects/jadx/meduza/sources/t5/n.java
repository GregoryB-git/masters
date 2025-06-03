package t5;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f14546k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f14547a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14548b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14549c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f14550d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f14551e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f14552g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14553h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14554i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f14555j;

    static {
        v3.h0.a("goog.exo.datasource");
    }

    public n(Uri uri, long j10, int i10, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i11, Object obj) {
        byte[] bArr2 = bArr;
        boolean z10 = true;
        x6.b.q(j10 + j11 >= 0);
        x6.b.q(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        x6.b.q(z10);
        this.f14547a = uri;
        this.f14548b = j10;
        this.f14549c = i10;
        this.f14550d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f14551e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j11;
        this.f14552g = j12;
        this.f14553h = str;
        this.f14554i = i11;
        this.f14555j = obj;
    }

    public n(Uri uri, long j10, long j11) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j10, j11, null, 0, null);
    }

    public final n a(long j10) {
        long j11 = this.f14552g;
        return b(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public final n b(long j10, long j11) {
        return (j10 == 0 && this.f14552g == j11) ? this : new n(this.f14547a, this.f14548b, this.f14549c, this.f14550d, this.f14551e, this.f + j10, j11, this.f14553h, this.f14554i, this.f14555j);
    }

    public final String toString() {
        String str;
        StringBuilder l10 = defpackage.f.l("DataSpec[");
        int i10 = this.f14549c;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        l10.append(str);
        l10.append(" ");
        l10.append(this.f14547a);
        l10.append(", ");
        l10.append(this.f);
        l10.append(", ");
        l10.append(this.f14552g);
        l10.append(", ");
        l10.append(this.f14553h);
        l10.append(", ");
        return a0.j.m(l10, this.f14554i, "]");
    }
}
