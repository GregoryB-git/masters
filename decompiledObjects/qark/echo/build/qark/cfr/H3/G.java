/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.List
 *  java.util.zip.GZIPOutputStream
 */
package H3;

import H3.F;
import H3.i;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

public abstract class G {
    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static void a(InputStream inputStream, File file) {
        int n8;
        if (inputStream == null) {
            return;
        }
        byte[] arrby = new byte[8192];
        Object var3_4 = null;
        file = new GZIPOutputStream((OutputStream)new FileOutputStream(file));
        while ((n8 = inputStream.read(arrby)) > 0) {
            file.write(arrby, 0, n8);
        }
        file.finish();
        i.g((Closeable)file);
        return;
        catch (Throwable throwable) {
            block6 : {
                inputStream = var3_4;
                break block6;
                catch (Throwable throwable2) {
                    inputStream = file;
                    file = throwable2;
                }
            }
            i.g((Closeable)inputStream);
            throw file;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void b(File file, List list) {
        Iterator iterator = list.iterator();
        do {
            if (!iterator.hasNext()) {
                return;
            }
            F f8 = (F)iterator.next();
            list = null;
            InputStream inputStream = null;
            try {
                InputStream inputStream2 = f8.i();
                if (inputStream2 == null) {
                    list = inputStream2;
                } else {
                    inputStream = inputStream2;
                    list = inputStream2;
                    G.a(inputStream2, new File(file, f8.j()));
                    list = inputStream2;
                }
            }
            catch (Throwable throwable) {
                i.g((Closeable)inputStream);
                throw throwable;
            }
            catch (IOException iOException) {}
            i.g((Closeable)list);
        } while (true);
    }
}

