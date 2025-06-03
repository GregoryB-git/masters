// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n4;

import B3.E;

public class a
{
    public final Class a;
    public final Object b;
    
    public a(final Class clazz, final Object o) {
        this.a = (Class)E.b(clazz);
        this.b = E.b(o);
    }
    
    public Object a() {
        return this.b;
    }
    
    public Class b() {
        return this.a;
    }
    
    @Override
    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.a, this.b);
    }
}
