.class public LI4/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:LF4/a;


# instance fields
.field public final a:Ljava/net/HttpURLConnection;

.field public final b:LG4/j;

.field public c:J

.field public d:J

.field public final e:LM4/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, LF4/a;->e()LF4/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, LI4/g;->f:LF4/a;

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(Ljava/net/HttpURLConnection;LM4/l;LG4/j;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x1

    .line 5
    .line 6
    iput-wide v0, p0, LI4/g;->c:J

    .line 7
    .line 8
    iput-wide v0, p0, LI4/g;->d:J

    .line 9
    .line 10
    iput-object p1, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 11
    .line 12
    iput-object p3, p0, LI4/g;->b:LG4/j;

    .line 13
    .line 14
    iput-object p2, p0, LI4/g;->e:LM4/l;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p3, p1}, LG4/j;->C(Ljava/lang/String;)LG4/j;

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public A()Z
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInstanceFollowRedirects()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public B()J
    .locals 2

    .line 1
    invoke-virtual {p0}, LI4/g;->a0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URLConnection;->getLastModified()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
.end method

.method public C()Ljava/io/OutputStream;
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, LI4/b;

    .line 10
    .line 11
    iget-object v2, p0, LI4/g;->b:LG4/j;

    .line 12
    .line 13
    iget-object v3, p0, LI4/g;->e:LM4/l;

    .line 14
    .line 15
    invoke-direct {v1, v0, v2, v3}, LI4/b;-><init>(Ljava/io/OutputStream;LG4/j;LM4/l;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :catch_0
    move-exception v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-object v0

    .line 22
    :goto_0
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 23
    .line 24
    iget-object v2, p0, LI4/g;->e:LM4/l;

    .line 25
    .line 26
    invoke-virtual {v2}, LM4/l;->c()J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    invoke-virtual {v1, v2, v3}, LG4/j;->A(J)LG4/j;

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 34
    .line 35
    invoke-static {v1}, LI4/j;->d(LG4/j;)V

    .line 36
    .line 37
    .line 38
    throw v0
.end method

.method public D()Ljava/security/Permission;
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getPermission()Ljava/security/Permission;

    .line 4
    .line 5
    .line 6
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object v0

    .line 8
    :catch_0
    move-exception v0

    .line 9
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 10
    .line 11
    iget-object v2, p0, LI4/g;->e:LM4/l;

    .line 12
    .line 13
    invoke-virtual {v2}, LM4/l;->c()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    invoke-virtual {v1, v2, v3}, LG4/j;->A(J)LG4/j;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 21
    .line 22
    invoke-static {v1}, LI4/j;->d(LG4/j;)V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method public E()I
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URLConnection;->getReadTimeout()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public F()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public G()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URLConnection;->getRequestProperties()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public H(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public I()I
    .locals 4

    .line 1
    invoke-virtual {p0}, LI4/g;->a0()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, LI4/g;->d:J

    .line 5
    .line 6
    const-wide/16 v2, -0x1

    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, LI4/g;->e:LM4/l;

    .line 13
    .line 14
    invoke-virtual {v0}, LM4/l;->c()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iput-wide v0, p0, LI4/g;->d:J

    .line 19
    .line 20
    iget-object v2, p0, LI4/g;->b:LG4/j;

    .line 21
    .line 22
    invoke-virtual {v2, v0, v1}, LG4/j;->B(J)LG4/j;

    .line 23
    .line 24
    .line 25
    :cond_0
    :try_start_0
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 32
    .line 33
    invoke-virtual {v1, v0}, LG4/j;->r(I)LG4/j;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    return v0

    .line 37
    :catch_0
    move-exception v0

    .line 38
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 39
    .line 40
    iget-object v2, p0, LI4/g;->e:LM4/l;

    .line 41
    .line 42
    invoke-virtual {v2}, LM4/l;->c()J

    .line 43
    .line 44
    .line 45
    move-result-wide v2

    .line 46
    invoke-virtual {v1, v2, v3}, LG4/j;->A(J)LG4/j;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 50
    .line 51
    invoke-static {v1}, LI4/j;->d(LG4/j;)V

    .line 52
    .line 53
    .line 54
    throw v0
.end method

.method public J()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, LI4/g;->a0()V

    .line 2
    .line 3
    .line 4
    iget-wide v0, p0, LI4/g;->d:J

    .line 5
    .line 6
    const-wide/16 v2, -0x1

    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, LI4/g;->e:LM4/l;

    .line 13
    .line 14
    invoke-virtual {v0}, LM4/l;->c()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iput-wide v0, p0, LI4/g;->d:J

    .line 19
    .line 20
    iget-object v2, p0, LI4/g;->b:LG4/j;

    .line 21
    .line 22
    invoke-virtual {v2, v0, v1}, LG4/j;->B(J)LG4/j;

    .line 23
    .line 24
    .line 25
    :cond_0
    :try_start_0
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 32
    .line 33
    iget-object v2, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-virtual {v1, v2}, LG4/j;->r(I)LG4/j;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :catch_0
    move-exception v0

    .line 44
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 45
    .line 46
    iget-object v2, p0, LI4/g;->e:LM4/l;

    .line 47
    .line 48
    invoke-virtual {v2}, LM4/l;->c()J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    invoke-virtual {v1, v2, v3}, LG4/j;->A(J)LG4/j;

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 56
    .line 57
    invoke-static {v1}, LI4/j;->d(LG4/j;)V

    .line 58
    .line 59
    .line 60
    throw v0
.end method

.method public K()Ljava/net/URL;
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public L()Z
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URLConnection;->getUseCaches()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public M(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setAllowUserInteraction(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public N(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public O(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public P(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setDefaultUseCaches(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public Q(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setDoInput(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public R(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public S(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public T(J)V
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public U(J)V
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ljava/net/URLConnection;->setIfModifiedSince(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public V(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public W(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public X(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public Y(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "User-Agent"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LI4/g;->b:LG4/j;

    .line 10
    .line 11
    invoke-virtual {v0, p2}, LG4/j;->E(Ljava/lang/String;)LG4/j;

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public Z(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->setUseCaches(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ljava/net/URLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final a0()V
    .locals 4

    .line 1
    iget-wide v0, p0, LI4/g;->c:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LI4/g;->e:LM4/l;

    .line 10
    .line 11
    invoke-virtual {v0}, LM4/l;->g()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LI4/g;->e:LM4/l;

    .line 15
    .line 16
    invoke-virtual {v0}, LM4/l;->e()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iput-wide v0, p0, LI4/g;->c:J

    .line 21
    .line 22
    iget-object v2, p0, LI4/g;->b:LG4/j;

    .line 23
    .line 24
    invoke-virtual {v2, v0, v1}, LG4/j;->w(J)LG4/j;

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, LI4/g;->F()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, LG4/j;->q(Ljava/lang/String;)LG4/j;

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    invoke-virtual {p0}, LI4/g;->o()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    iget-object v0, p0, LI4/g;->b:LG4/j;

    .line 46
    .line 47
    const-string v1, "POST"

    .line 48
    .line 49
    :goto_0
    invoke-virtual {v0, v1}, LG4/j;->q(Ljava/lang/String;)LG4/j;

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    iget-object v0, p0, LI4/g;->b:LG4/j;

    .line 54
    .line 55
    const-string v1, "GET"

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :goto_1
    return-void
.end method

.method public b()V
    .locals 4

    .line 1
    iget-wide v0, p0, LI4/g;->c:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LI4/g;->e:LM4/l;

    .line 10
    .line 11
    invoke-virtual {v0}, LM4/l;->g()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LI4/g;->e:LM4/l;

    .line 15
    .line 16
    invoke-virtual {v0}, LM4/l;->e()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    iput-wide v0, p0, LI4/g;->c:J

    .line 21
    .line 22
    iget-object v2, p0, LI4/g;->b:LG4/j;

    .line 23
    .line 24
    invoke-virtual {v2, v0, v1}, LG4/j;->w(J)LG4/j;

    .line 25
    .line 26
    .line 27
    :cond_0
    :try_start_0
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :catch_0
    move-exception v0

    .line 34
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 35
    .line 36
    iget-object v2, p0, LI4/g;->e:LM4/l;

    .line 37
    .line 38
    invoke-virtual {v2}, LM4/l;->c()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    invoke-virtual {v1, v2, v3}, LG4/j;->A(J)LG4/j;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 46
    .line 47
    invoke-static {v1}, LI4/j;->d(LG4/j;)V

    .line 48
    .line 49
    .line 50
    throw v0
.end method

.method public b0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->usingProxy()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public c()V
    .locals 3

    .line 1
    iget-object v0, p0, LI4/g;->b:LG4/j;

    .line 2
    .line 3
    iget-object v1, p0, LI4/g;->e:LM4/l;

    .line 4
    .line 5
    invoke-virtual {v1}, LM4/l;->c()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {v0, v1, v2}, LG4/j;->A(J)LG4/j;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LI4/g;->b:LG4/j;

    .line 13
    .line 14
    invoke-virtual {v0}, LG4/j;->g()LN4/h;

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URLConnection;->getAllowUserInteraction()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URLConnection;->getConnectTimeout()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public f()Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, LI4/g;->a0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/g;->b:LG4/j;

    .line 5
    .line 6
    iget-object v1, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, LG4/j;->r(I)LG4/j;

    .line 13
    .line 14
    .line 15
    :try_start_0
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContent()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    instance-of v1, v0, Ljava/io/InputStream;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 26
    .line 27
    iget-object v2, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v1, v2}, LG4/j;->x(Ljava/lang/String;)LG4/j;

    .line 34
    .line 35
    .line 36
    new-instance v1, LI4/a;

    .line 37
    .line 38
    check-cast v0, Ljava/io/InputStream;

    .line 39
    .line 40
    iget-object v2, p0, LI4/g;->b:LG4/j;

    .line 41
    .line 42
    iget-object v3, p0, LI4/g;->e:LM4/l;

    .line 43
    .line 44
    invoke-direct {v1, v0, v2, v3}, LI4/a;-><init>(Ljava/io/InputStream;LG4/j;LM4/l;)V

    .line 45
    .line 46
    .line 47
    move-object v0, v1

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 50
    .line 51
    iget-object v2, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v1, v2}, LG4/j;->x(Ljava/lang/String;)LG4/j;

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 61
    .line 62
    iget-object v2, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/net/URLConnection;->getContentLength()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    int-to-long v2, v2

    .line 69
    invoke-virtual {v1, v2, v3}, LG4/j;->y(J)LG4/j;

    .line 70
    .line 71
    .line 72
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 73
    .line 74
    iget-object v2, p0, LI4/g;->e:LM4/l;

    .line 75
    .line 76
    invoke-virtual {v2}, LM4/l;->c()J

    .line 77
    .line 78
    .line 79
    move-result-wide v2

    .line 80
    invoke-virtual {v1, v2, v3}, LG4/j;->A(J)LG4/j;

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 84
    .line 85
    invoke-virtual {v1}, LG4/j;->g()LN4/h;

    .line 86
    .line 87
    .line 88
    :goto_0
    return-object v0

    .line 89
    :catch_0
    move-exception v0

    .line 90
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 91
    .line 92
    iget-object v2, p0, LI4/g;->e:LM4/l;

    .line 93
    .line 94
    invoke-virtual {v2}, LM4/l;->c()J

    .line 95
    .line 96
    .line 97
    move-result-wide v2

    .line 98
    invoke-virtual {v1, v2, v3}, LG4/j;->A(J)LG4/j;

    .line 99
    .line 100
    .line 101
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 102
    .line 103
    invoke-static {v1}, LI4/j;->d(LG4/j;)V

    .line 104
    .line 105
    .line 106
    throw v0
.end method

.method public g([Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, LI4/g;->a0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/g;->b:LG4/j;

    .line 5
    .line 6
    iget-object v1, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, LG4/j;->r(I)LG4/j;

    .line 13
    .line 14
    .line 15
    :try_start_0
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->getContent([Ljava/lang/Class;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    instance-of v0, p1, Ljava/io/InputStream;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, LI4/g;->b:LG4/j;

    .line 26
    .line 27
    iget-object v1, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, LG4/j;->x(Ljava/lang/String;)LG4/j;

    .line 34
    .line 35
    .line 36
    new-instance v0, LI4/a;

    .line 37
    .line 38
    check-cast p1, Ljava/io/InputStream;

    .line 39
    .line 40
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 41
    .line 42
    iget-object v2, p0, LI4/g;->e:LM4/l;

    .line 43
    .line 44
    invoke-direct {v0, p1, v1, v2}, LI4/a;-><init>(Ljava/io/InputStream;LG4/j;LM4/l;)V

    .line 45
    .line 46
    .line 47
    move-object p1, v0

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    iget-object v0, p0, LI4/g;->b:LG4/j;

    .line 50
    .line 51
    iget-object v1, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, LG4/j;->x(Ljava/lang/String;)LG4/j;

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, LI4/g;->b:LG4/j;

    .line 61
    .line 62
    iget-object v1, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/net/URLConnection;->getContentLength()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    int-to-long v1, v1

    .line 69
    invoke-virtual {v0, v1, v2}, LG4/j;->y(J)LG4/j;

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, LI4/g;->b:LG4/j;

    .line 73
    .line 74
    iget-object v1, p0, LI4/g;->e:LM4/l;

    .line 75
    .line 76
    invoke-virtual {v1}, LM4/l;->c()J

    .line 77
    .line 78
    .line 79
    move-result-wide v1

    .line 80
    invoke-virtual {v0, v1, v2}, LG4/j;->A(J)LG4/j;

    .line 81
    .line 82
    .line 83
    iget-object v0, p0, LI4/g;->b:LG4/j;

    .line 84
    .line 85
    invoke-virtual {v0}, LG4/j;->g()LN4/h;

    .line 86
    .line 87
    .line 88
    :goto_0
    return-object p1

    .line 89
    :catch_0
    move-exception p1

    .line 90
    iget-object v0, p0, LI4/g;->b:LG4/j;

    .line 91
    .line 92
    iget-object v1, p0, LI4/g;->e:LM4/l;

    .line 93
    .line 94
    invoke-virtual {v1}, LM4/l;->c()J

    .line 95
    .line 96
    .line 97
    move-result-wide v1

    .line 98
    invoke-virtual {v0, v1, v2}, LG4/j;->A(J)LG4/j;

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, LI4/g;->b:LG4/j;

    .line 102
    .line 103
    invoke-static {v0}, LI4/j;->d(LG4/j;)V

    .line 104
    .line 105
    .line 106
    throw p1
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/g;->a0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentEncoding()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public i()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/g;->a0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentLength()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method

.method public j()J
    .locals 2

    .line 1
    invoke-virtual {p0}, LI4/g;->a0()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 11
    .line 12
    invoke-static {v0}, LI4/e;->a(Ljava/net/HttpURLConnection;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    :goto_0
    return-wide v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/g;->a0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public l()J
    .locals 2

    .line 1
    invoke-virtual {p0}, LI4/g;->a0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URLConnection;->getDate()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
.end method

.method public m()Z
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URLConnection;->getDefaultUseCaches()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public n()Z
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URLConnection;->getDoInput()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public o()Z
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URLConnection;->getDoOutput()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public p()Ljava/io/InputStream;
    .locals 4

    .line 1
    invoke-virtual {p0}, LI4/g;->a0()V

    .line 2
    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, LI4/g;->b:LG4/j;

    .line 5
    .line 6
    iget-object v1, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, LG4/j;->r(I)LG4/j;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catch_0
    sget-object v0, LI4/g;->f:LF4/a;

    .line 17
    .line 18
    const-string v1, "IOException thrown trying to obtain the response code"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, LF4/a;->a(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    :goto_0
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    new-instance v1, LI4/a;

    .line 32
    .line 33
    iget-object v2, p0, LI4/g;->b:LG4/j;

    .line 34
    .line 35
    iget-object v3, p0, LI4/g;->e:LM4/l;

    .line 36
    .line 37
    invoke-direct {v1, v0, v2, v3}, LI4/a;-><init>(Ljava/io/InputStream;LG4/j;LM4/l;)V

    .line 38
    .line 39
    .line 40
    return-object v1

    .line 41
    :cond_0
    return-object v0
.end method

.method public q()J
    .locals 2

    .line 1
    invoke-virtual {p0}, LI4/g;->a0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URLConnection;->getExpiration()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    return-wide v0
.end method

.method public r(I)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/g;->a0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->getHeaderField(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public s(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/g;->a0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public t(Ljava/lang/String;J)J
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/g;->a0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2, p3}, Ljava/net/HttpURLConnection;->getHeaderFieldDate(Ljava/lang/String;J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    return-wide p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public u(Ljava/lang/String;I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/g;->a0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Ljava/net/URLConnection;->getHeaderFieldInt(Ljava/lang/String;I)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public v(I)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/g;->a0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/net/HttpURLConnection;->getHeaderFieldKey(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public w(Ljava/lang/String;J)J
    .locals 2

    .line 1
    invoke-virtual {p0}, LI4/g;->a0()V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 11
    .line 12
    invoke-static {v0, p1, p2, p3}, LI4/f;->a(Ljava/net/HttpURLConnection;Ljava/lang/String;J)J

    .line 13
    .line 14
    .line 15
    move-result-wide p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-wide/16 p1, 0x0

    .line 18
    .line 19
    :goto_0
    return-wide p1
.end method

.method public x()Ljava/util/Map;
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/g;->a0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public y()J
    .locals 2

    .line 1
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/net/URLConnection;->getIfModifiedSince()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public z()Ljava/io/InputStream;
    .locals 4

    .line 1
    invoke-virtual {p0}, LI4/g;->a0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/g;->b:LG4/j;

    .line 5
    .line 6
    iget-object v1, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, LG4/j;->r(I)LG4/j;

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, LI4/g;->b:LG4/j;

    .line 16
    .line 17
    iget-object v1, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, LG4/j;->x(Ljava/lang/String;)LG4/j;

    .line 24
    .line 25
    .line 26
    :try_start_0
    iget-object v0, p0, LI4/g;->a:Ljava/net/HttpURLConnection;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    new-instance v1, LI4/a;

    .line 35
    .line 36
    iget-object v2, p0, LI4/g;->b:LG4/j;

    .line 37
    .line 38
    iget-object v3, p0, LI4/g;->e:LM4/l;

    .line 39
    .line 40
    invoke-direct {v1, v0, v2, v3}, LI4/a;-><init>(Ljava/io/InputStream;LG4/j;LM4/l;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    return-object v1

    .line 44
    :catch_0
    move-exception v0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    return-object v0

    .line 47
    :goto_0
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 48
    .line 49
    iget-object v2, p0, LI4/g;->e:LM4/l;

    .line 50
    .line 51
    invoke-virtual {v2}, LM4/l;->c()J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    invoke-virtual {v1, v2, v3}, LG4/j;->A(J)LG4/j;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, LI4/g;->b:LG4/j;

    .line 59
    .line 60
    invoke-static {v1}, LI4/j;->d(LG4/j;)V

    .line 61
    .line 62
    .line 63
    throw v0
.end method
