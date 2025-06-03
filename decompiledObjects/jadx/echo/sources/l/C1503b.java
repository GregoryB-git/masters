package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1503b extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final ActionBarContainer f16428a;

    public C1503b(ActionBarContainer actionBarContainer) {
        this.f16428a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f16428a;
        if (actionBarContainer.f8544v) {
            Drawable drawable = actionBarContainer.f8543u;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f8541s;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f16428a;
        Drawable drawable3 = actionBarContainer2.f8542t;
        if (drawable3 == null || !actionBarContainer2.f8545w) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f16428a;
        if (actionBarContainer.f8544v) {
            drawable = actionBarContainer.f8543u;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f8541s;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
