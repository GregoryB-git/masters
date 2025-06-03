package w;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import b.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class d {

    public static class a {
        public static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final C0251d[] f16147a;

        public c(C0251d[] c0251dArr) {
            this.f16147a = c0251dArr;
        }
    }

    /* renamed from: w.d$d, reason: collision with other inner class name */
    public static final class C0251d {

        /* renamed from: a, reason: collision with root package name */
        public final String f16148a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16149b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f16150c;

        /* renamed from: d, reason: collision with root package name */
        public final String f16151d;

        /* renamed from: e, reason: collision with root package name */
        public final int f16152e;
        public final int f;

        public C0251d(int i10, int i11, int i12, String str, String str2, boolean z10) {
            this.f16148a = str;
            this.f16149b = i10;
            this.f16150c = z10;
            this.f16151d = str2;
            this.f16152e = i11;
            this.f = i12;
        }
    }

    public static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        public final b0.g f16153a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16154b;

        /* renamed from: c, reason: collision with root package name */
        public final int f16155c;

        /* renamed from: d, reason: collision with root package name */
        public final String f16156d;

        public e(b0.g gVar, int i10, int i11, String str) {
            this.f16153a = gVar;
            this.f16155c = i10;
            this.f16154b = i11;
            this.f16156d = str;
        }
    }

    public static b a(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), a0.f1562b0);
            String string = obtainAttributes.getString(0);
            String string2 = obtainAttributes.getString(4);
            String string3 = obtainAttributes.getString(5);
            int resourceId = obtainAttributes.getResourceId(1, 0);
            int integer = obtainAttributes.getInteger(2, 1);
            int integer2 = obtainAttributes.getInteger(3, 500);
            String string4 = obtainAttributes.getString(6);
            obtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    c(xmlResourceParser);
                }
                return new e(new b0.g(string, string2, string3, b(resources, resourceId)), integer, integer2, string4);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), a0.f1564c0);
                        int i10 = obtainAttributes2.getInt(obtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z10 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i11 = obtainAttributes2.hasValue(9) ? 9 : 3;
                        String string5 = obtainAttributes2.getString(obtainAttributes2.hasValue(7) ? 7 : 4);
                        int i12 = obtainAttributes2.getInt(i11, 0);
                        int i13 = obtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = obtainAttributes2.getResourceId(i13, 0);
                        String string6 = obtainAttributes2.getString(i13);
                        obtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            c(xmlResourceParser);
                        }
                        arrayList.add(new C0251d(i10, i12, resourceId2, string6, string5, z10));
                    } else {
                        c(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new c((C0251d[]) arrayList.toArray(new C0251d[0]));
            }
        } else {
            c(xmlResourceParser);
        }
        return null;
    }

    public static List<List<byte[]>> b(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a.a(obtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < obtainTypedArray.length(); i11++) {
                    int resourceId = obtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i10);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void c(XmlResourceParser xmlResourceParser) {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }
}
