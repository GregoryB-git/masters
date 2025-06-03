/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 *  java.util.Set
 */
package R2;

import A2.n;
import R2.D;
import R2.N2;
import R2.S5;
import R2.X1;
import R2.Y1;
import R2.a2;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Set;

public final class A {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final D f;

    public A(N2 n22, String string2, String string3, String string4, long l8, long l9, D d8) {
        n.e(string3);
        n.e(string4);
        n.i(d8);
        this.a = string3;
        this.b = string4;
        String string5 = string2;
        if (TextUtils.isEmpty((CharSequence)string2)) {
            string5 = null;
        }
        this.c = string5;
        this.d = l8;
        this.e = l9;
        if (l9 != 0L && l9 > l8) {
            n22.j().L().c("Event created with reverse previous/current timestamps. appId, name", Y1.v(string3), Y1.v(string4));
        }
        this.f = d8;
    }

    /*
     * Enabled aggressive block sorting
     */
    public A(N2 object, String string2, String string3, String string4, long l8, long l9, Bundle object2) {
        block7 : {
            block6 : {
                n.e(string3);
                n.e(string4);
                this.a = string3;
                this.b = string4;
                string4 = string2;
                if (TextUtils.isEmpty((CharSequence)string2)) {
                    string4 = null;
                }
                this.c = string4;
                this.d = l8;
                this.e = l9;
                if (l9 != 0L && l9 > l8) {
                    object.j().L().b("Event created with reverse previous/current timestamps. appId", Y1.v(string3));
                }
                if (object2 != null && !object2.isEmpty()) break block6;
                object = new D(new Bundle());
                break block7;
            }
            string2 = new Bundle((Bundle)object2);
            string3 = string2.keySet().iterator();
            while (string3.hasNext()) {
                block10 : {
                    block9 : {
                        block8 : {
                            string4 = (String)string3.next();
                            if (string4 != null) break block8;
                            object.j().G().a("Param name can't be null");
                            break block9;
                        }
                        object2 = object.L().s0(string4, string2.get(string4));
                        if (object2 != null) break block10;
                        object.j().L().b("Param value can't be null", object.D().f(string4));
                    }
                    string3.remove();
                    continue;
                }
                object.L().R((Bundle)string2, string4, object2);
            }
            object = new D((Bundle)string2);
        }
        this.f = object;
    }

    public final A a(N2 n22, long l8) {
        return new A(n22, this.c, this.a, this.b, this.d, l8, this.f);
    }

    public final String toString() {
        String string2 = this.a;
        String string3 = this.b;
        String string4 = String.valueOf((Object)this.f);
        StringBuilder stringBuilder = new StringBuilder("Event{appId='");
        stringBuilder.append(string2);
        stringBuilder.append("', name='");
        stringBuilder.append(string3);
        stringBuilder.append("', params=");
        stringBuilder.append(string4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

