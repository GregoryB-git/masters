package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.f;
import java.util.Map;

/* loaded from: classes.dex */
public class CustomTabsMenuItem {
    private int id;
    private String label;

    public CustomTabsMenuItem(int i10, String str) {
        this.id = i10;
        this.label = str;
    }

    public static CustomTabsMenuItem fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new CustomTabsMenuItem(((Integer) map.get("id")).intValue(), (String) map.get("label"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomTabsMenuItem customTabsMenuItem = (CustomTabsMenuItem) obj;
        if (this.id != customTabsMenuItem.id) {
            return false;
        }
        return this.label.equals(customTabsMenuItem.label);
    }

    public int getId() {
        return this.id;
    }

    public String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return this.label.hashCode() + (this.id * 31);
    }

    public void setId(int i10) {
        this.id = i10;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public String toString() {
        StringBuilder l10 = f.l("CustomTabsMenuItem{id=");
        l10.append(this.id);
        l10.append(", label='");
        l10.append(this.label);
        l10.append('\'');
        l10.append('}');
        return l10.toString();
    }
}
