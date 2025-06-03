.class public abstract Lj0/j;
.super Lj0/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj0/j$a;
    }
.end annotation


# instance fields
.field public p:J

.field public q:I

.field public r:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lj0/a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public m()V
    .locals 2

    .line 1
    invoke-super {p0}, Lj0/a;->m()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lj0/j;->p:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lj0/j;->q:I

    .line 10
    .line 11
    iput-boolean v0, p0, Lj0/j;->r:Z

    .line 12
    .line 13
    return-void
.end method

.method public abstract x()V
.end method
