/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package io.flutter.plugins.firebase.crashlytics;

import androidx.annotation.Keep;

@Keep
public class FirebaseCrashlyticsTestCrash
extends RuntimeException {
    public FirebaseCrashlyticsTestCrash() {
        super("This is a test crash caused by calling .crash() in Dart.");
    }
}

