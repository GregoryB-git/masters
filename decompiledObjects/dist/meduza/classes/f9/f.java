package f9;

import g9.e0;
import g9.f0;
import j9.l;
import j9.m;
import j9.n;
import j9.o;
import j9.q;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import ka.d0;
import ka.d0.a;
import ka.u;
import ma.w.a;
import org.json.JSONArray;
import org.json.JSONObject;
import p2.m0;

public final class f
{
  public static final Charset f = Charset.forName("UTF-8");
  public final g a;
  public final InputStream b;
  public e c;
  public ByteBuffer d;
  public long e;
  
  public f(g paramg, InputStream paramInputStream)
  {
    a = paramg;
    b = paramInputStream;
    new InputStreamReader(paramInputStream);
    paramg = ByteBuffer.allocate(1024);
    d = paramg;
    paramg.flip();
  }
  
  public final void a(String paramString)
  {
    b.close();
    throw new IllegalArgumentException(g.d("Invalid bundle: ", paramString));
  }
  
  public final e b()
  {
    Object localObject = c;
    if (localObject != null) {
      return (e)localObject;
    }
    localObject = d();
    if ((localObject instanceof e))
    {
      localObject = (e)localObject;
      c = ((e)localObject);
      e = 0L;
      return (e)localObject;
    }
    a("Expected first element in bundle to be a metadata object");
    throw null;
  }
  
