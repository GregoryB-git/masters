/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.B0;
import com.yandex.metrica.impl.ob.Pi;
import java.io.File;

public class Ti
implements Pi {
    @NonNull
    private final Context a;
    @NonNull
    private final B0 b;

    @VisibleForTesting
    public Ti(@NonNull Context context, @NonNull B0 b02) {
        this.a = context;
        this.b = b02;
    }

    private boolean b() {
        boolean bl;
        block6: {
            B0 b02;
            boolean bl2;
            Object object = this.b.c(this.a);
            boolean bl3 = false;
            if (object != null) {
                this.b.getClass();
                bl2 = new File(object, "metrica_data.db").exists();
            } else {
                bl2 = false;
            }
            bl = bl2;
            if (!bl2) {
                bl = bl2;
                if (A2.a(21)) {
                    object = this.b;
                    b02 = this.a;
                    object.getClass();
                    object = b02.getNoBackupFilesDir();
                    object = object == null ? null : new File(object, "metrica_data.db");
                    bl = object != null && object.exists();
                }
            }
            if (bl) break block6;
            b02 = this.b;
            object = this.a;
            b02.getClass();
            object = object.getDatabasePath("metrica_data.db");
            bl = bl3;
            if (object != null) {
                bl = bl3;
                if (object.exists()) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    @Override
    public boolean a() {
        return this.b() ^ true;
    }
}

