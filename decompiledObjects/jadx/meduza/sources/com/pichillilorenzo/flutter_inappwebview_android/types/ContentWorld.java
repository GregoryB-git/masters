package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.f;
import java.util.Map;

/* loaded from: classes.dex */
public class ContentWorld {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private String name;
    public static final ContentWorld PAGE = new ContentWorld("page");
    public static final ContentWorld DEFAULT_CLIENT = new ContentWorld("defaultClient");

    private ContentWorld(String str) {
        this.name = str;
    }

    public static ContentWorld fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new ContentWorld((String) map.get("name"));
    }

    public static ContentWorld world(String str) {
        return new ContentWorld(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.name.equals(((ContentWorld) obj).name);
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        StringBuilder l10 = f.l("ContentWorld{name='");
        l10.append(this.name);
        l10.append('\'');
        l10.append('}');
        return l10.toString();
    }
}
