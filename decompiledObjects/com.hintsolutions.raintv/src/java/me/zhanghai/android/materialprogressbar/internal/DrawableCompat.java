/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PorterDuff$Mode
 *  java.lang.Object
 */
package me.zhanghai.android.materialprogressbar.internal;

import android.graphics.PorterDuff;

public class DrawableCompat {
    public static PorterDuff.Mode parseTintMode(int n3, PorterDuff.Mode mode) {
        if (n3 != 3) {
            if (n3 != 5) {
                if (n3 != 9) {
                    switch (n3) {
                        default: {
                            return mode;
                        }
                        case 16: {
                            return PorterDuff.Mode.ADD;
                        }
                        case 15: {
                            return PorterDuff.Mode.SCREEN;
                        }
                        case 14: 
                    }
                    return PorterDuff.Mode.MULTIPLY;
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}

