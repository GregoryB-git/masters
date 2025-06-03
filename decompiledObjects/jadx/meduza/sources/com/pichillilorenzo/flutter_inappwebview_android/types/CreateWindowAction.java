package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.f;
import java.util.Map;

/* loaded from: classes.dex */
public class CreateWindowAction extends NavigationAction {
    public boolean isDialog;
    public int windowId;

    public CreateWindowAction(URLRequest uRLRequest, boolean z10, boolean z11, boolean z12, int i10, boolean z13) {
        super(uRLRequest, z10, z11, z12);
        this.windowId = i10;
        this.isDialog = z13;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        CreateWindowAction createWindowAction = (CreateWindowAction) obj;
        return this.windowId == createWindowAction.windowId && this.isDialog == createWindowAction.isDialog;
    }

    public int getWindowId() {
        return this.windowId;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
    public int hashCode() {
        return (((super.hashCode() * 31) + this.windowId) * 31) + (this.isDialog ? 1 : 0);
    }

    public boolean isDialog() {
        return this.isDialog;
    }

    public void setDialog(boolean z10) {
        this.isDialog = z10;
    }

    public void setWindowId(int i10) {
        this.windowId = i10;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
    public Map<String, Object> toMap() {
        Map<String, Object> map = super.toMap();
        map.put("windowId", Integer.valueOf(this.windowId));
        map.put("isDialog", Boolean.valueOf(this.isDialog));
        map.put("windowFeatures", null);
        return map;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction
    public String toString() {
        StringBuilder l10 = f.l("CreateWindowAction{windowId=");
        l10.append(this.windowId);
        l10.append(", isDialog=");
        l10.append(this.isDialog);
        l10.append(", request=");
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
