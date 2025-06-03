/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageItemInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ProviderInfo
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.security.NoSuchAlgorithmException
 *  java.security.cert.CertificateException
 *  java.util.Arrays
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.FutureTask
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFa1fSDK;
import com.appsflyer.internal.AFc1xSDK;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class AFb1hSDK<T> {
    public final Context AFInAppEventParameterName;
    public final AFc1xSDK AFInAppEventType;
    public final String AFKeystoreWrapper;
    private final String[] valueOf;
    public final FutureTask<T> values;

    public /* varargs */ AFb1hSDK(Context context, AFc1xSDK aFc1xSDK, String string2, String ... arrstring) {
        this.values = new FutureTask(new Callable<T>(this){
            private /* synthetic */ AFb1hSDK valueOf;
            {
                this.valueOf = aFb1hSDK;
            }

            public final T call() {
                if (this.valueOf.AFKeystoreWrapper()) {
                    return this.valueOf.values();
                }
                return null;
            }
        });
        this.AFInAppEventParameterName = context;
        this.AFKeystoreWrapper = string2;
        this.valueOf = arrstring;
        this.AFInAppEventType = aFc1xSDK;
    }

    public final boolean AFKeystoreWrapper() {
        void var2_5;
        block7 : {
            block6 : {
                ProviderInfo providerInfo = this.AFInAppEventParameterName.getPackageManager().resolveContentProvider(this.AFKeystoreWrapper, 128);
                if (providerInfo == null) break block6;
                try {
                    boolean bl = Arrays.asList((Object[])this.valueOf).contains((Object)AFa1fSDK.values(this.AFInAppEventParameterName.getPackageManager(), providerInfo.packageName));
                    if (bl) {
                        return true;
                    }
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                    break block7;
                }
                catch (CertificateException certificateException) {
                    break block7;
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    break block7;
                }
            }
            return false;
        }
        AFLogger.afErrorLog(var2_5.getMessage(), (Throwable)var2_5);
        return false;
    }

    public T valueOf() {
        Object object;
        void var1_5;
        try {
            object = this.values.get(500L, TimeUnit.MILLISECONDS);
        }
        catch (TimeoutException timeoutException) {
        }
        catch (ExecutionException executionException) {
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        return (T)object;
        AFLogger.afErrorLog(var1_5.getMessage(), (Throwable)var1_5);
        return null;
    }

    public abstract T values();

}

