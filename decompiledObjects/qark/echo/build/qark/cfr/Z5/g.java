/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.Field
 */
package Z5;

import Z5.a;
import Z5.f;
import Z5.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

public abstract class g {
    public static final void a(int n8, int n9) {
        if (n9 <= n8) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Debug metadata version mismatch. Expected: ");
        stringBuilder.append(n8);
        stringBuilder.append(", got ");
        stringBuilder.append(n9);
        stringBuilder.append(". Please update the Kotlin standard library.");
        throw new IllegalStateException(stringBuilder.toString().toString());
    }

    public static final f b(a a8) {
        return (f)a8.getClass().getAnnotation(f.class);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final int c(a object) {
        int n8;
        try {
            Field field = object.getClass().getDeclaredField("label");
            field.setAccessible(true);
            object = field.get(object);
            object = object instanceof Integer ? (Integer)object : null;
            if (object != null) {
                n8 = object.intValue();
                return n8 - 1;
            }
            n8 = 0;
        }
        catch (Exception exception) {
            return -1;
        }
        return n8 - 1;
    }

    public static final StackTraceElement d(a object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        f f8 = g.b((a)object);
        if (f8 == null) {
            return null;
        }
        g.a(1, f8.v());
        int n8 = g.c((a)object);
        n8 = n8 < 0 ? -1 : f8.l()[n8];
        object = i.a.b((a)object);
        if (object == null) {
            object = f8.c();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object);
            stringBuilder.append('/');
            stringBuilder.append(f8.c());
            object = stringBuilder.toString();
        }
        return new StackTraceElement((String)object, f8.m(), f8.f(), n8);
    }
}

