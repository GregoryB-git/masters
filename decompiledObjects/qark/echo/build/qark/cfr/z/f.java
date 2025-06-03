/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.LinearGradient
 *  android.graphics.RadialGradient
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.SweepGradient
 *  android.util.AttributeSet
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package z;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import v.d;
import z.k;

public abstract class f {
    public static a a(a a8, int n8, int n9, boolean bl, int n10) {
        if (a8 != null) {
            return a8;
        }
        if (bl) {
            a8 = new a(n8, n10, n9);
            return a8;
        }
        a8 = new a(n8, n9);
        return a8;
    }

    public static Shader b(Resources object, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String string2 = xmlPullParser.getName();
        if (string2.equals((Object)"gradient")) {
            string2 = k.k((Resources)object, theme, attributeSet, d.A);
            float f8 = k.f((TypedArray)string2, xmlPullParser, "startX", d.J, 0.0f);
            float f9 = k.f((TypedArray)string2, xmlPullParser, "startY", d.K, 0.0f);
            float f10 = k.f((TypedArray)string2, xmlPullParser, "endX", d.L, 0.0f);
            float f11 = k.f((TypedArray)string2, xmlPullParser, "endY", d.M, 0.0f);
            float f12 = k.f((TypedArray)string2, xmlPullParser, "centerX", d.E, 0.0f);
            float f13 = k.f((TypedArray)string2, xmlPullParser, "centerY", d.F, 0.0f);
            int n8 = k.g((TypedArray)string2, xmlPullParser, "type", d.D, 0);
            int n9 = k.b((TypedArray)string2, xmlPullParser, "startColor", d.B, 0);
            boolean bl = k.j(xmlPullParser, "centerColor");
            int n10 = k.b((TypedArray)string2, xmlPullParser, "centerColor", d.I, 0);
            int n11 = k.b((TypedArray)string2, xmlPullParser, "endColor", d.C, 0);
            int n12 = k.g((TypedArray)string2, xmlPullParser, "tileMode", d.H, 0);
            float f14 = k.f((TypedArray)string2, xmlPullParser, "gradientRadius", d.G, 0.0f);
            string2.recycle();
            object = f.a(f.c((Resources)object, xmlPullParser, attributeSet, theme), n9, n11, bl, n10);
            if (n8 != 1) {
                if (n8 != 2) {
                    return new LinearGradient(f8, f9, f10, f11, object.a, object.b, f.d(n12));
                }
                return new SweepGradient(f12, f13, object.a, object.b);
            }
            if (f14 > 0.0f) {
                return new RadialGradient(f12, f13, f14, object.a, object.b, f.d(n12));
            }
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        object = new StringBuilder();
        object.append(xmlPullParser.getPositionDescription());
        object.append(": invalid gradient color tag ");
        object.append(string2);
        throw new XmlPullParserException(object.toString());
    }

    public static a c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int n8;
        int n9;
        int n10 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while ((n8 = xmlPullParser.next()) != 1 && ((n9 = xmlPullParser.getDepth()) >= n10 || n8 != 3)) {
            if (n8 != 2 || n9 > n10 || !xmlPullParser.getName().equals((Object)"item")) continue;
            TypedArray typedArray = k.k(resources, theme, attributeSet, d.N);
            boolean bl = typedArray.hasValue(d.O);
            boolean bl2 = typedArray.hasValue(d.P);
            if (bl && bl2) {
                n8 = typedArray.getColor(d.O, 0);
                float f8 = typedArray.getFloat(d.P, 0.0f);
                typedArray.recycle();
                arrayList2.add((Object)n8);
                arrayList.add((Object)Float.valueOf((float)f8));
                continue;
            }
            resources = new StringBuilder();
            resources.append(xmlPullParser.getPositionDescription());
            resources.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
            throw new XmlPullParserException(resources.toString());
        }
        if (arrayList2.size() > 0) {
            return new a((List)arrayList2, (List)arrayList);
        }
        return null;
    }

    public static Shader.TileMode d(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    public static final class a {
        public final int[] a;
        public final float[] b;

        public a(int n8, int n9) {
            this.a = new int[]{n8, n9};
            this.b = new float[]{0.0f, 1.0f};
        }

        public a(int n8, int n9, int n10) {
            this.a = new int[]{n8, n9, n10};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }

        public a(List list, List list2) {
            int n8 = list.size();
            this.a = new int[n8];
            this.b = new float[n8];
            for (int i8 = 0; i8 < n8; ++i8) {
                this.a[i8] = (Integer)list.get(i8);
                this.b[i8] = ((Float)list2.get(i8)).floatValue();
            }
        }
    }

}

