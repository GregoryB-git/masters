.class public final Lgb/v0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln7/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/v0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln7/q<",
        "Ln7/p;",
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
.method public final get()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ln7/p;

    invoke-direct {v0}, Ln7/p;-><init>()V

    return-object v0
.end method
