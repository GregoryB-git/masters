/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.appsflyer.internal;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public interface AFf1iSDK {
    public void AFInAppEventParameterName();

    public void AFInAppEventType();

    @NotNull
    public Map<String, Object> valueOf();

    @NotNull
    public Map<String, Object> values();

    @Metadata
    public static final class AFa1ySDK {
        static final /* synthetic */ AFa1ySDK AFInAppEventParameterName;

        static {
            AFInAppEventParameterName = new AFa1ySDK();
        }

        private AFa1ySDK() {
        }
    }

}

