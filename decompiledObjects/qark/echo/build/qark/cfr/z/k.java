/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  org.xmlpull.v1.XmlPullParser
 */
package z;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;
import z.c;
import z.d;

public abstract class k {
    public static boolean a(TypedArray typedArray, XmlPullParser xmlPullParser, String string2, int n8, boolean bl) {
        if (!k.j(xmlPullParser, string2)) {
            return bl;
        }
        return typedArray.getBoolean(n8, bl);
    }

    public static int b(TypedArray typedArray, XmlPullParser xmlPullParser, String string2, int n8, int n9) {
        if (!k.j(xmlPullParser, string2)) {
            return n9;
        }
        return typedArray.getColor(n8, n9);
    }

    public static ColorStateList c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String string2, int n8) {
        if (k.j(xmlPullParser, string2)) {
            xmlPullParser = new TypedValue();
            typedArray.getValue(n8, (TypedValue)xmlPullParser);
            int n9 = xmlPullParser.type;
            if (n9 != 2) {
                if (n9 >= 28 && n9 <= 31) {
                    return k.d((TypedValue)xmlPullParser);
                }
                return c.d(typedArray.getResources(), typedArray.getResourceId(n8, 0), theme);
            }
            typedArray = new StringBuilder();
            typedArray.append("Failed to resolve attribute at index ");
            typedArray.append(n8);
            typedArray.append(": ");
            typedArray.append((Object)xmlPullParser);
            throw new UnsupportedOperationException(typedArray.toString());
        }
        return null;
    }

    public static ColorStateList d(TypedValue typedValue) {
        return ColorStateList.valueOf((int)typedValue.data);
    }

    public static d e(TypedArray object, XmlPullParser xmlPullParser, Resources.Theme theme, String string2, int n8, int n9) {
        if (k.j(xmlPullParser, string2)) {
            xmlPullParser = new TypedValue();
            object.getValue(n8, (TypedValue)xmlPullParser);
            int n10 = xmlPullParser.type;
            if (n10 >= 28 && n10 <= 31) {
                return d.b(xmlPullParser.data);
            }
            if ((object = d.g(object.getResources(), object.getResourceId(n8, 0), theme)) != null) {
                return object;
            }
        }
        return d.b(n9);
    }

    public static float f(TypedArray typedArray, XmlPullParser xmlPullParser, String string2, int n8, float f8) {
        if (!k.j(xmlPullParser, string2)) {
            return f8;
        }
        return typedArray.getFloat(n8, f8);
    }

    public static int g(TypedArray typedArray, XmlPullParser xmlPullParser, String string2, int n8, int n9) {
        if (!k.j(xmlPullParser, string2)) {
            return n9;
        }
        return typedArray.getInt(n8, n9);
    }

    public static int h(TypedArray typedArray, XmlPullParser xmlPullParser, String string2, int n8, int n9) {
        if (!k.j(xmlPullParser, string2)) {
            return n9;
        }
        return typedArray.getResourceId(n8, n9);
    }

    public static String i(TypedArray typedArray, XmlPullParser xmlPullParser, String string2, int n8) {
        if (!k.j(xmlPullParser, string2)) {
            return null;
        }
        return typedArray.getString(n8);
    }

    public static boolean j(XmlPullParser xmlPullParser, String string2) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", string2) != null) {
            return true;
        }
        return false;
    }

    public static TypedArray k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] arrn) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, arrn);
        }
        return theme.obtainStyledAttributes(attributeSet, arrn, 0, 0);
    }

    public static TypedValue l(TypedArray typedArray, XmlPullParser xmlPullParser, String string2, int n8) {
        if (!k.j(xmlPullParser, string2)) {
            return null;
        }
        return typedArray.peekValue(n8);
    }
}

