.class public Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LM4/n;LL4/k;LM4/l;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p2}, LM4/l;->g()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, LM4/l;->e()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    invoke-static {p1}, LG4/j;->h(LL4/k;)LG4/j;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :try_start_0
    invoke-virtual {p0}, LM4/n;->a()Ljava/net/URLConnection;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    instance-of v3, v2, Ljavax/net/ssl/HttpsURLConnection;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    new-instance v3, LI4/d;

    .line 21
    .line 22
    check-cast v2, Ljavax/net/ssl/HttpsURLConnection;

    .line 23
    .line 24
    invoke-direct {v3, v2, p2, p1}, LI4/d;-><init>(Ljavax/net/ssl/HttpsURLConnection;LM4/l;LG4/j;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, LI4/d;->getContent()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :catch_0
    move-exception v2

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    instance-of v3, v2, Ljava/net/HttpURLConnection;

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    new-instance v3, LI4/c;

    .line 39
    .line 40
    check-cast v2, Ljava/net/HttpURLConnection;

    .line 41
    .line 42
    invoke-direct {v3, v2, p2, p1}, LI4/c;-><init>(Ljava/net/HttpURLConnection;LM4/l;LG4/j;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, LI4/c;->getContent()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_1
    invoke-virtual {v2}, Ljava/net/URLConnection;->getContent()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    return-object p0

    .line 55
    :goto_0
    invoke-virtual {p1, v0, v1}, LG4/j;->w(J)LG4/j;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, LM4/l;->c()J

    .line 59
    .line 60
    .line 61
    move-result-wide v0

    .line 62
    invoke-virtual {p1, v0, v1}, LG4/j;->A(J)LG4/j;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, LM4/n;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p1, p0}, LG4/j;->C(Ljava/lang/String;)LG4/j;

    .line 70
    .line 71
    .line 72
    invoke-static {p1}, LI4/j;->d(LG4/j;)V

    .line 73
    .line 74
    .line 75
    throw v2
.end method

.method public static b(LM4/n;[Ljava/lang/Class;LL4/k;LM4/l;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p3}, LM4/l;->g()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, LM4/l;->e()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    invoke-static {p2}, LG4/j;->h(LL4/k;)LG4/j;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    :try_start_0
    invoke-virtual {p0}, LM4/n;->a()Ljava/net/URLConnection;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    instance-of v3, v2, Ljavax/net/ssl/HttpsURLConnection;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    new-instance v3, LI4/d;

    .line 21
    .line 22
    check-cast v2, Ljavax/net/ssl/HttpsURLConnection;

    .line 23
    .line 24
    invoke-direct {v3, v2, p3, p2}, LI4/d;-><init>(Ljavax/net/ssl/HttpsURLConnection;LM4/l;LG4/j;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, p1}, LI4/d;->getContent([Ljava/lang/Class;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :catch_0
    move-exception p1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    instance-of v3, v2, Ljava/net/HttpURLConnection;

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    new-instance v3, LI4/c;

    .line 39
    .line 40
    check-cast v2, Ljava/net/HttpURLConnection;

    .line 41
    .line 42
    invoke-direct {v3, v2, p3, p2}, LI4/c;-><init>(Ljava/net/HttpURLConnection;LM4/l;LG4/j;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, p1}, LI4/c;->getContent([Ljava/lang/Class;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_1
    invoke-virtual {v2, p1}, Ljava/net/URLConnection;->getContent([Ljava/lang/Class;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    return-object p0

    .line 55
    :goto_0
    invoke-virtual {p2, v0, v1}, LG4/j;->w(J)LG4/j;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p3}, LM4/l;->c()J

    .line 59
    .line 60
    .line 61
    move-result-wide v0

    .line 62
    invoke-virtual {p2, v0, v1}, LG4/j;->A(J)LG4/j;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, LM4/n;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p2, p0}, LG4/j;->C(Ljava/lang/String;)LG4/j;

    .line 70
    .line 71
    .line 72
    invoke-static {p2}, LI4/j;->d(LG4/j;)V

    .line 73
    .line 74
    .line 75
    throw p1
.end method

.method public static c(LM4/n;LL4/k;LM4/l;)Ljava/io/InputStream;
    .locals 4

    .line 1
    invoke-virtual {p2}, LM4/l;->g()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, LM4/l;->e()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    invoke-static {p1}, LG4/j;->h(LL4/k;)LG4/j;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :try_start_0
    invoke-virtual {p0}, LM4/n;->a()Ljava/net/URLConnection;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    instance-of v3, v2, Ljavax/net/ssl/HttpsURLConnection;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    new-instance v3, LI4/d;

    .line 21
    .line 22
    check-cast v2, Ljavax/net/ssl/HttpsURLConnection;

    .line 23
    .line 24
    invoke-direct {v3, v2, p2, p1}, LI4/d;-><init>(Ljavax/net/ssl/HttpsURLConnection;LM4/l;LG4/j;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, LI4/d;->getInputStream()Ljava/io/InputStream;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :catch_0
    move-exception v2

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    instance-of v3, v2, Ljava/net/HttpURLConnection;

    .line 35
    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    new-instance v3, LI4/c;

    .line 39
    .line 40
    check-cast v2, Ljava/net/HttpURLConnection;

    .line 41
    .line 42
    invoke-direct {v3, v2, p2, p1}, LI4/c;-><init>(Ljava/net/HttpURLConnection;LM4/l;LG4/j;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3}, LI4/c;->getInputStream()Ljava/io/InputStream;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :cond_1
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 51
    .line 52
    .line 53
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    return-object p0

    .line 55
    :goto_0
    invoke-virtual {p1, v0, v1}, LG4/j;->w(J)LG4/j;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, LM4/l;->c()J

    .line 59
    .line 60
    .line 61
    move-result-wide v0

    .line 62
    invoke-virtual {p1, v0, v1}, LG4/j;->A(J)LG4/j;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, LM4/n;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p1, p0}, LG4/j;->C(Ljava/lang/String;)LG4/j;

    .line 70
    .line 71
    .line 72
    invoke-static {p1}, LI4/j;->d(LG4/j;)V

    .line 73
    .line 74
    .line 75
    throw v2
.end method

.method public static getContent(Ljava/net/URL;)Ljava/lang/Object;
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    new-instance v0, LM4/n;

    invoke-direct {v0, p0}, LM4/n;-><init>(Ljava/net/URL;)V

    invoke-static {}, LL4/k;->l()LL4/k;

    move-result-object p0

    new-instance v1, LM4/l;

    invoke-direct {v1}, LM4/l;-><init>()V

    invoke-static {v0, p0, v1}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->a(LM4/n;LL4/k;LM4/l;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static getContent(Ljava/net/URL;[Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 2
    new-instance v0, LM4/n;

    invoke-direct {v0, p0}, LM4/n;-><init>(Ljava/net/URL;)V

    invoke-static {}, LL4/k;->l()LL4/k;

    move-result-object p0

    new-instance v1, LM4/l;

    invoke-direct {v1}, LM4/l;-><init>()V

    invoke-static {v0, p1, p0, v1}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->b(LM4/n;[Ljava/lang/Class;LL4/k;LM4/l;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static instrument(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    instance-of v0, p0, Ljavax/net/ssl/HttpsURLConnection;

    if-eqz v0, :cond_0

    new-instance v0, LI4/d;

    check-cast p0, Ljavax/net/ssl/HttpsURLConnection;

    new-instance v1, LM4/l;

    invoke-direct {v1}, LM4/l;-><init>()V

    invoke-static {}, LL4/k;->l()LL4/k;

    move-result-object v2

    invoke-static {v2}, LG4/j;->h(LL4/k;)LG4/j;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, LI4/d;-><init>(Ljavax/net/ssl/HttpsURLConnection;LM4/l;LG4/j;)V

    return-object v0

    :cond_0
    instance-of v0, p0, Ljava/net/HttpURLConnection;

    if-eqz v0, :cond_1

    new-instance v0, LI4/c;

    check-cast p0, Ljava/net/HttpURLConnection;

    new-instance v1, LM4/l;

    invoke-direct {v1}, LM4/l;-><init>()V

    invoke-static {}, LL4/k;->l()LL4/k;

    move-result-object v2

    invoke-static {v2}, LG4/j;->h(LL4/k;)LG4/j;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, LI4/c;-><init>(Ljava/net/HttpURLConnection;LM4/l;LG4/j;)V

    return-object v0

    :cond_1
    return-object p0
.end method

.method public static openStream(Ljava/net/URL;)Ljava/io/InputStream;
    .locals 2
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    new-instance v0, LM4/n;

    invoke-direct {v0, p0}, LM4/n;-><init>(Ljava/net/URL;)V

    invoke-static {}, LL4/k;->l()LL4/k;

    move-result-object p0

    new-instance v1, LM4/l;

    invoke-direct {v1}, LM4/l;-><init>()V

    invoke-static {v0, p0, v1}, Lcom/google/firebase/perf/network/FirebasePerfUrlConnection;->c(LM4/n;LL4/k;LM4/l;)Ljava/io/InputStream;

    move-result-object p0

    return-object p0
.end method
