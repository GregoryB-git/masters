.class public abstract Ltc/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public a:J

.field public b:Ltc/h;


# direct methods
.method public constructor <init>()V
    .locals 3

    sget-object v0, Ltc/j;->g:Ls8/b;

    const-wide/16 v1, 0x0

    invoke-direct {p0, v1, v2, v0}, Ltc/g;-><init>(JLtc/h;)V

    return-void
.end method

.method public constructor <init>(JLtc/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ltc/g;->a:J

    iput-object p3, p0, Ltc/g;->b:Ltc/h;

    return-void
.end method
