package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;
import p.b;
import p.m;
import p.n;
import p.o;
import p.p;
import p.u;

/* loaded from: classes.dex */
public class CustomTabActivityHelper implements ServiceConnectionCallback {
    private n mClient;
    private p mConnection;
    private ConnectionCallback mConnectionCallback;
    private b mCustomTabsCallback;
    private u mCustomTabsSession;

    public interface ConnectionCallback {
        void onCustomTabsConnected();

        void onCustomTabsDisconnected();
    }

    public static boolean isAvailable(Activity activity) {
        return CustomTabsHelper.getPackageNameToUse(activity) != null;
    }

    public static void openCustomTab(Activity activity, Intent intent, Uri uri, Map<String, String> map, Uri uri2, int i10) {
        intent.setData(uri);
        if (map != null) {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            intent.putExtra("com.android.browser.headers", bundle);
        }
        if (uri2 != null) {
            intent.putExtra("android.intent.extra.REFERRER", uri2);
        }
        activity.startActivityForResult(intent, i10);
    }

    public static void openCustomTab(Activity activity, o oVar, Uri uri, Map<String, String> map, Uri uri2, int i10) {
        openCustomTab(activity, oVar.f12724a, uri, map, uri2, i10);
    }

    public static void openTrustedWebActivity(Activity activity, q.b bVar, Uri uri, Map<String, String> map, Uri uri2, int i10) {
        openCustomTab(activity, bVar.f13176a, uri, map, uri2, i10);
    }

    public boolean bindCustomTabsService(Activity activity) {
        if (this.mClient != null) {
            return true;
        }
        String packageNameToUse = CustomTabsHelper.getPackageNameToUse(activity);
        if (packageNameToUse == null) {
            return false;
        }
        ServiceConnection serviceConnection = new ServiceConnection(this);
        this.mConnection = serviceConnection;
        serviceConnection.setApplicationContext(activity.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(packageNameToUse)) {
            intent.setPackage(packageNameToUse);
        }
        return activity.bindService(intent, serviceConnection, 33);
    }

    public u getSession() {
        u uVar;
        n nVar = this.mClient;
        if (nVar != null) {
            if (this.mCustomTabsSession == null) {
                m mVar = new m(this.mCustomTabsCallback);
                if (nVar.f12722a.T1(mVar)) {
                    uVar = new u(nVar.f12722a, mVar, nVar.f12723b);
                    this.mCustomTabsSession = uVar;
                }
            }
            return this.mCustomTabsSession;
        }
        uVar = null;
        this.mCustomTabsSession = uVar;
        return this.mCustomTabsSession;
    }

    public boolean mayLaunchUrl(Uri uri, Bundle bundle, List<Bundle> list) {
        u session;
        if (this.mClient == null || (session = getSession()) == null) {
            return false;
        }
        try {
            return session.f12745b.T(session.f12746c, uri, session.a(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ServiceConnectionCallback
    public void onServiceConnected(n nVar) {
        this.mClient = nVar;
        nVar.getClass();
        try {
            nVar.f12722a.g1(0L);
        } catch (RemoteException unused) {
        }
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onCustomTabsConnected();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ServiceConnectionCallback
    public void onServiceDisconnected() {
        this.mClient = null;
        this.mCustomTabsSession = null;
        ConnectionCallback connectionCallback = this.mConnectionCallback;
        if (connectionCallback != null) {
            connectionCallback.onCustomTabsDisconnected();
        }
    }

    public void setConnectionCallback(ConnectionCallback connectionCallback) {
        this.mConnectionCallback = connectionCallback;
    }

    public void setCustomTabsCallback(b bVar) {
        this.mCustomTabsCallback = bVar;
    }

    public void unbindCustomTabsService(Activity activity) {
        p pVar = this.mConnection;
        if (pVar == null) {
            return;
        }
        activity.unbindService(pVar);
        this.mClient = null;
        this.mCustomTabsSession = null;
        this.mConnection = null;
    }
}
