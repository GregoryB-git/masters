package androidx.work.impl;

import android.content.Context;
import ec.i;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p1.b;
import p1.e;
import p1.k;
import p2.d0;
import p2.e0;
import p2.f0;
import p2.g0;
import r1.a;
import t1.c;
import x2.c;
import x2.g;
import x2.h;
import x2.j;
import x2.k;
import x2.n;
import x2.o;
import x2.q;
import x2.r;
import x2.t;
import x2.u;
import x2.x;
import x2.y;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: m, reason: collision with root package name */
    public volatile u f1464m;

    /* renamed from: n, reason: collision with root package name */
    public volatile c f1465n;

    /* renamed from: o, reason: collision with root package name */
    public volatile y f1466o;

    /* renamed from: p, reason: collision with root package name */
    public volatile k f1467p;

    /* renamed from: q, reason: collision with root package name */
    public volatile o f1468q;

    /* renamed from: r, reason: collision with root package name */
    public volatile r f1469r;

    /* renamed from: s, reason: collision with root package name */
    public volatile g f1470s;

    public class a extends k.a {
        public a() {
        }

        @Override // p1.k.a
        public final void a(u1.c cVar) {
            cVar.m("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            cVar.m("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            cVar.m("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            cVar.m("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            cVar.m("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            cVar.m("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            cVar.m("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            cVar.m("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            cVar.m("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            cVar.m("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            cVar.m("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            cVar.m("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            cVar.m("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            cVar.m("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            cVar.m("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
        }

        @Override // p1.k.a
        public final k.b b(u1.c cVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new a.C0204a(1, 1, "work_spec_id", "TEXT", null, true));
            hashMap.put("prerequisite_id", new a.C0204a(2, 1, "prerequisite_id", "TEXT", null, true));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new a.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new a.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            r1.a aVar = new r1.a("Dependency", hashMap, hashSet, hashSet2);
            r1.a a10 = r1.a.a(cVar, "Dependency");
            if (!aVar.equals(a10)) {
                return new k.b("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + aVar + "\n Found:\n" + a10, false);
            }
            HashMap hashMap2 = new HashMap(30);
            hashMap2.put("id", new a.C0204a(1, 1, "id", "TEXT", null, true));
            hashMap2.put("state", new a.C0204a(0, 1, "state", "INTEGER", null, true));
            hashMap2.put("worker_class_name", new a.C0204a(0, 1, "worker_class_name", "TEXT", null, true));
            hashMap2.put("input_merger_class_name", new a.C0204a(0, 1, "input_merger_class_name", "TEXT", null, true));
            hashMap2.put("input", new a.C0204a(0, 1, "input", "BLOB", null, true));
            hashMap2.put("output", new a.C0204a(0, 1, "output", "BLOB", null, true));
            hashMap2.put("initial_delay", new a.C0204a(0, 1, "initial_delay", "INTEGER", null, true));
            hashMap2.put("interval_duration", new a.C0204a(0, 1, "interval_duration", "INTEGER", null, true));
            hashMap2.put("flex_duration", new a.C0204a(0, 1, "flex_duration", "INTEGER", null, true));
            hashMap2.put("run_attempt_count", new a.C0204a(0, 1, "run_attempt_count", "INTEGER", null, true));
            hashMap2.put("backoff_policy", new a.C0204a(0, 1, "backoff_policy", "INTEGER", null, true));
            hashMap2.put("backoff_delay_duration", new a.C0204a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
            hashMap2.put("last_enqueue_time", new a.C0204a(0, 1, "last_enqueue_time", "INTEGER", "-1", true));
            hashMap2.put("minimum_retention_duration", new a.C0204a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
            hashMap2.put("schedule_requested_at", new a.C0204a(0, 1, "schedule_requested_at", "INTEGER", null, true));
            hashMap2.put("run_in_foreground", new a.C0204a(0, 1, "run_in_foreground", "INTEGER", null, true));
            hashMap2.put("out_of_quota_policy", new a.C0204a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
            hashMap2.put("period_count", new a.C0204a(0, 1, "period_count", "INTEGER", "0", true));
            hashMap2.put("generation", new a.C0204a(0, 1, "generation", "INTEGER", "0", true));
            hashMap2.put("next_schedule_time_override", new a.C0204a(0, 1, "next_schedule_time_override", "INTEGER", "9223372036854775807", true));
            hashMap2.put("next_schedule_time_override_generation", new a.C0204a(0, 1, "next_schedule_time_override_generation", "INTEGER", "0", true));
            hashMap2.put("stop_reason", new a.C0204a(0, 1, "stop_reason", "INTEGER", "-256", true));
            hashMap2.put("required_network_type", new a.C0204a(0, 1, "required_network_type", "INTEGER", null, true));
            hashMap2.put("requires_charging", new a.C0204a(0, 1, "requires_charging", "INTEGER", null, true));
            hashMap2.put("requires_device_idle", new a.C0204a(0, 1, "requires_device_idle", "INTEGER", null, true));
            hashMap2.put("requires_battery_not_low", new a.C0204a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
            hashMap2.put("requires_storage_not_low", new a.C0204a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
            hashMap2.put("trigger_content_update_delay", new a.C0204a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
            hashMap2.put("trigger_max_content_delay", new a.C0204a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
            hashMap2.put("content_uri_triggers", new a.C0204a(0, 1, "content_uri_triggers", "BLOB", null, true));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new a.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new a.d("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            r1.a aVar2 = new r1.a("WorkSpec", hashMap2, hashSet3, hashSet4);
            r1.a a11 = r1.a.a(cVar, "WorkSpec");
            if (!aVar2.equals(a11)) {
                return new k.b("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + aVar2 + "\n Found:\n" + a11, false);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new a.C0204a(1, 1, "tag", "TEXT", null, true));
            hashMap3.put("work_spec_id", new a.C0204a(2, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new a.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            r1.a aVar3 = new r1.a("WorkTag", hashMap3, hashSet5, hashSet6);
            r1.a a12 = r1.a.a(cVar, "WorkTag");
            if (!aVar3.equals(a12)) {
                return new k.b("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + aVar3 + "\n Found:\n" + a12, false);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new a.C0204a(1, 1, "work_spec_id", "TEXT", null, true));
            hashMap4.put("generation", new a.C0204a(2, 1, "generation", "INTEGER", "0", true));
            hashMap4.put("system_id", new a.C0204a(0, 1, "system_id", "INTEGER", null, true));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            r1.a aVar4 = new r1.a("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            r1.a a13 = r1.a.a(cVar, "SystemIdInfo");
            if (!aVar4.equals(a13)) {
                return new k.b("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + aVar4 + "\n Found:\n" + a13, false);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new a.C0204a(1, 1, "name", "TEXT", null, true));
            hashMap5.put("work_spec_id", new a.C0204a(2, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new a.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            r1.a aVar5 = new r1.a("WorkName", hashMap5, hashSet8, hashSet9);
            r1.a a14 = r1.a.a(cVar, "WorkName");
            if (!aVar5.equals(a14)) {
                return new k.b("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + aVar5 + "\n Found:\n" + a14, false);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new a.C0204a(1, 1, "work_spec_id", "TEXT", null, true));
            hashMap6.put("progress", new a.C0204a(0, 1, "progress", "BLOB", null, true));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            r1.a aVar6 = new r1.a("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            r1.a a15 = r1.a.a(cVar, "WorkProgress");
            if (!aVar6.equals(a15)) {
                return new k.b("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + aVar6 + "\n Found:\n" + a15, false);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put(Constants.KEY, new a.C0204a(1, 1, Constants.KEY, "TEXT", null, true));
            hashMap7.put("long_value", new a.C0204a(0, 1, "long_value", "INTEGER", null, false));
            r1.a aVar7 = new r1.a("Preference", hashMap7, new HashSet(0), new HashSet(0));
            r1.a a16 = r1.a.a(cVar, "Preference");
            if (aVar7.equals(a16)) {
                return new k.b(null, true);
            }
            return new k.b("Preference(androidx.work.impl.model.Preference).\n Expected:\n" + aVar7 + "\n Found:\n" + a16, false);
        }
    }

    @Override // p1.j
    public final e d() {
        return new e(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // p1.j
    public final t1.c e(b bVar) {
        p1.k kVar = new p1.k(bVar, new a());
        Context context = bVar.f12750a;
        i.e(context, "context");
        return bVar.f12752c.c(new c.b(context, bVar.f12751b, kVar, false, false));
    }

    @Override // p1.j
    public final List f(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new d0(0), new e0(0), new f0(), new g0(), new d0(1), new e0(1));
    }

    @Override // p1.j
    public final Set<Class<? extends q1.a>> h() {
        return new HashSet();
    }

    @Override // p1.j
    public final Map<Class<?>, List<Class<?>>> i() {
        HashMap hashMap = new HashMap();
        hashMap.put(t.class, Collections.emptyList());
        hashMap.put(x2.b.class, Collections.emptyList());
        hashMap.put(x.class, Collections.emptyList());
        hashMap.put(j.class, Collections.emptyList());
        hashMap.put(n.class, Collections.emptyList());
        hashMap.put(q.class, Collections.emptyList());
        hashMap.put(x2.e.class, Collections.emptyList());
        hashMap.put(h.class, Collections.emptyList());
        return hashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final x2.b p() {
        x2.c cVar;
        if (this.f1465n != null) {
            return this.f1465n;
        }
        synchronized (this) {
            if (this.f1465n == null) {
                this.f1465n = new x2.c(this);
            }
            cVar = this.f1465n;
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final x2.e q() {
        g gVar;
        if (this.f1470s != null) {
            return this.f1470s;
        }
        synchronized (this) {
            if (this.f1470s == null) {
                this.f1470s = new g(this);
            }
            gVar = this.f1470s;
        }
        return gVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final j r() {
        x2.k kVar;
        if (this.f1467p != null) {
            return this.f1467p;
        }
        synchronized (this) {
            if (this.f1467p == null) {
                this.f1467p = new x2.k(this);
            }
            kVar = this.f1467p;
        }
        return kVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final n s() {
        o oVar;
        if (this.f1468q != null) {
            return this.f1468q;
        }
        synchronized (this) {
            if (this.f1468q == null) {
                this.f1468q = new o(this);
            }
            oVar = this.f1468q;
        }
        return oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final q t() {
        r rVar;
        if (this.f1469r != null) {
            return this.f1469r;
        }
        synchronized (this) {
            if (this.f1469r == null) {
                this.f1469r = new r(this);
            }
            rVar = this.f1469r;
        }
        return rVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final t u() {
        u uVar;
        if (this.f1464m != null) {
            return this.f1464m;
        }
        synchronized (this) {
            if (this.f1464m == null) {
                this.f1464m = new u(this);
            }
            uVar = this.f1464m;
        }
        return uVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final x v() {
        y yVar;
        if (this.f1466o != null) {
            return this.f1466o;
        }
        synchronized (this) {
            if (this.f1466o == null) {
                this.f1466o = new y(this);
            }
            yVar = this.f1466o;
        }
        return yVar;
    }
}
