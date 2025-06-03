/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  java.util.Objects
 */
package c1;

import c1.t;
import d0.q;
import g1.b;
import i1.d;
import j1.a;
import java.util.List;
import java.util.Objects;
import k1.g;

public final class h
implements t.a {
    @Override
    public boolean a(q object) {
        object = object.n;
        if (!(Objects.equals((Object)object, (Object)"text/x-ssa") || Objects.equals((Object)object, (Object)"text/vtt") || Objects.equals((Object)object, (Object)"application/x-mp4-vtt") || Objects.equals((Object)object, (Object)"application/x-subrip") || Objects.equals((Object)object, (Object)"application/x-quicktime-tx3g") || Objects.equals((Object)object, (Object)"application/pgs") || Objects.equals((Object)object, (Object)"application/dvbsubs") || Objects.equals((Object)object, (Object)"application/ttml+xml"))) {
            return false;
        }
        return true;
    }

    @Override
    public t b(q q8) {
        String string2 = q8.n;
        if (string2 != null) {
            int n8 = string2.hashCode();
            int n9 = -1;
            switch (n8) {
                default: {
                    break;
                }
                case 1693976202: {
                    if (!string2.equals((Object)"application/ttml+xml")) break;
                    n9 = 7;
                    break;
                }
                case 1668750253: {
                    if (!string2.equals((Object)"application/x-subrip")) break;
                    n9 = 6;
                    break;
                }
                case 822864842: {
                    if (!string2.equals((Object)"text/x-ssa")) break;
                    n9 = 5;
                    break;
                }
                case 691401887: {
                    if (!string2.equals((Object)"application/x-quicktime-tx3g")) break;
                    n9 = 4;
                    break;
                }
                case -1004728940: {
                    if (!string2.equals((Object)"text/vtt")) break;
                    n9 = 3;
                    break;
                }
                case -1026075066: {
                    if (!string2.equals((Object)"application/x-mp4-vtt")) break;
                    n9 = 2;
                    break;
                }
                case -1248334819: {
                    if (!string2.equals((Object)"application/pgs")) break;
                    n9 = 1;
                    break;
                }
                case -1351681404: {
                    if (!string2.equals((Object)"application/dvbsubs")) break;
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    break;
                }
                case 7: {
                    return new d();
                }
                case 6: {
                    return new h1.a();
                }
                case 5: {
                    return new b(q8.q);
                }
                case 4: {
                    return new a(q8.q);
                }
                case 3: {
                    return new g();
                }
                case 2: {
                    return new k1.a();
                }
                case 1: {
                    return new f1.a();
                }
                case 0: {
                    return new e1.a(q8.q);
                }
            }
        }
        q8 = new StringBuilder();
        q8.append("Unsupported MIME type: ");
        q8.append(string2);
        throw new IllegalArgumentException(q8.toString());
    }

    @Override
    public int c(q object) {
        object = object.n;
        if (object != null) {
            int n8 = object.hashCode();
            int n9 = -1;
            switch (n8) {
                default: {
                    break;
                }
                case 1693976202: {
                    if (!object.equals((Object)"application/ttml+xml")) break;
                    n9 = 7;
                    break;
                }
                case 1668750253: {
                    if (!object.equals((Object)"application/x-subrip")) break;
                    n9 = 6;
                    break;
                }
                case 822864842: {
                    if (!object.equals((Object)"text/x-ssa")) break;
                    n9 = 5;
                    break;
                }
                case 691401887: {
                    if (!object.equals((Object)"application/x-quicktime-tx3g")) break;
                    n9 = 4;
                    break;
                }
                case -1004728940: {
                    if (!object.equals((Object)"text/vtt")) break;
                    n9 = 3;
                    break;
                }
                case -1026075066: {
                    if (!object.equals((Object)"application/x-mp4-vtt")) break;
                    n9 = 2;
                    break;
                }
                case -1248334819: {
                    if (!object.equals((Object)"application/pgs")) break;
                    n9 = 1;
                    break;
                }
                case -1351681404: {
                    if (!object.equals((Object)"application/dvbsubs")) break;
                    n9 = 0;
                }
            }
            switch (n9) {
                default: {
                    break;
                }
                case 5: 
                case 6: 
                case 7: {
                    return 1;
                }
                case 4: {
                    return 2;
                }
                case 3: {
                    return 1;
                }
                case 0: 
                case 1: 
                case 2: {
                    return 2;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported MIME type: ");
        stringBuilder.append((String)object);
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}

