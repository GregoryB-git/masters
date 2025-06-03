/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.r;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.u;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class X5
extends r {
    public final d p;

    public X5(d d8) {
        this.p = d8;
    }

    @Override
    public final s s(String object, f3 object2, List list) {
        object.hashCode();
        int n8 = object.hashCode();
        int n9 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 1570616835: {
                if (!object.equals((Object)"setEventName")) break;
                n9 = 5;
                break;
            }
            case 920706790: {
                if (!object.equals((Object)"setParamValue")) break;
                n9 = 4;
                break;
            }
            case 700587132: {
                if (!object.equals((Object)"getParams")) break;
                n9 = 3;
                break;
            }
            case 146575578: {
                if (!object.equals((Object)"getParamValue")) break;
                n9 = 2;
                break;
            }
            case 45521504: {
                if (!object.equals((Object)"getTimestamp")) break;
                n9 = 1;
                break;
            }
            case 21624207: {
                if (!object.equals((Object)"getEventName")) break;
                n9 = 0;
            }
        }
        switch (n9) {
            default: {
                return super.s((String)object, (f3)object2, list);
            }
            case 5: {
                C2.g("setEventName", 1, list);
                object = object2.b((s)list.get(0));
                if (!s.d.equals(object) && !s.e.equals(object)) {
                    this.p.d().f(object.g());
                    return new u(object.g());
                }
                throw new IllegalArgumentException("Illegal event name");
            }
            case 4: {
                C2.g("setParamValue", 2, list);
                object = object2.b((s)list.get(0)).g();
                object2 = object2.b((s)list.get(1));
                this.p.d().d((String)object, C2.d((s)object2));
                return object2;
            }
            case 3: {
                C2.g("getParams", 0, list);
                object = this.p.d().g();
                object2 = new r();
                for (String string2 : object.keySet()) {
                    object2.a(string2, b4.b(object.get((Object)string2)));
                }
                return object2;
            }
            case 2: {
                C2.g("getParamValue", 1, list);
                object = object2.b((s)list.get(0)).g();
                return b4.b(this.p.d().b((String)object));
            }
            case 1: {
                C2.g("getTimestamp", 0, list);
                return new k((double)this.p.d().a());
            }
            case 0: 
        }
        C2.g("getEventName", 0, list);
        return new u(this.p.d().e());
    }
}

