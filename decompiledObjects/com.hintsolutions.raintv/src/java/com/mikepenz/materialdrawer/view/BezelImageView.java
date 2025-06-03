/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.ColorFilter
 *  android.graphics.ColorMatrix
 *  android.graphics.ColorMatrixColorFilter
 *  android.graphics.Outline
 *  android.graphics.Paint
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Xfermode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.net.Uri
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewOutlineProvider
 *  android.widget.ImageView
 *  androidx.core.view.ViewCompat
 *  java.lang.Object
 */
package com.mikepenz.materialdrawer.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.mikepenz.materialdrawer.R;
import com.mikepenz.materialdrawer.util.DrawerImageLoader;

public class BezelImageView
extends ImageView {
    private boolean isPressed = false;
    private boolean isSelected;
    private Paint mBlackPaint;
    private Rect mBounds;
    private RectF mBoundsF;
    private Bitmap mCacheBitmap;
    private boolean mCacheValid = false;
    private int mCachedHeight;
    private int mCachedWidth;
    private ColorMatrixColorFilter mDesaturateColorFilter;
    private boolean mDrawCircularShadow = true;
    private Drawable mMaskDrawable;
    private Paint mMaskedPaint;
    private int mSelectorAlpha = 150;
    private int mSelectorColor;
    private ColorFilter mSelectorFilter;
    private ColorMatrixColorFilter mTempDesaturateColorFilter;
    private ColorFilter mTempSelectorFilter;

    public BezelImageView(Context context) {
        this(context, null);
    }

    public BezelImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BezelImageView(Context context, AttributeSet attributeSet, int n) {
        super(context, attributeSet, n);
        attributeSet = context.obtainStyledAttributes(attributeSet, R.styleable.BezelImageView, n, R.style.BezelImageView);
        context = attributeSet.getDrawable(R.styleable.BezelImageView_biv_maskDrawable);
        this.mMaskDrawable = context;
        if (context != null) {
            context.setCallback((Drawable.Callback)this);
        }
        this.mDrawCircularShadow = attributeSet.getBoolean(R.styleable.BezelImageView_biv_drawCircularShadow, true);
        this.mSelectorColor = attributeSet.getColor(R.styleable.BezelImageView_biv_selectorOnPress, 0);
        attributeSet.recycle();
        context = new Paint();
        this.mBlackPaint = context;
        context.setColor(-16777216);
        context = new Paint();
        this.mMaskedPaint = context;
        context.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.mCacheBitmap = Bitmap.createBitmap((int)1, (int)1, (Bitmap.Config)Bitmap.Config.ARGB_8888);
        context = new ColorMatrix();
        context.setSaturation(0.0f);
        this.mDesaturateColorFilter = new ColorMatrixColorFilter((ColorMatrix)context);
        if (this.mSelectorColor != 0) {
            this.mSelectorFilter = new PorterDuffColorFilter(Color.argb((int)this.mSelectorAlpha, (int)Color.red((int)this.mSelectorColor), (int)Color.green((int)this.mSelectorColor), (int)Color.blue((int)this.mSelectorColor)), PorterDuff.Mode.SRC_ATOP);
        }
    }

    public void disableTouchFeedback(boolean bl) {
        if (bl) {
            this.mTempDesaturateColorFilter = this.mDesaturateColorFilter;
            this.mTempSelectorFilter = this.mSelectorFilter;
            this.mSelectorFilter = null;
            this.mDesaturateColorFilter = null;
        } else {
            ColorMatrixColorFilter colorMatrixColorFilter = this.mTempDesaturateColorFilter;
            if (colorMatrixColorFilter != null) {
                this.mDesaturateColorFilter = colorMatrixColorFilter;
            }
            if ((colorMatrixColorFilter = this.mTempSelectorFilter) != null) {
                this.mSelectorFilter = colorMatrixColorFilter;
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.isClickable()) {
            this.isSelected = false;
            return super.onTouchEvent(motionEvent);
        }
        int n = motionEvent.getAction();
        if (n != 0) {
            if (n == 1 || n == 3 || n == 4 || n == 8) {
                this.isSelected = false;
            }
        } else {
            this.isSelected = true;
        }
        this.invalidate();
        return super.dispatchTouchEvent(motionEvent);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable2 = this.mMaskDrawable;
        if (drawable2 != null && drawable2.isStateful()) {
            this.mMaskDrawable.setState(this.getDrawableState());
        }
        if (this.isDuplicateParentStateEnabled()) {
            ViewCompat.postInvalidateOnAnimation((View)this);
        }
    }

    public void invalidateDrawable(Drawable drawable2) {
        if (drawable2 == this.mMaskDrawable) {
            this.invalidate();
        } else {
            super.invalidateDrawable(drawable2);
        }
    }

    public void onDraw(Canvas canvas) {
        Rect rect = this.mBounds;
        if (rect == null) {
            return;
        }
        int n = rect.width();
        int n2 = this.mBounds.height();
        if (n != 0 && n2 != 0) {
            Rect rect2;
            if (!this.mCacheValid || n != this.mCachedWidth || n2 != this.mCachedHeight || this.isSelected != this.isPressed) {
                if (n == this.mCachedWidth && n2 == this.mCachedHeight) {
                    this.mCacheBitmap.eraseColor(0);
                } else {
                    this.mCacheBitmap.recycle();
                    this.mCacheBitmap = Bitmap.createBitmap((int)n, (int)n2, (Bitmap.Config)Bitmap.Config.ARGB_8888);
                    this.mCachedWidth = n;
                    this.mCachedHeight = n2;
                }
                rect = new Canvas(this.mCacheBitmap);
                if (this.mMaskDrawable != null) {
                    n2 = rect.save();
                    this.mMaskDrawable.draw((Canvas)rect);
                    if (this.isSelected) {
                        rect2 = this.mSelectorFilter;
                        if (rect2 != null) {
                            this.mMaskedPaint.setColorFilter((ColorFilter)rect2);
                        } else {
                            this.mMaskedPaint.setColorFilter((ColorFilter)this.mDesaturateColorFilter);
                        }
                    } else {
                        this.mMaskedPaint.setColorFilter(null);
                    }
                    rect.saveLayer(this.mBoundsF, this.mMaskedPaint, 12);
                    super.onDraw((Canvas)rect);
                    rect.restoreToCount(n2);
                } else if (this.isSelected) {
                    n2 = rect.save();
                    rect.drawRect(0.0f, 0.0f, (float)this.mCachedWidth, (float)this.mCachedHeight, this.mBlackPaint);
                    rect2 = this.mSelectorFilter;
                    if (rect2 != null) {
                        this.mMaskedPaint.setColorFilter((ColorFilter)rect2);
                    } else {
                        this.mMaskedPaint.setColorFilter((ColorFilter)this.mDesaturateColorFilter);
                    }
                    rect.saveLayer(this.mBoundsF, this.mMaskedPaint, 12);
                    super.onDraw((Canvas)rect);
                    rect.restoreToCount(n2);
                } else {
                    super.onDraw((Canvas)rect);
                }
            }
            rect = this.mCacheBitmap;
            rect2 = this.mBounds;
            canvas.drawBitmap((Bitmap)rect, (float)rect2.left, (float)rect2.top, null);
            this.isPressed = this.isPressed();
        }
    }

    public void onSizeChanged(int n, int n2, int n3, int n4) {
        if (this.mDrawCircularShadow) {
            this.setOutlineProvider(new CustomOutline(this, n, n2));
        }
    }

    public boolean setFrame(int n, int n2, int n3, int n4) {
        boolean bl = super.setFrame(n, n2, n3, n4);
        this.mBounds = new Rect(0, 0, n3 - n, n4 - n2);
        this.mBoundsF = new RectF(this.mBounds);
        Drawable drawable2 = this.mMaskDrawable;
        if (drawable2 != null) {
            drawable2.setBounds(this.mBounds);
        }
        if (bl) {
            this.mCacheValid = false;
        }
        return bl;
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable2) {
        super.setImageDrawable(drawable2);
    }

    public void setImageResource(int n) {
        super.setImageResource(n);
    }

    public void setImageURI(Uri uri) {
        if (!"http".equals((Object)uri.getScheme()) && !"https".equals((Object)uri.getScheme())) {
            super.setImageURI(uri);
        } else {
            DrawerImageLoader.getInstance().setImage(this, uri, null);
        }
    }

    public void setSelectorColor(int n) {
        this.mSelectorColor = n;
        this.mSelectorFilter = new PorterDuffColorFilter(Color.argb((int)this.mSelectorAlpha, (int)Color.red((int)this.mSelectorColor), (int)Color.green((int)this.mSelectorColor), (int)Color.blue((int)this.mSelectorColor)), PorterDuff.Mode.SRC_ATOP);
        this.invalidate();
    }

    public boolean verifyDrawable(Drawable drawable2) {
        boolean bl = drawable2 == this.mMaskDrawable || super.verifyDrawable(drawable2);
        return bl;
    }

    @TargetApi(value=21)
    public class CustomOutline
    extends ViewOutlineProvider {
        public int height;
        public final BezelImageView this$0;
        public int width;

        public CustomOutline(BezelImageView bezelImageView, int n, int n2) {
            this.this$0 = bezelImageView;
            this.width = n;
            this.height = n2;
        }

        public void getOutline(View view, Outline outline) {
            outline.setOval(0, 0, this.width, this.height);
        }
    }
}

