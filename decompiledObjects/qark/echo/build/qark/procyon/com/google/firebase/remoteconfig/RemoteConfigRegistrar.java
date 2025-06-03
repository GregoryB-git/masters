// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.remoteconfig;

import java.util.Arrays;
import B3.h;
import P4.y;
import B3.r;
import y3.b;
import B3.c;
import java.util.List;
import u3.a;
import s4.i;
import java.util.concurrent.ScheduledExecutorService;
import android.content.Context;
import P4.x;
import B3.e;
import B3.F;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;

@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar
{
    private static final String LIBRARY_NAME = "fire-rc";
    
    @Override
    public List<c> getComponents() {
        final F a = F.a(b.class, ScheduledExecutorService.class);
        return Arrays.asList(c.e(x.class).h("fire-rc").b(r.k(Context.class)).b(r.j(a)).b(r.k(s3.e.class)).b(r.k(i.class)).b(r.k(a.class)).b(r.i(w3.a.class)).f(new y(a)).e().d(), O4.h.b("fire-rc", "21.5.0"));
    }
}
