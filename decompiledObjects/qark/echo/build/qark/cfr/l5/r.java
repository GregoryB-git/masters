/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 */
package l5;

import java.util.Objects;
import l5.p;

public class r {
    public final String a;
    public final String b;
    public final long c;
    public final p d;

    public r(String string2, String string3, long l8, p p8) {
        this.a = string2;
        this.b = string3;
        this.c = l8;
        this.d = p8;
    }

    public boolean equals(Object object) {
        boolean bl;
        boolean bl2 = object instanceof r;
        boolean bl3 = bl = false;
        if (bl2) {
            object = (r)object;
            bl3 = bl;
            if (this.a.equals((Object)object.a)) {
                bl3 = bl;
                if (this.b.equals((Object)object.b)) {
                    bl3 = bl;
                    if (this.c == object.c) {
                        bl3 = bl;
                        if (Objects.equals((Object)this.d, (Object)object.d)) {
                            bl3 = true;
                        }
                    }
                }
            }
        }
        return bl3;
    }
}

