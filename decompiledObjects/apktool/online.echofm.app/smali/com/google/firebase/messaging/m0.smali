.class public final synthetic Lcom/google/firebase/messaging/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Lcom/google/firebase/messaging/o0$a;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/messaging/o0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/m0;->o:Lcom/google/firebase/messaging/o0$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/m0;->o:Lcom/google/firebase/messaging/o0$a;

    invoke-static {v0}, Lcom/google/firebase/messaging/o0$a;->b(Lcom/google/firebase/messaging/o0$a;)V

    return-void
.end method
