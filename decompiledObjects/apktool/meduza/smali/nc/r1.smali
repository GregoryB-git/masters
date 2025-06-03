.class public final Lnc/r1;
.super Lnc/z1;
.source "SourceFile"


# instance fields
.field public final d:Lub/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lub/e<",
            "Lrb/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lub/h;Ldc/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/h;",
            "Ldc/p<",
            "-",
            "Lnc/d0;",
            "-",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lnc/z1;-><init>(Lub/h;Z)V

    invoke-static {p0, p0, p2}, Lp2/m0;->u(Ljava/lang/Object;Lub/e;Ldc/p;)Lub/e;

    move-result-object p1

    iput-object p1, p0, Lnc/r1;->d:Lub/e;

    return-void
.end method


# virtual methods
.method public final S()V
    .locals 3

    .line 1
    iget-object v0, p0, Lnc/r1;->d:Lub/e;

    .line 2
    .line 3
    :try_start_0
    invoke-static {v0}, Lp2/m0;->P(Lub/e;)Lub/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lrb/h;->a:Lrb/h;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {v0, v1, v2}, Lb/a0;->C(Lub/e;Ljava/lang/Object;Ldc/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    invoke-static {v0}, Lrb/f;->a(Ljava/lang/Throwable;)Lrb/e$a;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0, v1}, Lnc/a;->resumeWith(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    throw v0
    .line 23
    .line 24
    .line 25
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