  public final boolean c()
  {
    d.compact();
    Object localObject = b;
    byte[] arrayOfByte = d.array();
    int i = d.arrayOffset();
    i = ((InputStream)localObject).read(arrayOfByte, d.position() + i, d.remaining());
    boolean bool;
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    }
    if (bool)
    {
      localObject = d;
      ((ByteBuffer)localObject).position(((Buffer)localObject).position() + i);
    }
    d.flip();
    return bool;
  }
  
  public final c d()
  {
    for (;;)
    {
      d.mark();
      int i = 0;
      int j = 0;
      try
      {
        while (j < d.remaining())
        {
          k = d.get();
          if (k == 123) {
            break label48;
          }
          j++;
        }
        j = -1;
        label48:
        d.reset();
        if ((j == -1) && (c())) {
          continue;
        }
        if (d.remaining() == 0)
        {
          localObject1 = null;
        }
        else
        {
          if (j == -1) {
            break label1454;
          }
          localObject1 = new byte[j];
          d.get((byte[])localObject1);
          localObject1 = f.decode(ByteBuffer.wrap((byte[])localObject1)).toString();
        }
        if (localObject1 == null) {
          return null;
        }
        int k = Integer.parseInt((String)localObject1);
        Object localObject3 = new ByteArrayOutputStream();
        j = k;
        while (j > 0)
        {
          if ((d.remaining() == 0) && (!c()))
          {
            a("Reached the end of bundle when more data was expected.");
            throw null;
          }
          int m = Math.min(j, d.remaining());
          localObject4 = d.array();
          int n = d.arrayOffset();
          ((ByteArrayOutputStream)localObject3).write((byte[])localObject4, d.position() + n, m);
          localObject4 = d;
          ((ByteBuffer)localObject4).position(((Buffer)localObject4).position() + m);
          j -= m;
        }
        Object localObject4 = f;
        localObject3 = ((ByteArrayOutputStream)localObject3).toString(((Charset)localObject4).name());
        e += ((String)localObject1).getBytes((Charset)localObject4).length + k;
        Object localObject1 = new JSONObject((String)localObject3);
        if (((JSONObject)localObject1).has("metadata"))
        {
          localObject3 = a;
          localObject1 = ((JSONObject)localObject1).getJSONObject("metadata");
          localObject3.getClass();
          localObject1 = new e(((JSONObject)localObject1).getString("id"), ((JSONObject)localObject1).getInt("version"), new q(((g)localObject3).e(((JSONObject)localObject1).get("createTime"))), ((JSONObject)localObject1).getInt("totalDocuments"), ((JSONObject)localObject1).getLong("totalBytes"));
          m0.y(1, "BundleElement", "BundleMetadata element loaded", new Object[0]);
        }
        else
        {
          Object localObject5;
          Object localObject6;
          boolean bool;
          Object localObject7;
          if (((JSONObject)localObject1).has("namedQuery"))
          {
            g localg = a;
            JSONObject localJSONObject1 = ((JSONObject)localObject1).getJSONObject("namedQuery");
            localg.getClass();
            localObject5 = localJSONObject1.getString("name");
            JSONObject localJSONObject2 = localJSONObject1.getJSONObject("bundledQuery");
            localObject6 = localJSONObject2.getJSONObject("structuredQuery");
            if (!((JSONObject)localObject6).has("select"))
            {
              localObject3 = localg.c(localJSONObject2.getString("parent"));
              localObject1 = ((JSONObject)localObject6).getJSONArray("from");
              if (((JSONArray)localObject1).length() == 1)
              {
                localObject1 = ((JSONArray)localObject1).getJSONObject(0);
                bool = ((JSONObject)localObject1).optBoolean("allDescendants", false);
                localObject1 = ((JSONObject)localObject1).getString("collectionId");
                if (!bool)
                {
                  localObject3 = (o)((j9.e)localObject3).g((String)localObject1);
                  localObject1 = null;
                }
                localObject4 = ((JSONObject)localObject6).optJSONObject("where");
                ArrayList localArrayList1 = new ArrayList();
                if (localObject4 != null) {
                  localg.a(localArrayList1, (JSONObject)localObject4);
                }
                localObject4 = ((JSONObject)localObject6).optJSONArray("orderBy");
                ArrayList localArrayList2 = new ArrayList();
                JSONObject localJSONObject3;
                if (localObject4 != null) {
                  for (j = i; j < ((JSONArray)localObject4).length(); j++)
                  {
                    localJSONObject3 = ((JSONArray)localObject4).getJSONObject(j);
                    localObject7 = l.t(localJSONObject3.getJSONObject("field").getString("fieldPath"));
                    if (localJSONObject3.optString("direction", "ASCENDING").equals("ASCENDING")) {
                      i = 1;
                    } else {
                      i = 2;
                    }
                    localArrayList2.add(new e0(i, (l)localObject7));
                  }
                }
                localObject4 = ((JSONObject)localObject6).optJSONObject("startAt");
                if (localObject4 != null)
                {
                  bool = ((JSONObject)localObject4).optBoolean("before", false);
                  localObject4 = new g9.e(localg.d((JSONObject)localObject4), bool);
                }
                else
                {
                  localObject4 = null;
                }
                localObject7 = ((JSONObject)localObject6).optJSONObject("endAt");
                if (localObject7 != null)
                {
                  bool = ((JSONObject)localObject7).optBoolean("before", false);
                  localObject7 = new g9.e(localg.d((JSONObject)localObject7), bool ^ true);
                }
                else
                {
                  localObject7 = null;
                }
                if (!((JSONObject)localObject6).has("offset"))
                {
                  localJSONObject3 = ((JSONObject)localObject6).optJSONObject("limit");
                  if (localJSONObject3 != null) {
                    j = localJSONObject3.optInt("value", -1);
                  } else {
                    j = ((JSONObject)localObject6).optInt("limit", -1);
                  }
                  localObject6 = localJSONObject2.optString("limitType", "FIRST");
                  if (((String)localObject6).equals("FIRST"))
                  {
                    i = 1;
                  }
                  else
                  {
                    if (!((String)localObject6).equals("LAST")) {
                      break label978;
                    }
                    i = 2;
                  }
                  localObject1 = new j((String)localObject5, new i(new f0((o)localObject3, (String)localObject1, localArrayList1, localArrayList2, j, 1, (g9.e)localObject4, (g9.e)localObject7).i(), i), new q(localg.e(localJSONObject1.get("readTime"))));
                  m0.y(1, "BundleElement", g.d("Query loaded: ", (String)localObject5), new Object[0]);
                }
              }
            }
          }
          for (;;)
          {
            break;
            label978:
            throw new IllegalArgumentException(g.d("Invalid limit type for bundle query: ", (String)localObject6));
            throw new IllegalArgumentException("Queries with offsets are not supported by the Android SDK");
            throw new IllegalArgumentException("Only queries with a single 'from' clause are supported by the Android SDK");
            throw new IllegalArgumentException("Queries with 'select' statements are not supported by the Android SDK");
            if (((JSONObject)localObject1).has("documentMetadata"))
            {
              localObject7 = a;
              localObject4 = ((JSONObject)localObject1).getJSONObject("documentMetadata");
              localObject7.getClass();
              localObject3 = new j9.i(((g)localObject7).c(((JSONObject)localObject4).getString("name")));
              localObject1 = new q(((g)localObject7).e(((JSONObject)localObject4).get("readTime")));
              bool = ((JSONObject)localObject4).optBoolean("exists", false);
              localObject7 = ((JSONObject)localObject4).optJSONArray("queries");
              localObject4 = new ArrayList();
              if (localObject7 != null) {
                for (j = 0; j < ((JSONArray)localObject7).length(); j++) {
                  ((ArrayList)localObject4).add(((JSONArray)localObject7).getString(j));
                }
              }
              localObject1 = new h((j9.i)localObject3, (q)localObject1, bool, (ArrayList)localObject4);
              localObject4 = new StringBuilder();
              ((StringBuilder)localObject4).append("Document metadata loaded: ");
              ((StringBuilder)localObject4).append(localObject3);
              m0.y(1, "BundleElement", ((StringBuilder)localObject4).toString(), new Object[0]);
            }
            else
            {
              if (!((JSONObject)localObject1).has("document")) {
                break label1417;
              }
              localObject3 = a;
              localObject7 = ((JSONObject)localObject1).getJSONObject("document");
              localObject3.getClass();
              localObject4 = new j9.i(((g)localObject3).c(((JSONObject)localObject7).getString("name")));
              localObject1 = new q(((g)localObject3).e(((JSONObject)localObject7).get("updateTime")));
              localObject5 = d0.d0();
              ((g)localObject3).b((d0.a)localObject5, ((JSONObject)localObject7).getJSONObject("fields"));
              localObject3 = n.e(((d0)b).Y().J());
              localObject4 = new m((j9.i)localObject4);
              ((m)localObject4).k((q)localObject1, (n)localObject3);
              localObject1 = new b((m)localObject4);
              localObject3 = f.l("Document loaded: ");
              ((StringBuilder)localObject3).append(a.b);
              m0.y(1, "BundleElement", ((StringBuilder)localObject3).toString(), new Object[0]);
            }
          }
        }
        return (c)localObject1;
        label1417:
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Cannot decode unknown Bundle element: ");
        ((StringBuilder)localObject1).append((String)localObject3);
        a(((StringBuilder)localObject1).toString());
        throw null;
        label1454:
        a("Reached the end of bundle when a length string is expected.");
        throw null;
      }
      finally
      {
        d.reset();
      }
    }
  }
}

/* Location:
 * Qualified Name:     f9.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */