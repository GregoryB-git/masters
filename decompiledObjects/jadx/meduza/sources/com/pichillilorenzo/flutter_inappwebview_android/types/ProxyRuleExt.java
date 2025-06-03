package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import defpackage.f;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ProxyRuleExt {
    private String schemeFilter;
    private String url;

    public ProxyRuleExt(String str, String str2) {
        this.schemeFilter = str;
        this.url = str2;
    }

    public static ProxyRuleExt fromMap(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        return new ProxyRuleExt(map.get("schemeFilter"), map.get(WebViewActivity.URL_EXTRA));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProxyRuleExt proxyRuleExt = (ProxyRuleExt) obj;
        String str = this.schemeFilter;
        if (str == null ? proxyRuleExt.schemeFilter == null : str.equals(proxyRuleExt.schemeFilter)) {
            return this.url.equals(proxyRuleExt.url);
        }
        return false;
    }

    public String getSchemeFilter() {
        return this.schemeFilter;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.schemeFilter;
        return this.url.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    public void setSchemeFilter(String str) {
        this.schemeFilter = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public Map<String, String> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.URL_EXTRA, this.url);
        hashMap.put("schemeFilter", this.schemeFilter);
        return hashMap;
    }

    public String toString() {
        StringBuilder l10 = f.l("ProxyRuleExt{schemeFilter='");
        j.s(l10, this.schemeFilter, '\'', ", url='");
        l10.append(this.url);
        l10.append('\'');
        l10.append('}');
        return l10.toString();
    }
}
