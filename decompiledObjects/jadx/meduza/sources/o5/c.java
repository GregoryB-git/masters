package o5;

import a0.j;
import android.text.Layout;
import h5.i;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p2.m0;
import v5.e0;
import v5.m;

/* loaded from: classes.dex */
public final class c extends h5.f {

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f11873n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f11874o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f11875p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f11876q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f11877r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f11878s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u, reason: collision with root package name */
    public static final b f11879u = new b(30.0f, 1, 1);

    /* renamed from: v, reason: collision with root package name */
    public static final a f11880v = new a(15);

    /* renamed from: m, reason: collision with root package name */
    public final XmlPullParserFactory f11881m;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f11882a;

        public a(int i10) {
            this.f11882a = i10;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final float f11883a;

        /* renamed from: b, reason: collision with root package name */
        public final int f11884b;

        /* renamed from: c, reason: collision with root package name */
        public final int f11885c;

        public b(float f, int i10, int i11) {
            this.f11883a = f;
            this.f11884b = i10;
            this.f11885c = i11;
        }
    }

    /* renamed from: o5.c$c, reason: collision with other inner class name */
    public static final class C0185c {

        /* renamed from: a, reason: collision with root package name */
        public final int f11886a;

        /* renamed from: b, reason: collision with root package name */
        public final int f11887b;

        public C0185c(int i10, int i11) {
            this.f11886a = i10;
            this.f11887b = i11;
        }
    }

    public c() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f11881m = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static f i(f fVar) {
        return fVar == null ? new f() : fVar;
    }

    public static boolean j(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals(Constants.INFORMATION);
    }

