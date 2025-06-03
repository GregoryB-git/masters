// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u1;

import android.graphics.drawable.VectorDrawable;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.Paint$Style;
import android.graphics.Path$FillType;
import android.graphics.PathMeasure;
import android.graphics.Paint;
import android.graphics.Path;
import java.util.ArrayList;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import z.d;
import android.content.res.ColorStateList;
import z.k;
import android.content.res.TypedArray;
import android.graphics.Region;
import java.util.ArrayDeque;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import B.a;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import android.util.Log;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import z.h;
import android.os.Build$VERSION;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;

public class g extends u1.f
{
    public static final PorterDuff$Mode y;
    public h p;
    public PorterDuffColorFilter q;
    public ColorFilter r;
    public boolean s;
    public boolean t;
    public Drawable$ConstantState u;
    public final float[] v;
    public final Matrix w;
    public final Rect x;
    
    static {
        y = PorterDuff$Mode.SRC_IN;
    }
    
    public g() {
        this.t = true;
        this.v = new float[9];
        this.w = new Matrix();
        this.x = new Rect();
        this.p = new h();
    }
    
    public g(final h p) {
        this.t = true;
        this.v = new float[9];
        this.w = new Matrix();
        this.x = new Rect();
        this.p = p;
        this.q = this.j(this.q, p.c, p.d);
    }
    
    public static int a(final int n, final float n2) {
        return (n & 0xFFFFFF) | (int)(Color.alpha(n) * n2) << 24;
    }
    
