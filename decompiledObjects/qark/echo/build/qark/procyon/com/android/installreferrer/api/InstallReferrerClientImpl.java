// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.android.installreferrer.api;

import android.os.BaseBundle;
import android.os.IBinder;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.content.pm.ServiceInfo;
import java.util.List;
import android.content.pm.ResolveInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.os.RemoteException;
import android.os.Bundle;
import com.android.installreferrer.commons.InstallReferrerCommons;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ServiceConnection;
import r2.a;
import android.content.Context;

public class InstallReferrerClientImpl extends InstallReferrerClient
{
    public int a;
    public final Context b;
    public a c;
    public ServiceConnection d;
    
    public InstallReferrerClientImpl(final Context context) {
        this.a = 0;
        this.b = context.getApplicationContext();
    }
    
    public static /* synthetic */ a a(final InstallReferrerClientImpl installReferrerClientImpl, final a c) {
        return installReferrerClientImpl.c = c;
    }
    
    public static /* synthetic */ int b(final InstallReferrerClientImpl installReferrerClientImpl, final int a) {
        return installReferrerClientImpl.a = a;
    }
    
    public final boolean c() {
        final PackageManager packageManager = this.b.getPackageManager();
        try {
            return packageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
    
    @Override
    public void endConnection() {
        this.a = 3;
        if (this.d != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.b.unbindService(this.d);
            this.d = null;
        }
        this.c = null;
    }
    
    @Override
    public ReferrerDetails getInstallReferrer() {
        if (this.isReady()) {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("package_name", this.b.getPackageName());
            try {
                return new ReferrerDetails(this.c.P(bundle));
            }
            catch (RemoteException ex) {
                InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
                this.a = 0;
                throw ex;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }
    
    @Override
    public boolean isReady() {
        return this.a == 2 && this.c != null && this.d != null;
    }
    
    @Override
    public void startConnection(final InstallReferrerStateListener installReferrerStateListener) {
        if (this.isReady()) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        final int a = this.a;
        if (a == 1) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (a == 3) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Starting install referrer service setup.");
        final Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        final List queryIntentServices = this.b.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            final ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                final String packageName = serviceInfo.packageName;
                final String name = serviceInfo.name;
                if (!"com.android.vending".equals(packageName) || name == null || !this.c()) {
                    InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                    this.a = 0;
                    installReferrerStateListener.onInstallReferrerSetupFinished(2);
                    return;
                }
                final Intent intent2 = new Intent(intent);
                final b d = new b(installReferrerStateListener, null);
                this.d = (ServiceConnection)d;
                if (this.b.bindService(intent2, (ServiceConnection)d, 1)) {
                    InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
                    return;
                }
                InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
                this.a = 0;
                installReferrerStateListener.onInstallReferrerSetupFinished(1);
                return;
            }
        }
        this.a = 0;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service unavailable on device.");
        installReferrerStateListener.onInstallReferrerSetupFinished(2);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }
    
    public final class b implements ServiceConnection
    {
        public final InstallReferrerStateListener a;
        
        public b(final InstallReferrerStateListener a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
        
        public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
            InstallReferrerClientImpl.a(InstallReferrerClientImpl.this, r2.a.a.n(binder));
            InstallReferrerClientImpl.b(InstallReferrerClientImpl.this, 2);
            this.a.onInstallReferrerSetupFinished(0);
        }
        
        public void onServiceDisconnected(final ComponentName componentName) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
            InstallReferrerClientImpl.a(InstallReferrerClientImpl.this, null);
            InstallReferrerClientImpl.b(InstallReferrerClientImpl.this, 0);
            this.a.onInstallReferrerServiceDisconnected();
        }
    }
}
