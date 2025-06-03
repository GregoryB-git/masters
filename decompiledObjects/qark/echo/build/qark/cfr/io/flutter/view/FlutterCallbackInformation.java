/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.view;

import androidx.annotation.Keep;
import io.flutter.embedding.engine.FlutterJNI;

@Keep
public final class FlutterCallbackInformation {
    public final String callbackClassName;
    public final String callbackLibraryPath;
    public final String callbackName;

    private FlutterCallbackInformation(String string2, String string3, String string4) {
        this.callbackName = string2;
        this.callbackClassName = string3;
        this.callbackLibraryPath = string4;
    }

    public static FlutterCallbackInformation lookupCallbackInformation(long l8) {
        return FlutterJNI.nativeLookupCallbackInformation(l8);
    }
}

