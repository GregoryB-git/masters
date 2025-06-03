.class public final Lx3/s$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx3/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx3/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "g"
.end annotation


# instance fields
.field public final a:[Lx3/f;

.field public final b:Lx3/a0;

.field public final c:Lx3/c0;


# direct methods
.method public varargs constructor <init>([Lx3/f;)V
    .locals 5

    new-instance v0, Lx3/a0;

    invoke-direct {v0}, Lx3/a0;-><init>()V

    new-instance v1, Lx3/c0;

    invoke-direct {v1}, Lx3/c0;-><init>()V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    array-length v2, p1

    add-int/lit8 v2, v2, 0x2

    new-array v2, v2, [Lx3/f;

    iput-object v2, p0, Lx3/s$g;->a:[Lx3/f;

    array-length v3, p1

    const/4 v4, 0x0

    invoke-static {p1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p0, Lx3/s$g;->b:Lx3/a0;

    iput-object v1, p0, Lx3/s$g;->c:Lx3/c0;

    array-length v3, p1

    aput-object v0, v2, v3

    array-length p1, p1

    add-int/lit8 p1, p1, 0x1

    aput-object v1, v2, p1

    return-void
.end method
