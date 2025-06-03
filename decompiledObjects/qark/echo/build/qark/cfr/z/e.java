/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.util.Base64
 *  android.util.Xml
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package z;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public abstract class e {
    public static int a(TypedArray typedArray, int n8) {
        return a.a(typedArray, n8);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int n8;
        while ((n8 = xmlPullParser.next()) != 2 && n8 != 1) {
        }
        if (n8 == 2) {
            return e.d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List c(Resources resources, int n8) {
        TypedArray typedArray;
        ArrayList arrayList;
        block9 : {
            block7 : {
                Throwable throwable2;
                block8 : {
                    block6 : {
                        block5 : {
                            if (n8 == 0) {
                                return Collections.emptyList();
                            }
                            typedArray = resources.obtainTypedArray(n8);
                            try {
                                if (typedArray.length() != 0) break block5;
                                resources = Collections.emptyList();
                            }
                            catch (Throwable throwable2) {}
                            typedArray.recycle();
                            return resources;
                        }
                        arrayList = new ArrayList();
                        if (e.a(typedArray, 0) != 1) break block6;
                        break block7;
                        break block8;
                    }
                    arrayList.add((Object)e.h(resources.getStringArray(n8)));
                    break block9;
                }
                typedArray.recycle();
                throw throwable2;
            }
            for (n8 = 0; n8 < typedArray.length(); ++n8) {
                int n9 = typedArray.getResourceId(n8, 0);
                if (n9 == 0) continue;
                arrayList.add((Object)e.h(resources.getStringArray(n9)));
            }
        }
        typedArray.recycle();
        return arrayList;
    }

    public static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals((Object)"font-family")) {
            return e.e(xmlPullParser, resources);
        }
        e.g(xmlPullParser);
        return null;
    }

    public static b e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray typedArray = resources.obtainAttributes(Xml.asAttributeSet((XmlPullParser)xmlPullParser), v.d.h);
        String string2 = typedArray.getString(v.d.i);
        String string3 = typedArray.getString(v.d.m);
        String string4 = typedArray.getString(v.d.n);
        int n8 = typedArray.getResourceId(v.d.j, 0);
        int n9 = typedArray.getInteger(v.d.k, 1);
        int n10 = typedArray.getInteger(v.d.l, 500);
        String string5 = typedArray.getString(v.d.o);
        typedArray.recycle();
        if (string2 != null && string3 != null && string4 != null) {
            while (xmlPullParser.next() != 3) {
                e.g(xmlPullParser);
            }
            return new e(new F.e(string2, string3, string4, e.c(resources, n8)), n9, n10, string5);
        }
        typedArray = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() != 2) continue;
            if (xmlPullParser.getName().equals((Object)"font")) {
                typedArray.add((Object)e.f(xmlPullParser, resources));
                continue;
            }
            e.g(xmlPullParser);
        }
        if (typedArray.isEmpty()) {
            return null;
        }
        return new c((d[])typedArray.toArray((Object[])new d[0]));
    }

    public static d f(XmlPullParser xmlPullParser, Resources resources) {
        int n8 = (resources = resources.obtainAttributes(Xml.asAttributeSet((XmlPullParser)xmlPullParser), v.d.p)).hasValue(v.d.y) ? v.d.y : v.d.r;
        int n9 = resources.getInt(n8, 400);
        n8 = resources.hasValue(v.d.w) ? v.d.w : v.d.s;
        boolean bl = 1 == resources.getInt(n8, 0);
        n8 = resources.hasValue(v.d.z) ? v.d.z : v.d.t;
        int n10 = resources.hasValue(v.d.x) ? v.d.x : v.d.u;
        String string2 = resources.getString(n10);
        n10 = resources.getInt(n8, 0);
        n8 = resources.hasValue(v.d.v) ? v.d.v : v.d.q;
        int n11 = resources.getResourceId(n8, 0);
        String string3 = resources.getString(n8);
        resources.recycle();
        while (xmlPullParser.next() != 3) {
            e.g(xmlPullParser);
        }
        return new d(string3, n9, bl, string2, n10, n11);
    }

    public static void g(XmlPullParser xmlPullParser) {
        int n8 = 1;
        while (n8 > 0) {
            int n9 = xmlPullParser.next();
            if (n9 != 2) {
                if (n9 != 3) continue;
                --n8;
                continue;
            }
            ++n8;
        }
    }

    public static List h(String[] arrstring) {
        ArrayList arrayList = new ArrayList();
        int n8 = arrstring.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            arrayList.add((Object)Base64.decode((String)arrstring[i8], (int)0));
        }
        return arrayList;
    }

    public static abstract class a {
        public static int a(TypedArray typedArray, int n8) {
            return typedArray.getType(n8);
        }
    }

    public static interface b {
    }

    public static final class c
    implements b {
        public final d[] a;

        public c(d[] arrd) {
            this.a = arrd;
        }

        public d[] a() {
            return this.a;
        }
    }

    public static final class d {
        public final String a;
        public final int b;
        public final boolean c;
        public final String d;
        public final int e;
        public final int f;

        public d(String string2, int n8, boolean bl, String string3, int n9, int n10) {
            this.a = string2;
            this.b = n8;
            this.c = bl;
            this.d = string3;
            this.e = n9;
            this.f = n10;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.f;
        }

        public int c() {
            return this.e;
        }

        public String d() {
            return this.d;
        }

        public int e() {
            return this.b;
        }

        public boolean f() {
            return this.c;
        }
    }

    public static final class e
    implements b {
        public final F.e a;
        public final int b;
        public final int c;
        public final String d;

        public e(F.e e8, int n8, int n9, String string2) {
            this.a = e8;
            this.c = n8;
            this.b = n9;
            this.d = string2;
        }

        public int a() {
            return this.c;
        }

        public F.e b() {
            return this.a;
        }

        public String c() {
            return this.d;
        }

        public int d() {
            return this.b;
        }
    }

}

