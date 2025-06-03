.class public final Lhb/a$a;
.super Lhb/a$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhb/a;->g0(Lxc/f;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lhb/a;


# direct methods
.method public constructor <init>(Lhb/a;)V
    .locals 0

    iput-object p1, p0, Lhb/a$a;->b:Lhb/a;

    invoke-direct {p0, p1}, Lhb/a$e;-><init>(Lhb/a;)V

    invoke-static {}, Lpb/b;->b()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    new-instance v0, Lxc/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lxc/f;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lpb/b;->c()V

    .line 7
    .line 8
    .line 9
    :try_start_0
    sget-object v1, Lpb/b;->a:Lpb/a;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, Lhb/a$a;->b:Lhb/a;

    .line 15
    .line 16
    iget-object v2, v2, Lhb/a;->a:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 19
    :try_start_1
    iget-object v3, p0, Lhb/a$a;->b:Lhb/a;

    .line 20
    .line 21
    iget-object v3, v3, Lhb/a;->b:Lxc/f;

    .line 22
    .line 23
    invoke-virtual {v3}, Lxc/f;->g()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    invoke-virtual {v0, v3, v4, v5}, Lxc/f;->g0(Lxc/f;J)V

    .line 28
    .line 29
    .line 30
    iget-object v3, p0, Lhb/a$a;->b:Lhb/a;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    iput-boolean v4, v3, Lhb/a;->f:Z

    .line 34
    .line 35
    iget v4, v3, Lhb/a;->u:I

    .line 36
    .line 37
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 38
    :try_start_2
    iget-object v2, v3, Lhb/a;->q:Lxc/w;

    .line 39
    .line 40
    iget-wide v5, v0, Lxc/f;->b:J

    .line 41
    .line 42
    invoke-interface {v2, v0, v5, v6}, Lxc/w;->g0(Lxc/f;J)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lhb/a$a;->b:Lhb/a;

    .line 46
    .line 47
    iget-object v0, v0, Lhb/a;->a:Ljava/lang/Object;

    .line 48
    .line 49
    monitor-enter v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 50
    :try_start_3
    iget-object v2, p0, Lhb/a$a;->b:Lhb/a;

    .line 51
    .line 52
    iget v3, v2, Lhb/a;->u:I

    .line 53
    .line 54
    sub-int/2addr v3, v4

    .line 55
    iput v3, v2, Lhb/a;->u:I

    .line 56
    .line 57
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :catchall_0
    move-exception v1

    .line 63
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 64
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 65
    :catchall_1
    move-exception v0

    .line 66
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 67
    :try_start_7
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 68
    :catchall_2
    move-exception v0

    .line 69
    :try_start_8
    sget-object v1, Lpb/b;->a:Lpb/a;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :catchall_3
    move-exception v1

    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    :goto_0
    throw v0
    .line 80
    .line 81
    .line 82
    .line 83
.end method
