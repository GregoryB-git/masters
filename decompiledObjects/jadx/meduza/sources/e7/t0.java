package e7;

import e7.e3;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class t0 extends j0 {

    /* renamed from: d, reason: collision with root package name */
    public String f4655d;

    /* renamed from: e, reason: collision with root package name */
    public String f4656e;
    public int f;

    /* renamed from: o, reason: collision with root package name */
    public String f4657o;

    /* renamed from: p, reason: collision with root package name */
    public String f4658p;

    /* renamed from: q, reason: collision with root package name */
    public long f4659q;

    /* renamed from: r, reason: collision with root package name */
    public long f4660r;

    /* renamed from: s, reason: collision with root package name */
    public List<String> f4661s;
    public String t;

    /* renamed from: u, reason: collision with root package name */
    public int f4662u;

    /* renamed from: v, reason: collision with root package name */
    public String f4663v;

    /* renamed from: w, reason: collision with root package name */
    public String f4664w;

    /* renamed from: x, reason: collision with root package name */
    public String f4665x;

    /* renamed from: y, reason: collision with root package name */
    public long f4666y;

    /* renamed from: z, reason: collision with root package name */
    public String f4667z;

    public t0(j2 j2Var, long j10) {
        super(j2Var);
        this.f4666y = 0L;
        this.f4667z = null;
        this.f4660r = j10;
    }

    @Override // e7.j0
    public final boolean s() {
        return true;
    }

    public final String v() {
        t();
        m6.j.i(this.f4655d);
        return this.f4655d;
    }

    public final String w() {
        l();
        t();
        m6.j.i(this.f4663v);
        return this.f4663v;
    }

    public final void x() {
        String format;
        l();
        if (j().y().j(e3.a.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            k().C0().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzj().f4066v.b("Analytics Storage consent is not granted");
            format = null;
        }
        b1 b1Var = zzj().f4066v;
        Object[] objArr = new Object[1];
        objArr[0] = format == null ? "null" : "not null";
        b1Var.b(String.format("Resetting session stitching token to %s", objArr));
        this.f4665x = format;
        ((b.z) zzb()).getClass();
        this.f4666y = System.currentTimeMillis();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(32:0|1|(1:3)(6:107|108|(1:110)(2:125|(1:127))|111|112|(31:114|(1:116)(1:123)|118|119|5|(1:106)(1:9)|10|11|13|(1:15)(1:96)|16|(1:18)|19|20|21|(1:23)(1:93)|24|(14:89|90|27|(1:29)(1:88)|30|(6:32|(1:34)(1:43)|35|(3:39|40|38)|37|38)|(3:45|(1:47)(1:50)|48)|51|(1:53)(2:85|(5:87|(3:77|78|(1:80)(1:81))|(3:57|(1:59)(3:61|(3:64|(1:66)(1:67)|62)|68)|60)|(1:70)|(2:72|73)(2:75|76)))|54|(0)|(0)|(0)|(0)(0))|26|27|(0)(0)|30|(0)|(0)|51|(0)(0)|54|(0)|(0)|(0)|(0)(0)))|4|5|(1:7)|106|10|11|13|(0)(0)|16|(0)|19|20|21|(0)(0)|24|(0)|26|27|(0)(0)|30|(0)|(0)|51|(0)(0)|54|(0)|(0)|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x019f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a0, code lost:
    
        zzj().f4060o.d("Fetching Google App Id failed with exception. appId", e7.a1.p(r1), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0155 A[Catch: IllegalStateException -> 0x019f, TryCatch #2 {IllegalStateException -> 0x019f, blocks: (B:21:0x011a, B:24:0x0138, B:90:0x013f, B:27:0x0145, B:30:0x014d, B:32:0x0155, B:35:0x0171, B:40:0x017a, B:38:0x0180, B:43:0x016d, B:45:0x0184, B:47:0x0196, B:48:0x019b, B:50:0x0199, B:93:0x0134), top: B:20:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0184 A[Catch: IllegalStateException -> 0x019f, TryCatch #2 {IllegalStateException -> 0x019f, blocks: (B:21:0x011a, B:24:0x0138, B:90:0x013f, B:27:0x0145, B:30:0x014d, B:32:0x0155, B:35:0x0171, B:40:0x017a, B:38:0x0180, B:43:0x016d, B:45:0x0184, B:47:0x0196, B:48:0x019b, B:50:0x0199, B:93:0x0134), top: B:20:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0134 A[Catch: IllegalStateException -> 0x019f, TryCatch #2 {IllegalStateException -> 0x019f, blocks: (B:21:0x011a, B:24:0x0138, B:90:0x013f, B:27:0x0145, B:30:0x014d, B:32:0x0155, B:35:0x0171, B:40:0x017a, B:38:0x0180, B:43:0x016d, B:45:0x0184, B:47:0x0196, B:48:0x019b, B:50:0x0199, B:93:0x0134), top: B:20:0x011a }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y() {
        /*
            Method dump skipped, instructions count: 610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.t0.y():void");
    }
}
