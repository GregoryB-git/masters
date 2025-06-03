package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.widget.RemoteViews;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.CustomTabActivityHelper;
import com.pichillilorenzo.flutter_inappwebview_android.types.AndroidResource;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsActionButton;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsMenuItem;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsSecondaryToolbar;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import defpackage.f;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p.b;
import p.o;
import p.t;
import p.u;
import p.v;

/* loaded from: classes.dex */
public class ChromeCustomTabsActivity extends Activity implements Disposable {
    public static final int CHROME_CUSTOM_TAB_REQUEST_CODE = 100;
    public static final String LOG_TAG = "CustomTabsActivity";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_chromesafaribrowser_";
    public static final int NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE = 101;
    public CustomTabsActionButton actionButton;
    public o.d builder;
    public ChromeCustomTabsChannelDelegate channelDelegate;
    public u customTabsSession;
    public String id;
    public Map<String, String> initialHeaders;
    public List<String> initialOtherLikelyURLs;
    public String initialReferrer;
    public String initialUrl;
    public ChromeSafariBrowserManager manager;
    public CustomTabsSecondaryToolbar secondaryToolbar;
    public ChromeCustomTabsSettings customSettings = new ChromeCustomTabsSettings();
    public CustomTabActivityHelper customTabActivityHelper = new CustomTabActivityHelper();
    public boolean onOpened = false;
    public boolean onCompletedInitialLoad = false;
    public boolean isBindSuccess = false;
    public List<CustomTabsMenuItem> menuItems = new ArrayList();

