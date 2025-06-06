/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorSet
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.graphics.Path
 *  java.lang.Object
 *  java.lang.String
 */
package me.zhanghai.android.materialprogressbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import me.zhanghai.android.materialprogressbar.Interpolators;
import me.zhanghai.android.materialprogressbar.internal.ObjectAnimatorCompat;

class Animators {
    private static final Path PATH_INDETERMINATE_HORIZONTAL_RECT1_SCALE_X;
    private static final Path PATH_INDETERMINATE_HORIZONTAL_RECT1_TRANSLATE_X;
    private static final Path PATH_INDETERMINATE_HORIZONTAL_RECT2_SCALE_X;
    private static final Path PATH_INDETERMINATE_HORIZONTAL_RECT2_TRANSLATE_X;

    static {
        Path path;
        PATH_INDETERMINATE_HORIZONTAL_RECT1_TRANSLATE_X = path = new Path();
        path.moveTo(-522.6f, 0.0f);
        path.rCubicTo(48.89972f, 0.0f, 166.02657f, 0.0f, 301.2173f, 0.0f);
        path.rCubicTo(197.58128f, 0.0f, 420.9827f, 0.0f, 420.9827f, 0.0f);
        PATH_INDETERMINATE_HORIZONTAL_RECT1_SCALE_X = path = new Path();
        path.moveTo(0.0f, 0.1f);
        path.lineTo(1.0f, 0.8268492f);
        path.lineTo(2.0f, 0.1f);
        PATH_INDETERMINATE_HORIZONTAL_RECT2_TRANSLATE_X = path = new Path();
        path.moveTo(-197.6f, 0.0f);
        path.rCubicTo(14.28182f, 0.0f, 85.07782f, 0.0f, 135.54689f, 0.0f);
        path.rCubicTo(54.26191f, 0.0f, 90.42461f, 0.0f, 168.24332f, 0.0f);
        path.rCubicTo(144.72154f, 0.0f, 316.40982f, 0.0f, 316.40982f, 0.0f);
        PATH_INDETERMINATE_HORIZONTAL_RECT2_SCALE_X = path = new Path();
        path.moveTo(0.0f, 0.1f);
        path.lineTo(1.0f, 0.5713795f);
        path.lineTo(2.0f, 0.90995026f);
        path.lineTo(3.0f, 0.1f);
    }

    private Animators() {
    }

    public static Animator createIndeterminate(Object object) {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat((Object)object, (String)"trimPathStart", (float[])new float[]{0.0f, 0.75f});
        objectAnimator.setDuration(1333L);
        objectAnimator.setInterpolator((TimeInterpolator)Interpolators.TRIM_PATH_START.INSTANCE);
        objectAnimator.setRepeatCount(-1);
        ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat((Object)object, (String)"trimPathEnd", (float[])new float[]{0.0f, 0.75f});
        objectAnimator2.setDuration(1333L);
        objectAnimator2.setInterpolator((TimeInterpolator)Interpolators.TRIM_PATH_END.INSTANCE);
        objectAnimator2.setRepeatCount(-1);
        ObjectAnimator objectAnimator3 = ObjectAnimator.ofFloat((Object)object, (String)"trimPathOffset", (float[])new float[]{0.0f, 0.25f});
        objectAnimator3.setDuration(1333L);
        objectAnimator3.setInterpolator((TimeInterpolator)Interpolators.LINEAR.INSTANCE);
        objectAnimator3.setRepeatCount(-1);
        object = new AnimatorSet();
        object.playTogether(new Animator[]{objectAnimator, objectAnimator2, objectAnimator3});
        return object;
    }

    public static Animator createIndeterminateHorizontalRect1(Object object) {
        ObjectAnimator objectAnimator = ObjectAnimatorCompat.ofFloat(object, "translateX", null, PATH_INDETERMINATE_HORIZONTAL_RECT1_TRANSLATE_X);
        objectAnimator.setDuration(2000L);
        objectAnimator.setInterpolator((TimeInterpolator)Interpolators.INDETERMINATE_HORIZONTAL_RECT1_TRANSLATE_X.INSTANCE);
        objectAnimator.setRepeatCount(-1);
        object = ObjectAnimatorCompat.ofFloat(object, null, "scaleX", PATH_INDETERMINATE_HORIZONTAL_RECT1_SCALE_X);
        object.setDuration(2000L);
        object.setInterpolator((TimeInterpolator)Interpolators.INDETERMINATE_HORIZONTAL_RECT1_SCALE_X.INSTANCE);
        object.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{objectAnimator, object});
        return animatorSet;
    }

    public static Animator createIndeterminateHorizontalRect2(Object object) {
        ObjectAnimator objectAnimator = ObjectAnimatorCompat.ofFloat(object, "translateX", null, PATH_INDETERMINATE_HORIZONTAL_RECT2_TRANSLATE_X);
        objectAnimator.setDuration(2000L);
        objectAnimator.setInterpolator((TimeInterpolator)Interpolators.INDETERMINATE_HORIZONTAL_RECT2_TRANSLATE_X.INSTANCE);
        objectAnimator.setRepeatCount(-1);
        object = ObjectAnimatorCompat.ofFloat(object, null, "scaleX", PATH_INDETERMINATE_HORIZONTAL_RECT2_SCALE_X);
        object.setDuration(2000L);
        object.setInterpolator((TimeInterpolator)Interpolators.INDETERMINATE_HORIZONTAL_RECT2_SCALE_X.INSTANCE);
        object.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{objectAnimator, object});
        return animatorSet;
    }

    public static Animator createIndeterminateRotation(Object object) {
        object = ObjectAnimator.ofFloat((Object)object, (String)"rotation", (float[])new float[]{0.0f, 720.0f});
        object.setDuration(6665L);
        object.setInterpolator((TimeInterpolator)Interpolators.LINEAR.INSTANCE);
        object.setRepeatCount(-1);
        return object;
    }
}

