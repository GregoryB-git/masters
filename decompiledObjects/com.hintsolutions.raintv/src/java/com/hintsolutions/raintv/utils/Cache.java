/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 *  ru.tvrain.core.Consts
 *  ru.tvrain.core.data.InAppSubscription
 *  ru.tvrain.core.simplediskcache.SimpleDiskCache
 */
package com.hintsolutions.raintv.utils;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.tvrain.core.Consts;
import ru.tvrain.core.data.InAppSubscription;
import ru.tvrain.core.simplediskcache.SimpleDiskCache;

public class Cache
implements Consts {
    private ArrayList<InAppSubscription> cachedInApps;
    private SimpleDiskCache diskCache;
    private int notificationsCount;

    public Cache(SimpleDiskCache simpleDiskCache) {
        this.diskCache = simpleDiskCache;
    }

    public void clear() {
        try {
            this.diskCache.clear();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public boolean getBoolean(String string, boolean bl) {
        string = this.getString(string);
        string.getClass();
        if (!string.equals((Object)"true")) {
            if (string.equals((Object)"false")) {
                bl = false;
            }
        } else {
            bl = true;
        }
        return bl;
    }

    public ArrayList<InAppSubscription> getCachedInApps() {
        return this.cachedInApps;
    }

    public int getInt(String string) {
        int n;
        try {
            n = Integer.parseInt((String)this.diskCache.getString(string).getString());
        }
        catch (Exception exception) {
            n = 0;
        }
        return n;
    }

    public String getLatestVideoPath() {
        return this.getString("video_name");
    }

    public List<String> getList(String string) {
        String string2 = this.getString(string);
        if (string2 != null && string2.length() != 0) {
            int n;
            string = new ArrayList();
            try {
                JSONObject jSONObject = new JSONObject(string2);
                string2 = jSONObject.getJSONArray("items");
                n = 0;
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
            while (true) {
                if (n < string2.length()) {
                    string.add((Object)string2.getString(n));
                    ++n;
                    continue;
                }
                break;
            }
            return string;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public long getLong(String string, long l) {
        try {
            long l2 = Long.parseLong((String)this.diskCache.getString(string).getString());
            return l2;
        }
        catch (Exception exception) {
            return l;
        }
    }

    public int getNotificationsCount() {
        return this.notificationsCount;
    }

    public String getString(String string) {
        try {
            string = this.diskCache.getString(string).getString();
        }
        catch (Exception exception) {
            string = "";
        }
        return string;
    }

    public void putBoolean(String string, boolean bl) {
        if (string != null) {
            SimpleDiskCache simpleDiskCache = this.diskCache;
            String string2 = bl ? "true" : "false";
            try {
                simpleDiskCache.put(string, string2);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public void putInt(String string, Integer n) {
        if (string != null) {
            try {
                this.diskCache.put(string, String.valueOf((Object)n));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public void putLong(String string, long l) {
        if (string != null) {
            try {
                this.diskCache.put(string, String.valueOf((long)l));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public void putString(String string, String string2) {
        if (string != null) {
            try {
                this.diskCache.put(string, string2);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public void setCachedInApps(ArrayList<InAppSubscription> arrayList) {
        this.cachedInApps = arrayList;
    }

    public void setLatestVideoPath(String string) {
        this.putString("video_name", string);
    }

    public void setList(String string, List list) {
        JSONArray jSONArray = new JSONArray();
        list = list.iterator();
        while (list.hasNext()) {
            jSONArray.put(list.next());
        }
        list = new JSONObject();
        try {
            list.put("items", (Object)jSONArray);
        }
        catch (JSONException jSONException) {
            jSONException.printStackTrace();
        }
        this.putString(string, list.toString());
    }

    public void setNotificationsCount(int n) {
        this.notificationsCount = n;
    }
}

