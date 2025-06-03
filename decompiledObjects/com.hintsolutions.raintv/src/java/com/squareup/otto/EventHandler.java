/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.AssertionError
 *  java.lang.Error
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
package com.squareup.otto;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class EventHandler {
    private final int hashCode;
    private final Method method;
    private final Object target;
    private boolean valid = true;

    public EventHandler(Object object, Method method) {
        if (object != null) {
            if (method != null) {
                this.target = object;
                this.method = method;
                method.setAccessible(true);
                int n = method.hashCode();
                this.hashCode = object.hashCode() + (n + 31) * 31;
                return;
            }
            throw new NullPointerException("EventHandler method cannot be null.");
        }
        throw new NullPointerException("EventHandler target cannot be null.");
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        object = (EventHandler)object;
        if (!this.method.equals((Object)((EventHandler)object).method) || this.target != ((EventHandler)object).target) {
            bl = false;
        }
        return bl;
    }

    public void handleEvent(Object object) throws InvocationTargetException {
        if (this.valid) {
            try {
                this.method.invoke(this.target, new Object[]{object});
                return;
            }
            catch (InvocationTargetException invocationTargetException) {
                if (invocationTargetException.getCause() instanceof Error) {
                    throw (Error)invocationTargetException.getCause();
                }
                throw invocationTargetException;
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new AssertionError((Object)illegalAccessException);
            }
        }
        throw new IllegalStateException(z2.s(new StringBuilder(), this.toString(), " has been invalidated and can no longer handle events."));
    }

    public int hashCode() {
        return this.hashCode;
    }

    public void invalidate() {
        this.valid = false;
    }

    public boolean isValid() {
        return this.valid;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("[EventHandler ");
        stringBuilder.append((Object)this.method);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

