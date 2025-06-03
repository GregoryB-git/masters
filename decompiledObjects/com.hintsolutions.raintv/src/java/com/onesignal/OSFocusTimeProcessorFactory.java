/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.onesignal.FocusTimeController$FocusTimeProcessorAttributed
 *  com.onesignal.FocusTimeController$FocusTimeProcessorUnattributed
 *  com.onesignal.influence.domain.OSInfluence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 */
package com.onesignal;

import com.onesignal.FocusTimeController;
import com.onesignal.influence.domain.OSInfluence;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class OSFocusTimeProcessorFactory {
    private final HashMap<String, FocusTimeController.FocusTimeProcessorBase> focusTimeProcessors;

    public OSFocusTimeProcessorFactory() {
        HashMap hashMap;
        this.focusTimeProcessors = hashMap = new HashMap();
        hashMap.put((Object)FocusTimeController.FocusTimeProcessorUnattributed.class.getName(), (Object)new /* Unavailable Anonymous Inner Class!! */);
        hashMap.put((Object)FocusTimeController.FocusTimeProcessorAttributed.class.getName(), (Object)new /* Unavailable Anonymous Inner Class!! */);
    }

    private FocusTimeController.FocusTimeProcessorBase getAttributedProcessor() {
        return (FocusTimeController.FocusTimeProcessorBase)this.focusTimeProcessors.get((Object)FocusTimeController.FocusTimeProcessorAttributed.class.getName());
    }

    private FocusTimeController.FocusTimeProcessorBase getUnattributedProcessor() {
        return (FocusTimeController.FocusTimeProcessorBase)this.focusTimeProcessors.get((Object)FocusTimeController.FocusTimeProcessorUnattributed.class.getName());
    }

    public FocusTimeController.FocusTimeProcessorBase getTimeProcessorSaved() {
        FocusTimeController.FocusTimeProcessorBase focusTimeProcessorBase = this.getAttributedProcessor();
        Iterator iterator = focusTimeProcessorBase.getInfluences().iterator();
        while (iterator.hasNext()) {
            if (!((OSInfluence)iterator.next()).getInfluenceType().isAttributed()) continue;
            return focusTimeProcessorBase;
        }
        return this.getUnattributedProcessor();
    }

    public FocusTimeController.FocusTimeProcessorBase getTimeProcessorWithInfluences(List<OSInfluence> object) {
        boolean bl;
        block1: {
            object = object.iterator();
            while (object.hasNext()) {
                if (!((OSInfluence)object.next()).getInfluenceType().isAttributed()) continue;
                bl = true;
                break block1;
            }
            bl = false;
        }
        object = bl ? this.getAttributedProcessor() : this.getUnattributedProcessor();
        return object;
    }
}

