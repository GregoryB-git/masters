package z;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class e {

    public static class a {
        public static int a(TypedArray typedArray, int i7) {
            return typedArray.getType(i7);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final d[] f21566a;

        public c(d[] dVarArr) {
            this.f21566a = dVarArr;
        }

        public d[] a() {
            return this.f21566a;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f21567a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21568b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f21569c;

        /* renamed from: d, reason: collision with root package name */
        public final String f21570d;

        /* renamed from: e, reason: collision with root package name */
        public final int f21571e;

        /* renamed from: f, reason: collision with root package name */
        public final int f21572f;

        public d(String str, int i7, boolean z7, String str2, int i8, int i9) {
            this.f21567a = str;
            this.f21568b = i7;
            this.f21569c = z7;
            this.f21570d = str2;
            this.f21571e = i8;
            this.f21572f = i9;
        }

        public String a() {
            return this.f21567a;
        }

        public int b() {
            return this.f21572f;
        }

        public int c() {
            return this.f21571e;
        }

        public String d() {
            return this.f21570d;
        }

        public int e() {
            return this.f21568b;
        }

        public boolean f() {
            return this.f21569c;
        }
    }

    /* renamed from: z.e$e, reason: collision with other inner class name */
    public static final class C0308e implements b {

        /* renamed from: a, reason: collision with root package name */
        public final F.e f21573a;

        /* renamed from: b, reason: collision with root package name */
        public final int f21574b;

        /* renamed from: c, reason: collision with root package name */
        public final int f21575c;

        /* renamed from: d, reason: collision with root package name */
        public final String f21576d;

        public C0308e(F.e eVar, int i7, int i8, String str) {
            this.f21573a = eVar;
            this.f21575c = i7;
            this.f21574b = i8;
            this.f21576d = str;
        }

        public int a() {
            return this.f21575c;
        }

        public F.e b() {
            return this.f21573a;
        }

        public String c() {
            return this.f21576d;
        }

        public int d() {
            return this.f21574b;
        }
    }

    public static int a(TypedArray typedArray, int i7) {
        return a.a(typedArray, i7);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i7) {
        if (i7 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i7);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i8 = 0; i8 < obtainTypedArray.length(); i8++) {
                    int resourceId = obtainTypedArray.getResourceId(i8, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i7)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    public static b e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), v.d.f20089h);
        String string = obtainAttributes.getString(v.d.f20090i);
        String string2 = obtainAttributes.getString(v.d.f20094m);
        String string3 = obtainAttributes.getString(v.d.f20095n);
        int resourceId = obtainAttributes.getResourceId(v.d.f20091j, 0);
        int integer = obtainAttributes.getInteger(v.d.f20092k, 1);
        int integer2 = obtainAttributes.getInteger(v.d.f20093l, 500);
        String string4 = obtainAttributes.getString(v.d.f20096o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new C0308e(new F.e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    public static d f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), v.d.f20097p);
        int i7 = obtainAttributes.getInt(obtainAttributes.hasValue(v.d.f20106y) ? v.d.f20106y : v.d.f20099r, 400);
        boolean z7 = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(v.d.f20104w) ? v.d.f20104w : v.d.f20100s, 0);
        int i8 = obtainAttributes.hasValue(v.d.f20107z) ? v.d.f20107z : v.d.f20101t;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(v.d.f20105x) ? v.d.f20105x : v.d.f20102u);
        int i9 = obtainAttributes.getInt(i8, 0);
        int i10 = obtainAttributes.hasValue(v.d.f20103v) ? v.d.f20103v : v.d.f20098q;
        int resourceId = obtainAttributes.getResourceId(i10, 0);
        String string2 = obtainAttributes.getString(i10);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i7, z7, string, i9, resourceId);
    }

    public static void g(XmlPullParser xmlPullParser) {
        int i7 = 1;
        while (i7 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i7++;
            } else if (next == 3) {
                i7--;
            }
        }
    }

    public static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
