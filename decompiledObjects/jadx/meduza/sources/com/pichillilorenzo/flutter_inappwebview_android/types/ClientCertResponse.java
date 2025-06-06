package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import defpackage.f;
import java.util.Map;

/* loaded from: classes.dex */
public class ClientCertResponse {
    private Integer action;
    private String certificatePassword;
    private String certificatePath;
    private String keyStoreType;

    public ClientCertResponse(String str, String str2, String str3, Integer num) {
        this.certificatePath = str;
        this.certificatePassword = str2;
        this.keyStoreType = str3;
        this.action = num;
    }

    public static ClientCertResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new ClientCertResponse((String) map.get("certificatePath"), (String) map.get("certificatePassword"), (String) map.get("keyStoreType"), (Integer) map.get("action"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClientCertResponse clientCertResponse = (ClientCertResponse) obj;
        if (!this.certificatePath.equals(clientCertResponse.certificatePath)) {
            return false;
        }
        String str = this.certificatePassword;
        if (str == null ? clientCertResponse.certificatePassword != null : !str.equals(clientCertResponse.certificatePassword)) {
            return false;
        }
        if (!this.keyStoreType.equals(clientCertResponse.keyStoreType)) {
            return false;
        }
        Integer num = this.action;
        Integer num2 = clientCertResponse.action;
        return num != null ? num.equals(num2) : num2 == null;
    }

    public Integer getAction() {
        return this.action;
    }

    public String getCertificatePassword() {
        return this.certificatePassword;
    }

    public String getCertificatePath() {
        return this.certificatePath;
    }

    public String getKeyStoreType() {
        return this.keyStoreType;
    }

    public int hashCode() {
        int hashCode = this.certificatePath.hashCode() * 31;
        String str = this.certificatePassword;
        int e10 = j.e(this.keyStoreType, (hashCode + (str != null ? str.hashCode() : 0)) * 31, 31);
        Integer num = this.action;
        return e10 + (num != null ? num.hashCode() : 0);
    }

    public void setAction(Integer num) {
        this.action = num;
    }

    public void setCertificatePassword(String str) {
        this.certificatePassword = str;
    }

    public void setCertificatePath(String str) {
        this.certificatePath = str;
    }

    public void setKeyStoreType(String str) {
        this.keyStoreType = str;
    }

    public String toString() {
        StringBuilder l10 = f.l("ClientCertResponse{certificatePath='");
        j.s(l10, this.certificatePath, '\'', ", certificatePassword='");
        j.s(l10, this.certificatePassword, '\'', ", keyStoreType='");
        j.s(l10, this.keyStoreType, '\'', ", action=");
        l10.append(this.action);
        l10.append('}');
        return l10.toString();
    }
}
