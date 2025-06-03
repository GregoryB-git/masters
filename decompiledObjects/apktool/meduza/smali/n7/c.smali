.class public abstract Ln7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln7/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln7/c$b;,
        Ln7/c$e;,
        Ln7/c$d;,
        Ln7/c$c;,
        Ln7/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln7/j<",
        "Ljava/lang/Character;",
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
.method public a(ILjava/lang/CharSequence;)I
    .locals 2

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-static {p1, v0}, Lx6/b;->D(II)V

    :goto_0
    if-ge p1, v0, :cond_1

    invoke-interface {p2, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-virtual {p0, v1}, Ln7/c;->b(C)Z

    move-result v1

    if-eqz v1, :cond_0

    return p1

    :cond_0
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    return p1
.end method

.method public abstract b(C)Z
.end method
