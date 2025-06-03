package t0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class i extends f {
    public i(e eVar) {
        super(eVar);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f, int i12, int i13, int i14, Paint paint) {
        androidx.emoji2.text.d.a().getClass();
        e eVar = this.f14396b;
        Typeface typeface = eVar.f14393b.f1015d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(eVar.f14393b.f1013b, eVar.f14392a * 2, 2, f, i13, paint);
        paint.setTypeface(typeface2);
    }
}
