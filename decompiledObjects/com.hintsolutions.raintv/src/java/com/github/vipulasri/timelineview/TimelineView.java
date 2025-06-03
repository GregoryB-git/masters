/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  java.lang.Math
 *  java.lang.Object
 */
package com.github.vipulasri.timelineview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.github.vipulasri.timelineview.R;
import com.github.vipulasri.timelineview.Utils;

public class TimelineView
extends View {
    private Rect mBounds;
    private Context mContext;
    private Drawable mEndLine;
    private int mLineOrientation;
    private int mLinePadding;
    private int mLineSize;
    private Drawable mMarker;
    private boolean mMarkerInCenter;
    private int mMarkerSize;
    private Drawable mStartLine;

    public TimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
        this.init(attributeSet);
    }

    public static int getTimeLineViewType(int n, int n2) {
        if (n2 == 1) {
            return 3;
        }
        if (n == 0) {
            return 1;
        }
        if (n == n2 - 1) {
            return 2;
        }
        return 0;
    }

    private void init(AttributeSet attributeSet) {
        attributeSet = this.getContext().obtainStyledAttributes(attributeSet, R.styleable.timeline_style);
        this.mMarker = attributeSet.getDrawable(R.styleable.timeline_style_marker);
        int n = R.styleable.timeline_style_line;
        this.mStartLine = attributeSet.getDrawable(n);
        this.mEndLine = attributeSet.getDrawable(n);
        this.mMarkerSize = attributeSet.getDimensionPixelSize(R.styleable.timeline_style_markerSize, Utils.dpToPx(20.0f, this.mContext));
        this.mLineSize = attributeSet.getDimensionPixelSize(R.styleable.timeline_style_lineSize, Utils.dpToPx(2.0f, this.mContext));
        this.mLineOrientation = attributeSet.getInt(R.styleable.timeline_style_lineOrientation, 1);
        this.mLinePadding = attributeSet.getDimensionPixelSize(R.styleable.timeline_style_linePadding, 0);
        this.mMarkerInCenter = attributeSet.getBoolean(R.styleable.timeline_style_markerInCenter, true);
        attributeSet.recycle();
        if (this.mMarker == null) {
            this.mMarker = this.mContext.getResources().getDrawable(R.drawable.marker);
        }
        if (this.mStartLine == null && this.mEndLine == null) {
            this.mStartLine = new ColorDrawable(this.mContext.getResources().getColor(0x1060000));
            this.mEndLine = new ColorDrawable(this.mContext.getResources().getColor(0x1060000));
        }
    }

    private void initDrawable() {
        Drawable drawable2;
        int n = this.getPaddingLeft();
        int n2 = this.getPaddingRight();
        int n3 = this.getPaddingTop();
        int n4 = this.getPaddingBottom();
        int n6 = this.getWidth();
        int n7 = this.getHeight();
        n4 = Math.min((int)this.mMarkerSize, (int)Math.min((int)(n6 - n - n2), (int)(n7 - n3 - n4)));
        if (this.mMarkerInCenter) {
            drawable2 = this.mMarker;
            if (drawable2 != null) {
                n = n6 / 2;
                n2 = n4 / 2;
                n4 = n7 / 2;
                drawable2.setBounds(n - n2, n4 - n2, n + n2, n4 + n2);
                this.mBounds = this.mMarker.getBounds();
            }
        } else {
            drawable2 = this.mMarker;
            if (drawable2 != null) {
                drawable2.setBounds(n, n3, n + n4, n4 + n3);
                this.mBounds = this.mMarker.getBounds();
            }
        }
        n4 = this.mBounds.centerX();
        n = this.mLineSize;
        n4 -= n >> 1;
        if (this.mLineOrientation == 0) {
            Drawable drawable3 = this.mStartLine;
            if (drawable3 != null) {
                n7 = this.mBounds.height() / 2;
                drawable2 = this.mBounds;
                drawable3.setBounds(0, n7 + n3, drawable2.left - this.mLinePadding, drawable2.height() / 2 + n3 + this.mLineSize);
            }
            if ((drawable2 = this.mEndLine) != null) {
                drawable3 = this.mBounds;
                drawable2.setBounds(drawable3.right + this.mLinePadding, drawable3.height() / 2 + n3, n6, this.mBounds.height() / 2 + n3 + this.mLineSize);
            }
        } else {
            drawable2 = this.mStartLine;
            if (drawable2 != null) {
                drawable2.setBounds(n4, 0, n + n4, this.mBounds.top - this.mLinePadding);
            }
            if ((drawable2 = this.mEndLine) != null) {
                drawable2.setBounds(n4, this.mBounds.bottom + this.mLinePadding, this.mLineSize + n4, n7);
            }
        }
    }

    private void setEndLine(Drawable drawable2) {
        this.mEndLine = drawable2;
        this.initDrawable();
    }

    private void setStartLine(Drawable drawable2) {
        this.mStartLine = drawable2;
        this.initDrawable();
    }

    public void initLine(int n) {
        if (n == 1) {
            this.setStartLine(null);
        } else if (n == 2) {
            this.setEndLine(null);
        } else if (n == 3) {
            this.setStartLine(null);
            this.setEndLine(null);
        }
        this.initDrawable();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Drawable drawable2 = this.mMarker;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if ((drawable2 = this.mStartLine) != null) {
            drawable2.draw(canvas);
        }
        if ((drawable2 = this.mEndLine) != null) {
            drawable2.draw(canvas);
        }
    }

    public void onMeasure(int n, int n2) {
        super.onMeasure(n, n2);
        int n3 = this.mMarkerSize;
        int n4 = this.getPaddingLeft();
        int n6 = this.getPaddingRight();
        int n7 = this.mMarkerSize;
        int n8 = this.getPaddingTop();
        int n9 = this.getPaddingBottom();
        this.setMeasuredDimension(View.resolveSizeAndState((int)(n6 + (n4 + n3)), (int)n, (int)0), View.resolveSizeAndState((int)(n9 + (n8 + n7)), (int)n2, (int)0));
        this.initDrawable();
    }

    public void onSizeChanged(int n, int n2, int n3, int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.initDrawable();
    }

    public void setEndLine(int n, int n2) {
        this.mEndLine = new ColorDrawable(n);
        this.initLine(n2);
    }

    public void setLinePadding(int n) {
        this.mLinePadding = n;
        this.initDrawable();
    }

    public void setLineSize(int n) {
        this.mLineSize = n;
        this.initDrawable();
    }

    public void setMarker(Drawable drawable2) {
        this.mMarker = drawable2;
        this.initDrawable();
    }

    public void setMarker(Drawable drawable2, int n) {
        this.mMarker = drawable2;
        drawable2.setColorFilter(n, PorterDuff.Mode.SRC_ATOP);
        this.initDrawable();
    }

    public void setMarkerColor(int n) {
        this.mMarker.setColorFilter(n, PorterDuff.Mode.SRC_ATOP);
        this.initDrawable();
    }

    public void setMarkerSize(int n) {
        this.mMarkerSize = n;
        this.initDrawable();
    }

    public void setStartLine(int n, int n2) {
        this.mStartLine = new ColorDrawable(n);
        this.initLine(n2);
    }
}

