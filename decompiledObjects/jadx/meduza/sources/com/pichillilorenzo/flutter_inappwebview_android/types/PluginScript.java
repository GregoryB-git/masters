package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.f;
import java.util.Set;

/* loaded from: classes.dex */
public class PluginScript extends UserScript {
    private boolean requiredInAllContentWorlds;

    public PluginScript(String str, String str2, UserScriptInjectionTime userScriptInjectionTime, ContentWorld contentWorld, boolean z10, Set<String> set) {
        super(str, str2, userScriptInjectionTime, contentWorld, set);
        this.requiredInAllContentWorlds = z10;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.UserScript
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && super.equals(obj) && this.requiredInAllContentWorlds == ((PluginScript) obj).requiredInAllContentWorlds;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.UserScript
    public int hashCode() {
        return (super.hashCode() * 31) + (this.requiredInAllContentWorlds ? 1 : 0);
    }

    public boolean isRequiredInAllContentWorlds() {
        return this.requiredInAllContentWorlds;
    }

    public void setRequiredInAllContentWorlds(boolean z10) {
        this.requiredInAllContentWorlds = z10;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.UserScript
    public String toString() {
        StringBuilder l10 = f.l("PluginScript{requiredInContentWorld=");
        l10.append(this.requiredInAllContentWorlds);
        l10.append("} ");
        l10.append(super.toString());
        return l10.toString();
    }
}
