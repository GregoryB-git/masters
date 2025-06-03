package androidx.work;

import android.net.Uri;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o2.r;
import o2.s;
import y2.z;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    public UUID f1435a;

    /* renamed from: b, reason: collision with root package name */
    public c f1436b;

    /* renamed from: c, reason: collision with root package name */
    public Executor f1437c;

    /* renamed from: d, reason: collision with root package name */
    public a3.b f1438d;

    /* renamed from: e, reason: collision with root package name */
    public s f1439e;
    public o2.e f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public List<String> f1440a = Collections.emptyList();

        /* renamed from: b, reason: collision with root package name */
        public List<Uri> f1441b = Collections.emptyList();
    }

    public WorkerParameters(UUID uuid, c cVar, List list, ExecutorService executorService, a3.b bVar, r rVar, z zVar) {
        this.f1435a = uuid;
        this.f1436b = cVar;
        new HashSet(list);
        this.f1437c = executorService;
        this.f1438d = bVar;
        this.f1439e = rVar;
        this.f = zVar;
    }
}
