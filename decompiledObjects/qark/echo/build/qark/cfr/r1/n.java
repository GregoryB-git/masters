/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.adservices.measurement.DeletionRequest
 *  android.adservices.measurement.MeasurementManager
 *  android.adservices.measurement.WebSourceRegistrationRequest
 *  android.adservices.measurement.WebTriggerRegistrationRequest
 *  android.content.Context
 *  android.net.Uri
 *  android.util.Log
 *  android.view.InputEvent
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package r1;

import E.q;
import V5.t;
import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r1.c;
import r1.d;
import r1.e;
import r1.f;
import r1.g;
import r1.h;
import r1.i;
import r1.j;
import r1.k;
import r1.l;
import r1.m;
import r1.o;
import r1.p;

public abstract class n {
    public static final b a = new b(null);

    public abstract Object a(r1.a var1, X5.d var2);

    public abstract Object b(X5.d var1);

    public abstract Object c(Uri var1, InputEvent var2, X5.d var3);

    public abstract Object d(Uri var1, X5.d var2);

    public abstract Object e(o var1, X5.d var2);

    public abstract Object f(p var1, X5.d var2);

    public static final class a
    extends n {
        public final MeasurementManager b;

        public a(MeasurementManager measurementManager) {
            Intrinsics.checkNotNullParameter((Object)measurementManager, "mMeasurementManager");
            this.b = measurementManager;
        }

        public a(Context object) {
            Intrinsics.checkNotNullParameter(object, "context");
            object = object.getSystemService(i.a());
            Intrinsics.checkNotNullExpressionValue(object, "context.getSystemService\u2026:class.java\n            )");
            this(j.a(object));
        }

        @Override
        public Object a(@NotNull r1.a object, @NotNull X5.d d8) {
            p6.m m8 = new p6.m(Y5.b.b(d8), 1);
            m8.z();
            h.a(this.b, this.k((r1.a)object), new m(), q.a(m8));
            object = m8.w();
            if (object == Y5.b.c()) {
                Z5.h.c(d8);
            }
            if (object == Y5.b.c()) {
                return object;
            }
            return t.a;
        }

        @Override
        public Object b(@NotNull X5.d d8) {
            Object object = new p6.m(Y5.b.b(d8), 1);
            object.z();
            k.a(this.b, new m(), q.a((X5.d)object));
            object = object.w();
            if (object == Y5.b.c()) {
                Z5.h.c(d8);
            }
            return object;
        }

        @Override
        public Object c(@NotNull Uri object, InputEvent inputEvent, @NotNull X5.d d8) {
            p6.m m8 = new p6.m(Y5.b.b(d8), 1);
            m8.z();
            f.a(this.b, (Uri)object, inputEvent, new m(), q.a(m8));
            object = m8.w();
            if (object == Y5.b.c()) {
                Z5.h.c(d8);
            }
            if (object == Y5.b.c()) {
                return object;
            }
            return t.a;
        }

        @Override
        public Object d(@NotNull Uri object, @NotNull X5.d d8) {
            p6.m m8 = new p6.m(Y5.b.b(d8), 1);
            m8.z();
            l.a(this.b, (Uri)object, new m(), q.a(m8));
            object = m8.w();
            if (object == Y5.b.c()) {
                Z5.h.c(d8);
            }
            if (object == Y5.b.c()) {
                return object;
            }
            return t.a;
        }

        @Override
        public Object e(@NotNull o object, @NotNull X5.d d8) {
            p6.m m8 = new p6.m(Y5.b.b(d8), 1);
            m8.z();
            g.a(this.b, this.l((o)object), new m(), q.a(m8));
            object = m8.w();
            if (object == Y5.b.c()) {
                Z5.h.c(d8);
            }
            if (object == Y5.b.c()) {
                return object;
            }
            return t.a;
        }

        @Override
        public Object f(@NotNull p object, @NotNull X5.d d8) {
            p6.m m8 = new p6.m(Y5.b.b(d8), 1);
            m8.z();
            c.a(this.b, this.m((p)object), new m(), q.a(m8));
            object = m8.w();
            if (object == Y5.b.c()) {
                Z5.h.c(d8);
            }
            if (object == Y5.b.c()) {
                return object;
            }
            return t.a;
        }

        public final DeletionRequest k(r1.a a8) {
            r1.b.a();
            throw null;
        }

        public final WebSourceRegistrationRequest l(o o8) {
            d.a();
            throw null;
        }

        public final WebTriggerRegistrationRequest m(p p8) {
            e.a();
            throw null;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g g8) {
            this();
        }

        public final n a(Context context) {
            Intrinsics.checkNotNullParameter((Object)context, "context");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AdServicesInfo.version=");
            o1.a a8 = o1.a.a;
            stringBuilder.append(a8.a());
            Log.d((String)"MeasurementManager", (String)stringBuilder.toString());
            if (a8.a() >= 5) {
                return new a(context);
            }
            return null;
        }
    }

}

