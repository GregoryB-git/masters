.class public final synthetic Lq3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls3/b$a;
.implements Lu5/h$a;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLcom/jhomlala/better_player/CacheWorker;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lq3/j;->a:J

    iput-object p3, p0, Lq3/j;->b:Ljava/lang/Object;

    iput-object p4, p0, Lq3/j;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lq3/k;Lk3/s;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/j;->b:Ljava/lang/Object;

    iput-object p2, p0, Lq3/j;->c:Ljava/lang/Object;

    iput-wide p3, p0, Lq3/j;->a:J

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lq3/j;->b:Ljava/lang/Object;

    check-cast v0, Lq3/k;

    iget-object v1, p0, Lq3/j;->c:Ljava/lang/Object;

    check-cast v1, Lk3/s;

    iget-wide v2, p0, Lq3/j;->a:J

    iget-object v4, v0, Lq3/k;->c:Lr3/d;

    iget-object v0, v0, Lq3/k;->g:Lt3/a;

    invoke-interface {v0}, Lt3/a;->a()J

    move-result-wide v5

    add-long/2addr v5, v2

    invoke-interface {v4, v5, v6, v1}, Lr3/d;->P(JLk3/s;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final b(J)V
    .locals 6

    .line 1
    iget-wide v0, p0, Lq3/j;->a:J

    .line 2
    .line 3
    iget-object v2, p0, Lq3/j;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, Lcom/jhomlala/better_player/CacheWorker;

    .line 6
    .line 7
    iget-object v3, p0, Lq3/j;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Ljava/lang/String;

    .line 10
    .line 11
    long-to-float p1, p1

    .line 12
    const/high16 p2, 0x42c80000    # 100.0f

    .line 13
    .line 14
    mul-float/2addr p1, p2

    .line 15
    long-to-float p2, v0

    .line 16
    div-float/2addr p1, p2

    .line 17
    float-to-double p1, p1

    .line 18
    iget v0, v2, Lcom/jhomlala/better_player/CacheWorker;->p:I

    .line 19
    .line 20
    mul-int/lit8 v1, v0, 0xa

    .line 21
    .line 22
    int-to-double v4, v1

    .line 23
    cmpl-double v1, p1, v4

    .line 24
    .line 25
    if-ltz v1, :cond_0

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    iput v0, v2, Lcom/jhomlala/better_player/CacheWorker;->p:I

    .line 30
    .line 31
    const-string v0, "Completed pre cache of "

    .line 32
    .line 33
    const-string v1, ": "

    .line 34
    .line 35
    invoke-static {v0, v3, v1}, Lf;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    double-to-int p1, p1

    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const/16 p1, 0x25

    .line 44
    .line 45
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const-string p2, "CacheWorker"

    .line 53
    .line 54
    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    :cond_0
    return-void
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
