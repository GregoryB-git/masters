.class public final Ld5/k$e;
.super Ld5/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld5/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public final d:J

.field public final e:J


# direct methods
.method public constructor <init>()V
    .locals 10

    const/4 v1, 0x0

    const-wide/16 v2, 0x1

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v9}, Ld5/k$e;-><init>(Ld5/i;JJJJ)V

    return-void
.end method

.method public constructor <init>(Ld5/i;JJJJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Ld5/k;-><init>(Ld5/i;JJ)V

    iput-wide p6, p0, Ld5/k$e;->d:J

    iput-wide p8, p0, Ld5/k$e;->e:J

    return-void
.end method
