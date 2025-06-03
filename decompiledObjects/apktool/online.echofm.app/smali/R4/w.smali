.class public final LR4/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR4/x;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR4/w$a;
    }
.end annotation


# static fields
.field public static final a:LR4/w$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LR4/w$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LR4/w$a;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LR4/w;->a:LR4/w$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide/16 v2, 0x3e8

    .line 6
    .line 7
    mul-long/2addr v0, v2

    .line 8
    return-wide v0
.end method

.method public b()J
    .locals 3

    .line 1
    sget-object v0, Lo6/a;->p:Lo6/a$a;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    sget-object v2, Lo6/d;->r:Lo6/d;

    .line 8
    .line 9
    invoke-static {v0, v1, v2}, Lo6/c;->p(JLo6/d;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method
