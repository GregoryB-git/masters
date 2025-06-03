/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.google.android.gms.common;

import com.google.android.gms.common.GooglePlayServicesManifestException;
import com.google.android.gms.common.annotation.KeepName;
import x2.k;

@KeepName
public final class GooglePlayServicesIncorrectManifestValueException
extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int n8) {
        int n9 = k.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
        stringBuilder.append(n9);
        stringBuilder.append(" but found ");
        stringBuilder.append(n8);
        stringBuilder.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        super(n8, stringBuilder.toString());
    }
}

