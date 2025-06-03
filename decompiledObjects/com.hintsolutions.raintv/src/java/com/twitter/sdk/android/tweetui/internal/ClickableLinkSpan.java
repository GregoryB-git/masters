/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextPaint
 *  android.text.style.ClickableSpan
 *  java.lang.Object
 *  java.lang.Override
 */
package com.twitter.sdk.android.tweetui.internal;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import com.twitter.sdk.android.tweetui.internal.HighlightedClickableSpan;

public abstract class ClickableLinkSpan
extends ClickableSpan
implements HighlightedClickableSpan {
    private final boolean colored;
    public final int linkColor;
    private boolean selected;
    private final int selectedColor;
    private final boolean underlined;

    public ClickableLinkSpan(int n, int n2, boolean bl) {
        this(n, n2, true, bl);
    }

    public ClickableLinkSpan(int n, int n2, boolean bl, boolean bl2) {
        this.selectedColor = n;
        this.linkColor = n2;
        this.colored = bl;
        this.underlined = bl2;
    }

    @Override
    public boolean isSelected() {
        return this.selected;
    }

    @Override
    public void select(boolean bl) {
        this.selected = bl;
    }

    public void updateDrawState(TextPaint textPaint) {
        if (this.colored) {
            textPaint.setColor(this.linkColor);
        } else {
            textPaint.setColor(textPaint.linkColor);
        }
        textPaint.bgColor = this.selected ? this.selectedColor : 0;
        if (this.underlined) {
            textPaint.setUnderlineText(true);
        }
    }
}

