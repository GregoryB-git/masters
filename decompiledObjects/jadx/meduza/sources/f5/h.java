package f5;

import a4.d;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import e5.o;
import f5.f;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.BufferedReader;
import java.io.IOException;
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
import t5.f0;
import v3.a1;
import v3.i0;
import v5.d0;
import v5.e0;
import v5.m;
import v5.p;

/* loaded from: classes.dex */
public final class h implements f0.a<g> {

    /* renamed from: a, reason: collision with root package name */
    public final f f5455a;

    /* renamed from: b, reason: collision with root package name */
    public final e f5456b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f5433c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f5434d = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f5435e = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f5436g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f5437h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f5438i = Pattern.compile("CHANNELS=\"(.+?)\"");

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f5439j = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f5440k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f5441l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f5442m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f5443n = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f5444o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f5445p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f5446q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f5447r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f5448s = b("CAN-SKIP-DATERANGES");
    public static final Pattern t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: u, reason: collision with root package name */
    public static final Pattern f5449u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: v, reason: collision with root package name */
    public static final Pattern f5450v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: w, reason: collision with root package name */
    public static final Pattern f5451w = b("CAN-BLOCK-RELOAD");

    /* renamed from: x, reason: collision with root package name */
    public static final Pattern f5452x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: y, reason: collision with root package name */
    public static final Pattern f5453y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: z, reason: collision with root package name */
    public static final Pattern f5454z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern A = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern B = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern I = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern K = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern L = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern N = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern O = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern P = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern Q = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern T = b("AUTOSELECT");
    public static final Pattern U = b("DEFAULT");
    public static final Pattern V = b("FORCED");
    public static final Pattern W = b("INDEPENDENT");
    public static final Pattern X = b("GAP");
    public static final Pattern Y = b("PRECISE");
    public static final Pattern Z = Pattern.compile("VALUE=\"(.+?)\"");

    /* renamed from: a0, reason: collision with root package name */
    public static final Pattern f5431a0 = Pattern.compile("IMPORT=\"(.+?)\"");

