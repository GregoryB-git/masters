/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.CopyOnWriteArrayList
 *  kotlin.TuplesKt
 *  kotlin.collections.CollectionsKt
 *  kotlin.collections.MapsKt
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Th;
import com.yandex.metrica.impl.ob.Xh;
import com.yandex.metrica.impl.ob.ad;
import com.yandex.metrica.impl.ob.bd;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.dd;
import com.yandex.metrica.modules.api.ModuleEntryPoint;
import com.yandex.metrica.modules.api.ModuleFullRemoteConfig;
import com.yandex.metrica.modules.api.RemoteConfigExtensionConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class cd
implements dd,
Xh {
    private final CopyOnWriteArrayList<ModuleEntryPoint> a = new CopyOnWriteArrayList();

    @Override
    @NotNull
    public Map<String, Integer> a() {
        Object object = this.a;
        ArrayList arrayList = new ArrayList();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = ((ModuleEntryPoint)iterator.next()).getRemoteConfigExtensionConfiguration();
            if (object == null || (object = object.getBlocks()) == null || (object = MapsKt.toList((Map)object)) == null) {
                object = CollectionsKt.emptyList();
            }
            CollectionsKt.a((Collection)arrayList, (Iterable)object);
        }
        return MapsKt.a((List)arrayList);
    }

    @Override
    public void a(@NotNull Th th, @Nullable ci ci2) {
    }

    @Override
    public void a(@NotNull ci object) {
        bd bd2 = new bd((ci)object);
        for (Object object2 : this.a) {
            object = object2.getRemoteConfigExtensionConfiguration();
            if (object == null) continue;
            object2 = bd2.a(object2.getIdentifier());
            object.getRemoteConfigUpdateListener().onRemoteConfigUpdated((ModuleFullRemoteConfig)object2);
        }
    }

    @Override
    @NotNull
    public List<String> b() {
        Object object = this.a;
        ArrayList arrayList = new ArrayList();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            object = ((ModuleEntryPoint)iterator.next()).getRemoteConfigExtensionConfiguration();
            if (object == null || (object = object.getFeatures()) == null) {
                object = CollectionsKt.emptyList();
            }
            CollectionsKt.a((Collection)arrayList, (Iterable)object);
        }
        return arrayList;
    }

    @NotNull
    public Map<String, ad> c() {
        Object object = this.a;
        ArrayList arrayList = new ArrayList();
        for (ModuleEntryPoint moduleEntryPoint : object) {
            object = moduleEntryPoint.getRemoteConfigExtensionConfiguration();
            object = object != null ? TuplesKt.to((Object)moduleEntryPoint.getIdentifier(), (Object)new ad((RemoteConfigExtensionConfiguration)object)) : null;
            if (object == null) continue;
            arrayList.add(object);
        }
        return MapsKt.a((List)arrayList);
    }
}

