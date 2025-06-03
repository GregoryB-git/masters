// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.messaging;

import android.content.Intent;
import V2.e;
import java.util.concurrent.Executor;
import r1.m;
import android.util.Log;
import android.os.Process;
import V2.j;
import android.os.Binder;

public class l0 extends Binder
{
    public final a b;
    
    public l0(final a b) {
        this.b = b;
    }
    
    public void c(final o0.a a) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.b.a(a.a).c(new m(), new k0(a));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
    
    public interface a
    {
        j a(final Intent p0);
    }
}
