// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package r0;

import java.util.NoSuchElementException;
import java.io.IOException;
import java.io.Closeable;
import java.util.Queue;
import java.util.ArrayDeque;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.InputStream;
import android.text.TextUtils;
import d0.A;
import d0.z;
import g0.G;
import d0.q;
import java.util.List;
import d0.x;
import g0.a;
import java.util.HashSet;
import q0.t;
import android.net.Uri;
import java.util.HashMap;
import java.util.UUID;
import Z0.o;
import android.util.Base64;
import java.util.ArrayList;
import d0.m;
import g0.M;
import java.io.BufferedReader;
import java.util.regex.Matcher;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Collections;
import java.util.regex.Pattern;
import B0.p;

public final class i implements p.a
{
    public static final Pattern A;
    public static final Pattern B;
    public static final Pattern C;
    public static final Pattern D;
    public static final Pattern E;
    public static final Pattern F;
    public static final Pattern G;
    public static final Pattern H;
    public static final Pattern I;
    public static final Pattern J;
    public static final Pattern K;
    public static final Pattern L;
    public static final Pattern M;
    public static final Pattern N;
    public static final Pattern O;
    public static final Pattern P;
    public static final Pattern Q;
    public static final Pattern R;
    public static final Pattern S;
    public static final Pattern T;
    public static final Pattern U;
    public static final Pattern V;
    public static final Pattern W;
    public static final Pattern X;
    public static final Pattern Y;
    public static final Pattern Z;
    public static final Pattern a0;
    public static final Pattern b0;
    public static final Pattern c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static final Pattern g;
    public static final Pattern h;
    public static final Pattern i;
    public static final Pattern j;
    public static final Pattern k;
    public static final Pattern l;
    public static final Pattern m;
    public static final Pattern n;
    public static final Pattern o;
    public static final Pattern p;
    public static final Pattern q;
    public static final Pattern r;
    public static final Pattern s;
    public static final Pattern t;
    public static final Pattern u;
    public static final Pattern v;
    public static final Pattern w;
    public static final Pattern x;
    public static final Pattern y;
    public static final Pattern z;
    public final r0.g a;
    public final r0.f b;
    
    static {
        c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
        d = Pattern.compile("VIDEO=\"(.+?)\"");
        e = Pattern.compile("AUDIO=\"(.+?)\"");
        f = Pattern.compile("SUBTITLES=\"(.+?)\"");
        g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
        h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
        i = Pattern.compile("CHANNELS=\"(.+?)\"");
        j = Pattern.compile("CODECS=\"(.+?)\"");
        k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
        l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
        m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
        n = Pattern.compile("DURATION=([\\d\\.]+)\\b");
        o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
        p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
        q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
        r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
        s = c("CAN-SKIP-DATERANGES");
        t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
        u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
        v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
        w = c("CAN-BLOCK-RELOAD");
        x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
        y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
        z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
        A = Pattern.compile("LAST-MSN=(\\d+)\\b");
        B = Pattern.compile("LAST-PART=(\\d+)\\b");
        C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
        D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
        E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
        F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
        G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
        H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
        I = Pattern.compile("KEYFORMAT=\"(.+?)\"");
        J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
        K = Pattern.compile("URI=\"(.+?)\"");
        L = Pattern.compile("IV=([^,.*]+)");
        M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
        N = Pattern.compile("TYPE=(PART|MAP)");
        O = Pattern.compile("LANGUAGE=\"(.+?)\"");
        P = Pattern.compile("NAME=\"(.+?)\"");
        Q = Pattern.compile("GROUP-ID=\"(.+?)\"");
        R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
        S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
        T = c("AUTOSELECT");
        U = c("DEFAULT");
        V = c("FORCED");
        W = c("INDEPENDENT");
        X = c("GAP");
        Y = c("PRECISE");
        Z = Pattern.compile("VALUE=\"(.+?)\"");
        a0 = Pattern.compile("IMPORT=\"(.+?)\"");
        b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    }
    
    public i() {
        this(r0.g.n, null);
    }
    
