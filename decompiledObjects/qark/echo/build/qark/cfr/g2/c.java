/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package g2;

import android.content.Context;
import g2.h;
import p2.a;

public final class c
extends h {
    public final Context a;
    public final a b;
    public final a c;
    public final String d;

    public c(Context context, a a8, a a9, String string2) {
        if (context != null) {
            this.a = context;
            if (a8 != null) {
                this.b = a8;
                if (a9 != null) {
                    this.c = a9;
                    if (string2 != null) {
                        this.d = string2;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override
    public Context b() {
        return this.a;
    }

    @Override
    public String c() {
        return this.d;
    }

    @Override
    public a d() {
        return this.c;
    }

    @Override
    public a e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof h) {
            if (this.a.equals((Object)(object = (h)object).b()) && this.b.equals((Object)object.e()) && this.c.equals((Object)object.d()) && this.d.equals((Object)object.c())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CreationContext{applicationContext=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", wallClock=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", monotonicClock=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", backendName=");
        stringBuilder.append(this.d);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

