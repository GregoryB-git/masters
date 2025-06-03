.class public Lcom/google/firebase/remoteconfig/internal/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final q:[I

.field public static final r:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Ljava/util/Set;

.field public b:Z

.field public c:I

.field public d:Z

.field public e:Z

.field public final f:I

.field public final g:Ljava/util/concurrent/ScheduledExecutorService;

.field public final h:Lcom/google/firebase/remoteconfig/internal/c;

.field public final i:Ls3/e;

.field public final j:Ls4/i;

.field public k:LQ4/e;

.field public final l:Landroid/content/Context;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/util/Random;

.field public final o:LE2/e;

.field public final p:Lcom/google/firebase/remoteconfig/internal/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/google/firebase/remoteconfig/internal/e;->q:[I

    const-string v0, "^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/remoteconfig/internal/e;->r:Ljava/util/regex/Pattern;

    return-void

    :array_0
    .array-data 4
        0x2
        0x4
        0x8
        0x10
        0x20
        0x40
        0x80
        0x100
    .end array-data
.end method

.method public constructor <init>(Ls3/e;Ls4/i;Lcom/google/firebase/remoteconfig/internal/c;LQ4/e;Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;Lcom/google/firebase/remoteconfig/internal/d;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    iput v0, p0, Lcom/google/firebase/remoteconfig/internal/e;->f:I

    .line 7
    .line 8
    iput-object p7, p0, Lcom/google/firebase/remoteconfig/internal/e;->a:Ljava/util/Set;

    .line 9
    .line 10
    const/4 p7, 0x0

    .line 11
    iput-boolean p7, p0, Lcom/google/firebase/remoteconfig/internal/e;->b:Z

    .line 12
    .line 13
    iput-object p9, p0, Lcom/google/firebase/remoteconfig/internal/e;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 14
    .line 15
    new-instance p9, Ljava/util/Random;

    .line 16
    .line 17
    invoke-direct {p9}, Ljava/util/Random;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p9, p0, Lcom/google/firebase/remoteconfig/internal/e;->n:Ljava/util/Random;

    .line 21
    .line 22
    invoke-virtual {p8}, Lcom/google/firebase/remoteconfig/internal/d;->h()Lcom/google/firebase/remoteconfig/internal/d$b;

    .line 23
    .line 24
    .line 25
    move-result-object p9

    .line 26
    invoke-virtual {p9}, Lcom/google/firebase/remoteconfig/internal/d$b;->b()I

    .line 27
    .line 28
    .line 29
    move-result p9

    .line 30
    sub-int/2addr v0, p9

    .line 31
    const/4 p9, 0x1

    .line 32
    invoke-static {v0, p9}, Ljava/lang/Math;->max(II)I

    .line 33
    .line 34
    .line 35
    move-result p9

    .line 36
    iput p9, p0, Lcom/google/firebase/remoteconfig/internal/e;->c:I

    .line 37
    .line 38
    invoke-static {}, LE2/h;->d()LE2/e;

    .line 39
    .line 40
    .line 41
    move-result-object p9

    .line 42
    iput-object p9, p0, Lcom/google/firebase/remoteconfig/internal/e;->o:LE2/e;

    .line 43
    .line 44
    iput-object p1, p0, Lcom/google/firebase/remoteconfig/internal/e;->i:Ls3/e;

    .line 45
    .line 46
    iput-object p3, p0, Lcom/google/firebase/remoteconfig/internal/e;->h:Lcom/google/firebase/remoteconfig/internal/c;

    .line 47
    .line 48
    iput-object p2, p0, Lcom/google/firebase/remoteconfig/internal/e;->j:Ls4/i;

    .line 49
    .line 50
    iput-object p4, p0, Lcom/google/firebase/remoteconfig/internal/e;->k:LQ4/e;

    .line 51
    .line 52
    iput-object p5, p0, Lcom/google/firebase/remoteconfig/internal/e;->l:Landroid/content/Context;

    .line 53
    .line 54
    iput-object p6, p0, Lcom/google/firebase/remoteconfig/internal/e;->m:Ljava/lang/String;

    .line 55
    .line 56
    iput-object p8, p0, Lcom/google/firebase/remoteconfig/internal/e;->p:Lcom/google/firebase/remoteconfig/internal/d;

    .line 57
    .line 58
    iput-boolean p7, p0, Lcom/google/firebase/remoteconfig/internal/e;->d:Z

    .line 59
    .line 60
    iput-boolean p7, p0, Lcom/google/firebase/remoteconfig/internal/e;->e:Z

    .line 61
    .line 62
    return-void
.end method

.method public static synthetic a(Lcom/google/firebase/remoteconfig/internal/e;LV2/j;LV2/j;)LV2/j;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/firebase/remoteconfig/internal/e;->q(LV2/j;LV2/j;)LV2/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lcom/google/firebase/remoteconfig/internal/e;LV2/j;LV2/j;LV2/j;)LV2/j;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/firebase/remoteconfig/internal/e;->r(LV2/j;LV2/j;LV2/j;)LV2/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Lcom/google/firebase/remoteconfig/internal/e;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/e;->j()V

    return-void
.end method

.method public static synthetic d(Lcom/google/firebase/remoteconfig/internal/e;LP4/o;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/firebase/remoteconfig/internal/e;->u(LP4/o;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static k(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/firebase/remoteconfig/internal/e;->r:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public A(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "POST"

    invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p3}, Lcom/google/firebase/remoteconfig/internal/e;->x(Ljava/net/HttpURLConnection;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lcom/google/firebase/remoteconfig/internal/e;->i(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "utf-8"

    invoke-virtual {p2, p3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p2

    new-instance p3, Ljava/io/BufferedOutputStream;

    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    invoke-virtual {p3, p2}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p3}, Ljava/io/OutputStream;->flush()V

    invoke-virtual {p3}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public declared-synchronized B(Ljava/net/HttpURLConnection;)Lcom/google/firebase/remoteconfig/internal/a;
    .locals 8

    .line 1
    monitor-enter p0

    :try_start_0
    new-instance v5, Lcom/google/firebase/remoteconfig/internal/e$b;

    invoke-direct {v5, p0}, Lcom/google/firebase/remoteconfig/internal/e$b;-><init>(Lcom/google/firebase/remoteconfig/internal/e;)V

    new-instance v7, Lcom/google/firebase/remoteconfig/internal/a;

    iget-object v2, p0, Lcom/google/firebase/remoteconfig/internal/e;->h:Lcom/google/firebase/remoteconfig/internal/c;

    iget-object v3, p0, Lcom/google/firebase/remoteconfig/internal/e;->k:LQ4/e;

    iget-object v4, p0, Lcom/google/firebase/remoteconfig/internal/e;->a:Ljava/util/Set;

    iget-object v6, p0, Lcom/google/firebase/remoteconfig/internal/e;->g:Ljava/util/concurrent/ScheduledExecutorService;

    move-object v0, v7

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lcom/google/firebase/remoteconfig/internal/a;-><init>(Ljava/net/HttpURLConnection;Lcom/google/firebase/remoteconfig/internal/c;LQ4/e;Ljava/util/Set;LP4/c;Ljava/util/concurrent/ScheduledExecutorService;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v7

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public C()V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/remoteconfig/internal/e;->s(J)V

    return-void
.end method

.method public final D(Ljava/util/Date;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/e;->p:Lcom/google/firebase/remoteconfig/internal/d;

    invoke-virtual {v0}, Lcom/google/firebase/remoteconfig/internal/d;->h()Lcom/google/firebase/remoteconfig/internal/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/remoteconfig/internal/d$b;->b()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/firebase/remoteconfig/internal/e;->m(I)J

    move-result-wide v1

    new-instance v3, Ljava/util/Date;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    add-long/2addr v4, v1

    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    iget-object p1, p0, Lcom/google/firebase/remoteconfig/internal/e;->p:Lcom/google/firebase/remoteconfig/internal/d;

    invoke-virtual {p1, v0, v3}, Lcom/google/firebase/remoteconfig/internal/d;->o(ILjava/util/Date;)V

    return-void
.end method

.method public e()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/e;->f()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/e;->p:Lcom/google/firebase/remoteconfig/internal/d;

    invoke-virtual {v0}, Lcom/google/firebase/remoteconfig/internal/d;->h()Lcom/google/firebase/remoteconfig/internal/d$b;

    move-result-object v0

    new-instance v1, Ljava/util/Date;

    iget-object v2, p0, Lcom/google/firebase/remoteconfig/internal/e;->o:LE2/e;

    invoke-interface {v2}, LE2/e;->a()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0}, Lcom/google/firebase/remoteconfig/internal/d$b;->a()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/e;->w()V

    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/e;->h()LV2/j;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [LV2/j;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {v1}, LV2/m;->i([LV2/j;)LV2/j;

    move-result-object v1

    iget-object v2, p0, Lcom/google/firebase/remoteconfig/internal/e;->g:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v3, LQ4/n;

    invoke-direct {v3, p0, v0}, LQ4/n;-><init>(Lcom/google/firebase/remoteconfig/internal/e;LV2/j;)V

    invoke-virtual {v1, v2, v3}, LV2/j;->g(Ljava/util/concurrent/Executor;LV2/b;)LV2/j;

    return-void
.end method

.method public final declared-synchronized f()Z
    .locals 1

    .line 1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/e;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/firebase/remoteconfig/internal/e;->b:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/firebase/remoteconfig/internal/e;->d:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/firebase/remoteconfig/internal/e;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    monitor-exit p0

    return v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public g(Ljava/net/HttpURLConnection;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->disconnect()V

    :try_start_0
    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public h()LV2/j;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/e;->j:Ls4/i;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, v1}, Ls4/i;->b(Z)LV2/j;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v2, p0, Lcom/google/firebase/remoteconfig/internal/e;->j:Ls4/i;

    .line 9
    .line 10
    invoke-interface {v2}, Ls4/i;->a()LV2/j;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/4 v3, 0x2

    .line 15
    new-array v3, v3, [LV2/j;

    .line 16
    .line 17
    aput-object v0, v3, v1

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    aput-object v2, v3, v1

    .line 21
    .line 22
    invoke-static {v3}, LV2/m;->i([LV2/j;)LV2/j;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object v3, p0, Lcom/google/firebase/remoteconfig/internal/e;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 27
    .line 28
    new-instance v4, LQ4/o;

    .line 29
    .line 30
    invoke-direct {v4, p0, v0, v2}, LQ4/o;-><init>(Lcom/google/firebase/remoteconfig/internal/e;LV2/j;LV2/j;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v3, v4}, LV2/j;->h(Ljava/util/concurrent/Executor;LV2/b;)LV2/j;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0
.end method

.method public final i(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/internal/e;->i:Ls3/e;

    invoke-virtual {v1}, Ls3/e;->r()Ls3/m;

    move-result-object v1

    invoke-virtual {v1}, Ls3/m;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/firebase/remoteconfig/internal/e;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "project"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "namespace"

    iget-object v2, p0, Lcom/google/firebase/remoteconfig/internal/e;->m:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/internal/e;->h:Lcom/google/firebase/remoteconfig/internal/c;

    invoke-virtual {v1}, Lcom/google/firebase/remoteconfig/internal/c;->r()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "lastKnownVersionNumber"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/internal/e;->i:Ls3/e;

    invoke-virtual {v1}, Ls3/e;->r()Ls3/m;

    move-result-object v1

    invoke-virtual {v1}, Ls3/m;->c()Ljava/lang/String;

    move-result-object v1

    const-string v2, "appId"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "sdkVersion"

    const-string v2, "21.5.0"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "appInstanceId"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    return-object p1
.end method

.method public final declared-synchronized j()V
    .locals 1

    .line 1
    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/google/firebase/remoteconfig/internal/e;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final l()Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "FirebaseRemoteConfig"

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/google/firebase/remoteconfig/internal/e;->l:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, LE2/a;->a(Landroid/content/Context;Ljava/lang/String;)[B

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not get fingerprint hash for package: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/google/firebase/remoteconfig/internal/e;->l:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_0
    const/4 v3, 0x0

    invoke-static {v2, v3}, LE2/j;->b([BZ)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "No such package: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/google/firebase/remoteconfig/internal/e;->l:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1
.end method

.method public final m(I)J
    .locals 4

    .line 1
    sget-object v0, Lcom/google/firebase/remoteconfig/internal/e;->q:[I

    array-length v1, v0

    if-ge p1, v1, :cond_0

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    add-int/lit8 p1, p1, -0x1

    aget p1, v0, p1

    int-to-long v2, p1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    const-wide/16 v2, 0x2

    div-long v2, v0, v2

    iget-object p1, p0, Lcom/google/firebase/remoteconfig/internal/e;->n:Ljava/util/Random;

    long-to-int v0, v0

    invoke-virtual {p1, v0}, Ljava/util/Random;->nextInt(I)I

    move-result p1

    int-to-long v0, p1

    add-long/2addr v2, v0

    return-wide v2
.end method

.method public final n(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/e;->i:Ls3/e;

    invoke-virtual {v0}, Ls3/e;->r()Ls3/m;

    move-result-object v0

    invoke-virtual {v0}, Ls3/m;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/firebase/remoteconfig/internal/e;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const/4 v0, 0x1

    aput-object p1, v1, v0

    const-string p1, "https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final o()Ljava/net/URL;
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Ljava/net/URL;

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/internal/e;->m:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/google/firebase/remoteconfig/internal/e;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "FirebaseRemoteConfig"

    const-string v1, "URL is malformed"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final p(I)Z
    .locals 1

    .line 1
    const/16 v0, 0x198

    if-eq p1, v0, :cond_1

    const/16 v0, 0x1ad

    if-eq p1, v0, :cond_1

    const/16 v0, 0x1f6

    if-eq p1, v0, :cond_1

    const/16 v0, 0x1f7

    if-eq p1, v0, :cond_1

    const/16 v0, 0x1f8

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final synthetic q(LV2/j;LV2/j;)LV2/j;
    .locals 11

    .line 1
    const/4 p2, 0x0

    .line 2
    const/4 v0, 0x1

    .line 3
    const-string v1, "Unable to connect to the server. Try again in a few minutes. HTTP status code: %d"

    .line 4
    .line 5
    const/16 v2, 0x193

    .line 6
    .line 7
    const/16 v3, 0xc8

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    :try_start_0
    invoke-virtual {p1}, LV2/j;->n()Z

    .line 11
    .line 12
    .line 13
    move-result v5

    .line 14
    if-eqz v5, :cond_5

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/google/firebase/remoteconfig/internal/e;->y(Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, LV2/j;->j()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Ljava/net/HttpURLConnection;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 24
    .line 25
    :try_start_1
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v6
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    if-ne v5, v3, :cond_0

    .line 34
    .line 35
    :try_start_2
    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/e;->v()V

    .line 36
    .line 37
    .line 38
    iget-object v7, p0, Lcom/google/firebase/remoteconfig/internal/e;->p:Lcom/google/firebase/remoteconfig/internal/d;

    .line 39
    .line 40
    invoke-virtual {v7}, Lcom/google/firebase/remoteconfig/internal/d;->j()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lcom/google/firebase/remoteconfig/internal/e;->B(Ljava/net/HttpURLConnection;)Lcom/google/firebase/remoteconfig/internal/a;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-virtual {v7}, Lcom/google/firebase/remoteconfig/internal/a;->i()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v4

    .line 52
    goto/16 :goto_7

    .line 53
    .line 54
    :catch_0
    move-exception v5

    .line 55
    goto :goto_3

    .line 56
    :cond_0
    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/firebase/remoteconfig/internal/e;->g(Ljava/net/HttpURLConnection;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p2}, Lcom/google/firebase/remoteconfig/internal/e;->y(Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v5}, Lcom/google/firebase/remoteconfig/internal/e;->p(I)Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eqz v7, :cond_1

    .line 67
    .line 68
    new-instance v8, Ljava/util/Date;

    .line 69
    .line 70
    iget-object v9, p0, Lcom/google/firebase/remoteconfig/internal/e;->o:LE2/e;

    .line 71
    .line 72
    invoke-interface {v9}, LE2/e;->a()J

    .line 73
    .line 74
    .line 75
    move-result-wide v9

    .line 76
    invoke-direct {v8, v9, v10}, Ljava/util/Date;-><init>(J)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v8}, Lcom/google/firebase/remoteconfig/internal/e;->D(Ljava/util/Date;)V

    .line 80
    .line 81
    .line 82
    :cond_1
    if-nez v7, :cond_4

    .line 83
    .line 84
    if-ne v5, v3, :cond_2

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    new-array v0, v0, [Ljava/lang/Object;

    .line 88
    .line 89
    aput-object v6, v0, p2

    .line 90
    .line 91
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    if-ne v5, v2, :cond_3

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p0, p1}, Lcom/google/firebase/remoteconfig/internal/e;->t(Ljava/io/InputStream;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    :cond_3
    new-instance p1, LP4/r;

    .line 106
    .line 107
    sget-object v0, LP4/o$a;->q:LP4/o$a;

    .line 108
    .line 109
    invoke-direct {p1, v5, p2, v0}, LP4/r;-><init>(ILjava/lang/String;LP4/o$a;)V

    .line 110
    .line 111
    .line 112
    :goto_1
    invoke-virtual {p0, p1}, Lcom/google/firebase/remoteconfig/internal/e;->u(LP4/o;)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_6

    .line 116
    .line 117
    :cond_4
    :goto_2
    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/e;->w()V

    .line 118
    .line 119
    .line 120
    goto/16 :goto_6

    .line 121
    .line 122
    :catchall_1
    move-exception v5

    .line 123
    move-object v6, v4

    .line 124
    move-object v4, v5

    .line 125
    goto/16 :goto_7

    .line 126
    .line 127
    :catch_1
    move-exception v5

    .line 128
    move-object v6, v4

    .line 129
    goto :goto_3

    .line 130
    :catchall_2
    move-exception p1

    .line 131
    move-object v6, v4

    .line 132
    move-object v4, p1

    .line 133
    move-object p1, v6

    .line 134
    goto/16 :goto_7

    .line 135
    .line 136
    :catch_2
    move-exception v5

    .line 137
    move-object p1, v4

    .line 138
    move-object v6, p1

    .line 139
    goto :goto_3

    .line 140
    :cond_5
    :try_start_3
    new-instance v5, Ljava/io/IOException;

    .line 141
    .line 142
    invoke-virtual {p1}, LV2/j;->i()Ljava/lang/Exception;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-direct {v5, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    throw v5
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 150
    :goto_3
    :try_start_4
    const-string v7, "FirebaseRemoteConfig"

    .line 151
    .line 152
    const-string v8, "Exception connecting to real-time RC backend. Retrying the connection..."

    .line 153
    .line 154
    invoke-static {v7, v8, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, p1}, Lcom/google/firebase/remoteconfig/internal/e;->g(Ljava/net/HttpURLConnection;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, p2}, Lcom/google/firebase/remoteconfig/internal/e;->y(Z)V

    .line 161
    .line 162
    .line 163
    if-eqz v6, :cond_7

    .line 164
    .line 165
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    invoke-virtual {p0, v5}, Lcom/google/firebase/remoteconfig/internal/e;->p(I)Z

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    if-eqz v5, :cond_6

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_6
    move v5, p2

    .line 177
    goto :goto_5

    .line 178
    :cond_7
    :goto_4
    move v5, v0

    .line 179
    :goto_5
    if-eqz v5, :cond_8

    .line 180
    .line 181
    new-instance v7, Ljava/util/Date;

    .line 182
    .line 183
    iget-object v8, p0, Lcom/google/firebase/remoteconfig/internal/e;->o:LE2/e;

    .line 184
    .line 185
    invoke-interface {v8}, LE2/e;->a()J

    .line 186
    .line 187
    .line 188
    move-result-wide v8

    .line 189
    invoke-direct {v7, v8, v9}, Ljava/util/Date;-><init>(J)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, v7}, Lcom/google/firebase/remoteconfig/internal/e;->D(Ljava/util/Date;)V

    .line 193
    .line 194
    .line 195
    :cond_8
    if-nez v5, :cond_4

    .line 196
    .line 197
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    if-ne v5, v3, :cond_9

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_9
    new-array v0, v0, [Ljava/lang/Object;

    .line 205
    .line 206
    aput-object v6, v0, p2

    .line 207
    .line 208
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    if-ne v0, v2, :cond_a

    .line 217
    .line 218
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    invoke-virtual {p0, p1}, Lcom/google/firebase/remoteconfig/internal/e;->t(Ljava/io/InputStream;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    :cond_a
    new-instance p1, LP4/r;

    .line 227
    .line 228
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    sget-object v1, LP4/o$a;->q:LP4/o$a;

    .line 233
    .line 234
    invoke-direct {p1, v0, p2, v1}, LP4/r;-><init>(ILjava/lang/String;LP4/o$a;)V

    .line 235
    .line 236
    .line 237
    goto :goto_1

    .line 238
    :goto_6
    invoke-static {v4}, LV2/m;->e(Ljava/lang/Object;)LV2/j;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    return-object p1

    .line 243
    :goto_7
    invoke-virtual {p0, p1}, Lcom/google/firebase/remoteconfig/internal/e;->g(Ljava/net/HttpURLConnection;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p0, p2}, Lcom/google/firebase/remoteconfig/internal/e;->y(Z)V

    .line 247
    .line 248
    .line 249
    if-eqz v6, :cond_c

    .line 250
    .line 251
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 252
    .line 253
    .line 254
    move-result v5

    .line 255
    invoke-virtual {p0, v5}, Lcom/google/firebase/remoteconfig/internal/e;->p(I)Z

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    if-eqz v5, :cond_b

    .line 260
    .line 261
    goto :goto_8

    .line 262
    :cond_b
    move v5, p2

    .line 263
    goto :goto_9

    .line 264
    :cond_c
    :goto_8
    move v5, v0

    .line 265
    :goto_9
    if-eqz v5, :cond_d

    .line 266
    .line 267
    new-instance v7, Ljava/util/Date;

    .line 268
    .line 269
    iget-object v8, p0, Lcom/google/firebase/remoteconfig/internal/e;->o:LE2/e;

    .line 270
    .line 271
    invoke-interface {v8}, LE2/e;->a()J

    .line 272
    .line 273
    .line 274
    move-result-wide v8

    .line 275
    invoke-direct {v7, v8, v9}, Ljava/util/Date;-><init>(J)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0, v7}, Lcom/google/firebase/remoteconfig/internal/e;->D(Ljava/util/Date;)V

    .line 279
    .line 280
    .line 281
    :cond_d
    if-nez v5, :cond_f

    .line 282
    .line 283
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 284
    .line 285
    .line 286
    move-result v5

    .line 287
    if-eq v5, v3, :cond_f

    .line 288
    .line 289
    new-array v0, v0, [Ljava/lang/Object;

    .line 290
    .line 291
    aput-object v6, v0, p2

    .line 292
    .line 293
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p2

    .line 297
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    if-ne v0, v2, :cond_e

    .line 302
    .line 303
    invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    invoke-virtual {p0, p1}, Lcom/google/firebase/remoteconfig/internal/e;->t(Ljava/io/InputStream;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object p2

    .line 311
    :cond_e
    new-instance p1, LP4/r;

    .line 312
    .line 313
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    sget-object v1, LP4/o$a;->q:LP4/o$a;

    .line 318
    .line 319
    invoke-direct {p1, v0, p2, v1}, LP4/r;-><init>(ILjava/lang/String;LP4/o$a;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {p0, p1}, Lcom/google/firebase/remoteconfig/internal/e;->u(LP4/o;)V

    .line 323
    .line 324
    .line 325
    goto :goto_a

    .line 326
    :cond_f
    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/e;->w()V

    .line 327
    .line 328
    .line 329
    :goto_a
    throw v4
.end method

.method public final synthetic r(LV2/j;LV2/j;LV2/j;)LV2/j;
    .locals 0

    .line 1
    invoke-virtual {p1}, LV2/j;->n()Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    new-instance p2, LP4/n;

    .line 8
    .line 9
    const-string p3, "Firebase Installations failed to get installation auth token for config update listener connection."

    .line 10
    .line 11
    invoke-virtual {p1}, LV2/j;->i()Ljava/lang/Exception;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-direct {p2, p3, p1}, LP4/n;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p2}, LV2/m;->d(Ljava/lang/Exception;)LV2/j;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_0
    invoke-virtual {p2}, LV2/j;->n()Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-nez p3, :cond_1

    .line 28
    .line 29
    new-instance p1, LP4/n;

    .line 30
    .line 31
    const-string p3, "Firebase Installations failed to get installation ID for config update listener connection."

    .line 32
    .line 33
    invoke-virtual {p2}, LV2/j;->i()Ljava/lang/Exception;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-direct {p1, p3, p2}, LP4/n;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, LV2/m;->d(Ljava/lang/Exception;)LV2/j;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/e;->o()Ljava/net/URL;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    invoke-virtual {p3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 50
    .line 51
    .line 52
    move-result-object p3

    .line 53
    check-cast p3, Ljava/net/HttpURLConnection;

    .line 54
    .line 55
    invoke-virtual {p1}, LV2/j;->j()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Ls4/n;

    .line 60
    .line 61
    invoke-virtual {p1}, Ls4/n;->b()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p2}, LV2/j;->j()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    check-cast p2, Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {p0, p3, p2, p1}, Lcom/google/firebase/remoteconfig/internal/e;->A(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    .line 73
    .line 74
    invoke-static {p3}, LV2/m;->e(Ljava/lang/Object;)LV2/j;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :catch_0
    move-exception p1

    .line 80
    new-instance p2, LP4/n;

    .line 81
    .line 82
    const-string p3, "Failed to open HTTP stream connection"

    .line 83
    .line 84
    invoke-direct {p2, p3, p1}, LP4/n;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p2}, LV2/m;->d(Ljava/lang/Exception;)LV2/j;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    return-object p1
.end method

.method public final declared-synchronized s(J)V
    .locals 3

    .line 1
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/e;->f()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget v0, p0, Lcom/google/firebase/remoteconfig/internal/e;->c:I

    if-lez v0, :cond_1

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/google/firebase/remoteconfig/internal/e;->c:I

    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/e;->g:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/google/firebase/remoteconfig/internal/e$a;

    invoke-direct {v1, p0}, Lcom/google/firebase/remoteconfig/internal/e$a;-><init>(Lcom/google/firebase/remoteconfig/internal/e;)V

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, p1, p2, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    iget-boolean p1, p0, Lcom/google/firebase/remoteconfig/internal/e;->e:Z

    if-nez p1, :cond_2

    new-instance p1, LP4/n;

    const-string p2, "Unable to connect to the server. Check your connection and try again."

    sget-object v0, LP4/o$a;->q:LP4/o$a;

    invoke-direct {p1, p2, v0}, LP4/n;-><init>(Ljava/lang/String;LP4/o$a;)V

    invoke-virtual {p0, p1}, Lcom/google/firebase/remoteconfig/internal/e;->u(LP4/o;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final t(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-direct {v2, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    :goto_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    if-nez p1, :cond_0

    const-string p1, "Unable to connect to the server, access is forbidden. HTTP status code: 403"

    return-object p1

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final declared-synchronized u(LP4/o;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/google/firebase/remoteconfig/internal/e;->a:Ljava/util/Set;

    .line 3
    .line 4
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, LP4/c;

    .line 19
    .line 20
    invoke-interface {v1, p1}, LP4/c;->a(LP4/o;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :goto_1
    monitor-exit p0

    .line 29
    throw p1
.end method

.method public final declared-synchronized v()V
    .locals 1

    .line 1
    monitor-enter p0

    const/16 v0, 0x8

    :try_start_0
    iput v0, p0, Lcom/google/firebase/remoteconfig/internal/e;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized w()V
    .locals 5

    .line 1
    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/Date;

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/internal/e;->o:LE2/e;

    invoke-interface {v1}, LE2/e;->a()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iget-object v1, p0, Lcom/google/firebase/remoteconfig/internal/e;->p:Lcom/google/firebase/remoteconfig/internal/d;

    invoke-virtual {v1}, Lcom/google/firebase/remoteconfig/internal/d;->h()Lcom/google/firebase/remoteconfig/internal/d$b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/remoteconfig/internal/d$b;->a()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lcom/google/firebase/remoteconfig/internal/e;->s(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final x(Ljava/net/HttpURLConnection;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "X-Goog-Firebase-Installations-Auth"

    invoke-virtual {p1, v0, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/firebase/remoteconfig/internal/e;->i:Ls3/e;

    invoke-virtual {p2}, Ls3/e;->r()Ls3/m;

    move-result-object p2

    invoke-virtual {p2}, Ls3/m;->b()Ljava/lang/String;

    move-result-object p2

    const-string v0, "X-Goog-Api-Key"

    invoke-virtual {p1, v0, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/google/firebase/remoteconfig/internal/e;->l:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    const-string v0, "X-Android-Package"

    invoke-virtual {p1, v0, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "X-Android-Cert"

    invoke-virtual {p0}, Lcom/google/firebase/remoteconfig/internal/e;->l()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "X-Google-GFE-Can-Retry"

    const-string v0, "yes"

    invoke-virtual {p1, p2, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "X-Accept-Response-Streaming"

    const-string v0, "true"

    invoke-virtual {p1, p2, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "Content-Type"

    const-string v0, "application/json"

    invoke-virtual {p1, p2, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "Accept"

    invoke-virtual {p1, p2, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final declared-synchronized y(Z)V
    .locals 0

    .line 1
    monitor-enter p0

    :try_start_0
    iput-boolean p1, p0, Lcom/google/firebase/remoteconfig/internal/e;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public z(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/firebase/remoteconfig/internal/e;->e:Z

    return-void
.end method
