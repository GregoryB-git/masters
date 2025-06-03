// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package i0;

import d0.A;
import android.graphics.Matrix;
import java.io.InputStream;
import T.a;
import java.io.ByteArrayInputStream;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory$Options;

public abstract class c
{
    public static Bitmap a(byte[] bitmap, int l, final BitmapFactory$Options bitmapFactory$Options) {
        final Object decodeByteArray = BitmapFactory.decodeByteArray(bitmap, 0, l, bitmapFactory$Options);
        if (decodeByteArray != null) {
            bitmap = (byte[])(Object)new ByteArrayInputStream(bitmap);
            try {
                final a a = new a((InputStream)(Object)bitmap);
                ((InputStream)(Object)bitmap).close();
                l = a.l();
                bitmap = (byte[])decodeByteArray;
                if (l != 0) {
                    bitmap = (byte[])(Object)new Matrix();
                    ((Matrix)(Object)bitmap).postRotate((float)l);
                    bitmap = (byte[])(Object)Bitmap.createBitmap((Bitmap)decodeByteArray, 0, 0, ((Bitmap)decodeByteArray).getWidth(), ((Bitmap)decodeByteArray).getHeight(), (Matrix)(Object)bitmap, false);
                }
                return (Bitmap)(Object)bitmap;
            }
            finally {
                try {
                    ((InputStream)(Object)bitmap).close();
                }
                finally {
                    final Throwable exception;
                    ((Throwable)bitmapFactory$Options).addSuppressed(exception);
                }
            }
        }
        throw A.a("Could not decode image data", new IllegalStateException());
    }
}
