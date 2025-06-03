package v1;

import android.util.Log;
import defpackage.g;
import ec.i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f15207e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15208a;

    /* renamed from: b, reason: collision with root package name */
    public final File f15209b;

    /* renamed from: c, reason: collision with root package name */
    public final Lock f15210c;

    /* renamed from: d, reason: collision with root package name */
    public FileChannel f15211d;

    public a(String str, File file, boolean z10) {
        Lock lock;
        this.f15208a = z10;
        File file2 = new File(file, g.d(str, ".lck"));
        this.f15209b = file2;
        String absolutePath = file2.getAbsolutePath();
        i.d(absolutePath, "lockFile.absolutePath");
        HashMap hashMap = f15207e;
        synchronized (hashMap) {
            Object obj = hashMap.get(absolutePath);
            if (obj == null) {
                obj = new ReentrantLock();
                hashMap.put(absolutePath, obj);
            }
            lock = (Lock) obj;
        }
        this.f15210c = lock;
    }

    public final void a(boolean z10) {
        this.f15210c.lock();
        if (z10) {
            try {
                File parentFile = this.f15209b.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f15209b).getChannel();
                channel.lock();
                this.f15211d = channel;
            } catch (IOException e10) {
                this.f15211d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f15211d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f15210c.unlock();
    }
}
