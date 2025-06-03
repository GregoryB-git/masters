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
import t.C1958a;
import z.k;

/* loaded from: classes.dex */
public class g extends u1.f {

    /* renamed from: y, reason: collision with root package name */
    public static final PorterDuff.Mode f19692y = PorterDuff.Mode.SRC_IN;

    /* renamed from: p, reason: collision with root package name */
    public h f19693p;

    /* renamed from: q, reason: collision with root package name */
    public PorterDuffColorFilter f19694q;

    /* renamed from: r, reason: collision with root package name */
    public ColorFilter f19695r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f19696s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f19697t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable.ConstantState f19698u;

    /* renamed from: v, reason: collision with root package name */
    public final float[] f19699v;

    /* renamed from: w, reason: collision with root package name */
    public final Matrix f19700w;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f19701x;

    public static class b extends f {
        public b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f19728b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f19727a = A.g.d(string2);
            }
            this.f19729c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // u1.g.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.j(xmlPullParser, "pathData")) {
                TypedArray k7 = k.k(resources, theme, attributeSet, AbstractC2002a.f19667d);
                f(k7, xmlPullParser);
                k7.recycle();
            }
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    public static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        public int[] f19702e;

        /* renamed from: f, reason: collision with root package name */
        public z.d f19703f;

        /* renamed from: g, reason: collision with root package name */
        public float f19704g;

        /* renamed from: h, reason: collision with root package name */
        public z.d f19705h;

        /* renamed from: i, reason: collision with root package name */
        public float f19706i;

        /* renamed from: j, reason: collision with root package name */
        public float f19707j;

        /* renamed from: k, reason: collision with root package name */
        public float f19708k;

        /* renamed from: l, reason: collision with root package name */
        public float f19709l;

        /* renamed from: m, reason: collision with root package name */
        public float f19710m;

        /* renamed from: n, reason: collision with root package name */
        public Paint.Cap f19711n;

        /* renamed from: o, reason: collision with root package name */
        public Paint.Join f19712o;

        /* renamed from: p, reason: collision with root package name */
        public float f19713p;

        public c() {
            this.f19704g = 0.0f;
            this.f19706i = 1.0f;
            this.f19707j = 1.0f;
            this.f19708k = 0.0f;
            this.f19709l = 1.0f;
            this.f19710m = 0.0f;
            this.f19711n = Paint.Cap.BUTT;
            this.f19712o = Paint.Join.MITER;
            this.f19713p = 4.0f;
        }

        @Override // u1.g.e
        public boolean a() {
            return this.f19705h.i() || this.f19703f.i();
        }

        @Override // u1.g.e
        public boolean b(int[] iArr) {
            return this.f19703f.j(iArr) | this.f19705h.j(iArr);
        }

        public final Paint.Cap e(int i7, Paint.Cap cap) {
            return i7 != 0 ? i7 != 1 ? i7 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        public final Paint.Join f(int i7, Paint.Join join) {
            return i7 != 0 ? i7 != 1 ? i7 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k7 = k.k(resources, theme, attributeSet, AbstractC2002a.f19666c);
            h(k7, xmlPullParser, theme);
            k7.recycle();
        }

        public float getFillAlpha() {
            return this.f19707j;
        }

        public int getFillColor() {
            return this.f19705h.e();
        }

        public float getStrokeAlpha() {
            return this.f19706i;
        }

        public int getStrokeColor() {
            return this.f19703f.e();
        }

        public float getStrokeWidth() {
            return this.f19704g;
        }

        public float getTrimPathEnd() {
            return this.f19709l;
        }

        public float getTrimPathOffset() {
            return this.f19710m;
        }

        public float getTrimPathStart() {
            return this.f19708k;
        }

        public final void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f19702e = null;
            if (k.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f19728b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f19727a = A.g.d(string2);
                }
                this.f19705h = k.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f19707j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f19707j);
                this.f19711n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f19711n);
                this.f19712o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f19712o);
                this.f19713p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f19713p);
                this.f19703f = k.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f19706i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f19706i);
                this.f19704g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f19704g);
                this.f19709l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f19709l);
                this.f19710m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f19710m);
                this.f19708k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f19708k);
                this.f19729c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f19729c);
            }
        }

        public void setFillAlpha(float f7) {
            this.f19707j = f7;
        }

        public void setFillColor(int i7) {
            this.f19705h.k(i7);
        }

        public void setStrokeAlpha(float f7) {
            this.f19706i = f7;
        }

        public void setStrokeColor(int i7) {
            this.f19703f.k(i7);
        }

        public void setStrokeWidth(float f7) {
            this.f19704g = f7;
        }

        public void setTrimPathEnd(float f7) {
            this.f19709l = f7;
        }

        public void setTrimPathOffset(float f7) {
            this.f19710m = f7;
        }

        public void setTrimPathStart(float f7) {
            this.f19708k = f7;
        }

        public c(c cVar) {
            super(cVar);
            this.f19704g = 0.0f;
            this.f19706i = 1.0f;
            this.f19707j = 1.0f;
            this.f19708k = 0.0f;
            this.f19709l = 1.0f;
            this.f19710m = 0.0f;
            this.f19711n = Paint.Cap.BUTT;
            this.f19712o = Paint.Join.MITER;
            this.f19713p = 4.0f;
            this.f19702e = cVar.f19702e;
            this.f19703f = cVar.f19703f;
            this.f19704g = cVar.f19704g;
            this.f19706i = cVar.f19706i;
            this.f19705h = cVar.f19705h;
            this.f19729c = cVar.f19729c;
            this.f19707j = cVar.f19707j;
            this.f19708k = cVar.f19708k;
            this.f19709l = cVar.f19709l;
            this.f19710m = cVar.f19710m;
            this.f19711n = cVar.f19711n;
            this.f19712o = cVar.f19712o;
            this.f19713p = cVar.f19713p;
        }
    }

    public static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f19714a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f19715b;

        /* renamed from: c, reason: collision with root package name */
        public float f19716c;

        /* renamed from: d, reason: collision with root package name */
        public float f19717d;

        /* renamed from: e, reason: collision with root package name */
        public float f19718e;

        /* renamed from: f, reason: collision with root package name */
        public float f19719f;

        /* renamed from: g, reason: collision with root package name */
        public float f19720g;

        /* renamed from: h, reason: collision with root package name */
        public float f19721h;

        /* renamed from: i, reason: collision with root package name */
        public float f19722i;

        /* renamed from: j, reason: collision with root package name */
        public final Matrix f19723j;

        /* renamed from: k, reason: collision with root package name */
        public int f19724k;

        /* renamed from: l, reason: collision with root package name */
        public int[] f19725l;

        /* renamed from: m, reason: collision with root package name */
        public String f19726m;

        public d() {
            super();
            this.f19714a = new Matrix();
            this.f19715b = new ArrayList();
            this.f19716c = 0.0f;
            this.f19717d = 0.0f;
            this.f19718e = 0.0f;
            this.f19719f = 1.0f;
            this.f19720g = 1.0f;
            this.f19721h = 0.0f;
            this.f19722i = 0.0f;
            this.f19723j = new Matrix();
            this.f19726m = null;
        }

        @Override // u1.g.e
        public boolean a() {
            for (int i7 = 0; i7 < this.f19715b.size(); i7++) {
                if (((e) this.f19715b.get(i7)).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // u1.g.e
        public boolean b(int[] iArr) {
            boolean z7 = false;
            for (int i7 = 0; i7 < this.f19715b.size(); i7++) {
                z7 |= ((e) this.f19715b.get(i7)).b(iArr);
            }
            return z7;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k7 = k.k(resources, theme, attributeSet, AbstractC2002a.f19665b);
            e(k7, xmlPullParser);
            k7.recycle();
        }

        public final void d() {
            this.f19723j.reset();
            this.f19723j.postTranslate(-this.f19717d, -this.f19718e);
            this.f19723j.postScale(this.f19719f, this.f19720g);
            this.f19723j.postRotate(this.f19716c, 0.0f, 0.0f);
            this.f19723j.postTranslate(this.f19721h + this.f19717d, this.f19722i + this.f19718e);
        }

        public final void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f19725l = null;
            this.f19716c = k.f(typedArray, xmlPullParser, "rotation", 5, this.f19716c);
            this.f19717d = typedArray.getFloat(1, this.f19717d);
            this.f19718e = typedArray.getFloat(2, this.f19718e);
            this.f19719f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f19719f);
            this.f19720g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f19720g);
            this.f19721h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f19721h);
            this.f19722i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f19722i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f19726m = string;
            }
            d();
        }

        public String getGroupName() {
            return this.f19726m;
        }

        public Matrix getLocalMatrix() {
            return this.f19723j;
        }

        public float getPivotX() {
            return this.f19717d;
        }

        public float getPivotY() {
            return this.f19718e;
        }

        public float getRotation() {
            return this.f19716c;
        }

        public float getScaleX() {
            return this.f19719f;
        }

        public float getScaleY() {
            return this.f19720g;
        }

        public float getTranslateX() {
            return this.f19721h;
        }

        public float getTranslateY() {
            return this.f19722i;
        }

        public void setPivotX(float f7) {
            if (f7 != this.f19717d) {
                this.f19717d = f7;
                d();
            }
        }

        public void setPivotY(float f7) {
            if (f7 != this.f19718e) {
                this.f19718e = f7;
                d();
            }
        }

        public void setRotation(float f7) {
            if (f7 != this.f19716c) {
                this.f19716c = f7;
                d();
            }
        }

        public void setScaleX(float f7) {
            if (f7 != this.f19719f) {
                this.f19719f = f7;
                d();
            }
        }

        public void setScaleY(float f7) {
            if (f7 != this.f19720g) {
                this.f19720g = f7;
                d();
            }
        }

        public void setTranslateX(float f7) {
            if (f7 != this.f19721h) {
                this.f19721h = f7;
                d();
            }
        }

        public void setTranslateY(float f7) {
            if (f7 != this.f19722i) {
                this.f19722i = f7;
                d();
            }
        }

        public d(d dVar, C1958a c1958a) {
            super();
            f bVar;
            this.f19714a = new Matrix();
            this.f19715b = new ArrayList();
            this.f19716c = 0.0f;
            this.f19717d = 0.0f;
            this.f19718e = 0.0f;
            this.f19719f = 1.0f;
            this.f19720g = 1.0f;
            this.f19721h = 0.0f;
            this.f19722i = 0.0f;
            Matrix matrix = new Matrix();
            this.f19723j = matrix;
            this.f19726m = null;
            this.f19716c = dVar.f19716c;
            this.f19717d = dVar.f19717d;
            this.f19718e = dVar.f19718e;
            this.f19719f = dVar.f19719f;
            this.f19720g = dVar.f19720g;
            this.f19721h = dVar.f19721h;
            this.f19722i = dVar.f19722i;
            this.f19725l = dVar.f19725l;
            String str = dVar.f19726m;
            this.f19726m = str;
            this.f19724k = dVar.f19724k;
            if (str != null) {
                c1958a.put(str, this);
            }
            matrix.set(dVar.f19723j);
            ArrayList arrayList = dVar.f19715b;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Object obj = arrayList.get(i7);
                if (obj instanceof d) {
                    this.f19715b.add(new d((d) obj, c1958a));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else {
                        if (!(obj instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) obj);
                    }
                    this.f19715b.add(bVar);
                    Object obj2 = bVar.f19728b;
                    if (obj2 != null) {
                        c1958a.put(obj2, bVar);
                    }
                }
            }
        }
    }

    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    public static abstract class f extends e {

        /* renamed from: a, reason: collision with root package name */
        public g.b[] f19727a;

        /* renamed from: b, reason: collision with root package name */
        public String f19728b;

        /* renamed from: c, reason: collision with root package name */
        public int f19729c;

        /* renamed from: d, reason: collision with root package name */
        public int f19730d;

        public f() {
            super();
            this.f19727a = null;
            this.f19729c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            g.b[] bVarArr = this.f19727a;
            if (bVarArr != null) {
                g.b.e(bVarArr, path);
            }
        }

        public g.b[] getPathData() {
            return this.f19727a;
        }

        public String getPathName() {
            return this.f19728b;
        }

        public void setPathData(g.b[] bVarArr) {
            if (A.g.b(this.f19727a, bVarArr)) {
                A.g.j(this.f19727a, bVarArr);
            } else {
                this.f19727a = A.g.f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f19727a = null;
            this.f19729c = 0;
            this.f19728b = fVar.f19728b;
            this.f19730d = fVar.f19730d;
            this.f19727a = A.g.f(fVar.f19727a);
        }
    }

    /* renamed from: u1.g$g, reason: collision with other inner class name */
    public static class C0278g {

        /* renamed from: q, reason: collision with root package name */
        public static final Matrix f19731q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Path f19732a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f19733b;

        /* renamed from: c, reason: collision with root package name */
        public final Matrix f19734c;

        /* renamed from: d, reason: collision with root package name */
        public Paint f19735d;

        /* renamed from: e, reason: collision with root package name */
        public Paint f19736e;

        /* renamed from: f, reason: collision with root package name */
        public PathMeasure f19737f;

        /* renamed from: g, reason: collision with root package name */
        public int f19738g;

        /* renamed from: h, reason: collision with root package name */
        public final d f19739h;

        /* renamed from: i, reason: collision with root package name */
        public float f19740i;

        /* renamed from: j, reason: collision with root package name */
        public float f19741j;

        /* renamed from: k, reason: collision with root package name */
        public float f19742k;

        /* renamed from: l, reason: collision with root package name */
        public float f19743l;

        /* renamed from: m, reason: collision with root package name */
        public int f19744m;

        /* renamed from: n, reason: collision with root package name */
        public String f19745n;

        /* renamed from: o, reason: collision with root package name */
        public Boolean f19746o;

        /* renamed from: p, reason: collision with root package name */
        public final C1958a f19747p;

        public C0278g() {
            this.f19734c = new Matrix();
            this.f19740i = 0.0f;
            this.f19741j = 0.0f;
            this.f19742k = 0.0f;
            this.f19743l = 0.0f;
            this.f19744m = 255;
            this.f19745n = null;
            this.f19746o = null;
            this.f19747p = new C1958a();
            this.f19739h = new d();
            this.f19732a = new Path();
            this.f19733b = new Path();
        }

        public static float a(float f7, float f8, float f9, float f10) {
            return (f7 * f10) - (f8 * f9);
        }

        public void b(Canvas canvas, int i7, int i8, ColorFilter colorFilter) {
            c(this.f19739h, f19731q, canvas, i7, i8, colorFilter);
        }

        public final void c(d dVar, Matrix matrix, Canvas canvas, int i7, int i8, ColorFilter colorFilter) {
            dVar.f19714a.set(matrix);
            dVar.f19714a.preConcat(dVar.f19723j);
            canvas.save();
            for (int i9 = 0; i9 < dVar.f19715b.size(); i9++) {
                e eVar = (e) dVar.f19715b.get(i9);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f19714a, canvas, i7, i8, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i7, i8, colorFilter);
                }
            }
            canvas.restore();
        }

        public final void d(d dVar, f fVar, Canvas canvas, int i7, int i8, ColorFilter colorFilter) {
            float f7 = i7 / this.f19742k;
            float f8 = i8 / this.f19743l;
            float min = Math.min(f7, f8);
            Matrix matrix = dVar.f19714a;
            this.f19734c.set(matrix);
            this.f19734c.postScale(f7, f8);
            float e7 = e(matrix);
            if (e7 == 0.0f) {
                return;
            }
            fVar.d(this.f19732a);
            Path path = this.f19732a;
            this.f19733b.reset();
            if (fVar.c()) {
                this.f19733b.setFillType(fVar.f19729c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f19733b.addPath(path, this.f19734c);
                canvas.clipPath(this.f19733b);
                return;
            }
            c cVar = (c) fVar;
            float f9 = cVar.f19708k;
            if (f9 != 0.0f || cVar.f19709l != 1.0f) {
                float f10 = cVar.f19710m;
                float f11 = (f9 + f10) % 1.0f;
                float f12 = (cVar.f19709l + f10) % 1.0f;
                if (this.f19737f == null) {
                    this.f19737f = new PathMeasure();
                }
                this.f19737f.setPath(this.f19732a, false);
                float length = this.f19737f.getLength();
                float f13 = f11 * length;
                float f14 = f12 * length;
                path.reset();
                if (f13 > f14) {
                    this.f19737f.getSegment(f13, length, path, true);
                    this.f19737f.getSegment(0.0f, f14, path, true);
                } else {
                    this.f19737f.getSegment(f13, f14, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f19733b.addPath(path, this.f19734c);
            if (cVar.f19705h.l()) {
                z.d dVar2 = cVar.f19705h;
                if (this.f19736e == null) {
                    Paint paint = new Paint(1);
                    this.f19736e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f19736e;
                if (dVar2.h()) {
                    Shader f15 = dVar2.f();
                    f15.setLocalMatrix(this.f19734c);
                    paint2.setShader(f15);
                    paint2.setAlpha(Math.round(cVar.f19707j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(g.a(dVar2.e(), cVar.f19707j));
                }
                paint2.setColorFilter(colorFilter);
                this.f19733b.setFillType(cVar.f19729c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f19733b, paint2);
            }
            if (cVar.f19703f.l()) {
                z.d dVar3 = cVar.f19703f;
                if (this.f19735d == null) {
                    Paint paint3 = new Paint(1);
                    this.f19735d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f19735d;
                Paint.Join join = cVar.f19712o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f19711n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f19713p);
                if (dVar3.h()) {
                    Shader f16 = dVar3.f();
                    f16.setLocalMatrix(this.f19734c);
                    paint4.setShader(f16);
                    paint4.setAlpha(Math.round(cVar.f19706i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(g.a(dVar3.e(), cVar.f19706i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f19704g * min * e7);
                canvas.drawPath(this.f19733b, paint4);
            }
        }

        public final float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float a7 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a7) / max;
            }
            return 0.0f;
        }

        public boolean f() {
            if (this.f19746o == null) {
                this.f19746o = Boolean.valueOf(this.f19739h.a());
            }
            return this.f19746o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f19739h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f19744m;
        }

        public void setAlpha(float f7) {
            setRootAlpha((int) (f7 * 255.0f));
        }

        public void setRootAlpha(int i7) {
            this.f19744m = i7;
        }

        public C0278g(C0278g c0278g) {
            this.f19734c = new Matrix();
            this.f19740i = 0.0f;
            this.f19741j = 0.0f;
            this.f19742k = 0.0f;
            this.f19743l = 0.0f;
            this.f19744m = 255;
            this.f19745n = null;
            this.f19746o = null;
            C1958a c1958a = new C1958a();
            this.f19747p = c1958a;
            this.f19739h = new d(c0278g.f19739h, c1958a);
            this.f19732a = new Path(c0278g.f19732a);
            this.f19733b = new Path(c0278g.f19733b);
            this.f19740i = c0278g.f19740i;
            this.f19741j = c0278g.f19741j;
            this.f19742k = c0278g.f19742k;
            this.f19743l = c0278g.f19743l;
            this.f19738g = c0278g.f19738g;
            this.f19744m = c0278g.f19744m;
            this.f19745n = c0278g.f19745n;
            String str = c0278g.f19745n;
            if (str != null) {
                c1958a.put(str, this);
            }
            this.f19746o = c0278g.f19746o;
        }
    }

    public static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public int f19748a;

        /* renamed from: b, reason: collision with root package name */
        public C0278g f19749b;

        /* renamed from: c, reason: collision with root package name */
        public ColorStateList f19750c;

        /* renamed from: d, reason: collision with root package name */
        public PorterDuff.Mode f19751d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f19752e;

        /* renamed from: f, reason: collision with root package name */
        public Bitmap f19753f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f19754g;

        /* renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f19755h;

        /* renamed from: i, reason: collision with root package name */
        public int f19756i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f19757j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f19758k;

        /* renamed from: l, reason: collision with root package name */
        public Paint f19759l;

        public h() {
            this.f19750c = null;
            this.f19751d = g.f19692y;
            this.f19749b = new C0278g();
        }

        public boolean a(int i7, int i8) {
            return i7 == this.f19753f.getWidth() && i8 == this.f19753f.getHeight();
        }

        public boolean b() {
            return !this.f19758k && this.f19754g == this.f19750c && this.f19755h == this.f19751d && this.f19757j == this.f19752e && this.f19756i == this.f19749b.getRootAlpha();
        }

        public void c(int i7, int i8) {
            if (this.f19753f == null || !a(i7, i8)) {
                this.f19753f = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                this.f19758k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f19753f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f19759l == null) {
                Paint paint = new Paint();
                this.f19759l = paint;
                paint.setFilterBitmap(true);
            }
            this.f19759l.setAlpha(this.f19749b.getRootAlpha());
            this.f19759l.setColorFilter(colorFilter);
            return this.f19759l;
        }

        public boolean f() {
            return this.f19749b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f19749b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f19748a;
        }

        public boolean h(int[] iArr) {
            boolean g7 = this.f19749b.g(iArr);
            this.f19758k |= g7;
            return g7;
        }

        public void i() {
            this.f19754g = this.f19750c;
            this.f19755h = this.f19751d;
            this.f19756i = this.f19749b.getRootAlpha();
            this.f19757j = this.f19752e;
            this.f19758k = false;
        }

        public void j(int i7, int i8) {
            this.f19753f.eraseColor(0);
            this.f19749b.b(new Canvas(this.f19753f), i7, i8, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new g(this);
        }

        public h(h hVar) {
            this.f19750c = null;
            this.f19751d = g.f19692y;
            if (hVar != null) {
                this.f19748a = hVar.f19748a;
                C0278g c0278g = new C0278g(hVar.f19749b);
                this.f19749b = c0278g;
                if (hVar.f19749b.f19736e != null) {
                    c0278g.f19736e = new Paint(hVar.f19749b.f19736e);
                }
                if (hVar.f19749b.f19735d != null) {
                    this.f19749b.f19735d = new Paint(hVar.f19749b.f19735d);
                }
                this.f19750c = hVar.f19750c;
                this.f19751d = hVar.f19751d;
                this.f19752e = hVar.f19752e;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new g(this);
        }
    }

    public static class i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f19760a;

        public i(Drawable.ConstantState constantState) {
            this.f19760a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f19760a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f19760a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g();
            gVar.f19691o = (VectorDrawable) this.f19760a.newDrawable();
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.f19691o = (VectorDrawable) this.f19760a.newDrawable(resources);
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.f19691o = (VectorDrawable) this.f19760a.newDrawable(resources, theme);
            return gVar;
        }
    }

    public g() {
        this.f19697t = true;
        this.f19699v = new float[9];
        this.f19700w = new Matrix();
        this.f19701x = new Rect();
        this.f19693p = new h();
    }

    public static int a(int i7, float f7) {
        return (i7 & 16777215) | (((int) (Color.alpha(i7) * f7)) << 24);
    }

    public static g b(Resources resources, int i7, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            g gVar = new g();
            gVar.f19691o = z.h.a(resources, i7, theme);
            gVar.f19698u = new i(gVar.f19691o.getConstantState());
            return gVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i7);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e7) {
            e = e7;
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e8) {
            e = e8;
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        }
    }

    public static g c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        g gVar = new g();
        gVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return gVar;
    }

    public static PorterDuff.Mode g(int i7, PorterDuff.Mode mode) {
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i7) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f19691o;
        if (drawable == null) {
            return false;
        }
        B.a.b(drawable);
        return false;
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public Object d(String str) {
        return this.f19693p.f19749b.f19747p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f19701x);
        if (this.f19701x.width() <= 0 || this.f19701x.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f19695r;
        if (colorFilter == null) {
            colorFilter = this.f19694q;
        }
        canvas.getMatrix(this.f19700w);
        this.f19700w.getValues(this.f19699v);
        float abs = Math.abs(this.f19699v[0]);
        float abs2 = Math.abs(this.f19699v[4]);
        float abs3 = Math.abs(this.f19699v[1]);
        float abs4 = Math.abs(this.f19699v[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f19701x.width() * abs));
        int min2 = Math.min(2048, (int) (this.f19701x.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f19701x;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.f19701x.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f19701x.offsetTo(0, 0);
        this.f19693p.c(min, min2);
        if (!this.f19697t) {
            this.f19693p.j(min, min2);
        } else if (!this.f19693p.b()) {
            this.f19693p.j(min, min2);
            this.f19693p.i();
        }
        this.f19693p.d(canvas, colorFilter, this.f19701x);
        canvas.restoreToCount(save);
    }

    public final void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i7;
        int i8;
        h hVar = this.f19693p;
        C0278g c0278g = hVar.f19749b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c0278g.f19739h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z7 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f19715b.add(cVar);
                    if (cVar.getPathName() != null) {
                        c0278g.f19747p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f19748a = cVar.f19730d | hVar.f19748a;
                    z7 = false;
                } else {
                    if ("clip-path".equals(name)) {
                        b bVar = new b();
                        bVar.e(resources, attributeSet, theme, xmlPullParser);
                        dVar.f19715b.add(bVar);
                        if (bVar.getPathName() != null) {
                            c0278g.f19747p.put(bVar.getPathName(), bVar);
                        }
                        i7 = hVar.f19748a;
                        i8 = bVar.f19730d;
                    } else if ("group".equals(name)) {
                        d dVar2 = new d();
                        dVar2.c(resources, attributeSet, theme, xmlPullParser);
                        dVar.f19715b.add(dVar2);
                        arrayDeque.push(dVar2);
                        if (dVar2.getGroupName() != null) {
                            c0278g.f19747p.put(dVar2.getGroupName(), dVar2);
                        }
                        i7 = hVar.f19748a;
                        i8 = dVar2.f19724k;
                    }
                    hVar.f19748a = i8 | i7;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z7) {
            throw new XmlPullParserException("no path defined");
        }
    }

    public final boolean f() {
        return isAutoMirrored() && B.a.e(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f19691o;
        return drawable != null ? B.a.c(drawable) : this.f19693p.f19749b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f19691o;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f19693p.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f19691o;
        return drawable != null ? B.a.d(drawable) : this.f19695r;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f19691o != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f19691o.getConstantState());
        }
        this.f19693p.f19748a = getChangingConfigurations();
        return this.f19693p;
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f19691o;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f19693p.f19749b.f19741j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f19691o;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f19693p.f19749b.f19740i;
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void h(boolean z7) {
        this.f19697t = z7;
    }

    public final void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f19693p;
        C0278g c0278g = hVar.f19749b;
        hVar.f19751d = g(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c7 = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c7 != null) {
            hVar.f19750c = c7;
        }
        hVar.f19752e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f19752e);
        c0278g.f19742k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, c0278g.f19742k);
        float f7 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, c0278g.f19743l);
        c0278g.f19743l = f7;
        if (c0278g.f19742k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f7 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c0278g.f19740i = typedArray.getDimension(3, c0278g.f19740i);
        float dimension = typedArray.getDimension(2, c0278g.f19741j);
        c0278g.f19741j = dimension;
        if (c0278g.f19740i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        c0278g.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, c0278g.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            c0278g.f19745n = string;
            c0278g.f19747p.put(string, c0278g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f19691o;
        return drawable != null ? B.a.g(drawable) : this.f19693p.f19752e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f19691o;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f19693p) != null && (hVar.g() || ((colorStateList = this.f19693p.f19750c) != null && colorStateList.isStateful())));
    }

    public PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f19696s && super.mutate() == this) {
            this.f19693p = new h(this.f19693p);
            this.f19696s = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z7;
        PorterDuff.Mode mode;
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f19693p;
        ColorStateList colorStateList = hVar.f19750c;
        if (colorStateList == null || (mode = hVar.f19751d) == null) {
            z7 = false;
        } else {
            this.f19694q = j(this.f19694q, colorStateList, mode);
            invalidateSelf();
            z7 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z7;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j7) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j7);
        } else {
            super.scheduleSelf(runnable, j7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else if (this.f19693p.f19749b.getRootAlpha() != i7) {
            this.f19693p.f19749b.setRootAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z7) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            B.a.i(drawable, z7);
        } else {
            this.f19693p.f19752e = z7;
        }
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i7) {
        super.setChangingConfigurations(i7);
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i7, PorterDuff.Mode mode) {
        super.setColorFilter(i7, mode);
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z7) {
        super.setFilterBitmap(z7);
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f7, float f8) {
        super.setHotspot(f7, f8);
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i7, int i8, int i9, int i10) {
        super.setHotspotBounds(i7, i8, i9, i10);
    }

    @Override // u1.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i7) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            B.a.l(drawable, i7);
        } else {
            setTintList(ColorStateList.valueOf(i7));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            B.a.m(drawable, colorStateList);
            return;
        }
        h hVar = this.f19693p;
        if (hVar.f19750c != colorStateList) {
            hVar.f19750c = colorStateList;
            this.f19694q = j(this.f19694q, colorStateList, hVar.f19751d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            B.a.n(drawable, mode);
            return;
        }
        h hVar = this.f19693p;
        if (hVar.f19751d != mode) {
            hVar.f19751d = mode;
            this.f19694q = j(this.f19694q, hVar.f19750c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        Drawable drawable = this.f19691o;
        return drawable != null ? drawable.setVisible(z7, z8) : super.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public g(h hVar) {
        this.f19697t = true;
        this.f19699v = new float[9];
        this.f19700w = new Matrix();
        this.f19701x = new Rect();
        this.f19693p = hVar;
        this.f19694q = j(this.f19694q, hVar.f19750c, hVar.f19751d);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            B.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f19693p;
        hVar.f19749b = new C0278g();
        TypedArray k7 = k.k(resources, theme, attributeSet, AbstractC2002a.f19664a);
        i(k7, xmlPullParser, theme);
        k7.recycle();
        hVar.f19748a = getChangingConfigurations();
        hVar.f19758k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f19694q = j(this.f19694q, hVar.f19750c, hVar.f19751d);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f19691o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f19695r = colorFilter;
            invalidateSelf();
        }
    }
}
