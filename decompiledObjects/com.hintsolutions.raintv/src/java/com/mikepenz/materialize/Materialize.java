/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.ViewGroup
 *  java.lang.Object
 */
package com.mikepenz.materialize;

import android.app.Activity;
import android.view.ViewGroup;
import com.mikepenz.materialize.MaterializeBuilder;
import com.mikepenz.materialize.util.KeyboardUtil;
import com.mikepenz.materialize.view.IScrimInsetsLayout;

public class Materialize {
    private final MaterializeBuilder mBuilder;
    private KeyboardUtil mKeyboardUtil = null;

    public Materialize(MaterializeBuilder materializeBuilder) {
        this.mBuilder = materializeBuilder;
    }

    public ViewGroup getContent() {
        return this.mBuilder.mContentRoot;
    }

    public IScrimInsetsLayout getScrimInsetsFrameLayout() {
        return this.mBuilder.mScrimInsetsLayout;
    }

    public void keyboardSupportEnabled(Activity object, boolean bl) {
        if (this.getContent() != null && this.getContent().getChildCount() > 0) {
            if (this.mKeyboardUtil == null) {
                object = new KeyboardUtil((Activity)object, this.getContent().getChildAt(0));
                this.mKeyboardUtil = object;
                ((KeyboardUtil)object).disable();
            }
            if (bl) {
                this.mKeyboardUtil.enable();
            } else {
                this.mKeyboardUtil.disable();
            }
        }
    }

    public void setFullscreen(boolean bl) {
        IScrimInsetsLayout iScrimInsetsLayout = this.mBuilder.mScrimInsetsLayout;
        if (iScrimInsetsLayout != null) {
            iScrimInsetsLayout.setTintStatusBar(bl ^ true);
            this.mBuilder.mScrimInsetsLayout.setTintNavigationBar(bl ^ true);
        }
    }

    public void setStatusBarColor(int n) {
        IScrimInsetsLayout iScrimInsetsLayout = this.mBuilder.mScrimInsetsLayout;
        if (iScrimInsetsLayout != null) {
            iScrimInsetsLayout.setInsetForeground(n);
            this.mBuilder.mScrimInsetsLayout.getView().invalidate();
        }
    }

    public void setTintNavigationBar(boolean bl) {
        IScrimInsetsLayout iScrimInsetsLayout = this.mBuilder.mScrimInsetsLayout;
        if (iScrimInsetsLayout != null) {
            iScrimInsetsLayout.setTintNavigationBar(bl);
        }
    }

    public void setTintStatusBar(boolean bl) {
        IScrimInsetsLayout iScrimInsetsLayout = this.mBuilder.mScrimInsetsLayout;
        if (iScrimInsetsLayout != null) {
            iScrimInsetsLayout.setTintStatusBar(bl);
        }
    }
}

