.class public final Lx/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx/l$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lx/l$a<",
        "Lb0/n;",
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
.method public final a(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lb0/n;

    iget p1, p1, Lb0/n;->c:I

    return p1
.end method

.method public final b(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lb0/n;

    iget-boolean p1, p1, Lb0/n;->d:Z

    return p1
.end method
