package g5;

import a4.d;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import b.a0;
import defpackage.g;
import g5.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.UUID;
import k4.h;
import k4.k;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import t5.f0;
import t5.m;
import v3.a1;
import v3.i0;
import v5.e0;

/* loaded from: classes.dex */
public final class b implements f0.a<g5.a> {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f5869a;

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f5870a;

        /* renamed from: b, reason: collision with root package name */
        public final String f5871b;

        /* renamed from: c, reason: collision with root package name */
        public final a f5872c;

        /* renamed from: d, reason: collision with root package name */
        public final LinkedList f5873d = new LinkedList();

        public a(a aVar, String str, String str2) {
            this.f5872c = aVar;
            this.f5870a = str;
            this.f5871b = str2;
        }

        public static int g(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return -1;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw a1.b(null, e10);
            }
        }

        public static long h(XmlPullParser xmlPullParser, String str, long j10) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j10;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e10) {
                throw a1.b(null, e10);
            }
        }

        public static int i(XmlPullParser xmlPullParser, String str) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new C0095b(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e10) {
                throw a1.b(null, e10);
            }
        }

        public void a(Object obj) {
        }

        public abstract Object b();

        public final Object c(String str) {
            for (int i10 = 0; i10 < this.f5873d.size(); i10++) {
                Pair pair = (Pair) this.f5873d.get(i10);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            a aVar = this.f5872c;
            if (aVar == null) {
                return null;
            }
            return aVar.c(str);
        }

        public boolean d(String str) {
            return false;
        }

        public final Object e(XmlPullParser xmlPullParser) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                a aVar = null;
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f5871b.equals(name)) {
                        j(xmlPullParser);
                        z10 = true;
                    } else if (z10) {
                        if (i10 > 0) {
                            i10++;
                        } else if (d(name)) {
                            j(xmlPullParser);
                        } else {
                            String str = this.f5870a;
                            if ("QualityLevel".equals(name)) {
                                aVar = new d(this, str);
                            } else if ("Protection".equals(name)) {
                                aVar = new c(this, str);
                            } else if ("StreamIndex".equals(name)) {
                                aVar = new f(this, str);
                            }
                            if (aVar == null) {
                                i10 = 1;
                            } else {
                                a(aVar.e(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z10 && i10 == 0) {
                        k(xmlPullParser);
                    }
                } else if (!z10) {
                    continue;
                } else if (i10 > 0) {
                    i10--;
                } else {
                    String name2 = xmlPullParser.getName();
                    f(xmlPullParser);
                    if (!d(name2)) {
                        return b();
                    }
                }
                xmlPullParser.next();
            }
        }

        public void f(XmlPullParser xmlPullParser) {
        }

        public abstract void j(XmlPullParser xmlPullParser);

        public void k(XmlPullParser xmlPullParser) {
        }

        public final void l(Object obj, String str) {
            this.f5873d.add(Pair.create(str, obj));
        }
    }

    /* renamed from: g5.b$b, reason: collision with other inner class name */
    public static class C0095b extends a1 {
        public C0095b(String str) {
            super(g.d("Missing required field: ", str), null, true, 4);
        }
    }

    public static class c extends a {

        /* renamed from: e, reason: collision with root package name */
        public boolean f5874e;
        public UUID f;

        /* renamed from: g, reason: collision with root package name */
        public byte[] f5875g;

        public c(a aVar, String str) {
            super(aVar, str, "Protection");
        }

        @Override // g5.b.a
        public final Object b() {
            UUID uuid = this.f;
            byte[] a10 = h.a(uuid, null, this.f5875g);
            byte[] bArr = this.f5875g;
            k[] kVarArr = new k[1];
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                sb2.append((char) bArr[i10]);
            }
            String sb3 = sb2.toString();
            byte[] decode = Base64.decode(sb3.substring(sb3.indexOf("<KID>") + 5, sb3.indexOf("</KID>")), 0);
            byte b10 = decode[0];
            decode[0] = decode[3];
            decode[3] = b10;
            byte b11 = decode[1];
            decode[1] = decode[2];
            decode[2] = b11;
            byte b12 = decode[4];
            decode[4] = decode[5];
            decode[5] = b12;
            byte b13 = decode[6];
            decode[6] = decode[7];
            decode[7] = b13;
            kVarArr[0] = new k(true, null, 8, decode, 0, 0, null);
            return new a.C0094a(uuid, a10, kVarArr);
        }

        @Override // g5.b.a
        public final boolean d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // g5.b.a
        public final void f(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f5874e = false;
            }
        }

        @Override // g5.b.a
        public final void j(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f5874e = true;
                String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
                if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                    attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
                }
                this.f = UUID.fromString(attributeValue);
            }
        }

        @Override // g5.b.a
        public final void k(XmlPullParser xmlPullParser) {
            if (this.f5874e) {
                this.f5875g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    public static class d extends a {

        /* renamed from: e, reason: collision with root package name */
        public i0 f5876e;

        public d(a aVar, String str) {
            super(aVar, str, "QualityLevel");
        }

        public static ArrayList m(String str) {
            boolean z10;
            byte[][] bArr;
            boolean z11;
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                int i10 = e0.f15881a;
                int length = str.length() / 2;
                byte[] bArr2 = new byte[length];
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = i11 * 2;
                    bArr2[i11] = (byte) (Character.digit(str.charAt(i12 + 1), 16) + (Character.digit(str.charAt(i12), 16) << 4));
                }
                if (length + 0 > 4) {
                    int i13 = 0;
                    while (true) {
                        byte[] bArr3 = a0.f1569f0;
                        if (i13 >= 4) {
                            z10 = true;
                            break;
                        }
                        if (bArr2[0 + i13] != bArr3[i13]) {
                            break;
                        }
                        i13++;
                    }
                }
                z10 = false;
                if (z10) {
                    ArrayList arrayList2 = new ArrayList();
                    int i14 = 0;
                    do {
                        arrayList2.add(Integer.valueOf(i14));
                        i14 += 4;
                        int i15 = length - 4;
                        while (true) {
                            if (i14 > i15) {
                                i14 = -1;
                                break;
                            }
                            if (length - i14 > 4) {
                                int i16 = 0;
                                while (true) {
                                    byte[] bArr4 = a0.f1569f0;
                                    if (i16 >= 4) {
                                        z11 = true;
                                        break;
                                    }
                                    if (bArr2[i14 + i16] != bArr4[i16]) {
                                        break;
                                    }
                                    i16++;
                                }
                            }
                            z11 = false;
                            if (z11) {
                                break;
                            }
                            i14++;
                        }
                    } while (i14 != -1);
                    byte[][] bArr5 = new byte[arrayList2.size()][];
                    int i17 = 0;
                    while (i17 < arrayList2.size()) {
                        int intValue = ((Integer) arrayList2.get(i17)).intValue();
                        int intValue2 = (i17 < arrayList2.size() + (-1) ? ((Integer) arrayList2.get(i17 + 1)).intValue() : length) - intValue;
                        byte[] bArr6 = new byte[intValue2];
                        System.arraycopy(bArr2, intValue, bArr6, 0, intValue2);
                        bArr5[i17] = bArr6;
                        i17++;
                    }
                    bArr = bArr5;
                } else {
                    bArr = null;
                }
                if (bArr == null) {
                    arrayList.add(bArr2);
                } else {
                    Collections.addAll(arrayList, bArr);
                }
            }
            return arrayList;
        }

        @Override // g5.b.a
        public final Object b() {
            return this.f5876e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v9, types: [java.util.List] */
        @Override // g5.b.a
        public final void j(XmlPullParser xmlPullParser) {
            i0.a aVar = new i0.a();
            String attributeValue = xmlPullParser.getAttributeValue(null, "FourCC");
            if (attributeValue == null) {
                throw new C0095b("FourCC");
            }
            String str = (attributeValue.equalsIgnoreCase("H264") || attributeValue.equalsIgnoreCase("X264") || attributeValue.equalsIgnoreCase("AVC1") || attributeValue.equalsIgnoreCase("DAVC")) ? "video/avc" : (attributeValue.equalsIgnoreCase("AAC") || attributeValue.equalsIgnoreCase("AACL") || attributeValue.equalsIgnoreCase("AACH") || attributeValue.equalsIgnoreCase("AACP")) ? "audio/mp4a-latm" : (attributeValue.equalsIgnoreCase("TTML") || attributeValue.equalsIgnoreCase("DFXP")) ? "application/ttml+xml" : (attributeValue.equalsIgnoreCase("ac-3") || attributeValue.equalsIgnoreCase("dac3")) ? "audio/ac3" : (attributeValue.equalsIgnoreCase("ec-3") || attributeValue.equalsIgnoreCase("dec3")) ? "audio/eac3" : attributeValue.equalsIgnoreCase("dtsc") ? "audio/vnd.dts" : (attributeValue.equalsIgnoreCase("dtsh") || attributeValue.equalsIgnoreCase("dtsl")) ? "audio/vnd.dts.hd" : attributeValue.equalsIgnoreCase("dtse") ? "audio/vnd.dts.hd;profile=lbr" : attributeValue.equalsIgnoreCase("opus") ? "audio/opus" : null;
            int intValue = ((Integer) c("Type")).intValue();
            if (intValue == 2) {
                ArrayList m10 = m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                aVar.f15471j = "video/mp4";
                aVar.f15477p = a.i(xmlPullParser, "MaxWidth");
                aVar.f15478q = a.i(xmlPullParser, "MaxHeight");
                aVar.f15474m = m10;
            } else {
                int i10 = 0;
                if (intValue == 1) {
                    if (str == null) {
                        str = "audio/mp4a-latm";
                    }
                    int i11 = a.i(xmlPullParser, "Channels");
                    int i12 = a.i(xmlPullParser, "SamplingRate");
                    ArrayList m11 = m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                    boolean isEmpty = m11.isEmpty();
                    ArrayList arrayList = m11;
                    if (isEmpty) {
                        arrayList = m11;
                        if ("audio/mp4a-latm".equals(str)) {
                            int i13 = -1;
                            int i14 = 0;
                            while (true) {
                                int[] iArr = x3.a.f16888a;
                                if (i14 >= 13) {
                                    break;
                                }
                                if (i12 == iArr[i14]) {
                                    i13 = i14;
                                }
                                i14++;
                            }
                            int i15 = -1;
                            while (true) {
                                int[] iArr2 = x3.a.f16889b;
                                if (i10 >= 16) {
                                    break;
                                }
                                if (i11 == iArr2[i10]) {
                                    i15 = i10;
                                }
                                i10++;
                            }
                            if (i12 == -1 || i15 == -1) {
                                throw new IllegalArgumentException(defpackage.f.i("Invalid sample rate or number of channels: ", i12, ", ", i11));
                            }
                            arrayList = Collections.singletonList(x3.a.a(2, i13, i15));
                        }
                    }
                    aVar.f15471j = "audio/mp4";
                    aVar.f15484x = i11;
                    aVar.f15485y = i12;
                    aVar.f15474m = arrayList;
                } else if (intValue == 3) {
                    String str2 = (String) c("Subtype");
                    if (str2 != null) {
                        if (str2.equals("CAPT")) {
                            i10 = 64;
                        } else if (str2.equals("DESC")) {
                            i10 = 1024;
                        }
                    }
                    aVar.f15471j = "application/mp4";
                    aVar.f15467e = i10;
                } else {
                    aVar.f15471j = "application/mp4";
                }
            }
            aVar.f15463a = xmlPullParser.getAttributeValue(null, "Index");
            aVar.f15464b = (String) c("Name");
            aVar.f15472k = str;
            aVar.f = a.i(xmlPullParser, "Bitrate");
            aVar.f15465c = (String) c("Language");
            this.f5876e = new i0(aVar);
        }
    }

    public static class e extends a {

        /* renamed from: e, reason: collision with root package name */
        public final LinkedList f5877e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f5878g;

        /* renamed from: h, reason: collision with root package name */
        public long f5879h;

        /* renamed from: i, reason: collision with root package name */
        public long f5880i;

        /* renamed from: j, reason: collision with root package name */
        public long f5881j;

        /* renamed from: k, reason: collision with root package name */
        public int f5882k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f5883l;

        /* renamed from: m, reason: collision with root package name */
        public a.C0094a f5884m;

        public e(String str) {
            super(null, str, "SmoothStreamingMedia");
            this.f5882k = -1;
            this.f5884m = null;
            this.f5877e = new LinkedList();
        }

        @Override // g5.b.a
        public final void a(Object obj) {
            if (obj instanceof a.b) {
                this.f5877e.add((a.b) obj);
            } else if (obj instanceof a.C0094a) {
                x6.b.H(this.f5884m == null);
                this.f5884m = (a.C0094a) obj;
            }
        }

        @Override // g5.b.a
        public final Object b() {
            long j10;
            long O;
            a.C0094a c0094a;
            long j11;
            int size = this.f5877e.size();
            a.b[] bVarArr = new a.b[size];
            this.f5877e.toArray(bVarArr);
            a.C0094a c0094a2 = this.f5884m;
            if (c0094a2 != null) {
                a4.d dVar = new a4.d(new d.b(c0094a2.f5851a, null, "video/mp4", c0094a2.f5852b));
                for (int i10 = 0; i10 < size; i10++) {
                    a.b bVar = bVarArr[i10];
                    int i11 = bVar.f5854a;
                    if (i11 == 2 || i11 == 1) {
                        i0[] i0VarArr = bVar.f5862j;
                        for (int i12 = 0; i12 < i0VarArr.length; i12++) {
                            i0 i0Var = i0VarArr[i12];
                            i0Var.getClass();
                            i0.a aVar = new i0.a(i0Var);
                            aVar.f15475n = dVar;
                            i0VarArr[i12] = new i0(aVar);
                        }
                    }
                }
            }
            int i13 = this.f;
            int i14 = this.f5878g;
            long j12 = this.f5879h;
            long j13 = this.f5880i;
            long j14 = this.f5881j;
            int i15 = this.f5882k;
            boolean z10 = this.f5883l;
            a.C0094a c0094a3 = this.f5884m;
            if (j13 == 0) {
                j10 = j14;
                O = -9223372036854775807L;
            } else {
                j10 = j14;
                O = e0.O(j13, 1000000L, j12);
            }
            if (j10 == 0) {
                c0094a = c0094a3;
                j11 = -9223372036854775807L;
            } else {
                long O2 = e0.O(j10, 1000000L, j12);
                c0094a = c0094a3;
                j11 = O2;
            }
            return new g5.a(i13, i14, O, j11, i15, z10, c0094a, bVarArr);
        }

        @Override // g5.b.a
        public final void j(XmlPullParser xmlPullParser) {
            this.f = a.i(xmlPullParser, "MajorVersion");
            this.f5878g = a.i(xmlPullParser, "MinorVersion");
            this.f5879h = a.h(xmlPullParser, "TimeScale", 10000000L);
            String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
            if (attributeValue == null) {
                throw new C0095b("Duration");
            }
            try {
                this.f5880i = Long.parseLong(attributeValue);
                this.f5881j = a.h(xmlPullParser, "DVRWindowLength", 0L);
                this.f5882k = a.g(xmlPullParser, "LookaheadCount");
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
                this.f5883l = attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : false;
                l(Long.valueOf(this.f5879h), "TimeScale");
            } catch (NumberFormatException e10) {
                throw a1.b(null, e10);
            }
        }
    }

    public static class f extends a {

        /* renamed from: e, reason: collision with root package name */
        public final String f5885e;
        public final LinkedList f;

        /* renamed from: g, reason: collision with root package name */
        public int f5886g;

        /* renamed from: h, reason: collision with root package name */
        public String f5887h;

        /* renamed from: i, reason: collision with root package name */
        public long f5888i;

        /* renamed from: j, reason: collision with root package name */
        public String f5889j;

        /* renamed from: k, reason: collision with root package name */
        public String f5890k;

        /* renamed from: l, reason: collision with root package name */
        public int f5891l;

        /* renamed from: m, reason: collision with root package name */
        public int f5892m;

        /* renamed from: n, reason: collision with root package name */
        public int f5893n;

        /* renamed from: o, reason: collision with root package name */
        public int f5894o;

        /* renamed from: p, reason: collision with root package name */
        public String f5895p;

        /* renamed from: q, reason: collision with root package name */
        public ArrayList<Long> f5896q;

        /* renamed from: r, reason: collision with root package name */
        public long f5897r;

        public f(a aVar, String str) {
            super(aVar, str, "StreamIndex");
            this.f5885e = str;
            this.f = new LinkedList();
        }

        @Override // g5.b.a
        public final void a(Object obj) {
            if (obj instanceof i0) {
                this.f.add((i0) obj);
            }
        }

        @Override // g5.b.a
        public final Object b() {
            String str;
            String str2;
            String str3;
            i0[] i0VarArr = new i0[this.f.size()];
            this.f.toArray(i0VarArr);
            String str4 = this.f5885e;
            String str5 = this.f5890k;
            int i10 = this.f5886g;
            String str6 = this.f5887h;
            long j10 = this.f5888i;
            String str7 = this.f5889j;
            int i11 = this.f5891l;
            int i12 = this.f5892m;
            int i13 = this.f5893n;
            int i14 = this.f5894o;
            String str8 = this.f5895p;
            ArrayList<Long> arrayList = this.f5896q;
            long j11 = this.f5897r;
            int i15 = e0.f15881a;
            int size = arrayList.size();
            long[] jArr = new long[size];
            if (j10 < 1000000 || j10 % 1000000 != 0) {
                str = str7;
                if (j10 >= 1000000 || 1000000 % j10 != 0) {
                    str2 = str6;
                    str3 = str8;
                    double d10 = 1000000 / j10;
                    int i16 = 0;
                    while (i16 < size) {
                        jArr[i16] = (long) (arrayList.get(i16).longValue() * d10);
                        i16++;
                        arrayList = arrayList;
                    }
                    return new a.b(str4, str5, i10, str2, j10, str, i11, i12, i13, i14, str3, i0VarArr, arrayList, jArr, e0.O(j11, 1000000L, j10));
                }
                long j12 = 1000000 / j10;
                for (int i17 = 0; i17 < size; i17++) {
                    jArr[i17] = arrayList.get(i17).longValue() * j12;
                }
            } else {
                long j13 = j10 / 1000000;
                str = str7;
                for (int i18 = 0; i18 < size; i18++) {
                    jArr[i18] = arrayList.get(i18).longValue() / j13;
                }
            }
            str2 = str6;
            str3 = str8;
            return new a.b(str4, str5, i10, str2, j10, str, i11, i12, i13, i14, str3, i0VarArr, arrayList, jArr, e0.O(j11, 1000000L, j10));
        }

        @Override // g5.b.a
        public final boolean d(String str) {
            return "c".equals(str);
        }

        @Override // g5.b.a
        public final void j(XmlPullParser xmlPullParser) {
            String attributeValue;
            int i10 = 1;
            if (!"c".equals(xmlPullParser.getName())) {
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "Type");
                if (attributeValue2 == null) {
                    throw new C0095b("Type");
                }
                if (!"audio".equalsIgnoreCase(attributeValue2)) {
                    if ("video".equalsIgnoreCase(attributeValue2)) {
                        i10 = 2;
                    } else {
                        if (!"text".equalsIgnoreCase(attributeValue2)) {
                            throw a1.b("Invalid key value[" + attributeValue2 + "]", null);
                        }
                        i10 = 3;
                    }
                }
                this.f5886g = i10;
                l(Integer.valueOf(i10), "Type");
                if (this.f5886g == 3) {
                    attributeValue = xmlPullParser.getAttributeValue(null, "Subtype");
                    if (attributeValue == null) {
                        throw new C0095b("Subtype");
                    }
                } else {
                    attributeValue = xmlPullParser.getAttributeValue(null, "Subtype");
                }
                this.f5887h = attributeValue;
                l(attributeValue, "Subtype");
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
                this.f5889j = attributeValue3;
                l(attributeValue3, "Name");
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
                if (attributeValue4 == null) {
                    throw new C0095b("Url");
                }
                this.f5890k = attributeValue4;
                this.f5891l = a.g(xmlPullParser, "MaxWidth");
                this.f5892m = a.g(xmlPullParser, "MaxHeight");
                this.f5893n = a.g(xmlPullParser, "DisplayWidth");
                this.f5894o = a.g(xmlPullParser, "DisplayHeight");
                String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
                this.f5895p = attributeValue5;
                l(attributeValue5, "Language");
                long g10 = a.g(xmlPullParser, "TimeScale");
                this.f5888i = g10;
                if (g10 == -1) {
                    this.f5888i = ((Long) c("TimeScale")).longValue();
                }
                this.f5896q = new ArrayList<>();
                return;
            }
            int size = this.f5896q.size();
            long h10 = a.h(xmlPullParser, "t", -9223372036854775807L);
            if (h10 == -9223372036854775807L) {
                if (size == 0) {
                    h10 = 0;
                } else {
                    if (this.f5897r == -1) {
                        throw a1.b("Unable to infer start time", null);
                    }
                    h10 = this.f5897r + this.f5896q.get(size - 1).longValue();
                }
            }
            this.f5896q.add(Long.valueOf(h10));
            this.f5897r = a.h(xmlPullParser, "d", -9223372036854775807L);
            long h11 = a.h(xmlPullParser, "r", 1L);
            if (h11 > 1 && this.f5897r == -9223372036854775807L) {
                throw a1.b("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j10 = i10;
                if (j10 >= h11) {
                    return;
                }
                this.f5896q.add(Long.valueOf((this.f5897r * j10) + h10));
                i10++;
            }
        }
    }

    public b() {
        try {
            this.f5869a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    @Override // t5.f0.a
    public final Object a(Uri uri, m mVar) {
        try {
            XmlPullParser newPullParser = this.f5869a.newPullParser();
            newPullParser.setInput(mVar, null);
            return (g5.a) new e(uri.toString()).e(newPullParser);
        } catch (XmlPullParserException e10) {
            throw a1.b(null, e10);
        }
    }
}
