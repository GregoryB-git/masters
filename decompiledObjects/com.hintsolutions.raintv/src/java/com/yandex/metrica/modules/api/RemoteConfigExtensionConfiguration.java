/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 *  java.util.Map
 */
package com.yandex.metrica.modules.api;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.core.api.JsonParser;
import com.yandex.metrica.modules.api.RemoteConfigUpdateListener;
import java.util.List;
import java.util.Map;

public interface RemoteConfigExtensionConfiguration {
    public Map getBlocks();

    public List getFeatures();

    public JsonParser getJsonParser();

    public Converter getProtobufConverter();

    public RemoteConfigUpdateListener getRemoteConfigUpdateListener();
}

