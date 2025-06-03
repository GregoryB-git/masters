/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Stack
 */
package P3;

import P3.d;
import java.util.Stack;

public class e {
    public final String a;
    public final String b;
    public final StackTraceElement[] c;
    public final e d;

    public e(String string2, String string3, StackTraceElement[] arrstackTraceElement, e e8) {
        this.a = string2;
        this.b = string3;
        this.c = arrstackTraceElement;
        this.d = e8;
    }

    public static e a(Throwable object, d d8) {
        Stack stack = new Stack();
        while (object != null) {
            stack.push(object);
            object = object.getCause();
        }
        object = null;
        while (!stack.isEmpty()) {
            Throwable throwable = (Throwable)stack.pop();
            object = new e(throwable.getLocalizedMessage(), throwable.getClass().getName(), d8.a(throwable.getStackTrace()), (e)object);
        }
        return object;
    }
}

