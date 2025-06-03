// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal.components.network.http;

import java.util.List;
import androidx.annotation.NonNull;

public interface ResponseNetwork<Body>
{
    @NonNull
    Body getBody();
    
    List<String> getHeaderField(final String p0);
    
    int getStatusCode();
    
    boolean isSuccessful();
}
