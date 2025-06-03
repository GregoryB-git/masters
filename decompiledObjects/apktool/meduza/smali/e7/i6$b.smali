.class public final Le7/i6$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le7/i6;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Le7/i6;

.field public b:I

.field public c:J


# direct methods
.method public constructor <init>(Le7/i6;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/i6$b;->a:Le7/i6;

    const/4 p1, 0x1

    iput p1, p0, Le7/i6$b;->b:I

    invoke-virtual {p0}, Le7/i6$b;->a()J

    move-result-wide v0

    iput-wide v0, p0, Le7/i6$b;->c:J

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 7

    .line 1
    iget-object v0, p0, Le7/i6$b;->a:Le7/i6;

    .line 2
    .line 3
    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Le7/h0;->u:Le7/m0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Le7/m0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Long;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    sget-object v0, Le7/h0;->v:Le7/m0;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Le7/m0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Long;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    const/4 v4, 0x1

    .line 32
    move v5, v4

    .line 33
    :goto_0
    iget v6, p0, Le7/i6$b;->b:I

    .line 34
    .line 35
    if-ge v5, v6, :cond_0

    .line 36
    .line 37
    shl-long/2addr v2, v4

    .line 38
    cmp-long v6, v2, v0

    .line 39
    .line 40
    if-gez v6, :cond_0

    .line 41
    .line 42
    add-int/lit8 v5, v5, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    iget-object v4, p0, Le7/i6$b;->a:Le7/i6;

    .line 46
    .line 47
    invoke-virtual {v4}, Le7/i6;->zzb()Lv6/b;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Lb/z;

    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 57
    .line 58
    .line 59
    move-result-wide v4

    .line 60
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    add-long/2addr v0, v4

    .line 65
    return-wide v0
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
