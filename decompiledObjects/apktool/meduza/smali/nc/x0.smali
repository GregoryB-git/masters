.class public abstract Lnc/x0;
.super Lnc/a0;
.source "SourceFile"


# static fields
.field public static final synthetic f:I


# instance fields
.field public c:J

.field public d:Z

.field public e:Lsb/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsb/i<",
            "Lnc/p0<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnc/a0;-><init>()V

    return-void
.end method


# virtual methods
.method public final C0(Z)V
    .locals 4

    iget-wide v0, p0, Lnc/x0;->c:J

    if-eqz p1, :cond_0

    const-wide v2, 0x100000000L

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x1

    :goto_0
    sub-long/2addr v0, v2

    iput-wide v0, p0, Lnc/x0;->c:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_1

    return-void

    :cond_1
    iget-boolean p1, p0, Lnc/x0;->d:Z

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lnc/x0;->shutdown()V

    :cond_2
    return-void
.end method

.method public final D0(Lnc/p0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnc/p0<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lnc/x0;->e:Lsb/i;

    if-nez v0, :cond_0

    new-instance v0, Lsb/i;

    invoke-direct {v0}, Lsb/i;-><init>()V

    iput-object v0, p0, Lnc/x0;->e:Lsb/i;

    :cond_0
    invoke-virtual {v0, p1}, Lsb/i;->addLast(Ljava/lang/Object;)V

    return-void
.end method

.method public final E0(Z)V
    .locals 4

    iget-wide v0, p0, Lnc/x0;->c:J

    if-eqz p1, :cond_0

    const-wide v2, 0x100000000L

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x1

    :goto_0
    add-long/2addr v2, v0

    iput-wide v2, p0, Lnc/x0;->c:J

    if-nez p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lnc/x0;->d:Z

    :cond_1
    return-void
.end method

.method public final F0()Z
    .locals 4

    iget-wide v0, p0, Lnc/x0;->c:J

    const-wide v2, 0x100000000L

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public G0()J
    .locals 2

    invoke-virtual {p0}, Lnc/x0;->H0()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide v0, 0x7fffffffffffffffL

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final H0()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lnc/x0;->e:Lsb/i;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Lsb/i;->isEmpty()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {v0}, Lsb/i;->removeFirst()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    check-cast v0, Lnc/p0;

    .line 20
    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    return v1

    .line 24
    :cond_2
    invoke-virtual {v0}, Lnc/p0;->run()V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    return v0
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

.method public shutdown()V
    .locals 0

    return-void
.end method
