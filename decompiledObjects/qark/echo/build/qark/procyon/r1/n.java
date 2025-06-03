// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package r1;

import android.util.Log;
import V5.t;
import java.util.concurrent.Executor;
import E.q;
import p6.m;
import Y5.b;
import org.jetbrains.annotations.NotNull;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.DeletionRequest;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import android.adservices.measurement.MeasurementManager;
import android.view.InputEvent;
import android.net.Uri;
import X5.d;
import kotlin.jvm.internal.g;

public abstract class n
{
    public static final b a;
    
    static {
        a = new b(null);
    }
    
    public abstract Object a(final r1.a p0, final d p1);
    
    public abstract Object b(final d p0);
    
    public abstract Object c(final Uri p0, final InputEvent p1, final d p2);
    
    public abstract Object d(final Uri p0, final d p1);
    
    public abstract Object e(final o p0, final d p1);
    
    public abstract Object f(final p p0, final d p1);
    
    public static final class a extends n
    {
        public final MeasurementManager b;
        
        public a(final MeasurementManager b) {
            Intrinsics.checkNotNullParameter(b, "mMeasurementManager");
            this.b = b;
        }
        
        public a(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            final Object systemService = context.getSystemService(i.a());
            Intrinsics.checkNotNullExpressionValue(systemService, "context.getSystemService\u2026:class.java\n            )");
            this(j.a(systemService));
        }
        
        public static final /* synthetic */ MeasurementManager j(final a a) {
            return a.b;
        }
        
        @Override
        public Object a(@NotNull final r1.a a, @NotNull final d d) {
            final m m = new m(Y5.b.b(d), 1);
            m.z();
            h.a(j(this), this.k(a), (Executor)new r1.m(), q.a(m));
            final Object w = m.w();
            if (w == Y5.b.c()) {
                Z5.h.c(d);
            }
            if (w == Y5.b.c()) {
                return w;
            }
            return t.a;
        }
        
        @Override
        public Object b(@NotNull final d d) {
            final m m = new m(Y5.b.b(d), 1);
            m.z();
            k.a(j(this), (Executor)new r1.m(), q.a(m));
            final Object w = m.w();
            if (w == Y5.b.c()) {
                Z5.h.c(d);
            }
            return w;
        }
        
        @Override
        public Object c(@NotNull final Uri uri, final InputEvent inputEvent, @NotNull final d d) {
            final m m = new m(Y5.b.b(d), 1);
            m.z();
            f.a(j(this), uri, inputEvent, (Executor)new r1.m(), q.a(m));
            final Object w = m.w();
            if (w == Y5.b.c()) {
                Z5.h.c(d);
            }
            if (w == Y5.b.c()) {
                return w;
            }
            return t.a;
        }
        
        @Override
        public Object d(@NotNull final Uri uri, @NotNull final d d) {
            final m m = new m(Y5.b.b(d), 1);
            m.z();
            l.a(j(this), uri, (Executor)new r1.m(), q.a(m));
            final Object w = m.w();
            if (w == Y5.b.c()) {
                Z5.h.c(d);
            }
            if (w == Y5.b.c()) {
                return w;
            }
            return t.a;
        }
        
        @Override
        public Object e(@NotNull final o o, @NotNull final d d) {
            final m m = new m(Y5.b.b(d), 1);
            m.z();
            r1.g.a(j(this), this.l(o), (Executor)new r1.m(), q.a(m));
            final Object w = m.w();
            if (w == Y5.b.c()) {
                Z5.h.c(d);
            }
            if (w == Y5.b.c()) {
                return w;
            }
            return t.a;
        }
        
        @Override
        public Object f(@NotNull final p p2, @NotNull final d d) {
            final m m = new m(Y5.b.b(d), 1);
            m.z();
            c.a(j(this), this.m(p2), (Executor)new r1.m(), q.a(m));
            final Object w = m.w();
            if (w == Y5.b.c()) {
                Z5.h.c(d);
            }
            if (w == Y5.b.c()) {
                return w;
            }
            return t.a;
        }
        
        public final DeletionRequest k(final r1.a a) {
            r1.b.a();
            throw null;
        }
        
        public final WebSourceRegistrationRequest l(final o o) {
            r1.d.a();
            throw null;
        }
        
        public final WebTriggerRegistrationRequest m(final p p) {
            e.a();
            throw null;
        }
    }
    
    public static final class b
    {
        public final n a(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            final StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            final o1.a a = o1.a.a;
            sb.append(a.a());
            Log.d("MeasurementManager", sb.toString());
            if (a.a() >= 5) {
                return new a(context);
            }
            return null;
        }
    }
}
