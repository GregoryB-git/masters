/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package O5;

import E5.o;
import O5.b;
import android.app.Activity;
import java.util.ArrayList;

public class A
implements o {
    public final int a = 240;
    public a b;
    public boolean c = false;

    /*
     * Enabled aggressive block sorting
     */
    public void a(Activity object, a arrstring, b b8) {
        block6 : {
            block5 : {
                block4 : {
                    if (!this.c) break block4;
                    object = "A request for permissions is already running, please wait for it to finish before doing another request.";
                    break block5;
                }
                if (object != null) break block6;
                object = "Unable to detect current Android Activity.";
            }
            b8.a((String)object);
            return;
        }
        this.b = arrstring;
        arrstring = new String[]();
        arrstring.add((Object)"android.permission.POST_NOTIFICATIONS");
        arrstring = (String[])arrstring.toArray((Object[])new String[0]);
        if (!this.c) {
            w.a.l((Activity)object, arrstring, 240);
            this.c = true;
        }
    }

    @Override
    public boolean b(int n8, String[] object, int[] arrn) {
        boolean bl = this.c;
        int n9 = 0;
        if (bl && n8 == 240 && (object = this.b) != null) {
            this.c = false;
            n8 = n9;
            if (arrn.length > 0) {
                n8 = n9;
                if (arrn[0] == 0) {
                    n8 = 1;
                }
            }
            object.a(n8);
            return true;
        }
        return false;
    }

    public static interface a {
        public void a(int var1);
    }

}

