.class public final Ltc/b;
.super Lnc/b1;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final c:Ltc/b;

.field public static final d:Lnc/a0;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ltc/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ltc/b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltc/b;->c:Ltc/b;

    .line 7
    .line 8
    sget-object v0, Ltc/k;->c:Ltc/k;

    .line 9
    .line 10
    sget v1, Lsc/v;->a:I

    .line 11
    .line 12
    const/16 v2, 0x40

    .line 13
    .line 14
    if-ge v2, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v1, v2

    .line 18
    :goto_0
    const/16 v2, 0xc

    .line 19
    .line 20
    const-string v3, "kotlinx.coroutines.io.parallelism"

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-static {v3, v1, v4, v4, v2}, Lx6/b;->w0(Ljava/lang/String;IIII)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Lx6/b;->C(I)V

    .line 31
    .line 32
    .line 33
    sget v2, Ltc/j;->d:I

    .line 34
    .line 35
    if-lt v1, v2, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-static {v1}, Lx6/b;->C(I)V

    .line 39
    .line 40
    .line 41
    new-instance v2, Lsc/h;

    .line 42
    .line 43
    invoke-direct {v2, v0, v1}, Lsc/h;-><init>(Ltc/k;I)V

    .line 44
    .line 45
    .line 46
    move-object v0, v2

    .line 47
    :goto_1
    sput-object v0, Ltc/b;->d:Lnc/a0;

    .line 48
    .line 49
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lnc/b1;-><init>()V

    return-void
.end method


# virtual methods
.method public final A0(Lub/h;Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Ltc/b;->d:Lnc/a0;

    invoke-virtual {v0, p1, p2}, Lnc/a0;->A0(Lub/h;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final close()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot be invoked on Dispatchers.IO"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lub/i;->a:Lub/i;

    invoke-virtual {p0, v0, p1}, Ltc/b;->z0(Lub/h;Ljava/lang/Runnable;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.IO"

    return-object v0
.end method

.method public final z0(Lub/h;Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Ltc/b;->d:Lnc/a0;

    invoke-virtual {v0, p1, p2}, Lnc/a0;->z0(Lub/h;Ljava/lang/Runnable;)V

    return-void
.end method
