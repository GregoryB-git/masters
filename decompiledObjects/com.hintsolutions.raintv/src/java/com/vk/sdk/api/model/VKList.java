/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  androidx.annotation.NonNull
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.reflect.Constructor
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.ListIterator
 *  java.util.regex.Pattern
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.vk.sdk.api.model.Identifiable;
import com.vk.sdk.api.model.VKApiModel;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class VKList<T extends VKApiModel & Identifiable>
extends VKApiModel
implements List<T> {
    public static final boolean $assertionsDisabled = false;
    public static Parcelable.Creator<VKList> CREATOR = new Parcelable.Creator<VKList>(){

        public VKList createFromParcel(Parcel parcel) {
            return new VKList<T>(parcel);
        }

        public VKList[] newArray(int n) {
            return new VKList[n];
        }
    };
    private static final int NO_COUNT = -1;
    private int count = -1;
    private ArrayList<T> items = new ArrayList();

    public VKList() {
    }

    public VKList(Parcel parcel) {
        int n = parcel.readInt();
        for (int i = 0; i < n; ++i) {
            this.items.add((Object)((VKApiModel)parcel.readParcelable(this.getClass().getClassLoader())));
        }
        this.count = parcel.readInt();
    }

    public VKList(List<? extends T> list) {
        this.items = new ArrayList(list);
    }

    public VKList(JSONArray jSONArray, Parser<T> parser) {
        this.fill(jSONArray, parser);
    }

    public VKList(JSONArray jSONArray, Class<? extends T> clazz) {
        this.fill(jSONArray, clazz);
    }

    public VKList(JSONObject jSONObject, Parser<T> parser) {
        this.fill(jSONObject, parser);
    }

    public VKList(JSONObject jSONObject, Class<? extends T> clazz) {
        this.fill(jSONObject, clazz);
    }

    public void add(int n, T t) {
        this.items.add(n, t);
    }

    public boolean add(T t) {
        return this.items.add(t);
    }

    public void addAfter(int n, T t) {
        int n2 = this.size();
        for (int i = 0; i < n2; ++i) {
            if (((Identifiable)this.get(i)).getId() <= n && i != n2 - 1) {
                continue;
            }
            this.add(i + 1, t);
            break;
        }
    }

    public boolean addAll(int n, @NonNull Collection<? extends T> collection) {
        return this.items.addAll(n, collection);
    }

    public boolean addAll(@NonNull Collection<? extends T> collection) {
        return this.items.addAll(collection);
    }

    public void addBefore(int n, T t) {
        int n2 = this.size();
        for (int i = 0; i < n2; ++i) {
            if (((Identifiable)this.get(i)).getId() <= n && i != n2 - 1) {
                continue;
            }
            this.add(i, t);
            break;
        }
    }

    public void clear() {
        this.items.clear();
    }

    public boolean contains(Object object) {
        return this.items.contains(object);
    }

    public boolean containsAll(@NonNull Collection<?> collection) {
        return this.items.containsAll(collection);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl = this.getClass().equals((Object)object.getClass()) && this.items.equals(object);
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void fill(JSONArray jSONArray, Parser<? extends T> parser) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); ++i) {
                try {
                    VKApiModel vKApiModel = (VKApiModel)parser.parseObject(jSONArray.getJSONObject(i));
                    if (vKApiModel == null) continue;
                    this.items.add((Object)vKApiModel);
                    continue;
                }
                catch (Exception exception) {}
            }
        }
    }

    public void fill(JSONArray jSONArray, Class<? extends T> clazz) {
        this.fill(jSONArray, new ReflectParser<T>(clazz));
    }

    public void fill(JSONObject jSONObject, Parser<? extends T> parser) {
        if (jSONObject != null) {
            this.fill(jSONObject.optJSONArray("items"), parser);
            this.count = jSONObject.optInt("count", this.count);
        }
    }

    public void fill(JSONObject jSONObject, Class<? extends T> clazz) {
        if (jSONObject.has("response")) {
            JSONArray jSONArray = jSONObject.optJSONArray("response");
            if (jSONArray != null) {
                this.fill(jSONArray, clazz);
            } else {
                this.fill(jSONObject.optJSONObject("response"), clazz);
            }
        } else {
            this.fill(jSONObject, new ReflectParser<T>(clazz));
        }
    }

    public T get(int n) {
        return (T)((VKApiModel)this.items.get(n));
    }

    public T getById(int n) {
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()) {
            VKApiModel vKApiModel = (VKApiModel)iterator.next();
            if (((Identifiable)((Object)vKApiModel)).getId() != n) continue;
            return (T)vKApiModel;
        }
        return null;
    }

    public int getCount() {
        int n = this.count;
        if (n == -1) {
            n = this.size();
        }
        return n;
    }

    public int indexOf(Object object) {
        return this.items.indexOf(object);
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    @NonNull
    public Iterator<T> iterator() {
        return this.items.iterator();
    }

    public int lastIndexOf(Object object) {
        return this.items.lastIndexOf(object);
    }

    public ListIterator<T> listIterator() {
        return this.items.listIterator();
    }

    @NonNull
    public ListIterator<T> listIterator(int n) {
        return this.items.listIterator(n);
    }

    @Override
    public VKApiModel parse(JSONObject jSONObject) throws JSONException {
        throw new JSONException("Operation is not supported while class is generic");
    }

    public T remove(int n) {
        return (T)((VKApiModel)this.items.remove(n));
    }

    public boolean remove(Object object) {
        return this.items.remove(object);
    }

    public boolean removeAll(@NonNull Collection<?> collection) {
        return this.items.removeAll(collection);
    }

    public boolean retainAll(@NonNull Collection<?> collection) {
        return this.items.retainAll(collection);
    }

    public VKList<T> search(String object) {
        VKList<Object> vKList = new VKList<Object>();
        Iterator<T> iterator = new Iterator<T>();
        iterator.append("(?i).*\\b");
        iterator.append((String)object);
        iterator.append(".*");
        Pattern pattern = Pattern.compile((String)iterator.toString());
        iterator = this.iterator();
        while (iterator.hasNext()) {
            object = (VKApiModel)iterator.next();
            if (!pattern.matcher((CharSequence)object.toString()).find()) continue;
            vKList.add(object);
        }
        return vKList;
    }

    public T set(int n, T t) {
        return (T)((VKApiModel)this.items.set(n, t));
    }

    public int size() {
        return this.items.size();
    }

    @NonNull
    public List<T> subList(int n, int n2) {
        return this.items.subList(n, n2);
    }

    @NonNull
    public Object[] toArray() {
        return this.items.toArray();
    }

    @NonNull
    public <T1> T1[] toArray(@NonNull T1[] T1Array) {
        return this.items.toArray((Object[])T1Array);
    }

    public void writeToParcel(Parcel parcel, int n) {
        parcel.writeInt(this.items.size());
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()) {
            parcel.writeParcelable((Parcelable)((VKApiModel)iterator.next()), n);
        }
        parcel.writeInt(this.count);
    }

    public static final class ReflectParser<D extends VKApiModel>
    implements Parser<D> {
        private final Class<? extends D> clazz;

        public ReflectParser(Class<? extends D> clazz) {
            this.clazz = clazz;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public D parseObject(JSONObject jSONObject) throws Exception {
            block4: {
                Constructor constructor;
                try {
                    constructor = this.clazz.getConstructor(new Class[]{JSONObject.class});
                    if (constructor == null) break block4;
                }
                catch (Exception exception) {
                    return (D)((VKApiModel)this.clazz.newInstance()).parse(jSONObject);
                }
                VKApiModel vKApiModel = (VKApiModel)constructor.newInstance(new Object[]{jSONObject});
                return (D)vKApiModel;
            }
            return (D)((VKApiModel)this.clazz.newInstance()).parse(jSONObject);
        }
    }
}

