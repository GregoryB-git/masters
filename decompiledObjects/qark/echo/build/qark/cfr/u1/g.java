/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.ColorFilter
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Path$FillType
 *  android.graphics.PathMeasure
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.Shader
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.graphics.drawable.VectorDrawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.Xml
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayDeque
 *  java.util.ArrayList
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package u1;

import A.g;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import u1.a;
import z.k;

public class g
extends u1.f {
    public static final PorterDuff.Mode y = PorterDuff.Mode.SRC_IN;
    public h p;
    public PorterDuffColorFilter q;
    public ColorFilter r;
    public boolean s;
    public boolean t = true;
    public Drawable.ConstantState u;
    public final float[] v = new float[9];
    public final Matrix w = new Matrix();
    public final Rect x = new Rect();

    public g() {
        this.p = new h();
    }

    public g(h h8) {
        this.p = h8;
        this.q = this.j(this.q, h8.c, h8.d);
    }

    public static int a(int n8, float f8) {
        return n8 & 16777215 | (int)((float)Color.alpha((int)n8) * f8) << 24;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static g b(Resources resources, int n8, Resources.Theme theme) {
        void var0_1;
        if (Build.VERSION.SDK_INT >= 24) {
            g g8 = new g();
            g8.o = z.h.a(resources, n8, theme);
            g8.u = new i(g8.o.getConstantState());
            return g8;
        }
        try {
            XmlResourceParser xmlResourceParser = resources.getXml(n8);
            AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
            while ((n8 = xmlResourceParser.next()) != 2 && n8 != 1) {
            }
            if (n8 == 2) {
                return g.c(resources, (XmlPullParser)xmlResourceParser, attributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        }
        catch (IOException iOException) {
        }
        catch (XmlPullParserException xmlPullParserException) {}
        Log.e((String)"VectorDrawableCompat", (String)"parser error", (Throwable)var0_1);
        return null;
    }

    public static g c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        g g8 = new g();
        g8.inflate(resources, xmlPullParser, attributeSet, theme);
        return g8;
    }

    public static PorterDuff.Mode g(int n8, PorterDuff.Mode mode) {
        if (n8 != 3) {
            if (n8 != 5) {
                if (n8 != 9) {
                    switch (n8) {
                        default: {
                            return mode;
                        }
                        case 16: {
                            return PorterDuff.Mode.ADD;
                        }
                        case 15: {
                            return PorterDuff.Mode.SCREEN;
                        }
                        case 14: 
                    }
                    return PorterDuff.Mode.MULTIPLY;
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public boolean canApplyTheme() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            B.a.b(drawable2);
        }
        return false;
    }

    public Object d(String string2) {
        return this.p.b.p.get(string2);
    }

    public void draw(Canvas canvas) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.draw(canvas);
            return;
        }
        this.copyBounds(this.x);
        if (this.x.width() > 0) {
            if (this.x.height() <= 0) {
                return;
            }
            ColorFilter colorFilter = this.r;
            drawable2 = colorFilter;
            if (colorFilter == null) {
                drawable2 = this.q;
            }
            canvas.getMatrix(this.w);
            this.w.getValues(this.v);
            float f8 = Math.abs((float)this.v[0]);
            float f9 = Math.abs((float)this.v[4]);
            float f10 = Math.abs((float)this.v[1]);
            float f11 = Math.abs((float)this.v[3]);
            if (f10 != 0.0f || f11 != 0.0f) {
                f9 = f8 = 1.0f;
            }
            int n8 = (int)((float)this.x.width() * f8);
            int n9 = (int)((float)this.x.height() * f9);
            n8 = Math.min((int)2048, (int)n8);
            n9 = Math.min((int)2048, (int)n9);
            if (n8 > 0) {
                if (n9 <= 0) {
                    return;
                }
                int n10 = canvas.save();
                colorFilter = this.x;
                canvas.translate((float)colorFilter.left, (float)colorFilter.top);
                if (this.f()) {
                    canvas.translate((float)this.x.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.x.offsetTo(0, 0);
                this.p.c(n8, n9);
                if (!this.t) {
                    this.p.j(n8, n9);
                } else if (!this.p.b()) {
                    this.p.j(n8, n9);
                    this.p.i();
                }
                this.p.d(canvas, (ColorFilter)drawable2, this.x);
                canvas.restoreToCount(n10);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h h8 = this.p;
        g g8 = h8.b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push((Object)g8.h);
        int n8 = xmlPullParser.getEventType();
        int n9 = xmlPullParser.getDepth();
        int n10 = 1;
        while (n8 != 1 && (xmlPullParser.getDepth() >= n9 + 1 || n8 != 3)) {
            int n11;
            block11 : {
                block9 : {
                    block13 : {
                        Object object;
                        block12 : {
                            block10 : {
                                if (n8 != 2) break block9;
                                object = xmlPullParser.getName();
                                d d8 = (d)arrayDeque.peek();
                                if (!"path".equals(object)) break block10;
                                object = new c();
                                object.g(resources, attributeSet, theme, xmlPullParser);
                                d8.b.add(object);
                                if (object.getPathName() != null) {
                                    g8.p.put(object.getPathName(), object);
                                }
                                n10 = h8.a;
                                h8.a = object.d | n10;
                                n11 = 0;
                                break block11;
                            }
                            if (!"clip-path".equals(object)) break block12;
                            object = new b();
                            object.e(resources, attributeSet, theme, xmlPullParser);
                            d8.b.add(object);
                            if (object.getPathName() != null) {
                                g8.p.put(object.getPathName(), object);
                            }
                            n8 = h8.a;
                            n11 = object.d;
                            break block13;
                        }
                        n11 = n10;
                        if (!"group".equals(object)) break block11;
                        object = new d();
                        object.c(resources, attributeSet, theme, xmlPullParser);
                        d8.b.add(object);
                        arrayDeque.push(object);
                        if (object.getGroupName() != null) {
                            g8.p.put(object.getGroupName(), object);
                        }
                        n8 = h8.a;
                        n11 = object.k;
                    }
                    h8.a = n11 | n8;
                    n11 = n10;
                    break block11;
                }
                n11 = n10;
                if (n8 == 3) {
                    n11 = n10;
                    if ("group".equals((Object)xmlPullParser.getName())) {
                        arrayDeque.pop();
                        n11 = n10;
                    }
                }
            }
            n8 = xmlPullParser.next();
            n10 = n11;
        }
        if (n10 == 0) {
            return;
        }
        throw new XmlPullParserException("no path defined");
    }

    public final boolean f() {
        if (this.isAutoMirrored() && B.a.e(this) == 1) {
            return true;
        }
        return false;
    }

    public int getAlpha() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return B.a.c(drawable2);
        }
        return this.p.b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.getChangingConfigurations();
        }
        return Drawable.super.getChangingConfigurations() | this.p.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return B.a.d(drawable2);
        }
        return this.r;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.o != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.o.getConstantState());
        }
        this.p.a = this.getChangingConfigurations();
        return this.p;
    }

    public int getIntrinsicHeight() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.getIntrinsicHeight();
        }
        return (int)this.p.b.j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.getIntrinsicWidth();
        }
        return (int)this.p.b.i;
    }

    public int getOpacity() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -3;
    }

    public void h(boolean bl) {
        this.t = bl;
    }

    public final void i(TypedArray object, XmlPullParser xmlPullParser, Resources.Theme theme) {
        float f8;
        h h8 = this.p;
        g g8 = h8.b;
        h8.d = g.g(k.g((TypedArray)object, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        if ((theme = k.c((TypedArray)object, xmlPullParser, theme, "tint", 1)) != null) {
            h8.c = theme;
        }
        h8.e = k.a((TypedArray)object, xmlPullParser, "autoMirrored", 5, h8.e);
        g8.k = k.f((TypedArray)object, xmlPullParser, "viewportWidth", 7, g8.k);
        g8.l = f8 = k.f((TypedArray)object, xmlPullParser, "viewportHeight", 8, g8.l);
        if (g8.k > 0.0f) {
            if (f8 > 0.0f) {
                g8.i = object.getDimension(3, g8.i);
                g8.j = f8 = object.getDimension(2, g8.j);
                if (g8.i > 0.0f) {
                    if (f8 > 0.0f) {
                        g8.setAlpha(k.f((TypedArray)object, xmlPullParser, "alpha", 4, g8.getAlpha()));
                        object = object.getString(0);
                        if (object != null) {
                            g8.n = object;
                            g8.p.put(object, g8);
                        }
                        return;
                    }
                    xmlPullParser = new StringBuilder();
                    xmlPullParser.append(object.getPositionDescription());
                    xmlPullParser.append("<vector> tag requires height > 0");
                    throw new XmlPullParserException(xmlPullParser.toString());
                }
                xmlPullParser = new StringBuilder();
                xmlPullParser.append(object.getPositionDescription());
                xmlPullParser.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(xmlPullParser.toString());
            }
            xmlPullParser = new StringBuilder();
            xmlPullParser.append(object.getPositionDescription());
            xmlPullParser.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(xmlPullParser.toString());
        }
        xmlPullParser = new StringBuilder();
        xmlPullParser.append(object.getPositionDescription());
        xmlPullParser.append("<vector> tag requires viewportWidth > 0");
        throw new XmlPullParserException(xmlPullParser.toString());
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.inflate(resources, xmlPullParser, attributeSet);
            return;
        }
        this.inflate(resources, xmlPullParser, attributeSet, null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Object object = this.o;
        if (object != null) {
            B.a.f((Drawable)object, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        object = this.p;
        object.b = new g();
        TypedArray typedArray = k.k(resources, theme, attributeSet, a.a);
        this.i(typedArray, xmlPullParser, theme);
        typedArray.recycle();
        object.a = this.getChangingConfigurations();
        object.k = true;
        this.e(resources, xmlPullParser, attributeSet, theme);
        this.q = this.j(this.q, object.c, object.d);
    }

    public void invalidateSelf() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.invalidateSelf();
            return;
        }
        Drawable.super.invalidateSelf();
    }

    public boolean isAutoMirrored() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return B.a.g(drawable2);
        }
        return this.p.e;
    }

    public boolean isStateful() {
        Object object = this.o;
        if (object != null) {
            return object.isStateful();
        }
        if (!(Drawable.super.isStateful() || (object = this.p) != null && (object.g() || (object = this.p.c) != null && object.isStateful()))) {
            return false;
        }
        return true;
    }

    public PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(this.getState(), 0), mode);
        }
        return null;
    }

    public Drawable mutate() {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.mutate();
            return this;
        }
        if (!this.s && Drawable.super.mutate() == this) {
            this.p = new h(this.p);
            this.s = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] arrn) {
        boolean bl;
        PorterDuff.Mode mode;
        Object object = this.o;
        if (object != null) {
            return object.setState(arrn);
        }
        object = this.p;
        ColorStateList colorStateList = object.c;
        if (colorStateList != null && (mode = object.d) != null) {
            this.q = this.j(this.q, colorStateList, mode);
            this.invalidateSelf();
            bl = true;
        } else {
            bl = false;
        }
        if (object.g() && object.h(arrn)) {
            this.invalidateSelf();
            return true;
        }
        return bl;
    }

    public void scheduleSelf(Runnable runnable, long l8) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.scheduleSelf(runnable, l8);
            return;
        }
        Drawable.super.scheduleSelf(runnable, l8);
    }

    public void setAlpha(int n8) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.setAlpha(n8);
            return;
        }
        if (this.p.b.getRootAlpha() != n8) {
            this.p.b.setRootAlpha(n8);
            this.invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean bl) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            B.a.i(drawable2, bl);
            return;
        }
        this.p.e = bl;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
            return;
        }
        this.r = colorFilter;
        this.invalidateSelf();
    }

    public void setTint(int n8) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            B.a.l(drawable2, n8);
            return;
        }
        this.setTintList(ColorStateList.valueOf((int)n8));
    }

    public void setTintList(ColorStateList colorStateList) {
        Object object = this.o;
        if (object != null) {
            B.a.m((Drawable)object, colorStateList);
            return;
        }
        object = this.p;
        if (object.c != colorStateList) {
            object.c = colorStateList;
            this.q = this.j(this.q, colorStateList, object.d);
            this.invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Object object = this.o;
        if (object != null) {
            B.a.n((Drawable)object, mode);
            return;
        }
        object = this.p;
        if (object.d != mode) {
            object.d = mode;
            this.q = this.j(this.q, object.c, mode);
            this.invalidateSelf();
        }
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            return drawable2.setVisible(bl, bl2);
        }
        return Drawable.super.setVisible(bl, bl2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.unscheduleSelf(runnable);
            return;
        }
        Drawable.super.unscheduleSelf(runnable);
    }

    public static class b
    extends f {
        public b() {
        }

        public b(b b8) {
            super(b8);
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string2 = typedArray.getString(0);
            if (string2 != null) {
                this.b = string2;
            }
            if ((string2 = typedArray.getString(1)) != null) {
                this.a = A.g.d(string2);
            }
            this.c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (!k.j(xmlPullParser, "pathData")) {
                return;
            }
            resources = k.k(resources, theme, attributeSet, a.d);
            this.f((TypedArray)resources, xmlPullParser);
            resources.recycle();
        }
    }

    public static class c
    extends f {
        public int[] e;
        public z.d f;
        public float g = 0.0f;
        public z.d h;
        public float i = 1.0f;
        public float j = 1.0f;
        public float k = 0.0f;
        public float l = 1.0f;
        public float m = 0.0f;
        public Paint.Cap n = Paint.Cap.BUTT;
        public Paint.Join o = Paint.Join.MITER;
        public float p = 4.0f;

        public c() {
        }

        public c(c c8) {
            super(c8);
            this.e = c8.e;
            this.f = c8.f;
            this.g = c8.g;
            this.i = c8.i;
            this.h = c8.h;
            this.c = c8.c;
            this.j = c8.j;
            this.k = c8.k;
            this.l = c8.l;
            this.m = c8.m;
            this.n = c8.n;
            this.o = c8.o;
            this.p = c8.p;
        }

        @Override
        public boolean a() {
            if (!this.h.i() && !this.f.i()) {
                return false;
            }
            return true;
        }

        @Override
        public boolean b(int[] arrn) {
            boolean bl = this.h.j(arrn);
            return this.f.j(arrn) | bl;
        }

        public final Paint.Cap e(int n8, Paint.Cap cap) {
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        return cap;
                    }
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        public final Paint.Join f(int n8, Paint.Join join) {
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        return join;
                    }
                    return Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            resources = k.k(resources, theme, attributeSet, a.c);
            this.h((TypedArray)resources, xmlPullParser, theme);
            resources.recycle();
        }

        public float getFillAlpha() {
            return this.j;
        }

        public int getFillColor() {
            return this.h.e();
        }

        public float getStrokeAlpha() {
            return this.i;
        }

        public int getStrokeColor() {
            return this.f.e();
        }

        public float getStrokeWidth() {
            return this.g;
        }

        public float getTrimPathEnd() {
            return this.l;
        }

        public float getTrimPathOffset() {
            return this.m;
        }

        public float getTrimPathStart() {
            return this.k;
        }

        public final void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.e = null;
            if (!k.j(xmlPullParser, "pathData")) {
                return;
            }
            String string2 = typedArray.getString(0);
            if (string2 != null) {
                this.b = string2;
            }
            if ((string2 = typedArray.getString(2)) != null) {
                this.a = A.g.d(string2);
            }
            this.h = k.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
            this.j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.j);
            this.n = this.e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
            this.o = this.f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
            this.p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
            this.f = k.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
            this.i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.i);
            this.g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.g);
            this.l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.l);
            this.m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.m);
            this.k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.k);
            this.c = k.g(typedArray, xmlPullParser, "fillType", 13, this.c);
        }

        public void setFillAlpha(float f8) {
            this.j = f8;
        }

        public void setFillColor(int n8) {
            this.h.k(n8);
        }

        public void setStrokeAlpha(float f8) {
            this.i = f8;
        }

        public void setStrokeColor(int n8) {
            this.f.k(n8);
        }

        public void setStrokeWidth(float f8) {
            this.g = f8;
        }

        public void setTrimPathEnd(float f8) {
            this.l = f8;
        }

        public void setTrimPathOffset(float f8) {
            this.m = f8;
        }

        public void setTrimPathStart(float f8) {
            this.k = f8;
        }
    }

    public static class d
    extends e {
        public final Matrix a = new Matrix();
        public final ArrayList b = new ArrayList();
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 0.0f;
        public float f = 1.0f;
        public float g = 1.0f;
        public float h = 0.0f;
        public float i = 0.0f;
        public final Matrix j;
        public int k;
        public int[] l;
        public String m;

        public d() {
            super(null);
            this.j = new Matrix();
            this.m = null;
        }

        public d(d object, t.a a8) {
            Matrix matrix;
            String string2;
            super(null);
            this.j = matrix = new Matrix();
            this.m = null;
            this.c = object.c;
            this.d = object.d;
            this.e = object.e;
            this.f = object.f;
            this.g = object.g;
            this.h = object.h;
            this.i = object.i;
            this.l = object.l;
            this.m = string2 = object.m;
            this.k = object.k;
            if (string2 != null) {
                a8.put(string2, this);
            }
            matrix.set(object.j);
            matrix = object.b;
            for (int i8 = 0; i8 < matrix.size(); ++i8) {
                block8 : {
                    block7 : {
                        block6 : {
                            object = matrix.get(i8);
                            if (object instanceof d) {
                                object = (d)object;
                                this.b.add((Object)new d((d)object, a8));
                                continue;
                            }
                            if (!(object instanceof c)) break block6;
                            object = new c((c)object);
                            break block7;
                        }
                        if (!(object instanceof b)) break block8;
                        object = new b((b)object);
                    }
                    this.b.add(object);
                    string2 = object.b;
                    if (string2 == null) continue;
                    a8.put(string2, object);
                    continue;
                }
                throw new IllegalStateException("Unknown object in the tree!");
            }
        }

        @Override
        public boolean a() {
            for (int i8 = 0; i8 < this.b.size(); ++i8) {
                if (!((e)this.b.get(i8)).a()) continue;
                return true;
            }
            return false;
        }

        @Override
        public boolean b(int[] arrn) {
            boolean bl = false;
            for (int i8 = 0; i8 < this.b.size(); ++i8) {
                bl |= ((e)this.b.get(i8)).b(arrn);
            }
            return bl;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            resources = k.k(resources, theme, attributeSet, a.b);
            this.e((TypedArray)resources, xmlPullParser);
            resources.recycle();
        }

        public final void d() {
            this.j.reset();
            this.j.postTranslate(- this.d, - this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        public final void e(TypedArray object, XmlPullParser xmlPullParser) {
            this.l = null;
            this.c = k.f((TypedArray)object, xmlPullParser, "rotation", 5, this.c);
            this.d = object.getFloat(1, this.d);
            this.e = object.getFloat(2, this.e);
            this.f = k.f((TypedArray)object, xmlPullParser, "scaleX", 3, this.f);
            this.g = k.f((TypedArray)object, xmlPullParser, "scaleY", 4, this.g);
            this.h = k.f((TypedArray)object, xmlPullParser, "translateX", 6, this.h);
            this.i = k.f((TypedArray)object, xmlPullParser, "translateY", 7, this.i);
            if ((object = object.getString(0)) != null) {
                this.m = object;
            }
            this.d();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f8) {
            if (f8 != this.d) {
                this.d = f8;
                this.d();
            }
        }

        public void setPivotY(float f8) {
            if (f8 != this.e) {
                this.e = f8;
                this.d();
            }
        }

        public void setRotation(float f8) {
            if (f8 != this.c) {
                this.c = f8;
                this.d();
            }
        }

        public void setScaleX(float f8) {
            if (f8 != this.f) {
                this.f = f8;
                this.d();
            }
        }

        public void setScaleY(float f8) {
            if (f8 != this.g) {
                this.g = f8;
                this.d();
            }
        }

        public void setTranslateX(float f8) {
            if (f8 != this.h) {
                this.h = f8;
                this.d();
            }
        }

        public void setTranslateY(float f8) {
            if (f8 != this.i) {
                this.i = f8;
                this.d();
            }
        }
    }

    public static abstract class e {
        public e() {
        }

        public /* synthetic */ e( a8) {
            this();
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] arrn) {
            return false;
        }
    }

    public static abstract class f
    extends e {
        public g.b[] a = null;
        public String b;
        public int c = 0;
        public int d;

        public f() {
            super(null);
        }

        public f(f f8) {
            super(null);
            this.b = f8.b;
            this.d = f8.d;
            this.a = A.g.f(f8.a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            g.b[] arrb = this.a;
            if (arrb != null) {
                g.b.e(arrb, path);
            }
        }

        public g.b[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(g.b[] arrb) {
            if (!A.g.b(this.a, arrb)) {
                this.a = A.g.f(arrb);
                return;
            }
            A.g.j(this.a, arrb);
        }
    }

    public static class g {
        public static final Matrix q = new Matrix();
        public final Path a;
        public final Path b;
        public final Matrix c = new Matrix();
        public Paint d;
        public Paint e;
        public PathMeasure f;
        public int g;
        public final d h;
        public float i = 0.0f;
        public float j = 0.0f;
        public float k = 0.0f;
        public float l = 0.0f;
        public int m = 255;
        public String n = null;
        public Boolean o = null;
        public final t.a p;

        public g() {
            this.p = new t.a();
            this.h = new d();
            this.a = new Path();
            this.b = new Path();
        }

        public g(g g8) {
            t.a a8;
            this.p = a8 = new t.a();
            this.h = new d(g8.h, a8);
            this.a = new Path(g8.a);
            this.b = new Path(g8.b);
            this.i = g8.i;
            this.j = g8.j;
            this.k = g8.k;
            this.l = g8.l;
            this.g = g8.g;
            this.m = g8.m;
            this.n = g8.n;
            String string2 = g8.n;
            if (string2 != null) {
                a8.put(string2, this);
            }
            this.o = g8.o;
        }

        public static float a(float f8, float f9, float f10, float f11) {
            return f8 * f11 - f9 * f10;
        }

        public void b(Canvas canvas, int n8, int n9, ColorFilter colorFilter) {
            this.c(this.h, q, canvas, n8, n9, colorFilter);
        }

        public final void c(d d8, Matrix object, Canvas canvas, int n8, int n9, ColorFilter colorFilter) {
            d8.a.set((Matrix)object);
            d8.a.preConcat(d8.j);
            canvas.save();
            for (int i8 = 0; i8 < d8.b.size(); ++i8) {
                object = (e)d8.b.get(i8);
                if (object instanceof d) {
                    this.c((d)object, d8.a, canvas, n8, n9, colorFilter);
                    continue;
                }
                if (!(object instanceof f)) continue;
                this.d(d8, (f)object, canvas, n8, n9, colorFilter);
            }
            canvas.restore();
        }

        public final void d(d object, f f8, Canvas canvas, int n8, int n9, ColorFilter colorFilter) {
            Paint.Join join;
            float f9 = (float)n8 / this.k;
            float f10 = (float)n9 / this.l;
            float f11 = Math.min((float)f9, (float)f10);
            object = object.a;
            this.c.set((Matrix)object);
            this.c.postScale(f9, f10);
            f9 = this.e((Matrix)object);
            if (f9 == 0.0f) {
                return;
            }
            f8.d(this.a);
            Path path = this.a;
            this.b.reset();
            if (f8.c()) {
                colorFilter = this.b;
                object = f8.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                colorFilter.setFillType((Path.FillType)object);
                this.b.addPath(path, this.c);
                canvas.clipPath(this.b);
                return;
            }
            f8 = (c)f8;
            float f12 = f8.k;
            if (f12 != 0.0f || f8.l != 1.0f) {
                float f13 = f8.m;
                float f14 = f8.l;
                if (this.f == null) {
                    this.f = new PathMeasure();
                }
                this.f.setPath(this.a, false);
                f10 = this.f.getLength();
                f12 = (f12 + f13) % 1.0f * f10;
                f13 = (f14 + f13) % 1.0f * f10;
                path.reset();
                if (f12 > f13) {
                    this.f.getSegment(f12, f10, path, true);
                    this.f.getSegment(0.0f, f13, path, true);
                } else {
                    this.f.getSegment(f12, f13, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.b.addPath(path, this.c);
            if (f8.h.l()) {
                object = f8.h;
                if (this.e == null) {
                    path = new Paint(1);
                    this.e = path;
                    path.setStyle(Paint.Style.FILL);
                }
                path = this.e;
                if (object.h()) {
                    object = object.f();
                    object.setLocalMatrix(this.c);
                    path.setShader((Shader)object);
                    path.setAlpha(Math.round((float)(f8.j * 255.0f)));
                } else {
                    path.setShader(null);
                    path.setAlpha(255);
                    path.setColor(g.a(object.e(), f8.j));
                }
                path.setColorFilter(colorFilter);
                join = this.b;
                object = f8.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                join.setFillType((Path.FillType)object);
                canvas.drawPath(this.b, (Paint)path);
            }
            if (f8.f.l()) {
                object = f8.f;
                if (this.d == null) {
                    path = new Paint(1);
                    this.d = path;
                    path.setStyle(Paint.Style.STROKE);
                }
                path = this.d;
                join = f8.o;
                if (join != null) {
                    path.setStrokeJoin(join);
                }
                if ((join = f8.n) != null) {
                    path.setStrokeCap((Paint.Cap)join);
                }
                path.setStrokeMiter(f8.p);
                if (object.h()) {
                    object = object.f();
                    object.setLocalMatrix(this.c);
                    path.setShader((Shader)object);
                    path.setAlpha(Math.round((float)(f8.i * 255.0f)));
                } else {
                    path.setShader(null);
                    path.setAlpha(255);
                    path.setColor(g.a(object.e(), f8.i));
                }
                path.setColorFilter(colorFilter);
                path.setStrokeWidth(f8.g * (f11 * f9));
                canvas.drawPath(this.b, (Paint)path);
            }
        }

        public final float e(Matrix matrix) {
            float[] arrf;
            float f8 = 0.0f;
            float[] arrf2 = arrf = new float[4];
            arrf2[0] = 0.0f;
            arrf2[1] = 1.0f;
            arrf2[2] = 1.0f;
            arrf2[3] = 0.0f;
            matrix.mapVectors(arrf);
            float f9 = (float)Math.hypot((double)arrf[0], (double)arrf[1]);
            float f10 = (float)Math.hypot((double)arrf[2], (double)arrf[3]);
            float f11 = g.a(arrf[0], arrf[1], arrf[2], arrf[3]);
            f9 = Math.max((float)f9, (float)f10);
            if (f9 > 0.0f) {
                f8 = Math.abs((float)f11) / f9;
            }
            return f8;
        }

        public boolean f() {
            if (this.o == null) {
                this.o = this.h.a();
            }
            return this.o;
        }

        public boolean g(int[] arrn) {
            return this.h.b(arrn);
        }

        public float getAlpha() {
            return (float)this.getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f8) {
            this.setRootAlpha((int)(f8 * 255.0f));
        }

        public void setRootAlpha(int n8) {
            this.m = n8;
        }
    }

    public static class h
    extends Drawable.ConstantState {
        public int a;
        public g b;
        public ColorStateList c = null;
        public PorterDuff.Mode d = g.y;
        public boolean e;
        public Bitmap f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public int i;
        public boolean j;
        public boolean k;
        public Paint l;

        public h() {
            this.b = new g();
        }

        public h(h h8) {
            if (h8 != null) {
                g g8;
                this.a = h8.a;
                this.b = g8 = new g(h8.b);
                if (h8.b.e != null) {
                    g8.e = new Paint(h8.b.e);
                }
                if (h8.b.d != null) {
                    this.b.d = new Paint(h8.b.d);
                }
                this.c = h8.c;
                this.d = h8.d;
                this.e = h8.e;
            }
        }

        public boolean a(int n8, int n9) {
            if (n8 == this.f.getWidth() && n9 == this.f.getHeight()) {
                return true;
            }
            return false;
        }

        public boolean b() {
            if (!this.k && this.g == this.c && this.h == this.d && this.j == this.e && this.i == this.b.getRootAlpha()) {
                return true;
            }
            return false;
        }

        public void c(int n8, int n9) {
            if (this.f == null || !this.a(n8, n9)) {
                this.f = Bitmap.createBitmap((int)n8, (int)n9, (Bitmap.Config)Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            colorFilter = this.e(colorFilter);
            canvas.drawBitmap(this.f, null, rect, (Paint)colorFilter);
        }

        public Paint e(ColorFilter colorFilter) {
            if (!this.f() && colorFilter == null) {
                return null;
            }
            if (this.l == null) {
                Paint paint;
                this.l = paint = new Paint();
                paint.setFilterBitmap(true);
            }
            this.l.setAlpha(this.b.getRootAlpha());
            this.l.setColorFilter(colorFilter);
            return this.l;
        }

        public boolean f() {
            if (this.b.getRootAlpha() < 255) {
                return true;
            }
            return false;
        }

        public boolean g() {
            return this.b.f();
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public boolean h(int[] arrn) {
            boolean bl = this.b.g(arrn);
            this.k |= bl;
            return bl;
        }

        public void i() {
            this.g = this.c;
            this.h = this.d;
            this.i = this.b.getRootAlpha();
            this.j = this.e;
            this.k = false;
        }

        public void j(int n8, int n9) {
            this.f.eraseColor(0);
            Canvas canvas = new Canvas(this.f);
            this.b.b(canvas, n8, n9, null);
        }

        public Drawable newDrawable() {
            return new g(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new g(this);
        }
    }

    public static class i
    extends Drawable.ConstantState {
        public final Drawable.ConstantState a;

        public i(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            g g8 = new g();
            g8.o = (VectorDrawable)this.a.newDrawable();
            return g8;
        }

        public Drawable newDrawable(Resources resources) {
            g g8 = new g();
            g8.o = (VectorDrawable)this.a.newDrawable(resources);
            return g8;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g g8 = new g();
            g8.o = (VectorDrawable)this.a.newDrawable(resources, theme);
            return g8;
        }
    }

}

