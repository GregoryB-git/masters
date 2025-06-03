/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  androidx.core.view.OnApplyWindowInsetsListener
 *  androidx.core.view.ViewCompat
 *  androidx.core.view.WindowInsetsCompat
 *  java.lang.Object
 *  java.lang.Override
 */
package com.mikepenz.materialize.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.mikepenz.materialize.R;
import com.mikepenz.materialize.view.IScrimInsetsLayout;
import com.mikepenz.materialize.view.OnInsetsCallback;

public class ScrimInsetsFrameLayout
extends FrameLayout
implements IScrimInsetsLayout {
    private Drawable mInsetForeground;
    private Rect mInsets;
    private OnInsetsCallback mOnInsetsCallback;
    private boolean mSystemUIVisible = true;
    private Rect mTempRect = new Rect();
    private boolean mTintNavigationBar = true;
    private boolean mTintStatusBar = true;

    public ScrimInsetsFrameLayout(Context context) {
        super(context);
        this.init(context, null, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.init(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        this.init(context, attributeSet, n);
    }

    public static /* synthetic */ Rect access$002(ScrimInsetsFrameLayout scrimInsetsFrameLayout, Rect rect) {
        scrimInsetsFrameLayout.mInsets = rect;
        return rect;
    }

    private void init(Context context, AttributeSet attributeSet, int n) {
        context = context.obtainStyledAttributes(attributeSet, R.styleable.ScrimInsetsView, n, R.style.Widget_Materialize_ScrimInsetsRelativeLayout);
        this.mInsetForeground = context.getDrawable(R.styleable.ScrimInsetsView_siv_insetForeground);
        context.recycle();
        this.setWillNotDraw(true);
        ViewCompat.setOnApplyWindowInsetsListener((View)this, (OnApplyWindowInsetsListener)new OnApplyWindowInsetsListener(this){
            public final ScrimInsetsFrameLayout this$0;
            {
                this.this$0 = scrimInsetsFrameLayout;
            }

            public WindowInsetsCompat onApplyWindowInsets(View object, WindowInsetsCompat windowInsetsCompat) {
                if (this.this$0.mInsets == null) {
                    ScrimInsetsFrameLayout.access$002(this.this$0, new Rect());
                }
                this.this$0.mInsets.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                object = this.this$0;
                boolean bl = ((ScrimInsetsFrameLayout)object).mInsetForeground == null;
                object.setWillNotDraw(bl);
                ViewCompat.postInvalidateOnAnimation((View)this.this$0);
                if (this.this$0.mOnInsetsCallback != null) {
                    this.this$0.mOnInsetsCallback.onInsetsChanged(windowInsetsCompat);
                }
                return windowInsetsCompat.consumeSystemWindowInsets();
            }
        });
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int n = this.getWidth();
        int n2 = this.getHeight();
        if (this.mInsets != null && this.mInsetForeground != null) {
            Rect rect;
            int n3 = canvas.save();
            canvas.translate((float)this.getScrollX(), (float)this.getScrollY());
            if (!this.mSystemUIVisible) {
                rect = this.mInsets;
                rect.top = 0;
                rect.right = 0;
                rect.bottom = 0;
                rect.left = 0;
            }
            if (this.mTintStatusBar) {
                this.mTempRect.set(0, 0, n, this.mInsets.top);
                this.mInsetForeground.setBounds(this.mTempRect);
                this.mInsetForeground.draw(canvas);
            }
            if (this.mTintNavigationBar) {
                this.mTempRect.set(0, n2 - this.mInsets.bottom, n, n2);
                this.mInsetForeground.setBounds(this.mTempRect);
                this.mInsetForeground.draw(canvas);
            }
            rect = this.mTempRect;
            Rect rect2 = this.mInsets;
            rect.set(0, rect2.top, rect2.left, n2 - rect2.bottom);
            this.mInsetForeground.setBounds(this.mTempRect);
            this.mInsetForeground.draw(canvas);
            rect = this.mTempRect;
            rect2 = this.mInsets;
            rect.set(n - rect2.right, rect2.top, n, n2 - rect2.bottom);
            this.mInsetForeground.setBounds(this.mTempRect);
            this.mInsetForeground.draw(canvas);
            canvas.restoreToCount(n3);
        }
    }

    @Override
    public Drawable getInsetForeground() {
        return this.mInsetForeground;
    }

    @Override
    public OnInsetsCallback getOnInsetsCallback() {
        return this.mOnInsetsCallback;
    }

    @Override
    public ViewGroup getView() {
        return this;
    }

    @Override
    public boolean isSystemUIVisible() {
        return this.mSystemUIVisible;
    }

    @Override
    public boolean isTintNavigationBar() {
        return this.mTintNavigationBar;
    }

    @Override
    public boolean isTintStatusBar() {
        return this.mTintStatusBar;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.mInsetForeground;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback)this);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.mInsetForeground;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    @Override
    public void setInsetForeground(int n) {
        this.mInsetForeground = new ColorDrawable(n);
    }

    @Override
    public void setInsetForeground(Drawable drawable) {
        this.mInsetForeground = drawable;
    }

    @Override
    public void setOnInsetsCallback(OnInsetsCallback onInsetsCallback) {
        this.mOnInsetsCallback = onInsetsCallback;
    }

    @Override
    public void setSystemUIVisible(boolean bl) {
        this.mSystemUIVisible = bl;
    }

    @Override
    public void setTintNavigationBar(boolean bl) {
        this.mTintNavigationBar = bl;
    }

    @Override
    public void setTintStatusBar(boolean bl) {
        this.mTintStatusBar = bl;
    }
}

