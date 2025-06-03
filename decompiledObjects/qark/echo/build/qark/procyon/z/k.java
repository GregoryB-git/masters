// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z;

import android.util.AttributeSet;
import android.content.res.Resources;
import android.util.TypedValue;
import android.content.res.ColorStateList;
import android.content.res.Resources$Theme;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.TypedArray;

public abstract class k
{
    public static boolean a(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n, final boolean b) {
        if (!j(xmlPullParser, s)) {
            return b;
        }
        return typedArray.getBoolean(n, b);
    }
    
    public static int b(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n, final int n2) {
        if (!j(xmlPullParser, s)) {
            return n2;
        }
        return typedArray.getColor(n, n2);
    }
    
    public static ColorStateList c(final TypedArray typedArray, final XmlPullParser xmlPullParser, final Resources$Theme resources$Theme, final String s, final int i) {
        if (!j(xmlPullParser, s)) {
            return null;
        }
        final TypedValue obj = new TypedValue();
        typedArray.getValue(i, obj);
        final int type = obj.type;
        if (type == 2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to resolve attribute at index ");
            sb.append(i);
            sb.append(": ");
            sb.append(obj);
            throw new UnsupportedOperationException(sb.toString());
        }
        if (type >= 28 && type <= 31) {
            return d(obj);
        }
        return c.d(typedArray.getResources(), typedArray.getResourceId(i, 0), resources$Theme);
    }
    
    public static ColorStateList d(final TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }
    
    public static d e(final TypedArray typedArray, final XmlPullParser xmlPullParser, final Resources$Theme resources$Theme, final String s, final int n, final int n2) {
        if (j(xmlPullParser, s)) {
            final TypedValue typedValue = new TypedValue();
            typedArray.getValue(n, typedValue);
            final int type = typedValue.type;
            if (type >= 28 && type <= 31) {
                return d.b(typedValue.data);
            }
            final d g = d.g(typedArray.getResources(), typedArray.getResourceId(n, 0), resources$Theme);
            if (g != null) {
                return g;
            }
        }
        return d.b(n2);
    }
    
    public static float f(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n, final float n2) {
        if (!j(xmlPullParser, s)) {
            return n2;
        }
        return typedArray.getFloat(n, n2);
    }
    
    public static int g(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n, final int n2) {
        if (!j(xmlPullParser, s)) {
            return n2;
        }
        return typedArray.getInt(n, n2);
    }
    
    public static int h(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n, final int n2) {
        if (!j(xmlPullParser, s)) {
            return n2;
        }
        return typedArray.getResourceId(n, n2);
    }
    
    public static String i(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n) {
        if (!j(xmlPullParser, s)) {
            return null;
        }
        return typedArray.getString(n);
    }
    
    public static boolean j(final XmlPullParser xmlPullParser, final String s) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", s) != null;
    }
    
    public static TypedArray k(final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final int[] array) {
        if (resources$Theme == null) {
            return resources.obtainAttributes(set, array);
        }
        return resources$Theme.obtainStyledAttributes(set, array, 0, 0);
    }
    
    public static TypedValue l(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n) {
        if (!j(xmlPullParser, s)) {
            return null;
        }
        return typedArray.peekValue(n);
    }
}
