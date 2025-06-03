/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.appsflyer;

import com.appsflyer.internal.AFc1tSDK;
import com.appsflyer.internal.AFc1uSDK;
import com.appsflyer.internal.AFc1vSDK;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class CreateOneLinkHttpTask
implements AFc1uSDK {
    @NotNull
    private final AFc1vSDK valueOf;

    public CreateOneLinkHttpTask() {
    }

    public CreateOneLinkHttpTask(AFc1vSDK aFc1vSDK) {
        Intrinsics.checkNotNullParameter(aFc1vSDK, "");
        this.valueOf = aFc1vSDK;
    }

    @Override
    public final void valueOf(byte[] arrby, Map<String, String> map, int n8) {
        Intrinsics.checkNotNullParameter(arrby, "");
        Intrinsics.checkNotNullParameter(arrby, "");
        if (new AFc1tSDK(arrby, map, 2000).AFInAppEventParameterName()) {
            this.valueOf.values();
        }
    }

    @Deprecated
    public static interface ResponseListener {
        public void onResponse(String var1);

        public void onResponseError(String var1);
    }

}

