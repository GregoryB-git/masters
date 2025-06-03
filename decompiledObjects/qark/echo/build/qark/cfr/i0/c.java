/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.graphics.Matrix
 *  java.io.ByteArrayInputStream
 *  java.io.InputStream
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Throwable
 */
package i0;

import T.a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import d0.A;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public abstract class c {
    public static Bitmap a(byte[] byteArrayInputStream, int n8, BitmapFactory.Options options) {
        if ((options = BitmapFactory.decodeByteArray((byte[])byteArrayInputStream, (int)0, (int)n8, (BitmapFactory.Options)options)) != null) {
            a a8;
            byteArrayInputStream = new ByteArrayInputStream((byte[])byteArrayInputStream);
            try {
                a8 = new a((InputStream)byteArrayInputStream);
            }
            catch (Throwable throwable) {
                try {
                    byteArrayInputStream.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            byteArrayInputStream.close();
            n8 = a8.l();
            byteArrayInputStream = options;
            if (n8 != 0) {
                byteArrayInputStream = new Matrix();
                byteArrayInputStream.postRotate((float)n8);
                byteArrayInputStream = Bitmap.createBitmap((Bitmap)options, (int)0, (int)0, (int)options.getWidth(), (int)options.getHeight(), (Matrix)byteArrayInputStream, (boolean)false);
            }
            return byteArrayInputStream;
        }
        throw A.a("Could not decode image data", (Throwable)new IllegalStateException());
    }
}

