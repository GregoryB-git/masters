/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Point
 *  android.util.DisplayMetrics
 *  android.view.Display
 *  android.view.WindowManager
 *  androidx.annotation.AnyThread
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.H1;
import com.yandex.metrica.impl.ob.c2;

public class d2 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @AnyThread
    @Nullable
    private Point a(@NonNull Display display) {
        if (display == null) return null;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getRealMetrics(displayMetrics);
            int n4 = displayMetrics.widthPixels;
            int n5 = displayMetrics.heightPixels;
            return new Point(n4, n5);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public c2 a(@NonNull Context var1_1) {
        block15: {
            var8_2 = A2.a(30);
            if (!var8_2) break block15;
            try {
                var9_3 = l4.c(var1_1);
                ** GOTO lbl10
            }
            catch (Throwable var9_4) {
                ** continue;
            }
        }
lbl8:
        // 2 sources

        while (true) {
            block16: {
                var9_3 = null;
lbl10:
                // 2 sources

                var10_6 = var9_3;
                if (var9_3 == null) {
                    var10_6 = ((WindowManager)var1_1.getSystemService("window")).getDefaultDisplay();
                }
                if (var10_6 == null) break block16;
                try {
                    var9_3 = this.a(var10_6);
                    ** GOTO lbl21
                }
                catch (Throwable var9_5) {
                    ** continue;
                }
            }
lbl19:
            // 2 sources

            while (true) {
                var9_3 = null;
lbl21:
                // 2 sources

                if (var9_3 == null) {
                    return null;
                }
                var6_8 = Math.max((int)var9_3.x, (int)var9_3.y);
                var7_9 = Math.min((int)var9_3.x, (int)var9_3.y);
                var5_10 = 0;
                var2_11 = 0.0f;
                var4_12 = var5_10;
                var10_6 = var1_1.getResources().getDisplayMetrics();
                var4_12 = var5_10;
                var4_12 = var5_10 = var10_6.densityDpi;
                var2_11 = var3_13 = var10_6.density;
                var4_12 = var5_10;
lbl36:
                // 2 sources

                return new c2(var6_8, var7_9, var4_12, var2_11, H1.a(var1_1, (Point)var9_3));
            }
            break;
        }
        catch (Throwable var10_7) {
            ** continue;
        }
    }
}

