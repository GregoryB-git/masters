package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import defpackage.f;
import java.util.Map;

/* loaded from: classes.dex */
public class HttpAuthResponse {
    private Integer action;
    private String password;
    public boolean permanentPersistence;
    private String username;

    public HttpAuthResponse(String str, String str2, boolean z10, Integer num) {
        this.username = str;
        this.password = str2;
        this.permanentPersistence = z10;
        this.action = num;
    }

    public static HttpAuthResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new HttpAuthResponse((String) map.get(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME), (String) map.get("password"), ((Boolean) map.get("permanentPersistence")).booleanValue(), (Integer) map.get("action"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpAuthResponse httpAuthResponse = (HttpAuthResponse) obj;
        if (this.permanentPersistence != httpAuthResponse.permanentPersistence || !this.username.equals(httpAuthResponse.username) || !this.password.equals(httpAuthResponse.password)) {
            return false;
        }
        Integer num = this.action;
        Integer num2 = httpAuthResponse.action;
        return num != null ? num.equals(num2) : num2 == null;
    }

    public Integer getAction() {
        return this.action;
    }

    public String getPassword() {
        return this.password;
    }

    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int e10 = (j.e(this.password, this.username.hashCode() * 31, 31) + (this.permanentPersistence ? 1 : 0)) * 31;
        Integer num = this.action;
        return e10 + (num != null ? num.hashCode() : 0);
    }

    public boolean isPermanentPersistence() {
        return this.permanentPersistence;
    }

    public void setAction(Integer num) {
        this.action = num;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setPermanentPersistence(boolean z10) {
        this.permanentPersistence = z10;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public String toString() {
        StringBuilder l10 = f.l("HttpAuthResponse{username='");
        j.s(l10, this.username, '\'', ", password='");
        j.s(l10, this.password, '\'', ", permanentPersistence=");
        l10.append(this.permanentPersistence);
        l10.append(", action=");
        l10.append(this.action);
        l10.append('}');
        return l10.toString();
    }
}
