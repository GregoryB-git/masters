// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

import java.util.Collections;
import java.util.List;
import java.util.Collection;
import java.util.Map;

public abstract class c extends d implements D
{
    private static final long serialVersionUID = 6588350623831699109L;
    
    public c(final Map map) {
        super(map);
    }
    
    @Override
    public Map a() {
        return super.a();
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o);
    }
    
    @Override
    public boolean put(final Object o, final Object o2) {
        return super.put(o, o2);
    }
    
    @Override
    public Collection w(final Collection collection) {
        return Collections.unmodifiableList((List<?>)(List<? extends T>)collection);
    }
    
    @Override
    public Collection x(final Object o, final Collection collection) {
        return this.y(o, (List)collection, null);
    }
}
