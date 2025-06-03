package ad;

import a0.j;
import defpackage.f;
import ec.i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f393a;

    /* renamed from: b, reason: collision with root package name */
    public String f394b;

    /* renamed from: c, reason: collision with root package name */
    public a f395c;

    /* renamed from: d, reason: collision with root package name */
    public int f396d;

    /* renamed from: e, reason: collision with root package name */
    public String f397e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public String f398g;

    /* renamed from: h, reason: collision with root package name */
    public String f399h;

    /* renamed from: i, reason: collision with root package name */
    public String f400i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f401j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f402k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f403l;

    /* renamed from: m, reason: collision with root package name */
    public long f404m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f405n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f406o;

    public b(int i10, String str, a aVar, int i11, String str2, String str3, String str4, String str5, String str6, boolean z10, boolean z11, boolean z12, long j10, boolean z13, boolean z14) {
        i.e(aVar, "status");
        this.f393a = i10;
        this.f394b = str;
        this.f395c = aVar;
        this.f396d = i11;
        this.f397e = str2;
        this.f = str3;
        this.f398g = str4;
        this.f399h = str5;
        this.f400i = str6;
        this.f401j = z10;
        this.f402k = z11;
        this.f403l = z12;
        this.f404m = j10;
        this.f405n = z13;
        this.f406o = z14;
    }

    public final int a() {
        return this.f396d;
    }

    public final boolean b() {
        return this.f401j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f393a == bVar.f393a && i.a(this.f394b, bVar.f394b) && this.f395c == bVar.f395c && this.f396d == bVar.f396d && i.a(this.f397e, bVar.f397e) && i.a(this.f, bVar.f) && i.a(this.f398g, bVar.f398g) && i.a(this.f399h, bVar.f399h) && i.a(this.f400i, bVar.f400i) && this.f401j == bVar.f401j && this.f402k == bVar.f402k && this.f403l == bVar.f403l && this.f404m == bVar.f404m && this.f405n == bVar.f405n && this.f406o == bVar.f406o;
    }

    public final int hashCode() {
        int e10 = j.e(this.f397e, (((this.f395c.hashCode() + j.e(this.f394b, this.f393a * 31, 31)) * 31) + this.f396d) * 31, 31);
        String str = this.f;
        int e11 = (((j.e(this.f400i, j.e(this.f399h, j.e(this.f398g, (e10 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31) + (this.f401j ? 1231 : 1237)) * 31) + (this.f402k ? 1231 : 1237)) * 31;
        int i10 = this.f403l ? 1231 : 1237;
        long j10 = this.f404m;
        return ((((((e11 + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f405n ? 1231 : 1237)) * 31) + (this.f406o ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder l10 = f.l("DownloadTask(primaryId=");
        l10.append(this.f393a);
        l10.append(", taskId=");
        l10.append(this.f394b);
        l10.append(", status=");
        l10.append(this.f395c);
        l10.append(", progress=");
        l10.append(this.f396d);
        l10.append(", url=");
        l10.append(this.f397e);
        l10.append(", filename=");
        l10.append(this.f);
        l10.append(", savedDir=");
        l10.append(this.f398g);
        l10.append(", headers=");
        l10.append(this.f399h);
        l10.append(", mimeType=");
        l10.append(this.f400i);
        l10.append(", resumable=");
        l10.append(this.f401j);
        l10.append(", showNotification=");
        l10.append(this.f402k);
        l10.append(", openFileFromNotification=");
        l10.append(this.f403l);
        l10.append(", timeCreated=");
        l10.append(this.f404m);
        l10.append(", saveInPublicStorage=");
        l10.append(this.f405n);
        l10.append(", allowCellular=");
        l10.append(this.f406o);
        l10.append(')');
        return l10.toString();
    }
}
