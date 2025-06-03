package o0;

import B0.p;
import X2.AbstractC0703v;
import X2.E;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import com.android.installreferrer.api.InstallReferrerClient;
import d0.AbstractC1184g;
import d0.AbstractC1203z;
import d0.C1162A;
import d0.C1190m;
import d0.C1194q;
import d0.C1197t;
import g0.AbstractC1297a;
import g0.G;
import g0.M;
import g0.N;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o0.k;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: classes.dex */
public class d extends DefaultHandler implements p.a {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f18095b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f18096c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f18097d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f18098e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f18099a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final C1194q f18100a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC0703v f18101b;

        /* renamed from: c, reason: collision with root package name */
        public final k f18102c;

        /* renamed from: d, reason: collision with root package name */
        public final String f18103d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList f18104e;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f18105f;

        /* renamed from: g, reason: collision with root package name */
        public final long f18106g;

        /* renamed from: h, reason: collision with root package name */
        public final List f18107h;

        /* renamed from: i, reason: collision with root package name */
        public final List f18108i;

        public a(C1194q c1194q, List list, k kVar, String str, ArrayList arrayList, ArrayList arrayList2, List list2, List list3, long j7) {
            this.f18100a = c1194q;
            this.f18101b = AbstractC0703v.U(list);
            this.f18102c = kVar;
            this.f18103d = str;
            this.f18104e = arrayList;
            this.f18105f = arrayList2;
            this.f18107h = list2;
            this.f18108i = list3;
            this.f18106g = j7;
        }
    }

    public d() {
        try {
            this.f18099a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    public static int D(List list) {
        String str;
        for (int i7 = 0; i7 < list.size(); i7++) {
            e eVar = (e) list.get(i7);
            if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f18109a) && (str = eVar.f18110b) != null) {
                Matcher matcher = f18096c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                g0.o.h("MpdParser", "Unable to parse CEA-608 channel number from: " + eVar.f18110b);
            }
        }
        return -1;
    }

    public static int E(List list) {
        String str;
        for (int i7 = 0; i7 < list.size(); i7++) {
            e eVar = (e) list.get(i7);
            if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f18109a) && (str = eVar.f18110b) != null) {
                Matcher matcher = f18097d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                g0.o.h("MpdParser", "Unable to parse CEA-708 service block number from: " + eVar.f18110b);
            }
        }
        return -1;
    }

    public static long H(XmlPullParser xmlPullParser, String str, long j7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j7 : M.Q0(attributeValue);
    }

    public static e I(XmlPullParser xmlPullParser, String str) {
        String r02 = r0(xmlPullParser, "schemeIdUri", "");
        String r03 = r0(xmlPullParser, "value", null);
        String r04 = r0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!N.d(xmlPullParser, str));
        return new e(r02, r03, r04);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int J(XmlPullParser xmlPullParser) {
        char c7;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String e7 = W2.c.e(attributeValue);
        e7.hashCode();
        switch (e7.hashCode()) {
            case 1596796:
                if (e7.equals("4000")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case 2937391:
                if (e7.equals("a000")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case 3094034:
                if (e7.equals("f800")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case 3094035:
                if (e7.equals("f801")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case 3133436:
                if (e7.equals("fa01")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        switch (c7) {
        }
        return -1;
    }

    public static int K(XmlPullParser xmlPullParser) {
        int U6 = U(xmlPullParser, "value", -1);
        if (U6 <= 0 || U6 >= 33) {
            return -1;
        }
        return U6;
    }

    public static int L(XmlPullParser xmlPullParser) {
        int bitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return bitCount;
    }

    public static long M(XmlPullParser xmlPullParser, String str, long j7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j7 : M.R0(attributeValue);
    }

    public static String N(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            e eVar = (e) list.get(i7);
            String str = eVar.f18109a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(eVar.f18110b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(eVar.f18110b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    public static float R(XmlPullParser xmlPullParser, String str, float f7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f7 : Float.parseFloat(attributeValue);
    }

    public static float S(XmlPullParser xmlPullParser, float f7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f7;
        }
        Matcher matcher = f18095b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f7;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        float f8 = parseInt;
        return !TextUtils.isEmpty(matcher.group(2)) ? f8 / Integer.parseInt(r2) : f8;
    }

    public static int U(XmlPullParser xmlPullParser, String str, int i7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i7 : Integer.parseInt(attributeValue);
    }

    public static long W(List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            e eVar = (e) list.get(i7);
            if (W2.c.a("http://dashif.org/guidelines/last-segment-number", eVar.f18109a)) {
                return Long.parseLong(eVar.f18110b);
            }
        }
        return -1L;
    }

    public static long X(XmlPullParser xmlPullParser, String str, long j7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j7 : Long.parseLong(attributeValue);
    }

    public static int Z(XmlPullParser xmlPullParser) {
        int U6 = U(xmlPullParser, "value", -1);
        if (U6 < 0) {
            return -1;
        }
        int[] iArr = f18098e;
        if (U6 < iArr.length) {
            return iArr[U6];
        }
        return -1;
    }

    public static int p(int i7, int i8) {
        if (i7 == -1) {
            return i8;
        }
        if (i8 == -1) {
            return i7;
        }
        AbstractC1297a.f(i7 == i8);
        return i7;
    }

    public static String q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        AbstractC1297a.f(str.equals(str2));
        return str;
    }

    public static void r(ArrayList arrayList) {
        String str;
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList.size()) {
                str = null;
                break;
            }
            C1190m.b bVar = (C1190m.b) arrayList.get(i7);
            if (AbstractC1184g.f12617c.equals(bVar.f12660p) && (str = bVar.f12661q) != null) {
                arrayList.remove(i7);
                break;
            }
            i7++;
        }
        if (str == null) {
            return;
        }
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            C1190m.b bVar2 = (C1190m.b) arrayList.get(i8);
            if (AbstractC1184g.f12616b.equals(bVar2.f12660p) && bVar2.f12661q == null) {
                arrayList.set(i8, new C1190m.b(AbstractC1184g.f12617c, str, bVar2.f12662r, bVar2.f12663s));
            }
        }
    }

    public static String r0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public static void s(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1190m.b bVar = (C1190m.b) arrayList.get(size);
            if (!bVar.c()) {
                int i7 = 0;
                while (true) {
                    if (i7 >= arrayList.size()) {
                        break;
                    }
                    if (((C1190m.b) arrayList.get(i7)).a(bVar)) {
                        arrayList.remove(size);
                        break;
                    }
                    i7++;
                }
            }
        }
    }

    public static String s0(XmlPullParser xmlPullParser, String str) {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                w(xmlPullParser);
            }
        } while (!N.d(xmlPullParser, str));
        return str2;
    }

    public static long t(long j7, long j8) {
        if (j8 != -9223372036854775807L) {
            j7 = j8;
        }
        if (j7 == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j7;
    }

    public static String u(String str, String str2) {
        if (AbstractC1203z.o(str)) {
            return AbstractC1203z.c(str2);
        }
        if (AbstractC1203z.s(str)) {
            return AbstractC1203z.n(str2);
        }
        if (AbstractC1203z.r(str)) {
            return str;
        }
        if (AbstractC1203z.p(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String g7 = AbstractC1203z.g(str2);
        return "text/vtt".equals(g7) ? "application/x-mp4-vtt" : g7;
    }

    public static void w(XmlPullParser xmlPullParser) {
        if (N.e(xmlPullParser)) {
            int i7 = 1;
            while (i7 != 0) {
                xmlPullParser.next();
                if (N.e(xmlPullParser)) {
                    i7++;
                } else if (N.c(xmlPullParser)) {
                    i7--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public int A(XmlPullParser xmlPullParser) {
        char c7;
        String r02 = r0(xmlPullParser, "schemeIdUri", null);
        r02.hashCode();
        int i7 = -1;
        switch (r02.hashCode()) {
            case -2128649360:
                if (r02.equals("urn:dts:dash:audio_channel_configuration:2012")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case -1352850286:
                if (r02.equals("urn:mpeg:dash:23003:3:audio_channel_configuration:2011")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            case -1138141449:
                if (r02.equals("tag:dolby.com,2014:dash:audio_channel_configuration:2011")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case -986633423:
                if (r02.equals("urn:mpeg:mpegB:cicp:ChannelConfiguration")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case -79006963:
                if (r02.equals("tag:dts.com,2014:dash:audio_channel_configuration:2012")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case 312179081:
                if (r02.equals("tag:dts.com,2018:uhd:audio_channel_configuration")) {
                    c7 = 5;
                    break;
                }
                c7 = 65535;
                break;
            case 2036691300:
                if (r02.equals("urn:dolby:dash:audio_channel_configuration:2011")) {
                    c7 = 6;
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
            case 4:
                i7 = K(xmlPullParser);
                break;
            case 1:
                i7 = U(xmlPullParser, "value", -1);
                break;
            case 2:
            case 6:
                i7 = J(xmlPullParser);
                break;
            case 3:
                i7 = Z(xmlPullParser);
                break;
            case 5:
                i7 = L(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!N.d(xmlPullParser, "AudioChannelConfiguration"));
        return i7;
    }

    public long B(XmlPullParser xmlPullParser, long j7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j7;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public List C(XmlPullParser xmlPullParser, List list, boolean z7) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z7 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String s02 = s0(xmlPullParser, "BaseURL");
        if (G.c(s02)) {
            if (attributeValue3 == null) {
                attributeValue3 = s02;
            }
            return E.j(new C1751b(s02, attributeValue3, parseInt, parseInt2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < list.size(); i7++) {
            C1751b c1751b = (C1751b) list.get(i7);
            String e7 = G.e(c1751b.f18078a, s02);
            String str = attributeValue3 == null ? e7 : attributeValue3;
            if (z7) {
                parseInt = c1751b.f18080c;
                parseInt2 = c1751b.f18081d;
                str = c1751b.f18079b;
            }
            arrayList.add(new C1751b(e7, str, parseInt, parseInt2));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.UUID] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair F(org.xmlpull.v1.XmlPullParser r12) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.d.F(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public int G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public Pair O(XmlPullParser xmlPullParser, String str, String str2, long j7, long j8, ByteArrayOutputStream byteArrayOutputStream) {
        long X6 = X(xmlPullParser, "id", 0L);
        long X7 = X(xmlPullParser, "duration", -9223372036854775807L);
        long X8 = X(xmlPullParser, "presentationTime", 0L);
        long W02 = M.W0(X7, 1000L, j7);
        long W03 = M.W0(X8 - j8, 1000000L, j7);
        String r02 = r0(xmlPullParser, "messageData", null);
        byte[] P6 = P(xmlPullParser, byteArrayOutputStream);
        Long valueOf = Long.valueOf(W03);
        if (r02 != null) {
            P6 = M.r0(r02);
        }
        return Pair.create(valueOf, d(str, str2, X6, W02, P6));
    }

    public byte[] P(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, W2.e.f6821c.name());
        while (true) {
            xmlPullParser.nextToken();
            if (N.d(xmlPullParser, "Event")) {
                newSerializer.flush();
                return byteArrayOutputStream.toByteArray();
            }
            switch (xmlPullParser.getEventType()) {
                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    newSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i7 = 0; i7 < xmlPullParser.getAttributeCount(); i7++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i7), xmlPullParser.getAttributeName(i7), xmlPullParser.getAttributeValue(i7));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
        }
    }

    public f Q(XmlPullParser xmlPullParser) {
        ByteArrayOutputStream byteArrayOutputStream;
        long j7;
        ArrayList arrayList;
        String r02 = r0(xmlPullParser, "schemeIdUri", "");
        String r03 = r0(xmlPullParser, "value", "");
        long X6 = X(xmlPullParser, "timescale", 1L);
        long X7 = X(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList2 = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                long j8 = X7;
                j7 = X7;
                arrayList = arrayList2;
                arrayList.add(O(xmlPullParser, r02, r03, X6, j8, byteArrayOutputStream));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                j7 = X7;
                arrayList = arrayList2;
                w(xmlPullParser);
            }
            if (N.d(xmlPullParser, "EventStream")) {
                break;
            }
            arrayList2 = arrayList;
            byteArrayOutputStream2 = byteArrayOutputStream;
            X7 = j7;
        }
        long[] jArr = new long[arrayList.size()];
        Q0.a[] aVarArr = new Q0.a[arrayList.size()];
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            Pair pair = (Pair) arrayList.get(i7);
            jArr[i7] = ((Long) pair.first).longValue();
            aVarArr[i7] = (Q0.a) pair.second;
        }
        return e(r02, r03, X6, jArr, aVarArr);
    }

    public i T(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "sourceURL", "range");
    }

    public C1197t V(XmlPullParser xmlPullParser) {
        return new C1197t(xmlPullParser.getAttributeValue(null, "lang"), s0(xmlPullParser, "Label"));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01dc A[LOOP:0: B:18:0x00a0->B:26:0x01dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o0.C1752c Y(org.xmlpull.v1.XmlPullParser r47, android.net.Uri r48) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.d.Y(org.xmlpull.v1.XmlPullParser, android.net.Uri):o0.c");
    }

    public Pair a0(XmlPullParser xmlPullParser, List list, long j7, long j8, long j9, long j10, boolean z7) {
        long j11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj;
        long j12;
        k l02;
        d dVar = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        long M6 = M(xmlPullParser2, "start", j7);
        long j13 = -9223372036854775807L;
        long j14 = j9 != -9223372036854775807L ? j9 + M6 : -9223372036854775807L;
        long M7 = M(xmlPullParser2, "duration", -9223372036854775807L);
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        long j15 = j8;
        boolean z8 = false;
        long j16 = -9223372036854775807L;
        k kVar = null;
        e eVar = null;
        while (true) {
            xmlPullParser.next();
            if (N.f(xmlPullParser2, "BaseURL")) {
                if (!z8) {
                    j15 = dVar.B(xmlPullParser2, j15);
                    z8 = true;
                }
                arrayList6.addAll(dVar.C(xmlPullParser2, list, z7));
                arrayList3 = arrayList5;
                arrayList = arrayList6;
                j12 = j13;
                obj = obj2;
                arrayList2 = arrayList4;
            } else {
                if (N.f(xmlPullParser2, "AdaptationSet")) {
                    j11 = j15;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    arrayList2.add(y(xmlPullParser, !arrayList6.isEmpty() ? arrayList6 : list, kVar, M7, j15, j16, j14, j10, z7));
                    xmlPullParser2 = xmlPullParser;
                    arrayList3 = arrayList5;
                } else {
                    j11 = j15;
                    ArrayList arrayList7 = arrayList5;
                    arrayList = arrayList6;
                    arrayList2 = arrayList4;
                    xmlPullParser2 = xmlPullParser;
                    if (N.f(xmlPullParser2, "EventStream")) {
                        arrayList7.add(Q(xmlPullParser));
                        arrayList3 = arrayList7;
                    } else {
                        arrayList3 = arrayList7;
                        if (N.f(xmlPullParser2, "SegmentBase")) {
                            kVar = j0(xmlPullParser2, null);
                            obj = null;
                            j15 = j11;
                            j12 = -9223372036854775807L;
                        } else {
                            if (N.f(xmlPullParser2, "SegmentList")) {
                                long B7 = B(xmlPullParser2, -9223372036854775807L);
                                obj = null;
                                l02 = k0(xmlPullParser, null, j14, M7, j11, B7, j10);
                                j16 = B7;
                                j15 = j11;
                                j12 = -9223372036854775807L;
                            } else {
                                obj = null;
                                if (N.f(xmlPullParser2, "SegmentTemplate")) {
                                    long B8 = B(xmlPullParser2, -9223372036854775807L);
                                    j12 = -9223372036854775807L;
                                    l02 = l0(xmlPullParser, null, AbstractC0703v.Y(), j14, M7, j11, B8, j10);
                                    j16 = B8;
                                    j15 = j11;
                                } else {
                                    j12 = -9223372036854775807L;
                                    if (N.f(xmlPullParser2, "AssetIdentifier")) {
                                        eVar = I(xmlPullParser2, "AssetIdentifier");
                                    } else {
                                        w(xmlPullParser);
                                    }
                                    j15 = j11;
                                }
                            }
                            kVar = l02;
                        }
                    }
                }
                obj = null;
                j12 = -9223372036854775807L;
                j15 = j11;
            }
            if (N.d(xmlPullParser2, "Period")) {
                return Pair.create(h(attributeValue, M6, arrayList2, arrayList3, eVar), Long.valueOf(M7));
            }
            arrayList4 = arrayList2;
            arrayList6 = arrayList;
            obj2 = obj;
            arrayList5 = arrayList3;
            j13 = j12;
            dVar = this;
        }
    }

    public final long b(List list, long j7, long j8, int i7, long j9) {
        int l7 = i7 >= 0 ? i7 + 1 : (int) M.l(j9 - j7, j8);
        for (int i8 = 0; i8 < l7; i8++) {
            list.add(m(j7, j8));
            j7 += j8;
        }
        return j7;
    }

    public String[] b0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    public C1750a c(long j7, int i7, List list, List list2, List list3, List list4) {
        return new C1750a(j7, i7, list, list2, list3, list4);
    }

    public h c0(XmlPullParser xmlPullParser) {
        String str = null;
        String r02 = r0(xmlPullParser, "moreInformationURL", null);
        String r03 = r0(xmlPullParser, "lang", null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (N.f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (N.f(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                w(xmlPullParser);
            }
            String str4 = str3;
            if (N.d(xmlPullParser, "ProgramInformation")) {
                return new h(str, str2, str4, r02, r03);
            }
            str3 = str4;
        }
    }

    public Q0.a d(String str, String str2, long j7, long j8, byte[] bArr) {
        return new Q0.a(str, str2, j8, j7, bArr);
    }

    public i d0(XmlPullParser xmlPullParser, String str, String str2) {
        long j7;
        long j8;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j7 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j8 = (Long.parseLong(split[1]) - j7) + 1;
                return i(attributeValue, j7, j8);
            }
        } else {
            j7 = 0;
        }
        j8 = -1;
        return i(attributeValue, j7, j8);
    }

    public f e(String str, String str2, long j7, long[] jArr, Q0.a[] aVarArr) {
        return new f(str, str2, j7, jArr, aVarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01ee A[LOOP:0: B:2:0x006a->B:11:0x01ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0198 A[EDGE_INSN: B:12:0x0198->B:13:0x0198 BREAK  A[LOOP:0: B:2:0x006a->B:11:0x01ee], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o0.d.a e0(org.xmlpull.v1.XmlPullParser r36, java.util.List r37, java.lang.String r38, java.lang.String r39, int r40, int r41, float r42, int r43, int r44, java.lang.String r45, java.util.List r46, java.util.List r47, java.util.List r48, java.util.List r49, o0.k r50, long r51, long r53, long r55, long r57, long r59, boolean r61) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.d.e0(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, o0.k, long, long, long, long, long, boolean):o0.d$a");
    }

    public C1194q f(String str, String str2, int i7, int i8, float f7, int i9, int i10, int i11, String str3, List list, List list2, String str4, List list3, List list4) {
        String str5 = str4;
        String u7 = u(str2, str5);
        if ("audio/eac3".equals(u7)) {
            u7 = N(list4);
            if ("audio/eac3-joc".equals(u7)) {
                str5 = "ec+3";
            }
        }
        int p02 = p0(list);
        int i02 = i0(list) | f0(list2) | h0(list3) | h0(list4);
        Pair t02 = t0(list3);
        C1194q.b e02 = new C1194q.b().a0(str).Q(str2).o0(u7).O(str5).j0(i11).q0(p02).m0(i02).e0(str3);
        int i12 = -1;
        C1194q.b u02 = e02.t0(t02 != null ? ((Integer) t02.first).intValue() : -1).u0(t02 != null ? ((Integer) t02.second).intValue() : -1);
        if (AbstractC1203z.s(u7)) {
            u02.v0(i7).Y(i8).X(f7);
        } else if (AbstractC1203z.o(u7)) {
            u02.N(i9).p0(i10);
        } else if (AbstractC1203z.r(u7)) {
            if ("application/cea-608".equals(u7)) {
                i12 = D(list2);
            } else if ("application/cea-708".equals(u7)) {
                i12 = E(list2);
            }
            u02.L(i12);
        } else if (AbstractC1203z.p(u7)) {
            u02.v0(i7).Y(i8);
        }
        return u02.K();
    }

    public int f0(List list) {
        int u02;
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            e eVar = (e) list.get(i8);
            if (W2.c.a("urn:mpeg:dash:role:2011", eVar.f18109a)) {
                u02 = g0(eVar.f18110b);
            } else if (W2.c.a("urn:tva:metadata:cs:AudioPurposeCS:2007", eVar.f18109a)) {
                u02 = u0(eVar.f18110b);
            }
            i7 |= u02;
        }
        return i7;
    }

    public C1752c g(long j7, long j8, long j9, boolean z7, long j10, long j11, long j12, long j13, h hVar, o oVar, l lVar, Uri uri, List list) {
        return new C1752c(j7, j8, j9, z7, j10, j11, j12, j13, hVar, oVar, lVar, uri, list);
    }

    public int g0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public g h(String str, long j7, List list, List list2, e eVar) {
        return new g(str, j7, list, list2, eVar);
    }

    public int h0(List list) {
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            if (W2.c.a("http://dashif.org/guidelines/trickmode", ((e) list.get(i8)).f18109a)) {
                i7 = 16384;
            }
        }
        return i7;
    }

    public i i(String str, long j7, long j8) {
        return new i(str, j7, j8);
    }

    public int i0(List list) {
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            e eVar = (e) list.get(i8);
            if (W2.c.a("urn:mpeg:dash:role:2011", eVar.f18109a)) {
                i7 |= g0(eVar.f18110b);
            }
        }
        return i7;
    }

    public j j(a aVar, String str, List list, String str2, ArrayList arrayList, ArrayList arrayList2) {
        C1194q.b a7 = aVar.f18100a.a();
        if (str == null || !list.isEmpty()) {
            a7.d0(list);
        } else {
            a7.c0(str);
        }
        String str3 = aVar.f18103d;
        if (str3 == null) {
            str3 = str2;
        }
        ArrayList arrayList3 = aVar.f18104e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            s(arrayList3);
            a7.U(new C1190m(str3, arrayList3));
        }
        ArrayList arrayList4 = aVar.f18105f;
        arrayList4.addAll(arrayList2);
        return j.o(aVar.f18106g, a7.K(), aVar.f18101b, aVar.f18102c, arrayList4, aVar.f18107h, aVar.f18108i, null);
    }

    public k.e j0(XmlPullParser xmlPullParser, k.e eVar) {
        long j7;
        long j8;
        long X6 = X(xmlPullParser, "timescale", eVar != null ? eVar.f18146b : 1L);
        long X7 = X(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f18147c : 0L);
        long j9 = eVar != null ? eVar.f18160d : 0L;
        long j10 = eVar != null ? eVar.f18161e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j8 = Long.parseLong(split[0]);
            j7 = (Long.parseLong(split[1]) - j8) + 1;
        } else {
            j7 = j10;
            j8 = j9;
        }
        i iVar = eVar != null ? eVar.f18145a : null;
        do {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "Initialization")) {
                iVar = T(xmlPullParser);
            } else {
                w(xmlPullParser);
            }
        } while (!N.d(xmlPullParser, "SegmentBase"));
        return n(iVar, X6, X7, j8, j7);
    }

    public k.b k(i iVar, long j7, long j8, long j9, long j10, List list, long j11, List list2, long j12, long j13) {
        return new k.b(iVar, j7, j8, j9, j10, list, j11, list2, M.J0(j12), M.J0(j13));
    }

    public k.b k0(XmlPullParser xmlPullParser, k.b bVar, long j7, long j8, long j9, long j10, long j11) {
        long X6 = X(xmlPullParser, "timescale", bVar != null ? bVar.f18146b : 1L);
        long X7 = X(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f18147c : 0L);
        long X8 = X(xmlPullParser, "duration", bVar != null ? bVar.f18149e : -9223372036854775807L);
        long X9 = X(xmlPullParser, "startNumber", bVar != null ? bVar.f18148d : 1L);
        long t7 = t(j9, j10);
        List list = null;
        List list2 = null;
        i iVar = null;
        do {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "Initialization")) {
                iVar = T(xmlPullParser);
            } else if (N.f(xmlPullParser, "SegmentTimeline")) {
                list = m0(xmlPullParser, X6, j8);
            } else if (N.f(xmlPullParser, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(n0(xmlPullParser));
            } else {
                w(xmlPullParser);
            }
        } while (!N.d(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (iVar == null) {
                iVar = bVar.f18145a;
            }
            if (list == null) {
                list = bVar.f18150f;
            }
            if (list2 == null) {
                list2 = bVar.f18154j;
            }
        }
        return k(iVar, X6, X7, X9, X8, list, t7, list2, j11, j7);
    }

    public k.c l(i iVar, long j7, long j8, long j9, long j10, long j11, List list, long j12, n nVar, n nVar2, long j13, long j14) {
        return new k.c(iVar, j7, j8, j9, j10, j11, list, j12, nVar, nVar2, M.J0(j13), M.J0(j14));
    }

    public k.c l0(XmlPullParser xmlPullParser, k.c cVar, List list, long j7, long j8, long j9, long j10, long j11) {
        long X6 = X(xmlPullParser, "timescale", cVar != null ? cVar.f18146b : 1L);
        long X7 = X(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f18147c : 0L);
        long X8 = X(xmlPullParser, "duration", cVar != null ? cVar.f18149e : -9223372036854775807L);
        long X9 = X(xmlPullParser, "startNumber", cVar != null ? cVar.f18148d : 1L);
        long W6 = W(list);
        long t7 = t(j9, j10);
        List list2 = null;
        n v02 = v0(xmlPullParser, "media", cVar != null ? cVar.f18156k : null);
        n v03 = v0(xmlPullParser, "initialization", cVar != null ? cVar.f18155j : null);
        i iVar = null;
        do {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "Initialization")) {
                iVar = T(xmlPullParser);
            } else if (N.f(xmlPullParser, "SegmentTimeline")) {
                list2 = m0(xmlPullParser, X6, j8);
            } else {
                w(xmlPullParser);
            }
        } while (!N.d(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (iVar == null) {
                iVar = cVar.f18145a;
            }
            if (list2 == null) {
                list2 = cVar.f18150f;
            }
        }
        return l(iVar, X6, X7, X9, W6, X8, list2, t7, v03, v02, j11, j7);
    }

    public k.d m(long j7, long j8) {
        return new k.d(j7, j8);
    }

    public List m0(XmlPullParser xmlPullParser, long j7, long j8) {
        ArrayList arrayList = new ArrayList();
        long j9 = 0;
        long j10 = -9223372036854775807L;
        boolean z7 = false;
        int i7 = 0;
        do {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "S")) {
                long X6 = X(xmlPullParser, "t", -9223372036854775807L);
                if (z7) {
                    j9 = b(arrayList, j9, j10, i7, X6);
                }
                if (X6 == -9223372036854775807L) {
                    X6 = j9;
                }
                j10 = X(xmlPullParser, "d", -9223372036854775807L);
                i7 = U(xmlPullParser, "r", 0);
                z7 = true;
                j9 = X6;
            } else {
                w(xmlPullParser);
            }
        } while (!N.d(xmlPullParser, "SegmentTimeline"));
        if (z7) {
            b(arrayList, j9, j10, i7, M.W0(j8, j7, 1000L));
        }
        return arrayList;
    }

    public k.e n(i iVar, long j7, long j8, long j9, long j10) {
        return new k.e(iVar, j7, j8, j9, j10);
    }

    public i n0(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "media", "mediaRange");
    }

    public o o(String str, String str2) {
        return new o(str, str2);
    }

    public int o0(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    public int p0(List list) {
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            e eVar = (e) list.get(i8);
            if (W2.c.a("urn:mpeg:dash:role:2011", eVar.f18109a)) {
                i7 |= o0(eVar.f18110b);
            }
        }
        return i7;
    }

    public l q0(XmlPullParser xmlPullParser) {
        long j7 = -9223372036854775807L;
        long j8 = -9223372036854775807L;
        long j9 = -9223372036854775807L;
        float f7 = -3.4028235E38f;
        float f8 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (N.f(xmlPullParser, "Latency")) {
                j7 = X(xmlPullParser, "target", -9223372036854775807L);
                j8 = X(xmlPullParser, "min", -9223372036854775807L);
                j9 = X(xmlPullParser, "max", -9223372036854775807L);
            } else if (N.f(xmlPullParser, "PlaybackRate")) {
                f7 = R(xmlPullParser, "min", -3.4028235E38f);
                f8 = R(xmlPullParser, "max", -3.4028235E38f);
            }
            long j10 = j7;
            long j11 = j8;
            long j12 = j9;
            float f9 = f7;
            float f10 = f8;
            if (N.d(xmlPullParser, "ServiceDescription")) {
                return new l(j10, j11, j12, f9, f10);
            }
            j7 = j10;
            j8 = j11;
            j9 = j12;
            f7 = f9;
            f8 = f10;
        }
    }

    public Pair t0(List list) {
        String str;
        for (int i7 = 0; i7 < list.size(); i7++) {
            e eVar = (e) list.get(i7);
            if ((W2.c.a("http://dashif.org/thumbnail_tile", eVar.f18109a) || W2.c.a("http://dashif.org/guidelines/thumbnail_tile", eVar.f18109a)) && (str = eVar.f18110b) != null) {
                String[] b12 = M.b1(str, "x");
                if (b12.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(b12[0])), Integer.valueOf(Integer.parseInt(b12[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public int u0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public final boolean v(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public n v0(XmlPullParser xmlPullParser, String str, n nVar) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? n.b(attributeValue) : nVar;
    }

    public o w0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    @Override // B0.p.a
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public C1752c a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f18099a.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return Y(newPullParser, uri);
            }
            throw C1162A.c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e7) {
            throw C1162A.c(null, e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0352 A[LOOP:0: B:2:0x007f->B:10:0x0352, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0310 A[EDGE_INSN: B:11:0x0310->B:12:0x0310 BREAK  A[LOOP:0: B:2:0x007f->B:10:0x0352], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o0.C1750a y(org.xmlpull.v1.XmlPullParser r57, java.util.List r58, o0.k r59, long r60, long r62, long r64, long r66, long r68, boolean r70) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.d.y(org.xmlpull.v1.XmlPullParser, java.util.List, o0.k, long, long, long, long, long, boolean):o0.a");
    }

    public void z(XmlPullParser xmlPullParser) {
        w(xmlPullParser);
    }
}
