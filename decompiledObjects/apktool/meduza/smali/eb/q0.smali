.class public final Leb/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
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
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Leb/p0;

    check-cast p2, Leb/p0;

    invoke-virtual {p1}, Leb/p0;->c()I

    move-result p1

    invoke-virtual {p2}, Leb/p0;->c()I

    move-result p2

    sub-int/2addr p1, p2

    return p1
.end method
