/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.sdk.api.model.VKApiApplicationContent;
import com.vk.sdk.api.model.VKApiAudio;
import com.vk.sdk.api.model.VKApiDocument;
import com.vk.sdk.api.model.VKApiLink;
import com.vk.sdk.api.model.VKApiNote;
import com.vk.sdk.api.model.VKApiPhoto;
import com.vk.sdk.api.model.VKApiPhotoAlbum;
import com.vk.sdk.api.model.VKApiPoll;
import com.vk.sdk.api.model.VKApiPost;
import com.vk.sdk.api.model.VKApiPostedPhoto;
import com.vk.sdk.api.model.VKApiVideo;
import com.vk.sdk.api.model.VKApiWikiPage;
import com.vk.sdk.api.model.VKList;
import com.vk.sdk.util.VKStringJoiner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class VKAttachments
extends VKList<VKApiAttachment> {
    public static Parcelable.Creator<VKAttachments> CREATOR = new Parcelable.Creator<VKAttachments>(){

        public VKAttachments createFromParcel(Parcel parcel) {
            return new VKAttachments(parcel);
        }

        public VKAttachments[] newArray(int n4) {
            return new VKAttachments[n4];
        }
    };
    public static final String TYPE_ALBUM = "album";
    public static final String TYPE_APP = "app";
    public static final String TYPE_AUDIO = "audio";
    public static final String TYPE_DOC = "doc";
    public static final String TYPE_LINK = "link";
    public static final String TYPE_NOTE = "note";
    public static final String TYPE_PHOTO = "photo";
    public static final String TYPE_POLL = "poll";
    public static final String TYPE_POST = "wall";
    public static final String TYPE_POSTED_PHOTO = "posted_photo";
    public static final String TYPE_VIDEO = "video";
    public static final String TYPE_WIKI_PAGE = "page";
    private final VKList.Parser<VKApiAttachment> parser = new VKList.Parser<VKApiAttachment>(this){
        public final VKAttachments this$0;
        {
            this.this$0 = vKAttachments;
        }

        public VKApiAttachment parseObject(JSONObject jSONObject) throws Exception {
            String string = jSONObject.optString("type");
            if ("photo".equals((Object)string)) {
                return new VKApiPhoto().parse(jSONObject.getJSONObject("photo"));
            }
            if ("video".equals((Object)string)) {
                return new VKApiVideo().parse(jSONObject.getJSONObject("video"));
            }
            if ("audio".equals((Object)string)) {
                return new VKApiAudio().parse(jSONObject.getJSONObject("audio"));
            }
            if ("doc".equals((Object)string)) {
                return new VKApiDocument().parse(jSONObject.getJSONObject("doc"));
            }
            if ("wall".equals((Object)string)) {
                return new VKApiPost().parse(jSONObject.getJSONObject("wall"));
            }
            if ("posted_photo".equals((Object)string)) {
                return new VKApiPostedPhoto().parse(jSONObject.getJSONObject("posted_photo"));
            }
            if ("link".equals((Object)string)) {
                return new VKApiLink().parse(jSONObject.getJSONObject("link"));
            }
            if ("note".equals((Object)string)) {
                return new VKApiNote().parse(jSONObject.getJSONObject("note"));
            }
            if ("app".equals((Object)string)) {
                return new VKApiApplicationContent().parse(jSONObject.getJSONObject("app"));
            }
            if ("poll".equals((Object)string)) {
                return new VKApiPoll().parse(jSONObject.getJSONObject("poll"));
            }
            if ("page".equals((Object)string)) {
                return new VKApiWikiPage().parse(jSONObject.getJSONObject("page"));
            }
            if ("album".equals((Object)string)) {
                return new VKApiPhotoAlbum().parse(jSONObject.getJSONObject("album"));
            }
            return null;
        }
    };

    public VKAttachments() {
    }

    public VKAttachments(Parcel parcel) {
        int n4 = parcel.readInt();
        for (int j = 0; j < n4; ++j) {
            String string = parcel.readString();
            if (TYPE_PHOTO.equals((Object)string)) {
                this.add(parcel.readParcelable(VKApiPhoto.class.getClassLoader()));
                continue;
            }
            if (TYPE_VIDEO.equals((Object)string)) {
                this.add(parcel.readParcelable(VKApiVideo.class.getClassLoader()));
                continue;
            }
            if (TYPE_AUDIO.equals((Object)string)) {
                this.add(parcel.readParcelable(VKApiAudio.class.getClassLoader()));
                continue;
            }
            if (TYPE_DOC.equals((Object)string)) {
                this.add(parcel.readParcelable(VKApiDocument.class.getClassLoader()));
                continue;
            }
            if (TYPE_POST.equals((Object)string)) {
                this.add(parcel.readParcelable(VKApiPost.class.getClassLoader()));
                continue;
            }
            if (TYPE_POSTED_PHOTO.equals((Object)string)) {
                this.add(parcel.readParcelable(VKApiPostedPhoto.class.getClassLoader()));
                continue;
            }
            if (TYPE_LINK.equals((Object)string)) {
                this.add(parcel.readParcelable(VKApiLink.class.getClassLoader()));
                continue;
            }
            if (TYPE_NOTE.equals((Object)string)) {
                this.add(parcel.readParcelable(VKApiNote.class.getClassLoader()));
                continue;
            }
            if (TYPE_APP.equals((Object)string)) {
                this.add(parcel.readParcelable(VKApiApplicationContent.class.getClassLoader()));
                continue;
            }
            if (TYPE_POLL.equals((Object)string)) {
                this.add(parcel.readParcelable(VKApiPoll.class.getClassLoader()));
                continue;
            }
            if (TYPE_WIKI_PAGE.equals((Object)string)) {
                this.add(parcel.readParcelable(VKApiWikiPage.class.getClassLoader()));
                continue;
            }
            if (!TYPE_ALBUM.equals((Object)string)) continue;
            this.add(parcel.readParcelable(VKApiPhotoAlbum.class.getClassLoader()));
        }
    }

    public VKAttachments(List<? extends VKApiAttachment> list) {
        super(list);
    }

    public VKAttachments(JSONArray jSONArray) {
        this.fill(jSONArray);
    }

    public VKAttachments(JSONObject jSONObject) {
        this.fill(jSONObject);
    }

    public VKAttachments(VKApiAttachment ... vKApiAttachmentArray) {
        super(Arrays.asList((Object[])vKApiAttachmentArray));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public void fill(JSONArray jSONArray) {
        super.fill(jSONArray, this.parser);
    }

    public void fill(JSONObject jSONObject) {
        super.fill(jSONObject, this.parser);
    }

    public String toAttachmentsString() {
        ArrayList arrayList = new ArrayList();
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            arrayList.add((Object)(iterator.next()).toAttachmentString());
        }
        return VKStringJoiner.join(arrayList, ",");
    }

    @Override
    public void writeToParcel(Parcel parcel, int n4) {
        parcel.writeInt(this.size());
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            VKApiAttachment vKApiAttachment = iterator.next();
            parcel.writeString(vKApiAttachment.getType());
            parcel.writeParcelable((Parcelable)vKApiAttachment, 0);
        }
    }
}

