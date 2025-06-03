.class public final LR2/D5$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR2/D5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:J


# direct methods
.method public constructor <init>(LR2/D5;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LR2/D5;->n0()LR2/S5;

    move-result-object v0

    invoke-virtual {v0}, LR2/S5;->S0()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, LR2/D5$b;-><init>(LR2/D5;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(LR2/D5;LR2/M5;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LR2/D5$b;-><init>(LR2/D5;)V

    return-void
.end method

.method public constructor <init>(LR2/D5;Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LR2/D5$b;->a:Ljava/lang/String;

    invoke-virtual {p1}, LR2/D5;->b()LE2/e;

    move-result-object p1

    invoke-interface {p1}, LE2/e;->b()J

    move-result-wide p1

    iput-wide p1, p0, LR2/D5$b;->b:J

    return-void
.end method

.method public synthetic constructor <init>(LR2/D5;Ljava/lang/String;LR2/M5;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, LR2/D5$b;-><init>(LR2/D5;Ljava/lang/String;)V

    return-void
.end method
