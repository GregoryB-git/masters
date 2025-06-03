// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.datatransport;

import java.util.Arrays;
import B3.h;
import B3.r;
import B3.c;
import java.util.List;
import f2.f;
import d2.a;
import f2.u;
import android.content.Context;
import c2.g;
import B3.e;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;

@Keep
public class TransportRegistrar implements ComponentRegistrar
{
    private static final String LIBRARY_NAME = "fire-transport";
    
    @Override
    public List<c> getComponents() {
        return Arrays.asList(c.e(g.class).h("fire-transport").b(r.k(Context.class)).f(new g4.a()).d(), O4.h.b("fire-transport", "18.1.8"));
    }
}
