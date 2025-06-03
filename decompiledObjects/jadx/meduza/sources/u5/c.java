package u5;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t5.g0;
import t5.k0;
import t5.l0;
import t5.v;
import u5.a;
import v5.e0;

/* loaded from: classes.dex */
public final class c implements t5.k {

    /* renamed from: a, reason: collision with root package name */
    public final u5.a f14986a;

    /* renamed from: b, reason: collision with root package name */
    public final t5.k f14987b;

    /* renamed from: c, reason: collision with root package name */
    public final k0 f14988c;

    /* renamed from: d, reason: collision with root package name */
    public final t5.k f14989d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14990e = true;
    public final boolean f = true;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14991g = false;

    /* renamed from: h, reason: collision with root package name */
    public Uri f14992h;

    /* renamed from: i, reason: collision with root package name */
    public t5.n f14993i;

    /* renamed from: j, reason: collision with root package name */
    public t5.n f14994j;

    /* renamed from: k, reason: collision with root package name */
    public t5.k f14995k;

    /* renamed from: l, reason: collision with root package name */
    public long f14996l;

    /* renamed from: m, reason: collision with root package name */
    public long f14997m;

    /* renamed from: n, reason: collision with root package name */
    public long f14998n;

    /* renamed from: o, reason: collision with root package name */
    public g f14999o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f15000p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f15001q;

    /* renamed from: r, reason: collision with root package name */
    public long f15002r;

    /* renamed from: s, reason: collision with root package name */
    public long f15003s;

    public interface a {
        void a();

        void b();
    }

