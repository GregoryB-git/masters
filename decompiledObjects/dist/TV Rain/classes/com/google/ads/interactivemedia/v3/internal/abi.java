package com.google.ads.interactivemedia.v3.internal;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class abi
{
  public static final yp A;
  public static final yp B;
  public static final yn<yd> C;
  public static final yp D;
  public static final yp E = new acf();
  private static final yn<Class> F;
  private static final yn<BitSet> G;
  private static final yn<Boolean> H;
  private static final yn<Number> I;
  private static final yn<Number> J;
  private static final yn<Number> K;
  private static final yn<AtomicInteger> L;
  private static final yn<AtomicBoolean> M;
  private static final yn<AtomicIntegerArray> N;
  private static final yn<Number> O;
  private static final yn<Character> P;
  private static final yn<String> Q;
  private static final yn<StringBuilder> R;
  private static final yn<StringBuffer> S;
  private static final yn<URL> T;
  private static final yn<URI> U;
  private static final yn<InetAddress> V;
  private static final yn<UUID> W;
  private static final yn<Currency> X;
  private static final yn<Calendar> Y;
  private static final yn<Locale> Z;
  public static final yp a;
  public static final yp b;
  public static final yn<Boolean> c;
  public static final yp d;
  public static final yp e;
  public static final yp f;
  public static final yp g;
  public static final yp h;
  public static final yp i;
  public static final yp j;
  public static final yn<Number> k;
  public static final yn<Number> l;
  public static final yn<Number> m;
  public static final yp n;
  public static final yp o;
  public static final yn<BigDecimal> p;
  public static final yn<BigInteger> q;
  public static final yp r;
  public static final yp s;
  public static final yp t;
  public static final yp u;
  public static final yp v;
  public static final yp w;
  public static final yp x;
  public static final yp y;
  public static final yp z;
  
  static
  {
    Object localObject = new abh().nullSafe();
    F = (yn)localObject;
    a = a(Class.class, (yn)localObject);
    localObject = new abu().nullSafe();
    G = (yn)localObject;
    b = a(BitSet.class, (yn)localObject);
    localObject = new acg();
    H = (yn)localObject;
    c = new aco();
    d = a(Boolean.TYPE, Boolean.class, (yn)localObject);
    localObject = new acn();
    I = (yn)localObject;
    e = a(Byte.TYPE, Byte.class, (yn)localObject);
    localObject = new acq();
    J = (yn)localObject;
    f = a(Short.TYPE, Short.class, (yn)localObject);
    localObject = new acp();
    K = (yn)localObject;
    g = a(Integer.TYPE, Integer.class, (yn)localObject);
    localObject = new acs().nullSafe();
    L = (yn)localObject;
    h = a(AtomicInteger.class, (yn)localObject);
    localObject = new acr().nullSafe();
    M = (yn)localObject;
    i = a(AtomicBoolean.class, (yn)localObject);
    localObject = new abk().nullSafe();
    N = (yn)localObject;
    j = a(AtomicIntegerArray.class, (yn)localObject);
    k = new abj();
    l = new abm();
    m = new abl();
    localObject = new abo();
    O = (yn)localObject;
    n = a(Number.class, (yn)localObject);
    localObject = new abn();
    P = (yn)localObject;
    o = a(Character.TYPE, Character.class, (yn)localObject);
    localObject = new abq();
    Q = (yn)localObject;
    p = new abp();
    q = new abs();
    r = a(String.class, (yn)localObject);
    localObject = new abr();
    R = (yn)localObject;
    s = a(StringBuilder.class, (yn)localObject);
    localObject = new abt();
    S = (yn)localObject;
    t = a(StringBuffer.class, (yn)localObject);
    localObject = new abw();
    T = (yn)localObject;
    u = a(URL.class, (yn)localObject);
    localObject = new abv();
    U = (yn)localObject;
    v = a(URI.class, (yn)localObject);
    localObject = new aby();
    V = (yn)localObject;
    w = b(InetAddress.class, (yn)localObject);
    localObject = new abx();
    W = (yn)localObject;
    x = a(UUID.class, (yn)localObject);
    localObject = new aca().nullSafe();
    X = (yn)localObject;
    y = a(Currency.class, (yn)localObject);
    z = new abz();
    localObject = new acb();
    Y = (yn)localObject;
    A = new acj(Calendar.class, GregorianCalendar.class, (yn)localObject);
    localObject = new ace();
    Z = (yn)localObject;
    B = a(Locale.class, (yn)localObject);
    localObject = new acd();
    C = (yn)localObject;
    D = b(yd.class, (yn)localObject);
  }
  
  public static <TT> yp a(acx<TT> paramacx, yn<TT> paramyn)
  {
    return new aci(paramacx, paramyn);
  }
  
  public static <TT> yp a(Class<TT> paramClass, yn<TT> paramyn)
  {
    return new ach(paramClass, paramyn);
  }
  
  public static <TT> yp a(Class<TT> paramClass1, Class<TT> paramClass2, yn<? super TT> paramyn)
  {
    return new ack(paramClass1, paramClass2, paramyn);
  }
  
  private static <T1> yp b(Class<T1> paramClass, yn<T1> paramyn)
  {
    return new acm(paramClass, paramyn);
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.abi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */