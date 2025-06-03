.class public final synthetic Ld9/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld9/l;


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lu/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9/u;->a:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lcom/google/firebase/firestore/f;)V
    .locals 2

    iget-object v0, p0, Ld9/u;->a:Ljava/lang/Runnable;

    check-cast p1, Ljava/lang/Void;

    const/4 p1, 0x0

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    move p2, p1

    :goto_0
    new-array p1, p1, [Ljava/lang/Object;

    const-string v1, "snapshots-in-sync listeners should never get errors."

    invoke-static {v1, p2, p1}, Lx6/b;->Z(Ljava/lang/String;Z[Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
