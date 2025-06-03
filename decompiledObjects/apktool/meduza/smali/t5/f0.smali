.class public final Lt5/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5/d0$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt5/f0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lt5/d0$d;"
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:Lt5/n;

.field public final c:I

.field public final d:Lt5/j0;

.field public final e:Lt5/f0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt5/f0$a<",
            "+TT;>;"
        }
    .end annotation
.end field

.field public volatile f:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Lt5/k;Landroid/net/Uri;ILt5/f0$a;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt5/k;",
            "Landroid/net/Uri;",
            "I",
            "Lt5/f0$a<",
            "+TT;>;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    .line 1
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v7

    if-eqz p2, :cond_0

    .line 2
    new-instance v15, Lt5/n;

    const-wide/16 v3, 0x0

    const/4 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v5, 0x1

    const-wide/16 v10, -0x1

    const/4 v13, 0x1

    move-object v1, v15

    move-object/from16 v2, p2

    .line 3
    invoke-direct/range {v1 .. v14}, Lt5/n;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;ILjava/lang/Object;)V

    .line 4
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lt5/j0;

    move-object/from16 v2, p1

    invoke-direct {v1, v2}, Lt5/j0;-><init>(Lt5/k;)V

    iput-object v1, v0, Lt5/f0;->d:Lt5/j0;

    iput-object v15, v0, Lt5/f0;->b:Lt5/n;

    move/from16 v1, p3

    iput v1, v0, Lt5/f0;->c:I

    move-object/from16 v1, p4

    iput-object v1, v0, Lt5/f0;->e:Lt5/f0$a;

    .line 5
    sget-object v1, Lz4/n;->b:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v1

    .line 6
    iput-wide v1, v0, Lt5/f0;->a:J

    return-void

    .line 7
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "The uri must be set."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lt5/f0;->d:Lt5/j0;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    iput-wide v1, v0, Lt5/j0;->b:J

    .line 6
    .line 7
    new-instance v0, Lt5/m;

    .line 8
    .line 9
    iget-object v1, p0, Lt5/f0;->d:Lt5/j0;

    .line 10
    .line 11
    iget-object v2, p0, Lt5/f0;->b:Lt5/n;

    .line 12
    .line 13
    invoke-direct {v0, v1, v2}, Lt5/m;-><init>(Lt5/k;Lt5/n;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v0}, Lt5/m;->f()V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lt5/f0;->d:Lt5/j0;

    .line 20
    .line 21
    invoke-virtual {v1}, Lt5/j0;->l()Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lt5/f0;->e:Lt5/f0$a;

    .line 29
    .line 30
    invoke-interface {v2, v1, v0}, Lt5/f0$a;->a(Landroid/net/Uri;Lt5/m;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iput-object v1, p0, Lt5/f0;->f:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    invoke-static {v0}, Lv5/e0;->g(Ljava/io/Closeable;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    invoke-static {v0}, Lv5/e0;->g(Ljava/io/Closeable;)V

    .line 42
    .line 43
    .line 44
    throw v1
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

.method public final b()V
    .locals 0

    return-void
.end method
