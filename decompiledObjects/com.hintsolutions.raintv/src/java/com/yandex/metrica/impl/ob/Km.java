/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Base64
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.im;
import com.yandex.metrica.impl.ob.jm;
import com.yandex.metrica.impl.ob.om;
import com.yandex.metrica.impl.ob.pm;
import com.yandex.metrica.impl.ob.rm;

public class km
implements pm {
    @NonNull
    private final jm a;

    public km() {
        this(new im(F0.g().e()));
    }

    public km(@NonNull im im2) {
        this(new jm("AES/CBC/PKCS5Padding", im2.b(), im2.a()));
    }

    @VisibleForTesting
    public km(@NonNull jm jm2) {
        this.a = jm2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NonNull
    public om a(@NonNull c0 c02) {
        Object object = c02.p();
        if (!TextUtils.isEmpty((CharSequence)object)) {
            try {
                object = object.getBytes("UTF-8");
                object = this.a.a((byte[])object);
                if (object != null) {
                    object = Base64.encodeToString((byte[])object, (int)0);
                    return new om(c02.f((String)object), rm.d);
                }
            }
            catch (Throwable throwable) {}
        }
        object = null;
        return new om(c02.f((String)object), rm.d);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    @NonNull
    public byte[] a(@Nullable byte[] object) {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[0];
        if (object == null) return byArray2;
        byArray2 = byArray;
        if (((Object)object).length <= 0) return byArray2;
        try {
            byArray2 = Base64.decode((byte[])object, (int)0);
            object = this.a;
            object.getClass();
            return ((jm)object).a(byArray2, 0, byArray2.length);
        }
        catch (Throwable throwable) {
            return byArray;
        }
    }
}

