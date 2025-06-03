.class public final Lgb/r1$m;
.super Le9/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "m"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgb/r1$m$e;
    }
.end annotation


# instance fields
.field public final b:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Leb/d0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/String;

.field public final d:Lgb/r1$m$a;

.field public final synthetic e:Lgb/r1;


# direct methods
.method public constructor <init>(Lgb/r1;Ljava/lang/String;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lgb/r1$m;->e:Lgb/r1;

    .line 2
    .line 3
    invoke-direct {p0}, Le9/a;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    sget-object v0, Lgb/r1;->k0:Lgb/r1$a;

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lgb/r1$m;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    new-instance p1, Lgb/r1$m$a;

    .line 16
    .line 17
    invoke-direct {p1, p0}, Lgb/r1$m$a;-><init>(Lgb/r1$m;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lgb/r1$m;->d:Lgb/r1$m$a;

    .line 21
    .line 22
    const-string p1, "authority"

    .line 23
    .line 24
    invoke-static {p2, p1}, Lx6/b;->y(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object p2, p0, Lgb/r1$m;->c:Ljava/lang/String;

    .line 28
    .line 29
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method


# virtual methods
.method public final C(Leb/t0;Leb/c;)Leb/e;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Leb/t0<",
            "TReqT;TRespT;>;",
            "Leb/c;",
            ")",
            "Leb/e<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lgb/r1$m;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, Leb/d0;

    .line 9
    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    instance-of v0, v2, Lgb/g2$b;

    .line 14
    .line 15
    if-eqz v0, :cond_4

    .line 16
    .line 17
    check-cast v2, Lgb/g2$b;

    .line 18
    .line 19
    iget-object v0, v2, Lgb/g2$b;->b:Lgb/g2;

    .line 20
    .line 21
    iget-object v1, v0, Lgb/g2;->b:Ljava/util/Map;

    .line 22
    .line 23
    iget-object v2, p1, Leb/t0;->b:Ljava/lang/String;

    .line 24
    .line 25
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lgb/g2$a;

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    iget-object v1, p1, Leb/t0;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v2, v0, Lgb/g2;->c:Ljava/util/Map;

    .line 36
    .line 37
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lgb/g2$a;

    .line 42
    .line 43
    :cond_1
    if-nez v1, :cond_2

    .line 44
    .line 45
    iget-object v1, v0, Lgb/g2;->a:Lgb/g2$a;

    .line 46
    .line 47
    :cond_2
    if-eqz v1, :cond_3

    .line 48
    .line 49
    sget-object v0, Lgb/g2$a;->g:Leb/c$b;

    .line 50
    .line 51
    invoke-virtual {p2, v0, v1}, Leb/c;->c(Leb/c$b;Ljava/lang/Object;)Leb/c;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    :cond_3
    :goto_0
    iget-object v0, p0, Lgb/r1$m;->d:Lgb/r1$m$a;

    .line 56
    .line 57
    invoke-virtual {v0, p1, p2}, Lgb/r1$m$a;->v(Leb/t0;Leb/c;)Leb/e;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :cond_4
    new-instance v0, Lgb/r1$f;

    .line 63
    .line 64
    iget-object v3, p0, Lgb/r1$m;->d:Lgb/r1$m$a;

    .line 65
    .line 66
    iget-object v1, p0, Lgb/r1$m;->e:Lgb/r1;

    .line 67
    .line 68
    iget-object v4, v1, Lgb/r1;->i:Ljava/util/concurrent/Executor;

    .line 69
    .line 70
    move-object v1, v0

    .line 71
    move-object v5, p1

    .line 72
    move-object v6, p2

    .line 73
    invoke-direct/range {v1 .. v6}, Lgb/r1$f;-><init>(Leb/d0;Lgb/r1$m$a;Ljava/util/concurrent/Executor;Leb/t0;Leb/c;)V

    .line 74
    .line 75
    .line 76
    return-object v0
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final D(Leb/d0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lgb/r1$m;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Leb/d0;

    .line 8
    .line 9
    iget-object v1, p0, Lgb/r1$m;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object p1, Lgb/r1;->k0:Lgb/r1$a;

    .line 15
    .line 16
    if-ne v0, p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Lgb/r1$m;->e:Lgb/r1;

    .line 19
    .line 20
    iget-object p1, p1, Lgb/r1;->C:Ljava/util/Collection;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lgb/r1$m$e;

    .line 39
    .line 40
    invoke-virtual {v0}, Lgb/r1$m$e;->j()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lgb/r1$m;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final v(Leb/t0;Leb/c;)Leb/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Leb/t0<",
            "TReqT;TRespT;>;",
            "Leb/c;",
            ")",
            "Leb/e<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lgb/r1$m;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lgb/r1;->k0:Lgb/r1$a;

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Lgb/r1$m;->C(Leb/t0;Leb/c;)Leb/e;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    iget-object v0, p0, Lgb/r1$m;->e:Lgb/r1;

    .line 17
    .line 18
    iget-object v0, v0, Lgb/r1;->n:Leb/h1;

    .line 19
    .line 20
    new-instance v2, Lgb/r1$m$b;

    .line 21
    .line 22
    invoke-direct {v2, p0}, Lgb/r1$m$b;-><init>(Lgb/r1$m;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lgb/r1$m;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eq v0, v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0, p1, p2}, Lgb/r1$m;->C(Leb/t0;Leb/c;)Leb/e;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    return-object p1

    .line 41
    :cond_1
    iget-object v0, p0, Lgb/r1$m;->e:Lgb/r1;

    .line 42
    .line 43
    iget-object v0, v0, Lgb/r1;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    new-instance p1, Lgb/r1$m$c;

    .line 52
    .line 53
    invoke-direct {p1}, Lgb/r1$m$c;-><init>()V

    .line 54
    .line 55
    .line 56
    return-object p1

    .line 57
    :cond_2
    invoke-static {}, Leb/p;->b()Leb/p;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v1, Lgb/r1$m$e;

    .line 62
    .line 63
    invoke-direct {v1, p0, v0, p1, p2}, Lgb/r1$m$e;-><init>(Lgb/r1$m;Leb/p;Leb/t0;Leb/c;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lgb/r1$m;->e:Lgb/r1;

    .line 67
    .line 68
    iget-object p1, p1, Lgb/r1;->n:Leb/h1;

    .line 69
    .line 70
    new-instance p2, Lgb/r1$m$d;

    .line 71
    .line 72
    invoke-direct {p2, p0, v1}, Lgb/r1$m$d;-><init>(Lgb/r1$m;Lgb/r1$m$e;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p2}, Leb/h1;->execute(Ljava/lang/Runnable;)V

    .line 76
    .line 77
    .line 78
    return-object v1
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method