    private PendingIntent createPendingIntent(int i10) {
        Intent intent = new Intent(this, (Class<?>) ActionBroadcastReceiver.class);
        Bundle bundle = new Bundle();
        bundle.putInt(ActionBroadcastReceiver.KEY_ACTION_ID, i10);
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_VIEW_ID, this.id);
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_MANAGER_ID, chromeSafariBrowserManager != null ? chromeSafariBrowserManager.id : null);
        intent.putExtras(bundle);
        return PendingIntent.getBroadcast(this, i10, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    private void prepareCustomTabs() {
        o.d dVar = this.builder;
        if (dVar == null) {
            return;
        }
        ChromeCustomTabsSettings chromeCustomTabsSettings = this.customSettings;
        Boolean bool = chromeCustomTabsSettings.addDefaultShareMenuItem;
        dVar.b(bool != null ? bool.booleanValue() ? 1 : 2 : chromeCustomTabsSettings.shareState.intValue());
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
        o.d dVar2 = this.builder;
        dVar2.getClass();
        Bundle bundle = new Bundle();
        if (valueOf != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", valueOf.intValue());
        }
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num.intValue());
        }
        if (valueOf2 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", valueOf2.intValue());
        }
        if (valueOf3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", valueOf3.intValue());
        }
        dVar2.f12730e = bundle;
        this.builder.f12726a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", this.customSettings.showTitle.booleanValue() ? 1 : 0);
        this.builder.f12726a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", this.customSettings.enableUrlBarHiding.booleanValue());
        this.builder.f12731g = this.customSettings.instantAppsEnabled.booleanValue();
        if (this.customSettings.startAnimations.size() == 2) {
            o.d dVar3 = this.builder;
            int identifier = this.customSettings.startAnimations.get(0).getIdentifier(this);
            int identifier2 = this.customSettings.startAnimations.get(1).getIdentifier(this);
            dVar3.getClass();
            dVar3.f12729d = ActivityOptions.makeCustomAnimation(this, identifier, identifier2);
        }
        if (this.customSettings.exitAnimations.size() == 2) {
            o.d dVar4 = this.builder;
            int identifier3 = this.customSettings.exitAnimations.get(0).getIdentifier(this);
            int identifier4 = this.customSettings.exitAnimations.get(1).getIdentifier(this);
            dVar4.getClass();
            dVar4.f12726a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(this, identifier3, identifier4).toBundle());
        }
        for (CustomTabsMenuItem customTabsMenuItem : this.menuItems) {
            o.d dVar5 = this.builder;
            String label = customTabsMenuItem.getLabel();
            PendingIntent createPendingIntent = createPendingIntent(customTabsMenuItem.getId());
            if (dVar5.f12728c == null) {
                dVar5.f12728c = new ArrayList<>();
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", label);
            bundle2.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", createPendingIntent);
            dVar5.f12728c.add(bundle2);
        }
        CustomTabsActionButton customTabsActionButton = this.actionButton;
        if (customTabsActionButton != null) {
            byte[] icon = customTabsActionButton.getIcon();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(icon, 0, icon.length, options);
            o.d dVar6 = this.builder;
            String description = this.actionButton.getDescription();
            PendingIntent createPendingIntent2 = createPendingIntent(this.actionButton.getId());
            boolean isShouldTint = this.actionButton.isShouldTint();
            dVar6.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt("android.support.customtabs.customaction.ID", 0);
            bundle3.putParcelable("android.support.customtabs.customaction.ICON", decodeByteArray);
            bundle3.putString("android.support.customtabs.customaction.DESCRIPTION", description);
            bundle3.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", createPendingIntent2);
            dVar6.f12726a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle3);
            dVar6.f12726a.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", isShouldTint);
        }
        CustomTabsSecondaryToolbar customTabsSecondaryToolbar = this.secondaryToolbar;
        if (customTabsSecondaryToolbar != null) {
            AndroidResource layout = customTabsSecondaryToolbar.getLayout();
            RemoteViews remoteViews = new RemoteViews(layout.getDefPackage(), layout.getIdentifier(this));
            int[] iArr = new int[this.secondaryToolbar.getClickableIDs().size()];
            int size = this.secondaryToolbar.getClickableIDs().size();
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = this.secondaryToolbar.getClickableIDs().get(i10).getIdentifier(this);
            }
            o.d dVar7 = this.builder;
            PendingIntent secondaryToolbarOnClickPendingIntent = getSecondaryToolbarOnClickPendingIntent();
            dVar7.f12726a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews);
            dVar7.f12726a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", iArr);
            dVar7.f12726a.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", secondaryToolbarOnClickPendingIntent);
        }
    }

    private void prepareCustomTabsIntent(o oVar) {
        String str = this.customSettings.packageName;
        if (str != null) {
            oVar.f12724a.setPackage(str);
        } else {
            oVar.f12724a.setPackage(CustomTabsHelper.getPackageNameToUse(this));
        }
        if (this.customSettings.keepAliveEnabled.booleanValue()) {
            CustomTabsHelper.addKeepAliveExtra(this, oVar.f12724a);
        }
        if (this.customSettings.alwaysUseBrowserUI.booleanValue()) {
            Intent intent = oVar.f12724a;
            if (intent == null) {
                intent = new Intent("android.intent.action.VIEW");
            }
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        }
    }

    public void close() {
        onStop();
        onDestroy();
        this.customTabsSession = null;
        finish();
        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = this.channelDelegate;
        if (chromeCustomTabsChannelDelegate != null) {
            chromeCustomTabsChannelDelegate.onClosed();
        }
    }

    public void customTabsConnected() {
        String str;
        u session = this.customTabActivityHelper.getSession();
        this.customTabsSession = session;
        if (session != null) {
            try {
                Bundle bundle = new Bundle();
                u uVar = this.customTabsSession;
                try {
                    if (uVar.f12745b.U2(uVar.f12746c, uVar.a(bundle))) {
                        u uVar2 = this.customTabsSession;
                        v vVar = new v() { // from class: com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity.3
                            @Override // p.v
                            public void onGreatestScrollPercentageIncreased(int i10, Bundle bundle2) {
                                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                                if (chromeCustomTabsChannelDelegate != null) {
                                    chromeCustomTabsChannelDelegate.onGreatestScrollPercentageIncreased(i10);
                                }
                            }

                            @Override // p.v
                            public void onSessionEnded(boolean z10, Bundle bundle2) {
                                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                                if (chromeCustomTabsChannelDelegate != null) {
                                    chromeCustomTabsChannelDelegate.onSessionEnded(z10);
                                }
                            }

                            @Override // p.v
                            public void onVerticalScrollEvent(boolean z10, Bundle bundle2) {
                                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                                if (chromeCustomTabsChannelDelegate != null) {
                                    chromeCustomTabsChannelDelegate.onVerticalScrollEvent(z10);
                                }
                            }
                        };
                        try {
                            uVar2.f12745b.d2(uVar2.f12746c, new t(vVar), uVar2.a(bundle));
                        } catch (SecurityException e10) {
                            throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e10);
                        }
                    }
                } catch (SecurityException e11) {
                    throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e11);
                }
            } catch (Throwable th) {
                Log.d(LOG_TAG, "Custom Tabs Engagement Signals API not supported", th);
            }
        }
        if (!this.isBindSuccess || (str = this.initialUrl) == null) {
            return;
        }
        launchUrl(str, this.initialHeaders, this.initialReferrer, this.initialOtherLikelyURLs);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        onStop();
        onDestroy();
        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = this.channelDelegate;
        if (chromeCustomTabsChannelDelegate != null) {
            chromeCustomTabsChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
        if (chromeSafariBrowserManager != null && chromeSafariBrowserManager.browsers.containsKey(this.id)) {
            this.manager.browsers.put(this.id, null);
        }
        this.manager = null;
    }

    public PendingIntent getSecondaryToolbarOnClickPendingIntent() {
        Intent intent = new Intent(this, (Class<?>) ActionBroadcastReceiver.class);
        Bundle bundle = new Bundle();
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_VIEW_ID, this.id);
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_MANAGER_ID, chromeSafariBrowserManager != null ? chromeSafariBrowserManager.id : null);
        intent.putExtras(bundle);
        return PendingIntent.getBroadcast(this, 0, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
    }

    public void launchUrl(String str, Map<String, String> map, String str2, List<String> list) {
        launchUrlWithSession(this.customTabsSession, str, map, str2, list);
    }

    public void launchUrlWithSession(u uVar, String str, Map<String, String> map, String str2, List<String> list) {
        mayLaunchUrl(str, list);
        this.builder = new o.d(uVar);
        prepareCustomTabs();
        o a10 = this.builder.a();
        prepareCustomTabsIntent(a10);
        CustomTabActivityHelper.openCustomTab(this, a10, Uri.parse(str), map, str2 != null ? Uri.parse(str2) : null, 100);
    }

    public boolean mayLaunchUrl(String str, List<String> list) {
        Uri parse = str != null ? Uri.parse(str) : null;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Bundle bundle = new Bundle();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                bundle.putString("android.support.customtabs.otherurls.URL", it.next());
            }
        }
        return this.customTabActivityHelper.mayLaunchUrl(parse, null, arrayList);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 100) {
            close();
            dispose();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        NoHistoryCustomTabsActivityCallbacks noHistoryCustomTabsActivityCallbacks;
        super.onCreate(bundle);
        setContentView(R.layout.chrome_custom_tabs_layout);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        this.id = extras.getString("id");
        ChromeSafariBrowserManager chromeSafariBrowserManager = ChromeSafariBrowserManager.shared.get(extras.getString("managerId"));
        this.manager = chromeSafariBrowserManager;
        if (chromeSafariBrowserManager == null || (inAppWebViewFlutterPlugin = chromeSafariBrowserManager.plugin) == null || inAppWebViewFlutterPlugin.messenger == null) {
            return;
        }
        chromeSafariBrowserManager.browsers.put(this.id, this);
        BinaryMessenger binaryMessenger = this.manager.plugin.messenger;
        StringBuilder l10 = f.l(METHOD_CHANNEL_NAME_PREFIX);
        l10.append(this.id);
        this.channelDelegate = new ChromeCustomTabsChannelDelegate(this, new MethodChannel(binaryMessenger, l10.toString()));
        this.initialUrl = extras.getString(WebViewActivity.URL_EXTRA);
        this.initialHeaders = (Map) extras.getSerializable("headers");
        this.initialReferrer = extras.getString("referrer");
        this.initialOtherLikelyURLs = extras.getStringArrayList("otherLikelyURLs");
        ChromeCustomTabsSettings chromeCustomTabsSettings = new ChromeCustomTabsSettings();
        this.customSettings = chromeCustomTabsSettings;
        chromeCustomTabsSettings.parse2((Map<String, Object>) extras.getSerializable("settings"));
        this.actionButton = CustomTabsActionButton.fromMap((Map) extras.getSerializable("actionButton"));
        this.secondaryToolbar = CustomTabsSecondaryToolbar.fromMap((Map) extras.getSerializable("secondaryToolbar"));
        Iterator it = ((List) extras.getSerializable("menuItemList")).iterator();
        while (it.hasNext()) {
            this.menuItems.add(CustomTabsMenuItem.fromMap((Map) it.next()));
        }
        if (this.customSettings.noHistory.booleanValue() && (noHistoryCustomTabsActivityCallbacks = this.manager.plugin.noHistoryCustomTabsActivityCallbacks) != null) {
            Map<String, String> map = noHistoryCustomTabsActivityCallbacks.noHistoryBrowserIDs;
            String str = this.id;
            map.put(str, str);
        }
        this.customTabActivityHelper.setConnectionCallback(new CustomTabActivityHelper.ConnectionCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity.1
            @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.CustomTabActivityHelper.ConnectionCallback
            public void onCustomTabsConnected() {
                ChromeCustomTabsActivity.this.customTabsConnected();
                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                if (chromeCustomTabsChannelDelegate != null) {
                    chromeCustomTabsChannelDelegate.onServiceConnected();
                }
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.CustomTabActivityHelper.ConnectionCallback
            public void onCustomTabsDisconnected() {
                this.close();
                ChromeCustomTabsActivity.this.dispose();
            }
        });
        this.customTabActivityHelper.setCustomTabsCallback(new b() { // from class: com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity.2
            @Override // p.b
            public void extraCallback(String str2, Bundle bundle2) {
            }

            @Override // p.b
            public void onMessageChannelReady(Bundle bundle2) {
                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                if (chromeCustomTabsChannelDelegate != null) {
                    chromeCustomTabsChannelDelegate.onMessageChannelReady();
                }
            }

            @Override // p.b
            public void onNavigationEvent(int i10, Bundle bundle2) {
                if (i10 == 5) {
                    ChromeCustomTabsActivity chromeCustomTabsActivity = ChromeCustomTabsActivity.this;
                    if (!chromeCustomTabsActivity.onOpened) {
                        chromeCustomTabsActivity.onOpened = true;
                        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = chromeCustomTabsActivity.channelDelegate;
                        if (chromeCustomTabsChannelDelegate != null) {
                            chromeCustomTabsChannelDelegate.onOpened();
                        }
                    }
                }
                if (i10 == 2) {
                    ChromeCustomTabsActivity chromeCustomTabsActivity2 = ChromeCustomTabsActivity.this;
                    if (!chromeCustomTabsActivity2.onCompletedInitialLoad) {
                        chromeCustomTabsActivity2.onCompletedInitialLoad = true;
                        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate2 = chromeCustomTabsActivity2.channelDelegate;
                        if (chromeCustomTabsChannelDelegate2 != null) {
                            chromeCustomTabsChannelDelegate2.onCompletedInitialLoad();
                        }
                    }
                }
                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate3 = ChromeCustomTabsActivity.this.channelDelegate;
                if (chromeCustomTabsChannelDelegate3 != null) {
                    chromeCustomTabsChannelDelegate3.onNavigationEvent(i10);
                }
            }

            @Override // p.b
            public void onPostMessage(String str2, Bundle bundle2) {
                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                if (chromeCustomTabsChannelDelegate != null) {
                    chromeCustomTabsChannelDelegate.onPostMessage(str2);
                }
            }

            @Override // p.b
            public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle2) {
                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                if (chromeCustomTabsChannelDelegate != null) {
                    chromeCustomTabsChannelDelegate.onRelationshipValidationResult(i10, uri, z10);
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onStart() {
        String str;
        super.onStart();
        boolean bindCustomTabsService = this.customTabActivityHelper.bindCustomTabsService(this);
        this.isBindSuccess = bindCustomTabsService;
        if (bindCustomTabsService || (str = this.initialUrl) == null) {
            return;
        }
        launchUrlWithSession(null, str, this.initialHeaders, this.initialReferrer, this.initialOtherLikelyURLs);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.customTabActivityHelper.unbindCustomTabsService(this);
        this.isBindSuccess = false;
    }

    public void updateActionButton(byte[] bArr, String str) {
        if (this.customTabsSession == null || this.actionButton == null) {
            return;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inMutable = true;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        u uVar = this.customTabsSession;
        uVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.customaction.ICON", decodeByteArray);
        bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
        PendingIntent pendingIntent = uVar.f12748e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        try {
            uVar.f12745b.i2(uVar.f12746c, bundle2);
        } catch (RemoteException unused) {
        }
        this.actionButton.setIcon(bArr);
        this.actionButton.setDescription(str);
    }

    public void updateSecondaryToolbar(CustomTabsSecondaryToolbar customTabsSecondaryToolbar) {
        if (this.customTabsSession == null) {
            return;
        }
        AndroidResource layout = customTabsSecondaryToolbar.getLayout();
        RemoteViews remoteViews = new RemoteViews(layout.getDefPackage(), layout.getIdentifier(this));
        int[] iArr = new int[customTabsSecondaryToolbar.getClickableIDs().size()];
        int size = customTabsSecondaryToolbar.getClickableIDs().size();
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = customTabsSecondaryToolbar.getClickableIDs().get(i10).getIdentifier(this);
        }
        u uVar = this.customTabsSession;
        PendingIntent secondaryToolbarOnClickPendingIntent = getSecondaryToolbarOnClickPendingIntent();
        uVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews);
        bundle.putIntArray("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", iArr);
        bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", secondaryToolbarOnClickPendingIntent);
        PendingIntent pendingIntent = uVar.f12748e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        try {
            uVar.f12745b.i2(uVar.f12746c, bundle);
        } catch (RemoteException unused) {
        }
        this.secondaryToolbar = customTabsSecondaryToolbar;
    }
}
