/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 *  android.util.Log
 *  android.view.View
 *  androidx.annotation.IntRange
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 */
package com.devbrackets.android.exomedia.core.video.scale;

import android.graphics.Point;
import android.util.Log;
import android.view.View;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.core.video.scale.ScaleType;
import java.lang.ref.WeakReference;

public class MatrixManager {
    public static final int QUARTER_ROTATION = 90;
    private static final String TAG = "MatrixManager";
    @IntRange(from=0L, to=359L)
    public int currentRotation = 0;
    @NonNull
    public ScaleType currentScaleType;
    @NonNull
    public Point intrinsicVideoSize = new Point(0, 0);
    @NonNull
    public WeakReference<View> requestedModificationView;
    @Nullable
    public Integer requestedRotation = null;
    @Nullable
    public ScaleType requestedScaleType = null;

    public MatrixManager() {
        this.currentScaleType = ScaleType.FIT_CENTER;
        this.requestedModificationView = new WeakReference(null);
    }

    public void applyCenter(@NonNull View view) {
        this.setScale(view, (float)this.intrinsicVideoSize.x / (float)view.getWidth(), (float)this.intrinsicVideoSize.y / (float)view.getHeight());
    }

    public void applyCenterCrop(@NonNull View view) {
        float f2 = (float)view.getWidth() / (float)this.intrinsicVideoSize.x;
        float f4 = (float)view.getHeight() / (float)this.intrinsicVideoSize.y;
        float f5 = Math.max((float)f2, (float)f4);
        this.setScale(view, f5 / f2, f5 / f4);
    }

    public void applyCenterInside(@NonNull View view) {
        if (this.intrinsicVideoSize.x <= view.getWidth() && this.intrinsicVideoSize.y <= view.getHeight()) {
            this.applyCenter(view);
        } else {
            this.applyFitCenter(view);
        }
    }

    public void applyFitCenter(@NonNull View view) {
        float f2 = (float)view.getWidth() / (float)this.intrinsicVideoSize.x;
        float f4 = (float)view.getHeight() / (float)this.intrinsicVideoSize.y;
        float f5 = Math.min((float)f2, (float)f4);
        this.setScale(view, f5 / f2, f5 / f4);
    }

    public void applyFitXy(@NonNull View view) {
        this.setScale(view, 1.0f, 1.0f);
    }

    public void applyRequestedModifications() {
        View view = (View)this.requestedModificationView.get();
        if (view != null) {
            Object object = this.requestedRotation;
            if (object != null) {
                this.rotate(view, (int)object);
                this.requestedRotation = null;
            }
            if ((object = this.requestedScaleType) != null) {
                this.scale(view, (ScaleType)((Object)object));
                this.requestedScaleType = null;
            }
        }
        this.requestedModificationView = new WeakReference(null);
    }

    public int getCurrentRotation() {
        Integer n = this.requestedRotation;
        int n2 = n != null ? n : this.currentRotation;
        return n2;
    }

    @NonNull
    public ScaleType getCurrentScaleType() {
        ScaleType scaleType = this.requestedScaleType;
        if (scaleType == null) {
            scaleType = this.currentScaleType;
        }
        return scaleType;
    }

    public boolean ready() {
        Point point = this.intrinsicVideoSize;
        boolean bl = point.x > 0 && point.y > 0;
        return bl;
    }

    public void reset() {
        this.setIntrinsicVideoSize(0, 0);
        this.currentRotation = 0;
    }

    public void rotate(@NonNull View view, @IntRange(from=0L, to=359L) int n) {
        if (!this.ready()) {
            this.requestedRotation = n;
            this.requestedModificationView = new WeakReference((Object)view);
            return;
        }
        int n2 = n / 90;
        int n3 = 0;
        n2 = n2 % 2 == 1 ? 1 : 0;
        if (this.currentRotation / 90 % 2 == 1) {
            n3 = 1;
        }
        if (n2 != n3) {
            Point point = this.intrinsicVideoSize;
            n2 = point.x;
            point.x = point.y;
            point.y = n2;
            this.scale(view, this.currentScaleType);
        }
        this.currentRotation = n;
        view.setRotation((float)n);
    }

    public boolean scale(@NonNull View view, @NonNull ScaleType scaleType) {
        if (!this.ready()) {
            this.requestedScaleType = scaleType;
            this.requestedModificationView = new WeakReference((Object)view);
            return false;
        }
        if (view.getHeight() != 0 && view.getWidth() != 0) {
            this.currentScaleType = scaleType;
            switch (1.$SwitchMap$com$devbrackets$android$exomedia$core$video$scale$ScaleType[scaleType.ordinal()]) {
                default: {
                    break;
                }
                case 6: {
                    this.setScale(view, 1.0f, 1.0f);
                    break;
                }
                case 5: {
                    this.applyFitXy(view);
                    break;
                }
                case 4: {
                    this.applyFitCenter(view);
                    break;
                }
                case 3: {
                    this.applyCenterInside(view);
                    break;
                }
                case 2: {
                    this.applyCenterCrop(view);
                    break;
                }
                case 1: {
                    this.applyCenter(view);
                }
            }
            return true;
        }
        scaleType = z2.t("Unable to apply scale with a view size of (");
        scaleType.append(view.getWidth());
        scaleType.append(", ");
        scaleType.append(view.getHeight());
        scaleType.append(")");
        Log.d((String)TAG, (String)scaleType.toString());
        return false;
    }

    public void setIntrinsicVideoSize(@IntRange(from=0L) int n, @IntRange(from=0L) int n2) {
        int n3 = this.currentRotation / 90;
        boolean bl = true;
        if (n3 % 2 != 1) {
            bl = false;
        }
        Point point = this.intrinsicVideoSize;
        n3 = bl ? n2 : n;
        point.x = n3;
        if (!bl) {
            n = n2;
        }
        point.y = n;
        if (this.ready()) {
            this.applyRequestedModifications();
        }
    }

    public void setScale(@NonNull View view, float f2, float f4) {
        int n = this.currentRotation / 90;
        boolean bl = true;
        if (n % 2 != 1) {
            bl = false;
        }
        float f5 = f2;
        float f6 = f4;
        if (bl) {
            f5 = f4 * (float)view.getHeight() / (float)view.getWidth();
            f6 = f2 * (float)view.getWidth() / (float)view.getHeight();
        }
        view.setScaleX(f5);
        view.setScaleY(f6);
    }
}

