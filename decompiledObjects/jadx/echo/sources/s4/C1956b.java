package s4;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: s4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1956b {

    /* renamed from: a, reason: collision with root package name */
    public final FileChannel f19272a;

    /* renamed from: b, reason: collision with root package name */
    public final FileLock f19273b;

    public C1956b(FileChannel fileChannel, FileLock fileLock) {
        this.f19272a = fileChannel;
        this.f19273b = fileLock;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static s4.C1956b a(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L30 java.io.IOException -> L32
            java.io.File r4 = r4.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L30 java.io.IOException -> L32
            r1.<init>(r4, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L30 java.io.IOException -> L32
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L30 java.io.IOException -> L32
            java.lang.String r5 = "rw"
            r4.<init>(r1, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L30 java.io.IOException -> L32
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2c java.lang.Error -> L30 java.io.IOException -> L32
            java.nio.channels.FileLock r5 = r4.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L25 java.lang.Error -> L28 java.io.IOException -> L2a
            s4.b r1 = new s4.b     // Catch: java.nio.channels.OverlappingFileLockException -> L1f java.lang.Error -> L21 java.io.IOException -> L23
            r1.<init>(r4, r5)     // Catch: java.nio.channels.OverlappingFileLockException -> L1f java.lang.Error -> L21 java.io.IOException -> L23
            return r1
        L1f:
            r1 = move-exception
            goto L34
        L21:
            r1 = move-exception
            goto L34
        L23:
            r1 = move-exception
            goto L34
        L25:
            r1 = move-exception
        L26:
            r5 = r0
            goto L34
        L28:
            r1 = move-exception
            goto L26
        L2a:
            r1 = move-exception
            goto L26
        L2c:
            r1 = move-exception
        L2d:
            r4 = r0
            r5 = r4
            goto L34
        L30:
            r1 = move-exception
            goto L2d
        L32:
            r1 = move-exception
            goto L2d
        L34:
            java.lang.String r2 = "CrossProcessLock"
            java.lang.String r3 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r2, r3, r1)
            if (r5 == 0) goto L40
            r5.release()     // Catch: java.io.IOException -> L40
        L40:
            if (r4 == 0) goto L45
            r4.close()     // Catch: java.io.IOException -> L45
        L45:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.C1956b.a(android.content.Context, java.lang.String):s4.b");
    }

    public void b() {
        try {
            this.f19273b.release();
            this.f19272a.close();
        } catch (IOException e7) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e7);
        }
    }
}
