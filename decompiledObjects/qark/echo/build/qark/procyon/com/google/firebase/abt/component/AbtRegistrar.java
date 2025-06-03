// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.abt.component;

import java.util.Arrays;
import B3.h;
import u3.b;
import B3.r;
import B3.c;
import java.util.List;
import android.content.Context;
import u3.a;
import B3.e;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;

@Keep
public class AbtRegistrar implements ComponentRegistrar
{
    private static final String LIBRARY_NAME = "fire-abt";
    
    @Override
    public List<c> getComponents() {
        return Arrays.asList(c.e(a.class).h("fire-abt").b(r.k(Context.class)).b(r.i(w3.a.class)).f(new b()).d(), O4.h.b("fire-abt", "21.1.1"));
    }
}
