// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class GooglePlayServicesMissingManifestValueException extends GooglePlayServicesManifestException
{
    public GooglePlayServicesMissingManifestValueException() {
        super(0, "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
    }
}
