/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapShader
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  com.squareup.picasso.Transformation
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import com.squareup.picasso.Transformation;

public class CircularTransformation
implements Transformation {
    public String key() {
        return "circle";
    }

    public Bitmap transform(Bitmap bitmap) {
        int n = Math.min((int)bitmap.getWidth(), (int)bitmap.getHeight());
        Bitmap bitmap2 = Bitmap.createBitmap((Bitmap)bitmap, (int)((bitmap.getWidth() - n) / 2), (int)((bitmap.getHeight() - n) / 2), (int)n, (int)n);
        if (bitmap2 != bitmap) {
            bitmap.recycle();
        }
        Bitmap bitmap3 = Bitmap.createBitmap((int)n, (int)n, (Bitmap.Config)bitmap.getConfig());
        bitmap = new Canvas(bitmap3);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader((Shader)new BitmapShader(bitmap2, tileMode, tileMode));
        paint.setAntiAlias(true);
        float f = (float)n / 2.0f;
        bitmap.drawCircle(f, f, f, paint);
        bitmap2.recycle();
        return bitmap3;
    }
}

