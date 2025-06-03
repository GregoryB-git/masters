.class public LQ3/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ls3/e;

.field public final b:LV3/p;

.field public final c:LV3/g;

.field public d:Li4/a;

.field public e:LV3/m;


# direct methods
.method public constructor <init>(Ls3/e;LV3/p;LV3/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ3/h;->a:Ls3/e;

    .line 5
    .line 6
    iput-object p2, p0, LQ3/h;->b:LV3/p;

    .line 7
    .line 8
    iput-object p3, p0, LQ3/h;->c:LV3/g;

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic a(LQ3/h;)LV3/m;
    .locals 0

    .line 1
    iget-object p0, p0, LQ3/h;->e:LV3/m;

    .line 2
    .line 3
    return-object p0
.end method

.method public static d(Ls3/e;)LQ3/h;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ls3/e;->r()Ls3/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ls3/m;->d()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Ls3/e;->r()Ls3/m;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ls3/m;->g()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v1, "https://"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ls3/e;->r()Ls3/m;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ls3/m;->g()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, "-default-rtdb.firebaseio.com"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    new-instance p0, LQ3/d;

    .line 53
    .line 54
    const-string v0, "Failed to get FirebaseDatabase instance: Can\'t determine Firebase Database URL. Be sure to include a Project ID in your configuration."

    .line 55
    .line 56
    invoke-direct {p0, v0}, LQ3/d;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0

    .line 60
    :cond_1
    :goto_0
    invoke-static {p0, v0}, LQ3/h;->e(Ls3/e;Ljava/lang/String;)LQ3/h;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method

.method public static declared-synchronized e(Ls3/e;Ljava/lang/String;)LQ3/h;
    .locals 4

    .line 1
    const-class v0, LQ3/h;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    const-string v1, "Provided FirebaseApp must not be null."

    .line 11
    .line 12
    invoke-static {p0, v1}, LA2/n;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    const-class v1, LQ3/i;

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Ls3/e;->k(Ljava/lang/Class;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, LQ3/i;

    .line 22
    .line 23
    const-string v1, "Firebase Database component is not present."

    .line 24
    .line 25
    invoke-static {p0, v1}, LA2/n;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, LY3/m;->h(Ljava/lang/String;)LY3/h;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v2, v1, LY3/h;->b:LV3/k;

    .line 33
    .line 34
    invoke-virtual {v2}, LV3/k;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    iget-object p1, v1, LY3/h;->a:LV3/p;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, LQ3/i;->a(LV3/p;)LQ3/h;

    .line 43
    .line 44
    .line 45
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    monitor-exit v0

    .line 47
    return-object p0

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    :try_start_1
    new-instance p0, LQ3/d;

    .line 51
    .line 52
    new-instance v2, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v3, "Specified Database URL \'"

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string p1, "\' is invalid. It should point to the root of a Firebase Database but it includes a path: "

    .line 66
    .line 67
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-object p1, v1, LY3/h;->b:LV3/k;

    .line 71
    .line 72
    invoke-virtual {p1}, LV3/k;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-direct {p0, p1}, LQ3/d;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p0

    .line 87
    :cond_1
    new-instance p0, LQ3/d;

    .line 88
    .line 89
    const-string p1, "Failed to get FirebaseDatabase instance: Specify DatabaseURL within FirebaseApp or from your getInstance() call."

    .line 90
    .line 91
    invoke-direct {p0, p1}, LQ3/d;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 95
    :goto_0
    monitor-exit v0

    .line 96
    throw p0
.end method

.method public static g()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "20.3.0"

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, LQ3/h;->e:LV3/m;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, LQ3/d;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v2, "Calls to "

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p1, "() must be made before any other usage of FirebaseDatabase instance."

    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-direct {v0, p1}, LQ3/d;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0
.end method

.method public final declared-synchronized c()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, LQ3/h;->e:LV3/m;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, LQ3/h;->b:LV3/p;

    .line 7
    .line 8
    iget-object v1, p0, LQ3/h;->d:Li4/a;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, LV3/p;->a(Li4/a;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, LQ3/h;->c:LV3/g;

    .line 14
    .line 15
    iget-object v1, p0, LQ3/h;->b:LV3/p;

    .line 16
    .line 17
    invoke-static {v0, v1, p0}, LV3/q;->b(LV3/f;LV3/p;LQ3/h;)LV3/m;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, LQ3/h;->e:LV3/m;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    :goto_0
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :goto_1
    monitor-exit p0

    .line 29
    throw v0
.end method

.method public f(Ljava/lang/String;)LQ3/e;
    .locals 2

    .line 1
    invoke-virtual {p0}, LQ3/h;->c()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-static {p1}, LY3/n;->i(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, LV3/k;

    .line 10
    .line 11
    invoke-direct {v0, p1}, LV3/k;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, LQ3/e;

    .line 15
    .line 16
    iget-object v1, p0, LQ3/h;->e:LV3/m;

    .line 17
    .line 18
    invoke-direct {p1, v1, v0}, LQ3/e;-><init>(LV3/m;LV3/k;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 23
    .line 24
    const-string v0, "Can\'t pass null for argument \'pathString\' in FirebaseDatabase.getReference()"

    .line 25
    .line 26
    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p1
.end method

.method public h()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LQ3/h;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LQ3/h;->e:LV3/m;

    .line 5
    .line 6
    invoke-static {v0}, LV3/q;->c(LV3/m;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public i()V
    .locals 1

    .line 1
    invoke-virtual {p0}, LQ3/h;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LQ3/h;->e:LV3/m;

    .line 5
    .line 6
    invoke-static {v0}, LV3/q;->d(LV3/m;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public j()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LQ3/h;->c()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LQ3/h;->e:LV3/m;

    .line 5
    .line 6
    new-instance v1, LQ3/h$a;

    .line 7
    .line 8
    invoke-direct {v1, p0}, LQ3/h$a;-><init>(LQ3/h;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, LV3/m;->i0(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public declared-synchronized k(LQ3/l;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "setLogLevel"

    .line 3
    .line 4
    invoke-virtual {p0, v0}, LQ3/h;->b(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LQ3/h;->c:LV3/g;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, LV3/g;->L(LQ3/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0

    .line 16
    throw p1
.end method

.method public declared-synchronized l(J)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "setPersistenceCacheSizeBytes"

    .line 3
    .line 4
    invoke-virtual {p0, v0}, LQ3/h;->b(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LQ3/h;->c:LV3/g;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, LV3/g;->M(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0

    .line 16
    throw p1
.end method

.method public declared-synchronized m(Z)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "setPersistenceEnabled"

    .line 3
    .line 4
    invoke-virtual {p0, v0}, LQ3/h;->b(Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, LQ3/h;->c:LV3/g;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, LV3/g;->N(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    monitor-exit p0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0

    .line 16
    throw p1
.end method

.method public n(Ljava/lang/String;I)V
    .locals 1

    .line 1
    iget-object v0, p0, LQ3/h;->e:LV3/m;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Li4/a;

    .line 6
    .line 7
    invoke-direct {v0, p1, p2}, Li4/a;-><init>(Ljava/lang/String;I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LQ3/h;->d:Li4/a;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string p2, "Cannot call useEmulator() after instance has already been initialized."

    .line 16
    .line 17
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1
.end method
