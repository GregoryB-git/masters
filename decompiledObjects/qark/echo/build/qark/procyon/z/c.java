// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z;

import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.StateSet;
import v.a;
import android.os.Build$VERSION;
import v.d;
import android.util.Log;
import android.util.TypedValue;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParserException;
import android.util.Xml;
import android.content.res.ColorStateList;
import android.content.res.Resources$Theme;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;

public abstract class c
{
    public static final ThreadLocal a;
    
    static {
        a = new ThreadLocal();
    }
    
    public static ColorStateList a(final Resources resources, final XmlPullParser xmlPullParser, final Resources$Theme resources$Theme) {
        final AttributeSet attributeSet = Xml.asAttributeSet(xmlPullParser);
        int next;
        do {
            next = xmlPullParser.next();
        } while (next != 2 && next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, attributeSet, resources$Theme);
        }
        throw new XmlPullParserException("No start tag found");
    }
    
    public static ColorStateList b(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return e(resources, xmlPullParser, set, resources$Theme);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid color state list tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }
    
    public static TypedValue c() {
        final ThreadLocal a = c.a;
        TypedValue value;
        if ((value = a.get()) == null) {
            value = new TypedValue();
            a.set(value);
        }
        return value;
    }
    
    public static ColorStateList d(final Resources resources, final int n, final Resources$Theme resources$Theme) {
        try {
            return a(resources, (XmlPullParser)resources.getXml(n), resources$Theme);
        }
        catch (Exception ex) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", (Throwable)ex);
            return null;
        }
    }
    
    public static ColorStateList e(Resources resources, XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final int n = xmlPullParser.getDepth() + 1;
        Object o = new int[20][];
        int[] array = new int[20];
        int n2 = 0;
    Label_0190_Outer:
        while (true) {
            final Resources resources2 = resources;
            final int next = xmlPullParser.next();
            Label_0503: {
                if (next == 1) {
                    break Label_0503;
                }
                final int depth = xmlPullParser.getDepth();
                if (depth < n && next == 3) {
                    break Label_0503;
                }
                int[] a = array;
                Object o2 = o;
                int n3 = n2;
                Label_0488: {
                    if (next != 2) {
                        break Label_0488;
                    }
                    a = array;
                    o2 = o;
                    n3 = n2;
                    if (depth > n) {
                        break Label_0488;
                    }
                    if (!xmlPullParser.getName().equals("item")) {
                        a = array;
                        o2 = o;
                        n3 = n2;
                        break Label_0488;
                    }
                    o2 = h(resources2, resources$Theme, set, d.b);
                    final int resourceId = ((TypedArray)o2).getResourceId(d.c, -1);
                    while (true) {
                        if (resourceId == -1 || f(resources2, resourceId)) {
                            break Label_0190;
                        }
                        try {
                            int n4 = a(resources2, (XmlPullParser)resources2.getXml(resourceId), resources$Theme).getDefaultColor();
                            while (true) {
                                final boolean hasValue = ((TypedArray)o2).hasValue(d.d);
                                float float1 = 1.0f;
                                Label_0257: {
                                    int n5;
                                    if (hasValue) {
                                        n5 = d.d;
                                    }
                                    else {
                                        if (!((TypedArray)o2).hasValue(d.f)) {
                                            break Label_0257;
                                        }
                                        n5 = d.f;
                                    }
                                    float1 = ((TypedArray)o2).getFloat(n5, 1.0f);
                                }
                                int n6;
                                if (Build$VERSION.SDK_INT >= 31 && ((TypedArray)o2).hasValue(d.e)) {
                                    n6 = d.e;
                                }
                                else {
                                    n6 = d.g;
                                }
                                final float float2 = ((TypedArray)o2).getFloat(n6, -1.0f);
                                ((TypedArray)o2).recycle();
                                final int attributeCount = set.getAttributeCount();
                                o2 = new int[attributeCount];
                                int i = 0;
                                int n7 = 0;
                                while (i < attributeCount) {
                                    final int attributeNameResource = set.getAttributeNameResource(i);
                                    int n8 = n7;
                                    if (attributeNameResource != 16843173) {
                                        n8 = n7;
                                        if (attributeNameResource != 16843551) {
                                            n8 = n7;
                                            if (attributeNameResource != v.a.a) {
                                                n8 = n7;
                                                if (attributeNameResource != v.a.b) {
                                                    int n9;
                                                    if (set.getAttributeBooleanValue(i, false)) {
                                                        n9 = attributeNameResource;
                                                    }
                                                    else {
                                                        n9 = -attributeNameResource;
                                                    }
                                                    o2[n7] = n9;
                                                    n8 = n7 + 1;
                                                }
                                            }
                                        }
                                    }
                                    ++i;
                                    n7 = n8;
                                }
                                o2 = StateSet.trimStateSet((int[])o2, n7);
                                a = g.a(array, n2, g(n4, float1, float2));
                                o2 = g.b((Object[])o, n2, o2);
                                n3 = n2 + 1;
                                array = a;
                                o = o2;
                                n2 = n3;
                                continue Label_0190_Outer;
                                resources = (Resources)(Object)new int[n2];
                                xmlPullParser = (XmlPullParser)(Object)new int[n2][];
                                System.arraycopy(array, 0, resources, 0, n2);
                                System.arraycopy(o, 0, xmlPullParser, 0, n2);
                                return new ColorStateList((int[][])(Object)xmlPullParser, (int[])(Object)resources);
                                n4 = ((TypedArray)o2).getColor(d.c, -65281);
                                continue;
                            }
                        }
                        catch (Exception ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
    }
    
    public static boolean f(final Resources resources, int type) {
        final TypedValue c = c();
        resources.getValue(type, c, true);
        type = c.type;
        return type >= 28 && type <= 31;
    }
    
    public static int g(final int n, final float n2, final float n3) {
        final boolean b = n3 >= 0.0f && n3 <= 100.0f;
        if (n2 == 1.0f && !b) {
            return n;
        }
        final int a = D.a.a((int)(Color.alpha(n) * n2 + 0.5f), 0, 255);
        int m = n;
        if (b) {
            final z.a c = z.a.c(n);
            m = z.a.m(c.j(), c.i(), n3);
        }
        return (m & 0xFFFFFF) | a << 24;
    }
    
    public static TypedArray h(final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final int[] array) {
        if (resources$Theme == null) {
            return resources.obtainAttributes(set, array);
        }
        return resources$Theme.obtainStyledAttributes(set, array, 0, 0);
    }
}
