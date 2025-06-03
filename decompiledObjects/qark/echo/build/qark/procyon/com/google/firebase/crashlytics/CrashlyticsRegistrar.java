// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.crashlytics;

import java.util.Arrays;
import B3.h;
import D3.f;
import B3.r;
import B3.c;
import java.util.List;
import R4.l;
import s4.i;
import D3.g;
import B3.e;
import S4.b;
import S4.a;
import com.google.firebase.components.ComponentRegistrar;

public class CrashlyticsRegistrar implements ComponentRegistrar
{
    static {
        a.a.a(b.a.o);
    }
    
    public final g b(final e e) {
        return g.e((s3.e)e.a(s3.e.class), (i)e.a(i.class), (l)e.a(l.class), e.i(E3.a.class), e.i(w3.a.class));
    }
    
    @Override
    public List getComponents() {
        return Arrays.asList(c.e(g.class).h("fire-cls").b(r.k(s3.e.class)).b(r.k(i.class)).b(r.k(l.class)).b(r.a(E3.a.class)).b(r.a(w3.a.class)).f(new f(this)).e().d(), O4.h.b("fire-cls", "18.5.1"));
    }
}
