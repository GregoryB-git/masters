/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  java.io.BufferedInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 */
package com.hintsolutions.raintv.services.audio;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.hintsolutions.raintv.services.audio.LogHelper;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class BitmapHelper {
    private static final int MAX_READ_LIMIT_PER_IMG = 0x100000;
    private static final String TAG = LogHelper.makeLogTag(BitmapHelper.class);

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Bitmap fetchAndRescaleBitmap(String string2, int n, int n2) throws IOException {
        void var0_3;
        URL uRL;
        block5: {
            URL uRL2 = new URL(string2);
            uRL = null;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection)uRL2.openConnection();
                uRL2 = new BufferedInputStream(httpURLConnection.getInputStream());
            }
            catch (Throwable throwable) {
                // empty catch block
                break block5;
            }
            try {
                uRL2.mark(0x100000);
                int n3 = BitmapHelper.findScaleFactor(n, n2, (InputStream)uRL2);
                LogHelper.d(TAG, "Scaling bitmap ", string2, " by factor ", n3, " to support ", n, "x", n2, "requested dimension");
                uRL2.reset();
                string2 = BitmapHelper.scaleBitmap(n3, (InputStream)uRL2);
            }
            catch (Throwable throwable) {
                uRL = uRL2;
                break block5;
            }
            uRL2.close();
            return string2;
        }
        if (uRL != null) {
            uRL.close();
        }
        throw var0_3;
    }

    public static int findScaleFactor(int n, int n2, InputStream inputStream) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream((InputStream)inputStream, null, (BitmapFactory.Options)options);
        int n3 = options.outWidth;
        int n4 = options.outHeight;
        return Math.min((int)(n3 / n), (int)(n4 / n2));
    }

    public static Bitmap scaleBitmap(int n, InputStream inputStream) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = n;
        return BitmapFactory.decodeStream((InputStream)inputStream, null, (BitmapFactory.Options)options);
    }

    public static Bitmap scaleBitmap(Bitmap bitmap, int n, int n2) {
        double d2 = Math.min((double)((double)n / (double)bitmap.getWidth()), (double)((double)n2 / (double)bitmap.getHeight()));
        return Bitmap.createScaledBitmap((Bitmap)bitmap, (int)((int)((double)bitmap.getWidth() * d2)), (int)((int)((double)bitmap.getHeight() * d2)), (boolean)false);
    }
}

