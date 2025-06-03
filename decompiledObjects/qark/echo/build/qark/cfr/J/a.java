/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.style.ClickableSpan
 *  android.view.View
 *  java.lang.String
 */
package J;

import J.u;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a
extends ClickableSpan {
    public final int a;
    public final u b;
    public final int c;

    public a(int n8, u u8, int n9) {
        this.a = n8;
        this.b = u8;
        this.c = n9;
    }

    public void onClick(View view) {
        view = new Bundle();
        view.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.F(this.c, (Bundle)view);
    }
}

