.class public abstract Lw6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public o:J

.field public p:Lw6/i;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    sget-object v2, Lw6/l;->g:Lw6/i;

    invoke-direct {p0, v0, v1, v2}, Lw6/h;-><init>(JLw6/i;)V

    return-void
.end method

.method public constructor <init>(JLw6/i;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lw6/h;->o:J

    iput-object p3, p0, Lw6/h;->p:Lw6/i;

    return-void
.end method
