/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.yandex.metrica.networktasks.api;

import android.net.Uri;
import com.yandex.metrica.networktasks.api.ConfigProvider;
import com.yandex.metrica.networktasks.api.IParamsAppender;
import com.yandex.metrica.networktasks.impl.b;
import java.util.ArrayList;
import java.util.List;

public class FullUrlFormer {
    private List a = new ArrayList();
    private int b = -1;
    private String c;
    private final IParamsAppender d;
    private final ConfigProvider e;

    public FullUrlFormer(IParamsAppender iParamsAppender, ConfigProvider configProvider) {
        this.d = iParamsAppender;
        this.e = configProvider;
    }

    public void buildAndSetFullHostUrl() {
        Uri.Builder builder = Uri.parse((String)((String)this.a.get(this.b))).buildUpon();
        Object object = this.e.getConfig();
        this.d.appendParams(builder, object);
        this.c = builder.build().toString();
    }

    public List getAllHosts() {
        return this.a;
    }

    public String getUrl() {
        return new b(this.c).a();
    }

    public boolean hasMoreHosts() {
        int n7 = this.b;
        boolean bl = true;
        if (n7 + 1 >= this.a.size()) {
            bl = false;
        }
        return bl;
    }

    public void incrementAttemptNumber() {
        ++this.b;
    }

    public void setHosts(List list) {
        List list2 = list;
        if (list == null) {
            list2 = new ArrayList();
        }
        this.a = list2;
    }
}

