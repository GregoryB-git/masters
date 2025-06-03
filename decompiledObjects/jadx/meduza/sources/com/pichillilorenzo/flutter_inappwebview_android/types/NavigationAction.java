package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class NavigationAction {
    public boolean hasGesture;
    public boolean isForMainFrame;
    public boolean isRedirect;
    public URLRequest request;

    public NavigationAction(URLRequest uRLRequest, boolean z10, boolean z11, boolean z12) {
        this.request = uRLRequest;
        this.isForMainFrame = z10;
        this.hasGesture = z11;
        this.isRedirect = z12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NavigationAction navigationAction = (NavigationAction) obj;
        if (this.isForMainFrame == navigationAction.isForMainFrame && this.hasGesture == navigationAction.hasGesture && this.isRedirect == navigationAction.isRedirect) {
            return this.request.equals(navigationAction.request);
        }
        return false;
    }

    public URLRequest getRequest() {
        return this.request;
    }

    public int hashCode() {
        return (((((this.request.hashCode() * 31) + (this.isForMainFrame ? 1 : 0)) * 31) + (this.hasGesture ? 1 : 0)) * 31) + (this.isRedirect ? 1 : 0);
    }

    public boolean isForMainFrame() {
        return this.isForMainFrame;
    }

    public boolean isHasGesture() {
        return this.hasGesture;
    }

    public boolean isRedirect() {
        return this.isRedirect;
    }

    public void setForMainFrame(boolean z10) {
        this.isForMainFrame = z10;
    }

    public void setHasGesture(boolean z10) {
        this.hasGesture = z10;
    }

    public void setRedirect(boolean z10) {
        this.isRedirect = z10;
    }

    public void setRequest(URLRequest uRLRequest) {
        this.request = uRLRequest;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("request", this.request.toMap());
        hashMap.put("isForMainFrame", Boolean.valueOf(this.isForMainFrame));
        hashMap.put("hasGesture", Boolean.valueOf(this.hasGesture));
        hashMap.put("isRedirect", Boolean.valueOf(this.isRedirect));
        hashMap.put("navigationType", null);
        hashMap.put("sourceFrame", null);
        hashMap.put("targetFrame", null);
        hashMap.put("shouldPerformDownload", null);
        return hashMap;
    }

    public String toString() {
        StringBuilder l10 = f.l("NavigationAction{request=");
        l10.append(this.request);
        l10.append(", isForMainFrame=");
        l10.append(this.isForMainFrame);
        l10.append(", hasGesture=");
        l10.append(this.hasGesture);
        l10.append(", isRedirect=");
        l10.append(this.isRedirect);
        l10.append('}');
        return l10.toString();
    }
}
