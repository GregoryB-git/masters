.class public final Ll4/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll4/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll4/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lc4/t;
    .locals 3

    new-instance v0, Lc4/t$b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Lc4/t$b;-><init>(J)V

    return-object v0
.end method

.method public final b(Lc4/i;)J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final c(J)V
    .locals 0

    return-void
.end method
