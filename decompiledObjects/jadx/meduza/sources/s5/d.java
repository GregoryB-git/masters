package s5;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class d {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* renamed from: a, reason: collision with root package name */
    public final float f14202a;

    /* renamed from: b, reason: collision with root package name */
    public final float f14203b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14204c;

    /* renamed from: d, reason: collision with root package name */
    public final float f14205d;

    /* renamed from: e, reason: collision with root package name */
    public final float f14206e;
    public final TextPaint f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f14207g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f14208h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f14209i;

    /* renamed from: j, reason: collision with root package name */
    public Layout.Alignment f14210j;

    /* renamed from: k, reason: collision with root package name */
    public Bitmap f14211k;

    /* renamed from: l, reason: collision with root package name */
    public float f14212l;

    /* renamed from: m, reason: collision with root package name */
    public int f14213m;

    /* renamed from: n, reason: collision with root package name */
    public int f14214n;

    /* renamed from: o, reason: collision with root package name */
    public float f14215o;

    /* renamed from: p, reason: collision with root package name */
    public int f14216p;

    /* renamed from: q, reason: collision with root package name */
    public float f14217q;

    /* renamed from: r, reason: collision with root package name */
    public float f14218r;

    /* renamed from: s, reason: collision with root package name */
    public int f14219s;
    public int t;

    /* renamed from: u, reason: collision with root package name */
    public int f14220u;

    /* renamed from: v, reason: collision with root package name */
    public int f14221v;

    /* renamed from: w, reason: collision with root package name */
    public int f14222w;

    /* renamed from: x, reason: collision with root package name */
    public float f14223x;

    /* renamed from: y, reason: collision with root package name */
    public float f14224y;

    /* renamed from: z, reason: collision with root package name */
    public float f14225z;

    public d(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f14206e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f14205d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f14202a = round;
        this.f14203b = round;
        this.f14204c = round;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f14207g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f14208h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z10) {
        if (!z10) {
            this.J.getClass();
            this.f14211k.getClass();
            canvas.drawBitmap(this.f14211k, (Rect) null, this.J, this.f14208h);
            return;
        }
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f14220u) > 0) {
            this.f14207g.setColor(this.f14220u);
            canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f14207g);
        }
        int i10 = this.f14222w;
        if (i10 == 1) {
            this.f.setStrokeJoin(Paint.Join.ROUND);
            this.f.setStrokeWidth(this.f14202a);
            this.f.setColor(this.f14221v);
            this.f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i10 == 2) {
            TextPaint textPaint = this.f;
            float f = this.f14203b;
            float f10 = this.f14204c;
            textPaint.setShadowLayer(f, f10, f10, this.f14221v);
        } else if (i10 == 3 || i10 == 4) {
            boolean z11 = i10 == 3;
            int i11 = z11 ? -1 : this.f14221v;
            int i12 = z11 ? this.f14221v : -1;
            float f11 = this.f14203b / 2.0f;
            this.f.setColor(this.f14219s);
            this.f.setStyle(Paint.Style.FILL);
            float f12 = -f11;
            this.f.setShadowLayer(this.f14203b, f12, f12, i11);
            staticLayout2.draw(canvas);
            this.f.setShadowLayer(this.f14203b, f11, f11, i12);
        }
        this.f.setColor(this.f14219s);
        this.f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }
}
