package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import defpackage.f;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class URLRequest {
    private byte[] body;
    private Map<String, String> headers;
    private String method;
    private String url;

    public URLRequest(String str, String str2, byte[] bArr, Map<String, String> map) {
        this.url = str;
        this.method = str2;
        this.body = bArr;
        this.headers = map;
    }

    public static URLRequest fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        String str = (String) map.get(WebViewActivity.URL_EXTRA);
        if (str == null) {
            str = "about:blank";
        }
        return new URLRequest(str, (String) map.get(Constants.METHOD), (byte[]) map.get("body"), (Map) map.get("headers"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        URLRequest uRLRequest = (URLRequest) obj;
        String str = this.url;
        if (str == null ? uRLRequest.url != null : !str.equals(uRLRequest.url)) {
            return false;
        }
        String str2 = this.method;
        if (str2 == null ? uRLRequest.method != null : !str2.equals(uRLRequest.method)) {
            return false;
        }
        if (!Arrays.equals(this.body, uRLRequest.body)) {
            return false;
        }
        Map<String, String> map = this.headers;
        Map<String, String> map2 = uRLRequest.headers;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public byte[] getBody() {
        return this.body;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String getMethod() {
        return this.method;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.method;
        int hashCode2 = (Arrays.hashCode(this.body) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        Map<String, String> map = this.headers;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public void setBody(byte[] bArr) {
        this.body = bArr;
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.URL_EXTRA, this.url);
        hashMap.put(Constants.METHOD, this.method);
        hashMap.put("headers", this.headers);
        hashMap.put("body", this.body);
        hashMap.put("allowsCellularAccess", null);
        hashMap.put("allowsConstrainedNetworkAccess", null);
        hashMap.put("allowsExpensiveNetworkAccess", null);
        hashMap.put("cachePolicy", null);
        hashMap.put("httpShouldHandleCookies", null);
        hashMap.put("httpShouldUsePipelining", null);
        hashMap.put("networkServiceType", null);
        hashMap.put("timeoutInterval", null);
        hashMap.put("mainDocumentURL", null);
        hashMap.put("assumesHTTP3Capable", null);
        hashMap.put("attribution", null);
        return hashMap;
    }

    public String toString() {
        StringBuilder l10 = f.l("URLRequest{url='");
        j.s(l10, this.url, '\'', ", method='");
        j.s(l10, this.method, '\'', ", body=");
        l10.append(Arrays.toString(this.body));
        l10.append(", headers=");
        l10.append(this.headers);
        l10.append('}');
        return l10.toString();
    }
}
