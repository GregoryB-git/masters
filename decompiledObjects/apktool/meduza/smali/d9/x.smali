.class public final Ld9/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ln9/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln9/i<",
            "Ln9/a;",
            "Lg9/u;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lg9/u;

.field public c:Ln9/a;


# direct methods
.method public constructor <init>(Le;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/x;->a:Ln9/i;

    new-instance p1, Ln9/a;

    invoke-direct {p1}, Ln9/a;-><init>()V

    iput-object p1, p0, Ld9/x;->c:Ln9/a;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Ln9/i;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ln9/i<",
            "Lg9/u;",
            "TT;>;)TT;"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Ld9/x;->b()V

    iget-object v0, p0, Ld9/x;->b:Lg9/u;

    invoke-interface {p1, v0}, Ln9/i;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized b()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ld9/x;->b:Lg9/u;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Ld9/x;->a:Ln9/i;

    .line 12
    .line 13
    iget-object v1, p0, Ld9/x;->c:Ln9/a;

    .line 14
    .line 15
    invoke-interface {v0, v1}, Ln9/i;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lg9/u;

    .line 20
    .line 21
    iput-object v0, p0, Ld9/x;->b:Lg9/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    goto :goto_2

    .line 26
    :cond_1
    :goto_1
    monitor-exit p0

    .line 27
    return-void

    .line 28
    :goto_2
    monitor-exit p0

    .line 29
    throw v0
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
