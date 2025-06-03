.class public final Lnc/d2;
.super Ljava/util/concurrent/CancellationException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/concurrent/CancellationException;"
    }
.end annotation


# instance fields
.field public final transient a:Lnc/j1;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lnc/j1;)V
    .locals 0

    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lnc/d2;->a:Lnc/j1;

    return-void
.end method
