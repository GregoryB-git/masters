package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import dc.p;
import ec.s;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.d0;
import r0.d;
import r0.d.a;
import sb.q;
import wb.c;
import x6.b;

public final class SharedPreferencesPlugin
  implements FlutterPlugin, SharedPreferencesAsyncApi
{
  private Context context;
  private SharedPreferencesListEncoder listEncoder = new ListEncoder();
  
  public SharedPreferencesPlugin() {}
  
  public SharedPreferencesPlugin(SharedPreferencesListEncoder paramSharedPreferencesListEncoder)
  {
    this();
  }
  
  private final Object dataStoreSetString(String paramString1, final String paramString2, ub.e<? super rb.h> parame)
  {
    d.a locala = b.u0(paramString1);
    paramString1 = context;
    if (paramString1 != null)
    {
      paramString1 = r0.e.a(SharedPreferencesPluginKt.access$getSharedPreferencesDataStore(paramString1), new wb.i(locala, paramString2)
      {
        public int label;
        
        public final ub.e<rb.h> create(Object paramAnonymousObject, ub.e<?> paramAnonymouse)
        {
          paramAnonymouse = new 2($stringKey, paramString2, paramAnonymouse);
          L$0 = paramAnonymousObject;
          return paramAnonymouse;
        }
        
        public final Object invoke(r0.a paramAnonymousa, ub.e<? super rb.h> paramAnonymouse)
        {
          return ((2)create(paramAnonymousa, paramAnonymouse)).invokeSuspend(rb.h.a);
        }
        
        public final Object invokeSuspend(Object paramAnonymousObject)
        {
          vb.a locala = vb.a.a;
          if (label == 0)
          {
            rb.f.b(paramAnonymousObject);
            ((r0.a)L$0).d($stringKey, paramString2);
            return rb.h.a;
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      }, parame);
      if (paramString1 == vb.a.a) {
        return paramString1;
      }
      return rb.h.a;
    }
    ec.i.i("context");
    throw null;
  }
  
  private final Object getPrefs(List<String> paramList, ub.e<? super Map<String, ? extends Object>> parame)
  {
    Object localObject1;
    if ((parame instanceof getPrefs.1))
    {
      localObject1 = (getPrefs.1)parame;
      i = label;
      if ((i & 0x80000000) != 0)
      {
        label = (i + Integer.MIN_VALUE);
        parame = (ub.e<? super Map<String, ? extends Object>>)localObject1;
        break label50;
      }
    }
    parame = new c(parame)
    {
      public Object L$0;
      public Object L$1;
      public Object L$2;
      public Object L$3;
      public Object L$4;
      public int label;
      
      public final Object invokeSuspend(Object paramAnonymousObject)
      {
        result = paramAnonymousObject;
        label |= 0x80000000;
        return SharedPreferencesPlugin.access$getPrefs(this$0, null, this);
      }
    };
    label50:
    Object localObject2 = result;
    vb.a locala = vb.a.a;
    int i = label;
    d.a locala1;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          locala1 = (d.a)L$4;
          localObject1 = (Iterator)L$3;
          localObject3 = (Map)L$2;
          localObject4 = (Set)L$1;
          localObject5 = (SharedPreferencesPlugin)L$0;
          rb.f.b(localObject2);
          localObject6 = localObject2;
          break label391;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      paramList = (Map)L$2;
      localObject7 = (Set)L$1;
      localObject1 = (SharedPreferencesPlugin)L$0;
      rb.f.b(localObject2);
    }
    else
    {
      rb.f.b(localObject2);
      if (paramList != null) {
        paramList = q.x(paramList);
      } else {
        paramList = null;
      }
      localObject7 = paramList;
      paramList = new LinkedHashMap();
      L$0 = this;
      L$1 = localObject7;
      L$2 = paramList;
      label = 1;
      localObject2 = readAllKeys(parame);
      if (localObject2 == locala) {
        return locala;
      }
      localObject1 = this;
    }
    Object localObject3 = (Set)localObject2;
    localObject2 = paramList;
    if (localObject3 != null)
    {
      Object localObject8 = ((Iterable)localObject3).iterator();
      localObject2 = localObject7;
      localObject7 = localObject1;
      ub.e<? super Map<String, ? extends Object>> locale = parame;
      while (((Iterator)localObject8).hasNext())
      {
        locala1 = (d.a)((Iterator)localObject8).next();
        L$0 = localObject7;
        L$1 = localObject2;
        L$2 = paramList;
        L$3 = localObject8;
        L$4 = locala1;
        label = 2;
        Object localObject9 = ((SharedPreferencesPlugin)localObject7).getValueByKey(locala1, locale);
        parame = locale;
        localObject1 = localObject8;
        localObject3 = paramList;
        localObject4 = localObject2;
        localObject5 = localObject7;
        localObject6 = localObject9;
        if (localObject9 == locala) {
          return locala;
        }
        label391:
        locale = parame;
        localObject8 = localObject1;
        paramList = (List<String>)localObject3;
        localObject2 = localObject4;
        localObject7 = localObject5;
        if (((SharedPreferencesPlugin)localObject5).preferencesFilter(a, localObject6, (Set)localObject4))
        {
          localObject6 = ((SharedPreferencesPlugin)localObject5).transformPref(localObject6);
          locale = parame;
          localObject8 = localObject1;
          paramList = (List<String>)localObject3;
          localObject2 = localObject4;
          localObject7 = localObject5;
          if (localObject6 != null)
          {
            ((Map)localObject3).put(a, localObject6);
            locale = parame;
            localObject8 = localObject1;
            paramList = (List<String>)localObject3;
            localObject2 = localObject4;
            localObject7 = localObject5;
          }
        }
      }
      localObject2 = paramList;
    }
    return localObject2;
  }
  
  private final Object getValueByKey(final d.a<?> parama, ub.e<Object> parame)
  {
    Context localContext = context;
    if (localContext != null) {
      b.V(new qc.e()
      {
        public Object collect(qc.f paramAnonymousf, ub.e paramAnonymouse)
        {
          paramAnonymousf = $this_unsafeTransform$inlined.collect(new qc.f()
          {
            public final Object emit(Object paramAnonymous2Object, ub.e paramAnonymous2e)
            {
              if ((paramAnonymous2e instanceof 1))
              {
                localObject1 = (1)paramAnonymous2e;
                i = label;
                if ((i & 0x80000000) != 0)
                {
                  label = (i + Integer.MIN_VALUE);
                  paramAnonymous2e = (ub.e)localObject1;
                  break label50;
                }
              }
              paramAnonymous2e = new c(paramAnonymous2e)
              {
                public Object L$0;
                public int label;
                
                public final Object invokeSuspend(Object paramAnonymous3Object)
                {
                  result = paramAnonymous3Object;
                  label |= 0x80000000;
                  return this$0.emit(null, this);
                }
              };
              label50:
              Object localObject2 = result;
              Object localObject1 = vb.a.a;
              int i = label;
              if (i != 0)
              {
                if (i == 1) {
                  rb.f.b(localObject2);
                } else {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
              }
              else
              {
                rb.f.b(localObject2);
                localObject2 = $this_unsafeFlow;
                paramAnonymous2Object = ((d)paramAnonymous2Object).b($key$inlined);
                label = 1;
                if (((qc.f)localObject2).emit(paramAnonymous2Object, paramAnonymous2e) == localObject1) {
                  return localObject1;
                }
              }
              return rb.h.a;
            }
          }, paramAnonymouse);
          if (paramAnonymousf == vb.a.a) {
            return paramAnonymousf;
          }
          return rb.h.a;
        }
      }, parame);
    }
    ec.i.i("context");
    throw null;
  }
  
  private final boolean preferencesFilter(String paramString, Object paramObject, Set<String> paramSet)
  {
    if (paramSet == null)
    {
      boolean bool;
      if ((!(paramObject instanceof Boolean)) && (!(paramObject instanceof Long)) && (!(paramObject instanceof String)) && (!(paramObject instanceof Double))) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    return paramSet.contains(paramString);
  }
  
  private final Object readAllKeys(ub.e<? super Set<? extends d.a<?>>> parame)
  {
    Context localContext = context;
    if (localContext != null) {
      b.V(new qc.e()
      {
        public Object collect(qc.f paramAnonymousf, ub.e paramAnonymouse)
        {
          paramAnonymousf = $this_unsafeTransform$inlined.collect(new qc.f()
          {
            public final Object emit(Object paramAnonymous2Object, ub.e paramAnonymous2e)
            {
              if ((paramAnonymous2e instanceof 1))
              {
                localObject1 = (1)paramAnonymous2e;
                i = label;
                if ((i & 0x80000000) != 0)
                {
                  label = (i + Integer.MIN_VALUE);
                  paramAnonymous2e = (ub.e)localObject1;
                  break label50;
                }
              }
              paramAnonymous2e = new c(paramAnonymous2e)
              {
                public Object L$0;
                public int label;
                
                public final Object invokeSuspend(Object paramAnonymous3Object)
                {
                  result = paramAnonymous3Object;
                  label |= 0x80000000;
                  return this$0.emit(null, this);
                }
              };
              label50:
              Object localObject2 = result;
              Object localObject1 = vb.a.a;
              int i = label;
              if (i != 0)
              {
                if (i == 1) {
                  rb.f.b(localObject2);
                } else {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
              }
              else
              {
                rb.f.b(localObject2);
                localObject2 = $this_unsafeFlow;
                paramAnonymous2Object = ((d)paramAnonymous2Object).a().keySet();
                label = 1;
                if (((qc.f)localObject2).emit(paramAnonymous2Object, paramAnonymous2e) == localObject1) {
                  return localObject1;
                }
              }
              return rb.h.a;
            }
          }, paramAnonymouse);
          if (paramAnonymousf == vb.a.a) {
            return paramAnonymousf;
          }
          return rb.h.a;
        }
      }, parame);
    }
    ec.i.i("context");
    throw null;
  }
  
  private final void setUp(BinaryMessenger paramBinaryMessenger, Context paramContext)
  {
    context = paramContext;
    try
    {
      SharedPreferencesAsyncApi.Companion.setUp(paramBinaryMessenger, this);
    }
    catch (Exception paramBinaryMessenger)
    {
      Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", paramBinaryMessenger);
    }
  }
  
  private final Object transformPref(Object paramObject)
  {
    Object localObject = paramObject;
    if ((paramObject instanceof String))
    {
      String str = (String)paramObject;
      localObject = paramObject;
      if (lc.h.n0(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu"))
      {
        paramObject = listEncoder;
        localObject = str.substring(40);
        ec.i.d(localObject, "substring(...)");
        localObject = ((SharedPreferencesListEncoder)paramObject).decode((String)localObject);
      }
    }
    return localObject;
  }
  
  public void clear(final List<String> paramList, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions)
  {
    ec.i.e(paramSharedPreferencesPigeonOptions, "options");
    b.p0(new wb.i(paramList, null)
    {
      public int label;
      
      public final ub.e<rb.h> create(Object paramAnonymousObject, ub.e<?> paramAnonymouse)
      {
        return new 1(this$0, paramList, paramAnonymouse);
      }
      
      public final Object invoke(d0 paramAnonymousd0, ub.e<? super d> paramAnonymouse)
      {
        return ((1)create(paramAnonymousd0, paramAnonymouse)).invokeSuspend(rb.h.a);
      }
      
      public final Object invokeSuspend(Object paramAnonymousObject)
      {
        vb.a locala = vb.a.a;
        int i = label;
        if (i != 0)
        {
          if (i == 1) {
            rb.f.b(paramAnonymousObject);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          rb.f.b(paramAnonymousObject);
          paramAnonymousObject = SharedPreferencesPlugin.access$getContext$p(this$0);
          if (paramAnonymousObject == null) {
            break label97;
          }
          paramAnonymousObject = SharedPreferencesPluginKt.access$getSharedPreferencesDataStore((Context)paramAnonymousObject);
          Object localObject = new wb.i(paramList, null)
          {
            public int label;
            
            public final ub.e<rb.h> create(Object paramAnonymous2Object, ub.e<?> paramAnonymous2e)
            {
              paramAnonymous2e = new 1($allowList, paramAnonymous2e);
              L$0 = paramAnonymous2Object;
              return paramAnonymous2e;
            }
            
            public final Object invoke(r0.a paramAnonymous2a, ub.e<? super rb.h> paramAnonymous2e)
            {
              return ((1)create(paramAnonymous2a, paramAnonymous2e)).invokeSuspend(rb.h.a);
            }
            
            public final Object invokeSuspend(Object paramAnonymous2Object)
            {
              Object localObject = vb.a.a;
              if (label == 0)
              {
                rb.f.b(paramAnonymous2Object);
                paramAnonymous2Object = (r0.a)L$0;
                localObject = $allowList;
                if (localObject != null)
                {
                  Iterator localIterator = ((Iterable)localObject).iterator();
                  while (localIterator.hasNext())
                  {
                    localObject = b.j((String)localIterator.next());
                    paramAnonymous2Object.getClass();
                    ((r0.a)paramAnonymous2Object).c();
                    a.remove(localObject);
                  }
                }
                ((r0.a)paramAnonymous2Object).c();
                a.clear();
                return rb.h.a;
              }
              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
          };
          label = 1;
          localObject = r0.e.a((o0.i)paramAnonymousObject, (p)localObject, this);
          paramAnonymousObject = localObject;
          if (localObject == locala) {
            return locala;
          }
        }
        return paramAnonymousObject;
        label97:
        ec.i.i("context");
        throw null;
      }
    });
  }
  
  public Map<String, Object> getAll(final List<String> paramList, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions)
  {
    ec.i.e(paramSharedPreferencesPigeonOptions, "options");
    (Map)b.p0(new wb.i(paramList, null)
    {
      public int label;
      
      public final ub.e<rb.h> create(Object paramAnonymousObject, ub.e<?> paramAnonymouse)
      {
        return new 1(this$0, paramList, paramAnonymouse);
      }
      
      public final Object invoke(d0 paramAnonymousd0, ub.e<? super Map<String, ? extends Object>> paramAnonymouse)
      {
        return ((1)create(paramAnonymousd0, paramAnonymouse)).invokeSuspend(rb.h.a);
      }
      
      public final Object invokeSuspend(Object paramAnonymousObject)
      {
        vb.a locala = vb.a.a;
        int i = label;
        if (i != 0)
        {
          if (i == 1) {
            rb.f.b(paramAnonymousObject);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          rb.f.b(paramAnonymousObject);
          paramAnonymousObject = this$0;
          Object localObject = paramList;
          label = 1;
          localObject = SharedPreferencesPlugin.access$getPrefs((SharedPreferencesPlugin)paramAnonymousObject, (List)localObject, this);
          paramAnonymousObject = localObject;
          if (localObject == locala) {
            return locala;
          }
        }
        return paramAnonymousObject;
      }
    });
  }
  
  public Boolean getBool(String paramString, final SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions)
  {
    ec.i.e(paramString, "key");
    ec.i.e(paramSharedPreferencesPigeonOptions, "options");
    paramSharedPreferencesPigeonOptions = new s();
    b.p0(new wb.i(paramString, this)
    {
      public Object L$0;
      public int label;
      
      public final ub.e<rb.h> create(Object paramAnonymousObject, ub.e<?> paramAnonymouse)
      {
        return new 1($key, jdField_this, paramSharedPreferencesPigeonOptions, paramAnonymouse);
      }
      
      public final Object invoke(d0 paramAnonymousd0, ub.e<? super rb.h> paramAnonymouse)
      {
        return ((1)create(paramAnonymousd0, paramAnonymouse)).invokeSuspend(rb.h.a);
      }
      
      public final Object invokeSuspend(Object paramAnonymousObject)
      {
        Object localObject1 = vb.a.a;
        int i = label;
        final Object localObject2;
        if (i != 0)
        {
          if (i == 1)
          {
            localObject1 = (s)L$0;
            rb.f.b(paramAnonymousObject);
            localObject2 = paramAnonymousObject;
          }
          else
          {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          rb.f.b(paramAnonymousObject);
          localObject2 = b.j($key);
          paramAnonymousObject = SharedPreferencesPlugin.access$getContext$p(jdField_this);
          if (paramAnonymousObject == null) {
            break label134;
          }
          localObject2 = new qc.e()
          {
            public Object collect(qc.f paramAnonymous2f, ub.e paramAnonymous2e)
            {
              paramAnonymous2f = $this_unsafeTransform$inlined.collect(new qc.f()
              {
                public final Object emit(Object paramAnonymous3Object, ub.e paramAnonymous3e)
                {
                  if ((paramAnonymous3e instanceof 1))
                  {
                    localObject1 = (1)paramAnonymous3e;
                    i = label;
                    if ((i & 0x80000000) != 0)
                    {
                      label = (i + Integer.MIN_VALUE);
                      paramAnonymous3e = (ub.e)localObject1;
                      break label50;
                    }
                  }
                  paramAnonymous3e = new c(paramAnonymous3e)
                  {
                    public Object L$0;
                    public int label;
                    
                    public final Object invokeSuspend(Object paramAnonymous4Object)
                    {
                      result = paramAnonymous4Object;
                      label |= 0x80000000;
                      return this$0.emit(null, this);
                    }
                  };
                  label50:
                  Object localObject2 = result;
                  Object localObject1 = vb.a.a;
                  int i = label;
                  if (i != 0)
                  {
                    if (i == 1) {
                      rb.f.b(localObject2);
                    } else {
                      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                  }
                  else
                  {
                    rb.f.b(localObject2);
                    localObject2 = $this_unsafeFlow;
                    paramAnonymous3Object = ((d)paramAnonymous3Object).b($preferencesKey$inlined);
                    label = 1;
                    if (((qc.f)localObject2).emit(paramAnonymous3Object, paramAnonymous3e) == localObject1) {
                      return localObject1;
                    }
                  }
                  return rb.h.a;
                }
              }, paramAnonymous2e);
              if (paramAnonymous2f == vb.a.a) {
                return paramAnonymous2f;
              }
              return rb.h.a;
            }
          };
          paramAnonymousObject = paramSharedPreferencesPigeonOptions;
          L$0 = paramAnonymousObject;
          label = 1;
          localObject2 = b.V((qc.e)localObject2, this);
          if (localObject2 == localObject1) {
            return localObject1;
          }
          localObject1 = paramAnonymousObject;
        }
        a = localObject2;
        return rb.h.a;
        label134:
        ec.i.i("context");
        throw null;
      }
    });
    return (Boolean)a;
  }
  
  public Double getDouble(String paramString, final SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions)
  {
    ec.i.e(paramString, "key");
    ec.i.e(paramSharedPreferencesPigeonOptions, "options");
    paramSharedPreferencesPigeonOptions = new s();
    b.p0(new wb.i(paramString, this)
    {
      public Object L$0;
      public int label;
      
      public final ub.e<rb.h> create(Object paramAnonymousObject, ub.e<?> paramAnonymouse)
      {
        return new 1($key, jdField_this, paramSharedPreferencesPigeonOptions, paramAnonymouse);
      }
      
      public final Object invoke(d0 paramAnonymousd0, ub.e<? super rb.h> paramAnonymouse)
      {
        return ((1)create(paramAnonymousd0, paramAnonymouse)).invokeSuspend(rb.h.a);
      }
      
      public final Object invokeSuspend(final Object paramAnonymousObject)
      {
        Object localObject1 = vb.a.a;
        int i = label;
        Object localObject2;
        if (i != 0)
        {
          if (i == 1)
          {
            localObject1 = (s)L$0;
            rb.f.b(paramAnonymousObject);
            localObject2 = paramAnonymousObject;
          }
          else
          {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          rb.f.b(paramAnonymousObject);
          paramAnonymousObject = b.u0($key);
          localObject2 = SharedPreferencesPlugin.access$getContext$p(jdField_this);
          if (localObject2 == null) {
            break label139;
          }
          localObject2 = new qc.e()
          {
            public Object collect(qc.f paramAnonymous2f, ub.e paramAnonymous2e)
            {
              paramAnonymous2f = $this_unsafeTransform$inlined.collect(new qc.f()
              {
                public final Object emit(Object paramAnonymous3Object, ub.e paramAnonymous3e)
                {
                  if ((paramAnonymous3e instanceof 1))
                  {
                    localObject1 = (1)paramAnonymous3e;
                    i = label;
                    if ((i & 0x80000000) != 0)
                    {
                      label = (i + Integer.MIN_VALUE);
                      paramAnonymous3e = (ub.e)localObject1;
                      break label50;
                    }
                  }
                  paramAnonymous3e = new c(paramAnonymous3e)
                  {
                    public Object L$0;
                    public int label;
                    
                    public final Object invokeSuspend(Object paramAnonymous4Object)
                    {
                      result = paramAnonymous4Object;
                      label |= 0x80000000;
                      return this$0.emit(null, this);
                    }
                  };
                  label50:
                  Object localObject2 = result;
                  Object localObject1 = vb.a.a;
                  int i = label;
                  if (i != 0)
                  {
                    if (i == 1) {
                      rb.f.b(localObject2);
                    } else {
                      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                  }
                  else
                  {
                    rb.f.b(localObject2);
                    localObject2 = $this_unsafeFlow;
                    paramAnonymous3Object = (d)paramAnonymous3Object;
                    paramAnonymous3Object = (Double)SharedPreferencesPlugin.access$transformPref(this$0, ((d)paramAnonymous3Object).b($preferencesKey$inlined));
                    label = 1;
                    if (((qc.f)localObject2).emit(paramAnonymous3Object, paramAnonymous3e) == localObject1) {
                      return localObject1;
                    }
                  }
                  return rb.h.a;
                }
              }, paramAnonymous2e);
              if (paramAnonymous2f == vb.a.a) {
                return paramAnonymous2f;
              }
              return rb.h.a;
            }
          };
          paramAnonymousObject = paramSharedPreferencesPigeonOptions;
          L$0 = paramAnonymousObject;
          label = 1;
          localObject2 = b.V((qc.e)localObject2, this);
          if (localObject2 == localObject1) {
            return localObject1;
          }
          localObject1 = paramAnonymousObject;
        }
        a = localObject2;
        return rb.h.a;
        label139:
        ec.i.i("context");
        throw null;
      }
    });
    return (Double)a;
  }
  
  public Long getInt(String paramString, final SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions)
  {
    ec.i.e(paramString, "key");
    ec.i.e(paramSharedPreferencesPigeonOptions, "options");
    paramSharedPreferencesPigeonOptions = new s();
    b.p0(new wb.i(paramString, this)
    {
      public Object L$0;
      public int label;
      
      public final ub.e<rb.h> create(Object paramAnonymousObject, ub.e<?> paramAnonymouse)
      {
        return new 1($key, jdField_this, paramSharedPreferencesPigeonOptions, paramAnonymouse);
      }
      
      public final Object invoke(d0 paramAnonymousd0, ub.e<? super rb.h> paramAnonymouse)
      {
        return ((1)create(paramAnonymousd0, paramAnonymouse)).invokeSuspend(rb.h.a);
      }
      
      public final Object invokeSuspend(final Object paramAnonymousObject)
      {
        Object localObject1 = vb.a.a;
        int i = label;
        Object localObject2;
        if (i != 0)
        {
          if (i == 1)
          {
            localObject1 = (s)L$0;
            rb.f.b(paramAnonymousObject);
            localObject2 = paramAnonymousObject;
          }
          else
          {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          rb.f.b(paramAnonymousObject);
          paramAnonymousObject = $key;
          ec.i.e(paramAnonymousObject, "name");
          paramAnonymousObject = new d.a((String)paramAnonymousObject);
          localObject2 = SharedPreferencesPlugin.access$getContext$p(jdField_this);
          if (localObject2 == null) {
            break label147;
          }
          localObject2 = new qc.e()
          {
            public Object collect(qc.f paramAnonymous2f, ub.e paramAnonymous2e)
            {
              paramAnonymous2f = $this_unsafeTransform$inlined.collect(new qc.f()
              {
                public final Object emit(Object paramAnonymous3Object, ub.e paramAnonymous3e)
                {
                  if ((paramAnonymous3e instanceof 1))
                  {
                    localObject1 = (1)paramAnonymous3e;
                    i = label;
                    if ((i & 0x80000000) != 0)
                    {
                      label = (i + Integer.MIN_VALUE);
                      paramAnonymous3e = (ub.e)localObject1;
                      break label50;
                    }
                  }
                  paramAnonymous3e = new c(paramAnonymous3e)
                  {
                    public Object L$0;
                    public int label;
                    
                    public final Object invokeSuspend(Object paramAnonymous4Object)
                    {
                      result = paramAnonymous4Object;
                      label |= 0x80000000;
                      return this$0.emit(null, this);
                    }
                  };
                  label50:
                  Object localObject2 = result;
                  Object localObject1 = vb.a.a;
                  int i = label;
                  if (i != 0)
                  {
                    if (i == 1) {
                      rb.f.b(localObject2);
                    } else {
                      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                  }
                  else
                  {
                    rb.f.b(localObject2);
                    localObject2 = $this_unsafeFlow;
                    paramAnonymous3Object = ((d)paramAnonymous3Object).b($preferencesKey$inlined);
                    label = 1;
                    if (((qc.f)localObject2).emit(paramAnonymous3Object, paramAnonymous3e) == localObject1) {
                      return localObject1;
                    }
                  }
                  return rb.h.a;
                }
              }, paramAnonymous2e);
              if (paramAnonymous2f == vb.a.a) {
                return paramAnonymous2f;
              }
              return rb.h.a;
            }
          };
          paramAnonymousObject = paramSharedPreferencesPigeonOptions;
          L$0 = paramAnonymousObject;
          label = 1;
          localObject2 = b.V((qc.e)localObject2, this);
          if (localObject2 == localObject1) {
            return localObject1;
          }
          localObject1 = paramAnonymousObject;
        }
        a = localObject2;
        return rb.h.a;
        label147:
        ec.i.i("context");
        throw null;
      }
    });
    return (Long)a;
  }
  
  public List<String> getKeys(final List<String> paramList, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions)
  {
    ec.i.e(paramSharedPreferencesPigeonOptions, "options");
    q.u(((Map)b.p0(new wb.i(paramList, null)
    {
      public int label;
      
      public final ub.e<rb.h> create(Object paramAnonymousObject, ub.e<?> paramAnonymouse)
      {
        return new 1(this$0, paramList, paramAnonymouse);
      }
      
      public final Object invoke(d0 paramAnonymousd0, ub.e<? super Map<String, ? extends Object>> paramAnonymouse)
      {
        return ((1)create(paramAnonymousd0, paramAnonymouse)).invokeSuspend(rb.h.a);
      }
      
      public final Object invokeSuspend(Object paramAnonymousObject)
      {
        vb.a locala = vb.a.a;
        int i = label;
        if (i != 0)
        {
          if (i == 1) {
            rb.f.b(paramAnonymousObject);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          rb.f.b(paramAnonymousObject);
          Object localObject = this$0;
          paramAnonymousObject = paramList;
          label = 1;
          localObject = SharedPreferencesPlugin.access$getPrefs((SharedPreferencesPlugin)localObject, (List)paramAnonymousObject, this);
          paramAnonymousObject = localObject;
          if (localObject == locala) {
            return locala;
          }
        }
        return paramAnonymousObject;
      }
    })).keySet());
  }
  
  public String getString(String paramString, final SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions)
  {
    ec.i.e(paramString, "key");
    ec.i.e(paramSharedPreferencesPigeonOptions, "options");
    paramSharedPreferencesPigeonOptions = new s();
    b.p0(new wb.i(paramString, this)
    {
      public Object L$0;
      public int label;
      
      public final ub.e<rb.h> create(Object paramAnonymousObject, ub.e<?> paramAnonymouse)
      {
        return new 1($key, jdField_this, paramSharedPreferencesPigeonOptions, paramAnonymouse);
      }
      
      public final Object invoke(d0 paramAnonymousd0, ub.e<? super rb.h> paramAnonymouse)
      {
        return ((1)create(paramAnonymousd0, paramAnonymouse)).invokeSuspend(rb.h.a);
      }
      
      public final Object invokeSuspend(final Object paramAnonymousObject)
      {
        Object localObject1 = vb.a.a;
        int i = label;
        Object localObject2;
        if (i != 0)
        {
          if (i == 1)
          {
            localObject1 = (s)L$0;
            rb.f.b(paramAnonymousObject);
            localObject2 = paramAnonymousObject;
          }
          else
          {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          rb.f.b(paramAnonymousObject);
          paramAnonymousObject = b.u0($key);
          localObject2 = SharedPreferencesPlugin.access$getContext$p(jdField_this);
          if (localObject2 == null) {
            break label135;
          }
          localObject2 = new qc.e()
          {
            public Object collect(qc.f paramAnonymous2f, ub.e paramAnonymous2e)
            {
              paramAnonymous2f = $this_unsafeTransform$inlined.collect(new qc.f()
              {
                public final Object emit(Object paramAnonymous3Object, ub.e paramAnonymous3e)
                {
                  if ((paramAnonymous3e instanceof 1))
                  {
                    localObject1 = (1)paramAnonymous3e;
                    i = label;
                    if ((i & 0x80000000) != 0)
                    {
                      label = (i + Integer.MIN_VALUE);
                      paramAnonymous3e = (ub.e)localObject1;
                      break label50;
                    }
                  }
                  paramAnonymous3e = new c(paramAnonymous3e)
                  {
                    public Object L$0;
                    public int label;
                    
                    public final Object invokeSuspend(Object paramAnonymous4Object)
                    {
                      result = paramAnonymous4Object;
                      label |= 0x80000000;
                      return this$0.emit(null, this);
                    }
                  };
                  label50:
                  Object localObject2 = result;
                  Object localObject1 = vb.a.a;
                  int i = label;
                  if (i != 0)
                  {
                    if (i == 1) {
                      rb.f.b(localObject2);
                    } else {
                      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                  }
                  else
                  {
                    rb.f.b(localObject2);
                    localObject2 = $this_unsafeFlow;
                    paramAnonymous3Object = ((d)paramAnonymous3Object).b($preferencesKey$inlined);
                    label = 1;
                    if (((qc.f)localObject2).emit(paramAnonymous3Object, paramAnonymous3e) == localObject1) {
                      return localObject1;
                    }
                  }
                  return rb.h.a;
                }
              }, paramAnonymous2e);
              if (paramAnonymous2f == vb.a.a) {
                return paramAnonymous2f;
              }
              return rb.h.a;
            }
          };
          paramAnonymousObject = paramSharedPreferencesPigeonOptions;
          L$0 = paramAnonymousObject;
          label = 1;
          localObject2 = b.V((qc.e)localObject2, this);
          if (localObject2 == localObject1) {
            return localObject1;
          }
          localObject1 = paramAnonymousObject;
        }
        a = localObject2;
        return rb.h.a;
        label135:
        ec.i.i("context");
        throw null;
      }
    });
    return (String)a;
  }
  
  public List<String> getStringList(String paramString, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions)
  {
    ec.i.e(paramString, "key");
    ec.i.e(paramSharedPreferencesPigeonOptions, "options");
    paramString = (List)transformPref(getString(paramString, paramSharedPreferencesPigeonOptions));
    if (paramString != null)
    {
      paramSharedPreferencesPigeonOptions = new ArrayList();
      Iterator localIterator = paramString.iterator();
      for (;;)
      {
        paramString = paramSharedPreferencesPigeonOptions;
        if (!localIterator.hasNext()) {
          break;
        }
        paramString = localIterator.next();
        if ((paramString instanceof String)) {
          paramSharedPreferencesPigeonOptions.add(paramString);
        }
      }
    }
    paramString = null;
    return paramString;
  }
  
  public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    ec.i.e(paramFlutterPluginBinding, "binding");
    BinaryMessenger localBinaryMessenger = paramFlutterPluginBinding.getBinaryMessenger();
    ec.i.d(localBinaryMessenger, "getBinaryMessenger(...)");
    Context localContext = paramFlutterPluginBinding.getApplicationContext();
    ec.i.d(localContext, "getApplicationContext(...)");
    setUp(localBinaryMessenger, localContext);
    new LegacySharedPreferencesPlugin().onAttachedToEngine(paramFlutterPluginBinding);
  }
  
  public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    ec.i.e(paramFlutterPluginBinding, "binding");
    SharedPreferencesAsyncApi.Companion localCompanion = SharedPreferencesAsyncApi.Companion;
    paramFlutterPluginBinding = paramFlutterPluginBinding.getBinaryMessenger();
    ec.i.d(paramFlutterPluginBinding, "getBinaryMessenger(...)");
    localCompanion.setUp(paramFlutterPluginBinding, null);
  }
  
  public void setBool(String paramString, final boolean paramBoolean, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions)
  {
    ec.i.e(paramString, "key");
    ec.i.e(paramSharedPreferencesPigeonOptions, "options");
    b.p0(new wb.i(paramString, this)
    {
      public int label;
      
      public final ub.e<rb.h> create(Object paramAnonymousObject, ub.e<?> paramAnonymouse)
      {
        return new 1($key, jdField_this, paramBoolean, paramAnonymouse);
      }
      
      public final Object invoke(d0 paramAnonymousd0, ub.e<? super rb.h> paramAnonymouse)
      {
        return ((1)create(paramAnonymousd0, paramAnonymouse)).invokeSuspend(rb.h.a);
      }
      
      public final Object invokeSuspend(Object paramAnonymousObject)
      {
        vb.a locala = vb.a.a;
        int i = label;
        if (i != 0)
        {
          if (i == 1) {
            rb.f.b(paramAnonymousObject);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          rb.f.b(paramAnonymousObject);
          Object localObject = b.j($key);
          paramAnonymousObject = SharedPreferencesPlugin.access$getContext$p(jdField_this);
          if (paramAnonymousObject == null) {
            break label103;
          }
          paramAnonymousObject = SharedPreferencesPluginKt.access$getSharedPreferencesDataStore((Context)paramAnonymousObject);
          localObject = new wb.i((d.a)localObject, paramBoolean)
          {
            public int label;
            
            public final ub.e<rb.h> create(Object paramAnonymous2Object, ub.e<?> paramAnonymous2e)
            {
              paramAnonymous2e = new 1($boolKey, $value, paramAnonymous2e);
              L$0 = paramAnonymous2Object;
              return paramAnonymous2e;
            }
            
            public final Object invoke(r0.a paramAnonymous2a, ub.e<? super rb.h> paramAnonymous2e)
            {
              return ((1)create(paramAnonymous2a, paramAnonymous2e)).invokeSuspend(rb.h.a);
            }
            
            public final Object invokeSuspend(Object paramAnonymous2Object)
            {
              vb.a locala = vb.a.a;
              if (label == 0)
              {
                rb.f.b(paramAnonymous2Object);
                ((r0.a)L$0).d($boolKey, Boolean.valueOf($value));
                return rb.h.a;
              }
              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
          };
          label = 1;
          if (r0.e.a((o0.i)paramAnonymousObject, (p)localObject, this) == locala) {
            return locala;
          }
        }
        return rb.h.a;
        label103:
        ec.i.i("context");
        throw null;
      }
    });
  }
  
  public void setDouble(String paramString, final double paramDouble, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions)
  {
    ec.i.e(paramString, "key");
    ec.i.e(paramSharedPreferencesPigeonOptions, "options");
    b.p0(new wb.i(paramString, this)
    {
      public int label;
      
      public final ub.e<rb.h> create(Object paramAnonymousObject, ub.e<?> paramAnonymouse)
      {
        return new 1($key, jdField_this, paramDouble, paramAnonymouse);
      }
      
      public final Object invoke(d0 paramAnonymousd0, ub.e<? super rb.h> paramAnonymouse)
      {
        return ((1)create(paramAnonymousd0, paramAnonymouse)).invokeSuspend(rb.h.a);
      }
      
      public final Object invokeSuspend(Object paramAnonymousObject)
      {
        vb.a locala = vb.a.a;
        int i = label;
        if (i != 0)
        {
          if (i == 1) {
            rb.f.b(paramAnonymousObject);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          rb.f.b(paramAnonymousObject);
          paramAnonymousObject = $key;
          ec.i.e(paramAnonymousObject, "name");
          paramAnonymousObject = new d.a((String)paramAnonymousObject);
          Object localObject = SharedPreferencesPlugin.access$getContext$p(jdField_this);
          if (localObject == null) {
            break label116;
          }
          localObject = SharedPreferencesPluginKt.access$getSharedPreferencesDataStore((Context)localObject);
          paramAnonymousObject = new wb.i((d.a)paramAnonymousObject, paramDouble)
          {
            public int label;
            
            public final ub.e<rb.h> create(Object paramAnonymous2Object, ub.e<?> paramAnonymous2e)
            {
              paramAnonymous2e = new 1($doubleKey, $value, paramAnonymous2e);
              L$0 = paramAnonymous2Object;
              return paramAnonymous2e;
            }
            
            public final Object invoke(r0.a paramAnonymous2a, ub.e<? super rb.h> paramAnonymous2e)
            {
              return ((1)create(paramAnonymous2a, paramAnonymous2e)).invokeSuspend(rb.h.a);
            }
            
            public final Object invokeSuspend(Object paramAnonymous2Object)
            {
              vb.a locala = vb.a.a;
              if (label == 0)
              {
                rb.f.b(paramAnonymous2Object);
                ((r0.a)L$0).d($doubleKey, new Double($value));
                return rb.h.a;
              }
              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
          };
          label = 1;
          if (r0.e.a((o0.i)localObject, (p)paramAnonymousObject, this) == locala) {
            return locala;
          }
        }
        return rb.h.a;
        label116:
        ec.i.i("context");
        throw null;
      }
    });
  }
  
  public void setInt(String paramString, final long paramLong, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions)
  {
    ec.i.e(paramString, "key");
    ec.i.e(paramSharedPreferencesPigeonOptions, "options");
    b.p0(new wb.i(paramString, this)
    {
      public int label;
      
      public final ub.e<rb.h> create(Object paramAnonymousObject, ub.e<?> paramAnonymouse)
      {
        return new 1($key, jdField_this, paramLong, paramAnonymouse);
      }
      
      public final Object invoke(d0 paramAnonymousd0, ub.e<? super rb.h> paramAnonymouse)
      {
        return ((1)create(paramAnonymousd0, paramAnonymouse)).invokeSuspend(rb.h.a);
      }
      
      public final Object invokeSuspend(Object paramAnonymousObject)
      {
        vb.a locala = vb.a.a;
        int i = label;
        if (i != 0)
        {
          if (i == 1) {
            rb.f.b(paramAnonymousObject);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          rb.f.b(paramAnonymousObject);
          paramAnonymousObject = $key;
          ec.i.e(paramAnonymousObject, "name");
          paramAnonymousObject = new d.a((String)paramAnonymousObject);
          Object localObject = SharedPreferencesPlugin.access$getContext$p(jdField_this);
          if (localObject == null) {
            break label116;
          }
          localObject = SharedPreferencesPluginKt.access$getSharedPreferencesDataStore((Context)localObject);
          paramAnonymousObject = new wb.i((d.a)paramAnonymousObject, paramLong)
          {
            public int label;
            
            public final ub.e<rb.h> create(Object paramAnonymous2Object, ub.e<?> paramAnonymous2e)
            {
              paramAnonymous2e = new 1($intKey, $value, paramAnonymous2e);
              L$0 = paramAnonymous2Object;
              return paramAnonymous2e;
            }
            
            public final Object invoke(r0.a paramAnonymous2a, ub.e<? super rb.h> paramAnonymous2e)
            {
              return ((1)create(paramAnonymous2a, paramAnonymous2e)).invokeSuspend(rb.h.a);
            }
            
            public final Object invokeSuspend(Object paramAnonymous2Object)
            {
              vb.a locala = vb.a.a;
              if (label == 0)
              {
                rb.f.b(paramAnonymous2Object);
                ((r0.a)L$0).d($intKey, new Long($value));
                return rb.h.a;
              }
              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
          };
          label = 1;
          if (r0.e.a((o0.i)localObject, (p)paramAnonymousObject, this) == locala) {
            return locala;
          }
        }
        return rb.h.a;
        label116:
        ec.i.i("context");
        throw null;
      }
    });
  }
  
  public void setString(final String paramString1, final String paramString2, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions)
  {
    ec.i.e(paramString1, "key");
    ec.i.e(paramString2, "value");
    ec.i.e(paramSharedPreferencesPigeonOptions, "options");
    b.p0(new wb.i(paramString1, paramString2)
    {
      public int label;
      
      public final ub.e<rb.h> create(Object paramAnonymousObject, ub.e<?> paramAnonymouse)
      {
        return new 1(this$0, paramString1, paramString2, paramAnonymouse);
      }
      
      public final Object invoke(d0 paramAnonymousd0, ub.e<? super rb.h> paramAnonymouse)
      {
        return ((1)create(paramAnonymousd0, paramAnonymouse)).invokeSuspend(rb.h.a);
      }
      
      public final Object invokeSuspend(Object paramAnonymousObject)
      {
        vb.a locala = vb.a.a;
        int i = label;
        if (i != 0)
        {
          if (i == 1) {
            rb.f.b(paramAnonymousObject);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          rb.f.b(paramAnonymousObject);
          SharedPreferencesPlugin localSharedPreferencesPlugin = this$0;
          String str = paramString1;
          paramAnonymousObject = paramString2;
          label = 1;
          if (SharedPreferencesPlugin.access$dataStoreSetString(localSharedPreferencesPlugin, str, (String)paramAnonymousObject, this) == locala) {
            return locala;
          }
        }
        return rb.h.a;
      }
    });
  }
  
  public void setStringList(final String paramString, List<String> paramList, SharedPreferencesPigeonOptions paramSharedPreferencesPigeonOptions)
  {
    ec.i.e(paramString, "key");
    ec.i.e(paramList, "value");
    ec.i.e(paramSharedPreferencesPigeonOptions, "options");
    paramSharedPreferencesPigeonOptions = new StringBuilder();
    paramSharedPreferencesPigeonOptions.append("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu");
    paramSharedPreferencesPigeonOptions.append(listEncoder.encode(paramList));
    b.p0(new wb.i(paramString, paramSharedPreferencesPigeonOptions.toString())
    {
      public int label;
      
      public final ub.e<rb.h> create(Object paramAnonymousObject, ub.e<?> paramAnonymouse)
      {
        return new 1(this$0, paramString, $valueString, paramAnonymouse);
      }
      
      public final Object invoke(d0 paramAnonymousd0, ub.e<? super rb.h> paramAnonymouse)
      {
        return ((1)create(paramAnonymousd0, paramAnonymouse)).invokeSuspend(rb.h.a);
      }
      
      public final Object invokeSuspend(Object paramAnonymousObject)
      {
        vb.a locala = vb.a.a;
        int i = label;
        if (i != 0)
        {
          if (i == 1) {
            rb.f.b(paramAnonymousObject);
          } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
          }
        }
        else
        {
          rb.f.b(paramAnonymousObject);
          SharedPreferencesPlugin localSharedPreferencesPlugin = this$0;
          paramAnonymousObject = paramString;
          String str = $valueString;
          label = 1;
          if (SharedPreferencesPlugin.access$dataStoreSetString(localSharedPreferencesPlugin, (String)paramAnonymousObject, str, this) == locala) {
            return locala;
          }
        }
        return rb.h.a;
      }
    });
  }
  
  public static final class ListEncoder
    implements SharedPreferencesListEncoder
  {
    public List<String> decode(String paramString)
    {
      ec.i.e(paramString, "listString");
      try
      {
        Object localObject1 = Base64.decode(paramString, 0);
        Object localObject2 = new java/io/ObjectInputStream;
        paramString = new java/io/ByteArrayInputStream;
        paramString.<init>((byte[])localObject1);
        ((ObjectInputStream)localObject2).<init>(paramString);
        paramString = ((ObjectInputStream)localObject2).readObject();
        ec.i.c(paramString, "null cannot be cast to non-null type kotlin.collections.List<*>");
        localObject2 = (List)paramString;
        paramString = new java/util/ArrayList;
        paramString.<init>();
        localObject2 = ((Iterable)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = ((Iterator)localObject2).next();
          if ((localObject1 instanceof String)) {
            paramString.add(localObject1);
          }
        }
        return paramString;
      }
      catch (RuntimeException paramString)
      {
        throw new RuntimeException(paramString);
      }
    }
    
    public String encode(List<String> paramList)
    {
      ec.i.e(paramList, "list");
      try
      {
        ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
        localByteArrayOutputStream.<init>();
        ObjectOutputStream localObjectOutputStream = new java/io/ObjectOutputStream;
        localObjectOutputStream.<init>(localByteArrayOutputStream);
        localObjectOutputStream.writeObject(paramList);
        localObjectOutputStream.flush();
        paramList = Base64.encodeToString(localByteArrayOutputStream.toByteArray(), 0);
        ec.i.d(paramList, "encodeToString(...)");
        return paramList;
      }
      catch (RuntimeException paramList)
      {
        throw new RuntimeException(paramList);
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */