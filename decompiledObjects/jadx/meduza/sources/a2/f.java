package a2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
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
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import x.d;
import y.a;

/* loaded from: classes.dex */
public final class f extends a2.e {

    /* renamed from: r, reason: collision with root package name */
    public static final PorterDuff.Mode f38r = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public g f39b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f40c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f41d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f42e;
    public boolean f;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f43o;

    /* renamed from: p, reason: collision with root package name */
    public final Matrix f44p;

    /* renamed from: q, reason: collision with root package name */
    public final Rect f45q;

    public static class a extends e {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    public static class b extends e {

        /* renamed from: e, reason: collision with root package name */
        public w.c f46e;
        public float f;

        /* renamed from: g, reason: collision with root package name */
        public w.c f47g;

        /* renamed from: h, reason: collision with root package name */
        public float f48h;

        /* renamed from: i, reason: collision with root package name */
        public float f49i;

        /* renamed from: j, reason: collision with root package name */
        public float f50j;

        /* renamed from: k, reason: collision with root package name */
        public float f51k;

        /* renamed from: l, reason: collision with root package name */
        public float f52l;

        /* renamed from: m, reason: collision with root package name */
        public Paint.Cap f53m;

        /* renamed from: n, reason: collision with root package name */
        public Paint.Join f54n;

        /* renamed from: o, reason: collision with root package name */
        public float f55o;

        public b() {
            this.f = 0.0f;
            this.f48h = 1.0f;
            this.f49i = 1.0f;
            this.f50j = 0.0f;
            this.f51k = 1.0f;
            this.f52l = 0.0f;
            this.f53m = Paint.Cap.BUTT;
            this.f54n = Paint.Join.MITER;
            this.f55o = 4.0f;
        }

        public b(b bVar) {
            super(bVar);
            this.f = 0.0f;
            this.f48h = 1.0f;
            this.f49i = 1.0f;
            this.f50j = 0.0f;
            this.f51k = 1.0f;
            this.f52l = 0.0f;
            this.f53m = Paint.Cap.BUTT;
            this.f54n = Paint.Join.MITER;
            this.f55o = 4.0f;
            this.f46e = bVar.f46e;
            this.f = bVar.f;
            this.f48h = bVar.f48h;
            this.f47g = bVar.f47g;
            this.f69c = bVar.f69c;
            this.f49i = bVar.f49i;
            this.f50j = bVar.f50j;
            this.f51k = bVar.f51k;
            this.f52l = bVar.f52l;
            this.f53m = bVar.f53m;
            this.f54n = bVar.f54n;
            this.f55o = bVar.f55o;
        }

