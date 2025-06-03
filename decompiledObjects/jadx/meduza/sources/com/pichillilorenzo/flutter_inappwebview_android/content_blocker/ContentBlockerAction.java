package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

import defpackage.f;
import java.util.Map;

/* loaded from: classes.dex */
public class ContentBlockerAction {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private String selector;
    private ContentBlockerActionType type;

    public ContentBlockerAction(ContentBlockerActionType contentBlockerActionType, String str) {
        this.type = contentBlockerActionType;
        contentBlockerActionType.equals(ContentBlockerActionType.CSS_DISPLAY_NONE);
        this.selector = str;
    }

    public static ContentBlockerAction fromMap(Map<String, Object> map) {
        return new ContentBlockerAction(ContentBlockerActionType.fromValue((String) map.get("type")), (String) map.get("selector"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContentBlockerAction contentBlockerAction = (ContentBlockerAction) obj;
        if (this.type != contentBlockerAction.type) {
            return false;
        }
        String str = this.selector;
        String str2 = contentBlockerAction.selector;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public String getSelector() {
        return this.selector;
    }

    public ContentBlockerActionType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.selector;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public void setSelector(String str) {
        this.selector = str;
    }

    public void setType(ContentBlockerActionType contentBlockerActionType) {
        this.type = contentBlockerActionType;
    }

    public String toString() {
        StringBuilder l10 = f.l("ContentBlockerAction{type=");
        l10.append(this.type);
        l10.append(", selector='");
        l10.append(this.selector);
        l10.append('\'');
        l10.append('}');
        return l10.toString();
    }
}
