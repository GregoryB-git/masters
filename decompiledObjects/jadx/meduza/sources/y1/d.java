package y1;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public final class d extends Drawable implements Animatable {

    /* renamed from: o, reason: collision with root package name */
    public static final LinearInterpolator f17321o = new LinearInterpolator();

    /* renamed from: p, reason: collision with root package name */
    public static final z0.a f17322p = new z0.a();

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f17323q = {-16777216};

    /* renamed from: a, reason: collision with root package name */
    public final a f17324a;

    /* renamed from: b, reason: collision with root package name */
    public float f17325b;

    /* renamed from: c, reason: collision with root package name */
    public Resources f17326c;

    /* renamed from: d, reason: collision with root package name */
    public ValueAnimator f17327d;

    /* renamed from: e, reason: collision with root package name */
    public float f17328e;
    public boolean f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final RectF f17329a = new RectF();

        /* renamed from: b, reason: collision with root package name */
        public final Paint f17330b;

        /* renamed from: c, reason: collision with root package name */
        public final Paint f17331c;

        /* renamed from: d, reason: collision with root package name */
        public final Paint f17332d;

        /* renamed from: e, reason: collision with root package name */
        public float f17333e;
        public float f;

        /* renamed from: g, reason: collision with root package name */
        public float f17334g;

        /* renamed from: h, reason: collision with root package name */
        public float f17335h;

        /* renamed from: i, reason: collision with root package name */
        public int[] f17336i;

        /* renamed from: j, reason: collision with root package name */
        public int f17337j;

        /* renamed from: k, reason: collision with root package name */
        public float f17338k;

        /* renamed from: l, reason: collision with root package name */
        public float f17339l;

        /* renamed from: m, reason: collision with root package name */
        public float f17340m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f17341n;

        /* renamed from: o, reason: collision with root package name */
        public Path f17342o;

        /* renamed from: p, reason: collision with root package name */
        public float f17343p;

        /* renamed from: q, reason: collision with root package name */
        public float f17344q;

        /* renamed from: r, reason: collision with root package name */
        public int f17345r;

        /* renamed from: s, reason: collision with root package name */
        public int f17346s;
        public int t;

        /* renamed from: u, reason: collision with root package name */
        public int f17347u;

        public a() {
            Paint paint = new Paint();
            this.f17330b = paint;
            Paint paint2 = new Paint();
            this.f17331c = paint2;
            Paint paint3 = new Paint();
            this.f17332d = paint3;
            this.f17333e = 0.0f;
            this.f = 0.0f;
            this.f17334g = 0.0f;
            this.f17335h = 5.0f;
            this.f17343p = 1.0f;
            this.t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public final void a(int i10) {
            this.f17337j = i10;
            this.f17347u = this.f17336i[i10];
        }
    }

    public d(Context context) {
        context.getClass();
        this.f17326c = context.getResources();
        a aVar = new a();
        this.f17324a = aVar;
        aVar.f17336i = f17323q;
        aVar.a(0);
        aVar.f17335h = 2.5f;
        aVar.f17330b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(this, aVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f17321o);
        ofFloat.addListener(new c(this, aVar));
        this.f17327d = ofFloat;
    }

    public static void c(float f, a aVar) {
        int i10;
        if (f > 0.75f) {
            float f10 = (f - 0.75f) / 0.25f;
            int[] iArr = aVar.f17336i;
            int i11 = aVar.f17337j;
            int i12 = iArr[i11];
            int i13 = iArr[(i11 + 1) % iArr.length];
            i10 = ((((i12 >> 24) & 255) + ((int) ((((i13 >> 24) & 255) - r1) * f10))) << 24) | ((((i12 >> 16) & 255) + ((int) ((((i13 >> 16) & 255) - r3) * f10))) << 16) | ((((i12 >> 8) & 255) + ((int) ((((i13 >> 8) & 255) - r4) * f10))) << 8) | ((i12 & 255) + ((int) (f10 * ((i13 & 255) - r2))));
        } else {
            i10 = aVar.f17336i[aVar.f17337j];
        }
        aVar.f17347u = i10;
    }

    public final void a(float f, a aVar, boolean z10) {
        float interpolation;
        float f10;
        if (this.f) {
            c(f, aVar);
            float floor = (float) (Math.floor(aVar.f17340m / 0.8f) + 1.0d);
            float f11 = aVar.f17338k;
            float f12 = aVar.f17339l;
            aVar.f17333e = (((f12 - 0.01f) - f11) * f) + f11;
            aVar.f = f12;
            float f13 = aVar.f17340m;
            aVar.f17334g = ((floor - f13) * f) + f13;
            return;
        }
        if (f != 1.0f || z10) {
            float f14 = aVar.f17340m;
            if (f < 0.5f) {
                interpolation = aVar.f17338k;
                f10 = (f17322p.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f15 = aVar.f17338k + 0.79f;
                interpolation = f15 - (((1.0f - f17322p.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f10 = f15;
            }
            float f16 = (0.20999998f * f) + f14;
            float f17 = (f + this.f17328e) * 216.0f;
            aVar.f17333e = interpolation;
            aVar.f = f10;
            aVar.f17334g = f16;
            this.f17325b = f17;
        }
    }

    public final void b(float f, float f10, float f11, float f12) {
        a aVar = this.f17324a;
        float f13 = this.f17326c.getDisplayMetrics().density;
        float f14 = f10 * f13;
        aVar.f17335h = f14;
        aVar.f17330b.setStrokeWidth(f14);
        aVar.f17344q = f * f13;
        aVar.a(0);
        aVar.f17345r = (int) (f11 * f13);
        aVar.f17346s = (int) (f12 * f13);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f17325b, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.f17324a;
        RectF rectF = aVar.f17329a;
        float f = aVar.f17344q;
        float f10 = (aVar.f17335h / 2.0f) + f;
        if (f <= 0.0f) {
            f10 = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((aVar.f17345r * aVar.f17343p) / 2.0f, aVar.f17335h / 2.0f);
        }
        rectF.set(bounds.centerX() - f10, bounds.centerY() - f10, bounds.centerX() + f10, bounds.centerY() + f10);
        float f11 = aVar.f17333e;
        float f12 = aVar.f17334g;
        float f13 = (f11 + f12) * 360.0f;
        float f14 = ((aVar.f + f12) * 360.0f) - f13;
        aVar.f17330b.setColor(aVar.f17347u);
        aVar.f17330b.setAlpha(aVar.t);
        float f15 = aVar.f17335h / 2.0f;
        rectF.inset(f15, f15);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.f17332d);
        float f16 = -f15;
        rectF.inset(f16, f16);
        canvas.drawArc(rectF, f13, f14, false, aVar.f17330b);
        if (aVar.f17341n) {
            Path path = aVar.f17342o;
            if (path == null) {
                Path path2 = new Path();
                aVar.f17342o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f17 = (aVar.f17345r * aVar.f17343p) / 2.0f;
            aVar.f17342o.moveTo(0.0f, 0.0f);
            aVar.f17342o.lineTo(aVar.f17345r * aVar.f17343p, 0.0f);
            Path path3 = aVar.f17342o;
            float f18 = aVar.f17345r;
            float f19 = aVar.f17343p;
            path3.lineTo((f18 * f19) / 2.0f, aVar.f17346s * f19);
            aVar.f17342o.offset((rectF.centerX() + min) - f17, (aVar.f17335h / 2.0f) + rectF.centerY());
            aVar.f17342o.close();
            aVar.f17331c.setColor(aVar.f17347u);
            aVar.f17331c.setAlpha(aVar.t);
            canvas.save();
            canvas.rotate(f13 + f14, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.f17342o, aVar.f17331c);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f17324a.t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f17327d.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f17324a.t = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17324a.f17330b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        ValueAnimator valueAnimator;
        long j10;
        this.f17327d.cancel();
        a aVar = this.f17324a;
        float f = aVar.f17333e;
        aVar.f17338k = f;
        float f10 = aVar.f;
        aVar.f17339l = f10;
        aVar.f17340m = aVar.f17334g;
        if (f10 != f) {
            this.f = true;
            valueAnimator = this.f17327d;
            j10 = 666;
        } else {
            aVar.a(0);
            a aVar2 = this.f17324a;
            aVar2.f17338k = 0.0f;
            aVar2.f17339l = 0.0f;
            aVar2.f17340m = 0.0f;
            aVar2.f17333e = 0.0f;
            aVar2.f = 0.0f;
            aVar2.f17334g = 0.0f;
            valueAnimator = this.f17327d;
            j10 = 1332;
        }
        valueAnimator.setDuration(j10);
        this.f17327d.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f17327d.cancel();
        this.f17325b = 0.0f;
        a aVar = this.f17324a;
        if (aVar.f17341n) {
            aVar.f17341n = false;
        }
        aVar.a(0);
        a aVar2 = this.f17324a;
        aVar2.f17338k = 0.0f;
        aVar2.f17339l = 0.0f;
        aVar2.f17340m = 0.0f;
        aVar2.f17333e = 0.0f;
        aVar2.f = 0.0f;
        aVar2.f17334g = 0.0f;
        invalidateSelf();
    }
}
