/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 *  java.util.Map
 */
package m6;

import java.util.List;
import java.util.Map;
import m6.a;
import m6.i;
import m6.j;

public interface b
extends a {
    public /* varargs */ Object call(Object ... var1);

    public Object callBy(Map var1);

    public List getParameters();

    public i getReturnType();

    public List getTypeParameters();

    public j getVisibility();

    public boolean isAbstract();

    public boolean isFinal();

    public boolean isOpen();
}

