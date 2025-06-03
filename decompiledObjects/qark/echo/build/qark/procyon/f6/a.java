// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f6;

import kotlin.jvm.internal.v;
import java.io.Serializable;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.Intrinsics;
import m6.c;

public abstract class a
{
    public static final Class a(final c c) {
        Intrinsics.checkNotNullParameter(c, "<this>");
        Serializable b = ((d)c).b();
        if (!((Class)b).isPrimitive()) {
            Intrinsics.c(b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return (Class)b;
        }
        final String name = ((Class)b).getName();
        switch (name) {
            case "short": {
                b = Short.class;
                break;
            }
            case "float": {
                b = Float.class;
                break;
            }
            case "boolean": {
                b = Boolean.class;
                break;
            }
            case "void": {
                b = Void.class;
                break;
            }
            case "long": {
                b = Long.class;
                break;
            }
            case "char": {
                b = Character.class;
                break;
            }
            case "byte": {
                b = Byte.class;
                break;
            }
            case "int": {
                b = Integer.class;
                break;
            }
            case "double": {
                b = Double.class;
                break;
            }
            default:
                break;
        }
        Intrinsics.c(b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return (Class)b;
    }
    
    public static final c b(final Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "<this>");
        return v.b(clazz);
    }
}
