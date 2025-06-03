/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 */
package ru.tvrain.core.data.eagle;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ru.tvrain.core.data.eagle.Data;
import ru.tvrain.core.data.eagle.RecordFile;

public class EagleResponse {
    @Expose
    @SerializedName(value="data")
    public Data data;
    @Expose
    @SerializedName(value="errors")
    public List<String> errors = new ArrayList();
    @Expose
    @SerializedName(value="status")
    public Integer status;
    @Expose
    @SerializedName(value="time")
    public String time;
    @Expose
    @SerializedName(value="version")
    public String version;

    public String getDefaultLink() {
        try {
            String string2 = ((RecordFile)this.getFiles().get((int)0)).url;
            return string2;
        }
        catch (Exception exception) {
            return null;
        }
    }

    public long getDuration() {
        try {
            long l4 = this.data.record.duration;
            return l4;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return 0L;
        }
    }

    public List<RecordFile> getFiles() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.addAll(this.data.record.recordFiles);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        try {
            Comparator<RecordFile> comparator = new Comparator<RecordFile>(this){
                public final EagleResponse this$0;
                {
                    this.this$0 = eagleResponse;
                }

                public int compare(RecordFile recordFile, RecordFile recordFile2) {
                    return recordFile.bitrate.compareTo(recordFile2.bitrate);
                }
            };
            Collections.sort((List)arrayList, (Comparator)comparator);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return arrayList;
    }
}

