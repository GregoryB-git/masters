/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.RectF
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.SystemClock
 *  android.provider.Settings$Global
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$BaseSavedState
 *  android.view.View$MeasureSpec
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package com.pnikosis.materialishprogress;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import com.pnikosis.materialishprogress.R;

public class ProgressWheel
extends View {
    private static final String TAG = "ProgressWheel";
    private int barColor = -1442840576;
    private float barExtraLength = 0.0f;
    private boolean barGrowingFromFront = true;
    private final int barLength;
    private final int barMaxLength;
    private Paint barPaint = new Paint();
    private double barSpinCycleTime = 460.0;
    private int barWidth = 4;
    private ProgressCallback callback;
    private RectF circleBounds;
    private int circleRadius = 28;
    private boolean fillRadius = false;
    private boolean isSpinning = false;
    private long lastTimeAnimated = 0L;
    private boolean linearProgress;
    private float mProgress = 0.0f;
    private float mTargetProgress = 0.0f;
    private final long pauseGrowingTime;
    private long pausedTimeWithoutGrowing = 0L;
    private int rimColor = 0xFFFFFF;
    private Paint rimPaint = new Paint();
    private int rimWidth = 4;
    private boolean shouldAnimate;
    private float spinSpeed = 230.0f;
    private double timeStartGrowing = 0.0;

    public ProgressWheel(Context context) {
        super(context);
        this.barLength = 16;
        this.barMaxLength = 270;
        this.pauseGrowingTime = 200L;
        this.circleBounds = new RectF();
        this.setAnimationEnabled();
    }

    public ProgressWheel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.barLength = 16;
        this.barMaxLength = 270;
        this.pauseGrowingTime = 200L;
        this.circleBounds = new RectF();
        this.parseAttributes(context.obtainStyledAttributes(attributeSet, R.styleable.ProgressWheel));
        this.setAnimationEnabled();
    }

    private void parseAttributes(TypedArray typedArray) {
        int n;
        DisplayMetrics displayMetrics = this.getContext().getResources().getDisplayMetrics();
        this.barWidth = (int)TypedValue.applyDimension((int)1, (float)this.barWidth, (DisplayMetrics)displayMetrics);
        this.rimWidth = (int)TypedValue.applyDimension((int)1, (float)this.rimWidth, (DisplayMetrics)displayMetrics);
        this.circleRadius = n = (int)TypedValue.applyDimension((int)1, (float)this.circleRadius, (DisplayMetrics)displayMetrics);
        this.circleRadius = (int)typedArray.getDimension(R.styleable.ProgressWheel_matProg_circleRadius, (float)n);
        this.fillRadius = typedArray.getBoolean(R.styleable.ProgressWheel_matProg_fillRadius, false);
        this.barWidth = (int)typedArray.getDimension(R.styleable.ProgressWheel_matProg_barWidth, (float)this.barWidth);
        this.rimWidth = (int)typedArray.getDimension(R.styleable.ProgressWheel_matProg_rimWidth, (float)this.rimWidth);
        this.spinSpeed = typedArray.getFloat(R.styleable.ProgressWheel_matProg_spinSpeed, this.spinSpeed / 360.0f) * 360.0f;
        this.barSpinCycleTime = typedArray.getInt(R.styleable.ProgressWheel_matProg_barSpinCycleTime, (int)this.barSpinCycleTime);
        this.barColor = typedArray.getColor(R.styleable.ProgressWheel_matProg_barColor, this.barColor);
        this.rimColor = typedArray.getColor(R.styleable.ProgressWheel_matProg_rimColor, this.rimColor);
        this.linearProgress = typedArray.getBoolean(R.styleable.ProgressWheel_matProg_linearProgress, false);
        if (typedArray.getBoolean(R.styleable.ProgressWheel_matProg_progressIndeterminate, false)) {
            this.spin();
        }
        typedArray.recycle();
    }

    private void runCallback() {
        if (this.callback != null) {
            float f = (float)Math.round((float)(this.mProgress * 100.0f / 360.0f)) / 100.0f;
            this.callback.onProgressUpdate(f);
        }
    }

    private void runCallback(float f) {
        ProgressCallback progressCallback = this.callback;
        if (progressCallback != null) {
            progressCallback.onProgressUpdate(f);
        }
    }

    @TargetApi(value=17)
    private void setAnimationEnabled() {
        boolean bl = Settings.Global.getFloat((ContentResolver)this.getContext().getContentResolver(), (String)"animator_duration_scale", (float)1.0f) != 0.0f;
        this.shouldAnimate = bl;
    }

    private void setupBounds(int n, int n2) {
        int n3 = this.getPaddingTop();
        int n4 = this.getPaddingBottom();
        int n5 = this.getPaddingLeft();
        int n6 = this.getPaddingRight();
        if (!this.fillRadius) {
            n6 = n - n5 - n6;
            n = Math.min((int)Math.min((int)n6, (int)(n2 - n4 - n3)), (int)(this.circleRadius * 2 - this.barWidth * 2));
            n5 = (n6 - n) / 2 + n5;
            n2 = (n2 - n3 - n4 - n) / 2 + n3;
            n3 = this.barWidth;
            this.circleBounds = new RectF((float)(n5 + n3), (float)(n2 + n3), (float)(n5 + n - n3), (float)(n2 + n - n3));
        } else {
            int n7 = this.barWidth;
            this.circleBounds = new RectF((float)(n5 + n7), (float)(n3 + n7), (float)(n - n6 - n7), (float)(n2 - n4 - n7));
        }
    }

    private void setupPaints() {
        this.barPaint.setColor(this.barColor);
        this.barPaint.setAntiAlias(true);
        this.barPaint.setStyle(Paint.Style.STROKE);
        this.barPaint.setStrokeWidth((float)this.barWidth);
        this.rimPaint.setColor(this.rimColor);
        this.rimPaint.setAntiAlias(true);
        this.rimPaint.setStyle(Paint.Style.STROKE);
        this.rimPaint.setStrokeWidth((float)this.rimWidth);
    }

    private void updateBarLength(long l) {
        long l2 = this.pausedTimeWithoutGrowing;
        if (l2 >= 200L) {
            double d;
            this.timeStartGrowing = d = this.timeStartGrowing + (double)l;
            double d2 = this.barSpinCycleTime;
            if (d > d2) {
                this.timeStartGrowing = d - d2;
                this.pausedTimeWithoutGrowing = 0L;
                this.barGrowingFromFront ^= true;
            }
            float f = (float)Math.cos((double)((this.timeStartGrowing / d2 + 1.0) * Math.PI)) / 2.0f + 0.5f;
            if (this.barGrowingFromFront) {
                this.barExtraLength = f * 254.0f;
            } else {
                f = (1.0f - f) * 254.0f;
                float f2 = this.mProgress;
                this.mProgress = this.barExtraLength - f + f2;
                this.barExtraLength = f;
            }
        } else {
            this.pausedTimeWithoutGrowing = l2 + l;
        }
    }

    public int getBarColor() {
        return this.barColor;
    }

    public int getBarWidth() {
        return this.barWidth;
    }

    public int getCircleRadius() {
        return this.circleRadius;
    }

    public float getProgress() {
        float f = this.isSpinning ? -1.0f : this.mProgress / 360.0f;
        return f;
    }

    public int getRimColor() {
        return this.rimColor;
    }

    public int getRimWidth() {
        return this.rimWidth;
    }

    public float getSpinSpeed() {
        return this.spinSpeed / 360.0f;
    }

    public boolean isSpinning() {
        return this.isSpinning;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.circleBounds, 360.0f, 360.0f, false, this.rimPaint);
        if (!this.shouldAnimate) {
            return;
        }
        boolean bl = this.isSpinning;
        float f = 0.0f;
        boolean bl2 = true;
        boolean bl3 = true;
        if (bl) {
            long l = SystemClock.uptimeMillis() - this.lastTimeAnimated;
            float f2 = (float)l * this.spinSpeed / 1000.0f;
            this.updateBarLength(l);
            this.mProgress = f2 = this.mProgress + f2;
            if (f2 > 360.0f) {
                this.mProgress = f2 - 360.0f;
                this.runCallback(-1.0f);
            }
            this.lastTimeAnimated = SystemClock.uptimeMillis();
            f2 = this.mProgress;
            f = this.barExtraLength + 16.0f;
            if (this.isInEditMode()) {
                f = 135.0f;
                f2 = 0.0f;
            } else {
                f2 -= 90.0f;
            }
            canvas.drawArc(this.circleBounds, f2, f, false, this.barPaint);
            bl3 = bl2;
        } else {
            float f3;
            float f4;
            float f5 = this.mProgress;
            if (f5 != this.mTargetProgress) {
                f4 = (float)(SystemClock.uptimeMillis() - this.lastTimeAnimated) / 1000.0f;
                f3 = this.spinSpeed;
                this.mProgress = Math.min((float)(this.mProgress + f4 * f3), (float)this.mTargetProgress);
                this.lastTimeAnimated = SystemClock.uptimeMillis();
            } else {
                bl3 = false;
            }
            if (f5 != this.mProgress) {
                this.runCallback();
            }
            f3 = f4 = this.mProgress;
            if (!this.linearProgress) {
                f = (float)(1.0 - Math.pow((double)(1.0f - f4 / 360.0f), (double)4.0f));
                f3 = (float)(1.0 - Math.pow((double)(1.0f - this.mProgress / 360.0f), (double)2.0f));
                f *= 360.0f;
                f3 *= 360.0f;
            }
            if (this.isInEditMode()) {
                f3 = 360.0f;
            }
            canvas.drawArc(this.circleBounds, f - 90.0f, f3, false, this.barPaint);
        }
        if (bl3) {
            this.invalidate();
        }
    }

    public void onMeasure(int n, int n2) {
        super.onMeasure(n, n2);
        int n3 = this.circleRadius;
        int n4 = this.getPaddingLeft();
        n4 = this.getPaddingRight() + (n4 + n3);
        n3 = this.circleRadius;
        int n5 = this.getPaddingTop();
        n3 = this.getPaddingBottom() + (n5 + n3);
        int n6 = View.MeasureSpec.getMode((int)n);
        int n7 = View.MeasureSpec.getSize((int)n);
        int n8 = View.MeasureSpec.getMode((int)n2);
        n5 = View.MeasureSpec.getSize((int)n2);
        if (n6 == 0x40000000) {
            n = n7;
        } else {
            n = n4;
            if (n6 == Integer.MIN_VALUE) {
                n = Math.min((int)n4, (int)n7);
            }
        }
        if (n8 != 0x40000000 && n6 != 0x40000000) {
            n2 = n3;
            if (n8 == Integer.MIN_VALUE) {
                n2 = Math.min((int)n3, (int)n5);
            }
        } else {
            n2 = n5;
        }
        this.setMeasuredDimension(n, n2);
    }

    public void onRestoreInstanceState(Parcelable object) {
        if (!(object instanceof WheelSavedState)) {
            super.onRestoreInstanceState(object);
            return;
        }
        object = (WheelSavedState)((Object)object);
        super.onRestoreInstanceState(object.getSuperState());
        this.mProgress = object.mProgress;
        this.mTargetProgress = object.mTargetProgress;
        this.isSpinning = object.isSpinning;
        this.spinSpeed = object.spinSpeed;
        this.barWidth = object.barWidth;
        this.barColor = object.barColor;
        this.rimWidth = object.rimWidth;
        this.rimColor = object.rimColor;
        this.circleRadius = object.circleRadius;
        this.linearProgress = object.linearProgress;
        this.fillRadius = object.fillRadius;
        this.lastTimeAnimated = SystemClock.uptimeMillis();
    }

    public Parcelable onSaveInstanceState() {
        WheelSavedState wheelSavedState = new WheelSavedState(super.onSaveInstanceState());
        wheelSavedState.mProgress = this.mProgress;
        wheelSavedState.mTargetProgress = this.mTargetProgress;
        wheelSavedState.isSpinning = this.isSpinning;
        wheelSavedState.spinSpeed = this.spinSpeed;
        wheelSavedState.barWidth = this.barWidth;
        wheelSavedState.barColor = this.barColor;
        wheelSavedState.rimWidth = this.rimWidth;
        wheelSavedState.rimColor = this.rimColor;
        wheelSavedState.circleRadius = this.circleRadius;
        wheelSavedState.linearProgress = this.linearProgress;
        wheelSavedState.fillRadius = this.fillRadius;
        return wheelSavedState;
    }

    public void onSizeChanged(int n, int n2, int n3, int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.setupBounds(n, n2);
        this.setupPaints();
        this.invalidate();
    }

    public void onVisibilityChanged(View view, int n) {
        super.onVisibilityChanged(view, n);
        if (n == 0) {
            this.lastTimeAnimated = SystemClock.uptimeMillis();
        }
    }

    public void resetCount() {
        this.mProgress = 0.0f;
        this.mTargetProgress = 0.0f;
        this.invalidate();
    }

    public void setBarColor(int n) {
        this.barColor = n;
        this.setupPaints();
        if (!this.isSpinning) {
            this.invalidate();
        }
    }

    public void setBarWidth(int n) {
        this.barWidth = n;
        if (!this.isSpinning) {
            this.invalidate();
        }
    }

    public void setCallback(ProgressCallback progressCallback) {
        this.callback = progressCallback;
        if (!this.isSpinning) {
            this.runCallback();
        }
    }

    public void setCircleRadius(int n) {
        this.circleRadius = n;
        if (!this.isSpinning) {
            this.invalidate();
        }
    }

    public void setInstantProgress(float f) {
        float f2;
        if (this.isSpinning) {
            this.mProgress = 0.0f;
            this.isSpinning = false;
        }
        if (f > 1.0f) {
            f2 = f - 1.0f;
        } else {
            f2 = f;
            if (f < 0.0f) {
                f2 = 0.0f;
            }
        }
        if (f2 == this.mTargetProgress) {
            return;
        }
        this.mTargetProgress = f = Math.min((float)(f2 * 360.0f), (float)360.0f);
        this.mProgress = f;
        this.lastTimeAnimated = SystemClock.uptimeMillis();
        this.invalidate();
    }

    public void setLinearProgress(boolean bl) {
        this.linearProgress = bl;
        if (!this.isSpinning) {
            this.invalidate();
        }
    }

    public void setProgress(float f) {
        float f2;
        if (this.isSpinning) {
            this.mProgress = 0.0f;
            this.isSpinning = false;
            this.runCallback();
        }
        if (f > 1.0f) {
            f2 = f - 1.0f;
        } else {
            f2 = f;
            if (f < 0.0f) {
                f2 = 0.0f;
            }
        }
        f = this.mTargetProgress;
        if (f2 == f) {
            return;
        }
        if (this.mProgress == f) {
            this.lastTimeAnimated = SystemClock.uptimeMillis();
        }
        this.mTargetProgress = Math.min((float)(f2 * 360.0f), (float)360.0f);
        this.invalidate();
    }

    public void setRimColor(int n) {
        this.rimColor = n;
        this.setupPaints();
        if (!this.isSpinning) {
            this.invalidate();
        }
    }

    public void setRimWidth(int n) {
        this.rimWidth = n;
        if (!this.isSpinning) {
            this.invalidate();
        }
    }

    public void setSpinSpeed(float f) {
        this.spinSpeed = f * 360.0f;
    }

    public void spin() {
        this.lastTimeAnimated = SystemClock.uptimeMillis();
        this.isSpinning = true;
        this.invalidate();
    }

    public void stopSpinning() {
        this.isSpinning = false;
        this.mProgress = 0.0f;
        this.mTargetProgress = 0.0f;
        this.invalidate();
    }

    public static interface ProgressCallback {
        public void onProgressUpdate(float var1);
    }

    public static class WheelSavedState
    extends View.BaseSavedState {
        public static final Parcelable.Creator<WheelSavedState> CREATOR = new Parcelable.Creator<WheelSavedState>(){

            public WheelSavedState createFromParcel(Parcel parcel) {
                return new WheelSavedState(parcel, null);
            }

            public WheelSavedState[] newArray(int n) {
                return new WheelSavedState[n];
            }
        };
        public int barColor;
        public int barWidth;
        public int circleRadius;
        public boolean fillRadius;
        public boolean isSpinning;
        public boolean linearProgress;
        public float mProgress;
        public float mTargetProgress;
        public int rimColor;
        public int rimWidth;
        public float spinSpeed;

        private WheelSavedState(Parcel parcel) {
            super(parcel);
            this.mProgress = parcel.readFloat();
            this.mTargetProgress = parcel.readFloat();
            byte by = parcel.readByte();
            boolean bl = true;
            boolean bl2 = by != 0;
            this.isSpinning = bl2;
            this.spinSpeed = parcel.readFloat();
            this.barWidth = parcel.readInt();
            this.barColor = parcel.readInt();
            this.rimWidth = parcel.readInt();
            this.rimColor = parcel.readInt();
            this.circleRadius = parcel.readInt();
            bl2 = parcel.readByte() != 0;
            this.linearProgress = bl2;
            bl2 = parcel.readByte() != 0 ? bl : false;
            this.fillRadius = bl2;
        }

        public /* synthetic */ WheelSavedState(Parcel parcel, 1 var2_2) {
            this(parcel);
        }

        public WheelSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int n) {
            super.writeToParcel(parcel, n);
            parcel.writeFloat(this.mProgress);
            parcel.writeFloat(this.mTargetProgress);
            parcel.writeByte((byte)(this.isSpinning ? 1 : 0));
            parcel.writeFloat(this.spinSpeed);
            parcel.writeInt(this.barWidth);
            parcel.writeInt(this.barColor);
            parcel.writeInt(this.rimWidth);
            parcel.writeInt(this.rimColor);
            parcel.writeInt(this.circleRadius);
            parcel.writeByte((byte)(this.linearProgress ? 1 : 0));
            parcel.writeByte((byte)(this.fillRadius ? 1 : 0));
        }
    }
}

