// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import android.content.Intent;
import com.appsflyer.AFLogger;
import android.content.BroadcastReceiver;
import androidx.annotation.NonNull;
import android.content.Context;
import android.content.IntentFilter;

public final class AFa1wSDK implements AFb1eSDK
{
    private static IntentFilter AFInAppEventParameterName;
    
    static {
        AFa1wSDK.AFInAppEventParameterName = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }
    
    @NonNull
    @Override
    public final AFa1ySDK AFInAppEventType(@NonNull final Context context) {
        while (true) {
            final String s = null;
            final String s2 = null;
            final float n = 0.0f;
            String s3 = s;
            while (true) {
                Label_0193: {
                    Label_0187: {
                        Label_0181: {
                            Label_0175: {
                                while (true) {
                                    try {
                                        final Intent registerReceiver = context.registerReceiver((BroadcastReceiver)null, AFa1wSDK.AFInAppEventParameterName);
                                        s3 = s2;
                                        float n2 = n;
                                        if (registerReceiver != null) {
                                            s3 = s;
                                            if (2 != registerReceiver.getIntExtra("status", -1)) {
                                                break Label_0193;
                                            }
                                            s3 = s;
                                            final int intExtra = registerReceiver.getIntExtra("plugged", -1);
                                            if (intExtra == 1) {
                                                break Label_0187;
                                            }
                                            if (intExtra == 2) {
                                                break Label_0181;
                                            }
                                            if (intExtra == 4) {
                                                break Label_0175;
                                            }
                                            final String s4 = "other";
                                            s3 = s4;
                                            final int intExtra2 = registerReceiver.getIntExtra("level", -1);
                                            s3 = s4;
                                            final int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                                            s3 = s4;
                                            n2 = n;
                                            if (-1 != intExtra2) {
                                                s3 = s4;
                                                n2 = n;
                                                if (-1 != intExtra3) {
                                                    n2 = intExtra2 * 100.0f / intExtra3;
                                                    s3 = s4;
                                                }
                                            }
                                        }
                                        return new AFa1ySDK(n2, s3);
                                        final Throwable t;
                                        AFLogger.afErrorLogForExcManagerOnly("Device that failed to register receiver", t);
                                        n2 = n;
                                        return new AFa1ySDK(n2, s3);
                                    }
                                    finally {}
                                    final Throwable t2;
                                    final Throwable t = t2;
                                    continue;
                                }
                            }
                            final String s4 = "wireless";
                            continue;
                        }
                        final String s4 = "usb";
                        continue;
                    }
                    final String s4 = "ac";
                    continue;
                }
                final String s4 = "no";
                continue;
            }
        }
    }
}
