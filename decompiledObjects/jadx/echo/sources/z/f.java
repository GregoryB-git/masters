package z;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class f {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f21577a;

        /* renamed from: b, reason: collision with root package name */
        public final float[] f21578b;

        public a(int i7, int i8) {
            this.f21577a = new int[]{i7, i8};
            this.f21578b = new float[]{0.0f, 1.0f};
        }

        public a(int i7, int i8, int i9) {
            this.f21577a = new int[]{i7, i8, i9};
            this.f21578b = new float[]{0.0f, 0.5f, 1.0f};
        }

        public a(List list, List list2) {
            int size = list.size();
            this.f21577a = new int[size];
            this.f21578b = new float[size];
            for (int i7 = 0; i7 < size; i7++) {
                this.f21577a[i7] = ((Integer) list.get(i7)).intValue();
                this.f21578b[i7] = ((Float) list2.get(i7)).floatValue();
            }
        }
    }

    public static a a(a aVar, int i7, int i8, boolean z7, int i9) {
        return aVar != null ? aVar : z7 ? new a(i7, i9, i8) : new a(i7, i8);
    }

    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray k7 = k.k(resources, theme, attributeSet, v.d.f20066A);
        float f7 = k.f(k7, xmlPullParser, "startX", v.d.f20075J, 0.0f);
        float f8 = k.f(k7, xmlPullParser, "startY", v.d.f20076K, 0.0f);
        float f9 = k.f(k7, xmlPullParser, "endX", v.d.f20077L, 0.0f);
        float f10 = k.f(k7, xmlPullParser, "endY", v.d.f20078M, 0.0f);
        float f11 = k.f(k7, xmlPullParser, "centerX", v.d.f20070E, 0.0f);
        float f12 = k.f(k7, xmlPullParser, "centerY", v.d.f20071F, 0.0f);
        int g7 = k.g(k7, xmlPullParser, "type", v.d.f20069D, 0);
        int b7 = k.b(k7, xmlPullParser, "startColor", v.d.f20067B, 0);
        boolean j7 = k.j(xmlPullParser, "centerColor");
        int b8 = k.b(k7, xmlPullParser, "centerColor", v.d.f20074I, 0);
        int b9 = k.b(k7, xmlPullParser, "endColor", v.d.f20068C, 0);
        int g8 = k.g(k7, xmlPullParser, "tileMode", v.d.f20073H, 0);
        float f13 = k.f(k7, xmlPullParser, "gradientRadius", v.d.f20072G, 0.0f);
        k7.recycle();
        a a7 = a(c(resources, xmlPullParser, attributeSet, theme), b7, b9, j7, b8);
        if (g7 != 1) {
            return g7 != 2 ? new LinearGradient(f7, f8, f9, f10, a7.f21577a, a7.f21578b, d(g8)) : new SweepGradient(f11, f12, a7.f21577a, a7.f21578b);
        }
        if (f13 > 0.0f) {
            return new RadialGradient(f11, f12, f13, a7.f21577a, a7.f21578b, d(g8));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static z.f.a c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = v.d.f20079N
            android.content.res.TypedArray r3 = z.k.k(r8, r11, r10, r3)
            int r5 = v.d.f20080O
            boolean r5 = r3.hasValue(r5)
            int r6 = v.d.f20081P
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = v.d.f20080O
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = v.d.f20081P
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            z.f$a r8 = new z.f$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):z.f$a");
    }

    public static Shader.TileMode d(int i7) {
        return i7 != 1 ? i7 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }
}
