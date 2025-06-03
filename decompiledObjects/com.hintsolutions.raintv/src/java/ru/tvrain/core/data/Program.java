/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Date
 */
package ru.tvrain.core.data;

import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Date;
import ru.tvrain.core.utils.DateHelper;

public class Program
implements Serializable {
    public static final int ID_NEWS = 1018;
    public String age_restricted;
    public int category_id;
    public String detail_img;
    public String detail_text;
    @Expose
    @SerializedName(value="id")
    public Integer id;
    public int is_cool;
    public int is_favorite;
    @Expose
    @SerializedName(value="name")
    public String name;
    public NextAir next_air;
    public String preview_img;
    public String preview_text;
    public String tv_img;

    public boolean equals(Object object) {
        boolean bl = object != null && object instanceof Program && ((Program)object).id.equals((Object)this.id);
        return bl;
    }

    public String getImage() {
        String string2 = TextUtils.isEmpty((CharSequence)this.detail_img) ? this.tv_img : this.detail_img;
        return string2;
    }

    public String getPreview() {
        String string2 = TextUtils.isEmpty((CharSequence)this.tv_img) ? this.preview_img : this.tv_img;
        return string2;
    }

    public boolean isFavorite() {
        boolean bl = this.is_favorite > 0;
        return bl;
    }

    public void setFavorite(boolean bl) {
        this.is_favorite = bl ? 1 : 0;
    }

    public class NextAir
    implements Serializable {
        public String name;
        public String release_name;
        public String start_date;
        public final Program this$0;

        public NextAir(Program program) {
            this.this$0 = program;
        }

        public Date getStartDate() {
            return DateHelper.parse(this.start_date);
        }
    }
}

