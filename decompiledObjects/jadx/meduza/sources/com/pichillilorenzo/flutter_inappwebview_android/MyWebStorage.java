package com.pichillilorenzo.flutter_inappwebview_android;

import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class MyWebStorage extends ChannelDelegateImpl {
    public static final String LOG_TAG = "MyWebStorage";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_webstoragemanager";
    public static WebStorage webStorageManager;
    public InAppWebViewFlutterPlugin plugin;

    public MyWebStorage(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static void init() {
        if (webStorageManager == null) {
            webStorageManager = WebStorage.getInstance();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    public void getOrigins(final MethodChannel.Result result) {
        WebStorage webStorage = webStorageManager;
        if (webStorage == null) {
            result.success(new ArrayList());
        } else {
            webStorage.getOrigins(new ValueCallback<Map>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyWebStorage.1
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Map map) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = map.keySet().iterator();
                    while (it.hasNext()) {
                        WebStorage.Origin origin = (WebStorage.Origin) map.get(it.next());
                        HashMap hashMap = new HashMap();
                        hashMap.put("origin", origin.getOrigin());
                        hashMap.put("quota", Long.valueOf(origin.getQuota()));
                        hashMap.put("usage", Long.valueOf(origin.getUsage()));
                        arrayList.add(hashMap);
                    }
                    result.success(arrayList);
                }
            });
        }
    }

    public void getQuotaForOrigin(String str, final MethodChannel.Result result) {
        WebStorage webStorage = webStorageManager;
        if (webStorage == null) {
            result.success(0);
        } else {
            webStorage.getQuotaForOrigin(str, new ValueCallback<Long>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyWebStorage.2
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Long l10) {
                    result.success(l10);
                }
            });
        }
    }

    public void getUsageForOrigin(String str, final MethodChannel.Result result) {
        WebStorage webStorage = webStorageManager;
        if (webStorage == null) {
            result.success(0);
        } else {
            webStorage.getUsageForOrigin(str, new ValueCallback<Long>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.MyWebStorage.3
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Long l10) {
                    result.success(l10);
                }
            });
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Boolean bool;
        init();
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "getQuotaForOrigin":
                getQuotaForOrigin((String) methodCall.argument("origin"), result);
                break;
            case "deleteAllData":
                WebStorage webStorage = webStorageManager;
                if (webStorage != null) {
                    webStorage.deleteAllData();
                    bool = Boolean.TRUE;
                    result.success(bool);
                    break;
                }
                bool = Boolean.FALSE;
                result.success(bool);
            case "deleteOrigin":
                if (webStorageManager != null) {
                    webStorageManager.deleteOrigin((String) methodCall.argument("origin"));
                    bool = Boolean.TRUE;
                    result.success(bool);
                    break;
                }
                bool = Boolean.FALSE;
                result.success(bool);
            case "getOrigins":
                getOrigins(result);
                break;
            case "getUsageForOrigin":
                getUsageForOrigin((String) methodCall.argument("origin"), result);
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
