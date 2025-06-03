/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Set
 */
package Y1;

import W5.I;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.text.i;

public abstract class z {
    public static final a a;
    public static final Set b;
    public static final String c;

    static {
        Object object = new a(null);
        a = object;
        b = ((a)object).b();
        object = z.class.toString();
        Intrinsics.checkNotNullExpressionValue(object, "LoginManager::class.java.toString()");
        c = object;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final Set b() {
            return I.f("ads_management", "create_event", "rsvp_event");
        }

        public final boolean c(String string2) {
            boolean bl;
            block2 : {
                block3 : {
                    boolean bl2;
                    bl = bl2 = false;
                    if (string2 == null) break block2;
                    if (i.s(string2, "publish", false, 2, null) || i.s(string2, "manage", false, 2, null)) break block3;
                    bl = bl2;
                    if (!b.contains((Object)string2)) break block2;
                }
                bl = true;
            }
            return bl;
        }
    }

}

