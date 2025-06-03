/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Outline
 *  android.graphics.drawable.Drawable
 */
package l;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

public class b
extends Drawable {
    public final ActionBarContainer a;

    public b(ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.v) {
            actionBarContainer = actionBarContainer.u;
            if (actionBarContainer != null) {
                actionBarContainer.draw(canvas);
                return;
            }
        } else {
            actionBarContainer = actionBarContainer.s;
            if (actionBarContainer != null) {
                actionBarContainer.draw(canvas);
            }
            actionBarContainer = this.a;
            Drawable drawable2 = actionBarContainer.t;
            if (drawable2 != null && actionBarContainer.w) {
                drawable2.draw(canvas);
            }
        }
    }

    public int getOpacity() {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.a;
        if (actionBarContainer.v ? (actionBarContainer = actionBarContainer.u) != null : (actionBarContainer = actionBarContainer.s) != null) {
            actionBarContainer.getOutline(outline);
            return;
        }
    }

    public void setAlpha(int n8) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}

