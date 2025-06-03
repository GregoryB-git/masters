// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.attribution;

import androidx.annotation.NonNull;

public interface AppsFlyerRequestListener
{
    void onError(final int p0, @NonNull final String p1);
    
    void onSuccess();
}
