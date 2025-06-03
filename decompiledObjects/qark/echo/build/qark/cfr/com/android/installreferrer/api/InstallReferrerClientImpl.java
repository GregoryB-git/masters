/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ResolveInfo
 *  android.content.pm.ServiceInfo
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.RemoteException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.annotation.Annotation
 *  java.lang.annotation.Retention
 *  java.lang.annotation.RetentionPolicy
 *  java.util.List
 */
package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.android.installreferrer.commons.InstallReferrerCommons;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import r2.a;

public class InstallReferrerClientImpl
extends InstallReferrerClient {
    public int a = 0;
    public final Context b;
    public a c;
    public ServiceConnection d;

    public InstallReferrerClientImpl(Context context) {
        this.b = context.getApplicationContext();
    }

    public final boolean c() {
        PackageManager packageManager = this.b.getPackageManager();
        try {
            int n8 = packageManager.getPackageInfo((String)"com.android.vending", (int)128).versionCode;
            if (n8 >= 80837300) {
                return true;
            }
            return false;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
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
            Object object = new Bundle();
            object.putString("package_name", this.b.getPackageName());
            try {
                object = new ReferrerDetails(this.c.P((Bundle)object));
                return object;
            }
            catch (RemoteException remoteException) {
                InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
                this.a = 0;
                throw remoteException;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    @Override
    public boolean isReady() {
        if (this.a == 2 && this.c != null && this.d != null) {
            return true;
        }
        return false;
    }

    @Override
    public void startConnection(InstallReferrerStateListener installReferrerStateListener) {
        Object object;
        if (this.isReady()) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int n8 = this.a;
        if (n8 == 1) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (n8 == 3) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        Object object2 = this.b.getPackageManager().queryIntentServices(intent, 0);
        if (object2 != null && !object2.isEmpty() && (object = ((ResolveInfo)object2.get((int)0)).serviceInfo) != null) {
            object2 = object.packageName;
            object = object.name;
            if ("com.android.vending".equals(object2) && object != null && this.c()) {
                intent = new Intent(intent);
                this.d = object2 = new b(installReferrerStateListener, null);
                if (this.b.bindService(intent, (ServiceConnection)object2, 1)) {
                    InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
                    return;
                }
                InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
                this.a = 0;
                installReferrerStateListener.onInstallReferrerSetupFinished(1);
                return;
            }
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.a = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        this.a = 0;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service unavailable on device.");
        installReferrerStateListener.onInstallReferrerSetupFinished(2);
    }

    @Retention(value=RetentionPolicy.SOURCE)
    public static @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    public final class b
    implements ServiceConnection {
        public final InstallReferrerStateListener a;

        public b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener != null) {
                this.a = installReferrerStateListener;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }

        public /* synthetic */ b(InstallReferrerStateListener installReferrerStateListener,  a8) {
            this(installReferrerStateListener);
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
            InstallReferrerClientImpl.this.c = a.a.n(iBinder);
            InstallReferrerClientImpl.this.a = 2;
            this.a.onInstallReferrerSetupFinished(0);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
            InstallReferrerClientImpl.this.c = null;
            InstallReferrerClientImpl.this.a = 0;
            this.a.onInstallReferrerServiceDisconnected();
        }
    }

}

