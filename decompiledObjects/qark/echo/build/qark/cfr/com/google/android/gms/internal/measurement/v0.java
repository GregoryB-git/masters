/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.InterruptedException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicReference
 */
package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.B0;
import java.util.concurrent.atomic.AtomicReference;

public final class v0
extends B0 {
    public final AtomicReference b = new AtomicReference();
    public boolean c;

    public static Object v(Bundle object, Class object2) {
        Object object3;
        if (object != null && (object3 = object.get("r")) != null) {
            try {
                object = object2.cast(object3);
                return object;
            }
            catch (ClassCastException classCastException) {
                object2 = object2.getCanonicalName();
                object3 = object3.getClass().getCanonicalName();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unexpected object type. Expected, Received");
                stringBuilder.append(": %s, %s");
                Log.w((String)"AM", (String)String.format((String)stringBuilder.toString(), (Object[])new Object[]{object2, object3}), (Throwable)classCastException);
                throw classCastException;
            }
        }
        return null;
    }

    public final Long Z0(long l8) {
        return (Long)v0.v(this.o(l8), Long.class);
    }

    public final String a1(long l8) {
        return (String)v0.v(this.o(l8), String.class);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void l(Bundle bundle) {
        AtomicReference atomicReference = this.b;
        // MONITORENTER : atomicReference
        this.b.set((Object)bundle);
        this.c = true;
        {
            catch (Throwable throwable) {
                this.b.notify();
                throw throwable;
            }
        }
        this.b.notify();
        // MONITOREXIT : atomicReference
        return;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Bundle o(long l8) {
        AtomicReference atomicReference = this.b;
        // MONITORENTER : atomicReference
        boolean bl = this.c;
        if (!bl) {
            this.b.wait(l8);
        }
        Bundle bundle = (Bundle)this.b.get();
        // MONITOREXIT : atomicReference
        return bundle;
        catch (InterruptedException interruptedException) {
            return null;
        }
    }
}

