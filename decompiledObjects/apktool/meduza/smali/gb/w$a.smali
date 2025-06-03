.class public final Lgb/w$a;
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
        "Ljava/lang/Void;",
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
.method public final a(Lgb/u2;ILjava/lang/Object;I)I
    .locals 0

    check-cast p3, Ljava/lang/Void;

    invoke-interface {p1}, Lgb/u2;->readUnsignedByte()I

    move-result p1

    return p1
.end method
