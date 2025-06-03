.class public final synthetic Li9/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Li9/b1;

.field public final synthetic b:[B

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:Ln9/i;

.field public final synthetic f:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Li9/b1;[BIILn9/i;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li9/a1;->a:Li9/b1;

    iput-object p2, p0, Li9/a1;->b:[B

    iput p3, p0, Li9/a1;->c:I

    iput p4, p0, Li9/a1;->d:I

    iput-object p5, p0, Li9/a1;->e:Ln9/i;

    iput-object p6, p0, Li9/a1;->f:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-object v0, p0, Li9/a1;->a:Li9/b1;

    .line 2
    .line 3
    iget-object v1, p0, Li9/a1;->b:[B

    .line 4
    .line 5
    iget v2, p0, Li9/a1;->c:I

    .line 6
    .line 7
    iget v3, p0, Li9/a1;->d:I

    .line 8
    .line 9
    iget-object v4, p0, Li9/a1;->e:Ln9/i;

    .line 10
    .line 11
    iget-object v5, p0, Li9/a1;->f:Ljava/util/Map;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    :try_start_0
    iget-object v0, v0, Li9/b1;->b:Li9/i;

    .line 17
    .line 18
    invoke-static {v1}, Ll9/a;->Q([B)Ll9/a;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Li9/i;->b(Ll9/a;)Lj9/m;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Lj9/q;

    .line 27
    .line 28
    new-instance v6, Lu7/m;

    .line 29
    .line 30
    int-to-long v7, v2

    .line 31
    invoke-direct {v6, v3, v7, v8}, Lu7/m;-><init>(IJ)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v1, v6}, Lj9/q;-><init>(Lu7/m;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, v0, Lj9/m;->e:Lj9/q;
    :try_end_0
    .catch Lma/b0; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    invoke-interface {v4, v0}, Ln9/i;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    :cond_0
    monitor-enter v5

    .line 54
    :try_start_1
    iget-object v1, v0, Lj9/m;->b:Lj9/i;

    .line 55
    .line 56
    invoke-interface {v5, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    monitor-exit v5

    .line 60
    :cond_1
    return-void

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    throw v0

    .line 64
    :catch_0
    move-exception v0

    .line 65
    const/4 v1, 0x1

    .line 66
    new-array v1, v1, [Ljava/lang/Object;

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    aput-object v0, v1, v2

    .line 70
    .line 71
    const-string v0, "MaybeDocument failed to parse: %s"

    .line 72
    .line 73
    invoke-static {v0, v1}, Lx6/b;->T(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    throw v0
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
