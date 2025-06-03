/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffXfermode
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Xfermode
 *  androidx.annotation.Nullable
 *  java.lang.Object
 */
package com.vk.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import androidx.annotation.Nullable;

public class VKUIHelper {
    private static Context sApplicationContext;

    @Nullable
    public static Context getApplicationContext() {
        return sApplicationContext;
    }

    public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, int n, int n3) {
        Context context;
        if (bitmap != null && (context = sApplicationContext) != null) {
            int n4 = (int)(context.getResources().getDisplayMetrics().density * (float)n);
            float f2 = (float)bitmap.getHeight() * 1.0f / (float)n4;
            n = (int)((float)bitmap.getWidth() / f2);
            context = Bitmap.createBitmap((int)n, (int)n4, (Bitmap.Config)Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas((Bitmap)context);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            Rect rect2 = new Rect(0, 0, n, n4);
            RectF rectF = new RectF(rect2);
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-1);
            f2 = n3;
            canvas.drawRoundRect(rectF, f2, f2, paint);
            paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            return context;
        }
        return bitmap;
    }

    public static void setApplicationContext(Context context) {
        if (context != null) {
            sApplicationContext = context.getApplicationContext();
        }
    }
}