    public static Layout.Alignment k(String str) {
        String x02 = x6.b.x0(str);
        x02.getClass();
        switch (x02) {
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

    public static a l(XmlPullParser xmlPullParser, a aVar) {
        StringBuilder sb2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = t.matcher(attributeValue);
        if (matcher.matches()) {
            try {
                String group = matcher.group(1);
                group.getClass();
                int parseInt = Integer.parseInt(group);
                String group2 = matcher.group(2);
                group2.getClass();
                int parseInt2 = Integer.parseInt(group2);
                if (parseInt != 0 && parseInt2 != 0) {
                    return new a(parseInt2);
                }
                throw new i("Invalid cell resolution " + parseInt + " " + parseInt2);
            } catch (NumberFormatException unused) {
                sb2 = new StringBuilder();
            }
        } else {
            sb2 = new StringBuilder();
        }
        sb2.append("Ignoring malformed cell resolution: ");
        sb2.append(attributeValue);
        m.f("TtmlDecoder", sb2.toString());
        return aVar;
    }

    public static void m(String str, f fVar) {
        Matcher matcher;
        String group;
        int i10 = e0.f15881a;
        String[] split = str.split("\\s+", -1);
        if (split.length == 1) {
            matcher = f11875p.matcher(str);
        } else {
            if (split.length != 2) {
                throw new i(j.m(defpackage.f.l("Invalid number of entries for fontSize: "), split.length, "."));
            }
            matcher = f11875p.matcher(split[1]);
            m.f("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new i(defpackage.g.e("Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        group.getClass();
        group.hashCode();
        switch (group) {
            case "%":
                fVar.f11917j = 3;
                break;
            case "em":
                fVar.f11917j = 2;
                break;
            case "px":
                fVar.f11917j = 1;
                break;
            default:
                throw new i(defpackage.g.e("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        fVar.f11918k = Float.parseFloat(group2);
    }

    public static b n(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i10 = e0.f15881a;
            if (attributeValue2.split(" ", -1).length != 2) {
                throw new i("frameRateMultiplier doesn't have 2 parts");
            }
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        }
        b bVar = f11879u;
        int i11 = bVar.f11884b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = bVar.f11885c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new b(parseInt * f, i11, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void o(org.xmlpull.v1.XmlPullParser r19, java.util.HashMap r20, o5.c.a r21, o5.c.C0185c r22, java.util.HashMap r23, java.util.HashMap r24) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.c.o(org.xmlpull.v1.XmlPullParser, java.util.HashMap, o5.c$a, o5.c$c, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static d p(XmlPullParser xmlPullParser, d dVar, HashMap hashMap, b bVar) {
        long j10;
        long j11;
        char c10;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        f q10 = q(xmlPullParser, null);
        String str = null;
        String str2 = "";
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        long j14 = -9223372036854775807L;
        String[] strArr = null;
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c10 = 5;
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
                    j14 = r(attributeValue, bVar);
                } else if (c10 == 2) {
                    j13 = r(attributeValue, bVar);
                } else if (c10 == 3) {
                    j12 = r(attributeValue, bVar);
                } else if (c10 == 4) {
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        int i11 = e0.f15881a;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                    }
                } else if (c10 == 5 && attributeValue.startsWith("#")) {
                    str = attributeValue.substring(1);
                }
            } else if (hashMap.containsKey(attributeValue)) {
                str2 = attributeValue;
            }
        }
        if (dVar != null) {
            long j15 = dVar.f11891d;
            j10 = -9223372036854775807L;
            if (j15 != -9223372036854775807L) {
                if (j12 != -9223372036854775807L) {
                    j12 += j15;
                }
                if (j13 != -9223372036854775807L) {
                    j13 += j15;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (j13 == j10) {
            if (j14 != j10) {
                j11 = j12 + j14;
            } else if (dVar != null) {
                long j16 = dVar.f11892e;
                if (j16 != j10) {
                    j11 = j16;
                }
            }
            return new d(xmlPullParser.getName(), null, j12, j11, q10, strArr, str2, str, dVar);
        }
        j11 = j13;
        return new d(xmlPullParser.getName(), null, j12, j11, q10, strArr, str2, str, dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0407, code lost:
    
        if (r5.equals("linethrough") == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f1, code lost:
    
        if (r5.equals("auto") != false) goto L131;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static o5.f q(org.xmlpull.v1.XmlPullParser r16, o5.f r17) {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.c.q(org.xmlpull.v1.XmlPullParser, o5.f):o5.f");
    }

    public static long r(String str, b bVar) {
        double parseDouble;
        double d10;
        double d11;
        Matcher matcher = f11873n.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            group.getClass();
            double parseLong = Long.parseLong(group) * 3600;
            matcher.group(2).getClass();
            double parseLong2 = parseLong + (Long.parseLong(r13) * 60);
            matcher.group(3).getClass();
            double parseLong3 = parseLong2 + Long.parseLong(r13);
            String group2 = matcher.group(4);
            return (long) ((parseLong3 + (group2 != null ? Double.parseDouble(group2) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / bVar.f11883a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / bVar.f11884b) / bVar.f11883a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f11874o.matcher(str);
        if (!matcher2.matches()) {
            throw new i(defpackage.g.d("Malformed time expression: ", str));
        }
        String group3 = matcher2.group(1);
        group3.getClass();
        parseDouble = Double.parseDouble(group3);
        String group4 = matcher2.group(2);
        group4.getClass();
        group4.hashCode();
        switch (group4) {
            case "f":
                d10 = bVar.f11883a;
                parseDouble /= d10;
                break;
            case "h":
                d11 = 3600.0d;
                break;
            case "m":
                d11 = 60.0d;
                break;
            case "t":
                d10 = bVar.f11885c;
                parseDouble /= d10;
                break;
            case "ms":
                d10 = 1000.0d;
                parseDouble /= d10;
                break;
        }
        parseDouble *= d11;
        return (long) (parseDouble * 1000000.0d);
    }

    public static C0185c s(XmlPullParser xmlPullParser) {
        StringBuilder sb2;
        String str;
        String G = m0.G(xmlPullParser, "extent");
        if (G == null) {
            return null;
        }
        Matcher matcher = f11878s.matcher(G);
        if (matcher.matches()) {
            try {
                String group = matcher.group(1);
                group.getClass();
                int parseInt = Integer.parseInt(group);
                String group2 = matcher.group(2);
                group2.getClass();
                return new C0185c(parseInt, Integer.parseInt(group2));
            } catch (NumberFormatException unused) {
                sb2 = new StringBuilder();
                str = "Ignoring malformed tts extent: ";
            }
        } else {
            sb2 = new StringBuilder();
            str = "Ignoring non-pixel tts extent: ";
        }
        sb2.append(str);
        sb2.append(G);
        m.f("TtmlDecoder", sb2.toString());
        return null;
    }

    @Override // h5.f
    public final h5.g h(byte[] bArr, int i10, boolean z10) {
        b bVar;
        try {
            XmlPullParser newPullParser = this.f11881m.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C0185c c0185c = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = f11879u;
            a aVar = f11880v;
            int i11 = 0;
            g gVar = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = n(newPullParser);
                            aVar = l(newPullParser, f11880v);
                            c0185c = s(newPullParser);
                        }
                        C0185c c0185c2 = c0185c;
                        b bVar3 = bVar2;
                        a aVar2 = aVar;
                        if (!j(name)) {
                            m.e("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i11++;
                            bVar = bVar3;
                        } else if ("head".equals(name)) {
                            bVar = bVar3;
                            o(newPullParser, hashMap, aVar2, c0185c2, hashMap2, hashMap3);
                        } else {
                            bVar = bVar3;
                            try {
                                d p10 = p(newPullParser, dVar, hashMap2, bVar);
                                arrayDeque.push(p10);
                                if (dVar != null) {
                                    if (dVar.f11899m == null) {
                                        dVar.f11899m = new ArrayList();
                                    }
                                    dVar.f11899m.add(p10);
                                }
                            } catch (i e10) {
                                m.g("TtmlDecoder", "Suppressing parser error", e10);
                                i11++;
                            }
                        }
                        bVar2 = bVar;
                        c0185c = c0185c2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        dVar.getClass();
                        d a10 = d.a(newPullParser.getText());
                        if (dVar.f11899m == null) {
                            dVar.f11899m = new ArrayList();
                        }
                        dVar.f11899m.add(a10);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            d dVar2 = (d) arrayDeque.peek();
                            dVar2.getClass();
                            gVar = new g(dVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                newPullParser.next();
            }
            if (gVar != null) {
                return gVar;
            }
            throw new i("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new i("Unable to decode source", e12);
        }
    }
}
