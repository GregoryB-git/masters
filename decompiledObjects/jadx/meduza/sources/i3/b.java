package i3;

import a9.d;
import a9.e;
import android.content.Context;
import android.net.ConnectivityManager;
import defpackage.g;
import j3.n;
import java.net.MalformedURLException;
import java.net.URL;
import l3.m;

/* loaded from: classes.dex */
public final class b implements m {

    /* renamed from: a, reason: collision with root package name */
    public final d f7405a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f7406b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f7407c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f7408d;

    /* renamed from: e, reason: collision with root package name */
    public final t3.a f7409e;
    public final t3.a f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7410g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final URL f7411a;

        /* renamed from: b, reason: collision with root package name */
        public final n f7412b;

        /* renamed from: c, reason: collision with root package name */
        public final String f7413c;

        public a(URL url, n nVar, String str) {
            this.f7411a = url;
            this.f7412b = nVar;
            this.f7413c = str;
        }
    }

    /* renamed from: i3.b$b, reason: collision with other inner class name */
    public static final class C0112b {

        /* renamed from: a, reason: collision with root package name */
        public final int f7414a;

        /* renamed from: b, reason: collision with root package name */
        public final URL f7415b;

        /* renamed from: c, reason: collision with root package name */
        public final long f7416c;

        public C0112b(int i10, URL url, long j10) {
            this.f7414a = i10;
            this.f7415b = url;
            this.f7416c = j10;
        }
    }

    public b(Context context, t3.a aVar, t3.a aVar2) {
        e eVar = new e();
        j3.b.f8281a.a(eVar);
        eVar.f245d = true;
        this.f7405a = new d(eVar);
        this.f7407c = context;
        this.f7406b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f7408d = c(i3.a.f7400c);
        this.f7409e = aVar2;
        this.f = aVar;
        this.f7410g = 130000;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(g.d("Invalid url: ", str), e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (j3.w.a.f8377a.get(r0) != null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010a  */
    @Override // l3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k3.h a(k3.n r7) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.b.a(k3.n):k3.h");
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0473 A[Catch: IOException -> 0x04c1, TryCatch #13 {IOException -> 0x04c1, blocks: (B:97:0x02e5, B:98:0x02eb, B:100:0x02f8, B:101:0x0307, B:103:0x034f, B:114:0x0378, B:116:0x038a, B:117:0x0399, B:125:0x03ba, B:127:0x046f, B:129:0x0473, B:131:0x0488, B:134:0x048d, B:136:0x0491, B:145:0x04a7, B:147:0x04af, B:149:0x04b8, B:154:0x03c4, B:165:0x03f7, B:191:0x0417, B:190:0x0414, B:193:0x0418, B:223:0x044e, B:220:0x045f, B:156:0x03c8, B:158:0x03d2, B:163:0x03f2, B:177:0x0409, B:176:0x0406, B:171:0x0400, B:161:0x03da, B:185:0x040e), top: B:96:0x02e5, inners: #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0488 A[Catch: IOException -> 0x04c1, TryCatch #13 {IOException -> 0x04c1, blocks: (B:97:0x02e5, B:98:0x02eb, B:100:0x02f8, B:101:0x0307, B:103:0x034f, B:114:0x0378, B:116:0x038a, B:117:0x0399, B:125:0x03ba, B:127:0x046f, B:129:0x0473, B:131:0x0488, B:134:0x048d, B:136:0x0491, B:145:0x04a7, B:147:0x04af, B:149:0x04b8, B:154:0x03c4, B:165:0x03f7, B:191:0x0417, B:190:0x0414, B:193:0x0418, B:223:0x044e, B:220:0x045f, B:156:0x03c8, B:158:0x03d2, B:163:0x03f2, B:177:0x0409, B:176:0x0406, B:171:0x0400, B:161:0x03da, B:185:0x040e), top: B:96:0x02e5, inners: #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0491 A[Catch: IOException -> 0x04c1, TryCatch #13 {IOException -> 0x04c1, blocks: (B:97:0x02e5, B:98:0x02eb, B:100:0x02f8, B:101:0x0307, B:103:0x034f, B:114:0x0378, B:116:0x038a, B:117:0x0399, B:125:0x03ba, B:127:0x046f, B:129:0x0473, B:131:0x0488, B:134:0x048d, B:136:0x0491, B:145:0x04a7, B:147:0x04af, B:149:0x04b8, B:154:0x03c4, B:165:0x03f7, B:191:0x0417, B:190:0x0414, B:193:0x0418, B:223:0x044e, B:220:0x045f, B:156:0x03c8, B:158:0x03d2, B:163:0x03f2, B:177:0x0409, B:176:0x0406, B:171:0x0400, B:161:0x03da, B:185:0x040e), top: B:96:0x02e5, inners: #4, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x048d A[EDGE_INSN: B:152:0x048d->B:134:0x048d BREAK  A[LOOP:3: B:98:0x02eb->B:151:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0485  */
    @Override // l3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final l3.b b(l3.a r33) {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.b.b(l3.a):l3.b");
    }
}
