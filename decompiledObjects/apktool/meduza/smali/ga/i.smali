.class public final Lga/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lr0/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/d$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lr0/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/d$a<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lr0/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/d$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lr0/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/d$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lr0/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr0/d$a<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lo0/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/i<",
            "Lr0/d;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lga/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "firebase_sessions_enabled"

    .line 2
    .line 3
    invoke-static {v0}, Lx6/b;->j(Ljava/lang/String;)Lr0/d$a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lga/i;->c:Lr0/d$a;

    .line 8
    .line 9
    new-instance v0, Lr0/d$a;

    .line 10
    .line 11
    const-string v1, "firebase_sessions_sampling_rate"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Lr0/d$a;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lga/i;->d:Lr0/d$a;

    .line 17
    .line 18
    new-instance v0, Lr0/d$a;

    .line 19
    .line 20
    const-string v1, "firebase_sessions_restart_timeout"

    .line 21
    .line 22
    invoke-direct {v0, v1}, Lr0/d$a;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lga/i;->e:Lr0/d$a;

    .line 26
    .line 27
    new-instance v0, Lr0/d$a;

    .line 28
    .line 29
    const-string v1, "firebase_sessions_cache_duration"

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lr0/d$a;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lga/i;->f:Lr0/d$a;

    .line 35
    .line 36
    new-instance v0, Lr0/d$a;

    .line 37
    .line 38
    const-string v1, "firebase_sessions_cache_updated_time"

    .line 39
    .line 40
    invoke-direct {v0, v1}, Lr0/d$a;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sput-object v0, Lga/i;->g:Lr0/d$a;

    .line 44
    .line 45
    return-void
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

.method public constructor <init>(Lo0/i;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo0/i<",
            "Lr0/d;",
            ">;)V"
        }
    .end annotation

    const-string v0, "dataStore"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lga/i;->a:Lo0/i;

    new-instance p1, Lga/i$a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lga/i$a;-><init>(Lga/i;Lub/e;)V

    invoke-static {p1}, Lx6/b;->p0(Ldc/p;)Ljava/lang/Object;

    return-void
.end method

.method public static final a(Lga/i;Lr0/a;)V
    .locals 7

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, Lga/g;

    sget-object v0, Lga/i;->c:Lr0/d$a;

    invoke-virtual {p1, v0}, Lr0/a;->b(Lr0/d$a;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Boolean;

    sget-object v0, Lga/i;->d:Lr0/d$a;

    invoke-virtual {p1, v0}, Lr0/a;->b(Lr0/d$a;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Double;

    sget-object v0, Lga/i;->e:Lr0/d$a;

    invoke-virtual {p1, v0}, Lr0/a;->b(Lr0/d$a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/lang/Integer;

    sget-object v0, Lga/i;->f:Lr0/d$a;

    invoke-virtual {p1, v0}, Lr0/a;->b(Lr0/d$a;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    sget-object v0, Lga/i;->g:Lr0/d$a;

    invoke-virtual {p1, v0}, Lr0/a;->b(Lr0/d$a;)Ljava/lang/Object;

    move-result-object p1

    move-object v5, p1

    check-cast v5, Ljava/lang/Long;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lga/g;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V

    iput-object v6, p0, Lga/i;->b:Lga/g;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lga/i;->b:Lga/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "sessionConfigs"

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v3, v0, Lga/g;->e:Ljava/lang/Long;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, v0, Lga/g;->d:Ljava/lang/Integer;

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    sub-long/2addr v1, v3

    .line 27
    const/16 v3, 0x3e8

    .line 28
    .line 29
    int-to-long v3, v3

    .line 30
    div-long/2addr v1, v3

    .line 31
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    int-to-long v3, v0

    .line 36
    cmp-long v0, v1, v3

    .line 37
    .line 38
    if-gez v0, :cond_0

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    return v0

    .line 42
    :cond_0
    const/4 v0, 0x1

    .line 43
    return v0

    .line 44
    :cond_1
    invoke-static {v2}, Lec/i;->i(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v1

    .line 48
    :cond_2
    invoke-static {v2}, Lec/i;->i(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v1
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

.method public final c(Lr0/d$a;Ljava/lang/Object;Lub/e;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lr0/d$a<",
            "TT;>;TT;",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lga/i$b;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lga/i$b;

    iget v1, v0, Lga/i$b;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lga/i$b;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lga/i$b;

    invoke-direct {v0, p0, p3}, Lga/i$b;-><init>(Lga/i;Lub/e;)V

    :goto_0
    iget-object p3, v0, Lga/i$b;->a:Ljava/lang/Object;

    sget-object v1, Lvb/a;->a:Lvb/a;

    iget v2, v0, Lga/i$b;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p3}, Lrb/f;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lrb/f;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p3, p0, Lga/i;->a:Lo0/i;

    new-instance v2, Lga/i$c;

    const/4 v4, 0x0

    invoke-direct {v2, p1, p0, p2, v4}, Lga/i$c;-><init>(Lr0/d$a;Lga/i;Ljava/lang/Object;Lub/e;)V

    iput v3, v0, Lga/i$b;->c:I

    invoke-static {p3, v2, v0}, Lr0/e;->a(Lo0/i;Ldc/p;Lub/e;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Failed to update cache config value: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "SettingsCache"

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    :goto_2
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method
