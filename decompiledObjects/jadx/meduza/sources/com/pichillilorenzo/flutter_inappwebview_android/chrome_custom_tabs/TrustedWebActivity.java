package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p.a;
import p.o;
import p.u;
import q.b;
import q.c;

/* loaded from: classes.dex */
public class TrustedWebActivity extends ChromeCustomTabsActivity {
    public static final String LOG_TAG = "TrustedWebActivity";
    public c builder;

    private void prepareCustomTabs() {
        String str = this.customSettings.toolbarBackgroundColor;
        Integer num = null;
        Integer valueOf = (str == null || str.isEmpty()) ? null : Integer.valueOf(Color.parseColor(this.customSettings.toolbarBackgroundColor) | (-16777216));
        String str2 = this.customSettings.navigationBarColor;
        Integer valueOf2 = (str2 == null || str2.isEmpty()) ? null : Integer.valueOf((-16777216) | Color.parseColor(this.customSettings.navigationBarColor));
        String str3 = this.customSettings.navigationBarDividerColor;
        Integer valueOf3 = (str3 == null || str3.isEmpty()) ? null : Integer.valueOf(Color.parseColor(this.customSettings.navigationBarDividerColor));
        String str4 = this.customSettings.secondaryToolbarColor;
        if (str4 != null && !str4.isEmpty()) {
            num = Integer.valueOf(Color.parseColor(this.customSettings.secondaryToolbarColor));
        }
        c cVar = this.builder;
        a aVar = new a(valueOf, num, valueOf2, valueOf3);
        o.d dVar = cVar.f13179b;
        dVar.getClass();
        dVar.f12730e = aVar.a();
        List<String> list = this.customSettings.additionalTrustedOrigins;
        if (list != null && !list.isEmpty()) {
            this.builder.f13180c = this.customSettings.additionalTrustedOrigins;
        }
        ChromeCustomTabsSettings chromeCustomTabsSettings = this.customSettings;
        q.a aVar2 = chromeCustomTabsSettings.displayMode;
        if (aVar2 != null) {
            this.builder.f13181d = aVar2;
        }
        this.builder.f13182e = chromeCustomTabsSettings.screenOrientation.intValue();
    }

    private void prepareCustomTabsIntent(b bVar) {
        Intent intent = bVar.f13176a;
        String str = this.customSettings.packageName;
        if (str == null) {
            str = CustomTabsHelper.getPackageNameToUse(this);
        }
        intent.setPackage(str);
        if (this.customSettings.keepAliveEnabled.booleanValue()) {
            CustomTabsHelper.addKeepAliveExtra(this, intent);
        }
        if (this.customSettings.alwaysUseBrowserUI.booleanValue()) {
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity
    public void launchUrl(String str, Map<String, String> map, String str2, List<String> list) {
        if (this.customTabsSession == null) {
            return;
        }
        Uri parse = Uri.parse(str);
        mayLaunchUrl(str, list);
        this.builder = new c(parse);
        prepareCustomTabs();
        c cVar = this.builder;
        u uVar = this.customTabsSession;
        if (uVar == null) {
            cVar.getClass();
            throw new NullPointerException("CustomTabsSession is required for launching a TWA");
        }
        o.d dVar = cVar.f13179b;
        dVar.f12726a.setPackage(uVar.f12747d.getPackageName());
        IBinder asBinder = uVar.f12746c.asBinder();
        PendingIntent pendingIntent = uVar.f12748e;
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", asBinder);
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        dVar.f12726a.putExtras(bundle);
        Intent intent = cVar.f13179b.a().f12724a;
        intent.setData(cVar.f13178a);
        intent.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
        if (cVar.f13180c != null) {
            intent.putExtra("android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS", new ArrayList(cVar.f13180c));
        }
        List emptyList = Collections.emptyList();
        intent.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", cVar.f13181d.a());
        intent.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", cVar.f13182e);
        b bVar = new b(intent, emptyList);
        prepareCustomTabsIntent(bVar);
        CustomTabActivityHelper.openTrustedWebActivity(this, bVar, parse, map, str2 != null ? Uri.parse(str2) : null, 100);
    }
}
