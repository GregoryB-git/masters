package i1;

import android.text.Layout;
import c1.i;
import c1.k;
import c1.m;
import c1.s;
import c1.t;
import com.android.installreferrer.api.InstallReferrerClient;
import g0.AbstractC1297a;
import g0.InterfaceC1303g;
import g0.M;
import g0.N;
import g0.o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: i1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1345d implements t {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f14768b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f14769c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f14770d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f14771e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f14772f = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f14773g = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f14774h = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: i, reason: collision with root package name */
    public static final a f14775i = new a(30.0f, 1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f14776a;

    /* renamed from: i1.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final float f14777a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14778b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14779c;

        public a(float f7, int i7, int i8) {
            this.f14777a = f7;
            this.f14778b = i7;
            this.f14779c = i8;
        }
    }

    /* renamed from: i1.d$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f14780a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14781b;

        public b(int i7, int i8) {
            this.f14780a = i7;
            this.f14781b = i8;
        }
    }

    public C1345d() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f14776a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    public static g e(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean f(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static Layout.Alignment g(String str) {
        String e7 = W2.c.e(str);
        e7.hashCode();
        switch (e7) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static int h(XmlPullParser xmlPullParser, int i7) {
        StringBuilder sb;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i7;
        }
        Matcher matcher = f14774h.matcher(attributeValue);
        if (matcher.matches()) {
            boolean z7 = true;
            try {
                int parseInt = Integer.parseInt((String) AbstractC1297a.e(matcher.group(1)));
                int parseInt2 = Integer.parseInt((String) AbstractC1297a.e(matcher.group(2)));
                if (parseInt == 0 || parseInt2 == 0) {
                    z7 = false;
                }
                AbstractC1297a.b(z7, "Invalid cell resolution " + parseInt + " " + parseInt2);
                return parseInt2;
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
            }
        } else {
            sb = new StringBuilder();
        }
        sb.append("Ignoring malformed cell resolution: ");
        sb.append(attributeValue);
        o.h("TtmlParser", sb.toString());
        return i7;
    }

    public static void i(String str, g gVar) {
        Matcher matcher;
        String str2;
        String[] b12 = M.b1(str, "\\s+");
        if (b12.length == 1) {
            matcher = f14770d.matcher(str);
        } else {
            if (b12.length != 2) {
                throw new m("Invalid number of entries for fontSize: " + b12.length + ".");
            }
            matcher = f14770d.matcher(b12[1]);
            o.h("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new m("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) AbstractC1297a.e(matcher.group(3));
        str2.hashCode();
        switch (str2) {
            case "%":
                gVar.z(3);
                break;
            case "em":
                gVar.z(2);
                break;
            case "px":
                gVar.z(1);
                break;
            default:
                throw new m("Invalid unit for fontSize: '" + str2 + "'.");
        }
        gVar.y(Float.parseFloat((String) AbstractC1297a.e(matcher.group(1))));
    }

    public static a j(XmlPullParser xmlPullParser) {
        float f7;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            AbstractC1297a.b(M.b1(attributeValue2, " ").length == 2, "frameRateMultiplier doesn't have 2 parts");
            f7 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f7 = 1.0f;
        }
        a aVar = f14775i;
        int i7 = aVar.f14778b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i7 = Integer.parseInt(attributeValue3);
        }
        int i8 = aVar.f14779c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i8 = Integer.parseInt(attributeValue4);
        }
        return new a(parseInt * f7, i7, i8);
    }

    public static Map k(XmlPullParser xmlPullParser, Map map, int i7, b bVar, Map map2, Map map3) {
        do {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "style")) {
                String a7 = N.a(xmlPullParser, "style");
                g p7 = p(xmlPullParser, new g());
                if (a7 != null) {
                    for (String str : q(a7)) {
                        p7.a((g) map.get(str));
                    }
                }
                String g7 = p7.g();
                if (g7 != null) {
                    map.put(g7, p7);
                }
            } else if (N.f(xmlPullParser, "region")) {
                C1346e n7 = n(xmlPullParser, i7, bVar);
                if (n7 != null) {
                    map2.put(n7.f14782a, n7);
                }
            } else if (N.f(xmlPullParser, "metadata")) {
                l(xmlPullParser, map3);
            }
        } while (!N.d(xmlPullParser, "head"));
        return map;
    }

    public static void l(XmlPullParser xmlPullParser, Map map) {
        String a7;
        do {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "image") && (a7 = N.a(xmlPullParser, "id")) != null) {
                map.put(a7, xmlPullParser.nextText());
            }
        } while (!N.d(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C1344c m(XmlPullParser xmlPullParser, C1344c c1344c, Map map, a aVar) {
        long j7;
        long j8;
        char c7;
        int attributeCount = xmlPullParser.getAttributeCount();
        g p7 = p(xmlPullParser, null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j9 = -9223372036854775807L;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        for (int i7 = 0; i7 < attributeCount; i7++) {
            String attributeName = xmlPullParser.getAttributeName(i7);
            String attributeValue = xmlPullParser.getAttributeValue(i7);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c7 = 0;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c7 = 1;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c7 = 2;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c7 = 3;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c7 = 4;
                        break;
                    }
                    c7 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c7 = 5;
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
                    if (!map.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j11 = r(attributeValue, aVar);
                    break;
                case 2:
                    j10 = r(attributeValue, aVar);
                    break;
                case 3:
                    j9 = r(attributeValue, aVar);
                    break;
                case 4:
                    String[] q7 = q(attributeValue);
                    if (q7.length > 0) {
                        strArr = q7;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (c1344c != null) {
            long j12 = c1344c.f14758d;
            j7 = -9223372036854775807L;
            if (j12 != -9223372036854775807L) {
                if (j9 != -9223372036854775807L) {
                    j9 += j12;
                }
                if (j10 != -9223372036854775807L) {
                    j10 += j12;
                }
            }
        } else {
            j7 = -9223372036854775807L;
        }
        long j13 = j9;
        if (j10 == j7) {
            if (j11 != j7) {
                j8 = j13 + j11;
            } else if (c1344c != null) {
                long j14 = c1344c.f14759e;
                if (j14 != j7) {
                    j8 = j14;
                }
            }
            return C1344c.c(xmlPullParser.getName(), j13, j8, p7, strArr, str2, str, c1344c);
        }
        j8 = j10;
        return C1344c.c(xmlPullParser.getName(), j13, j8, p7, strArr, str2, str, c1344c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0180, code lost:
    
        if (r0.equals("tb") == false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static i1.C1346e n(org.xmlpull.v1.XmlPullParser r17, int r18, i1.C1345d.b r19) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C1345d.n(org.xmlpull.v1.XmlPullParser, int, i1.d$b):i1.e");
    }

    public static float o(String str) {
        Matcher matcher = f14771e.matcher(str);
        if (!matcher.matches()) {
            o.h("TtmlParser", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) AbstractC1297a.e(matcher.group(1)))));
        } catch (NumberFormatException e7) {
            o.i("TtmlParser", "Failed to parse shear: " + str, e7);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c4, code lost:
    
        if (r3.equals("text") == false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static i1.g p(org.xmlpull.v1.XmlPullParser r12, i1.g r13) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C1345d.p(org.xmlpull.v1.XmlPullParser, i1.g):i1.g");
    }

    public static String[] q(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : M.b1(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long r(java.lang.String r13, i1.C1345d.a r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C1345d.r(java.lang.String, i1.d$a):long");
    }

    public static b s(XmlPullParser xmlPullParser) {
        StringBuilder sb;
        String str;
        String a7 = N.a(xmlPullParser, "extent");
        if (a7 == null) {
            return null;
        }
        Matcher matcher = f14773g.matcher(a7);
        if (matcher.matches()) {
            try {
                return new b(Integer.parseInt((String) AbstractC1297a.e(matcher.group(1))), Integer.parseInt((String) AbstractC1297a.e(matcher.group(2))));
            } catch (NumberFormatException unused) {
                sb = new StringBuilder();
                str = "Ignoring malformed tts extent: ";
            }
        } else {
            sb = new StringBuilder();
            str = "Ignoring non-pixel tts extent: ";
        }
        sb.append(str);
        sb.append(a7);
        o.h("TtmlParser", sb.toString());
        return null;
    }

    @Override // c1.t
    public k a(byte[] bArr, int i7, int i8) {
        char c7;
        a aVar;
        try {
            XmlPullParser newPullParser = this.f14776a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new C1346e(""));
            b bVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i7, i8), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            a aVar2 = f14775i;
            h hVar = null;
            int i9 = 0;
            int i10 = 15;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C1344c c1344c = (C1344c) arrayDeque.peek();
                if (i9 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVar2 = j(newPullParser);
                            c7 = 15;
                            i10 = h(newPullParser, 15);
                            bVar = s(newPullParser);
                        } else {
                            c7 = 15;
                        }
                        b bVar2 = bVar;
                        a aVar3 = aVar2;
                        int i11 = i10;
                        if (f(name)) {
                            if ("head".equals(name)) {
                                aVar = aVar3;
                                k(newPullParser, hashMap, i11, bVar2, hashMap2, hashMap3);
                            } else {
                                aVar = aVar3;
                                try {
                                    C1344c m7 = m(newPullParser, c1344c, hashMap2, aVar);
                                    arrayDeque.push(m7);
                                    if (c1344c != null) {
                                        c1344c.a(m7);
                                    }
                                } catch (m e7) {
                                    o.i("TtmlParser", "Suppressing parser error", e7);
                                    i9++;
                                }
                            }
                            aVar2 = aVar;
                            bVar = bVar2;
                            i10 = i11;
                        } else {
                            o.f("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            i9++;
                            aVar2 = aVar3;
                            bVar = bVar2;
                            i10 = i11;
                        }
                    } else if (eventType == 4) {
                        ((C1344c) AbstractC1297a.e(c1344c)).a(C1344c.d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            hVar = new h((C1344c) AbstractC1297a.e((C1344c) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i9++;
                } else if (eventType == 3) {
                    i9--;
                }
                newPullParser.next();
            }
            return (k) AbstractC1297a.e(hVar);
        } catch (IOException e8) {
            throw new IllegalStateException("Unexpected error when reading input.", e8);
        } catch (XmlPullParserException e9) {
            throw new IllegalStateException("Unable to decode source", e9);
        }
    }

    @Override // c1.t
    public /* synthetic */ void b() {
        s.b(this);
    }

    @Override // c1.t
    public void c(byte[] bArr, int i7, int i8, t.b bVar, InterfaceC1303g interfaceC1303g) {
        i.c(a(bArr, i7, i8), bVar, interfaceC1303g);
    }

    @Override // c1.t
    public int d() {
        return 1;
    }
}