        @Override // a2.f.d
        public final boolean a() {
            return this.f47g.b() || this.f46e.b();
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // a2.f.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b(int[] r7) {
            /*
                r6 = this;
                w.c r0 = r6.f47g
                boolean r1 = r0.b()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L1c
                android.content.res.ColorStateList r1 = r0.f16145b
                int r4 = r1.getDefaultColor()
                int r1 = r1.getColorForState(r7, r4)
                int r4 = r0.f16146c
                if (r1 == r4) goto L1c
                r0.f16146c = r1
                r0 = r2
                goto L1d
            L1c:
                r0 = r3
            L1d:
                w.c r1 = r6.f46e
                boolean r4 = r1.b()
                if (r4 == 0) goto L36
                android.content.res.ColorStateList r4 = r1.f16145b
                int r5 = r4.getDefaultColor()
                int r7 = r4.getColorForState(r7, r5)
                int r4 = r1.f16146c
                if (r7 == r4) goto L36
                r1.f16146c = r7
                goto L37
            L36:
                r2 = r3
            L37:
                r7 = r2 | r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: a2.f.b.b(int[]):boolean");
        }

        public float getFillAlpha() {
            return this.f49i;
        }

        public int getFillColor() {
            return this.f47g.f16146c;
        }

        public float getStrokeAlpha() {
            return this.f48h;
        }

        public int getStrokeColor() {
            return this.f46e.f16146c;
        }

        public float getStrokeWidth() {
            return this.f;
        }

        public float getTrimPathEnd() {
            return this.f51k;
        }

        public float getTrimPathOffset() {
            return this.f52l;
        }

        public float getTrimPathStart() {
            return this.f50j;
        }

        public void setFillAlpha(float f) {
            this.f49i = f;
        }

        public void setFillColor(int i10) {
            this.f47g.f16146c = i10;
        }

        public void setStrokeAlpha(float f) {
            this.f48h = f;
        }

        public void setStrokeColor(int i10) {
            this.f46e.f16146c = i10;
        }

        public void setStrokeWidth(float f) {
            this.f = f;
        }

        public void setTrimPathEnd(float f) {
            this.f51k = f;
        }

        public void setTrimPathOffset(float f) {
            this.f52l = f;
        }

        public void setTrimPathStart(float f) {
            this.f50j = f;
        }
    }

    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: a2.f$f, reason: collision with other inner class name */
    public static class C0002f {

        /* renamed from: p, reason: collision with root package name */
        public static final Matrix f71p = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Path f72a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f73b;

        /* renamed from: c, reason: collision with root package name */
        public final Matrix f74c;

        /* renamed from: d, reason: collision with root package name */
        public Paint f75d;

        /* renamed from: e, reason: collision with root package name */
        public Paint f76e;
        public PathMeasure f;

        /* renamed from: g, reason: collision with root package name */
        public final c f77g;

        /* renamed from: h, reason: collision with root package name */
        public float f78h;

        /* renamed from: i, reason: collision with root package name */
        public float f79i;

        /* renamed from: j, reason: collision with root package name */
        public float f80j;

        /* renamed from: k, reason: collision with root package name */
        public float f81k;

        /* renamed from: l, reason: collision with root package name */
        public int f82l;

        /* renamed from: m, reason: collision with root package name */
        public String f83m;

        /* renamed from: n, reason: collision with root package name */
        public Boolean f84n;

        /* renamed from: o, reason: collision with root package name */
        public final r.b<String, Object> f85o;

        public C0002f() {
            this.f74c = new Matrix();
            this.f78h = 0.0f;
            this.f79i = 0.0f;
            this.f80j = 0.0f;
            this.f81k = 0.0f;
            this.f82l = 255;
            this.f83m = null;
            this.f84n = null;
            this.f85o = new r.b<>();
            this.f77g = new c();
            this.f72a = new Path();
            this.f73b = new Path();
        }

        public C0002f(C0002f c0002f) {
            this.f74c = new Matrix();
            this.f78h = 0.0f;
            this.f79i = 0.0f;
            this.f80j = 0.0f;
            this.f81k = 0.0f;
            this.f82l = 255;
            this.f83m = null;
            this.f84n = null;
            r.b<String, Object> bVar = new r.b<>();
            this.f85o = bVar;
            this.f77g = new c(c0002f.f77g, bVar);
            this.f72a = new Path(c0002f.f72a);
            this.f73b = new Path(c0002f.f73b);
            this.f78h = c0002f.f78h;
            this.f79i = c0002f.f79i;
            this.f80j = c0002f.f80j;
            this.f81k = c0002f.f81k;
            this.f82l = c0002f.f82l;
            this.f83m = c0002f.f83m;
            String str = c0002f.f83m;
            if (str != null) {
                bVar.put(str, this);
            }
            this.f84n = c0002f.f84n;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v0 */
        /* JADX WARN: Type inference failed for: r9v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r9v19 */
        public final void a(c cVar, Matrix matrix, Canvas canvas, int i10, int i11) {
            boolean z10;
            cVar.f56a.set(matrix);
            cVar.f56a.preConcat(cVar.f64j);
            canvas.save();
            ?? r92 = 0;
            C0002f c0002f = this;
            int i12 = 0;
            while (i12 < cVar.f57b.size()) {
                d dVar = cVar.f57b.get(i12);
                if (dVar instanceof c) {
                    a((c) dVar, cVar.f56a, canvas, i10, i11);
                } else if (dVar instanceof e) {
                    e eVar = (e) dVar;
                    float f = i10 / c0002f.f80j;
                    float f10 = i11 / c0002f.f81k;
                    float min = Math.min(f, f10);
                    Matrix matrix2 = cVar.f56a;
                    c0002f.f74c.set(matrix2);
                    c0002f.f74c.postScale(f, f10);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float hypot = (float) Math.hypot(fArr[r92], fArr[1]);
                    float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f11 = (fArr[r92] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max(hypot, hypot2);
                    float abs = max > 0.0f ? Math.abs(f11) / max : 0.0f;
                    if (abs != 0.0f) {
                        Path path = this.f72a;
                        eVar.getClass();
                        path.reset();
                        d.a[] aVarArr = eVar.f67a;
                        if (aVarArr != null) {
                            d.a.b(aVarArr, path);
                        }
                        Path path2 = this.f72a;
                        this.f73b.reset();
                        if (eVar instanceof a) {
                            this.f73b.setFillType(eVar.f69c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            this.f73b.addPath(path2, this.f74c);
                            canvas.clipPath(this.f73b);
                        } else {
                            b bVar = (b) eVar;
                            float f12 = bVar.f50j;
                            if (f12 != 0.0f || bVar.f51k != 1.0f) {
                                float f13 = bVar.f52l;
                                float f14 = (f12 + f13) % 1.0f;
                                float f15 = (bVar.f51k + f13) % 1.0f;
                                if (this.f == null) {
                                    this.f = new PathMeasure();
                                }
                                this.f.setPath(this.f72a, r92);
                                float length = this.f.getLength();
                                float f16 = f14 * length;
                                float f17 = f15 * length;
                                path2.reset();
                                if (f16 > f17) {
                                    this.f.getSegment(f16, length, path2, true);
                                    this.f.getSegment(0.0f, f17, path2, true);
                                } else {
                                    this.f.getSegment(f16, f17, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            this.f73b.addPath(path2, this.f74c);
                            w.c cVar2 = bVar.f47g;
                            if (((cVar2.f16144a != null ? true : r92) || cVar2.f16146c != 0) ? true : r92) {
                                if (this.f76e == null) {
                                    Paint paint = new Paint(1);
                                    this.f76e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.f76e;
                                Shader shader = cVar2.f16144a;
                                if (shader != null ? true : r92) {
                                    shader.setLocalMatrix(this.f74c);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(bVar.f49i * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i13 = cVar2.f16146c;
                                    float f18 = bVar.f49i;
                                    PorterDuff.Mode mode = f.f38r;
                                    paint2.setColor((i13 & 16777215) | (((int) (Color.alpha(i13) * f18)) << 24));
                                }
                                paint2.setColorFilter(null);
                                this.f73b.setFillType(bVar.f69c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(this.f73b, paint2);
                            }
                            w.c cVar3 = bVar.f46e;
                            if ((cVar3.f16144a != null) || cVar3.f16146c != 0) {
                                if (this.f75d == null) {
                                    z10 = true;
                                    Paint paint3 = new Paint(1);
                                    this.f75d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                } else {
                                    z10 = true;
                                }
                                Paint paint4 = this.f75d;
                                Paint.Join join = bVar.f54n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = bVar.f53m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(bVar.f55o);
                                Shader shader2 = cVar3.f16144a;
                                if (shader2 == null) {
                                    z10 = false;
                                }
                                if (z10) {
                                    shader2.setLocalMatrix(this.f74c);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(bVar.f48h * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i14 = cVar3.f16146c;
                                    float f19 = bVar.f48h;
                                    PorterDuff.Mode mode2 = f.f38r;
                                    paint4.setColor((i14 & 16777215) | (((int) (Color.alpha(i14) * f19)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(bVar.f * abs * min);
                                canvas.drawPath(this.f73b, paint4);
                            }
                        }
                    }
                    c0002f = this;
                    i12++;
                    r92 = 0;
                }
                i12++;
                r92 = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f82l;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f82l = i10;
        }
    }

    public static class g extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public int f86a;

        /* renamed from: b, reason: collision with root package name */
        public C0002f f87b;

        /* renamed from: c, reason: collision with root package name */
        public ColorStateList f88c;

        /* renamed from: d, reason: collision with root package name */
        public PorterDuff.Mode f89d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f90e;
        public Bitmap f;

        /* renamed from: g, reason: collision with root package name */
        public ColorStateList f91g;

        /* renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f92h;

        /* renamed from: i, reason: collision with root package name */
        public int f93i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f94j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f95k;

        /* renamed from: l, reason: collision with root package name */
        public Paint f96l;

        public g() {
            this.f88c = null;
            this.f89d = f.f38r;
            this.f87b = new C0002f();
        }

        public g(g gVar) {
            this.f88c = null;
            this.f89d = f.f38r;
            if (gVar != null) {
                this.f86a = gVar.f86a;
                C0002f c0002f = new C0002f(gVar.f87b);
                this.f87b = c0002f;
                if (gVar.f87b.f76e != null) {
                    c0002f.f76e = new Paint(gVar.f87b.f76e);
                }
                if (gVar.f87b.f75d != null) {
                    this.f87b.f75d = new Paint(gVar.f87b.f75d);
                }
                this.f88c = gVar.f88c;
                this.f89d = gVar.f89d;
                this.f90e = gVar.f90e;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f86a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new f(this);
        }
    }

    public static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f97a;

        public h(Drawable.ConstantState constantState) {
            this.f97a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f97a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f97a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            f fVar = new f();
            fVar.f37a = (VectorDrawable) this.f97a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f37a = (VectorDrawable) this.f97a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f37a = (VectorDrawable) this.f97a.newDrawable(resources, theme);
            return fVar;
        }
    }

    public f() {
        this.f = true;
        this.f43o = new float[9];
        this.f44p = new Matrix();
        this.f45q = new Rect();
        this.f39b = new g();
    }

    public f(g gVar) {
        this.f = true;
        this.f43o = new float[9];
        this.f44p = new Matrix();
        this.f45q = new Rect();
        this.f39b = gVar;
        this.f40c = a(gVar.f88c, gVar.f89d);
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f37a;
        if (drawable == null) {
            return false;
        }
        a.C0261a.b(drawable);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
    
        if ((r15 == r8.getWidth() && r3 == r6.f.getHeight()) == false) goto L40;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.f.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f37a;
        return drawable != null ? drawable.getAlpha() : this.f39b.f87b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f37a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f39b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f37a;
        return drawable != null ? a.C0261a.c(drawable) : this.f41d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f37a != null && Build.VERSION.SDK_INT >= 24) {
            return new h(this.f37a.getConstantState());
        }
        this.f39b.f86a = getChangingConfigurations();
        return this.f39b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f37a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f39b.f87b.f79i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f37a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f39b.f87b.f78h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.f.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f37a;
        return drawable != null ? drawable.isAutoMirrored() : this.f39b.f90e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f37a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            g gVar = this.f39b;
            if (gVar != null) {
                C0002f c0002f = gVar.f87b;
                if (c0002f.f84n == null) {
                    c0002f.f84n = Boolean.valueOf(c0002f.f77g.a());
                }
                if (c0002f.f84n.booleanValue() || ((colorStateList = this.f39b.f88c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f42e && super.mutate() == this) {
            this.f39b = new g(this.f39b);
            this.f42e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f37a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z10 = false;
        g gVar = this.f39b;
        ColorStateList colorStateList = gVar.f88c;
        if (colorStateList != null && (mode = gVar.f89d) != null) {
            this.f40c = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        C0002f c0002f = gVar.f87b;
        if (c0002f.f84n == null) {
            c0002f.f84n = Boolean.valueOf(c0002f.f77g.a());
        }
        if (c0002f.f84n.booleanValue()) {
            boolean b10 = gVar.f87b.f77g.b(iArr);
            gVar.f95k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f39b.f87b.getRootAlpha() != i10) {
            this.f39b.f87b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f39b.f90e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f41d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            y.a.a(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            a.C0261a.h(drawable, colorStateList);
            return;
        }
        g gVar = this.f39b;
        if (gVar.f88c != colorStateList) {
            gVar.f88c = colorStateList;
            this.f40c = a(colorStateList, gVar.f89d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            a.C0261a.i(drawable, mode);
            return;
        }
        g gVar = this.f39b;
        if (gVar.f89d != mode) {
            gVar.f89d = mode;
            this.f40c = a(gVar.f88c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f37a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f37a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public static class c extends d {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f56a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<d> f57b;

        /* renamed from: c, reason: collision with root package name */
        public float f58c;

        /* renamed from: d, reason: collision with root package name */
        public float f59d;

        /* renamed from: e, reason: collision with root package name */
        public float f60e;
        public float f;

        /* renamed from: g, reason: collision with root package name */
        public float f61g;

        /* renamed from: h, reason: collision with root package name */
        public float f62h;

        /* renamed from: i, reason: collision with root package name */
        public float f63i;

        /* renamed from: j, reason: collision with root package name */
        public final Matrix f64j;

        /* renamed from: k, reason: collision with root package name */
        public int f65k;

        /* renamed from: l, reason: collision with root package name */
        public String f66l;

        public c() {
            this.f56a = new Matrix();
            this.f57b = new ArrayList<>();
            this.f58c = 0.0f;
            this.f59d = 0.0f;
            this.f60e = 0.0f;
            this.f = 1.0f;
            this.f61g = 1.0f;
            this.f62h = 0.0f;
            this.f63i = 0.0f;
            this.f64j = new Matrix();
            this.f66l = null;
        }

        @Override // a2.f.d
        public final boolean a() {
            for (int i10 = 0; i10 < this.f57b.size(); i10++) {
                if (this.f57b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // a2.f.d
        public final boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f57b.size(); i10++) {
                z10 |= this.f57b.get(i10).b(iArr);
            }
            return z10;
        }

        public final void c() {
            this.f64j.reset();
            this.f64j.postTranslate(-this.f59d, -this.f60e);
            this.f64j.postScale(this.f, this.f61g);
            this.f64j.postRotate(this.f58c, 0.0f, 0.0f);
            this.f64j.postTranslate(this.f62h + this.f59d, this.f63i + this.f60e);
        }

        public String getGroupName() {
            return this.f66l;
        }

        public Matrix getLocalMatrix() {
            return this.f64j;
        }

        public float getPivotX() {
            return this.f59d;
        }

        public float getPivotY() {
            return this.f60e;
        }

        public float getRotation() {
            return this.f58c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.f61g;
        }

        public float getTranslateX() {
            return this.f62h;
        }

        public float getTranslateY() {
            return this.f63i;
        }

        public void setPivotX(float f) {
            if (f != this.f59d) {
                this.f59d = f;
                c();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f60e) {
                this.f60e = f;
                c();
            }
        }

        public void setRotation(float f) {
            if (f != this.f58c) {
                this.f58c = f;
                c();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                c();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f61g) {
                this.f61g = f;
                c();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f62h) {
                this.f62h = f;
                c();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f63i) {
                this.f63i = f;
                c();
            }
        }

        public c(c cVar, r.b<String, Object> bVar) {
            e aVar;
            this.f56a = new Matrix();
            this.f57b = new ArrayList<>();
            this.f58c = 0.0f;
            this.f59d = 0.0f;
            this.f60e = 0.0f;
            this.f = 1.0f;
            this.f61g = 1.0f;
            this.f62h = 0.0f;
            this.f63i = 0.0f;
            Matrix matrix = new Matrix();
            this.f64j = matrix;
            this.f66l = null;
            this.f58c = cVar.f58c;
            this.f59d = cVar.f59d;
            this.f60e = cVar.f60e;
            this.f = cVar.f;
            this.f61g = cVar.f61g;
            this.f62h = cVar.f62h;
            this.f63i = cVar.f63i;
            String str = cVar.f66l;
            this.f66l = str;
            this.f65k = cVar.f65k;
            if (str != null) {
                bVar.put(str, this);
            }
            matrix.set(cVar.f64j);
            ArrayList<d> arrayList = cVar.f57b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                d dVar = arrayList.get(i10);
                if (dVar instanceof c) {
                    this.f57b.add(new c((c) dVar, bVar));
                } else {
                    if (dVar instanceof b) {
                        aVar = new b((b) dVar);
                    } else {
                        if (!(dVar instanceof a)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        aVar = new a((a) dVar);
                    }
                    this.f57b.add(aVar);
                    String str2 = aVar.f68b;
                    if (str2 != null) {
                        bVar.put(str2, aVar);
                    }
                }
            }
        }
    }

    public static abstract class e extends d {

        /* renamed from: a, reason: collision with root package name */
        public d.a[] f67a;

        /* renamed from: b, reason: collision with root package name */
        public String f68b;

        /* renamed from: c, reason: collision with root package name */
        public int f69c;

        /* renamed from: d, reason: collision with root package name */
        public int f70d;

        public e() {
            this.f67a = null;
            this.f69c = 0;
        }

        public d.a[] getPathData() {
            return this.f67a;
        }

        public String getPathName() {
            return this.f68b;
        }

        public void setPathData(d.a[] aVarArr) {
            if (!x.d.a(this.f67a, aVarArr)) {
                this.f67a = x.d.e(aVarArr);
                return;
            }
            d.a[] aVarArr2 = this.f67a;
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                aVarArr2[i10].f16496a = aVarArr[i10].f16496a;
                int i11 = 0;
                while (true) {
                    float[] fArr = aVarArr[i10].f16497b;
                    if (i11 < fArr.length) {
                        aVarArr2[i10].f16497b[i11] = fArr[i11];
                        i11++;
                    }
                }
            }
        }

        public e(e eVar) {
            this.f67a = null;
            this.f69c = 0;
            this.f68b = eVar.f68b;
            this.f70d = eVar.f70d;
            this.f67a = x.d.e(eVar.f67a);
        }
    }
}
