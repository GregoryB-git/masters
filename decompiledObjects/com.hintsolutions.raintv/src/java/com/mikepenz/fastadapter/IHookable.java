/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mikepenz.fastadapter.IItem
 *  java.lang.Object
 *  java.util.List
 */
package com.mikepenz.fastadapter;

import com.mikepenz.fastadapter.IItem;
import com.mikepenz.fastadapter.listeners.EventHook;
import java.util.List;

public interface IHookable<Item extends IItem> {
    public List<EventHook<Item>> getEventHooks();
}

