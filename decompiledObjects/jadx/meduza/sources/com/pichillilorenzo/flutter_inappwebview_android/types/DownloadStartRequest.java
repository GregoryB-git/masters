package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import defpackage.f;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class DownloadStartRequest {
    private String contentDisposition;
    private long contentLength;
    private String mimeType;
    private String suggestedFilename;
    private String textEncodingName;
    private String url;
    private String userAgent;

    public DownloadStartRequest(String str, String str2, String str3, String str4, long j10, String str5, String str6) {
        this.url = str;
        this.userAgent = str2;
        this.contentDisposition = str3;
        this.mimeType = str4;
        this.contentLength = j10;
        this.suggestedFilename = str5;
        this.textEncodingName = str6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DownloadStartRequest downloadStartRequest = (DownloadStartRequest) obj;
        if (this.contentLength != downloadStartRequest.contentLength || !this.url.equals(downloadStartRequest.url) || !this.userAgent.equals(downloadStartRequest.userAgent) || !this.contentDisposition.equals(downloadStartRequest.contentDisposition) || !this.mimeType.equals(downloadStartRequest.mimeType)) {
            return false;
        }
        String str = this.suggestedFilename;
        if (str == null ? downloadStartRequest.suggestedFilename != null : !str.equals(downloadStartRequest.suggestedFilename)) {
            return false;
        }
        String str2 = this.textEncodingName;
        String str3 = downloadStartRequest.textEncodingName;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public String getContentDisposition() {
        return this.contentDisposition;
    }

    public long getContentLength() {
        return this.contentLength;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public String getSuggestedFilename() {
        return this.suggestedFilename;
    }

    public String getTextEncodingName() {
        return this.textEncodingName;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        int e10 = j.e(this.mimeType, j.e(this.contentDisposition, j.e(this.userAgent, this.url.hashCode() * 31, 31), 31), 31);
        long j10 = this.contentLength;
        int i10 = (e10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str = this.suggestedFilename;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.textEncodingName;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public void setContentDisposition(String str) {
        this.contentDisposition = str;
    }

    public void setContentLength(long j10) {
        this.contentLength = j10;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setSuggestedFilename(String str) {
        this.suggestedFilename = str;
    }

    public void setTextEncodingName(String str) {
        this.textEncodingName = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewActivity.URL_EXTRA, this.url);
        hashMap.put("userAgent", this.userAgent);
        hashMap.put("contentDisposition", this.contentDisposition);
        hashMap.put("mimeType", this.mimeType);
        hashMap.put("contentLength", Long.valueOf(this.contentLength));
        hashMap.put("suggestedFilename", this.suggestedFilename);
        hashMap.put("textEncodingName", this.textEncodingName);
        return hashMap;
    }

    public String toString() {
        StringBuilder l10 = f.l("DownloadStartRequest{url='");
        j.s(l10, this.url, '\'', ", userAgent='");
        j.s(l10, this.userAgent, '\'', ", contentDisposition='");
        j.s(l10, this.contentDisposition, '\'', ", mimeType='");
        j.s(l10, this.mimeType, '\'', ", contentLength=");
        l10.append(this.contentLength);
        l10.append(", suggestedFilename='");
        j.s(l10, this.suggestedFilename, '\'', ", textEncodingName='");
        l10.append(this.textEncodingName);
        l10.append('\'');
        l10.append('}');
        return l10.toString();
    }
}
