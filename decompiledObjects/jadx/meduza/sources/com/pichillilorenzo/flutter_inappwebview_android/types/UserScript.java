package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import defpackage.f;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class UserScript {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private Set<String> allowedOriginRules;
    private ContentWorld contentWorld;
    private String groupName;
    private UserScriptInjectionTime injectionTime;
    private String source;

    public UserScript(String str, String str2, UserScriptInjectionTime userScriptInjectionTime, ContentWorld contentWorld, Set<String> set) {
        this.allowedOriginRules = new HashSet();
        this.groupName = str;
        this.source = str2;
        this.injectionTime = userScriptInjectionTime;
        this.contentWorld = contentWorld == null ? ContentWorld.PAGE : contentWorld;
        this.allowedOriginRules = set == null ? new HashSet<String>() { // from class: com.pichillilorenzo.flutter_inappwebview_android.types.UserScript.1
            {
                add("*");
            }
        } : set;
    }

    public static UserScript fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new UserScript((String) map.get("groupName"), (String) map.get("source"), UserScriptInjectionTime.fromValue(((Integer) map.get("injectionTime")).intValue()), ContentWorld.fromMap((Map) map.get("contentWorld")), new HashSet((List) map.get("allowedOriginRules")));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserScript userScript = (UserScript) obj;
        String str = this.groupName;
        if (str == null ? userScript.groupName != null : !str.equals(userScript.groupName)) {
            return false;
        }
        if (this.source.equals(userScript.source) && this.injectionTime == userScript.injectionTime && this.contentWorld.equals(userScript.contentWorld)) {
            return this.allowedOriginRules.equals(userScript.allowedOriginRules);
        }
        return false;
    }

    public Set<String> getAllowedOriginRules() {
        return this.allowedOriginRules;
    }

    public ContentWorld getContentWorld() {
        return this.contentWorld;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public UserScriptInjectionTime getInjectionTime() {
        return this.injectionTime;
    }

    public String getSource() {
        return this.source;
    }

    public int hashCode() {
        String str = this.groupName;
        return this.allowedOriginRules.hashCode() + ((this.contentWorld.hashCode() + ((this.injectionTime.hashCode() + j.e(this.source, (str != null ? str.hashCode() : 0) * 31, 31)) * 31)) * 31);
    }

    public void setAllowedOriginRules(Set<String> set) {
        this.allowedOriginRules = set;
    }

    public void setContentWorld(ContentWorld contentWorld) {
        if (contentWorld == null) {
            contentWorld = ContentWorld.PAGE;
        }
        this.contentWorld = contentWorld;
    }

    public void setGroupName(String str) {
        this.groupName = str;
    }

    public void setInjectionTime(UserScriptInjectionTime userScriptInjectionTime) {
        this.injectionTime = userScriptInjectionTime;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public String toString() {
        StringBuilder l10 = f.l("UserScript{groupName='");
        j.s(l10, this.groupName, '\'', ", source='");
        j.s(l10, this.source, '\'', ", injectionTime=");
        l10.append(this.injectionTime);
        l10.append(", contentWorld=");
        l10.append(this.contentWorld);
        l10.append(", allowedOriginRules=");
        l10.append(this.allowedOriginRules);
        l10.append('}');
        return l10.toString();
    }
}