    public c(q qVar, t5.r rVar, v vVar, b bVar) {
        this.f14986a = qVar;
        this.f14987b = vVar;
        k0 k0Var = null;
        if (rVar != null) {
            this.f14989d = rVar;
            k0Var = new k0(rVar, bVar);
        } else {
            this.f14989d = g0.f14502a;
        }
        this.f14988c = k0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // t5.k
    public final long a(t5.n nVar) {
        String str;
        Uri uri;
        long j10;
        int i10;
        byte[] bArr;
        Map<String, String> map;
        long j11;
        long j12;
        int i11;
        Object obj;
        try {
            String str2 = nVar.f14553h;
            str = str2 != null ? str2 : nVar.f14547a.toString();
            uri = nVar.f14547a;
            j10 = nVar.f14548b;
            i10 = nVar.f14549c;
            bArr = nVar.f14550d;
            map = nVar.f14551e;
            j11 = nVar.f;
            j12 = nVar.f14552g;
            i11 = nVar.f14554i;
            obj = nVar.f14555j;
        } catch (Throwable th) {
            th = th;
            str = null;
        }
        try {
            if (uri == null) {
                throw new IllegalStateException("The uri must be set.");
            }
            t5.n nVar2 = new t5.n(uri, j10, i10, bArr, map, j11, j12, str, i11, obj);
            this.f14993i = nVar2;
            u5.a aVar = this.f14986a;
            Uri uri2 = nVar2.f14547a;
            byte[] bArr2 = aVar.c(str).f15050b.get("exo_redir");
            Uri uri3 = null;
            String str3 = bArr2 != null ? new String(bArr2, n7.d.f11284c) : null;
            if (str3 != null) {
                uri3 = Uri.parse(str3);
            }
            if (uri3 != null) {
                uri2 = uri3;
            }
            this.f14992h = uri2;
            this.f14997m = nVar.f;
            this.f15001q = ((!this.f || !this.f15000p) ? (!this.f14991g || (nVar.f14552g > (-1L) ? 1 : (nVar.f14552g == (-1L) ? 0 : -1)) != 0) ? (char) 65535 : (char) 1 : (char) 0) != 65535;
            if (this.f15001q) {
                this.f14998n = -1L;
            } else {
                long d10 = defpackage.f.d(this.f14986a.c(str));
                this.f14998n = d10;
                if (d10 != -1) {
                    long j13 = d10 - nVar.f;
                    this.f14998n = j13;
                    if (j13 < 0) {
                        throw new t5.l(2008);
                    }
                }
            }
            long j14 = nVar.f14552g;
            if (j14 != -1) {
                long j15 = this.f14998n;
                if (j15 != -1) {
                    j14 = Math.min(j15, j14);
                }
                this.f14998n = j14;
            }
            long j16 = this.f14998n;
            if (j16 > 0 || j16 == -1) {
                p(nVar2, false);
            }
            long j17 = nVar.f14552g;
            return j17 != -1 ? j17 : this.f14998n;
        } catch (Throwable th2) {
            th = th2;
            ?? r22 = str;
            if (this.f14995k == this.f14987b) {
                r22 = 1;
            }
            if (r22 != 0 || (th instanceof a.C0242a)) {
                this.f15000p = true;
            }
            throw th;
        }
    }

    @Override // t5.k
    public final void close() {
        this.f14993i = null;
        this.f14992h = null;
        this.f14997m = 0L;
        try {
            o();
        } catch (Throwable th) {
            if ((this.f14995k == this.f14987b) || (th instanceof a.C0242a)) {
                this.f15000p = true;
            }
            throw th;
        }
    }

    @Override // t5.k
    public final void f(l0 l0Var) {
        l0Var.getClass();
        this.f14987b.f(l0Var);
        this.f14989d.f(l0Var);
    }

    @Override // t5.k
    public final Map<String, List<String>> h() {
        return (this.f14995k == this.f14987b) ^ true ? this.f14989d.h() : Collections.emptyMap();
    }

    @Override // t5.k
    public final Uri l() {
        return this.f14992h;
    }

    public final void o() {
        t5.k kVar = this.f14995k;
        if (kVar == null) {
            return;
        }
        try {
            kVar.close();
        } finally {
            this.f14994j = null;
            this.f14995k = null;
            g gVar = this.f14999o;
            if (gVar != null) {
                this.f14986a.b(gVar);
                this.f14999o = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(t5.n r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.c.p(t5.n, boolean):void");
    }

    @Override // t5.h
    public final int read(byte[] bArr, int i10, int i11) {
        int i12;
        if (i11 == 0) {
            return 0;
        }
        if (this.f14998n == 0) {
            return -1;
        }
        t5.n nVar = this.f14993i;
        nVar.getClass();
        t5.n nVar2 = this.f14994j;
        nVar2.getClass();
        try {
            if (this.f14997m >= this.f15003s) {
                p(nVar, true);
            }
            t5.k kVar = this.f14995k;
            kVar.getClass();
            int read = kVar.read(bArr, i10, i11);
            if (read != -1) {
                if (this.f14995k == this.f14987b) {
                    this.f15002r += read;
                }
                long j10 = read;
                this.f14997m += j10;
                this.f14996l += j10;
                long j11 = this.f14998n;
                if (j11 != -1) {
                    this.f14998n = j11 - j10;
                }
                return read;
            }
            t5.k kVar2 = this.f14995k;
            if (!(kVar2 == this.f14987b)) {
                long j12 = nVar2.f14552g;
                if (j12 != -1) {
                    i12 = read;
                    if (this.f14996l < j12) {
                    }
                } else {
                    i12 = read;
                }
                String str = nVar.f14553h;
                int i13 = e0.f15881a;
                this.f14998n = 0L;
                if (!(kVar2 == this.f14988c)) {
                    return i12;
                }
                l lVar = new l();
                Long valueOf = Long.valueOf(this.f14997m);
                HashMap hashMap = lVar.f15046a;
                valueOf.getClass();
                hashMap.put("exo_len", valueOf);
                lVar.f15047b.remove("exo_len");
                this.f14986a.f(str, lVar);
                return i12;
            }
            i12 = read;
            long j13 = this.f14998n;
            if (j13 <= 0 && j13 != -1) {
                return i12;
            }
            o();
            p(nVar, false);
            return read(bArr, i10, i11);
        } catch (Throwable th) {
            if ((this.f14995k == this.f14987b) || (th instanceof a.C0242a)) {
                this.f15000p = true;
            }
            throw th;
        }
    }
}