    public i(final r0.g a, final r0.f b) {
        this.a = a;
        this.b = b;
    }
    
    public static long A(final String s, final Pattern pattern) {
        return new BigDecimal(z(s, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
    }
    
    public static String B(final String input, final Map map) {
        final Matcher matcher = r0.i.b0.matcher(input);
        final StringBuffer sb = new StringBuffer();
        while (matcher.find()) {
            final String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(sb, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
    
    public static int C(final BufferedReader bufferedReader, final boolean b, int read) {
        while (read != -1 && Character.isWhitespace(read) && (b || !g0.M.C0(read))) {
            read = bufferedReader.read();
        }
        return read;
    }
    
    public static boolean b(final BufferedReader bufferedReader) {
        int n;
        if ((n = bufferedReader.read()) == 239) {
            if (bufferedReader.read() != 187) {
                return false;
            }
            if (bufferedReader.read() != 191) {
                return false;
            }
            n = bufferedReader.read();
        }
        int n2 = C(bufferedReader, true, n);
        for (int i = 0; i < 7; ++i) {
            if (n2 != "#EXTM3U".charAt(i)) {
                return false;
            }
            n2 = bufferedReader.read();
        }
        return g0.M.C0(C(bufferedReader, false, n2));
    }
    
    public static Pattern c(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("=(");
        sb.append("NO");
        sb.append("|");
        sb.append("YES");
        sb.append(")");
        return Pattern.compile(sb.toString());
    }
    
    public static m d(final String s, final m.b[] array) {
        final m.b[] array2 = new m.b[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = array[i].b(null);
        }
        return new m(s, array2);
    }
    
    public static String e(final long i, final String s, final String s2) {
        if (s == null) {
            return null;
        }
        if (s2 != null) {
            return s2;
        }
        return Long.toHexString(i);
    }
    
    public static r0.g.b f(final ArrayList list, final String s) {
        for (int i = 0; i < list.size(); ++i) {
            final r0.g.b b = list.get(i);
            if (s.equals(b.d)) {
                return b;
            }
        }
        return null;
    }
    
    public static r0.g.b g(final ArrayList list, final String s) {
        for (int i = 0; i < list.size(); ++i) {
            final r0.g.b b = list.get(i);
            if (s.equals(b.e)) {
                return b;
            }
        }
        return null;
    }
    
    public static r0.g.b h(final ArrayList list, final String s) {
        for (int i = 0; i < list.size(); ++i) {
            final r0.g.b b = list.get(i);
            if (s.equals(b.c)) {
                return b;
            }
        }
        return null;
    }
    
    public static double j(final String s, final Pattern pattern) {
        return Double.parseDouble(z(s, pattern, Collections.emptyMap()));
    }
    
    public static m.b k(String s, final String anObject, final Map map) {
        final String u = u(s, r0.i.J, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(anObject)) {
            s = z(s, r0.i.K, map);
            return new m.b(d0.g.d, "video/mp4", Base64.decode(s.substring(s.indexOf(44)), 0));
        }
        if ("com.widevine".equals(anObject)) {
            return new m.b(d0.g.d, "hls", g0.M.r0(s));
        }
        if ("com.microsoft.playready".equals(anObject) && "1".equals(u)) {
            s = z(s, r0.i.K, map);
            final byte[] decode = Base64.decode(s.substring(s.indexOf(44)), 0);
            final UUID e = d0.g.e;
            return new m.b(e, "video/mp4", Z0.o.a(e, decode));
        }
        return null;
    }
    
    public static String l(final String s) {
        if (!"SAMPLE-AES-CENC".equals(s) && !"SAMPLE-AES-CTR".equals(s)) {
            return "cbcs";
        }
        return "cenc";
    }
    
    public static int m(final String s, final Pattern pattern) {
        return Integer.parseInt(z(s, pattern, Collections.emptyMap()));
    }
    
    public static long n(final String s, final Pattern pattern) {
        return Long.parseLong(z(s, pattern, Collections.emptyMap()));
    }
    
    public static r0.f o(final r0.g g, final r0.f f, final b b, final String s) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:548)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public static r0.g p(final b b, final String s) {
        final HashMap<Uri, ArrayList<t.b>> hashMap = new HashMap<Uri, ArrayList<t.b>>();
        final HashMap<String, String> hashMap2 = new HashMap<String, String>();
        final ArrayList<r0.g.b> list = new ArrayList<r0.g.b>();
        final ArrayList<r0.g.a> list2 = new ArrayList<r0.g.a>();
        final ArrayList<r0.g.a> list3 = new ArrayList<r0.g.a>();
        final ArrayList<r0.g.a> list4 = new ArrayList<r0.g.a>();
        final ArrayList list5 = new ArrayList();
        ArrayList<String> list6 = new ArrayList<String>();
        final ArrayList<m> list7 = new ArrayList<m>();
        final ArrayList<String> list8 = new ArrayList<String>();
        boolean b2 = false;
        boolean b3 = false;
        while (true) {
            final boolean a = b.a();
            final String s2 = "application/x-mpegURL";
            if (!a) {
                final ArrayList<r0.g.a> list9 = list4;
                final ArrayList<r0.g.b> list10 = new ArrayList<r0.g.b>();
                final HashSet<Uri> set = new HashSet<Uri>();
                for (int i = 0; i < list.size(); ++i) {
                    final r0.g.b b4 = list.get(i);
                    if (set.add(b4.a)) {
                        g0.a.f(b4.b.k == null);
                        list10.add(b4.a(b4.b.a().h0(new x(new x.b[] { new t(null, null, (List)g0.a.e(hashMap.get(b4.a))) })).K()));
                    }
                }
                final q q;
                Object emptyList = q = null;
                int j = 0;
                final ArrayList<r0.g.a> list11 = list2;
                final ArrayList<r0.g.a> list12 = list9;
                q k = q;
                while (j < list6.size()) {
                    final String s3 = list6.get(j);
                    final String z = z(s3, r0.i.Q, hashMap2);
                    final String z2 = z(s3, r0.i.P, hashMap2);
                    final q.b b5 = new q.b();
                    final StringBuilder sb = new StringBuilder();
                    sb.append(z);
                    sb.append(":");
                    sb.append(z2);
                    final q.b e0 = b5.a0(sb.toString()).c0(z2).Q(s2).q0(x(s3)).m0(w(s3, hashMap2)).e0(v(s3, r0.i.O, hashMap2));
                    final String v = v(s3, r0.i.K, hashMap2);
                    Uri f;
                    if (v == null) {
                        f = null;
                    }
                    else {
                        f = g0.G.f(s, v);
                    }
                    final ArrayList<String> list13 = list6;
                    final x x = new x(new x.b[] { new t(z, z2, Collections.emptyList()) });
                    final String z3 = z(s3, r0.i.M, hashMap2);
                    z3.hashCode();
                    int n = 0;
                    Label_1286: {
                        switch (z3) {
                            case "VIDEO": {
                                n = 3;
                                break Label_1286;
                            }
                            case "AUDIO": {
                                n = 2;
                                break Label_1286;
                            }
                            case "CLOSED-CAPTIONS": {
                                n = 1;
                                break Label_1286;
                            }
                            case "SUBTITLES": {
                                n = 0;
                                break Label_1286;
                            }
                            default:
                                break;
                        }
                        n = -1;
                    }
                    Label_1645: {
                        Object o = null;
                        Label_1641: {
                            switch (n) {
                                case 3: {
                                    final r0.g.b h = h(list, z);
                                    if (h != null) {
                                        final q b6 = h.b;
                                        final String q2 = g0.M.Q(b6.j, 2);
                                        e0.O(q2).o0(d0.z.g(q2)).v0(b6.t).Y(b6.u).X(b6.v);
                                    }
                                    if (f == null) {
                                        break;
                                    }
                                    e0.h0(x);
                                    list11.add(new r0.g.a(f, e0.K(), z, z2));
                                    break;
                                }
                                case 2: {
                                    final r0.g.b f2 = f(list, z);
                                    String g;
                                    if (f2 != null) {
                                        final String q3 = g0.M.Q(f2.b.j, 1);
                                        e0.O(q3);
                                        g = d0.z.g(q3);
                                    }
                                    else {
                                        g = null;
                                    }
                                    final String v2 = v(s3, r0.i.i, hashMap2);
                                    String s4;
                                    if (v2 != null) {
                                        e0.N(Integer.parseInt(g0.M.c1(v2, "/")[0]));
                                        s4 = g;
                                        if ("audio/eac3".equals(g)) {
                                            s4 = g;
                                            if (v2.endsWith("/JOC")) {
                                                e0.O("ec+3");
                                                s4 = "audio/eac3-joc";
                                            }
                                        }
                                    }
                                    else {
                                        s4 = g;
                                    }
                                    e0.o0(s4);
                                    if (f != null) {
                                        e0.h0(x);
                                        list3.add(new r0.g.a(f, e0.K(), z, z2));
                                        o = emptyList;
                                        break Label_1641;
                                    }
                                    o = emptyList;
                                    if (f2 != null) {
                                        k = e0.K();
                                        o = emptyList;
                                    }
                                    break Label_1641;
                                }
                                case 1: {
                                    final String z4 = z(s3, r0.i.S, hashMap2);
                                    int n2;
                                    String s5;
                                    if (z4.startsWith("CC")) {
                                        n2 = Integer.parseInt(z4.substring(2));
                                        s5 = "application/cea-608";
                                    }
                                    else {
                                        n2 = Integer.parseInt(z4.substring(7));
                                        s5 = "application/cea-708";
                                    }
                                    o = emptyList;
                                    if (emptyList == null) {
                                        o = new ArrayList<q>();
                                    }
                                    e0.o0(s5).L(n2);
                                    ((List<q>)o).add(e0.K());
                                    break Label_1641;
                                }
                                case 0: {
                                    final q q4 = k;
                                    final r0.g.b g2 = g(list, z);
                                    String g3;
                                    if (g2 != null) {
                                        final String q5 = g0.M.Q(g2.b.j, 3);
                                        e0.O(q5);
                                        g3 = d0.z.g(q5);
                                    }
                                    else {
                                        g3 = null;
                                    }
                                    String s6 = g3;
                                    if (g3 == null) {
                                        s6 = "text/vtt";
                                    }
                                    e0.o0(s6).h0(x);
                                    if (f != null) {
                                        list12.add(new r0.g.a(f, e0.K(), z, z2));
                                        k = q4;
                                        break;
                                    }
                                    g0.o.h("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                                    k = q4;
                                    break;
                                }
                            }
                            break Label_1645;
                        }
                        emptyList = o;
                    }
                    ++j;
                    list6 = list13;
                }
                if (b3) {
                    emptyList = Collections.emptyList();
                }
                return new r0.g(s, list8, list10, list11, list3, list12, list5, k, (List)emptyList, b2, hashMap2, list7);
            }
            final String b7 = b.b();
            if (b7.startsWith("#EXT")) {
                list8.add(b7);
            }
            final boolean startsWith = b7.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            if (b7.startsWith("#EXT-X-DEFINE")) {
                hashMap2.put(z(b7, r0.i.P, hashMap2), z(b7, r0.i.Z, hashMap2));
            }
            else if (b7.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                b2 = true;
            }
            else if (b7.startsWith("#EXT-X-MEDIA")) {
                list6.add(b7);
            }
            else if (b7.startsWith("#EXT-X-SESSION-KEY")) {
                final m.b l = k(b7, u(b7, r0.i.I, "identity", hashMap2), hashMap2);
                if (l == null) {
                    continue;
                }
                list7.add(new m(l(z(b7, r0.i.H, hashMap2)), new m.b[] { l }));
            }
            else {
                if (!b7.startsWith("#EXT-X-STREAM-INF") && !startsWith) {
                    continue;
                }
                final boolean contains = b7.contains("CLOSED-CAPTIONS=NONE");
                int n3;
                if (startsWith) {
                    n3 = 16384;
                }
                else {
                    n3 = 0;
                }
                final int m = m(b7, r0.i.h);
                final int s7 = s(b7, r0.i.c, -1);
                final String v3 = v(b7, r0.i.j, hashMap2);
                final String v4 = v(b7, r0.i.k, hashMap2);
                int int1;
                int int2;
                if (v4 != null) {
                    final String[] b8 = g0.M.b1(v4, "x");
                    int1 = Integer.parseInt(b8[0]);
                    int2 = Integer.parseInt(b8[1]);
                    if (int1 <= 0 || int2 <= 0) {
                        int2 = -1;
                        int1 = -1;
                    }
                }
                else {
                    int1 = -1;
                    int2 = -1;
                }
                final String v5 = v(b7, r0.i.l, hashMap2);
                float float1;
                if (v5 != null) {
                    float1 = Float.parseFloat(v5);
                }
                else {
                    float1 = -1.0f;
                }
                final String v6 = v(b7, r0.i.d, hashMap2);
                final String v7 = v(b7, r0.i.e, hashMap2);
                final String v8 = v(b7, r0.i.f, hashMap2);
                final String v9 = v(b7, r0.i.g, hashMap2);
                String s8;
                if (startsWith) {
                    s8 = z(b7, r0.i.K, hashMap2);
                }
                else {
                    if (!b.a()) {
                        throw d0.A.c("#EXT-X-STREAM-INF must be followed by another line", null);
                    }
                    s8 = B(b.b(), hashMap2);
                }
                final Uri f3 = g0.G.f(s, s8);
                list.add(new r0.g.b(f3, new q.b().Z(list.size()).Q("application/x-mpegURL").O(v3).M(s7).j0(m).v0(int1).Y(int2).X(float1).m0(n3).K(), v6, v7, v8, v9));
                final HashMap<Uri, ArrayList<t.b>> hashMap3 = hashMap;
                ArrayList<t.b> value;
                if ((value = hashMap3.get(f3)) == null) {
                    value = new ArrayList<t.b>();
                    hashMap3.put(f3, value);
                }
                value.add(new t.b(s7, m, v6, v7, v8, v9));
                b3 |= contains;
            }
        }
    }
    
    public static boolean q(final String input, final Pattern pattern, final boolean b) {
        final Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return b;
    }
    
    public static double r(final String input, final Pattern pattern, final double n) {
        final Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return Double.parseDouble((String)g0.a.e(matcher.group(1)));
        }
        return n;
    }
    
    public static int s(final String input, final Pattern pattern, final int n) {
        final Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return Integer.parseInt((String)g0.a.e(matcher.group(1)));
        }
        return n;
    }
    
    public static long t(final String input, final Pattern pattern, final long n) {
        final Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return Long.parseLong((String)g0.a.e(matcher.group(1)));
        }
        return n;
    }
    
    public static String u(String b, final Pattern pattern, String s, final Map map) {
        final Matcher matcher = pattern.matcher(b);
        if (matcher.find()) {
            s = (String)g0.a.e(matcher.group(1));
        }
        b = s;
        if (!map.isEmpty()) {
            if (s == null) {
                return s;
            }
            b = B(s, map);
        }
        return b;
    }
    
    public static String v(final String s, final Pattern pattern, final Map map) {
        return u(s, pattern, null, map);
    }
    
    public static int w(String v, final Map map) {
        v = v(v, r0.i.R, map);
        final boolean empty = TextUtils.isEmpty((CharSequence)v);
        int n = 0;
        if (empty) {
            return 0;
        }
        final String[] b1 = g0.M.b1(v, ",");
        if (g0.M.s(b1, "public.accessibility.describes-video")) {
            n = 512;
        }
        int n2 = n;
        if (g0.M.s(b1, "public.accessibility.transcribes-spoken-dialog")) {
            n2 = (n | 0x1000);
        }
        int n3 = n2;
        if (g0.M.s(b1, "public.accessibility.describes-music-and-sound")) {
            n3 = (n2 | 0x400);
        }
        int n4 = n3;
        if (g0.M.s(b1, "public.easy-to-read")) {
            n4 = (n3 | 0x2000);
        }
        return n4;
    }
    
    public static int x(final String s) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public static r0.f.f y(final String s) {
        final double r = r(s, r0.i.r, -9.223372036854776E18);
        long n = -9223372036854775807L;
        long n2;
        if (r == -9.223372036854776E18) {
            n2 = -9223372036854775807L;
        }
        else {
            n2 = (long)(r * 1000000.0);
        }
        final boolean q = q(s, r0.i.s, false);
        final double r2 = r(s, r0.i.u, -9.223372036854776E18);
        long n3;
        if (r2 == -9.223372036854776E18) {
            n3 = -9223372036854775807L;
        }
        else {
            n3 = (long)(r2 * 1000000.0);
        }
        final double r3 = r(s, r0.i.v, -9.223372036854776E18);
        if (r3 != -9.223372036854776E18) {
            n = (long)(r3 * 1000000.0);
        }
        return new r0.f.f(n2, q, n3, n, q(s, r0.i.w, false));
    }
    
    public static String z(final String str, final Pattern pattern, final Map map) {
        final String v = v(str, pattern, map);
        if (v != null) {
            return v;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Couldn't match ");
        sb.append(pattern.pattern());
        sb.append(" in ");
        sb.append(str);
        throw d0.A.c(sb.toString(), null);
    }
    
    public r0.h i(final Uri uri, InputStream in) {
        while (true) {
            in = (InputStream)new BufferedReader(new InputStreamReader(in));
            final ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
            Label_0270: {
                Label_0250: {
                    String s;
                    while (true) {
                        try {
                            if (!b((BufferedReader)in)) {
                                throw d0.A.c("Input does not start with the #EXTM3U header.", null);
                            }
                            do {
                                s = ((BufferedReader)in).readLine();
                                if (s == null) {
                                    break Label_0250;
                                }
                                s = s.trim();
                            } while (s.isEmpty());
                            if (s.startsWith("#EXT-X-STREAM-INF")) {
                                arrayDeque.add(s);
                                final r0.g p = p(new b(arrayDeque, (BufferedReader)in), uri.toString());
                                g0.M.m(in);
                                return p;
                            }
                        }
                        finally {
                            break Label_0270;
                        }
                        if (!s.startsWith("#EXT-X-TARGETDURATION") && !s.startsWith("#EXT-X-MEDIA-SEQUENCE") && !s.startsWith("#EXTINF") && !s.startsWith("#EXT-X-KEY") && !s.startsWith("#EXT-X-BYTERANGE") && !s.equals("#EXT-X-DISCONTINUITY") && !s.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !s.equals("#EXT-X-ENDLIST")) {
                            arrayDeque.add(s);
                            continue;
                        }
                        break;
                    }
                    arrayDeque.add(s);
                    final r0.f o = o(this.a, this.b, new b(arrayDeque, (BufferedReader)in), uri.toString());
                    g0.M.m(in);
                    return o;
                }
                g0.M.m(in);
                throw d0.A.c("Failed to parse the playlist, could not identify any tags.", null);
            }
            g0.M.m(in);
        }
    }
    
    public static final class a extends IOException
    {
    }
    
    public static class b
    {
        public final BufferedReader a;
        public final Queue b;
        public String c;
        
        public b(final Queue b, final BufferedReader a) {
            this.b = b;
            this.a = a;
        }
        
        public boolean a() {
            if (this.c != null) {
                return true;
            }
            if (!this.b.isEmpty()) {
                this.c = (String)g0.a.e(this.b.poll());
                return true;
            }
            String trim;
            do {
                final String line = this.a.readLine();
                if ((this.c = line) == null) {
                    return false;
                }
                trim = line.trim();
                this.c = trim;
            } while (trim.isEmpty());
            return true;
        }
        
        public String b() {
            if (this.a()) {
                final String c = this.c;
                this.c = null;
                return c;
            }
            throw new NoSuchElementException();
        }
    }
}
