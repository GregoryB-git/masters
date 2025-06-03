/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.usage.StorageStatsManager
 *  android.content.Context
 *  android.os.Environment
 *  android.os.StatFs
 *  android.os.storage.StorageManager
 *  android.os.storage.StorageVolume
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.UUID
 */
package com.yandex.metrica.impl.ob;

import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.A2;
import java.util.Iterator;
import java.util.UUID;

public class q0 {
    @NonNull
    private final Context a;
    @NonNull
    private final b b;

    public q0(@NonNull Context context) {
        this(context, new b());
    }

    @VisibleForTesting
    public q0(@NonNull Context context, @NonNull b b2) {
        this.a = context;
        this.b = b2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    public a a() {
        long l5;
        StorageManager storageManager;
        StorageStatsManager storageStatsManager;
        boolean bl = A2.a(26);
        long l8 = 0L;
        if (bl) {
            storageStatsManager = (StorageStatsManager)this.a.getSystemService("storagestats");
            storageManager = (StorageManager)this.a.getSystemService("storage");
            if (storageManager == null || storageStatsManager == null) {
                l5 = 0L;
                return new a(l5 / 1024L, l8 / 1024L);
            }
        } else {
            void var10_20;
            if (A2.a(18)) {
                void var10_16;
                try {
                    this.b.getClass();
                    StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                    l8 = statFs.getBlockSizeLong();
                    a a2 = new a(statFs.getBlockCountLong() * l8 / 1024L, statFs.getAvailableBlocksLong() * l8 / 1024L);
                    return var10_16;
                }
                catch (Throwable throwable) {
                    a a3 = new a(0L, 0L);
                }
                return var10_16;
            }
            try {
                this.b.getClass();
                StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                l8 = statFs.getBlockSize();
                a a5 = new a((long)statFs.getBlockCount() * l8 / 1024L, (long)statFs.getAvailableBlocks() * l8 / 1024L);
                return var10_20;
            }
            catch (Throwable throwable) {
                a a7 = new a(0L, 0L);
            }
            return var10_20;
        }
        Iterator iterator = storageManager.getStorageVolumes().iterator();
        l5 = 0L;
        while (true) {
            long l9;
            if (!iterator.hasNext()) {
                l9 = l5;
                l5 = l8;
                l8 = l9;
                return new a(l5 / 1024L, l8 / 1024L);
            }
            StorageVolume storageVolume = (StorageVolume)iterator.next();
            try {
                void var10_12;
                String string = storageVolume.getUuid();
                if (string == null) {
                    UUID uUID = StorageManager.UUID_DEFAULT;
                } else {
                    UUID uUID = UUID.fromString((String)string);
                }
                long l10 = storageStatsManager.getTotalBytes((UUID)var10_12);
                l9 = storageStatsManager.getFreeBytes((UUID)var10_12);
                l8 += l10;
                l5 += l9;
            }
            catch (Throwable throwable) {
            }
        }
    }

    public static class a {
        public final long a;
        public final long b;

        public a(long l5, long l8) {
            this.a = l5;
            this.b = l8;
        }
    }

    public static class b {
    }
}

