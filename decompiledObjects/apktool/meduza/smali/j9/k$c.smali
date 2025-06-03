.class public abstract Lj9/k$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj9/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lj9/k$c;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Lj9/k$c;

    invoke-virtual {p0}, Lj9/k$c;->f()Lj9/l;

    move-result-object v0

    invoke-virtual {p1}, Lj9/k$c;->f()Lj9/l;

    move-result-object v1

    invoke-virtual {v0, v1}, Lj9/e;->i(Lj9/e;)I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lj9/k$c;->g()I

    move-result v0

    invoke-virtual {p1}, Lj9/k$c;->g()I

    move-result p1

    invoke-static {v0, p1}, Lq0/g;->a(II)I

    move-result v0

    :goto_0
    return v0
.end method

.method public abstract f()Lj9/l;
.end method

.method public abstract g()I
.end method
