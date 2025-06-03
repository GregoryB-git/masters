/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package ru.tvrain.core.data;

import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import ru.tvrain.core.data.OnesignalTags;

public class UserInfo {
    @Expose
    @SerializedName(value="avatar")
    public String avatar;
    @Expose
    @SerializedName(value="birthday")
    public String birthday;
    @Expose
    @SerializedName(value="city")
    public String city;
    @Expose
    @SerializedName(value="createtime")
    public String createtime;
    @Expose
    @SerializedName(value="dimension")
    public String dimension;
    @Expose
    @SerializedName(value="email")
    public String email;
    @Expose
    @SerializedName(value="favorites_count")
    public Integer favoritesCount;
    @Expose
    @SerializedName(value="firstname")
    public String firstname;
    @Expose
    @SerializedName(value="id")
    public Integer id;
    @Expose
    @SerializedName(value="lastname")
    public String lastname;
    @Expose
    @SerializedName(value="lastvisit")
    public String lastvisit;
    @Expose
    @SerializedName(value="linked_accounts")
    public List<LinkedAccountsRecord> linkedAccounts;
    @Expose
    @SerializedName(value="live_available")
    public Boolean liveAvailable;
    @Expose
    @SerializedName(value="no_ads")
    public Boolean no_ads;
    @Expose
    @SerializedName(value="on_air")
    public String onAir;
    @Expose
    @SerializedName(value="onesignal_tags")
    public OnesignalTags onesignal_tags;
    @Expose
    @SerializedName(value="phone")
    public String phone;
    @Expose
    @SerializedName(value="promo_available")
    public Boolean promoAvailable;
    @Expose
    @SerializedName(value="quickauth")
    public Boolean quickauth;
    @Expose
    @SerializedName(value="recieve_mailing")
    public String recieveMailing;
    private ArrayList<String> socialUrls;
    @Expose
    @SerializedName(value="vip")
    public Integer vip;

    public String getName() {
        boolean bl = TextUtils.isEmpty((CharSequence)this.firstname);
        String string2 = "";
        if (!bl) {
            string2 = z2.t("");
            string2.append(this.firstname);
            string2 = string2.toString();
        }
        String string3 = string2;
        if (!TextUtils.isEmpty((CharSequence)this.lastname)) {
            string2 = z2.u(string2, " ");
            string2.append(this.lastname);
            string3 = string2.toString();
        }
        return string3;
    }

    public boolean getNoAds() {
        Boolean bl = this.no_ads;
        if (bl == null) {
            return false;
        }
        return bl;
    }

    public boolean getOnAir() {
        return this.onAir.equals((Object)"open");
    }

    public ArrayList<String> getSocialUrls() {
        return this.socialUrls;
    }

    public void setSocialUrls(ArrayList<String> arrayList) {
        this.socialUrls = arrayList;
    }

    public class LinkedAccountsRecord {
        public String name;
        public final UserInfo this$0;

        public LinkedAccountsRecord(UserInfo userInfo) {
            this.this$0 = userInfo;
        }
    }
}

