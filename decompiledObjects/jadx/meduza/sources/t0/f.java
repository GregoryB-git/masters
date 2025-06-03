package t0;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class f extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final e f14396b;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f14395a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public float f14397c = 1.0f;

    public f(e eVar) {
        if (eVar == null) {
            throw new NullPointerException("metadata cannot be null");
        }
        this.f14396b = eVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f14395a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f14395a;
        this.f14397c = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / (this.f14396b.c().a(14) != 0 ? r4.f14883b.getShort(r6 + r4.f14882a) : (short) 0);
        u0.a c10 = this.f14396b.c();
        int a10 = c10.a(14);
        if (a10 != 0) {
            c10.f14883b.getShort(a10 + c10.f14882a);
        }
        short s10 = (short) ((this.f14396b.c().a(12) != 0 ? r3.f14883b.getShort(r4 + r3.f14882a) : (short) 0) * this.f14397c);
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f14395a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s10;
    }
}
