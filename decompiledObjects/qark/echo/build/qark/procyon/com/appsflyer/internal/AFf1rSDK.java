// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.util.Observable;
import java.util.Observer;
import java.util.Map;

public abstract class AFf1rSDK extends AFf1pSDK
{
    public AFf1rSDK(final String s, final String s2, final Runnable runnable) {
        super(s, s2, runnable);
    }
    
    public final void AFInAppEventType(final AFb1dSDK aFb1dSDK, final AFb1hSDK<Map<String, Object>> aFb1hSDK) {
        if (AFa1eSDK.valueOf().valueOf(aFb1dSDK, false) <= 0) {
            if (!aFb1hSDK.AFKeystoreWrapper()) {
                return;
            }
            aFb1hSDK.AFInAppEventType.AFInAppEventType().execute(aFb1hSDK.values);
            super.afInfoLog = System.currentTimeMillis();
            super.afDebugLog = AFa1zSDK.AFInAppEventType;
            this.addObserver(new Observer() {
                private /* synthetic */ AFf1pSDK values = this;
                
                @Override
                public final void update(final Observable observable, final Object o) {
                    this.values.values.run();
                }
            });
        }
    }
}
