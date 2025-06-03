/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.api.model.VKAttachments;
import com.vk.sdk.api.model.VKList;
import org.json.JSONException;
import org.json.JSONObject;

public class VKApiPoll
extends VKAttachments.VKApiAttachment {
    public static Parcelable.Creator<VKApiPoll> CREATOR = new Parcelable.Creator<VKApiPoll>(){

        public VKApiPoll createFromParcel(Parcel parcel) {
            return new VKApiPoll(parcel);
        }

        public VKApiPoll[] newArray(int n4) {
            return new VKApiPoll[n4];
        }
    };
    public int answer_id;
    public VKList<Answer> answers;
    public long created;
    public int id;
    public int owner_id;
    public String question;
    public int votes;

    public VKApiPoll() {
    }

    public VKApiPoll(Parcel parcel) {
        this.id = parcel.readInt();
        this.owner_id = parcel.readInt();
        this.created = parcel.readLong();
        this.question = parcel.readString();
        this.votes = parcel.readInt();
        this.answer_id = parcel.readInt();
        this.answers = (VKList)parcel.readParcelable(VKList.class.getClassLoader());
    }

    public VKApiPoll(JSONObject jSONObject) throws JSONException {
        this.parse(jSONObject);
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getType() {
        return "poll";
    }

    @Override
    public VKApiPoll parse(JSONObject jSONObject) {
        this.id = jSONObject.optInt("id");
        this.owner_id = jSONObject.optInt("owner_id");
        this.created = jSONObject.optLong("created");
        this.question = jSONObject.optString("question");
        this.votes = jSONObject.optInt("votes");
        this.answer_id = jSONObject.optInt("answer_id");
        this.answers = new VKList<Answer>(jSONObject.optJSONArray("answers"), Answer.class);
        return this;
    }

    @Override
    public CharSequence toAttachmentString() {
        return null;
    }

    public void writeToParcel(Parcel parcel, int n4) {
        parcel.writeInt(this.id);
        parcel.writeInt(this.owner_id);
        parcel.writeLong(this.created);
        parcel.writeString(this.question);
        parcel.writeInt(this.votes);
        parcel.writeInt(this.answer_id);
        parcel.writeParcelable(this.answers, n4);
    }
}

