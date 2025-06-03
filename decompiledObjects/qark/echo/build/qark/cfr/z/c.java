/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.graphics.Color
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.StateSet
 *  android.util.TypedValue
 *  android.util.Xml
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package z;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v.d;
import z.a;
import z.g;

public abstract class c {
    public static final ThreadLocal a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int n8;
        AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlPullParser);
        while ((n8 = xmlPullParser.next()) != 2 && n8 != 1) {
        }
        if (n8 == 2) {
            return c.b(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String string2 = xmlPullParser.getName();
        if (string2.equals((Object)"selector")) {
            return c.e(resources, xmlPullParser, attributeSet, theme);
        }
        resources = new StringBuilder();
        resources.append(xmlPullParser.getPositionDescription());
        resources.append(": invalid color state list tag ");
        resources.append(string2);
        throw new XmlPullParserException(resources.toString());
    }

    public static TypedValue c() {
        TypedValue typedValue;
        ThreadLocal threadLocal = a;
        TypedValue typedValue2 = typedValue = (TypedValue)threadLocal.get();
        if (typedValue == null) {
            typedValue2 = new TypedValue();
            threadLocal.set((Object)typedValue2);
        }
        return typedValue2;
    }

    public static ColorStateList d(Resources resources, int n8, Resources.Theme theme) {
        try {
            resources = c.a(resources, (XmlPullParser)resources.getXml(n8), theme);
            return resources;
        }
        catch (Exception exception) {
            Log.e((String)"CSLCompat", (String)"Failed to inflate ColorStateList.", (Throwable)exception);
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ColorStateList e(Resources arrn, XmlPullParser arrarrn, AttributeSet attributeSet, Resources.Theme theme) {
        int n8 = arrarrn.getDepth() + 1;
        int[] arrn2 = new int[20][];
        int[] arrn3 = new int[20];
        int n9 = 0;
        do {
            int n10;
            int[] arrn4;
            int[] arrn5;
            block14 : {
                float f8;
                int n12;
                int n11;
                block18 : {
                    block17 : {
                        block16 : {
                            block13 : {
                                int[] arrn6;
                                block15 : {
                                    arrn6 = arrn;
                                    n11 = arrarrn.next();
                                    if (n11 == 1 || (n12 = arrarrn.getDepth()) < n8 && n11 == 3) break;
                                    arrn5 = arrn3;
                                    arrn4 = arrn2;
                                    n10 = n9;
                                    if (n11 != 2) break block14;
                                    arrn5 = arrn3;
                                    arrn4 = arrn2;
                                    n10 = n9;
                                    if (n12 > n8) break block14;
                                    if (arrarrn.getName().equals((Object)"item")) break block15;
                                    arrn5 = arrn3;
                                    arrn4 = arrn2;
                                    n10 = n9;
                                    break block14;
                                }
                                arrn4 = c.h((Resources)arrn6, theme, attributeSet, d.b);
                                n10 = arrn4.getResourceId(d.c, -1);
                                if (n10 != -1 && !c.f((Resources)arrn6, n10)) {
                                    try {
                                        n10 = c.a((Resources)arrn6, (XmlPullParser)arrn6.getXml(n10), theme).getDefaultColor();
                                        break block13;
                                    }
                                    catch (Exception exception) {}
                                }
                                n10 = arrn4.getColor(d.c, -65281);
                            }
                            boolean bl = arrn4.hasValue(d.d);
                            f8 = 1.0f;
                            if (!bl) break block16;
                            n11 = d.d;
                            break block17;
                        }
                        if (!arrn4.hasValue(d.f)) break block18;
                        n11 = d.f;
                    }
                    f8 = arrn4.getFloat(n11, 1.0f);
                }
                n11 = Build.VERSION.SDK_INT >= 31 && arrn4.hasValue(d.e) ? d.e : d.g;
                float f9 = arrn4.getFloat(n11, -1.0f);
                arrn4.recycle();
                int n13 = attributeSet.getAttributeCount();
                arrn4 = new int[n13];
                n12 = 0;
                for (n11 = 0; n11 < n13; ++n11) {
                    int n14 = attributeSet.getAttributeNameResource(n11);
                    int n15 = n12;
                    if (n14 != 16843173) {
                        n15 = n12;
                        if (n14 != 16843551) {
                            n15 = n12;
                            if (n14 != v.a.a) {
                                n15 = n12;
                                if (n14 != v.a.b) {
                                    n15 = attributeSet.getAttributeBooleanValue(n11, false) ? n14 : - n14;
                                    arrn4[n12] = n15;
                                    n15 = n12 + 1;
                                }
                            }
                        }
                    }
                    n12 = n15;
                }
                arrn4 = StateSet.trimStateSet((int[])arrn4, (int)n12);
                arrn5 = g.a(arrn3, n9, c.g(n10, f8, f9));
                arrn4 = (int[][])g.b(arrn2, n9, arrn4);
                n10 = n9 + 1;
            }
            arrn3 = arrn5;
            arrn2 = arrn4;
            n9 = n10;
        } while (true);
        arrn = new int[n9];
        arrarrn = new int[n9][];
        System.arraycopy((Object)arrn3, (int)0, (Object)arrn, (int)0, (int)n9);
        System.arraycopy((Object)arrn2, (int)0, (Object)arrarrn, (int)0, (int)n9);
        return new ColorStateList((int[][])arrarrn, arrn);
    }

    public static boolean f(Resources resources, int n8) {
        TypedValue typedValue = c.c();
        resources.getValue(n8, typedValue, true);
        n8 = typedValue.type;
        if (n8 >= 28 && n8 <= 31) {
            return true;
        }
        return false;
    }

    public static int g(int n8, float f8, float f9) {
        boolean bl = f9 >= 0.0f && f9 <= 100.0f;
        if (f8 == 1.0f && !bl) {
            return n8;
        }
        int n9 = D.a.a((int)((float)Color.alpha((int)n8) * f8 + 0.5f), 0, 255);
        int n10 = n8;
        if (bl) {
            a a8 = a.c(n8);
            n10 = a.m(a8.j(), a8.i(), f9);
        }
        return n10 & 16777215 | n9 << 24;
    }

    public static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] arrn) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, arrn);
        }
        return theme.obtainStyledAttributes(attributeSet, arrn, 0, 0);
    }
}

