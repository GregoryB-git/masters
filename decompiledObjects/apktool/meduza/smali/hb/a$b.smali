.class public final Lhb/a$b;
.super Lhb/a$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhb/a;->flush()V
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

    iput-object p1, p0, Lhb/a$b;->b:Lhb/a;

    invoke-direct {p0, p1}, Lhb/a$e;-><init>(Lhb/a;)V

    invoke-static {}, Lpb/b;->b()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

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
    iget-object v2, p0, Lhb/a$b;->b:Lhb/a;

    .line 15
    .line 16
    iget-object v2, v2, Lhb/a;->a:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 19
    :try_start_1
    iget-object v3, p0, Lhb/a$b;->b:Lhb/a;

    .line 20
    .line 21
    iget-object v3, v3, Lhb/a;->b:Lxc/f;

    .line 22
    .line 23
    iget-wide v4, v3, Lxc/f;->b:J

    .line 24
    .line 25
    invoke-virtual {v0, v3, v4, v5}, Lxc/f;->g0(Lxc/f;J)V

    .line 26
    .line 27
    .line 28
    iget-object v3, p0, Lhb/a$b;->b:Lhb/a;

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    iput-boolean v4, v3, Lhb/a;->o:Z

    .line 32
    .line 33
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    :try_start_2
    iget-object v2, v3, Lhb/a;->q:Lxc/w;

    .line 35
    .line 36
    iget-wide v3, v0, Lxc/f;->b:J

    .line 37
    .line 38
    invoke-interface {v2, v0, v3, v4}, Lxc/w;->g0(Lxc/f;J)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lhb/a$b;->b:Lhb/a;

    .line 42
    .line 43
    iget-object v0, v0, Lhb/a;->q:Lxc/w;

    .line 44
    .line 45
    invoke-interface {v0}, Lxc/w;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 54
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 55
    :catchall_1
    move-exception v0

    .line 56
    :try_start_5
    sget-object v1, Lpb/b;->a:Lpb/a;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catchall_2
    move-exception v1

    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    throw v0
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
