package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsSecondaryToolbar;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p.u;

/* loaded from: classes.dex */
public class ChromeCustomTabsChannelDelegate extends ChannelDelegateImpl {
    private ChromeCustomTabsActivity chromeCustomTabsActivity;

    public ChromeCustomTabsChannelDelegate(ChromeCustomTabsActivity chromeCustomTabsActivity, MethodChannel methodChannel) {
        super(methodChannel);
        this.chromeCustomTabsActivity = chromeCustomTabsActivity;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.chromeCustomTabsActivity = null;
    }

    public void onClosed() {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onClosed", new HashMap());
    }

    public void onCompletedInitialLoad() {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onCompletedInitialLoad", new HashMap());
    }

    public void onGreatestScrollPercentageIncreased(int i10) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scrollPercentage", Integer.valueOf(i10));
        channel.invokeMethod("onGreatestScrollPercentageIncreased", hashMap);
    }

    public void onItemActionPerform(int i10, String str, String str2) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", Integer.valueOf(i10));
        hashMap.put(WebViewActivity.URL_EXTRA, str);
        hashMap.put("title", str2);
        channel.invokeMethod("onItemActionPerform", hashMap);
    }

    public void onMessageChannelReady() {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onMessageChannelReady", new HashMap());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        char c10;
        Object valueOf;
        u uVar;
        String str;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        Activity activity;
        int i10;
        String str2 = methodCall.method;
        str2.getClass();
        boolean z10 = false;
        switch (str2.hashCode()) {
            case -1526944655:
                if (str2.equals("isEngagementSignalsApiAvailable")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -675108676:
                if (str2.equals("launchUrl")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -334843312:
                if (str2.equals("updateSecondaryToolbar")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 50870385:
                if (str2.equals("updateActionButton")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 94756344:
                if (str2.equals("close")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 1256059502:
                if (str2.equals("validateRelationship")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1392239787:
                if (str2.equals("requestPostMessageChannel")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1490029383:
                if (str2.equals("postMessage")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 2000053463:
                if (str2.equals("mayLaunchUrl")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        Bundle bundle = null;
        switch (c10) {
            case 0:
                ChromeCustomTabsActivity chromeCustomTabsActivity = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity != null && (uVar = chromeCustomTabsActivity.customTabsSession) != null) {
                    try {
                        try {
                            result.success(Boolean.valueOf(uVar.f12745b.U2(uVar.f12746c, uVar.a(new Bundle()))));
                            return;
                        } catch (SecurityException e10) {
                            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
                        }
                    } catch (Throwable unused) {
                    }
                }
                valueOf = Boolean.FALSE;
                result.success(valueOf);
                return;
            case 1:
                if (this.chromeCustomTabsActivity != null && (str = (String) methodCall.argument(WebViewActivity.URL_EXTRA)) != null) {
                    this.chromeCustomTabsActivity.launchUrl(str, (Map) methodCall.argument("headers"), (String) methodCall.argument("referrer"), (List) methodCall.argument("otherLikelyURLs"));
                    valueOf = Boolean.TRUE;
                    result.success(valueOf);
                    return;
                }
                valueOf = Boolean.FALSE;
                result.success(valueOf);
                return;
            case 2:
                if (this.chromeCustomTabsActivity != null) {
                    this.chromeCustomTabsActivity.updateSecondaryToolbar(CustomTabsSecondaryToolbar.fromMap((Map) methodCall.argument("secondaryToolbar")));
                    valueOf = Boolean.TRUE;
                    result.success(valueOf);
                    return;
                }
                valueOf = Boolean.FALSE;
                result.success(valueOf);
                return;
            case 3:
                if (this.chromeCustomTabsActivity != null) {
                    this.chromeCustomTabsActivity.updateActionButton((byte[]) methodCall.argument("icon"), (String) methodCall.argument("description"));
                    valueOf = Boolean.TRUE;
                    result.success(valueOf);
                    return;
                }
                valueOf = Boolean.FALSE;
                result.success(valueOf);
                return;
            case 4:
                ChromeCustomTabsActivity chromeCustomTabsActivity2 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity2 != null) {
                    chromeCustomTabsActivity2.onStop();
                    this.chromeCustomTabsActivity.onDestroy();
                    this.chromeCustomTabsActivity.close();
                    ChromeSafariBrowserManager chromeSafariBrowserManager = this.chromeCustomTabsActivity.manager;
                    if (chromeSafariBrowserManager != null && (inAppWebViewFlutterPlugin = chromeSafariBrowserManager.plugin) != null && (activity = inAppWebViewFlutterPlugin.activity) != null) {
                        Intent intent = new Intent(activity, activity.getClass());
                        intent.addFlags(67108864);
                        intent.addFlags(536870912);
                        activity.startActivity(intent);
                    }
                    this.chromeCustomTabsActivity.dispose();
                    valueOf = Boolean.TRUE;
                    result.success(valueOf);
                    return;
                }
                valueOf = Boolean.FALSE;
                result.success(valueOf);
                return;
            case 5:
                ChromeCustomTabsActivity chromeCustomTabsActivity3 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity3 != null && chromeCustomTabsActivity3.customTabsSession != null) {
                    Integer num = (Integer) methodCall.argument("relation");
                    String str3 = (String) methodCall.argument("origin");
                    u uVar2 = this.chromeCustomTabsActivity.customTabsSession;
                    int intValue = num.intValue();
                    Uri parse = Uri.parse(str3);
                    uVar2.getClass();
                    if (intValue >= 1 && intValue <= 2) {
                        z10 = uVar2.f12745b.p0(intValue, parse, uVar2.a(null), uVar2.f12746c);
                    }
                    valueOf = Boolean.valueOf(z10);
                    result.success(valueOf);
                    return;
                }
                valueOf = Boolean.FALSE;
                result.success(valueOf);
                return;
            case 6:
                ChromeCustomTabsActivity chromeCustomTabsActivity4 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity4 != null && chromeCustomTabsActivity4.customTabsSession != null) {
                    String str4 = (String) methodCall.argument("sourceOrigin");
                    String str5 = (String) methodCall.argument("targetOrigin");
                    u uVar3 = this.chromeCustomTabsActivity.customTabsSession;
                    Uri parse2 = Uri.parse(str4);
                    Uri parse3 = str5 != null ? Uri.parse(str5) : null;
                    Bundle bundle2 = new Bundle();
                    uVar3.getClass();
                    Bundle bundle3 = new Bundle();
                    if (parse3 != null) {
                        bundle3.putParcelable("target_origin", parse3);
                    }
                    PendingIntent pendingIntent = uVar3.f12748e;
                    if (pendingIntent != null && pendingIntent != null) {
                        bundle3.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                    }
                    if (!bundle3.isEmpty()) {
                        bundle = bundle3;
                    }
                    if (bundle != null) {
                        bundle2.putAll(bundle);
                        z10 = uVar3.f12745b.U1(uVar3.f12746c, parse2, bundle2);
                    } else {
                        z10 = uVar3.f12745b.s2(uVar3.f12746c, parse2);
                    }
                    valueOf = Boolean.valueOf(z10);
                    result.success(valueOf);
                    return;
                }
                valueOf = Boolean.FALSE;
                result.success(valueOf);
                return;
            case 7:
                ChromeCustomTabsActivity chromeCustomTabsActivity5 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity5 == null || chromeCustomTabsActivity5.customTabsSession == null) {
                    i10 = -3;
                } else {
                    String str6 = (String) methodCall.argument(Constants.MESSAGE);
                    u uVar4 = this.chromeCustomTabsActivity.customTabsSession;
                    Bundle a10 = uVar4.a(new Bundle());
                    synchronized (uVar4.f12744a) {
                        try {
                            i10 = uVar4.f12745b.H1(uVar4.f12746c, str6, a10);
                        } catch (RemoteException unused2) {
                            i10 = -2;
                        } finally {
                        }
                    }
                }
                valueOf = Integer.valueOf(i10);
                result.success(valueOf);
                return;
            case '\b':
                if (this.chromeCustomTabsActivity != null) {
                    valueOf = Boolean.valueOf(this.chromeCustomTabsActivity.mayLaunchUrl((String) methodCall.argument(WebViewActivity.URL_EXTRA), (List) methodCall.argument("otherLikelyURLs")));
                    result.success(valueOf);
                    return;
                }
                valueOf = Boolean.FALSE;
                result.success(valueOf);
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    public void onNavigationEvent(int i10) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("navigationEvent", Integer.valueOf(i10));
        channel.invokeMethod("onNavigationEvent", hashMap);
    }

    public void onOpened() {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onOpened", new HashMap());
    }

    public void onPostMessage(String str) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.MESSAGE, str);
        channel.invokeMethod("onPostMessage", hashMap);
    }

    public void onRelationshipValidationResult(int i10, Uri uri, boolean z10) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("relation", Integer.valueOf(i10));
        hashMap.put("requestedOrigin", uri.toString());
        hashMap.put("result", Boolean.valueOf(z10));
        channel.invokeMethod("onRelationshipValidationResult", hashMap);
    }

    public void onSecondaryItemActionPerform(String str, String str2) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("name", str);
        hashMap.put(WebViewActivity.URL_EXTRA, str2);
        channel.invokeMethod("onSecondaryItemActionPerform", hashMap);
    }

    public void onServiceConnected() {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        channel.invokeMethod("onServiceConnected", new HashMap());
    }

    public void onSessionEnded(boolean z10) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("didUserInteract", Boolean.valueOf(z10));
        channel.invokeMethod("onSessionEnded", hashMap);
    }

    public void onVerticalScrollEvent(boolean z10) {
        MethodChannel channel = getChannel();
        if (channel == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("isDirectionUp", Boolean.valueOf(z10));
        channel.invokeMethod("onVerticalScrollEvent", hashMap);
    }
}
