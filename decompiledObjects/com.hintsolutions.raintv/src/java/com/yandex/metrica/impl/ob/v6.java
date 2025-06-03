/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.L0;
import com.yandex.metrica.impl.ob.U6;
import com.yandex.metrica.impl.ob.Zl;
import com.yandex.metrica.impl.ob.am;
import java.io.File;

public class V6
implements am<File, U6>,
Zl<File> {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @Nullable
    public Object a(@NonNull Object object) {
        if (!TextUtils.isEmpty((CharSequence)(object = L0.a((File)object)))) {
            try {
                return new U6((String)object);
            }
            catch (Throwable throwable) {}
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void b(@NonNull Object object) {
        object = (File)object;
        try {
            object.delete();
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }
}

