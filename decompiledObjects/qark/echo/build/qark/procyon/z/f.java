// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z;

import android.graphics.Shader$TileMode;
import java.util.List;
import java.util.ArrayList;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.SweepGradient;
import android.graphics.LinearGradient;
import v.d;
import org.xmlpull.v1.XmlPullParserException;
import android.graphics.Shader;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;

public abstract class f
{
    public static a a(a a, final int n, final int n2, final boolean b, final int n3) {
        if (a != null) {
            return a;
        }
        if (b) {
            a = new a(n, n3, n2);
            return a;
        }
        a = new a(n, n2);
        return a;
    }
    
    public static Shader b(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            final StringBuilder sb = new StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid gradient color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        final TypedArray k = z.k.k(resources, resources$Theme, set, d.A);
        final float f = z.k.f(k, xmlPullParser, "startX", d.J, 0.0f);
        final float f2 = z.k.f(k, xmlPullParser, "startY", d.K, 0.0f);
        final float f3 = z.k.f(k, xmlPullParser, "endX", d.L, 0.0f);
        final float f4 = z.k.f(k, xmlPullParser, "endY", d.M, 0.0f);
        final float f5 = z.k.f(k, xmlPullParser, "centerX", d.E, 0.0f);
        final float f6 = z.k.f(k, xmlPullParser, "centerY", d.F, 0.0f);
        final int g = z.k.g(k, xmlPullParser, "type", d.D, 0);
        final int b = z.k.b(k, xmlPullParser, "startColor", d.B, 0);
        final boolean j = z.k.j(xmlPullParser, "centerColor");
        final int b2 = z.k.b(k, xmlPullParser, "centerColor", d.I, 0);
        final int b3 = z.k.b(k, xmlPullParser, "endColor", d.C, 0);
        final int g2 = z.k.g(k, xmlPullParser, "tileMode", d.H, 0);
        final float f7 = z.k.f(k, xmlPullParser, "gradientRadius", d.G, 0.0f);
        k.recycle();
        final a a = a(c(resources, xmlPullParser, set, resources$Theme), b, b3, j, b2);
        if (g != 1) {
            if (g != 2) {
                return (Shader)new LinearGradient(f, f2, f3, f4, a.a, a.b, d(g2));
            }
            return (Shader)new SweepGradient(f5, f6, a.a, a.b);
        }
        else {
            if (f7 > 0.0f) {
                return (Shader)new RadialGradient(f5, f6, f7, a.a, a.b, d(g2));
            }
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
    }
    
    public static a c(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final int n = xmlPullParser.getDepth() + 1;
        final ArrayList<Float> list = new ArrayList<Float>(20);
        final ArrayList<Integer> list2 = new ArrayList<Integer>(20);
        while (true) {
            final int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            final int depth = xmlPullParser.getDepth();
            if (depth < n && next == 3) {
                break;
            }
            if (next != 2) {
                continue;
            }
            if (depth > n) {
                continue;
            }
            if (!xmlPullParser.getName().equals("item")) {
                continue;
            }
            final TypedArray k = z.k.k(resources, resources$Theme, set, d.N);
            final boolean hasValue = k.hasValue(d.O);
            final boolean hasValue2 = k.hasValue(d.P);
            if (!hasValue || !hasValue2) {
                final StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                throw new XmlPullParserException(sb.toString());
            }
            final int color = k.getColor(d.O, 0);
            final float float1 = k.getFloat(d.P, 0.0f);
            k.recycle();
            list2.add(color);
            list.add(float1);
        }
        if (list2.size() > 0) {
            return new a(list2, list);
        }
        return null;
    }
    
    public static Shader$TileMode d(final int n) {
        if (n == 1) {
            return Shader$TileMode.REPEAT;
        }
        if (n != 2) {
            return Shader$TileMode.CLAMP;
        }
        return Shader$TileMode.MIRROR;
    }
    
    public static final class a
    {
        public final int[] a;
        public final float[] b;
        
        public a(final int n, final int n2) {
            this.a = new int[] { n, n2 };
            this.b = new float[] { 0.0f, 1.0f };
        }
        
        public a(final int n, final int n2, final int n3) {
            this.a = new int[] { n, n2, n3 };
            this.b = new float[] { 0.0f, 0.5f, 1.0f };
        }
        
        public a(final List list, final List list2) {
            final int size = list.size();
            this.a = new int[size];
            this.b = new float[size];
            for (int i = 0; i < size; ++i) {
                this.a[i] = list.get(i);
                this.b[i] = list2.get(i);
            }
        }
    }
}
