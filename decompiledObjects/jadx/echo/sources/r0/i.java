package r0;

import B0.p;
import Z0.o;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import com.android.installreferrer.api.InstallReferrerClient;
import d0.AbstractC1184g;
import d0.AbstractC1203z;
import d0.C1162A;
import d0.C1190m;
import d0.C1194q;
import d0.C1201x;
import g0.AbstractC1297a;
import g0.G;
import g0.M;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q0.t;
import r0.f;
import r0.g;

/* loaded from: classes.dex */
public final class i implements p.a {

    /* renamed from: a, reason: collision with root package name */
    public final g f19068a;

    /* renamed from: b, reason: collision with root package name */
    public final f f19069b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f19044c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f19045d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f19046e = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f19047f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f19048g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f19049h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f19050i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f19051j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f19052k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f19053l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f19054m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f19055n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f19056o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f19057p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f19058q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f19059r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f19060s = c("CAN-SKIP-DATERANGES");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f19061t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f19062u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f19063v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f19064w = c("CAN-BLOCK-RELOAD");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f19065x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f19066y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f19067z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: A, reason: collision with root package name */
    public static final Pattern f19016A = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: B, reason: collision with root package name */
    public static final Pattern f19017B = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: C, reason: collision with root package name */
    public static final Pattern f19018C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: D, reason: collision with root package name */
    public static final Pattern f19019D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: E, reason: collision with root package name */
    public static final Pattern f19020E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: F, reason: collision with root package name */
    public static final Pattern f19021F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: G, reason: collision with root package name */
    public static final Pattern f19022G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: H, reason: collision with root package name */
    public static final Pattern f19023H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: I, reason: collision with root package name */
    public static final Pattern f19024I = Pattern.compile("KEYFORMAT=\"(.+?)\"");

    /* renamed from: J, reason: collision with root package name */
    public static final Pattern f19025J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");

    /* renamed from: K, reason: collision with root package name */
    public static final Pattern f19026K = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: L, reason: collision with root package name */
    public static final Pattern f19027L = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: M, reason: collision with root package name */
    public static final Pattern f19028M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: N, reason: collision with root package name */
    public static final Pattern f19029N = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: O, reason: collision with root package name */
    public static final Pattern f19030O = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: P, reason: collision with root package name */
    public static final Pattern f19031P = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: Q, reason: collision with root package name */
    public static final Pattern f19032Q = Pattern.compile("GROUP-ID=\"(.+?)\"");

    /* renamed from: R, reason: collision with root package name */
    public static final Pattern f19033R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");

    /* renamed from: S, reason: collision with root package name */
    public static final Pattern f19034S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: T, reason: collision with root package name */
    public static final Pattern f19035T = c("AUTOSELECT");

    /* renamed from: U, reason: collision with root package name */
    public static final Pattern f19036U = c("DEFAULT");

    /* renamed from: V, reason: collision with root package name */
    public static final Pattern f19037V = c("FORCED");

    /* renamed from: W, reason: collision with root package name */
    public static final Pattern f19038W = c("INDEPENDENT");

    /* renamed from: X, reason: collision with root package name */
    public static final Pattern f19039X = c("GAP");

    /* renamed from: Y, reason: collision with root package name */
    public static final Pattern f19040Y = c("PRECISE");

