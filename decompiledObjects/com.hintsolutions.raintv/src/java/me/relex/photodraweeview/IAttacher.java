/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.GestureDetector$OnDoubleTapListener
 *  android.view.View$OnLongClickListener
 *  java.lang.Object
 */
package me.relex.photodraweeview;

import android.view.GestureDetector;
import android.view.View;
import me.relex.photodraweeview.OnPhotoTapListener;
import me.relex.photodraweeview.OnScaleChangeListener;
import me.relex.photodraweeview.OnViewTapListener;

public interface IAttacher {
    public static final float DEFAULT_MAX_SCALE = 3.0f;
    public static final float DEFAULT_MID_SCALE = 1.75f;
    public static final float DEFAULT_MIN_SCALE = 1.0f;
    public static final long ZOOM_DURATION = 200L;

    public float getMaximumScale();

    public float getMediumScale();

    public float getMinimumScale();

    public OnPhotoTapListener getOnPhotoTapListener();

    public OnViewTapListener getOnViewTapListener();

    public float getScale();

    public void setAllowParentInterceptOnEdge(boolean var1);

    public void setMaximumScale(float var1);

    public void setMediumScale(float var1);

    public void setMinimumScale(float var1);

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener var1);

    public void setOnLongClickListener(View.OnLongClickListener var1);

    public void setOnPhotoTapListener(OnPhotoTapListener var1);

    public void setOnScaleChangeListener(OnScaleChangeListener var1);

    public void setOnViewTapListener(OnViewTapListener var1);

    public void setScale(float var1);

    public void setScale(float var1, float var2, float var3, boolean var4);

    public void setScale(float var1, boolean var2);

    public void setZoomTransitionDuration(long var1);

    public void update(int var1, int var2);
}