    /* renamed from: b0, reason: collision with root package name */
    public static final Pattern f5432b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class a extends IOException {
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final BufferedReader f5457a;

        /* renamed from: b, reason: collision with root package name */
        public final Queue<String> f5458b;

        /* renamed from: c, reason: collision with root package name */
        public String f5459c;

        public b(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
            this.f5458b = arrayDeque;
            this.f5457a = bufferedReader;
        }

        public final boolean a() {
            String trim;
            if (this.f5459c != null) {
                return true;
            }
            if (!this.f5458b.isEmpty()) {
                String poll = this.f5458b.poll();
                poll.getClass();
                this.f5459c = poll;
                return true;
            }
            do {
                String readLine = this.f5457a.readLine();
                this.f5459c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.f5459c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public final String b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.f5459c;
            this.f5459c = null;
            return str;
        }
    }

    public h(f fVar, e eVar) {
        this.f5455a = fVar;
        this.f5456b = eVar;
    }

    public static Pattern b(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    public static a4.d c(String str, d.b[] bVarArr) {
        d.b[] bVarArr2 = new d.b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            d.b bVar = bVarArr[i10];
            bVarArr2[i10] = new d.b(bVar.f172b, bVar.f173c, bVar.f174d, null);
        }
        return new a4.d(str, true, bVarArr2);
    }

    public static d.b d(String str, String str2, HashMap hashMap) {
        String k10 = k(str, J, "1", hashMap);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String l10 = l(str, K, hashMap);
            return new d.b(v3.h.f15397d, null, "video/mp4", Base64.decode(l10.substring(l10.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new d.b(v3.h.f15397d, null, "hls", e0.B(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(k10)) {
            return null;
        }
        String l11 = l(str, K, hashMap);
        byte[] decode = Base64.decode(l11.substring(l11.indexOf(44)), 0);
        UUID uuid = v3.h.f15398e;
        return new d.b(uuid, null, "video/mp4", k4.h.a(uuid, null, decode));
    }

    public static int e(String str, Pattern pattern) {
        return Integer.parseInt(l(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:262:0x024c, code lost:
    
        if (r10 != null) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Exception, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static f5.e f(f5.f r92, f5.e r93, f5.h.b r94, java.lang.String r95) {
        /*
            Method dump skipped, instructions count: 2153
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.h.f(f5.f, f5.e, f5.h$b, java.lang.String):f5.e");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    public static f g(b bVar, String str) {
        int i10;
        char c10;
        i0 i0Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        f.b bVar2;
        String str2;
        ArrayList arrayList3;
        i0 i0Var2;
        int parseInt;
        String str3;
        f.b bVar3;
        String str4;
        f.b bVar4;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i11;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i12;
        int i13;
        ArrayList arrayList9;
        ArrayList arrayList10;
        String m10;
        HashMap hashMap;
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
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            String str6 = "application/x-mpegURL";
            if (!bVar.a()) {
                ArrayList arrayList19 = arrayList16;
                ArrayList arrayList20 = arrayList12;
                ArrayList arrayList21 = arrayList13;
                ArrayList arrayList22 = arrayList14;
                ArrayList arrayList23 = arrayList15;
                ArrayList arrayList24 = arrayList18;
                boolean z12 = z10;
                ArrayList arrayList25 = arrayList17;
                HashMap hashMap4 = hashMap2;
                ArrayList arrayList26 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i14 = 0; i14 < arrayList11.size(); i14++) {
                    f.b bVar5 = (f.b) arrayList11.get(i14);
                    if (hashSet.add(bVar5.f5423a)) {
                        x6.b.H(bVar5.f5424b.f15455r == null);
                        ArrayList arrayList27 = (ArrayList) hashMap4.get(bVar5.f5423a);
                        arrayList27.getClass();
                        p4.a aVar = new p4.a(new o(null, null, arrayList27));
                        i0 i0Var3 = bVar5.f5424b;
                        i0Var3.getClass();
                        i0.a aVar2 = new i0.a(i0Var3);
                        aVar2.f15470i = aVar;
                        arrayList26.add(new f.b(bVar5.f5423a, new i0(aVar2), bVar5.f5425c, bVar5.f5426d, bVar5.f5427e, bVar5.f));
                    }
                }
                List list = null;
                int i15 = 0;
                i0 i0Var4 = null;
                while (i15 < arrayList19.size()) {
                    ArrayList arrayList28 = arrayList19;
                    String str7 = (String) arrayList28.get(i15);
                    String l10 = l(str7, Q, hashMap3);
                    String l11 = l(str7, P, hashMap3);
                    i0.a aVar3 = new i0.a();
                    aVar3.f15463a = defpackage.g.e(l10, ":", l11);
                    aVar3.f15464b = l11;
                    aVar3.f15471j = str6;
                    boolean h10 = h(str7, U);
                    boolean z13 = h10;
                    if (h(str7, V)) {
                        z13 = (h10 ? 1 : 0) | 2;
                    }
                    int i16 = z13;
                    if (h(str7, T)) {
                        i16 = (z13 ? 1 : 0) | 4;
                    }
                    aVar3.f15466d = i16;
                    String k10 = k(str7, R, null, hashMap3);
                    if (TextUtils.isEmpty(k10)) {
                        i10 = 0;
                        arrayList19 = arrayList28;
                    } else {
                        int i17 = e0.f15881a;
                        arrayList19 = arrayList28;
                        String[] split = k10.split(",", -1);
                        i10 = e0.k("public.accessibility.describes-video", split) ? 512 : 0;
                        if (e0.k("public.accessibility.transcribes-spoken-dialog", split)) {
                            i10 |= 4096;
                        }
                        if (e0.k("public.accessibility.describes-music-and-sound", split)) {
                            i10 |= 1024;
                        }
                        if (e0.k("public.easy-to-read", split)) {
                            i10 |= 8192;
                        }
                    }
                    aVar3.f15467e = i10;
                    aVar3.f15465c = k(str7, O, null, hashMap3);
                    String k11 = k(str7, K, null, hashMap3);
                    Uri d10 = k11 == null ? null : d0.d(str5, k11);
                    String str8 = str6;
                    p4.a aVar4 = new p4.a(new o(l10, l11, Collections.emptyList()));
                    String l12 = l(str7, M, hashMap3);
                    switch (l12.hashCode()) {
                        case -959297733:
                            if (l12.equals("SUBTITLES")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -333210994:
                            if (l12.equals("CLOSED-CAPTIONS")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 62628790:
                            if (l12.equals("AUDIO")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 81665115:
                            if (l12.equals("VIDEO")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    if (c10 != 0) {
                        if (c10 == 1) {
                            i0 i0Var5 = i0Var4;
                            arrayList = arrayList21;
                            arrayList2 = arrayList20;
                            String l13 = l(str7, S, hashMap3);
                            if (l13.startsWith("CC")) {
                                parseInt = Integer.parseInt(l13.substring(2));
                                str3 = "application/cea-608";
                            } else {
                                parseInt = Integer.parseInt(l13.substring(7));
                                str3 = "application/cea-708";
                            }
                            if (list == null) {
                                list = new ArrayList();
                            }
                            aVar3.f15472k = str3;
                            aVar3.C = parseInt;
                            list.add(new i0(aVar3));
                            i0Var2 = i0Var5;
                        } else if (c10 != 2) {
                            if (c10 == 3) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 < arrayList11.size()) {
                                        bVar4 = (f.b) arrayList11.get(i18);
                                        if (!l10.equals(bVar4.f5425c)) {
                                            i18++;
                                        }
                                    } else {
                                        bVar4 = null;
                                    }
                                }
                                if (bVar4 != null) {
                                    i0 i0Var6 = bVar4.f5424b;
                                    String q10 = e0.q(2, i0Var6.f15454q);
                                    aVar3.f15469h = q10;
                                    aVar3.f15472k = p.e(q10);
                                    aVar3.f15477p = i0Var6.f15461y;
                                    aVar3.f15478q = i0Var6.f15462z;
                                    aVar3.f15479r = i0Var6.A;
                                }
                                if (d10 != null) {
                                    aVar3.f15470i = aVar4;
                                    arrayList2 = arrayList20;
                                    arrayList2.add(new f.a(d10, new i0(aVar3), l11));
                                    i0Var = i0Var4;
                                    arrayList3 = arrayList22;
                                    arrayList = arrayList21;
                                }
                            }
                            arrayList2 = arrayList20;
                            i0Var = i0Var4;
                            arrayList3 = arrayList22;
                            arrayList = arrayList21;
                        } else {
                            arrayList2 = arrayList20;
                            int i19 = 0;
                            while (true) {
                                if (i19 < arrayList11.size()) {
                                    bVar3 = (f.b) arrayList11.get(i19);
                                    i0Var = i0Var4;
                                    if (!l10.equals(bVar3.f5426d)) {
                                        i19++;
                                        i0Var4 = i0Var;
                                    }
                                } else {
                                    i0Var = i0Var4;
                                    bVar3 = null;
                                }
                            }
                            if (bVar3 != null) {
                                String q11 = e0.q(1, bVar3.f5424b.f15454q);
                                aVar3.f15469h = q11;
                                str4 = p.e(q11);
                            } else {
                                str4 = null;
                            }
                            String k12 = k(str7, f5438i, null, hashMap3);
                            if (k12 != null) {
                                int i20 = e0.f15881a;
                                aVar3.f15484x = Integer.parseInt(k12.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, 2)[0]);
                                if ("audio/eac3".equals(str4) && k12.endsWith("/JOC")) {
                                    aVar3.f15469h = "ec+3";
                                    str4 = "audio/eac3-joc";
                                }
                            }
                            aVar3.f15472k = str4;
                            if (d10 != null) {
                                aVar3.f15470i = aVar4;
                                arrayList = arrayList21;
                                arrayList.add(new f.a(d10, new i0(aVar3), l11));
                            } else {
                                arrayList = arrayList21;
                                if (bVar3 != null) {
                                    i0Var2 = new i0(aVar3);
                                }
                            }
                            arrayList3 = arrayList22;
                        }
                        arrayList3 = arrayList22;
                        i15++;
                        arrayList22 = arrayList3;
                        arrayList21 = arrayList;
                        arrayList20 = arrayList2;
                        str6 = str8;
                        i0Var4 = i0Var2;
                        str5 = str;
                    } else {
                        i0Var = i0Var4;
                        arrayList = arrayList21;
                        arrayList2 = arrayList20;
                        int i21 = 0;
                        while (true) {
                            if (i21 < arrayList11.size()) {
                                bVar2 = (f.b) arrayList11.get(i21);
                                if (!l10.equals(bVar2.f5427e)) {
                                    i21++;
                                }
                            } else {
                                bVar2 = null;
                            }
                        }
                        if (bVar2 != null) {
                            String q12 = e0.q(3, bVar2.f5424b.f15454q);
                            aVar3.f15469h = q12;
                            str2 = p.e(q12);
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                            str2 = "text/vtt";
                        }
                        aVar3.f15472k = str2;
                        aVar3.f15470i = aVar4;
                        if (d10 != null) {
                            arrayList3 = arrayList22;
                            arrayList3.add(new f.a(d10, new i0(aVar3), l11));
                        } else {
                            arrayList3 = arrayList22;
                            m.f("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                        }
                    }
                    i0Var2 = i0Var;
                    i15++;
                    arrayList22 = arrayList3;
                    arrayList21 = arrayList;
                    arrayList20 = arrayList2;
                    str6 = str8;
                    i0Var4 = i0Var2;
                    str5 = str;
                }
                i0 i0Var7 = i0Var4;
                ArrayList arrayList29 = arrayList22;
                ArrayList arrayList30 = arrayList21;
                ArrayList arrayList31 = arrayList20;
                if (z11) {
                    list = Collections.emptyList();
                }
                return new f(str, arrayList24, arrayList26, arrayList31, arrayList30, arrayList29, arrayList23, i0Var7, list, z12, hashMap3, arrayList25);
            }
            String b10 = bVar.b();
            if (b10.startsWith("#EXT")) {
                arrayList18.add(b10);
            }
            boolean startsWith = b10.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            boolean z14 = z10;
            if (b10.startsWith("#EXT-X-DEFINE")) {
                hashMap3.put(l(b10, P, hashMap3), l(b10, Z, hashMap3));
            } else if (b10.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                z10 = true;
                arrayList4 = arrayList15;
                arrayList10 = arrayList16;
                arrayList9 = arrayList12;
                arrayList8 = arrayList13;
                arrayList7 = arrayList14;
                arrayList6 = arrayList18;
                arrayList5 = arrayList17;
                hashMap = hashMap2;
                hashMap2 = hashMap;
                arrayList15 = arrayList4;
                arrayList17 = arrayList5;
                arrayList18 = arrayList6;
                arrayList14 = arrayList7;
                arrayList13 = arrayList8;
                arrayList12 = arrayList9;
                arrayList16 = arrayList10;
            } else if (b10.startsWith("#EXT-X-MEDIA")) {
                arrayList16.add(b10);
            } else {
                if (b10.startsWith("#EXT-X-SESSION-KEY")) {
                    d.b d11 = d(b10, k(b10, I, "identity", hashMap3), hashMap3);
                    if (d11 != null) {
                        String l14 = l(b10, H, hashMap3);
                        arrayList4 = arrayList15;
                        arrayList17.add(new a4.d(("SAMPLE-AES-CENC".equals(l14) || "SAMPLE-AES-CTR".equals(l14)) ? "cenc" : "cbcs", true, d11));
                    }
                } else {
                    arrayList4 = arrayList15;
                    if (b10.startsWith("#EXT-X-STREAM-INF") || startsWith) {
                        boolean contains = b10.contains("CLOSED-CAPTIONS=NONE") | z11;
                        int i22 = startsWith ? 16384 : 0;
                        int e10 = e(b10, f5437h);
                        Matcher matcher = f5433c.matcher(b10);
                        arrayList5 = arrayList17;
                        if (matcher.find()) {
                            String group = matcher.group(1);
                            group.getClass();
                            i11 = Integer.parseInt(group);
                        } else {
                            i11 = -1;
                        }
                        arrayList6 = arrayList18;
                        String k13 = k(b10, f5439j, null, hashMap3);
                        arrayList7 = arrayList14;
                        String k14 = k(b10, f5440k, null, hashMap3);
                        if (k14 != null) {
                            int i23 = e0.f15881a;
                            arrayList8 = arrayList13;
                            String[] split2 = k14.split("x", -1);
                            i12 = Integer.parseInt(split2[0]);
                            i13 = Integer.parseInt(split2[1]);
                            if (i12 <= 0 || i13 <= 0) {
                                i13 = -1;
                                i12 = -1;
                            }
                        } else {
                            arrayList8 = arrayList13;
                            i12 = -1;
                            i13 = -1;
                        }
                        arrayList9 = arrayList12;
                        String k15 = k(b10, f5441l, null, hashMap3);
                        float parseFloat = k15 != null ? Float.parseFloat(k15) : -1.0f;
                        arrayList10 = arrayList16;
                        String k16 = k(b10, f5434d, null, hashMap3);
                        HashMap hashMap5 = hashMap2;
                        String k17 = k(b10, f5435e, null, hashMap3);
                        String k18 = k(b10, f, null, hashMap3);
                        String k19 = k(b10, f5436g, null, hashMap3);
                        if (startsWith) {
                            m10 = l(b10, K, hashMap3);
                        } else {
                            if (!bVar.a()) {
                                throw a1.b("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            m10 = m(bVar.b(), hashMap3);
                        }
                        Uri d12 = d0.d(str5, m10);
                        i0.a aVar5 = new i0.a();
                        aVar5.b(arrayList11.size());
                        aVar5.f15471j = "application/x-mpegURL";
                        aVar5.f15469h = k13;
                        aVar5.f = i11;
                        aVar5.f15468g = e10;
                        aVar5.f15477p = i12;
                        aVar5.f15478q = i13;
                        aVar5.f15479r = parseFloat;
                        aVar5.f15467e = i22;
                        arrayList11.add(new f.b(d12, new i0(aVar5), k16, k17, k18, k19));
                        hashMap = hashMap5;
                        ArrayList arrayList32 = (ArrayList) hashMap.get(d12);
                        if (arrayList32 == null) {
                            arrayList32 = new ArrayList();
                            hashMap.put(d12, arrayList32);
                        }
                        arrayList32.add(new o.b(i11, e10, k16, k17, k18, k19));
                        z10 = z14;
                        z11 = contains;
                        hashMap2 = hashMap;
                        arrayList15 = arrayList4;
                        arrayList17 = arrayList5;
                        arrayList18 = arrayList6;
                        arrayList14 = arrayList7;
                        arrayList13 = arrayList8;
                        arrayList12 = arrayList9;
                        arrayList16 = arrayList10;
                    }
                }
                z10 = z14;
                arrayList10 = arrayList16;
                arrayList9 = arrayList12;
                arrayList8 = arrayList13;
                arrayList7 = arrayList14;
                arrayList6 = arrayList18;
                arrayList5 = arrayList17;
                hashMap = hashMap2;
                hashMap2 = hashMap;
                arrayList15 = arrayList4;
                arrayList17 = arrayList5;
                arrayList18 = arrayList6;
                arrayList14 = arrayList7;
                arrayList13 = arrayList8;
                arrayList12 = arrayList9;
                arrayList16 = arrayList10;
            }
            arrayList4 = arrayList15;
            z10 = z14;
            arrayList10 = arrayList16;
            arrayList9 = arrayList12;
            arrayList8 = arrayList13;
            arrayList7 = arrayList14;
            arrayList6 = arrayList18;
            arrayList5 = arrayList17;
            hashMap = hashMap2;
            hashMap2 = hashMap;
            arrayList15 = arrayList4;
            arrayList17 = arrayList5;
            arrayList18 = arrayList6;
            arrayList14 = arrayList7;
            arrayList13 = arrayList8;
            arrayList12 = arrayList9;
            arrayList16 = arrayList10;
        }
    }

    public static boolean h(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    public static double i(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -9.223372036854776E18d;
        }
        String group = matcher.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    public static long j(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static String k(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : m(str2, map);
    }

    public static String l(String str, Pattern pattern, Map<String, String> map) {
        String k10 = k(str, pattern, null, map);
        if (k10 != null) {
            return k10;
        }
        StringBuilder l10 = defpackage.f.l("Couldn't match ");
        l10.append(pattern.pattern());
        l10.append(" in ");
        l10.append(str);
        throw a1.b(l10.toString(), null);
    }

    public static String m(String str, Map<String, String> map) {
        Matcher matcher = f5432b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069 A[Catch: all -> 0x0101, LOOP:0: B:13:0x0069->B:38:0x0069, LOOP_START, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x0069, B:15:0x006f, B:18:0x007a, B:53:0x0082, B:20:0x0093, B:22:0x009b, B:24:0x00a3, B:26:0x00ab, B:28:0x00b3, B:30:0x00bb, B:32:0x00c3, B:34:0x00cb, B:36:0x00d4, B:41:0x00d8, B:60:0x00fa, B:61:0x0100, B:65:0x0030, B:67:0x0036, B:71:0x003f, B:73:0x0048, B:78:0x0051, B:80:0x0057, B:82:0x005d, B:84:0x0062), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fa A[Catch: all -> 0x0101, TRY_ENTER, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:13:0x0069, B:15:0x006f, B:18:0x007a, B:53:0x0082, B:20:0x0093, B:22:0x009b, B:24:0x00a3, B:26:0x00ab, B:28:0x00b3, B:30:0x00bb, B:32:0x00c3, B:34:0x00cb, B:36:0x00d4, B:41:0x00d8, B:60:0x00fa, B:61:0x0100, B:65:0x0030, B:67:0x0036, B:71:0x003f, B:73:0x0048, B:78:0x0051, B:80:0x0057, B:82:0x005d, B:84:0x0062), top: B:2:0x000f }] */
    @Override // t5.f0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.net.Uri r8, t5.m r9) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.h.a(android.net.Uri, t5.m):java.lang.Object");
    }
}
