// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Array;
import android.graphics.Typeface;

public class l extends k
{
    @Override
    public Typeface i(Object cause) {
        try {
            final Object instance = Array.newInstance(super.g, 1);
            Array.set(instance, 0, cause);
            cause = (InvocationTargetException)super.m.invoke(null, instance, "sans-serif", -1, -1);
            return (Typeface)cause;
        }
        catch (InvocationTargetException cause) {}
        catch (IllegalAccessException ex) {}
        throw new RuntimeException(cause);
    }
    
    @Override
    public Method u(Class class1) {
        class1 = Array.newInstance(class1, 1).getClass();
        final Class<Integer> type = Integer.TYPE;
        final Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", class1, String.class, type, type);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
