/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.ImageButton
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import com.twitter.sdk.android.tweetui.R;

public class ToggleImageButton
extends ImageButton {
    private static final int[] STATE_TOGGLED_ON = new int[]{R.attr.state_toggled_on};
    public String contentDescriptionOff;
    public String contentDescriptionOn;
    public boolean isToggledOn;
    public final boolean toggleOnClick;

    public ToggleImageButton(Context context) {
        this(context, null);
    }

    public ToggleImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ToggleImageButton(Context object, AttributeSet attributeSet, int n) {
        AttributeSet attributeSet2;
        block12: {
            String string2;
            block11: {
                super(object, attributeSet, n);
                attributeSet2 = null;
                try {
                    attributeSet2 = attributeSet = object.getTheme().obtainStyledAttributes(attributeSet, R.styleable.ToggleImageButton, n, 0);
                }
                catch (Throwable throwable) {
                    if (attributeSet2 != null) {
                        attributeSet2.recycle();
                    }
                    throw throwable;
                }
                String string3 = attributeSet.getString(R.styleable.ToggleImageButton_contentDescriptionOn);
                attributeSet2 = attributeSet;
                string2 = attributeSet.getString(R.styleable.ToggleImageButton_contentDescriptionOff);
                object = string3;
                if (string3 != null) break block11;
                attributeSet2 = attributeSet;
                object = (String)this.getContentDescription();
            }
            attributeSet2 = attributeSet;
            this.contentDescriptionOn = object;
            object = string2;
            if (string2 != null) break block12;
            attributeSet2 = attributeSet;
            object = (String)this.getContentDescription();
        }
        attributeSet2 = attributeSet;
        this.contentDescriptionOff = object;
        attributeSet2 = attributeSet;
        this.toggleOnClick = attributeSet.getBoolean(R.styleable.ToggleImageButton_toggleOnClick, true);
        attributeSet2 = attributeSet;
        this.setToggledOn(false);
        attributeSet.recycle();
    }

    public boolean isToggledOn() {
        return this.isToggledOn;
    }

    public int[] onCreateDrawableState(int n) {
        int[] nArray = super.onCreateDrawableState(n + 2);
        if (this.isToggledOn) {
            View.mergeDrawableStates((int[])nArray, (int[])STATE_TOGGLED_ON);
        }
        return nArray;
    }

    public boolean performClick() {
        if (this.toggleOnClick) {
            this.toggle();
        }
        return super.performClick();
    }

    public void setToggledOn(boolean bl) {
        this.isToggledOn = bl;
        String string2 = bl ? this.contentDescriptionOn : this.contentDescriptionOff;
        this.setContentDescription(string2);
        this.refreshDrawableState();
    }

    public void toggle() {
        this.setToggledOn(this.isToggledOn ^ true);
    }
}

