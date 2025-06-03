.class public final Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz4/t$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/dash/DashMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation


# instance fields
.field public final a:Lcom/google/android/exoplayer2/source/dash/a$a;

.field public final b:Lt5/k$a;

.field public c:La4/i;

.field public d:Lz4/i;

.field public e:Lt5/u;

.field public f:J


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/source/dash/c$a;Lt5/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->a:Lcom/google/android/exoplayer2/source/dash/a$a;

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->b:Lt5/k$a;

    new-instance p1, La4/c;

    invoke-direct {p1}, La4/c;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->c:La4/i;

    new-instance p1, Lt5/u;

    invoke-direct {p1}, Lt5/u;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->e:Lt5/u;

    const-wide/16 p1, 0x7530

    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->f:J

    new-instance p1, Lz4/i;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lz4/i;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->d:Lz4/i;

    return-void
.end method

.method public constructor <init>(Lt5/k$a;)V
    .locals 1

    new-instance v0, Lcom/google/android/exoplayer2/source/dash/c$a;

    invoke-direct {v0, p1}, Lcom/google/android/exoplayer2/source/dash/c$a;-><init>(Lt5/k$a;)V

    invoke-direct {p0, v0, p1}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;-><init>(Lcom/google/android/exoplayer2/source/dash/c$a;Lt5/k$a;)V

    return-void
.end method


# virtual methods
.method public final a(Lv3/o0;)Lcom/google/android/exoplayer2/source/dash/DashMediaSource;
    .locals 13

    .line 1
    iget-object v0, p1, Lv3/o0;->b:Lv3/o0$g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Ld5/d;

    .line 7
    .line 8
    invoke-direct {v0}, Ld5/d;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p1, Lv3/o0;->b:Lv3/o0$g;

    .line 12
    .line 13
    iget-object v1, v1, Lv3/o0$f;->d:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    new-instance v2, Ly4/b;

    .line 22
    .line 23
    invoke-direct {v2, v0, v1}, Ly4/b;-><init>(Lt5/f0$a;Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    move-object v6, v2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object v6, v0

    .line 29
    :goto_0
    new-instance v0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;

    .line 30
    .line 31
    iget-object v5, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->b:Lt5/k$a;

    .line 32
    .line 33
    iget-object v7, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->a:Lcom/google/android/exoplayer2/source/dash/a$a;

    .line 34
    .line 35
    iget-object v8, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->d:Lz4/i;

    .line 36
    .line 37
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->c:La4/i;

    .line 38
    .line 39
    invoke-interface {v1, p1}, La4/i;->a(Lv3/o0;)La4/h;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    iget-object v10, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->e:Lt5/u;

    .line 44
    .line 45
    iget-wide v11, p0, Lcom/google/android/exoplayer2/source/dash/DashMediaSource$Factory;->f:J

    .line 46
    .line 47
    move-object v3, v0

    .line 48
    move-object v4, p1

    .line 49
    invoke-direct/range {v3 .. v12}, Lcom/google/android/exoplayer2/source/dash/DashMediaSource;-><init>(Lv3/o0;Lt5/k$a;Lt5/f0$a;Lcom/google/android/exoplayer2/source/dash/a$a;Lz4/i;La4/h;Lt5/u;J)V

    .line 50
    .line 51
    .line 52
    return-object v0
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
