/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable
 */
package me.zhanghai.android.materialprogressbar;

import me.zhanghai.android.materialprogressbar.BasePaintDrawable;
import me.zhanghai.android.materialprogressbar.IntrinsicPaddingDrawable;

abstract class BaseProgressDrawable
extends BasePaintDrawable
implements IntrinsicPaddingDrawable {
    public boolean mUseIntrinsicPadding = true;

    public boolean getUseIntrinsicPadding() {
        return this.mUseIntrinsicPadding;
    }

    public void setUseIntrinsicPadding(boolean bl) {
        if (this.mUseIntrinsicPadding != bl) {
            this.mUseIntrinsicPadding = bl;
            this.invalidateSelf();
        }
    }
}

