package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import defpackage.f;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public class CustomSchemeResponse {
    private String contentEncoding;
    private String contentType;
    private byte[] data;

    public CustomSchemeResponse(byte[] bArr, String str, String str2) {
        this.data = bArr;
        this.contentType = str;
        this.contentEncoding = str2;
    }

    public static CustomSchemeResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new CustomSchemeResponse((byte[]) map.get("data"), (String) map.get("contentType"), (String) map.get("contentEncoding"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomSchemeResponse customSchemeResponse = (CustomSchemeResponse) obj;
        if (Arrays.equals(this.data, customSchemeResponse.data) && this.contentType.equals(customSchemeResponse.contentType)) {
            return this.contentEncoding.equals(customSchemeResponse.contentEncoding);
        }
        return false;
    }

    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public String getContentType() {
        return this.contentType;
    }

    public byte[] getData() {
        return this.data;
    }

    public int hashCode() {
        return this.contentEncoding.hashCode() + j.e(this.contentType, Arrays.hashCode(this.data) * 31, 31);
    }

    public void setContentEncoding(String str) {
        this.contentEncoding = str;
    }

    public void setContentType(String str) {
        this.contentType = str;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public String toString() {
        StringBuilder l10 = f.l("CustomSchemeResponse{data=");
        l10.append(Arrays.toString(this.data));
        l10.append(", contentType='");
        j.s(l10, this.contentType, '\'', ", contentEncoding='");
        l10.append(this.contentEncoding);
        l10.append('\'');
        l10.append('}');
        return l10.toString();
    }
}
