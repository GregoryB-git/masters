// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z;

import android.util.Base64;
import v.d;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.TypedArray;

public abstract class e
{
    public static int a(final TypedArray typedArray, final int n) {
        return a.a(typedArray, n);
    }
    
    public static b b(final XmlPullParser xmlPullParser, final Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
        } while (next != 2 && next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }
    
    public static List c(final Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        final TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        final Resources resources2;
        Label_0116: {
            try {
                if (obtainTypedArray.length() == 0) {
                    final List<Object> emptyList = Collections.emptyList();
                    obtainTypedArray.recycle();
                    return emptyList;
                }
            }
            finally {
                break Label_0116;
            }
            final ArrayList<List> list = new ArrayList<List>();
            if (a(obtainTypedArray, 0) == 1) {
                int resourceId;
                for (i = 0; i < obtainTypedArray.length(); ++i) {
                    resourceId = obtainTypedArray.getResourceId(i, 0);
                    if (resourceId != 0) {
                        list.add(h(resources2.getStringArray(resourceId)));
                    }
                }
            }
            else {
                list.add(h(resources2.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return list;
        }
        obtainTypedArray.recycle();
        throw resources2;
    }
    
    public static b d(final XmlPullParser xmlPullParser, final Resources resources) {
        xmlPullParser.require(2, (String)null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }
    
    public static b e(final XmlPullParser xmlPullParser, final Resources resources) {
        final TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), v.d.h);
        final String string = obtainAttributes.getString(v.d.i);
        final String string2 = obtainAttributes.getString(v.d.m);
        final String string3 = obtainAttributes.getString(v.d.n);
        final int resourceId = obtainAttributes.getResourceId(v.d.j, 0);
        final int integer = obtainAttributes.getInteger(v.d.k, 1);
        final int integer2 = obtainAttributes.getInteger(v.d.l, 500);
        final String string4 = obtainAttributes.getString(v.d.o);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return (b)new e(new e(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        final ArrayList<d> list = new ArrayList<d>();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() != 2) {
                continue;
            }
            if (xmlPullParser.getName().equals("font")) {
                list.add(f(xmlPullParser, resources));
            }
            else {
                g(xmlPullParser);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return (b)new c((d[])list.toArray(new d[0]));
    }
    
    public static d f(final XmlPullParser xmlPullParser, final Resources resources) {
        final TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), v.d.p);
        int n;
        if (obtainAttributes.hasValue(v.d.y)) {
            n = v.d.y;
        }
        else {
            n = v.d.r;
        }
        final int int1 = obtainAttributes.getInt(n, 400);
        int n2;
        if (obtainAttributes.hasValue(v.d.w)) {
            n2 = v.d.w;
        }
        else {
            n2 = v.d.s;
        }
        final boolean b = 1 == obtainAttributes.getInt(n2, 0);
        int n3;
        if (obtainAttributes.hasValue(v.d.z)) {
            n3 = v.d.z;
        }
        else {
            n3 = v.d.t;
        }
        int n4;
        if (obtainAttributes.hasValue(v.d.x)) {
            n4 = v.d.x;
        }
        else {
            n4 = v.d.u;
        }
        final String string = obtainAttributes.getString(n4);
        final int int2 = obtainAttributes.getInt(n3, 0);
        int n5;
        if (obtainAttributes.hasValue(v.d.v)) {
            n5 = v.d.v;
        }
        else {
            n5 = v.d.q;
        }
        final int resourceId = obtainAttributes.getResourceId(n5, 0);
        final String string2 = obtainAttributes.getString(n5);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, int1, b, string, int2, resourceId);
    }
    
    public static void g(final XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            final int next = xmlPullParser.next();
            if (next != 2) {
                if (next != 3) {
                    continue;
                }
                --i;
            }
            else {
                ++i;
            }
        }
    }
    
    public static List h(final String[] array) {
        final ArrayList<byte[]> list = new ArrayList<byte[]>();
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(Base64.decode(array[i], 0));
        }
        return list;
    }
    
    public abstract static class a
    {
        public static int a(final TypedArray typedArray, final int n) {
            return typedArray.getType(n);
        }
    }
    
    public interface b
    {
    }
    
    public static final class c implements b
    {
        public final d[] a;
        
        public c(final d[] a) {
            this.a = a;
        }
        
        public d[] a() {
            return this.a;
        }
    }
    
    public static final class d
    {
        public final String a;
        public final int b;
        public final boolean c;
        public final String d;
        public final int e;
        public final int f;
        
        public d(final String a, final int b, final boolean c, final String d, final int e, final int f) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
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
    
    public static final class e implements b
    {
        public final F.e a;
        public final int b;
        public final int c;
        public final String d;
        
        public e(final F.e a, final int c, final int b, final String d) {
            this.a = a;
            this.c = c;
            this.b = b;
            this.d = d;
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
