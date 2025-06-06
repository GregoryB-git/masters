package H3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes.dex */
public abstract class G {
    public static void a(InputStream inputStream, File file) {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        gZIPOutputStream2.finish();
                        AbstractC0387i.g(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, read);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    AbstractC0387i.g(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void b(File file, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F f7 = (F) it.next();
            InputStream inputStream = null;
            try {
                inputStream = f7.i();
                if (inputStream != null) {
                    a(inputStream, new File(file, f7.j()));
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                AbstractC0387i.g(null);
                throw th;
            }
            AbstractC0387i.g(inputStream);
        }
    }
}
