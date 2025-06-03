package l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import io.meduza.meduza.R;

/* loaded from: classes.dex */
public final class w extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final x f9485a;

    public w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        u0.a(this, getContext());
        x xVar = new x(this);
        this.f9485a = xVar;
        xVar.a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        x xVar = this.f9485a;
        Drawable drawable = xVar.f9488e;
        if (drawable != null && drawable.isStateful() && drawable.setState(xVar.f9487d.getDrawableState())) {
            xVar.f9487d.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9485a.f9488e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f9485a.d(canvas);
    }
}