    /* renamed from: Z, reason: collision with root package name */
    public static final Pattern f19041Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: a0, reason: collision with root package name */
    public static final Pattern f19042a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: b0, reason: collision with root package name */
    public static final Pattern f19043b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class a extends IOException {
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final BufferedReader f19070a;

        /* renamed from: b, reason: collision with root package name */
        public final Queue f19071b;

        /* renamed from: c, reason: collision with root package name */
        public String f19072c;

        public b(Queue queue, BufferedReader bufferedReader) {
            this.f19071b = queue;
            this.f19070a = bufferedReader;
        }

        public boolean a() {
            String trim;
            if (this.f19072c != null) {
                return true;
            }
            if (!this.f19071b.isEmpty()) {
                this.f19072c = (String) AbstractC1297a.e((String) this.f19071b.poll());
                return true;
            }
            do {
                String readLine = this.f19070a.readLine();
                this.f19072c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f19072c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.f19072c;
            this.f19072c = null;
            return str;
        }
    }

    public i() {
        this(g.f18992n, null);
    }

    public static long A(String str, Pattern pattern) {
        return new BigDecimal(z(str, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
    }

    public static String B(String str, Map map) {
        Matcher matcher = f19043b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static int C(BufferedReader bufferedReader, boolean z7, int i7) {
        while (i7 != -1 && Character.isWhitespace(i7) && (z7 || !M.C0(i7))) {
            i7 = bufferedReader.read();
        }
        return i7;
    }

    public static boolean b(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int C7 = C(bufferedReader, true, read);
        for (int i7 = 0; i7 < 7; i7++) {
            if (C7 != "#EXTM3U".charAt(i7)) {
                return false;
            }
            C7 = bufferedReader.read();
        }
        return M.C0(C(bufferedReader, false, C7));
    }

    public static Pattern c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    public static C1190m d(String str, C1190m.b[] bVarArr) {
        C1190m.b[] bVarArr2 = new C1190m.b[bVarArr.length];
        for (int i7 = 0; i7 < bVarArr.length; i7++) {
            bVarArr2[i7] = bVarArr[i7].b(null);
        }
        return new C1190m(str, bVarArr2);
    }

    public static String e(long j7, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j7);
    }

    public static g.b f(ArrayList arrayList, String str) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            g.b bVar = (g.b) arrayList.get(i7);
            if (str.equals(bVar.f19010d)) {
                return bVar;
            }
        }
        return null;
    }

    public static g.b g(ArrayList arrayList, String str) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            g.b bVar = (g.b) arrayList.get(i7);
            if (str.equals(bVar.f19011e)) {
                return bVar;
            }
        }
        return null;
    }

    public static g.b h(ArrayList arrayList, String str) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            g.b bVar = (g.b) arrayList.get(i7);
            if (str.equals(bVar.f19009c)) {
                return bVar;
            }
        }
        return null;
    }

    public static double j(String str, Pattern pattern) {
        return Double.parseDouble(z(str, pattern, Collections.emptyMap()));
    }

    public static C1190m.b k(String str, String str2, Map map) {
        String u7 = u(str, f19025J, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String z7 = z(str, f19026K, map);
            return new C1190m.b(AbstractC1184g.f12618d, "video/mp4", Base64.decode(z7.substring(z7.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new C1190m.b(AbstractC1184g.f12618d, "hls", M.r0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(u7)) {
            return null;
        }
        String z8 = z(str, f19026K, map);
        byte[] decode = Base64.decode(z8.substring(z8.indexOf(44)), 0);
        UUID uuid = AbstractC1184g.f12619e;
        return new C1190m.b(uuid, "video/mp4", o.a(uuid, decode));
    }

    public static String l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    public static int m(String str, Pattern pattern) {
        return Integer.parseInt(z(str, pattern, Collections.emptyMap()));
    }

    public static long n(String str, Pattern pattern) {
        return Long.parseLong(z(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:0x01c6, code lost:
    
        if (r12 != null) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static r0.f o(r0.g r92, r0.f r93, r0.i.b r94, java.lang.String r95) {
        /*
            Method dump skipped, instructions count: 1798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.i.o(r0.g, r0.f, r0.i$b, java.lang.String):r0.f");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    public static g p(b bVar, String str) {
        char c7;
        C1194q c1194q;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        ArrayList arrayList3;
        int parseInt;
        String str3;
        String str4;
        int i7;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i8;
        int i9;
        ArrayList arrayList9;
        ArrayList arrayList10;
        String B7;
        HashMap hashMap;
        int i10;
        String str5 = str;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        boolean z7 = false;
        boolean z8 = false;
        while (true) {
            String str6 = "application/x-mpegURL";
            if (!bVar.a()) {
                HashMap hashMap4 = hashMap2;
                ArrayList arrayList19 = arrayList12;
                ArrayList arrayList20 = arrayList13;
                ArrayList arrayList21 = arrayList14;
                ArrayList arrayList22 = arrayList15;
                ArrayList arrayList23 = arrayList16;
                ArrayList arrayList24 = arrayList18;
                ArrayList arrayList25 = arrayList17;
                boolean z9 = z7;
                ArrayList arrayList26 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i11 = 0;
                while (i11 < arrayList11.size()) {
                    g.b bVar2 = (g.b) arrayList11.get(i11);
                    if (hashSet.add(bVar2.f19007a)) {
                        AbstractC1297a.f(bVar2.f19008b.f12723k == null);
                        i7 = 1;
                        arrayList26.add(bVar2.a(bVar2.f19008b.a().h0(new C1201x(new t(null, null, (List) AbstractC1297a.e((ArrayList) hashMap4.get(bVar2.f19007a))))).K()));
                    } else {
                        i7 = 1;
                    }
                    i11 += i7;
                }
                Uri uri = null;
                ArrayList arrayList27 = null;
                C1194q c1194q2 = null;
                int i12 = 0;
                while (i12 < arrayList23.size()) {
                    ArrayList arrayList28 = arrayList23;
                    String str7 = (String) arrayList28.get(i12);
                    String z10 = z(str7, f19032Q, hashMap3);
                    String z11 = z(str7, f19031P, hashMap3);
                    C1194q.b e02 = new C1194q.b().a0(z10 + ":" + z11).c0(z11).Q(str6).q0(x(str7)).m0(w(str7, hashMap3)).e0(v(str7, f19030O, hashMap3));
                    String v7 = v(str7, f19026K, hashMap3);
                    Uri f7 = v7 == null ? uri : G.f(str, v7);
                    arrayList23 = arrayList28;
                    String str8 = str6;
                    C1201x c1201x = new C1201x(new t(z10, z11, Collections.emptyList()));
                    String z12 = z(str7, f19028M, hashMap3);
                    z12.hashCode();
                    switch (z12.hashCode()) {
                        case -959297733:
                            if (z12.equals("SUBTITLES")) {
                                c7 = 0;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case -333210994:
                            if (z12.equals("CLOSED-CAPTIONS")) {
                                c7 = 1;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 62628790:
                            if (z12.equals("AUDIO")) {
                                c7 = 2;
                                break;
                            }
                            c7 = 65535;
                            break;
                        case 81665115:
                            if (z12.equals("VIDEO")) {
                                c7 = 3;
                                break;
                            }
                            c7 = 65535;
                            break;
                        default:
                            c7 = 65535;
                            break;
                    }
                    switch (c7) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            c1194q = c1194q2;
                            arrayList = arrayList20;
                            arrayList2 = arrayList19;
                            g.b g7 = g(arrayList11, z10);
                            if (g7 != null) {
                                String Q6 = M.Q(g7.f19008b.f12722j, 3);
                                e02.O(Q6);
                                str2 = AbstractC1203z.g(Q6);
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                                str2 = "text/vtt";
                            }
                            e02.o0(str2).h0(c1201x);
                            if (f7 == null) {
                                arrayList3 = arrayList21;
                                g0.o.h("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                break;
                            } else {
                                g.a aVar = new g.a(f7, e02.K(), z10, z11);
                                arrayList3 = arrayList21;
                                arrayList3.add(aVar);
                                break;
                            }
                        case 1:
                            c1194q = c1194q2;
                            arrayList = arrayList20;
                            arrayList2 = arrayList19;
                            String z13 = z(str7, f19034S, hashMap3);
                            if (z13.startsWith("CC")) {
                                parseInt = Integer.parseInt(z13.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(z13.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (arrayList27 == null) {
                                arrayList27 = new ArrayList();
                            }
                            e02.o0(str3).L(parseInt);
                            arrayList27.add(e02.K());
                            arrayList3 = arrayList21;
                            break;
                        case 2:
                            arrayList2 = arrayList19;
                            g.b f8 = f(arrayList11, z10);
                            if (f8 != null) {
                                c1194q = c1194q2;
                                String Q7 = M.Q(f8.f19008b.f12722j, 1);
                                e02.O(Q7);
                                str4 = AbstractC1203z.g(Q7);
                            } else {
                                c1194q = c1194q2;
                                str4 = null;
                            }
                            String v8 = v(str7, f19050i, hashMap3);
                            if (v8 != null) {
                                e02.N(Integer.parseInt(M.c1(v8, "/")[0]));
                                if ("audio/eac3".equals(str4) && v8.endsWith("/JOC")) {
                                    e02.O("ec+3");
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            e02.o0(str4);
                            if (f7 != null) {
                                e02.h0(c1201x);
                                arrayList = arrayList20;
                                arrayList.add(new g.a(f7, e02.K(), z10, z11));
                            } else {
                                arrayList = arrayList20;
                                if (f8 != null) {
                                    c1194q = e02.K();
                                }
                            }
                            arrayList3 = arrayList21;
                            break;
                        case 3:
                            g.b h7 = h(arrayList11, z10);
                            if (h7 != null) {
                                C1194q c1194q3 = h7.f19008b;
                                String Q8 = M.Q(c1194q3.f12722j, 2);
                                e02.O(Q8).o0(AbstractC1203z.g(Q8)).v0(c1194q3.f12732t).Y(c1194q3.f12733u).X(c1194q3.f12734v);
                            }
                            if (f7 != null) {
                                e02.h0(c1201x);
                                arrayList2 = arrayList19;
                                arrayList2.add(new g.a(f7, e02.K(), z10, z11));
                                c1194q = c1194q2;
                                arrayList3 = arrayList21;
                                arrayList = arrayList20;
                                break;
                            }
                        default:
                            c1194q = c1194q2;
                            arrayList3 = arrayList21;
                            arrayList = arrayList20;
                            arrayList2 = arrayList19;
                            break;
                    }
                    i12++;
                    arrayList21 = arrayList3;
                    arrayList20 = arrayList;
                    arrayList19 = arrayList2;
                    str6 = str8;
                    c1194q2 = c1194q;
                    uri = null;
                }
                return new g(str, arrayList24, arrayList26, arrayList19, arrayList20, arrayList21, arrayList22, c1194q2, z8 ? Collections.emptyList() : arrayList27, z9, hashMap3, arrayList25);
            }
            String b7 = bVar.b();
            if (b7.startsWith("#EXT")) {
                arrayList18.add(b7);
            }
            boolean startsWith = b7.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            boolean z14 = z7;
            if (b7.startsWith("#EXT-X-DEFINE")) {
                hashMap3.put(z(b7, f19031P, hashMap3), z(b7, f19041Z, hashMap3));
            } else {
                if (b7.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    hashMap = hashMap2;
                    arrayList9 = arrayList12;
                    arrayList8 = arrayList13;
                    arrayList7 = arrayList14;
                    arrayList4 = arrayList15;
                    arrayList10 = arrayList16;
                    arrayList6 = arrayList18;
                    arrayList5 = arrayList17;
                    z7 = true;
                } else if (b7.startsWith("#EXT-X-MEDIA")) {
                    arrayList16.add(b7);
                } else {
                    if (b7.startsWith("#EXT-X-SESSION-KEY")) {
                        C1190m.b k7 = k(b7, u(b7, f19024I, "identity", hashMap3), hashMap3);
                        if (k7 != null) {
                            arrayList4 = arrayList15;
                            arrayList17.add(new C1190m(l(z(b7, f19023H, hashMap3)), k7));
                        }
                    } else {
                        arrayList4 = arrayList15;
                        if (b7.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                            boolean contains = z8 | b7.contains("CLOSED-CAPTIONS=NONE");
                            int i13 = startsWith ? 16384 : 0;
                            int m7 = m(b7, f19049h);
                            arrayList5 = arrayList17;
                            int s7 = s(b7, f19044c, -1);
                            String v9 = v(b7, f19051j, hashMap3);
                            arrayList6 = arrayList18;
                            String v10 = v(b7, f19052k, hashMap3);
                            arrayList7 = arrayList14;
                            if (v10 != null) {
                                String[] b12 = M.b1(v10, "x");
                                int parseInt2 = Integer.parseInt(b12[0]);
                                int parseInt3 = Integer.parseInt(b12[1]);
                                if (parseInt2 <= 0 || parseInt3 <= 0) {
                                    parseInt3 = -1;
                                    i10 = -1;
                                } else {
                                    i10 = parseInt2;
                                }
                                arrayList8 = arrayList13;
                                i9 = parseInt3;
                                i8 = i10;
                            } else {
                                arrayList8 = arrayList13;
                                i8 = -1;
                                i9 = -1;
                            }
                            String v11 = v(b7, f19053l, hashMap3);
                            float parseFloat = v11 != null ? Float.parseFloat(v11) : -1.0f;
                            arrayList9 = arrayList12;
                            String v12 = v(b7, f19045d, hashMap3);
                            arrayList10 = arrayList16;
                            String v13 = v(b7, f19046e, hashMap3);
                            HashMap hashMap5 = hashMap2;
                            String v14 = v(b7, f19047f, hashMap3);
                            String v15 = v(b7, f19048g, hashMap3);
                            if (startsWith) {
                                B7 = z(b7, f19026K, hashMap3);
                            } else {
                                if (!bVar.a()) {
                                    throw C1162A.c("#EXT-X-STREAM-INF must be followed by another line", null);
                                }
                                B7 = B(bVar.b(), hashMap3);
                            }
                            Uri f9 = G.f(str5, B7);
                            arrayList11.add(new g.b(f9, new C1194q.b().Z(arrayList11.size()).Q("application/x-mpegURL").O(v9).M(s7).j0(m7).v0(i8).Y(i9).X(parseFloat).m0(i13).K(), v12, v13, v14, v15));
                            hashMap = hashMap5;
                            ArrayList arrayList29 = (ArrayList) hashMap.get(f9);
                            if (arrayList29 == null) {
                                arrayList29 = new ArrayList();
                                hashMap.put(f9, arrayList29);
                            }
                            arrayList29.add(new t.b(s7, m7, v12, v13, v14, v15));
                            z7 = z14;
                            z8 = contains;
                        }
                    }
                    hashMap = hashMap2;
                    arrayList9 = arrayList12;
                    arrayList8 = arrayList13;
                    arrayList7 = arrayList14;
                    arrayList10 = arrayList16;
                    arrayList6 = arrayList18;
                    arrayList5 = arrayList17;
                    z7 = z14;
                }
                hashMap2 = hashMap;
                arrayList15 = arrayList4;
                arrayList17 = arrayList5;
                arrayList18 = arrayList6;
                arrayList14 = arrayList7;
                arrayList13 = arrayList8;
                arrayList12 = arrayList9;
                arrayList16 = arrayList10;
                str5 = str;
            }
            arrayList4 = arrayList15;
            hashMap = hashMap2;
            arrayList9 = arrayList12;
            arrayList8 = arrayList13;
            arrayList7 = arrayList14;
            arrayList10 = arrayList16;
            arrayList6 = arrayList18;
            arrayList5 = arrayList17;
            z7 = z14;
            hashMap2 = hashMap;
            arrayList15 = arrayList4;
            arrayList17 = arrayList5;
            arrayList18 = arrayList6;
            arrayList14 = arrayList7;
            arrayList13 = arrayList8;
            arrayList12 = arrayList9;
            arrayList16 = arrayList10;
            str5 = str;
        }
    }

    public static boolean q(String str, Pattern pattern, boolean z7) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z7;
    }

    public static double r(String str, Pattern pattern, double d7) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) AbstractC1297a.e(matcher.group(1))) : d7;
    }

    public static int s(String str, Pattern pattern, int i7) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) AbstractC1297a.e(matcher.group(1))) : i7;
    }

    public static long t(String str, Pattern pattern, long j7) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) AbstractC1297a.e(matcher.group(1))) : j7;
    }

    public static String u(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) AbstractC1297a.e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : B(str2, map);
    }

    public static String v(String str, Pattern pattern, Map map) {
        return u(str, pattern, null, map);
    }

    public static int w(String str, Map map) {
        String v7 = v(str, f19033R, map);
        if (TextUtils.isEmpty(v7)) {
            return 0;
        }
        String[] b12 = M.b1(v7, ",");
        int i7 = M.s(b12, "public.accessibility.describes-video") ? 512 : 0;
        if (M.s(b12, "public.accessibility.transcribes-spoken-dialog")) {
            i7 |= 4096;
        }
        if (M.s(b12, "public.accessibility.describes-music-and-sound")) {
            i7 |= 1024;
        }
        return M.s(b12, "public.easy-to-read") ? i7 | 8192 : i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static int x(String str) {
        boolean q7 = q(str, f19036U, false);
        ?? r02 = q7;
        if (q(str, f19037V, false)) {
            r02 = (q7 ? 1 : 0) | 2;
        }
        return q(str, f19035T, false) ? r02 | 4 : r02;
    }

    public static f.C0257f y(String str) {
        double r7 = r(str, f19059r, -9.223372036854776E18d);
        long j7 = r7 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r7 * 1000000.0d);
        boolean q7 = q(str, f19060s, false);
        double r8 = r(str, f19062u, -9.223372036854776E18d);
        long j8 = r8 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r8 * 1000000.0d);
        double r9 = r(str, f19063v, -9.223372036854776E18d);
        return new f.C0257f(j7, q7, j8, r9 != -9.223372036854776E18d ? (long) (r9 * 1000000.0d) : -9223372036854775807L, q(str, f19064w, false));
    }

    public static String z(String str, Pattern pattern, Map map) {
        String v7 = v(str, pattern, map);
        if (v7 != null) {
            return v7;
        }
        throw C1162A.c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    @Override // B0.p.a
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public h a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!b(bufferedReader)) {
                throw C1162A.c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    M.m(bufferedReader);
                    throw C1162A.c("Failed to parse the playlist, could not identify any tags.", null);
                }
                trim = readLine.trim();
                if (!trim.isEmpty()) {
                    if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                        if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(trim);
                    } else {
                        arrayDeque.add(trim);
                        return p(new b(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(trim);
            return o(this.f19068a, this.f19069b, new b(arrayDeque, bufferedReader), uri.toString());
        } finally {
            M.m(bufferedReader);
        }
    }

    public i(g gVar, f fVar) {
        this.f19068a = gVar;
        this.f19069b = fVar;
    }
}
