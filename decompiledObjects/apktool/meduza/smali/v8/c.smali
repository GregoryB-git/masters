.class public final Lv8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final a:Lr4/c;

.field public final b:Lw8/a;


# direct methods
.method public constructor <init>(Lw8/a;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lv8/c;->b:Lw8/a;

    .line 8
    .line 9
    iput-object p1, p0, Lv8/c;->a:Lr4/c;

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-wide v0, p1, Lw8/a;->d:J

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    cmp-long v0, v0, v2

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    iput-wide v0, p1, Lw8/a;->d:J

    .line 25
    .line 26
    :cond_1
    iput-object p1, p0, Lv8/c;->b:Lw8/a;

    .line 27
    .line 28
    new-instance v0, Lr4/c;

    .line 29
    .line 30
    invoke-direct {v0, p1}, Lr4/c;-><init>(Lw8/a;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lv8/c;->a:Lr4/c;

    .line 34
    .line 35
    return-void
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
.end method
