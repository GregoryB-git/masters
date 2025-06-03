package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.f;
import java.util.Map;

/* loaded from: classes.dex */
public class SafeBrowsingResponse {
    private Integer action;
    private boolean report;

    public SafeBrowsingResponse(boolean z10, Integer num) {
        this.report = z10;
        this.action = num;
    }

    public static SafeBrowsingResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new SafeBrowsingResponse(((Boolean) map.get("report")).booleanValue(), (Integer) map.get("action"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SafeBrowsingResponse safeBrowsingResponse = (SafeBrowsingResponse) obj;
        if (this.report != safeBrowsingResponse.report) {
            return false;
        }
        Integer num = this.action;
        Integer num2 = safeBrowsingResponse.action;
        return num != null ? num.equals(num2) : num2 == null;
    }

    public Integer getAction() {
        return this.action;
    }

    public int hashCode() {
        int i10 = (this.report ? 1 : 0) * 31;
        Integer num = this.action;
        return i10 + (num != null ? num.hashCode() : 0);
    }

    public boolean isReport() {
        return this.report;
    }

    public void setAction(Integer num) {
        this.action = num;
    }

    public void setReport(boolean z10) {
        this.report = z10;
    }

    public String toString() {
        StringBuilder l10 = f.l("SafeBrowsingResponse{report=");
        l10.append(this.report);
        l10.append(", action=");
        l10.append(this.action);
        l10.append('}');
        return l10.toString();
    }
}
