package d5;

import a4.d;
import android.net.Uri;
import android.text.TextUtils;
import d5.k;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o7.c0;
import o7.t;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p2.m0;
import t5.f0;
import v3.a1;
import v3.i0;
import v5.d0;
import v5.e0;

/* loaded from: classes.dex */
public final class d extends DefaultHandler implements f0.a<c> {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f3463b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f3464c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f3465d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f3466e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f3467a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final i0 f3468a;

        /* renamed from: b, reason: collision with root package name */
        public final t<b> f3469b;

        /* renamed from: c, reason: collision with root package name */
        public final k f3470c;

        /* renamed from: d, reason: collision with root package name */
        public final String f3471d;

        /* renamed from: e, reason: collision with root package name */
        public final ArrayList<d.b> f3472e;
        public final ArrayList<e> f;

        /* renamed from: g, reason: collision with root package name */
        public final long f3473g = -1;

        /* renamed from: h, reason: collision with root package name */
        public final List<e> f3474h;

        /* renamed from: i, reason: collision with root package name */
        public final List<e> f3475i;

        public a(i0 i0Var, List list, k kVar, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f3468a = i0Var;
            this.f3469b = t.p(list);
            this.f3470c = kVar;
            this.f3471d = str;
            this.f3472e = arrayList;
            this.f = arrayList2;
            this.f3474h = arrayList3;
            this.f3475i = arrayList4;
        }
    }

    public d() {
        try {
            this.f3467a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static long b(ArrayList arrayList, long j10, long j11, int i10, long j12) {
        int i11;
        if (i10 >= 0) {
            i11 = i10 + 1;
        } else {
            int i12 = e0.f15881a;
            i11 = (int) ((((j12 - j10) + j11) - 1) / j11);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            arrayList.add(new k.d(j10, j11));
            j10 += j11;
        }
        return j10;
    }

    public static void c(XmlPullParser xmlPullParser) {
        if (m0.U(xmlPullParser)) {
            int i10 = 1;
            while (i10 != 0) {
                xmlPullParser.next();
                if (m0.U(xmlPullParser)) {
                    i10++;
                } else {
                    if (xmlPullParser.getEventType() == 3) {
                        i10--;
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
    
        if (r0 == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0086, code lost:
    
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
    
        if (r0.equals("4000") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f3, code lost:
    
        if (r0 < 33) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(org.xmlpull.v1.XmlPullParser r9) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.d.d(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long e(XmlPullParser xmlPullParser, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j10;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList f(XmlPullParser xmlPullParser, List list, boolean z10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z10 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String str = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str = xmlPullParser.getText();
            } else {
                c(xmlPullParser);
            }
        } while (!m0.T(xmlPullParser, "BaseURL"));
        if ((str == null || d0.a(str)[0] == -1) ? false : true) {
            if (attributeValue3 == null) {
                attributeValue3 = str;
            }
            return c0.c(new b(str, attributeValue3, parseInt, parseInt2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            b bVar = (b) list.get(i10);
            String c10 = d0.c(bVar.f3447a, str);
            String str2 = attributeValue3 == null ? c10 : attributeValue3;
            if (z10) {
                parseInt = bVar.f3449c;
                parseInt2 = bVar.f3450d;
                str2 = bVar.f3448b;
            }
            arrayList.add(new b(c10, str2, parseInt, parseInt2));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair g(org.xmlpull.v1.XmlPullParser r13) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.d.g(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int h(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (!TextUtils.isEmpty(attributeValue)) {
            if ("audio".equals(attributeValue)) {
                return 1;
            }
            if ("video".equals(attributeValue)) {
                return 2;
            }
            if ("text".equals(attributeValue)) {
                return 3;
            }
            if ("image".equals(attributeValue)) {
                return 4;
            }
        }
        return -1;
    }

    public static e i(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!m0.T(xmlPullParser, str));
        return new e(attributeValue, attributeValue2, str2);
    }

    public static long j(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j10;
        }
        Matcher matcher = e0.f15887h.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return isEmpty ? -parseDouble6 : parseDouble6;
    }

    public static float k(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = f3463b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        float f10 = parseInt;
        return !TextUtils.isEmpty(matcher.group(2)) ? f10 / Integer.parseInt(r2) : f10;
    }

    public static int l(XmlPullParser xmlPullParser, String str, int i10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i10 : Integer.parseInt(attributeValue);
    }

    public static long m(XmlPullParser xmlPullParser, String str, long j10) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j10 : Long.parseLong(attributeValue);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0883, code lost:
    
        if ("audio/eac3-joc".equals(r0) != false) goto L280;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0e87 A[LOOP:5: B:153:0x03a2->B:161:0x0e87, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0d06 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0df1 A[LOOP:9: B:194:0x0dbf->B:208:0x0df1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0ded A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0b6a A[LOOP:11: B:313:0x05c9->B:322:0x0b6a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x07e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0836  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x08c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x122b A[LOOP:1: B:34:0x00cd->B:42:0x122b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x11f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0b1c  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0b2e  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0b4e  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0b31  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0b1f  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0886  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static d5.c n(org.xmlpull.v1.XmlPullParser r135, android.net.Uri r136) {
        /*
            Method dump skipped, instructions count: 4704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.d.n(org.xmlpull.v1.XmlPullParser, android.net.Uri):d5.c");
    }

    public static i o(XmlPullParser xmlPullParser, String str, String str2) {
        long j10;
        long j11;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j10 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j11 = (Long.parseLong(split[1]) - j10) + 1;
                return new i(j10, j11, attributeValue);
            }
        } else {
            j10 = 0;
        }
        j11 = -1;
        return new i(j10, j11, attributeValue);
    }

    public static int p(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public static int q(ArrayList arrayList) {
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (x6.b.R("http://dashif.org/guidelines/trickmode", ((e) arrayList.get(i11)).f3476a)) {
                i10 |= 16384;
            }
        }
        return i10;
    }

    public static k.e r(XmlPullParser xmlPullParser, k.e eVar) {
        long j10;
        long j11;
        long m10 = m(xmlPullParser, "timescale", eVar != null ? eVar.f3507b : 1L);
        long m11 = m(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.f3508c : 0L);
        long j12 = eVar != null ? eVar.f3520d : 0L;
        long j13 = eVar != null ? eVar.f3521e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j10 = (Long.parseLong(split[1]) - parseLong) + 1;
            j11 = parseLong;
        } else {
            j10 = j13;
            j11 = j12;
        }
        i iVar = eVar != null ? eVar.f3506a : null;
        do {
            xmlPullParser.next();
            if (m0.V(xmlPullParser, "Initialization")) {
                iVar = o(xmlPullParser, "sourceURL", "range");
            } else {
                c(xmlPullParser);
            }
        } while (!m0.T(xmlPullParser, "SegmentBase"));
        return new k.e(iVar, m10, m11, j11, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k.b s(XmlPullParser xmlPullParser, k.b bVar, long j10, long j11, long j12, long j13, long j14) {
        List list;
        long m10 = m(xmlPullParser, "timescale", bVar != null ? bVar.f3507b : 1L);
        long m11 = m(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.f3508c : 0L);
        long m12 = m(xmlPullParser, "duration", bVar != null ? bVar.f3510e : -9223372036854775807L);
        long m13 = m(xmlPullParser, "startNumber", bVar != null ? bVar.f3509d : 1L);
        long j15 = j13 == -9223372036854775807L ? j12 : j13;
        long j16 = j15 == Long.MAX_VALUE ? -9223372036854775807L : j15;
        List list2 = null;
        i iVar = null;
        List list3 = null;
        do {
            xmlPullParser.next();
            if (m0.V(xmlPullParser, "Initialization")) {
                iVar = o(xmlPullParser, "sourceURL", "range");
            } else if (m0.V(xmlPullParser, "SegmentTimeline")) {
                list3 = u(xmlPullParser, m10, j11);
            } else if (m0.V(xmlPullParser, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(o(xmlPullParser, "media", "mediaRange"));
            } else {
                c(xmlPullParser);
            }
        } while (!m0.T(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (iVar == null) {
                iVar = bVar.f3506a;
            }
            if (list3 == null) {
                list3 = bVar.f;
            }
            if (list2 == null) {
                list = bVar.f3514j;
                return new k.b(iVar, m10, m11, m13, m12, list3, j16, list, e0.I(j14), e0.I(j10));
            }
        }
        list = list2;
        return new k.b(iVar, m10, m11, m13, m12, list3, j16, list, e0.I(j14), e0.I(j10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k.c t(XmlPullParser xmlPullParser, k.c cVar, List list, long j10, long j11, long j12, long j13, long j14) {
        long j15;
        i iVar;
        List list2;
        long m10 = m(xmlPullParser, "timescale", cVar != null ? cVar.f3507b : 1L);
        long m11 = m(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.f3508c : 0L);
        long m12 = m(xmlPullParser, "duration", cVar != null ? cVar.f3510e : -9223372036854775807L);
        long m13 = m(xmlPullParser, "startNumber", cVar != null ? cVar.f3509d : 1L);
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                j15 = -1;
                break;
            }
            e eVar = (e) list.get(i10);
            if (x6.b.R("http://dashif.org/guidelines/last-segment-number", eVar.f3476a)) {
                j15 = Long.parseLong(eVar.f3477b);
                break;
            }
            i10++;
        }
        long j16 = j15;
        long j17 = j13 == -9223372036854775807L ? j12 : j13;
        long j18 = j17 == Long.MAX_VALUE ? -9223372036854775807L : j17;
        i iVar2 = null;
        m v10 = v(xmlPullParser, "media", cVar != null ? cVar.f3516k : null);
        m v11 = v(xmlPullParser, "initialization", cVar != null ? cVar.f3515j : null);
        List list3 = null;
        do {
            xmlPullParser.next();
            if (m0.V(xmlPullParser, "Initialization")) {
                iVar2 = o(xmlPullParser, "sourceURL", "range");
            } else if (m0.V(xmlPullParser, "SegmentTimeline")) {
                list3 = u(xmlPullParser, m10, j11);
            } else {
                c(xmlPullParser);
            }
        } while (!m0.T(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (iVar2 == null) {
                iVar2 = cVar.f3506a;
            }
            if (list3 == null) {
                list2 = cVar.f;
                iVar = iVar2;
                return new k.c(iVar, m10, m11, m13, j16, m12, list2, j18, v11, v10, e0.I(j14), e0.I(j10));
            }
        }
        iVar = iVar2;
        list2 = list3;
        return new k.c(iVar, m10, m11, m13, j16, m12, list2, j18, v11, v10, e0.I(j14), e0.I(j10));
    }

    public static ArrayList u(XmlPullParser xmlPullParser, long j10, long j11) {
        ArrayList arrayList = new ArrayList();
        long j12 = 0;
        boolean z10 = false;
        int i10 = 0;
        long j13 = -9223372036854775807L;
        do {
            xmlPullParser.next();
            if (m0.V(xmlPullParser, "S")) {
                long m10 = m(xmlPullParser, "t", -9223372036854775807L);
                if (z10) {
                    j12 = b(arrayList, j12, j13, i10, m10);
                }
                if (m10 == -9223372036854775807L) {
                    m10 = j12;
                }
                long m11 = m(xmlPullParser, "d", -9223372036854775807L);
                i10 = l(xmlPullParser, "r", 0);
                z10 = true;
                j13 = m11;
                j12 = m10;
            } else {
                c(xmlPullParser);
            }
        } while (!m0.T(xmlPullParser, "SegmentTimeline"));
        if (z10) {
            b(arrayList, j12, j13, i10, e0.O(j11, j10, 1000L));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x00c6. Please report as an issue. */
    public static m v(XmlPullParser xmlPullParser, String str, m mVar) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return mVar;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int i10 = 0;
        int i11 = 0;
        while (i10 < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i10);
            if (indexOf == -1) {
                strArr[i11] = strArr[i11] + attributeValue.substring(i10);
                i10 = attributeValue.length();
            } else if (indexOf != i10) {
                strArr[i11] = strArr[i11] + attributeValue.substring(i10, indexOf);
                i10 = indexOf;
            } else if (attributeValue.startsWith("$$", i10)) {
                strArr[i11] = defpackage.g.f(new StringBuilder(), strArr[i11], "$");
                i10 += 2;
            } else {
                int i12 = i10 + 1;
                int indexOf2 = attributeValue.indexOf("$", i12);
                String substring = attributeValue.substring(i12, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i11] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x") && !str2.endsWith("X")) {
                            str2 = defpackage.g.d(str2, "d");
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    substring.getClass();
                    substring.hashCode();
                    switch (substring) {
                        case "Number":
                            iArr[i11] = 2;
                            break;
                        case "Time":
                            iArr[i11] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i11] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException(defpackage.g.d("Invalid template: ", attributeValue));
                    }
                    strArr2[i11] = str2;
                }
                i11++;
                strArr[i11] = "";
                i10 = indexOf2 + 1;
            }
        }
        return new m(strArr, iArr, strArr2, i11);
    }

    @Override // t5.f0.a
    public final Object a(Uri uri, t5.m mVar) {
        try {
            XmlPullParser newPullParser = this.f3467a.newPullParser();
            newPullParser.setInput(mVar, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return n(newPullParser, uri);
            }
            throw a1.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e10) {
            throw a1.b(null, e10);
        }
    }
}
