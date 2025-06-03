// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.util.Iterator;
import android.util.Pair;
import java.util.List;
import com.google.android.gms.internal.measurement.Y3;
import java.util.Collection;
import com.google.android.gms.internal.measurement.a2;
import java.util.ArrayList;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import A2.n;
import com.google.android.gms.internal.measurement.Y1;

public final class f6
{
    public Y1 a;
    public Long b;
    public long c;
    public final /* synthetic */ b6 d;
    
    public f6(final b6 d) {
        this.d = d;
    }
    
    public final Y1 a(String s, final Y1 a) {
        final String b0 = a.b0();
        final List c0 = a.c0();
        this.d.o();
        final Long b2 = (Long)N5.e0(a, "_eid");
        final boolean b3 = b2 != null;
        String s2;
        R2.a2 i;
        if (b3 && b0.equals("_ep")) {
            n.i(b2);
            this.d.o();
            s2 = (String)N5.e0(a, "_en");
            if (TextUtils.isEmpty((CharSequence)s2)) {
                this.d.j().I().b("Extra parameter without an event name. eventId", b2);
                return null;
            }
            Label_0222: {
                if (this.a == null || this.b == null || b2 != (long)this.b) {
                    final Pair l = this.d.q().L(s, b2);
                    if (l != null) {
                        final Object first = l.first;
                        if (first != null) {
                            this.a = (Y1)first;
                            this.c = (long)l.second;
                            this.d.o();
                            this.b = (Long)N5.e0(this.a, "_eid");
                            break Label_0222;
                        }
                    }
                    this.d.j().I().c("Extra parameter without existing main event. eventName, eventId", s2, b2);
                    return null;
                }
            }
            final long c2 = this.c - 1L;
            this.c = c2;
            if (c2 <= 0L) {
                final p q = this.d.q();
                q.n();
                q.j().K().b("Clearing complex main event info. appId", s);
                try {
                    q.B().execSQL("delete from main_event_params where app_id=?", (Object[])new String[] { s });
                }
                catch (SQLiteException ex) {
                    q.j().G().b("Error clearing complex main event", ex);
                }
            }
            else {
                this.d.q().j0(s, b2, this.c, this.a);
            }
            final List<? extends a2> list = new ArrayList<a2>();
            for (final a2 a2 : this.a.c0()) {
                this.d.o();
                if (N5.G(a, a2.c0()) == null) {
                    list.add(a2);
                }
            }
            if (!list.isEmpty()) {
                list.addAll(c0);
                return (Y1)((Y3.b)((Y1.a)a.x()).E(s2).J().D(list)).p();
            }
            i = this.d.j().I();
            s = "No unique parameters in main event. eventName";
        }
        else {
            s2 = b0;
            List<? extends a2> list = (List<? extends a2>)c0;
            if (!b3) {
                return (Y1)((Y3.b)((Y1.a)a.x()).E(s2).J().D(list)).p();
            }
            this.b = b2;
            this.a = a;
            this.d.o();
            Object value = 0L;
            final Object e0 = N5.e0(a, "_epc");
            if (e0 != null) {
                value = e0;
            }
            final long longValue = (long)value;
            this.c = longValue;
            if (longValue > 0L) {
                this.d.q().j0(s, (Long)n.i(b2), this.c, a);
                list = (List<? extends a2>)c0;
                s2 = b0;
                return (Y1)((Y3.b)((Y1.a)a.x()).E(s2).J().D(list)).p();
            }
            final R2.a2 j = this.d.j().I();
            s = "Complex event with zero extra param count. eventName";
            s2 = b0;
            i = j;
        }
        i.b(s, s2);
        List<? extends a2> list = (List<? extends a2>)c0;
        return (Y1)((Y3.b)((Y1.a)a.x()).E(s2).J().D(list)).p();
    }
}
