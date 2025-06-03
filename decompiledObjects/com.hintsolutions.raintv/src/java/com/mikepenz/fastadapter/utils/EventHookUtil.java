/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.view.View$OnTouchListener
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.recyclerview.widget.RecyclerView$ViewHolder
 *  com.mikepenz.fastadapter.FastAdapter
 *  com.mikepenz.fastadapter.IItem
 *  com.mikepenz.fastadapter.listeners.ClickEventHook
 *  com.mikepenz.fastadapter.listeners.CustomEventHook
 *  com.mikepenz.fastadapter.listeners.LongClickEventHook
 *  com.mikepenz.fastadapter.listeners.TouchEventHook
 *  java.lang.Object
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 */
package com.mikepenz.fastadapter.utils;

import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.IItem;
import com.mikepenz.fastadapter.R;
import com.mikepenz.fastadapter.listeners.ClickEventHook;
import com.mikepenz.fastadapter.listeners.CustomEventHook;
import com.mikepenz.fastadapter.listeners.EventHook;
import com.mikepenz.fastadapter.listeners.LongClickEventHook;
import com.mikepenz.fastadapter.listeners.TouchEventHook;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class EventHookUtil {
    public static <Item extends IItem> void attachToView(@NonNull EventHook<Item> eventHook, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull View view) {
        if (eventHook instanceof ClickEventHook) {
            view.setOnClickListener(new View.OnClickListener(viewHolder, eventHook){
                public final EventHook val$event;
                public final RecyclerView.ViewHolder val$viewHolder;
                {
                    this.val$viewHolder = viewHolder;
                    this.val$event = eventHook;
                }

                public void onClick(View view) {
                    Object object = this.val$viewHolder.itemView.getTag(R.id.fastadapter_item);
                    Object object2 = this.val$viewHolder.itemView.getTag(R.id.fastadapter_item_adapter);
                    if (object instanceof IItem && object2 instanceof FastAdapter) {
                        object = (IItem)object;
                        int n = (object2 = (FastAdapter)object2).getHolderAdapterPosition(this.val$viewHolder);
                        if (n != -1) {
                            ((ClickEventHook)this.val$event).onClick(view, n, (FastAdapter)object2, (IItem)object);
                        }
                    }
                }
            });
        } else if (eventHook instanceof LongClickEventHook) {
            view.setOnLongClickListener(new View.OnLongClickListener(viewHolder, eventHook){
                public final EventHook val$event;
                public final RecyclerView.ViewHolder val$viewHolder;
                {
                    this.val$viewHolder = viewHolder;
                    this.val$event = eventHook;
                }

                public boolean onLongClick(View view) {
                    Object object = this.val$viewHolder.itemView.getTag(R.id.fastadapter_item);
                    Object object2 = this.val$viewHolder.itemView.getTag(R.id.fastadapter_item_adapter);
                    if (object instanceof IItem && object2 instanceof FastAdapter) {
                        object = (IItem)object;
                        int n = (object2 = (FastAdapter)object2).getHolderAdapterPosition(this.val$viewHolder);
                        if (n != -1) {
                            return ((LongClickEventHook)this.val$event).onLongClick(view, n, (FastAdapter)object2, (IItem)object);
                        }
                    }
                    return false;
                }
            });
        } else if (eventHook instanceof TouchEventHook) {
            view.setOnTouchListener(new View.OnTouchListener(viewHolder, eventHook){
                public final EventHook val$event;
                public final RecyclerView.ViewHolder val$viewHolder;
                {
                    this.val$viewHolder = viewHolder;
                    this.val$event = eventHook;
                }

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    Object object = this.val$viewHolder.itemView.getTag(R.id.fastadapter_item);
                    Object object2 = this.val$viewHolder.itemView.getTag(R.id.fastadapter_item_adapter);
                    if (object instanceof IItem && object2 instanceof FastAdapter) {
                        object = (IItem)object;
                        int n = (object2 = (FastAdapter)object2).getHolderAdapterPosition(this.val$viewHolder);
                        if (n != -1) {
                            return ((TouchEventHook)this.val$event).onTouch(view, motionEvent, n, (FastAdapter)object2, (IItem)object);
                        }
                    }
                    return false;
                }
            });
        } else if (eventHook instanceof CustomEventHook) {
            ((CustomEventHook)eventHook).attachEvent(view, viewHolder);
        }
    }

    public static <Item extends IItem> void bind(@NonNull RecyclerView.ViewHolder viewHolder, @Nullable List<EventHook<Item>> iterator) {
        if (iterator == null) {
            return;
        }
        for (EventHook eventHook : iterator) {
            Iterator iterator2 = eventHook.onBind(viewHolder);
            if (iterator2 != null) {
                EventHookUtil.attachToView(eventHook, viewHolder, (View)iterator2);
            }
            if ((iterator2 = eventHook.onBindMany(viewHolder)) == null) continue;
            iterator2 = iterator2.iterator();
            while (iterator2.hasNext()) {
                EventHookUtil.attachToView(eventHook, viewHolder, (View)iterator2.next());
            }
        }
    }

    public static List<View> toList(View ... viewArray) {
        return Arrays.asList((Object[])viewArray);
    }
}

