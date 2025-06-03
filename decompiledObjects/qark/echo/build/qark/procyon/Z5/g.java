// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z5;

import kotlin.jvm.internal.Intrinsics;
import java.lang.reflect.Field;

public abstract class g
{
    public static final void a(final int i, final int j) {
        if (j <= i) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Debug metadata version mismatch. Expected: ");
        sb.append(i);
        sb.append(", got ");
        sb.append(j);
        sb.append(". Please update the Kotlin standard library.");
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public static final f b(final a a) {
        return a.getClass().getAnnotation(f.class);
    }
    
    public static final int c(final a obj) {
        while (true) {
            while (true) {
                Label_0060: {
                    try {
                        final Field declaredField = obj.getClass().getDeclaredField("label");
                        declaredField.setAccessible(true);
                        final Object value = declaredField.get(obj);
                        if (value instanceof Integer) {
                            final Integer n = (Integer)value;
                            int intValue;
                            if (n != null) {
                                intValue = n;
                            }
                            else {
                                intValue = 0;
                            }
                            return intValue - 1;
                        }
                        break Label_0060;
                    }
                    catch (Exception ex) {
                        return -1;
                    }
                }
                final Integer n = null;
                continue;
            }
        }
    }
    
    public static final StackTraceElement d(final a a) {
        Intrinsics.checkNotNullParameter(a, "<this>");
        final f b = b(a);
        if (b == null) {
            return null;
        }
        a(1, b.v());
        final int c = c(a);
        int lineNumber;
        if (c < 0) {
            lineNumber = -1;
        }
        else {
            lineNumber = b.l()[c];
        }
        final String b2 = i.a.b(a);
        String declaringClass;
        if (b2 == null) {
            declaringClass = b.c();
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append(b2);
            sb.append('/');
            sb.append(b.c());
            declaringClass = sb.toString();
        }
        return new StackTraceElement(declaringClass, b.m(), b.f(), lineNumber);
    }
}
