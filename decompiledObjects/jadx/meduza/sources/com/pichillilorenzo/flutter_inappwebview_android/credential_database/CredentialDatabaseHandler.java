package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

import android.content.Context;
import android.webkit.WebViewDatabase;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class CredentialDatabaseHandler extends ChannelDelegateImpl {
    public static final String LOG_TAG = "CredentialDatabaseHandler";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_credential_database";
    public static CredentialDatabase credentialDatabase;
    public InAppWebViewFlutterPlugin plugin;

    public CredentialDatabaseHandler(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static void init(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        if (credentialDatabase == null) {
            credentialDatabase = CredentialDatabase.getInstance(inAppWebViewFlutterPlugin.applicationContext);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.plugin = null;
        credentialDatabase = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.util.ArrayList] */
    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Context context;
        Object obj;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            init(inAppWebViewFlutterPlugin);
        }
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "clearAllAuthCredentials":
                CredentialDatabase credentialDatabase2 = credentialDatabase;
                if (credentialDatabase2 != null) {
                    credentialDatabase2.clearAllAuthCredentials();
                    InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                    if (inAppWebViewFlutterPlugin2 != null && (context = inAppWebViewFlutterPlugin2.applicationContext) != null) {
                        WebViewDatabase.getInstance(context).clearHttpAuthUsernamePassword();
                    }
                    obj = Boolean.TRUE;
                    result.success(obj);
                    break;
                }
                obj = Boolean.FALSE;
                result.success(obj);
                break;
            case "getHttpAuthCredentials":
                ArrayList arrayList = new ArrayList();
                if (credentialDatabase != null) {
                    Iterator<URLCredential> it = credentialDatabase.getHttpAuthCredentials((String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT)).iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().toMap());
                    }
                }
                result.success(arrayList);
                break;
            case "removeHttpAuthCredential":
                if (credentialDatabase != null) {
                    credentialDatabase.removeHttpAuthCredential((String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), (String) methodCall.argument(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) methodCall.argument("password"));
                    obj = Boolean.TRUE;
                    result.success(obj);
                    break;
                }
                obj = Boolean.FALSE;
                result.success(obj);
            case "setHttpAuthCredential":
                if (credentialDatabase != null) {
                    credentialDatabase.setHttpAuthCredential((String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), (String) methodCall.argument(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) methodCall.argument("password"));
                    obj = Boolean.TRUE;
                    result.success(obj);
                    break;
                }
                obj = Boolean.FALSE;
                result.success(obj);
            case "removeHttpAuthCredentials":
                if (credentialDatabase != null) {
                    credentialDatabase.removeHttpAuthCredentials((String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PROTOCOL), (String) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) methodCall.argument(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT));
                    obj = Boolean.TRUE;
                    result.success(obj);
                    break;
                }
                obj = Boolean.FALSE;
                result.success(obj);
            case "getAllAuthCredentials":
                obj = new ArrayList();
                CredentialDatabase credentialDatabase3 = credentialDatabase;
                if (credentialDatabase3 != null) {
                    for (URLProtectionSpace uRLProtectionSpace : credentialDatabase3.protectionSpaceDao.getAll()) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<URLCredential> it2 = credentialDatabase.credentialDao.getAllByProtectionSpaceId(uRLProtectionSpace.getId()).iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(it2.next().toMap());
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("protectionSpace", uRLProtectionSpace.toMap());
                        hashMap.put("credentials", arrayList2);
                        obj.add(hashMap);
                    }
                }
                result.success(obj);
                break;
            default:
                result.notImplemented();
                break;
        }
    }
}
