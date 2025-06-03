package t8;

import java.util.Comparator;

/* loaded from: classes.dex */
public interface h<K, V> {

    public enum a {
        RED,
        BLACK
    }

    h<K, V> a();

    h<K, V> b(K k10, V v10, Comparator<K> comparator);

    h<K, V> c(K k10, Comparator<K> comparator);

    h d(a aVar, j jVar, j jVar2);

    boolean e();

    h<K, V> f();

    h<K, V> g();

    K getKey();

    V getValue();

    h<K, V> h();

    boolean isEmpty();

    int size();
}
