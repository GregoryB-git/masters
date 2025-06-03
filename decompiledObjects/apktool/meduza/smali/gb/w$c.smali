.class public final Lgb/w$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgb/w$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lgb/w$f<",
        "[B>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lgb/u2;ILjava/lang/Object;I)I
    .locals 0

    check-cast p3, [B

    invoke-interface {p1, p3, p4, p2}, Lgb/u2;->U([BII)V

    add-int/2addr p4, p2

    return p4
.end method
