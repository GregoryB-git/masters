.class public abstract Landroidx/work/CoroutineWorker;
.super Landroidx/work/d;
.source "SourceFile"


# instance fields
.field public final e:Lnc/m1;

.field public final f:Lz2/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz2/c<",
            "Landroidx/work/d$a;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Ltc/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "params"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Landroidx/work/d;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    new-instance p2, Lnc/m1;

    .line 16
    .line 17
    invoke-direct {p2, p1}, Lnc/m1;-><init>(Lnc/j1;)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, Landroidx/work/CoroutineWorker;->e:Lnc/m1;

    .line 21
    .line 22
    new-instance p1, Lz2/c;

    .line 23
    .line 24
    invoke-direct {p1}, Lz2/c;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Landroidx/work/CoroutineWorker;->f:Lz2/c;

    .line 28
    .line 29
    new-instance p2, Lb/m;

    .line 30
    .line 31
    const/4 v0, 0x7

    .line 32
    invoke-direct {p2, p0, v0}, Lb/m;-><init>(Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Landroidx/work/d;->b:Landroidx/work/WorkerParameters;

    .line 36
    .line 37
    iget-object v0, v0, Landroidx/work/WorkerParameters;->d:La3/b;

    .line 38
    .line 39
    invoke-interface {v0}, La3/b;->c()Ly2/r;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p1, p2, v0}, Lz2/a;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 44
    .line 45
    .line 46
    sget-object p1, Lnc/r0;->a:Ltc/c;

    .line 47
    .line 48
    iput-object p1, p0, Landroidx/work/CoroutineWorker;->o:Ltc/c;

    .line 49
    .line 50
    return-void
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
.method public final b()Ls7/e;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ls7/e<",
            "Lo2/d;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnc/m1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lnc/m1;-><init>(Lnc/j1;)V

    .line 5
    .line 6
    .line 7
    iget-object v2, p0, Landroidx/work/CoroutineWorker;->o:Ltc/c;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v2, v0}, Lub/h$a;->a(Lub/h;Lub/h;)Lub/h;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v2}, Lnc/e0;->a(Lub/h;)Lsc/d;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    new-instance v3, Lo2/i;

    .line 21
    .line 22
    invoke-direct {v3, v0}, Lo2/i;-><init>(Lnc/m1;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Landroidx/work/CoroutineWorker$a;

    .line 26
    .line 27
    invoke-direct {v0, v3, p0, v1}, Landroidx/work/CoroutineWorker$a;-><init>(Lo2/i;Landroidx/work/CoroutineWorker;Lub/e;)V

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x3

    .line 31
    invoke-static {v2, v1, v0, v4}, Lx6/b;->g0(Lnc/d0;Ltc/b;Ldc/p;I)Lnc/z1;

    .line 32
    .line 33
    .line 34
    return-object v3
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
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, Landroidx/work/CoroutineWorker;->f:Lz2/c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lz2/a;->cancel(Z)Z

    return-void
.end method

.method public final h()Lz2/c;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/work/CoroutineWorker;->o:Ltc/c;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/work/CoroutineWorker;->e:Lnc/m1;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lub/a;->plus(Lub/h;)Lub/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lnc/e0;->a(Lub/h;)Lsc/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Landroidx/work/b;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, p0, v2}, Landroidx/work/b;-><init>(Landroidx/work/CoroutineWorker;Lub/e;)V

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x3

    .line 20
    invoke-static {v0, v2, v1, v3}, Lx6/b;->g0(Lnc/d0;Ltc/b;Ldc/p;I)Lnc/z1;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Landroidx/work/CoroutineWorker;->f:Lz2/c;

    .line 24
    .line 25
    return-object v0
    .line 26
    .line 27
    .line 28
    .line 29
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
.end method

.method public abstract j()Ljava/lang/Object;
.end method
