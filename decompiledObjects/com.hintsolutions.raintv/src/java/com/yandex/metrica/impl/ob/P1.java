/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.RemoteException
 *  androidx.annotation.NonNull
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.yandex.metrica.MetricaService;
import com.yandex.metrica.impl.ob.B1;

public interface p1
extends B1 {
    public void a(int var1, Bundle var2);

    public void a(@NonNull Bundle var1);

    public void a(@NonNull MetricaService.d var1);

    @Deprecated
    public void a(String var1, int var2, String var3, Bundle var4) throws RemoteException;

    public void b(@NonNull Bundle var1);

    public void reportData(Bundle var1);
}