    public static g b(final Resources resources, int next, final Resources$Theme resources$Theme) {
        if (Build$VERSION.SDK_INT >= 24) {
            final g g = new g();
            g.o = z.h.a(resources, next, resources$Theme);
            g.u = new i(g.o.getConstantState());
            return g;
        }
        while (true) {
            try {
                final XmlResourceParser xml = resources.getXml(next);
                final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xml);
                do {
                    next = ((XmlPullParser)xml).next();
                } while (next != 2 && next != 1);
                if (next == 2) {
                    return c(resources, (XmlPullParser)xml, attributeSet, resources$Theme);
                }
                throw new XmlPullParserException("No start tag found");
                final IOException ex;
                Log.e("VectorDrawableCompat", "parser error", (Throwable)ex);
                return null;
            }
            catch (IOException ex) {
                continue;
            }
            catch (XmlPullParserException ex) {
                continue;
            }
            break;
        }
    }
    
    public static g c(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final g g = new g();
        g.inflate(resources, xmlPullParser, set, resources$Theme);
        return g;
    }
    
    public static PorterDuff$Mode g(final int n, final PorterDuff$Mode porterDuff$Mode) {
        if (n == 3) {
            return PorterDuff$Mode.SRC_OVER;
        }
        if (n == 5) {
            return PorterDuff$Mode.SRC_IN;
        }
        if (n == 9) {
            return PorterDuff$Mode.SRC_ATOP;
        }
        switch (n) {
            default: {
                return porterDuff$Mode;
            }
            case 16: {
                return PorterDuff$Mode.ADD;
            }
            case 15: {
                return PorterDuff$Mode.SCREEN;
            }
            case 14: {
                return PorterDuff$Mode.MULTIPLY;
            }
        }
    }
    
    public boolean canApplyTheme() {
        final Drawable o = super.o;
        if (o != null) {
            a.b(o);
        }
        return false;
    }
    
    public Object d(final String s) {
        return this.p.b.p.get(s);
    }
    
    public void draw(final Canvas canvas) {
        final Drawable o = super.o;
        if (o != null) {
            o.draw(canvas);
            return;
        }
        this.copyBounds(this.x);
        if (this.x.width() > 0) {
            if (this.x.height() <= 0) {
                return;
            }
            Object o2;
            if ((o2 = this.r) == null) {
                o2 = this.q;
            }
            canvas.getMatrix(this.w);
            this.w.getValues(this.v);
            float abs = Math.abs(this.v[0]);
            float abs2 = Math.abs(this.v[4]);
            final float abs3 = Math.abs(this.v[1]);
            final float abs4 = Math.abs(this.v[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = (abs2 = 1.0f);
            }
            final int b = (int)(this.x.width() * abs);
            final int b2 = (int)(this.x.height() * abs2);
            final int min = Math.min(2048, b);
            final int min2 = Math.min(2048, b2);
            if (min > 0) {
                if (min2 <= 0) {
                    return;
                }
                final int save = canvas.save();
                final Rect x = this.x;
                canvas.translate((float)x.left, (float)x.top);
                if (this.f()) {
                    canvas.translate((float)this.x.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.x.offsetTo(0, 0);
                this.p.c(min, min2);
                if (!this.t) {
                    this.p.j(min, min2);
                }
                else if (!this.p.b()) {
                    this.p.j(min, min2);
                    this.p.i();
                }
                this.p.d(canvas, (ColorFilter)o2, this.x);
                canvas.restoreToCount(save);
            }
        }
    }
    
    public final void e(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final h p4 = this.p;
        final g b = p4.b;
        final ArrayDeque<d> arrayDeque = new ArrayDeque<d>();
        arrayDeque.push(b.h);
        int n = xmlPullParser.getEventType();
        final int depth = xmlPullParser.getDepth();
        int n2 = 1;
        while (n != 1 && (xmlPullParser.getDepth() >= depth + 1 || n != 3)) {
            int n3 = 0;
            Label_0419: {
                if (n == 2) {
                    final String name = xmlPullParser.getName();
                    final d d = arrayDeque.peek();
                    if ("path".equals(name)) {
                        final c e = new c();
                        e.g(resources, set, resources$Theme, xmlPullParser);
                        d.b.add(e);
                        if (((f)e).getPathName() != null) {
                            b.p.put(((f)e).getPathName(), e);
                        }
                        p4.a |= ((f)e).d;
                        n3 = 0;
                    }
                    else {
                        int n4;
                        int n5;
                        if ("clip-path".equals(name)) {
                            final b e2 = new b();
                            e2.e(resources, set, resources$Theme, xmlPullParser);
                            d.b.add(e2);
                            if (((f)e2).getPathName() != null) {
                                b.p.put(((f)e2).getPathName(), e2);
                            }
                            n4 = p4.a;
                            n5 = ((f)e2).d;
                        }
                        else {
                            n3 = n2;
                            if (!"group".equals(name)) {
                                break Label_0419;
                            }
                            final d d2 = new d();
                            d2.c(resources, set, resources$Theme, xmlPullParser);
                            d.b.add(d2);
                            arrayDeque.push(d2);
                            if (d2.getGroupName() != null) {
                                b.p.put(d2.getGroupName(), d2);
                            }
                            n4 = p4.a;
                            n5 = d2.k;
                        }
                        p4.a = (n5 | n4);
                        n3 = n2;
                    }
                }
                else {
                    n3 = n2;
                    if (n == 3) {
                        n3 = n2;
                        if ("group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                            n3 = n2;
                        }
                    }
                }
            }
            n = xmlPullParser.next();
            n2 = n3;
        }
        if (n2 == 0) {
            return;
        }
        throw new XmlPullParserException("no path defined");
    }
    
    public final boolean f() {
        return this.isAutoMirrored() && a.e(this) == 1;
    }
    
    public int getAlpha() {
        final Drawable o = super.o;
        if (o != null) {
            return a.c(o);
        }
        return this.p.b.getRootAlpha();
    }
    
    public int getChangingConfigurations() {
        final Drawable o = super.o;
        if (o != null) {
            return o.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.p.getChangingConfigurations();
    }
    
    public ColorFilter getColorFilter() {
        final Drawable o = super.o;
        if (o != null) {
            return a.d(o);
        }
        return this.r;
    }
    
    public Drawable$ConstantState getConstantState() {
        if (super.o != null && Build$VERSION.SDK_INT >= 24) {
            return new i(super.o.getConstantState());
        }
        this.p.a = this.getChangingConfigurations();
        return this.p;
    }
    
    public int getIntrinsicHeight() {
        final Drawable o = super.o;
        if (o != null) {
            return o.getIntrinsicHeight();
        }
        return (int)this.p.b.j;
    }
    
    public int getIntrinsicWidth() {
        final Drawable o = super.o;
        if (o != null) {
            return o.getIntrinsicWidth();
        }
        return (int)this.p.b.i;
    }
    
    public int getOpacity() {
        final Drawable o = super.o;
        if (o != null) {
            return o.getOpacity();
        }
        return -3;
    }
    
    public void h(final boolean t) {
        this.t = t;
    }
    
    public final void i(final TypedArray typedArray, final XmlPullParser xmlPullParser, final Resources$Theme resources$Theme) {
        final h p3 = this.p;
        final g b = p3.b;
        p3.d = g(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff$Mode.SRC_IN);
        final ColorStateList c = k.c(typedArray, xmlPullParser, resources$Theme, "tint", 1);
        if (c != null) {
            p3.c = c;
        }
        p3.e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, p3.e);
        b.k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, b.k);
        final float f = k.f(typedArray, xmlPullParser, "viewportHeight", 8, b.l);
        b.l = f;
        if (b.k <= 0.0f) {
            final StringBuilder sb = new StringBuilder();
            sb.append(typedArray.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        }
        if (f <= 0.0f) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(typedArray.getPositionDescription());
            sb2.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb2.toString());
        }
        b.i = typedArray.getDimension(3, b.i);
        final float dimension = typedArray.getDimension(2, b.j);
        b.j = dimension;
        if (b.i <= 0.0f) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(typedArray.getPositionDescription());
            sb3.append("<vector> tag requires width > 0");
            throw new XmlPullParserException(sb3.toString());
        }
        if (dimension > 0.0f) {
            b.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, b.getAlpha()));
            final String string = typedArray.getString(0);
            if (string != null) {
                b.n = string;
                b.p.put(string, b);
            }
            return;
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append(typedArray.getPositionDescription());
        sb4.append("<vector> tag requires height > 0");
        throw new XmlPullParserException(sb4.toString());
    }
    
    public void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set) {
        final Drawable o = super.o;
        if (o != null) {
            o.inflate(resources, xmlPullParser, set);
            return;
        }
        this.inflate(resources, xmlPullParser, set, null);
    }
    
    public void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final Drawable o = super.o;
        if (o != null) {
            a.f(o, resources, xmlPullParser, set, resources$Theme);
            return;
        }
        final h p4 = this.p;
        p4.b = new g();
        final TypedArray k = z.k.k(resources, resources$Theme, set, u1.a.a);
        this.i(k, xmlPullParser, resources$Theme);
        k.recycle();
        p4.a = this.getChangingConfigurations();
        p4.k = true;
        this.e(resources, xmlPullParser, set, resources$Theme);
        this.q = this.j(this.q, p4.c, p4.d);
    }
    
    public void invalidateSelf() {
        final Drawable o = super.o;
        if (o != null) {
            o.invalidateSelf();
            return;
        }
        super.invalidateSelf();
    }
    
    public boolean isAutoMirrored() {
        final Drawable o = super.o;
        if (o != null) {
            return a.g(o);
        }
        return this.p.e;
    }
    
    public boolean isStateful() {
        final Drawable o = super.o;
        if (o != null) {
            return o.isStateful();
        }
        if (!super.isStateful()) {
            final h p = this.p;
            if (p != null) {
                if (p.g()) {
                    return true;
                }
                final ColorStateList c = this.p.c;
                if (c != null && c.isStateful()) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public PorterDuffColorFilter j(final PorterDuffColorFilter porterDuffColorFilter, final ColorStateList list, final PorterDuff$Mode porterDuff$Mode) {
        if (list != null && porterDuff$Mode != null) {
            return new PorterDuffColorFilter(list.getColorForState(this.getState(), 0), porterDuff$Mode);
        }
        return null;
    }
    
    public Drawable mutate() {
        final Drawable o = super.o;
        if (o != null) {
            o.mutate();
            return this;
        }
        if (!this.s && super.mutate() == this) {
            this.p = new h(this.p);
            this.s = true;
        }
        return this;
    }
    
    public void onBoundsChange(final Rect bounds) {
        final Drawable o = super.o;
        if (o != null) {
            o.setBounds(bounds);
        }
    }
    
    public boolean onStateChange(final int[] state) {
        final Drawable o = super.o;
        if (o != null) {
            return o.setState(state);
        }
        final h p = this.p;
        final ColorStateList c = p.c;
        boolean b = false;
        Label_0069: {
            if (c != null) {
                final PorterDuff$Mode d = p.d;
                if (d != null) {
                    this.q = this.j(this.q, c, d);
                    this.invalidateSelf();
                    b = true;
                    break Label_0069;
                }
            }
            b = false;
        }
        if (p.g() && p.h(state)) {
            this.invalidateSelf();
            return true;
        }
        return b;
    }
    
    public void scheduleSelf(final Runnable runnable, final long n) {
        final Drawable o = super.o;
        if (o != null) {
            o.scheduleSelf(runnable, n);
            return;
        }
        super.scheduleSelf(runnable, n);
    }
    
    public void setAlpha(final int n) {
        final Drawable o = super.o;
        if (o != null) {
            o.setAlpha(n);
            return;
        }
        if (this.p.b.getRootAlpha() != n) {
            this.p.b.setRootAlpha(n);
            this.invalidateSelf();
        }
    }
    
    public void setAutoMirrored(final boolean e) {
        final Drawable o = super.o;
        if (o != null) {
            a.i(o, e);
            return;
        }
        this.p.e = e;
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        final Drawable o = super.o;
        if (o != null) {
            o.setColorFilter(colorFilter);
            return;
        }
        this.r = colorFilter;
        this.invalidateSelf();
    }
    
    public void setTint(final int n) {
        final Drawable o = super.o;
        if (o != null) {
            a.l(o, n);
            return;
        }
        this.setTintList(ColorStateList.valueOf(n));
    }
    
    public void setTintList(final ColorStateList c) {
        final Drawable o = super.o;
        if (o != null) {
            a.m(o, c);
            return;
        }
        final h p = this.p;
        if (p.c != c) {
            p.c = c;
            this.q = this.j(this.q, c, p.d);
            this.invalidateSelf();
        }
    }
    
    public void setTintMode(final PorterDuff$Mode d) {
        final Drawable o = super.o;
        if (o != null) {
            a.n(o, d);
            return;
        }
        final h p = this.p;
        if (p.d != d) {
            p.d = d;
            this.q = this.j(this.q, p.c, d);
            this.invalidateSelf();
        }
    }
    
    public boolean setVisible(final boolean b, final boolean b2) {
        final Drawable o = super.o;
        if (o != null) {
            return o.setVisible(b, b2);
        }
        return super.setVisible(b, b2);
    }
    
    public void unscheduleSelf(final Runnable runnable) {
        final Drawable o = super.o;
        if (o != null) {
            o.unscheduleSelf(runnable);
            return;
        }
        super.unscheduleSelf(runnable);
    }
    
    public static class b extends f
    {
        public b() {
        }
        
        public b(final b b) {
            super((f)b);
        }
        
        private void f(final TypedArray typedArray, final XmlPullParser xmlPullParser) {
            final String string = typedArray.getString(0);
            if (string != null) {
                super.b = string;
            }
            final String string2 = typedArray.getString(1);
            if (string2 != null) {
                super.a = g.d(string2);
            }
            super.c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }
        
        @Override
        public boolean c() {
            return true;
        }
        
        public void e(final Resources resources, final AttributeSet set, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser) {
            if (!k.j(xmlPullParser, "pathData")) {
                return;
            }
            final TypedArray k = z.k.k(resources, resources$Theme, set, u1.a.d);
            this.f(k, xmlPullParser);
            k.recycle();
        }
    }
    
    public static class c extends f
    {
        public int[] e;
        public z.d f;
        public float g;
        public z.d h;
        public float i;
        public float j;
        public float k;
        public float l;
        public float m;
        public Paint$Cap n;
        public Paint$Join o;
        public float p;
        
        public c() {
            this.g = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint$Cap.BUTT;
            this.o = Paint$Join.MITER;
            this.p = 4.0f;
        }
        
        public c(final c c) {
            super((f)c);
            this.g = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint$Cap.BUTT;
            this.o = Paint$Join.MITER;
            this.p = 4.0f;
            this.e = c.e;
            this.f = c.f;
            this.g = c.g;
            this.i = c.i;
            this.h = c.h;
            super.c = c.c;
            this.j = c.j;
            this.k = c.k;
            this.l = c.l;
            this.m = c.m;
            this.n = c.n;
            this.o = c.o;
            this.p = c.p;
        }
        
        @Override
        public boolean a() {
            return this.h.i() || this.f.i();
        }
        
        @Override
        public boolean b(final int[] array) {
            return this.f.j(array) | this.h.j(array);
        }
        
        public final Paint$Cap e(final int n, final Paint$Cap paint$Cap) {
            if (n == 0) {
                return Paint$Cap.BUTT;
            }
            if (n == 1) {
                return Paint$Cap.ROUND;
            }
            if (n != 2) {
                return paint$Cap;
            }
            return Paint$Cap.SQUARE;
        }
        
        public final Paint$Join f(final int n, final Paint$Join paint$Join) {
            if (n == 0) {
                return Paint$Join.MITER;
            }
            if (n == 1) {
                return Paint$Join.ROUND;
            }
            if (n != 2) {
                return paint$Join;
            }
            return Paint$Join.BEVEL;
        }
        
        public void g(final Resources resources, final AttributeSet set, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser) {
            final TypedArray k = z.k.k(resources, resources$Theme, set, u1.a.c);
            this.h(k, xmlPullParser, resources$Theme);
            k.recycle();
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
        
        public final void h(final TypedArray typedArray, final XmlPullParser xmlPullParser, final Resources$Theme resources$Theme) {
            this.e = null;
            if (!z.k.j(xmlPullParser, "pathData")) {
                return;
            }
            final String string = typedArray.getString(0);
            if (string != null) {
                super.b = string;
            }
            final String string2 = typedArray.getString(2);
            if (string2 != null) {
                super.a = A.g.d(string2);
            }
            this.h = z.k.e(typedArray, xmlPullParser, resources$Theme, "fillColor", 1, 0);
            this.j = z.k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.j);
            this.n = this.e(z.k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
            this.o = this.f(z.k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
            this.p = z.k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
            this.f = z.k.e(typedArray, xmlPullParser, resources$Theme, "strokeColor", 3, 0);
            this.i = z.k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.i);
            this.g = z.k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.g);
            this.l = z.k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.l);
            this.m = z.k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.m);
            this.k = z.k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.k);
            super.c = z.k.g(typedArray, xmlPullParser, "fillType", 13, super.c);
        }
        
        public void setFillAlpha(final float j) {
            this.j = j;
        }
        
        public void setFillColor(final int n) {
            this.h.k(n);
        }
        
        public void setStrokeAlpha(final float i) {
            this.i = i;
        }
        
        public void setStrokeColor(final int n) {
            this.f.k(n);
        }
        
        public void setStrokeWidth(final float g) {
            this.g = g;
        }
        
        public void setTrimPathEnd(final float l) {
            this.l = l;
        }
        
        public void setTrimPathOffset(final float m) {
            this.m = m;
        }
        
        public void setTrimPathStart(final float k) {
            this.k = k;
        }
    }
    
    public static class d extends e
    {
        public final Matrix a;
        public final ArrayList b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public final Matrix j;
        public int k;
        public int[] l;
        public String m;
        
        public d() {
            super(null);
            this.a = new Matrix();
            this.b = new ArrayList();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
        }
        
        public d(d d, final t.a a) {
            super(null);
            this.a = new Matrix();
            this.b = new ArrayList();
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            final Matrix j = new Matrix();
            this.j = j;
            this.m = null;
            this.c = d.c;
            this.d = d.d;
            this.e = d.e;
            this.f = d.f;
            this.g = d.g;
            this.h = d.h;
            this.i = d.i;
            this.l = d.l;
            final String m = d.m;
            this.m = m;
            this.k = d.k;
            if (m != null) {
                a.put(m, this);
            }
            j.set(d.j);
            final ArrayList b = d.b;
            for (int i = 0; i < b.size(); ++i) {
                final d value = b.get(i);
                if (value instanceof d) {
                    d = value;
                    this.b.add(new d(d, a));
                }
                else {
                    f e;
                    if (value instanceof c) {
                        e = new c((c)value);
                    }
                    else {
                        if (!(value instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        e = new b((b)value);
                    }
                    this.b.add(e);
                    final String b2 = e.b;
                    if (b2 != null) {
                        a.put(b2, e);
                    }
                }
            }
        }
        
        @Override
        public boolean a() {
            for (int i = 0; i < this.b.size(); ++i) {
                if (((e)this.b.get(i)).a()) {
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public boolean b(final int[] array) {
            int i = 0;
            boolean b = false;
            while (i < this.b.size()) {
                b |= ((e)this.b.get(i)).b(array);
                ++i;
            }
            return b;
        }
        
        public void c(final Resources resources, final AttributeSet set, final Resources$Theme resources$Theme, final XmlPullParser xmlPullParser) {
            final TypedArray k = z.k.k(resources, resources$Theme, set, u1.a.b);
            this.e(k, xmlPullParser);
            k.recycle();
        }
        
        public final void d() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }
        
        public final void e(final TypedArray typedArray, final XmlPullParser xmlPullParser) {
            this.l = null;
            this.c = z.k.f(typedArray, xmlPullParser, "rotation", 5, this.c);
            this.d = typedArray.getFloat(1, this.d);
            this.e = typedArray.getFloat(2, this.e);
            this.f = z.k.f(typedArray, xmlPullParser, "scaleX", 3, this.f);
            this.g = z.k.f(typedArray, xmlPullParser, "scaleY", 4, this.g);
            this.h = z.k.f(typedArray, xmlPullParser, "translateX", 6, this.h);
            this.i = z.k.f(typedArray, xmlPullParser, "translateY", 7, this.i);
            final String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
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
        
        public void setPivotX(final float d) {
            if (d != this.d) {
                this.d = d;
                this.d();
            }
        }
        
        public void setPivotY(final float e) {
            if (e != this.e) {
                this.e = e;
                this.d();
            }
        }
        
        public void setRotation(final float c) {
            if (c != this.c) {
                this.c = c;
                this.d();
            }
        }
        
        public void setScaleX(final float f) {
            if (f != this.f) {
                this.f = f;
                this.d();
            }
        }
        
        public void setScaleY(final float g) {
            if (g != this.g) {
                this.g = g;
                this.d();
            }
        }
        
        public void setTranslateX(final float h) {
            if (h != this.h) {
                this.h = h;
                this.d();
            }
        }
        
        public void setTranslateY(final float i) {
            if (i != this.i) {
                this.i = i;
                this.d();
            }
        }
    }
    
    public abstract static class e
    {
        public boolean a() {
            return false;
        }
        
        public boolean b(final int[] array) {
            return false;
        }
    }
    
    public abstract static class f extends e
    {
        public A.g.b[] a;
        public String b;
        public int c;
        public int d;
        
        public f() {
            super(null);
            this.a = null;
            this.c = 0;
        }
        
        public f(final f f) {
            super(null);
            this.a = null;
            this.c = 0;
            this.b = f.b;
            this.d = f.d;
            this.a = g.f(f.a);
        }
        
        public boolean c() {
            return false;
        }
        
        public void d(final Path path) {
            path.reset();
            final A.g.b[] a = this.a;
            if (a != null) {
                A.g.b.e(a, path);
            }
        }
        
        public A.g.b[] getPathData() {
            return this.a;
        }
        
        public String getPathName() {
            return this.b;
        }
        
        public void setPathData(final A.g.b[] array) {
            if (!g.b(this.a, array)) {
                this.a = g.f(array);
                return;
            }
            g.j(this.a, array);
        }
    }
    
    public static class g
    {
        public static final Matrix q;
        public final Path a;
        public final Path b;
        public final Matrix c;
        public Paint d;
        public Paint e;
        public PathMeasure f;
        public int g;
        public final d h;
        public float i;
        public float j;
        public float k;
        public float l;
        public int m;
        public String n;
        public Boolean o;
        public final t.a p;
        
        static {
            q = new Matrix();
        }
        
        public g() {
            this.c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new t.a();
            this.h = new d();
            this.a = new Path();
            this.b = new Path();
        }
        
        public g(final g g) {
            this.c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            final t.a p = new t.a();
            this.p = p;
            this.h = new d(g.h, p);
            this.a = new Path(g.a);
            this.b = new Path(g.b);
            this.i = g.i;
            this.j = g.j;
            this.k = g.k;
            this.l = g.l;
            this.g = g.g;
            this.m = g.m;
            this.n = g.n;
            final String n = g.n;
            if (n != null) {
                p.put(n, this);
            }
            this.o = g.o;
        }
        
        public static float a(final float n, final float n2, final float n3, final float n4) {
            return n * n4 - n2 * n3;
        }
        
        public void b(final Canvas canvas, final int n, final int n2, final ColorFilter colorFilter) {
            this.c(this.h, u1.g.g.q, canvas, n, n2, colorFilter);
        }
        
        public final void c(final d d, final Matrix matrix, final Canvas canvas, final int n, final int n2, final ColorFilter colorFilter) {
            d.a.set(matrix);
            d.a.preConcat(d.j);
            canvas.save();
            for (int i = 0; i < d.b.size(); ++i) {
                final e e = d.b.get(i);
                if (e instanceof d) {
                    this.c((d)e, d.a, canvas, n, n2, colorFilter);
                }
                else if (e instanceof f) {
                    this.d(d, (f)e, canvas, n, n2, colorFilter);
                }
            }
            canvas.restore();
        }
        
        public final void d(final d d, final f f, final Canvas canvas, final int n, final int n2, final ColorFilter colorFilter) {
            final float a = n / this.k;
            final float b = n2 / this.l;
            final float min = Math.min(a, b);
            final Matrix a2 = d.a;
            this.c.set(a2);
            this.c.postScale(a, b);
            final float e = this.e(a2);
            if (e == 0.0f) {
                return;
            }
            f.d(this.a);
            final Path a3 = this.a;
            this.b.reset();
            if (f.c()) {
                final Path b2 = this.b;
                Path$FillType fillType;
                if (f.c == 0) {
                    fillType = Path$FillType.WINDING;
                }
                else {
                    fillType = Path$FillType.EVEN_ODD;
                }
                b2.setFillType(fillType);
                this.b.addPath(a3, this.c);
                canvas.clipPath(this.b);
                return;
            }
            final c c = (c)f;
            final float k = c.k;
            if (k != 0.0f || c.l != 1.0f) {
                final float m = c.m;
                final float l = c.l;
                if (this.f == null) {
                    this.f = new PathMeasure();
                }
                this.f.setPath(this.a, false);
                final float length = this.f.getLength();
                final float n3 = (k + m) % 1.0f * length;
                final float n4 = (l + m) % 1.0f * length;
                a3.reset();
                if (n3 > n4) {
                    this.f.getSegment(n3, length, a3, true);
                    this.f.getSegment(0.0f, n4, a3, true);
                }
                else {
                    this.f.getSegment(n3, n4, a3, true);
                }
                a3.rLineTo(0.0f, 0.0f);
            }
            this.b.addPath(a3, this.c);
            if (c.h.l()) {
                final z.d h = c.h;
                if (this.e == null) {
                    (this.e = new Paint(1)).setStyle(Paint$Style.FILL);
                }
                final Paint e2 = this.e;
                if (h.h()) {
                    final Shader f2 = h.f();
                    f2.setLocalMatrix(this.c);
                    e2.setShader(f2);
                    e2.setAlpha(Math.round(c.j * 255.0f));
                }
                else {
                    e2.setShader((Shader)null);
                    e2.setAlpha(255);
                    e2.setColor(u1.g.a(h.e(), c.j));
                }
                e2.setColorFilter(colorFilter);
                final Path b3 = this.b;
                Path$FillType fillType2;
                if (c.c == 0) {
                    fillType2 = Path$FillType.WINDING;
                }
                else {
                    fillType2 = Path$FillType.EVEN_ODD;
                }
                b3.setFillType(fillType2);
                canvas.drawPath(this.b, e2);
            }
            if (c.f.l()) {
                final z.d f3 = c.f;
                if (this.d == null) {
                    (this.d = new Paint(1)).setStyle(Paint$Style.STROKE);
                }
                final Paint d2 = this.d;
                final Paint$Join o = c.o;
                if (o != null) {
                    d2.setStrokeJoin(o);
                }
                final Paint$Cap n5 = c.n;
                if (n5 != null) {
                    d2.setStrokeCap(n5);
                }
                d2.setStrokeMiter(c.p);
                if (f3.h()) {
                    final Shader f4 = f3.f();
                    f4.setLocalMatrix(this.c);
                    d2.setShader(f4);
                    d2.setAlpha(Math.round(c.i * 255.0f));
                }
                else {
                    d2.setShader((Shader)null);
                    d2.setAlpha(255);
                    d2.setColor(u1.g.a(f3.e(), c.i));
                }
                d2.setColorFilter(colorFilter);
                d2.setStrokeWidth(c.g * (min * e));
                canvas.drawPath(this.b, d2);
            }
        }
        
        public final float e(final Matrix matrix) {
            float n = 0.0f;
            final float[] array2;
            final float[] array = array2 = new float[4];
            array2[0] = 0.0f;
            array2[2] = (array2[1] = 1.0f);
            array2[3] = 0.0f;
            matrix.mapVectors(array);
            final float a = (float)Math.hypot(array[0], array[1]);
            final float b = (float)Math.hypot(array[2], array[3]);
            final float a2 = a(array[0], array[1], array[2], array[3]);
            final float max = Math.max(a, b);
            if (max > 0.0f) {
                n = Math.abs(a2) / max;
            }
            return n;
        }
        
        public boolean f() {
            if (this.o == null) {
                this.o = this.h.a();
            }
            return this.o;
        }
        
        public boolean g(final int[] array) {
            return this.h.b(array);
        }
        
        public float getAlpha() {
            return this.getRootAlpha() / 255.0f;
        }
        
        public int getRootAlpha() {
            return this.m;
        }
        
        public void setAlpha(final float n) {
            this.setRootAlpha((int)(n * 255.0f));
        }
        
        public void setRootAlpha(final int m) {
            this.m = m;
        }
    }
    
    public static class h extends Drawable$ConstantState
    {
        public int a;
        public g b;
        public ColorStateList c;
        public PorterDuff$Mode d;
        public boolean e;
        public Bitmap f;
        public ColorStateList g;
        public PorterDuff$Mode h;
        public int i;
        public boolean j;
        public boolean k;
        public Paint l;
        
        public h() {
            this.c = null;
            this.d = g.y;
            this.b = new g();
        }
        
        public h(final h h) {
            this.c = null;
            this.d = g.y;
            if (h != null) {
                this.a = h.a;
                final g b = new g(h.b);
                this.b = b;
                if (h.b.e != null) {
                    b.e = new Paint(h.b.e);
                }
                if (h.b.d != null) {
                    this.b.d = new Paint(h.b.d);
                }
                this.c = h.c;
                this.d = h.d;
                this.e = h.e;
            }
        }
        
        public boolean a(final int n, final int n2) {
            return n == this.f.getWidth() && n2 == this.f.getHeight();
        }
        
        public boolean b() {
            return !this.k && this.g == this.c && this.h == this.d && this.j == this.e && this.i == this.b.getRootAlpha();
        }
        
        public void c(final int n, final int n2) {
            if (this.f == null || !this.a(n, n2)) {
                this.f = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
                this.k = true;
            }
        }
        
        public void d(final Canvas canvas, final ColorFilter colorFilter, final Rect rect) {
            canvas.drawBitmap(this.f, (Rect)null, rect, this.e(colorFilter));
        }
        
        public Paint e(final ColorFilter colorFilter) {
            if (!this.f() && colorFilter == null) {
                return null;
            }
            if (this.l == null) {
                (this.l = new Paint()).setFilterBitmap(true);
            }
            this.l.setAlpha(this.b.getRootAlpha());
            this.l.setColorFilter(colorFilter);
            return this.l;
        }
        
        public boolean f() {
            return this.b.getRootAlpha() < 255;
        }
        
        public boolean g() {
            return this.b.f();
        }
        
        public int getChangingConfigurations() {
            return this.a;
        }
        
        public boolean h(final int[] array) {
            final boolean g = this.b.g(array);
            this.k |= g;
            return g;
        }
        
        public void i() {
            this.g = this.c;
            this.h = this.d;
            this.i = this.b.getRootAlpha();
            this.j = this.e;
            this.k = false;
        }
        
        public void j(final int n, final int n2) {
            this.f.eraseColor(0);
            this.b.b(new Canvas(this.f), n, n2, null);
        }
        
        public Drawable newDrawable() {
            return new g(this);
        }
        
        public Drawable newDrawable(final Resources resources) {
            return new g(this);
        }
    }
    
    public static class i extends Drawable$ConstantState
    {
        public final Drawable$ConstantState a;
        
        public i(final Drawable$ConstantState a) {
            this.a = a;
        }
        
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }
        
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }
        
        public Drawable newDrawable() {
            final g g = new g();
            g.o = this.a.newDrawable();
            return g;
        }
        
        public Drawable newDrawable(final Resources resources) {
            final g g = new g();
            g.o = this.a.newDrawable(resources);
            return g;
        }
        
        public Drawable newDrawable(final Resources resources, final Resources$Theme resources$Theme) {
            final g g = new g();
            g.o = this.a.newDrawable(resources, resources$Theme);
            return g;
        }
    }
}
