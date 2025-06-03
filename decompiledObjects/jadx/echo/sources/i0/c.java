package i0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import d0.C1162A;
import java.io.ByteArrayInputStream;

/* loaded from: classes.dex */
public abstract class c {
    public static Bitmap a(byte[] bArr, int i7, BitmapFactory.Options options) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i7, options);
        if (decodeByteArray == null) {
            throw C1162A.a("Could not decode image data", new IllegalStateException());
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            T.a aVar = new T.a(byteArrayInputStream);
            byteArrayInputStream.close();
            int l7 = aVar.l();
            if (l7 == 0) {
                return decodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(l7);
            return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
