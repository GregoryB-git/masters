/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.ActivationBarrier;
import com.yandex.metrica.impl.ob.Qh;
import com.yandex.metrica.impl.ob.gh;
import com.yandex.metrica.impl.ob.hh;
import com.yandex.metrica.impl.ob.rh;
import com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer;
import java.io.File;

class fh
implements ActivationBarrier.IActivationBarrierCallback {
    public final String a;
    public final File b;
    public final rh c;
    public final Qh d;
    public final hh e;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public fh(hh hh2, String string, File file, rh rh2, Qh qh2) {
        this.e = hh2;
        this.a = string;
        this.b = file;
        this.c = rh2;
        this.d = qh2;
    }

    @Override
    public void onWaitFinished() {
        CacheControlHttpsConnectionPerformer cacheControlHttpsConnectionPerformer = hh.a(this.e);
        String string = this.a;
        hh hh2 = this.e;
        File file = this.b;
        rh rh2 = this.c;
        Qh qh2 = this.d;
        hh2.getClass();
        cacheControlHttpsConnectionPerformer.performConnection(string, new gh(hh2, qh2, file, rh2));
    }
}

