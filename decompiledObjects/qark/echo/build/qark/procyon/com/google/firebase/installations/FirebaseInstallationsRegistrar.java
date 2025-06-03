// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.installations;

import java.util.Arrays;
import s4.k;
import B3.r;
import B3.c;
import java.util.List;
import s4.h;
import C3.z;
import y3.b;
import java.util.concurrent.Executor;
import B3.F;
import y3.a;
import java.util.concurrent.ExecutorService;
import s4.i;
import B3.e;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar
{
    private static final String LIBRARY_NAME = "fire-installations";
    
    @Override
    public List<c> getComponents() {
        return Arrays.asList(c.e(i.class).h("fire-installations").b(r.k(s3.e.class)).b(r.i(o4.i.class)).b(r.j(F.a(a.class, ExecutorService.class))).b(r.j(F.a(b.class, Executor.class))).f(new k()).d(), o4.h.a(), O4.h.b("fire-installations", "17.2.0"));
    }
}
