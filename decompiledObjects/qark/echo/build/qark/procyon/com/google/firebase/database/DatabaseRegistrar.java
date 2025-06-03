// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.database;

import java.util.Arrays;
import B3.h;
import Q3.f;
import B3.r;
import B3.c;
import java.util.List;
import A3.a;
import Q3.i;
import B3.e;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;

@Keep
public class DatabaseRegistrar implements ComponentRegistrar
{
    private static final String LIBRARY_NAME = "fire-rtdb";
    
    @Override
    public List<c> getComponents() {
        return Arrays.asList(c.e(i.class).h("fire-rtdb").b(r.k(s3.e.class)).b(r.a(a.class)).b(r.a(z3.a.class)).f(new f()).d(), O4.h.b("fire-rtdb", "20.3.0"));
    }
}
