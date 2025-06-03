/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  java.lang.Enum
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package com.afollestad.materialdialogs;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;

public final class GravityEnum
extends Enum<GravityEnum> {
    private static final GravityEnum[] $VALUES;
    public static final /* enum */ GravityEnum CENTER;
    public static final /* enum */ GravityEnum END;
    private static final boolean HAS_RTL;
    public static final /* enum */ GravityEnum START;

    static {
        GravityEnum gravityEnum;
        GravityEnum gravityEnum2;
        GravityEnum gravityEnum3;
        START = gravityEnum3 = new GravityEnum();
        CENTER = gravityEnum2 = new GravityEnum();
        END = gravityEnum = new GravityEnum();
        $VALUES = new GravityEnum[]{gravityEnum3, gravityEnum2, gravityEnum};
        HAS_RTL = true;
    }

    public static GravityEnum valueOf(String string2) {
        return (GravityEnum)Enum.valueOf(GravityEnum.class, (String)string2);
    }

    public static GravityEnum[] values() {
        return (GravityEnum[])$VALUES.clone();
    }

    @SuppressLint(value={"RtlHardcoded"})
    public int getGravityInt() {
        int n = 1.$SwitchMap$com$afollestad$materialdialogs$GravityEnum[this.ordinal()];
        int n2 = 3;
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    n2 = HAS_RTL ? 0x800005 : 5;
                    return n2;
                }
                throw new IllegalStateException("Invalid gravity constant");
            }
            return 1;
        }
        if (HAS_RTL) {
            n2 = 0x800003;
        }
        return n2;
    }

    @TargetApi(value=17)
    public int getTextAlignment() {
        int n = 1.$SwitchMap$com$afollestad$materialdialogs$GravityEnum[this.ordinal()];
        if (n != 2) {
            if (n != 3) {
                return 5;
            }
            return 6;
        }
        return 4;
    }
}

