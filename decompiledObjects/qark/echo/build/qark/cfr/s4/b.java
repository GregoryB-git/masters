/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  java.io.File
 *  java.io.IOException
 *  java.io.RandomAccessFile
 *  java.lang.Error
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.channels.FileChannel
 *  java.nio.channels.FileLock
 *  java.nio.channels.OverlappingFileLockException
 */
package s4;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

public class b {
    public final FileChannel a;
    public final FileLock b;

    public b(FileChannel fileChannel, FileLock fileLock) {
        this.a = fileChannel;
        this.b = fileLock;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static b a(Context var0, String var1_13) {
        block17 : {
            var2_14 = new RandomAccessFile(new File(var0.getFilesDir(), var1_13), "rw").getChannel();
            var1_13 = var2_14.lock();
            try {
                return new b(var2_14, (FileLock)var1_13);
            }
            catch (OverlappingFileLockException var0_1) {
                break block17;
            }
            catch (Error var0_2) {
                break block17;
            }
            catch (IOException var0_3) {
                break block17;
            }
            catch (OverlappingFileLockException var0_4) {}
            ** GOTO lbl-1000
            catch (Error var0_6) {
                ** GOTO lbl-1000
            }
            catch (IOException var0_7) {}
lbl-1000: // 3 sources:
            {
                var1_13 = null;
                break block17;
            }
            catch (OverlappingFileLockException var0_8) {}
            ** GOTO lbl-1000
            catch (Error var0_9) {
                ** GOTO lbl-1000
            }
            catch (IOException var0_10) {}
lbl-1000: // 3 sources:
            {
                var2_14 = null;
                var1_13 = var2_14;
            }
        }
        Log.e((String)"CrossProcessLock", (String)"encountered error while creating and acquiring the lock, ignoring", (Throwable)var0_5);
        if (var1_13 != null) {
            try {
                var1_13.release();
            }
            catch (IOException var0_11) {}
        }
        if (var2_14 == null) return null;
        try {
            var2_14.close();
            return null;
        }
        catch (IOException var0_12) {
            return null;
        }
    }

    public void b() {
        try {
            this.b.release();
            this.a.close();
            return;
        }
        catch (IOException iOException) {
            Log.e((String)"CrossProcessLock", (String)"encountered error while releasing, ignoring", (Throwable)iOException);
            return;
        }
    }
}

