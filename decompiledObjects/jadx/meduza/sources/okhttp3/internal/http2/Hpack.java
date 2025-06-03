package okhttp3.internal.http2;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import defpackage.f;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.internal.http2.Huffman;
import xc.i;
import xc.s;
import xc.y;

/* loaded from: classes.dex */
final class Hpack {

    /* renamed from: a, reason: collision with root package name */
    public static final Header[] f12513a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map<i, Integer> f12514b;

    public static final class Reader {

        /* renamed from: b, reason: collision with root package name */
        public final s f12516b;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12515a = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        public Header[] f12519e = new Header[8];
        public int f = 7;

        /* renamed from: g, reason: collision with root package name */
        public int f12520g = 0;

        /* renamed from: h, reason: collision with root package name */
        public int f12521h = 0;

        /* renamed from: c, reason: collision with root package name */
        public final int f12517c = 4096;

        /* renamed from: d, reason: collision with root package name */
        public int f12518d = 4096;

        public Reader(y yVar) {
            this.f12516b = new s(yVar);
        }

        public final int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f12519e.length;
                while (true) {
                    length--;
                    i11 = this.f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f12519e[length].f12512c;
                    i10 -= i13;
                    this.f12521h -= i13;
                    this.f12520g--;
                    i12++;
                }
                Header[] headerArr = this.f12519e;
                System.arraycopy(headerArr, i11 + 1, headerArr, i11 + 1 + i12, this.f12520g);
                this.f += i12;
            }
            return i12;
        }

        public final i b(int i10) {
            Header header;
            if (!(i10 >= 0 && i10 <= Hpack.f12513a.length - 1)) {
                int length = this.f + 1 + (i10 - Hpack.f12513a.length);
                if (length >= 0) {
                    Header[] headerArr = this.f12519e;
                    if (length < headerArr.length) {
                        header = headerArr[length];
                    }
                }
                StringBuilder l10 = f.l("Header index too large ");
                l10.append(i10 + 1);
                throw new IOException(l10.toString());
            }
            header = Hpack.f12513a[i10];
            return header.f12510a;
        }

        public final void c(Header header) {
            this.f12515a.add(header);
            int i10 = header.f12512c;
            int i11 = this.f12518d;
            if (i10 > i11) {
                Arrays.fill(this.f12519e, (Object) null);
                this.f = this.f12519e.length - 1;
                this.f12520g = 0;
                this.f12521h = 0;
                return;
            }
            a((this.f12521h + i10) - i11);
            int i12 = this.f12520g + 1;
            Header[] headerArr = this.f12519e;
            if (i12 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.f = this.f12519e.length - 1;
                this.f12519e = headerArr2;
            }
            int i13 = this.f;
            this.f = i13 - 1;
            this.f12519e[i13] = header;
            this.f12520g++;
            this.f12521h += i10;
        }

        public final i d() {
            int readByte = this.f12516b.readByte() & 255;
            boolean z10 = (readByte & 128) == 128;
            int e10 = e(readByte, 127);
            if (!z10) {
                return this.f12516b.l(e10);
            }
            Huffman huffman = Huffman.f12637d;
            s sVar = this.f12516b;
            long j10 = e10;
            sVar.u0(j10);
            byte[] b02 = sVar.f17284b.b0(j10);
            huffman.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i10 = 0;
            Huffman.Node node = huffman.f12638a;
            int i11 = 0;
            for (byte b10 : b02) {
                i11 = (i11 << 8) | (b10 & 255);
                i10 += 8;
                while (i10 >= 8) {
                    int i12 = i10 - 8;
                    node = node.f12639a[(i11 >>> i12) & 255];
                    if (node.f12639a == null) {
                        byteArrayOutputStream.write(node.f12640b);
                        i10 -= node.f12641c;
                        node = huffman.f12638a;
                    } else {
                        i10 = i12;
                    }
                }
            }
            while (i10 > 0) {
                Huffman.Node node2 = node.f12639a[(i11 << (8 - i10)) & 255];
                if (node2.f12639a != null || node2.f12641c > i10) {
                    break;
                }
                byteArrayOutputStream.write(node2.f12640b);
                i10 -= node2.f12641c;
                node = huffman.f12638a;
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
                int readByte = this.f12516b.readByte() & 255;
                if ((readByte & 128) == 0) {
                    return i11 + (readByte << i13);
                }
                i11 += (readByte & 127) << i13;
                i13 += 7;
            }
        }
    }

    public static final class Writer {

        /* renamed from: a, reason: collision with root package name */
        public final xc.f f12522a;

        /* renamed from: d, reason: collision with root package name */
        public boolean f12525d;

        /* renamed from: c, reason: collision with root package name */
        public int f12524c = Integer.MAX_VALUE;
        public Header[] f = new Header[8];

        /* renamed from: g, reason: collision with root package name */
        public int f12527g = 7;

        /* renamed from: h, reason: collision with root package name */
        public int f12528h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f12529i = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f12526e = 4096;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f12523b = true;

        public Writer(xc.f fVar) {
            this.f12522a = fVar;
        }

        public final void a(int i10) {
            int i11;
            if (i10 > 0) {
                int length = this.f.length - 1;
                int i12 = 0;
                while (true) {
                    i11 = this.f12527g;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    int i13 = this.f[length].f12512c;
                    i10 -= i13;
                    this.f12529i -= i13;
                    this.f12528h--;
                    i12++;
                    length--;
                }
                Header[] headerArr = this.f;
                int i14 = i11 + 1;
                System.arraycopy(headerArr, i14, headerArr, i14 + i12, this.f12528h);
                Header[] headerArr2 = this.f;
                int i15 = this.f12527g + 1;
                Arrays.fill(headerArr2, i15, i15 + i12, (Object) null);
                this.f12527g += i12;
            }
        }

        public final void b(Header header) {
            int i10 = header.f12512c;
            int i11 = this.f12526e;
            if (i10 > i11) {
                Arrays.fill(this.f, (Object) null);
                this.f12527g = this.f.length - 1;
                this.f12528h = 0;
                this.f12529i = 0;
                return;
            }
            a((this.f12529i + i10) - i11);
            int i12 = this.f12528h + 1;
            Header[] headerArr = this.f;
            if (i12 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.f12527g = this.f.length - 1;
                this.f = headerArr2;
            }
            int i13 = this.f12527g;
            this.f12527g = i13 - 1;
            this.f[i13] = header;
            this.f12528h++;
            this.f12529i += i10;
        }

        public final void c(i iVar) {
            int i10;
            int i11 = 0;
            if (this.f12523b) {
                Huffman.f12637d.getClass();
                long j10 = 0;
                for (int i12 = 0; i12 < iVar.i(); i12++) {
                    j10 += Huffman.f12636c[iVar.n(i12) & 255];
                }
                if (((int) ((j10 + 7) >> 3)) < iVar.i()) {
                    xc.f fVar = new xc.f();
                    Huffman.f12637d.getClass();
                    long j11 = 0;
                    int i13 = 0;
                    while (i11 < iVar.i()) {
                        int n2 = iVar.n(i11) & 255;
                        int i14 = Huffman.f12635b[n2];
                        byte b10 = Huffman.f12636c[n2];
                        j11 = (j11 << b10) | i14;
                        i13 += b10;
                        while (i13 >= 8) {
                            i13 -= 8;
                            fVar.B0((int) (j11 >> i13));
                        }
                        i11++;
                    }
                    if (i13 > 0) {
                        fVar.B0((int) ((255 >>> i13) | (j11 << (8 - i13))));
                    }
                    iVar = fVar.c0();
                    i10 = iVar.i();
                    i11 = 128;
                    e(i10, 127, i11);
                    this.f12522a.z0(iVar);
                }
            }
            i10 = iVar.i();
            e(i10, 127, i11);
            this.f12522a.z0(iVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(java.util.ArrayList r13) {
            /*
                Method dump skipped, instructions count: 237
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.d(java.util.ArrayList):void");
        }

        public final void e(int i10, int i11, int i12) {
            int i13;
            xc.f fVar;
            if (i10 < i11) {
                fVar = this.f12522a;
                i13 = i10 | i12;
            } else {
                this.f12522a.B0(i12 | i11);
                i13 = i10 - i11;
                while (i13 >= 128) {
                    this.f12522a.B0(128 | (i13 & 127));
                    i13 >>>= 7;
                }
                fVar = this.f12522a;
            }
            fVar.B0(i13);
        }
    }

    static {
        Header header = new Header(Header.f12509i, "");
        int i10 = 0;
        i iVar = Header.f;
        i iVar2 = Header.f12507g;
        i iVar3 = Header.f12508h;
        i iVar4 = Header.f12506e;
        Header[] headerArr = {header, new Header(iVar, "GET"), new Header(iVar, "POST"), new Header(iVar2, FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE), new Header(iVar2, "/index.html"), new Header(iVar3, "http"), new Header(iVar3, "https"), new Header(iVar4, "200"), new Header(iVar4, "204"), new Header(iVar4, "206"), new Header(iVar4, "304"), new Header(iVar4, "400"), new Header(iVar4, "404"), new Header(iVar4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        f12513a = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        while (true) {
            Header[] headerArr2 = f12513a;
            if (i10 >= headerArr2.length) {
                f12514b = Collections.unmodifiableMap(linkedHashMap);
                return;
            } else {
                if (!linkedHashMap.containsKey(headerArr2[i10].f12510a)) {
                    linkedHashMap.put(headerArr2[i10].f12510a, Integer.valueOf(i10));
                }
                i10++;
            }
        }
    }

    private Hpack() {
    }

    public static void a(i iVar) {
        int i10 = iVar.i();
        for (int i11 = 0; i11 < i10; i11++) {
            byte n2 = iVar.n(i11);
            if (n2 >= 65 && n2 <= 90) {
                StringBuilder l10 = f.l("PROTOCOL_ERROR response malformed: mixed case name: ");
                l10.append(iVar.t());
                throw new IOException(l10.toString());
            }
        }
    }
}
