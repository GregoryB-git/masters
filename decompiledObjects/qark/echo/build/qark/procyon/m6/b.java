// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m6;

import java.util.List;
import java.util.Map;

public interface b extends a
{
    Object call(final Object... p0);
    
    Object callBy(final Map p0);
    
    List getParameters();
    
    i getReturnType();
    
    List getTypeParameters();
    
    j getVisibility();
    
    boolean isAbstract();
    
    boolean isFinal();
    
    boolean isOpen();
}
