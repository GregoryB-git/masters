.class public final Leb/r0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/d1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Leb/d1$a<",
        "Leb/p0;",
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
.method public final a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Leb/p0;

    invoke-virtual {p1}, Leb/p0;->b()Z

    move-result p1

    return p1
.end method

.method public final b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Leb/p0;

    invoke-virtual {p1}, Leb/p0;->c()I

    move-result p1

    return p1
.end method
