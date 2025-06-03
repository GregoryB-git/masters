/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.widget.EdgeEffect
 *  java.lang.Object
 *  java.lang.Throwable
 */
package L;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

public abstract class c {
    public static EdgeEffect a(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public static float b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.b(edgeEffect);
        }
        return 0.0f;
    }

    public static void c(EdgeEffect edgeEffect, float f8, float f9) {
        a.a(edgeEffect, f8, f9);
    }

    public static float d(EdgeEffect edgeEffect, float f8, float f9) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.c(edgeEffect, f8, f9);
        }
        c.c(edgeEffect, f8, f9);
        return f8;
    }

    public static abstract class a {
        public static void a(EdgeEffect edgeEffect, float f8, float f9) {
            edgeEffect.onPull(f8, f9);
        }
    }

    public static abstract class b {
        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public static EdgeEffect a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            }
            catch (Throwable throwable) {
                return new EdgeEffect(context);
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public static float b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            }
            catch (Throwable throwable) {
                return 0.0f;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static float c(EdgeEffect edgeEffect, float f8, float f9) {
            try {
                return edgeEffect.onPullDistance(f8, f9);
            }
            catch (Throwable throwable) {}
            edgeEffect.onPull(f8, f9);
            return 0.0f;
        }
    }

}

