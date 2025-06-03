/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.twitter.sdk.android.core.internal.scribe;

import com.google.gson.annotations.SerializedName;

public class EventNamespace {
    @SerializedName(value="action")
    public final String action;
    @SerializedName(value="client")
    public final String client;
    @SerializedName(value="component")
    public final String component;
    @SerializedName(value="element")
    public final String element;
    @SerializedName(value="page")
    public final String page;
    @SerializedName(value="section")
    public final String section;

    public EventNamespace(String string2, String string3, String string4, String string5, String string6, String string7) {
        this.client = string2;
        this.page = string3;
        this.section = string4;
        this.component = string5;
        this.element = string6;
        this.action = string7;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (EventNamespace)object;
            String string2 = this.action;
            if (string2 != null ? !string2.equals((Object)((EventNamespace)object).action) : ((EventNamespace)object).action != null) {
                return false;
            }
            string2 = this.client;
            if (string2 != null ? !string2.equals((Object)((EventNamespace)object).client) : ((EventNamespace)object).client != null) {
                return false;
            }
            string2 = this.component;
            if (string2 != null ? !string2.equals((Object)((EventNamespace)object).component) : ((EventNamespace)object).component != null) {
                return false;
            }
            string2 = this.element;
            if (string2 != null ? !string2.equals((Object)((EventNamespace)object).element) : ((EventNamespace)object).element != null) {
                return false;
            }
            string2 = this.page;
            if (string2 != null ? !string2.equals((Object)((EventNamespace)object).page) : ((EventNamespace)object).page != null) {
                return false;
            }
            string2 = this.section;
            object = ((EventNamespace)object).section;
            return !(string2 != null ? !string2.equals(object) : object != null);
        }
        return false;
    }

    public int hashCode() {
        String string2 = this.client;
        int n = 0;
        int n2 = string2 != null ? string2.hashCode() : 0;
        string2 = this.page;
        int n3 = string2 != null ? string2.hashCode() : 0;
        string2 = this.section;
        int n4 = string2 != null ? string2.hashCode() : 0;
        string2 = this.component;
        int n5 = string2 != null ? string2.hashCode() : 0;
        string2 = this.element;
        int n6 = string2 != null ? string2.hashCode() : 0;
        string2 = this.action;
        if (string2 != null) {
            n = string2.hashCode();
        }
        return ((((n2 * 31 + n3) * 31 + n4) * 31 + n5) * 31 + n6) * 31 + n;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("client=");
        stringBuilder.append(this.client);
        stringBuilder.append(", page=");
        stringBuilder.append(this.page);
        stringBuilder.append(", section=");
        stringBuilder.append(this.section);
        stringBuilder.append(", component=");
        stringBuilder.append(this.component);
        stringBuilder.append(", element=");
        stringBuilder.append(this.element);
        stringBuilder.append(", action=");
        stringBuilder.append(this.action);
        return stringBuilder.toString();
    }

    public static class Builder {
        private String action;
        private String client;
        private String component;
        private String element;
        private String page;
        private String section;

        public EventNamespace builder() {
            return new EventNamespace(this.client, this.page, this.section, this.component, this.element, this.action);
        }

        public Builder setAction(String string2) {
            this.action = string2;
            return this;
        }

        public Builder setClient(String string2) {
            this.client = string2;
            return this;
        }

        public Builder setComponent(String string2) {
            this.component = string2;
            return this;
        }

        public Builder setElement(String string2) {
            this.element = string2;
            return this;
        }

        public Builder setPage(String string2) {
            this.page = string2;
            return this;
        }

        public Builder setSection(String string2) {
            this.section = string2;
            return this;
        }
    }
}

