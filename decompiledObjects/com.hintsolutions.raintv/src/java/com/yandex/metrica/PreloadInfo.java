/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.metrica.impl.ob.A2
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package com.yandex.metrica;

import com.yandex.metrica.impl.ob.A2;
import java.util.HashMap;
import java.util.Map;

public class PreloadInfo {
    private String a;
    private Map<String, String> b;

    private PreloadInfo(Builder builder) {
        this.a = builder.a;
        this.b = A2.d((Map)builder.b);
    }

    public /* synthetic */ PreloadInfo(Builder builder, a a4) {
        this(builder);
    }

    public static Builder newBuilder(String string2) {
        return new Builder(string2, null);
    }

    public Map<String, String> getAdditionalParams() {
        return this.b;
    }

    public String getTrackingId() {
        return this.a;
    }

    public static class Builder {
        private String a;
        private Map<String, String> b;

        private Builder(String string2) {
            this.a = string2;
            this.b = new HashMap();
        }

        public /* synthetic */ Builder(String string2, a a4) {
            this(string2);
        }

        public PreloadInfo build() {
            return new PreloadInfo(this, null);
        }

        public Builder setAdditionalParams(String string2, String string3) {
            if (string2 != null && string3 != null) {
                this.b.put((Object)string2, (Object)string3);
            }
            return this;
        }
    }
}

