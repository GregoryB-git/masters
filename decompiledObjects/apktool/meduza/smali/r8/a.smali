.class public final Lr8/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lnc/g0;)Lr8/c;
    .locals 10

    .line 1
    new-instance v3, Lr8/c$b;

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    invoke-direct {v3, v0}, Lr8/c$b;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v4, Lr8/c$a;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v4, v0, v1, v1}, Lr8/c$a;-><init>(ZZZ)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    const p0, 0x36ee80

    .line 23
    .line 24
    .line 25
    int-to-long v5, p0

    .line 26
    add-long v1, v0, v5

    .line 27
    .line 28
    new-instance p0, Lr8/c;

    .line 29
    .line 30
    const-wide/high16 v5, 0x4024000000000000L    # 10.0

    .line 31
    .line 32
    const-wide v7, 0x3ff3333333333333L    # 1.2

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    const/16 v9, 0x3c

    .line 38
    .line 39
    move-object v0, p0

    .line 40
    invoke-direct/range {v0 .. v9}, Lr8/c;-><init>(JLr8/c$b;Lr8/c$a;DDI)V

    .line 41
    .line 42
    .line 43
    return-object p0
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


# virtual methods
.method public final a(Lnc/g0;Lorg/json/JSONObject;)Lr8/c;
    .locals 0

    invoke-static {p1}, Lr8/a;->b(Lnc/g0;)Lr8/c;

    move-result-object p1

    return-object p1
.end method
