// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O5;

import w.a;
import java.util.ArrayList;
import android.app.Activity;
import E5.o;

public class A implements o
{
    public final int a;
    public a b;
    public boolean c;
    
    public A() {
        this.a = 240;
        this.c = false;
    }
    
    public void a(final Activity activity, final a b, final b b2) {
        String s;
        if (this.c) {
            s = "A request for permissions is already running, please wait for it to finish before doing another request.";
        }
        else {
            if (activity != null) {
                this.b = b;
                final ArrayList<String> list = new ArrayList<String>();
                list.add("android.permission.POST_NOTIFICATIONS");
                final String[] array = list.toArray(new String[0]);
                if (!this.c) {
                    w.a.l(activity, array, 240);
                    this.c = true;
                }
                return;
            }
            s = "Unable to detect current Android Activity.";
        }
        b2.a(s);
    }
    
    @Override
    public boolean b(int n, final String[] array, final int[] array2) {
        final boolean c = this.c;
        final int n2 = 0;
        if (c && n == 240) {
            final a b = this.b;
            if (b != null) {
                this.c = false;
                n = n2;
                if (array2.length > 0) {
                    n = n2;
                    if (array2[0] == 0) {
                        n = 1;
                    }
                }
                b.a(n);
                return true;
            }
        }
        return false;
    }
    
    public interface a
    {
        void a(final int p0);
    }
}
