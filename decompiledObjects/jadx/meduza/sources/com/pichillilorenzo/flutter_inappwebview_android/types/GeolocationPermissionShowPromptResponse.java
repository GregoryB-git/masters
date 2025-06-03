package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import defpackage.f;
import java.util.Map;

/* loaded from: classes.dex */
public class GeolocationPermissionShowPromptResponse {
    public boolean allow;
    private String origin;
    public boolean retain;

    public GeolocationPermissionShowPromptResponse(String str, boolean z10, boolean z11) {
        this.origin = str;
        this.allow = z10;
        this.retain = z11;
    }

    public static GeolocationPermissionShowPromptResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new GeolocationPermissionShowPromptResponse((String) map.get("origin"), ((Boolean) map.get("allow")).booleanValue(), ((Boolean) map.get("retain")).booleanValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeolocationPermissionShowPromptResponse geolocationPermissionShowPromptResponse = (GeolocationPermissionShowPromptResponse) obj;
        if (this.allow == geolocationPermissionShowPromptResponse.allow && this.retain == geolocationPermissionShowPromptResponse.retain) {
            return this.origin.equals(geolocationPermissionShowPromptResponse.origin);
        }
        return false;
    }

    public String getOrigin() {
        return this.origin;
    }

    public int hashCode() {
        return (((this.origin.hashCode() * 31) + (this.allow ? 1 : 0)) * 31) + (this.retain ? 1 : 0);
    }

    public boolean isAllow() {
        return this.allow;
    }

    public boolean isRetain() {
        return this.retain;
    }

    public void setAllow(boolean z10) {
        this.allow = z10;
    }

    public void setOrigin(String str) {
        this.origin = str;
    }

    public void setRetain(boolean z10) {
        this.retain = z10;
    }

    public String toString() {
        StringBuilder l10 = f.l("GeolocationPermissionShowPromptResponse{origin='");
        j.s(l10, this.origin, '\'', ", allow=");
        l10.append(this.allow);
        l10.append(", retain=");
        l10.append(this.retain);
        l10.append('}');
        return l10.toString();
    }
}
