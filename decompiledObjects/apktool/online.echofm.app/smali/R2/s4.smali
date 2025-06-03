.class public final LR2/s4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final o:Ljava/net/URL;

.field public final p:[B

.field public final q:LR2/p4;

.field public final r:Ljava/lang/String;

.field public final s:Ljava/util/Map;

.field public final synthetic t:LR2/q4;


# direct methods
.method public constructor <init>(LR2/q4;Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map;LR2/p4;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/s4;->t:LR2/q4;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-static {p3}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    invoke-static {p6}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iput-object p3, p0, LR2/s4;->o:Ljava/net/URL;

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, LR2/s4;->p:[B

    .line 19
    .line 20
    iput-object p6, p0, LR2/s4;->q:LR2/p4;

    .line 21
    .line 22
    iput-object p2, p0, LR2/s4;->r:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p1, p0, LR2/s4;->s:Ljava/util/Map;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final synthetic a(ILjava/lang/Exception;[BLjava/util/Map;)V
    .locals 6

    .line 1
    iget-object v0, p0, LR2/s4;->q:LR2/p4;

    .line 2
    .line 3
    iget-object v1, p0, LR2/s4;->r:Ljava/lang/String;

    .line 4
    .line 5
    move v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move-object v4, p3

    .line 8
    move-object v5, p4

    .line 9
    invoke-interface/range {v0 .. v5}, LR2/p4;->a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final b(ILjava/lang/Exception;[BLjava/util/Map;)V
    .locals 8

    .line 1
    iget-object v0, p0, LR2/s4;->t:LR2/q4;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/m3;->e()LR2/G2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v7, LR2/r4;

    .line 8
    .line 9
    move-object v1, v7

    .line 10
    move-object v2, p0

    .line 11
    move v3, p1

    .line 12
    move-object v4, p2

    .line 13
    move-object v5, p3

    .line 14
    move-object v6, p4

    .line 15
    invoke-direct/range {v1 .. v6}, LR2/r4;-><init>(LR2/s4;ILjava/lang/Exception;[BLjava/util/Map;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v7}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, LR2/s4;->t:LR2/q4;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/m3;->l()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x0

    .line 8
    :try_start_0
    iget-object v2, p0, LR2/s4;->o:Ljava/net/URL;

    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/gms/internal/measurement/h0;->a()Lcom/google/android/gms/internal/measurement/h0;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    const-string v4, "client-measurement"

    .line 15
    .line 16
    invoke-virtual {v3, v2, v4}, Lcom/google/android/gms/internal/measurement/h0;->b(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URLConnection;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    instance-of v3, v2, Ljava/net/HttpURLConnection;

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    check-cast v2, Ljava/net/HttpURLConnection;

    .line 25
    .line 26
    invoke-virtual {v2, v1}, Ljava/net/URLConnection;->setDefaultUseCaches(Z)V

    .line 27
    .line 28
    .line 29
    const v3, 0xea60

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 33
    .line 34
    .line 35
    const v3, 0xee48

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 42
    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    invoke-virtual {v2, v3}, Ljava/net/URLConnection;->setDoInput(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 46
    .line 47
    .line 48
    :try_start_1
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-virtual {v2}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 53
    .line 54
    .line 55
    move-result-object v3
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    :try_start_2
    iget-object v4, p0, LR2/s4;->t:LR2/q4;

    .line 57
    .line 58
    invoke-static {v4, v2}, LR2/q4;->u(LR2/q4;Ljava/net/HttpURLConnection;)[B

    .line 59
    .line 60
    .line 61
    move-result-object v4
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v1, v0, v4, v3}, LR2/s4;->b(ILjava/lang/Exception;[BLjava/util/Map;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :catchall_0
    move-exception v4

    .line 70
    goto :goto_0

    .line 71
    :catch_0
    move-exception v4

    .line 72
    goto :goto_1

    .line 73
    :catchall_1
    move-exception v4

    .line 74
    move-object v3, v0

    .line 75
    goto :goto_0

    .line 76
    :catch_1
    move-exception v4

    .line 77
    move-object v3, v0

    .line 78
    goto :goto_1

    .line 79
    :catchall_2
    move-exception v4

    .line 80
    move-object v2, v0

    .line 81
    move-object v3, v2

    .line 82
    goto :goto_0

    .line 83
    :catch_2
    move-exception v4

    .line 84
    move-object v2, v0

    .line 85
    move-object v3, v2

    .line 86
    goto :goto_1

    .line 87
    :cond_0
    :try_start_3
    new-instance v2, Ljava/io/IOException;

    .line 88
    .line 89
    const-string v3, "Failed to obtain HTTP connection"

    .line 90
    .line 91
    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw v2
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 95
    :goto_0
    if-eqz v2, :cond_1

    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 98
    .line 99
    .line 100
    :cond_1
    invoke-virtual {p0, v1, v0, v0, v3}, LR2/s4;->b(ILjava/lang/Exception;[BLjava/util/Map;)V

    .line 101
    .line 102
    .line 103
    throw v4

    .line 104
    :goto_1
    if-eqz v2, :cond_2

    .line 105
    .line 106
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 107
    .line 108
    .line 109
    :cond_2
    invoke-virtual {p0, v1, v4, v0, v3}, LR2/s4;->b(ILjava/lang/Exception;[BLjava/util/Map;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method
