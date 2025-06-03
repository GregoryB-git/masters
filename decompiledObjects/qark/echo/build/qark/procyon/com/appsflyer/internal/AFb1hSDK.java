// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.content.pm.PackageItemInfo;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import android.content.pm.PackageManager$NameNotFoundException;
import java.security.cert.CertificateException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import android.content.Context;

public abstract class AFb1hSDK<T>
{
    public final Context AFInAppEventParameterName;
    public final AFc1xSDK AFInAppEventType;
    public final String AFKeystoreWrapper;
    private final String[] valueOf;
    public final FutureTask<T> values;
    
    public AFb1hSDK(final Context afInAppEventParameterName, final AFc1xSDK afInAppEventType, final String afKeystoreWrapper, final String... valueOf) {
        this.values = new FutureTask<T>(new Callable<T>() {
            @Override
            public final T call() {
                if (AFb1hSDK.this.AFKeystoreWrapper()) {
                    return AFb1hSDK.this.values();
                }
                return null;
            }
        });
        this.AFInAppEventParameterName = afInAppEventParameterName;
        this.AFKeystoreWrapper = afKeystoreWrapper;
        this.valueOf = valueOf;
        this.AFInAppEventType = afInAppEventType;
    }
    
    public final boolean AFKeystoreWrapper() {
        Label_0069: {
            try {
                final ProviderInfo resolveContentProvider = this.AFInAppEventParameterName.getPackageManager().resolveContentProvider(this.AFKeystoreWrapper, 128);
                if (resolveContentProvider != null && Arrays.asList(this.valueOf).contains(AFa1fSDK.values(this.AFInAppEventParameterName.getPackageManager(), ((PackageItemInfo)resolveContentProvider).packageName))) {
                    return true;
                }
            }
            catch (NoSuchAlgorithmException ex) {
                break Label_0069;
            }
            catch (CertificateException ex) {
                break Label_0069;
            }
            catch (PackageManager$NameNotFoundException ex) {
                break Label_0069;
            }
            return false;
        }
        final NoSuchAlgorithmException ex;
        AFLogger.afErrorLog(ex.getMessage(), ex);
        return false;
    }
    
    public T valueOf() {
        T value = null;
        try {
            value = this.values.get(500L, TimeUnit.MILLISECONDS);
            return value;
        }
        catch (TimeoutException value) {}
        catch (ExecutionException value) {}
        catch (InterruptedException ex) {}
        AFLogger.afErrorLog(((Throwable)value).getMessage(), (Throwable)value);
        return null;
    }
    
    public abstract T values();
}
