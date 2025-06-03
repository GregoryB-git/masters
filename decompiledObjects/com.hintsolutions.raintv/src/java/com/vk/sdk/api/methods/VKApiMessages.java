/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.json.JSONObject
 */
package com.vk.sdk.api.methods;

import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKParser;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.methods.VKApiBase;
import com.vk.sdk.api.model.VKApiGetDialogResponse;
import com.vk.sdk.api.model.VKApiGetMessagesResponse;
import org.json.JSONObject;

public class VKApiMessages
extends VKApiBase {
    public VKRequest get() {
        return this.get(VKParameters.from("count", "10"));
    }

    public VKRequest get(VKParameters vKParameters) {
        return this.prepareRequest("get", vKParameters, new VKParser(this){
            public final VKApiMessages this$0;
            {
                this.this$0 = vKApiMessages;
            }

            @Override
            public Object createModel(JSONObject jSONObject) {
                return new VKApiGetMessagesResponse(jSONObject);
            }
        });
    }

    public VKRequest getDialogs() {
        return this.getDialogs(VKParameters.from("count", "5"));
    }

    public VKRequest getDialogs(VKParameters vKParameters) {
        return this.prepareRequest("getDialogs", vKParameters, new VKParser(this){
            public final VKApiMessages this$0;
            {
                this.this$0 = vKApiMessages;
            }

            @Override
            public Object createModel(JSONObject jSONObject) {
                return new VKApiGetDialogResponse(jSONObject);
            }
        });
    }

    @Override
    public String getMethodsGroup() {
        return "messages";
    }
}

