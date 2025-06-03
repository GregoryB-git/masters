.class public final Lh5/e;
.super Lh5/l;
.source "SourceFile"


# instance fields
.field public final synthetic e:Lh5/f;


# direct methods
.method public constructor <init>(Lh5/f;)V
    .locals 0

    iput-object p1, p0, Lh5/e;->e:Lh5/f;

    invoke-direct {p0}, Lh5/l;-><init>()V

    return-void
.end method


# virtual methods
.method public final o()V
    .locals 6

    .line 1
    iget-object v0, p0, Lh5/e;->e:Lh5/f;

    .line 2
    .line 3
    iget-object v1, v0, Lz3/j;->b:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    const/4 v2, 0x0

    .line 7
    :try_start_0
    iput v2, p0, Lz3/a;->a:I

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    iput-object v3, p0, Lh5/l;->c:Lh5/g;

    .line 11
    .line 12
    iget-object v3, v0, Lz3/j;->f:[Lz3/h;

    .line 13
    .line 14
    iget v4, v0, Lz3/j;->h:I

    .line 15
    .line 16
    add-int/lit8 v5, v4, 0x1

    .line 17
    .line 18
    iput v5, v0, Lz3/j;->h:I

    .line 19
    .line 20
    aput-object p0, v3, v4

    .line 21
    .line 22
    iget-object v3, v0, Lz3/j;->c:Ljava/util/ArrayDeque;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-nez v3, :cond_0

    .line 29
    .line 30
    iget v3, v0, Lz3/j;->h:I

    .line 31
    .line 32
    if-lez v3, :cond_0

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    :cond_0
    if-eqz v2, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, Lz3/j;->b:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 40
    .line 41
    .line 42
    :cond_1
    monitor-exit v1

    .line 43
    return-void

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    throw v0
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
