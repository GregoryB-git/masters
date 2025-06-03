// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.content.Intent;
import A2.n;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import androidx.annotation.Keep;
import z2.Z;
import z2.b0;
import z2.f;
import android.app.Activity;
import z2.g;

public class LifecycleCallback
{
    public final g o;
    
    public LifecycleCallback(final g o) {
        this.o = o;
    }
    
    public static g c(final Activity activity) {
        return d(new f(activity));
    }
    
    public static g d(final f f) {
        if (f.d()) {
            return b0.J1(f.b());
        }
        if (f.c()) {
            return Z.f(f.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }
    
    @Keep
    private static g getChimeraLifecycleFragmentImpl(final f f) {
        throw new IllegalStateException("Method not available in SDK.");
    }
    
    public void a(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
    }
    
    public Activity b() {
        final Activity c = this.o.c();
        n.i(c);
        return c;
    }
    
    public void e(final int n, final int n2, final Intent intent) {
    }
    
    public void f(final Bundle bundle) {
    }
    
    public void g() {
    }
    
    public void h() {
    }
    
    public void i(final Bundle bundle) {
    }
    
    public void j() {
    }
    
    public void k() {
    }
}
