package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.content.Intent;
import com.pichillilorenzo.flutter_inappwebview_android.ISettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.AndroidResource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import q.a;

/* loaded from: classes.dex */
public class ChromeCustomTabsSettings implements ISettings<ChromeCustomTabsActivity> {
    public static final String LOG_TAG = "ChromeCustomTabsSettings";

    @Deprecated
    public Boolean addDefaultShareMenuItem;
    public List<String> additionalTrustedOrigins;
    public Boolean alwaysUseBrowserUI;
    public a displayMode;
    public Boolean enableUrlBarHiding;
    public List<AndroidResource> exitAnimations;
    public Boolean instantAppsEnabled;
    public Boolean isSingleInstance;
    public Boolean isTrustedWebActivity;
    public Boolean keepAliveEnabled;
    public String navigationBarColor;
    public String navigationBarDividerColor;
    public Boolean noHistory;
    public String packageName;
    public Integer screenOrientation;
    public String secondaryToolbarColor;
    public Integer shareState = 0;
    public Boolean showTitle = Boolean.TRUE;
    public List<AndroidResource> startAnimations;
    public String toolbarBackgroundColor;

    public ChromeCustomTabsSettings() {
        Boolean bool = Boolean.FALSE;
        this.enableUrlBarHiding = bool;
        this.instantAppsEnabled = bool;
        this.keepAliveEnabled = bool;
        this.isSingleInstance = bool;
        this.noHistory = bool;
        this.isTrustedWebActivity = bool;
        this.additionalTrustedOrigins = new ArrayList();
        this.displayMode = null;
        this.screenOrientation = 0;
        this.startAnimations = new ArrayList();
        this.exitAnimations = new ArrayList();
        this.alwaysUseBrowserUI = bool;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public Map<String, Object> getRealSettings(ChromeCustomTabsActivity chromeCustomTabsActivity) {
        Intent intent;
        Map<String, Object> map = toMap();
        if (chromeCustomTabsActivity != null && (intent = chromeCustomTabsActivity.getIntent()) != null) {
            map.put("packageName", intent.getPackage());
            map.put("keepAliveEnabled", Boolean.valueOf(intent.hasExtra(CustomTabsHelper.EXTRA_CUSTOM_TABS_KEEP_ALIVE)));
        }
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public /* bridge */ /* synthetic */ ISettings<ChromeCustomTabsActivity> parse(Map map) {
        return parse2((Map<String, Object>) map);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    /* renamed from: parse, reason: avoid collision after fix types in other method */
    public ISettings<ChromeCustomTabsActivity> parse2(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                key.getClass();
                switch (key) {
                    case "addDefaultShareMenuItem":
                        this.addDefaultShareMenuItem = (Boolean) value;
                        break;
                    case "startAnimations":
                        for (Map map2 : (List) value) {
                            if (AndroidResource.fromMap(map2) != null) {
                                this.startAnimations.add(AndroidResource.fromMap(map2));
                            }
                        }
                        break;
                    case "showTitle":
                        this.showTitle = (Boolean) value;
                        break;
                    case "shareState":
                        this.shareState = (Integer) value;
                        break;
                    case "isSingleInstance":
                        this.isSingleInstance = (Boolean) value;
                        break;
                    case "navigationBarColor":
                        this.navigationBarColor = (String) value;
                        break;
                    case "navigationBarDividerColor":
                        this.navigationBarDividerColor = (String) value;
                        break;
                    case "toolbarBackgroundColor":
                        this.toolbarBackgroundColor = (String) value;
                        break;
                    case "enableUrlBarHiding":
                        this.enableUrlBarHiding = (Boolean) value;
                        break;
                    case "screenOrientation":
                        this.screenOrientation = (Integer) value;
                        break;
                    case "exitAnimations":
                        for (Map map3 : (List) value) {
                            if (AndroidResource.fromMap(map3) != null) {
                                this.exitAnimations.add(AndroidResource.fromMap(map3));
                            }
                        }
                        break;
                    case "secondaryToolbarColor":
                        this.secondaryToolbarColor = (String) value;
                        break;
                    case "isTrustedWebActivity":
                        this.isTrustedWebActivity = (Boolean) value;
                        break;
                    case "instantAppsEnabled":
                        this.instantAppsEnabled = (Boolean) value;
                        break;
                    case "packageName":
                        this.packageName = (String) value;
                        break;
                    case "noHistory":
                        this.noHistory = (Boolean) value;
                        break;
                    case "additionalTrustedOrigins":
                        this.additionalTrustedOrigins = (List) value;
                        break;
                    case "alwaysUseBrowserUI":
                        this.alwaysUseBrowserUI = (Boolean) value;
                        break;
                    case "displayMode":
                        Map map4 = (Map) value;
                        String str = (String) map4.get("type");
                        if (str == null) {
                            break;
                        } else if (str.equals("IMMERSIVE_MODE")) {
                            this.displayMode = new a.b(((Integer) map4.get("displayCutoutMode")).intValue(), ((Boolean) map4.get("isSticky")).booleanValue());
                            break;
                        } else if (str.equals("DEFAULT_MODE")) {
                            this.displayMode = new a.C0198a();
                            break;
                        } else {
                            break;
                        }
                    case "keepAliveEnabled":
                        this.keepAliveEnabled = (Boolean) value;
                        break;
                }
            }
        }
        return this;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.ISettings
    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("addDefaultShareMenuItem", this.addDefaultShareMenuItem);
        hashMap.put("showTitle", this.showTitle);
        hashMap.put("toolbarBackgroundColor", this.toolbarBackgroundColor);
        hashMap.put("navigationBarColor", this.navigationBarColor);
        hashMap.put("navigationBarDividerColor", this.navigationBarDividerColor);
        hashMap.put("secondaryToolbarColor", this.secondaryToolbarColor);
        hashMap.put("enableUrlBarHiding", this.enableUrlBarHiding);
        hashMap.put("instantAppsEnabled", this.instantAppsEnabled);
        hashMap.put("packageName", this.packageName);
        hashMap.put("keepAliveEnabled", this.keepAliveEnabled);
        hashMap.put("isSingleInstance", this.isSingleInstance);
        hashMap.put("noHistory", this.noHistory);
        hashMap.put("isTrustedWebActivity", this.isTrustedWebActivity);
        hashMap.put("additionalTrustedOrigins", this.additionalTrustedOrigins);
        hashMap.put("screenOrientation", this.screenOrientation);
        hashMap.put("alwaysUseBrowserUI", this.alwaysUseBrowserUI);
        return hashMap;
    }
}
