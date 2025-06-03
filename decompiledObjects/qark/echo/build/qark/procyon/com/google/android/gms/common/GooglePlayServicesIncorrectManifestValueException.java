// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.common;

import x2.k;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException
{
    public GooglePlayServicesIncorrectManifestValueException(final int i) {
        final int a = k.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
        sb.append(a);
        sb.append(" but found ");
        sb.append(i);
        sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
        super(i, sb.toString());
    }
}
