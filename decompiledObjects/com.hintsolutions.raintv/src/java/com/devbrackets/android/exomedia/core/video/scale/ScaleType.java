/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.devbrackets.android.exomedia.core.video.scale;

import androidx.annotation.NonNull;

public final class ScaleType
extends Enum<ScaleType> {
    private static final ScaleType[] $VALUES;
    public static final /* enum */ ScaleType CENTER;
    public static final /* enum */ ScaleType CENTER_CROP;
    public static final /* enum */ ScaleType CENTER_INSIDE;
    public static final /* enum */ ScaleType FIT_CENTER;
    public static final /* enum */ ScaleType FIT_XY;
    public static final /* enum */ ScaleType NONE;

    static {
        ScaleType scaleType;
        ScaleType scaleType2;
        ScaleType scaleType3;
        ScaleType scaleType4;
        ScaleType scaleType5;
        ScaleType scaleType6;
        CENTER = scaleType6 = new ScaleType();
        CENTER_CROP = scaleType5 = new ScaleType();
        CENTER_INSIDE = scaleType4 = new ScaleType();
        FIT_CENTER = scaleType3 = new ScaleType();
        FIT_XY = scaleType2 = new ScaleType();
        NONE = scaleType = new ScaleType();
        $VALUES = new ScaleType[]{scaleType6, scaleType5, scaleType4, scaleType3, scaleType2, scaleType};
    }

    @NonNull
    public static ScaleType fromOrdinal(int n) {
        if (n >= 0 && n <= NONE.ordinal()) {
            return ScaleType.values()[n];
        }
        return NONE;
    }

    public static ScaleType valueOf(String string2) {
        return (ScaleType)Enum.valueOf(ScaleType.class, (String)string2);
    }

    public static ScaleType[] values() {
        return (ScaleType[])$VALUES.clone();
    }
}

