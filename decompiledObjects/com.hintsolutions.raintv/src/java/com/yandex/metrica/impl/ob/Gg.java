/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.MainThread
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  androidx.annotation.WorkerThread
 *  com.android.installreferrer.api.InstallReferrerClient
 *  com.android.installreferrer.api.InstallReferrerStateListener
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.Tf;
import com.yandex.metrica.impl.ob.ag;
import com.yandex.metrica.impl.ob.hg;
import com.yandex.metrica.impl.ob.lg;

public class gg
implements ag {
    @NonNull
    private final InstallReferrerClient a;
    @NonNull
    private final ICommonExecutor b;

    @VisibleForTesting
    public gg(@NonNull InstallReferrerClient installReferrerClient, @NonNull ICommonExecutor iCommonExecutor) {
        this.a = installReferrerClient;
        this.b = iCommonExecutor;
    }

    public static void a(gg gg2, lg lg2, Throwable throwable) {
        gg2.b.execute(new hg(gg2, lg2, throwable));
    }

    @Override
    public void a(@NonNull lg object) throws Throwable {
        object = new InstallReferrerStateListener(){
            public final lg a;
            public final gg b;
            {
                this.b = gg2;
                this.a = lg2;
            }

            @MainThread
            public void onInstallReferrerServiceDisconnected() {
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @MainThread
            public void onInstallReferrerSetupFinished(int n2) {
                if (n2 == 0) {
                    try {
                        Object object = this.b.a.getInstallReferrer();
                        Tf tf2 = new Tf(object.getInstallReferrer(), object.getReferrerClickTimestampSeconds(), object.getInstallBeginTimestampSeconds(), Tf.a.c);
                        object = this.b.b;
                        Runnable runnable = new Runnable(){
                            public final Tf a;
                            public final a b;
                            {
                                this.b = a2;
                                this.a = tf2;
                            }

                            @WorkerThread
                            public void run() {
                                this.b.a.a(this.a);
                            }
                        };
                        object.execute(runnable);
                    }
                    catch (Throwable throwable) {
                        gg.a(this.b, this.a, throwable);
                    }
                } else {
                    gg.a(this.b, this.a, (Throwable)new IllegalStateException(a.f("Referrer check failed with error ", n2)));
                }
                try {
                    this.b.a.endConnection();
                    return;
                }
                catch (Throwable throwable) {
                    return;
                }
            }
        };
        this.a.startConnection((InstallReferrerStateListener)object);
    }
}

