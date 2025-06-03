package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import defpackage.f;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public class CustomTabsActionButton {
    private String description;
    private byte[] icon;
    private int id;
    private boolean shouldTint;

    public CustomTabsActionButton(int i10, byte[] bArr, String str, boolean z10) {
        this.id = i10;
        this.icon = bArr;
        this.description = str;
        this.shouldTint = z10;
    }

    public static CustomTabsActionButton fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new CustomTabsActionButton(((Integer) map.get("id")).intValue(), (byte[]) map.get("icon"), (String) map.get("description"), ((Boolean) map.get("shouldTint")).booleanValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomTabsActionButton customTabsActionButton = (CustomTabsActionButton) obj;
        if (this.id == customTabsActionButton.id && this.shouldTint == customTabsActionButton.shouldTint && Arrays.equals(this.icon, customTabsActionButton.icon)) {
            return this.description.equals(customTabsActionButton.description);
        }
        return false;
    }

    public String getDescription() {
        return this.description;
    }

    public byte[] getIcon() {
        return this.icon;
    }

    public int getId() {
        return this.id;
    }

    public int hashCode() {
        return j.e(this.description, (Arrays.hashCode(this.icon) + (this.id * 31)) * 31, 31) + (this.shouldTint ? 1 : 0);
    }

    public boolean isShouldTint() {
        return this.shouldTint;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setIcon(byte[] bArr) {
        this.icon = bArr;
    }

    public void setId(int i10) {
        this.id = i10;
    }

    public void setShouldTint(boolean z10) {
        this.shouldTint = z10;
    }

    public String toString() {
        StringBuilder l10 = f.l("CustomTabsActionButton{id=");
        l10.append(this.id);
        l10.append(", icon=");
        l10.append(Arrays.toString(this.icon));
        l10.append(", description='");
        j.s(l10, this.description, '\'', ", shouldTint=");
        l10.append(this.shouldTint);
        l10.append('}');
        return l10.toString();
    }
}
