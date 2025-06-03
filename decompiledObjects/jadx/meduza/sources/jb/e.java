package jb;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import jb.f;
import jb.g;
import xc.i;
import xc.s;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final i f8746a;

    /* renamed from: b, reason: collision with root package name */
    public static final d[] f8747b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map<i, Integer> f8748c;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public final s f8750b;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f8749a = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public d[] f8753e = new d[8];
        public int f = 7;

        /* renamed from: g, reason: collision with root package name */
        public int f8754g = 0;

        /* renamed from: h, reason: collision with root package name */
        public int f8755h = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f8751c = 4096;

        /* renamed from: d, reason: collision with root package name */
        public int f8752d = 4096;

        public a(f.a aVar) {
            this.f8750b = new s(aVar);
        }

        public final int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f8753e.length;
                while (true) {
                    length--;
                    i11 = this.f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f8753e[length].f8745c;
                    i10 -= i13;
                    this.f8755h -= i13;
                    this.f8754g--;
                    i12++;
                }
                d[] dVarArr = this.f8753e;
                System.arraycopy(dVarArr, i11 + 1, dVarArr, i11 + 1 + i12, this.f8754g);
                this.f += i12;
            }
            return i12;
        }

        public final i b(int i10) {
            d dVar;
            if (!(i10 >= 0 && i10 <= e.f8747b.length - 1)) {
                int length = this.f + 1 + (i10 - e.f8747b.length);
                if (length >= 0) {
                    d[] dVarArr = this.f8753e;
                    if (length < dVarArr.length) {
                        dVar = dVarArr[length];
                    }
                }
                StringBuilder l10 = defpackage.f.l("Header index too large ");
                l10.append(i10 + 1);
                throw new IOException(l10.toString());
            }
            dVar = e.f8747b[i10];
            return dVar.f8743a;
        }

        public final void c(d dVar) {
            this.f8749a.add(dVar);
            int i10 = dVar.f8745c;
            int i11 = this.f8752d;
            if (i10 > i11) {
                Arrays.fill(this.f8753e, (Object) null);
                this.f = this.f8753e.length - 1;
                this.f8754g = 0;
                this.f8755h = 0;
                return;
            }
            a((this.f8755h + i10) - i11);
            int i12 = this.f8754g + 1;
            d[] dVarArr = this.f8753e;
            if (i12 > dVarArr.length) {
                d[] dVarArr2 = new d[dVarArr.length * 2];
                System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                this.f = this.f8753e.length - 1;
                this.f8753e = dVarArr2;
            }
            int i13 = this.f;
            this.f = i13 - 1;
            this.f8753e[i13] = dVar;
            this.f8754g++;
            this.f8755h += i10;
        }

        public final i d() {
            int readByte = this.f8750b.readByte() & 255;
            boolean z10 = (readByte & 128) == 128;
            int e10 = e(readByte, 127);
            if (!z10) {
                return this.f8750b.l(e10);
            }
            g gVar = g.f8781d;
            s sVar = this.f8750b;
            long j10 = e10;
            sVar.u0(j10);
            byte[] b02 = sVar.f17284b.b0(j10);
            gVar.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i10 = 0;
            g.a aVar = gVar.f8782a;
            int i11 = 0;
            for (byte b10 : b02) {
                i11 = (i11 << 8) | (b10 & 255);
                i10 += 8;
                while (i10 >= 8) {
                    int i12 = i10 - 8;
                    aVar = aVar.f8783a[(i11 >>> i12) & 255];
                    if (aVar.f8783a == null) {
                        byteArrayOutputStream.write(aVar.f8784b);
                        i10 -= aVar.f8785c;
                        aVar = gVar.f8782a;
                    } else {
                        i10 = i12;
                    }
                }
            }
            while (i10 > 0) {
                g.a aVar2 = aVar.f8783a[(i11 << (8 - i10)) & 255];
                if (aVar2.f8783a != null || aVar2.f8785c > i10) {
                    break;
                }
                byteArrayOutputStream.write(aVar2.f8784b);
                i10 -= aVar2.f8785c;
                aVar = gVar.f8782a;
            }
            return i.o(byteArrayOutputStream.toByteArray());
        }

        public final int e(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int readByte = this.f8750b.readByte() & 255;
                if ((readByte & 128) == 0) {
                    return i11 + (readByte << i13);
                }
                i11 += (readByte & 127) << i13;
                i13 += 7;
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final xc.f f8756a;

        /* renamed from: c, reason: collision with root package name */
        public int f8758c;

        /* renamed from: e, reason: collision with root package name */
        public int f8760e;

        /* renamed from: b, reason: collision with root package name */
        public d[] f8757b = new d[8];

        /* renamed from: d, reason: collision with root package name */
        public int f8759d = 7;

        public b(xc.f fVar) {
            this.f8756a = fVar;
        }

        public final void a(int i10, int i11, int i12) {
            int i13;
            xc.f fVar;
            if (i10 < i11) {
                fVar = this.f8756a;
                i13 = i10 | i12;
            } else {
                this.f8756a.B0(i12 | i11);
                i13 = i10 - i11;
                while (i13 >= 128) {
                    this.f8756a.B0(128 | (i13 & 127));
                    i13 >>>= 7;
                }
                fVar = this.f8756a;
            }
            fVar.B0(i13);
        }
    }

    static {
        i iVar = i.f17259d;
        f8746a = i.a.a(":");
        d dVar = new d(d.f8742h, "");
        int i10 = 0;
        i iVar2 = d.f8740e;
        i iVar3 = d.f;
        i iVar4 = d.f8741g;
        i iVar5 = d.f8739d;
        f8747b = new d[]{dVar, new d(iVar2, "GET"), new d(iVar2, "POST"), new d(iVar3, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE), new d(iVar3, "/index.html"), new d(iVar4, "http"), new d(iVar4, "https"), new d(iVar5, "200"), new d(iVar5, "204"), new d(iVar5, "206"), new d(iVar5, "304"), new d(iVar5, "400"), new d(iVar5, "404"), new d(iVar5, "500"), new d("accept-charset", ""), new d("accept-encoding", "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d("content-encoding", ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d("from", ""), new d(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d("link", ""), new d("location", ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (true) {
            d[] dVarArr = f8747b;
            if (i10 >= dVarArr.length) {
                f8748c = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(dVarArr[i10].f8743a)) {
                    linkedHashMap.put(dVarArr[i10].f8743a, Integer.valueOf(i10));
                }
                i10++;
            }
        }
    }

    public static void a(i iVar) {
        int i10 = iVar.i();
        for (int i11 = 0; i11 < i10; i11++) {
            byte n2 = iVar.n(i11);
            if (n2 >= 65 && n2 <= 90) {
                StringBuilder l10 = defpackage.f.l("PROTOCOL_ERROR response malformed: mixed case name: ");
                l10.append(iVar.t());
                throw new IOException(l10.toString());
            }
        }
    }
}
