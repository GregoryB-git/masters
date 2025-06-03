/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 */
package ru.tvrain.core.data;

import java.io.Serializable;

public class Author
implements Serializable {
    public String name;
    public String url;

    public String getUrl() {
        String string2;
        if (this.url.startsWith("http")) {
            string2 = this.url;
        } else {
            string2 = z2.t("https://tvrain.tv");
            string2.append(this.url);
            string2 = string2.toString();
        }
        return string2;
    }

    public boolean hasUrl() {
        String string2 = this.url;
        boolean bl = string2 != null && !string2.isEmpty();
        return bl;
    }
}

