package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

import defpackage.f;

/* loaded from: classes.dex */
public class ContentBlocker {
    private ContentBlockerAction action;
    private ContentBlockerTrigger trigger;

    public ContentBlocker(ContentBlockerTrigger contentBlockerTrigger, ContentBlockerAction contentBlockerAction) {
        this.trigger = contentBlockerTrigger;
        this.action = contentBlockerAction;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ContentBlocker contentBlocker = (ContentBlocker) obj;
        if (this.trigger.equals(contentBlocker.trigger)) {
            return this.action.equals(contentBlocker.action);
        }
        return false;
    }

    public ContentBlockerAction getAction() {
        return this.action;
    }

    public ContentBlockerTrigger getTrigger() {
        return this.trigger;
    }

    public int hashCode() {
        return this.action.hashCode() + (this.trigger.hashCode() * 31);
    }

    public void setAction(ContentBlockerAction contentBlockerAction) {
        this.action = contentBlockerAction;
    }

    public void setTrigger(ContentBlockerTrigger contentBlockerTrigger) {
        this.trigger = contentBlockerTrigger;
    }

    public String toString() {
        StringBuilder l10 = f.l("ContentBlocker{trigger=");
        l10.append(this.trigger);
        l10.append(", action=");
        l10.append(this.action);
        l10.append('}');
        return l10.toString();
    }
}
