// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Iterator;

public final class u implements s, Iterable
{
    public final String o;
    
    public u(final String o) {
        if (o != null) {
            this.o = o;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }
    
    @Override
    public final s c() {
        return new u(this.o);
    }
    
    @Override
    public final Boolean d() {
        return this.o.isEmpty() ^ true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof u && this.o.equals(((u)o).o));
    }
    
    @Override
    public final Double f() {
        double d;
        if (this.o.isEmpty()) {
            d = 0.0;
        }
        else {
            while (true) {
                try {
                    return Double.valueOf(this.o);
                    d = Double.NaN;
                }
                catch (NumberFormatException ex) {
                    continue;
                }
                break;
            }
        }
        return d;
    }
    
    @Override
    public final String g() {
        return this.o;
    }
    
    @Override
    public final int hashCode() {
        return this.o.hashCode();
    }
    
    @Override
    public final Iterator iterator() {
        return new w(this);
    }
    
    @Override
    public final Iterator k() {
        return new x(this);
    }
    
    @Override
    public final s s(final String s, final f3 f3, final List list) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    @Override
    public final String toString() {
        final String o = this.o;
        final StringBuilder sb = new StringBuilder("\"");
        sb.append(o);
        sb.append("\"");
        return sb.toString();
    }
}
