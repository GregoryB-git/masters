// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import androidx.annotation.NonNull;
import android.content.Context;
import java.lang.ref.WeakReference;

public final class AFf1cSDK
{
    public String AFInAppEventType;
    public final WeakReference<Context> AFKeystoreWrapper;
    
    public AFf1cSDK(@NonNull final Context referent) {
        this.AFKeystoreWrapper = new WeakReference<Context>(referent);
    }
}
