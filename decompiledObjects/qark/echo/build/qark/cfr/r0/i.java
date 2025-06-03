/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.util.Base64
 *  java.io.BufferedReader
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.math.BigDecimal
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Map
 *  java.util.NoSuchElementException
 *  java.util.Queue
 *  java.util.UUID
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package r0;

import B0.p;
import Z0.o;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import d0.A;
import d0.m;
import d0.q;
import d0.x;
import d0.z;
import g0.G;
import g0.M;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
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
import r0.h;

public final class i
implements p.a {
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
    public final g a;
    public final f b;

    static {
        c = Pattern.compile((String)"AVERAGE-BANDWIDTH=(\\d+)\\b");
        d = Pattern.compile((String)"VIDEO=\"(.+?)\"");
        e = Pattern.compile((String)"AUDIO=\"(.+?)\"");
        f = Pattern.compile((String)"SUBTITLES=\"(.+?)\"");
        g = Pattern.compile((String)"CLOSED-CAPTIONS=\"(.+?)\"");
        h = Pattern.compile((String)"[^-]BANDWIDTH=(\\d+)\\b");
        i = Pattern.compile((String)"CHANNELS=\"(.+?)\"");
        j = Pattern.compile((String)"CODECS=\"(.+?)\"");
        k = Pattern.compile((String)"RESOLUTION=(\\d+x\\d+)");
        l = Pattern.compile((String)"FRAME-RATE=([\\d\\.]+)\\b");
        m = Pattern.compile((String)"#EXT-X-TARGETDURATION:(\\d+)\\b");
        n = Pattern.compile((String)"DURATION=([\\d\\.]+)\\b");
        o = Pattern.compile((String)"PART-TARGET=([\\d\\.]+)\\b");
        p = Pattern.compile((String)"#EXT-X-VERSION:(\\d+)\\b");
        q = Pattern.compile((String)"#EXT-X-PLAYLIST-TYPE:(.+)\\b");
        r = Pattern.compile((String)"CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
        s = i.c("CAN-SKIP-DATERANGES");
        t = Pattern.compile((String)"SKIPPED-SEGMENTS=(\\d+)\\b");
        u = Pattern.compile((String)"[:|,]HOLD-BACK=([\\d\\.]+)\\b");
        v = Pattern.compile((String)"PART-HOLD-BACK=([\\d\\.]+)\\b");
        w = i.c("CAN-BLOCK-RELOAD");
        x = Pattern.compile((String)"#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
        y = Pattern.compile((String)"#EXTINF:([\\d\\.]+)\\b");
        z = Pattern.compile((String)"#EXTINF:[\\d\\.]+\\b,(.+)");
        A = Pattern.compile((String)"LAST-MSN=(\\d+)\\b");
        B = Pattern.compile((String)"LAST-PART=(\\d+)\\b");
        C = Pattern.compile((String)"TIME-OFFSET=(-?[\\d\\.]+)\\b");
        D = Pattern.compile((String)"#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
        E = Pattern.compile((String)"BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
        F = Pattern.compile((String)"BYTERANGE-START=(\\d+)\\b");
        G = Pattern.compile((String)"BYTERANGE-LENGTH=(\\d+)\\b");
        H = Pattern.compile((String)"METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
        I = Pattern.compile((String)"KEYFORMAT=\"(.+?)\"");
        J = Pattern.compile((String)"KEYFORMATVERSIONS=\"(.+?)\"");
        K = Pattern.compile((String)"URI=\"(.+?)\"");
        L = Pattern.compile((String)"IV=([^,.*]+)");
        M = Pattern.compile((String)"TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
        N = Pattern.compile((String)"TYPE=(PART|MAP)");
        O = Pattern.compile((String)"LANGUAGE=\"(.+?)\"");
        P = Pattern.compile((String)"NAME=\"(.+?)\"");
        Q = Pattern.compile((String)"GROUP-ID=\"(.+?)\"");
        R = Pattern.compile((String)"CHARACTERISTICS=\"(.+?)\"");
        S = Pattern.compile((String)"INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
        T = i.c("AUTOSELECT");
        U = i.c("DEFAULT");
        V = i.c("FORCED");
        W = i.c("INDEPENDENT");
        X = i.c("GAP");
        Y = i.c("PRECISE");
        Z = Pattern.compile((String)"VALUE=\"(.+?)\"");
        a0 = Pattern.compile((String)"IMPORT=\"(.+?)\"");
        b0 = Pattern.compile((String)"\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    }

    public i() {
        this(g.n, null);
    }

    public i(g g8, f f8) {
        this.a = g8;
        this.b = f8;
    }

    public static long A(String string2, Pattern pattern) {
        return new BigDecimal(i.z(string2, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
    }

    public static String B(String string2, Map map) {
        string2 = b0.matcher((CharSequence)string2);
        StringBuffer stringBuffer = new StringBuffer();
        while (string2.find()) {
            String string3 = string2.group(1);
            if (!map.containsKey((Object)string3)) continue;
            string2.appendReplacement(stringBuffer, Matcher.quoteReplacement((String)((String)map.get((Object)string3))));
        }
        string2.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static int C(BufferedReader bufferedReader, boolean bl, int n8) {
        while (n8 != -1 && Character.isWhitespace((int)n8) && (bl || !M.C0(n8))) {
            n8 = bufferedReader.read();
        }
        return n8;
    }

    public static boolean b(BufferedReader bufferedReader) {
        int n8;
        int n9 = n8 = bufferedReader.read();
        if (n8 == 239) {
            if (bufferedReader.read() == 187) {
                if (bufferedReader.read() != 191) {
                    return false;
                }
                n9 = bufferedReader.read();
            } else {
                return false;
            }
        }
        n8 = i.C(bufferedReader, true, n9);
        for (n9 = 0; n9 < 7; ++n9) {
            if (n8 != "#EXTM3U".charAt(n9)) {
                return false;
            }
            n8 = bufferedReader.read();
        }
        return M.C0(i.C(bufferedReader, false, n8));
    }

    public static Pattern c(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("=(");
        stringBuilder.append("NO");
        stringBuilder.append("|");
        stringBuilder.append("YES");
        stringBuilder.append(")");
        return Pattern.compile((String)stringBuilder.toString());
    }

    public static m d(String string2, m.b[] arrb) {
        m.b[] arrb2 = new m.b[arrb.length];
        for (int i8 = 0; i8 < arrb.length; ++i8) {
            arrb2[i8] = arrb[i8].b(null);
        }
        return new m(string2, arrb2);
    }

    public static String e(long l8, String string2, String string3) {
        if (string2 == null) {
            return null;
        }
        if (string3 != null) {
            return string3;
        }
        return Long.toHexString((long)l8);
    }

    public static g.b f(ArrayList arrayList, String string2) {
        for (int i8 = 0; i8 < arrayList.size(); ++i8) {
            g.b b8 = (g.b)arrayList.get(i8);
            if (!string2.equals((Object)b8.d)) continue;
            return b8;
        }
        return null;
    }

    public static g.b g(ArrayList arrayList, String string2) {
        for (int i8 = 0; i8 < arrayList.size(); ++i8) {
            g.b b8 = (g.b)arrayList.get(i8);
            if (!string2.equals((Object)b8.e)) continue;
            return b8;
        }
        return null;
    }

    public static g.b h(ArrayList arrayList, String string2) {
        for (int i8 = 0; i8 < arrayList.size(); ++i8) {
            g.b b8 = (g.b)arrayList.get(i8);
            if (!string2.equals((Object)b8.c)) continue;
            return b8;
        }
        return null;
    }

    public static double j(String string2, Pattern pattern) {
        return Double.parseDouble((String)i.z(string2, pattern, Collections.emptyMap()));
    }

    public static m.b k(String arrby, String string2, Map map) {
        String string3 = i.u((String)arrby, J, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals((Object)string2)) {
            arrby = i.z((String)arrby, K, map);
            return new m.b(d0.g.d, "video/mp4", Base64.decode((String)arrby.substring(arrby.indexOf(44)), (int)0));
        }
        if ("com.widevine".equals((Object)string2)) {
            return new m.b(d0.g.d, "hls", M.r0((String)arrby));
        }
        if ("com.microsoft.playready".equals((Object)string2) && "1".equals((Object)string3)) {
            arrby = i.z((String)arrby, K, map);
            arrby = Base64.decode((String)arrby.substring(arrby.indexOf(44)), (int)0);
            string2 = d0.g.e;
            return new m.b((UUID)string2, "video/mp4", o.a((UUID)string2, arrby));
        }
        return null;
    }

    public static String l(String string2) {
        if (!"SAMPLE-AES-CENC".equals((Object)string2) && !"SAMPLE-AES-CTR".equals((Object)string2)) {
            return "cbcs";
        }
        return "cenc";
    }

    public static int m(String string2, Pattern pattern) {
        return Integer.parseInt((String)i.z(string2, pattern, Collections.emptyMap()));
    }

    public static long n(String string2, Pattern pattern) {
        return Long.parseLong((String)i.z(string2, pattern, Collections.emptyMap()));
    }

    public static f o(g g8, f f8, b b8, String string2) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:548)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static g p(b var0, String var1_1) {
        var12_2 = new HashMap();
        var24_3 = new HashMap();
        var25_4 = new ArrayList();
        var16_5 = new ArrayList();
        var15_6 = new ArrayList();
        var14_7 = new ArrayList();
        var19_8 = new ArrayList();
        var13_9 = new ArrayList();
        var18_10 = new ArrayList();
        var17_11 = new ArrayList();
        var9_12 = false;
        var5_13 = false;
        do {
            var10_20 = var0.a();
            var20_22 = "application/x-mpegURL";
            if (!var10_20) break;
            var20_22 = var0.b();
            if (var20_22.startsWith("#EXT")) {
                var17_11.add(var20_22);
            }
            var11_21 = var20_22.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            if (var20_22.startsWith("#EXT-X-DEFINE")) {
                var24_3.put((Object)i.z((String)var20_22, i.P, (Map)var24_3), (Object)i.z((String)var20_22, i.Z, (Map)var24_3));
                continue;
            }
            if (var20_22.equals((Object)"#EXT-X-INDEPENDENT-SEGMENTS")) {
                var9_12 = true;
                continue;
            }
            if (var20_22.startsWith("#EXT-X-MEDIA")) {
                var13_9.add(var20_22);
                continue;
            }
            if (var20_22.startsWith("#EXT-X-SESSION-KEY")) {
                var21_23 = i.k((String)var20_22, i.u((String)var20_22, i.I, "identity", (Map)var24_3), (Map)var24_3);
                if (var21_23 == null) continue;
                var18_10.add((Object)new m(i.l(i.z((String)var20_22, i.H, (Map)var24_3)), new m.b[]{var21_23}));
                continue;
            }
            if (!var20_22.startsWith("#EXT-X-STREAM-INF") && !var11_21) continue;
            var10_20 = var20_22.contains((CharSequence)"CLOSED-CAPTIONS=NONE");
            var6_17 = var11_21 != false ? 16384 : 0;
            var7_18 = i.m((String)var20_22, i.h);
            var8_19 = i.s((String)var20_22, i.c, -1);
            var21_23 = i.v((String)var20_22, i.j, (Map)var24_3);
            var22_24 = i.v((String)var20_22, i.k, (Map)var24_3);
            if (var22_24 != null) {
                var22_24 = M.b1((String)var22_24, "x");
                var3_15 = Integer.parseInt((String)var22_24[0]);
                var4_16 = Integer.parseInt((String)var22_24[1]);
                if (var3_15 <= 0 || var4_16 <= 0) {
                    var4_16 = -1;
                    var3_15 = -1;
                }
            } else {
                var3_15 = -1;
                var4_16 = -1;
            }
            var22_24 = i.v((String)var20_22, i.l, (Map)var24_3);
            var2_14 = var22_24 != null ? Float.parseFloat((String)var22_24) : -1.0f;
            var23_25 = i.v((String)var20_22, i.d, (Map)var24_3);
            var26_26 = i.v((String)var20_22, i.e, (Map)var24_3);
            var27_27 = i.v((String)var20_22, i.f, (Map)var24_3);
            var28_28 = i.v((String)var20_22, i.g, (Map)var24_3);
            if (var11_21) {
                var20_22 = i.z((String)var20_22, i.K, (Map)var24_3);
            } else {
                if (var0.a() == false) throw A.c("#EXT-X-STREAM-INF must be followed by another line", null);
                var20_22 = i.B(var0.b(), (Map)var24_3);
            }
            var29_29 = G.f(var1_1, (String)var20_22);
            var25_4.add((Object)new g.b((Uri)var29_29, new q.b().Z(var25_4.size()).Q("application/x-mpegURL").O((String)var21_23).M(var8_19).j0(var7_18).v0(var3_15).Y(var4_16).X(var2_14).m0(var6_17).K(), (String)var23_25, (String)var26_26, (String)var27_27, var28_28));
            var21_23 = var12_2;
            var20_22 = var22_24 = (ArrayList)var21_23.get((Object)var29_29);
            if (var22_24 == null) {
                var20_22 = new ArrayList();
                var21_23.put((Object)var29_29, var20_22);
            }
            var20_22.add((Object)new t.b(var8_19, var7_18, (String)var23_25, (String)var26_26, (String)var27_27, var28_28));
            var5_13 |= var10_20;
        } while (true);
        var0 = var14_7;
        var26_26 = new ArrayList();
        var14_7 = new HashSet();
        for (var3_15 = 0; var3_15 < var25_4.size(); ++var3_15) {
            var21_23 = (g.b)var25_4.get(var3_15);
            if (!var14_7.add((Object)var21_23.a)) continue;
            var10_20 = var21_23.b.k == null;
            g0.a.f(var10_20);
            var22_24 = new x(new x.b[]{new t(null, null, (List)g0.a.e((Object)((ArrayList)var12_2.get((Object)var21_23.a))))});
            var26_26.add((Object)var21_23.a(var21_23.b.a().h0((x)var22_24).K()));
        }
        var21_23 = var12_2 = null;
        var4_16 = 0;
        var14_7 = var16_5;
        var16_5 = var0;
        var0 = var21_23;
        do {
            block47 : {
                block46 : {
                    if (var4_16 >= var13_9.size()) {
                        if (var5_13 == false) return new g(var1_1, (List)var17_11, (List)var26_26, (List)var14_7, (List)var15_6, (List)var16_5, (List)var19_8, (q)var0, (List)var12_2, var9_12, (Map)var24_3, (List)var18_10);
                        var12_2 = Collections.emptyList();
                        return new g(var1_1, (List)var17_11, (List)var26_26, (List)var14_7, (List)var15_6, (List)var16_5, (List)var19_8, (q)var0, (List)var12_2, var9_12, (Map)var24_3, (List)var18_10);
                    }
                    var22_24 = (String)var13_9.get(var4_16);
                    var28_28 = i.z((String)var22_24, i.Q, (Map)var24_3);
                    var29_29 = i.z((String)var22_24, i.P, (Map)var24_3);
                    var21_23 = new q.b();
                    var23_25 = new StringBuilder();
                    var23_25.append(var28_28);
                    var23_25.append(":");
                    var23_25.append(var29_29);
                    var27_27 = var21_23.a0(var23_25.toString()).c0(var29_29).Q((String)var20_22).q0(i.x((String)var22_24)).m0(i.w((String)var22_24, (Map)var24_3)).e0(i.v((String)var22_24, i.O, (Map)var24_3));
                    var21_23 = i.v((String)var22_24, i.K, (Map)var24_3);
                    var21_23 = var21_23 == null ? null : G.f(var1_1, (String)var21_23);
                    var23_25 = var13_9;
                    var30_30 = new x(new x.b[]{new t(var28_28, var29_29, Collections.emptyList())});
                    var13_9 = i.z((String)var22_24, i.M, (Map)var24_3);
                    var13_9.hashCode();
                    switch (var13_9.hashCode()) {
                        case 81665115: {
                            if (!var13_9.equals((Object)"VIDEO")) break;
                            var3_15 = 3;
                            ** break;
                        }
                        case 62628790: {
                            if (!var13_9.equals((Object)"AUDIO")) break;
                            var3_15 = 2;
                            ** break;
                        }
                        case -333210994: {
                            if (!var13_9.equals((Object)"CLOSED-CAPTIONS")) break;
                            var3_15 = 1;
                            ** break;
                        }
                        case -959297733: {
                            if (var13_9.equals((Object)"SUBTITLES")) break block46;
                        }
                    }
                    var3_15 = -1;
                    ** break;
                }
                var3_15 = 0;
lbl128: // 5 sources:
                switch (var3_15) {
                    case 3: {
                        var13_9 = i.h(var25_4, var28_28);
                        if (var13_9 != null) {
                            var13_9 = var13_9.b;
                            var22_24 = M.Q(var13_9.j, 2);
                            var27_27.O((String)var22_24).o0(z.g((String)var22_24)).v0(var13_9.t).Y(var13_9.u).X(var13_9.v);
                        }
                        if (var21_23 != null) {
                            var27_27.h0(var30_30);
                            var14_7.add((Object)new g.a((Uri)var21_23, var27_27.K(), var28_28, var29_29));
                        }
                    }
                    default: {
                        break block47;
                    }
                    case 2: {
                        var31_31 = i.f(var25_4, var28_28);
                        if (var31_31 != null) {
                            var13_9 = M.Q(var31_31.b.j, 1);
                            var27_27.O((String)var13_9);
                            var13_9 = z.g((String)var13_9);
                        } else {
                            var13_9 = null;
                        }
                        var32_32 = i.v((String)var22_24, i.i, (Map)var24_3);
                        if (var32_32 != null) {
                            var27_27.N(Integer.parseInt((String)M.c1(var32_32, "/")[0]));
                            var22_24 = var13_9;
                            if ("audio/eac3".equals(var13_9)) {
                                var22_24 = var13_9;
                                if (var32_32.endsWith("/JOC")) {
                                    var27_27.O("ec+3");
                                    var22_24 = "audio/eac3-joc";
                                }
                            }
                        } else {
                            var22_24 = var13_9;
                        }
                        var27_27.o0((String)var22_24);
                        if (var21_23 != null) {
                            var27_27.h0(var30_30);
                            var15_6.add((Object)new g.a((Uri)var21_23, var27_27.K(), var28_28, var29_29));
                            var13_9 = var12_2;
                        } else {
                            var13_9 = var12_2;
                            if (var31_31 != null) {
                                var0 = var27_27.K();
                                var13_9 = var12_2;
                            }
                        }
                        ** GOTO lbl183
                    }
                    case 1: {
                        var13_9 = i.z((String)var22_24, i.S, (Map)var24_3);
                        if (var13_9.startsWith("CC")) {
                            var3_15 = Integer.parseInt((String)var13_9.substring(2));
                            var21_23 = "application/cea-608";
                        } else {
                            var3_15 = Integer.parseInt((String)var13_9.substring(7));
                            var21_23 = "application/cea-708";
                        }
                        var13_9 = var12_2;
                        if (var12_2 == null) {
                            var13_9 = new ArrayList();
                        }
                        var27_27.o0((String)var21_23).L(var3_15);
                        var13_9.add((Object)var27_27.K());
lbl183: // 3 sources:
                        var12_2 = var13_9;
                        break block47;
                    }
                    case 0: 
                }
                var13_9 = var0;
                var0 = i.g(var25_4, var28_28);
                if (var0 != null) {
                    var0 = M.Q(var0.b.j, 3);
                    var27_27.O((String)var0);
                    var0 = z.g((String)var0);
                } else {
                    var0 = null;
                }
                var22_24 = var0;
                if (var0 == null) {
                    var22_24 = "text/vtt";
                }
                var27_27.o0((String)var22_24).h0(var30_30);
                if (var21_23 != null) {
                    var16_5.add((Object)new g.a((Uri)var21_23, var27_27.K(), var28_28, var29_29));
                    var0 = var13_9;
                } else {
                    g0.o.h("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                    var0 = var13_9;
                }
            }
            ++var4_16;
            var13_9 = var23_25;
        } while (true);
    }

    public static boolean q(String string2, Pattern pattern, boolean bl) {
        if ((string2 = pattern.matcher((CharSequence)string2)).find()) {
            return "YES".equals((Object)string2.group(1));
        }
        return bl;
    }

    public static double r(String string2, Pattern pattern, double d8) {
        if ((string2 = pattern.matcher((CharSequence)string2)).find()) {
            return Double.parseDouble((String)((String)g0.a.e(string2.group(1))));
        }
        return d8;
    }

    public static int s(String string2, Pattern pattern, int n8) {
        if ((string2 = pattern.matcher((CharSequence)string2)).find()) {
            return Integer.parseInt((String)((String)g0.a.e(string2.group(1))));
        }
        return n8;
    }

    public static long t(String string2, Pattern pattern, long l8) {
        if ((string2 = pattern.matcher((CharSequence)string2)).find()) {
            return Long.parseLong((String)((String)g0.a.e(string2.group(1))));
        }
        return l8;
    }

    public static String u(String string2, Pattern pattern, String string3, Map map) {
        if ((string2 = pattern.matcher((CharSequence)string2)).find()) {
            string3 = (String)g0.a.e(string2.group(1));
        }
        string2 = string3;
        if (!map.isEmpty()) {
            if (string3 == null) {
                return string3;
            }
            string2 = i.B(string3, map);
        }
        return string2;
    }

    public static String v(String string2, Pattern pattern, Map map) {
        return i.u(string2, pattern, null, map);
    }

    public static int w(String arrobject, Map map) {
        arrobject = i.v((String)arrobject, R, map);
        boolean bl = TextUtils.isEmpty((CharSequence)arrobject);
        int n8 = 0;
        if (bl) {
            return 0;
        }
        if (M.s(arrobject = M.b1((String)arrobject, ","), "public.accessibility.describes-video")) {
            n8 = 512;
        }
        int n9 = n8;
        if (M.s(arrobject, "public.accessibility.transcribes-spoken-dialog")) {
            n9 = n8 | 4096;
        }
        n8 = n9;
        if (M.s(arrobject, "public.accessibility.describes-music-and-sound")) {
            n8 = n9 | 1024;
        }
        n9 = n8;
        if (M.s(arrobject, "public.easy-to-read")) {
            n9 = n8 | 8192;
        }
        return n9;
    }

    public static int x(String string2) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public static f.f y(String string2) {
        long l8;
        boolean bl;
        long l9;
        long l10;
        block0 : {
            double d8 = i.r(string2, r, -9.223372036854776E18);
            l10 = -9223372036854775807L;
            l8 = d8 == -9.223372036854776E18 ? -9223372036854775807L : (long)(d8 * 1000000.0);
            bl = i.q(string2, s, false);
            d8 = i.r(string2, u, -9.223372036854776E18);
            l9 = d8 == -9.223372036854776E18 ? -9223372036854775807L : (long)(d8 * 1000000.0);
            d8 = i.r(string2, v, -9.223372036854776E18);
            if (d8 == -9.223372036854776E18) break block0;
            l10 = (long)(d8 * 1000000.0);
        }
        return new f.f(l8, bl, l9, l10, i.q(string2, w, false));
    }

    public static String z(String string2, Pattern pattern, Map object) {
        if ((object = i.v(string2, pattern, (Map)object)) != null) {
            return object;
        }
        object = new StringBuilder();
        object.append("Couldn't match ");
        object.append(pattern.pattern());
        object.append(" in ");
        object.append(string2);
        throw A.c(object.toString(), null);
    }

    /*
     * Exception decompiling
     */
    public h i(Uri var1_1, InputStream var2_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 4[WHILELOOP]
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public static final class a
    extends IOException {
    }

    public static class b {
        public final BufferedReader a;
        public final Queue b;
        public String c;

        public b(Queue queue, BufferedReader bufferedReader) {
            this.b = queue;
            this.a = bufferedReader;
        }

        public boolean a() {
            block3 : {
                String string2;
                if (this.c != null) {
                    return true;
                }
                if (!this.b.isEmpty()) {
                    this.c = (String)g0.a.e((String)this.b.poll());
                    return true;
                }
                do {
                    this.c = string2 = this.a.readLine();
                    if (string2 == null) break block3;
                    this.c = string2 = string2.trim();
                } while (string2.isEmpty());
                return true;
            }
            return false;
        }

        public String b() {
            if (this.a()) {
                String string2 = this.c;
                this.c = null;
                return string2;
            }
            throw new NoSuchElementException();
        }
    }

}

